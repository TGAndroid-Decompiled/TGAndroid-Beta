package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ViewPagerFixed;

public abstract class ViewPagerActivity extends BaseFragment {
    protected FrameLayout contentView;
    protected final SparseArray<FragmentState> fragmentsArr;
    private int initialFragmentPosition;
    private boolean isFullyVisible;
    private boolean isResumed;
    private String titleOverlay;
    private Runnable titleOverlayAction;
    private int titleOverlayId;
    protected ViewPagerActivityPagerLayout viewPager;
    private float visibilityByParent;

    public static class FragmentState {
        public final BaseFragment fragment;
        private boolean isFullyVisible;
        private boolean isInAnimation;
        private boolean isResumed;
        private float lastVisibility;
        private boolean onCreateCalled;

        public void setVisibility(float f, float f2, boolean z, boolean z2) {
            float f3 = this.lastVisibility;
            float f4 = f2 * f;
            this.lastVisibility = f4;
            boolean z3 = f4 > f3;
            if (!this.isResumed && f > 0.0f && z2) {
                BaseFragment baseFragment = this.fragment;
                if (baseFragment.fragmentView != null) {
                    baseFragment.onResume();
                    this.isResumed = true;
                }
            }
            if (!this.isInAnimation && ((f3 == 0.0f || f3 == 1.0f) && f3 != f4 && Math.abs(f3 - f4) != 1.0f)) {
                this.fragment.onTransitionAnimationStart(z3, false);
                this.isInAnimation = true;
            }
            if (this.isInAnimation && f3 != f4) {
                this.fragment.onTransitionAnimationProgress(z3, z3 ? f4 : 1.0f - f4);
            }
            if (this.isInAnimation && (f4 == 0.0f || f4 == 1.0f)) {
                this.fragment.onTransitionAnimationEnd(z3, false);
                this.isInAnimation = false;
            }
            if (!this.isFullyVisible && f4 >= 1.0f) {
                this.fragment.onBecomeFullyVisible();
                this.isFullyVisible = true;
            }
            if (this.isFullyVisible && ((f4 == 0.0f && !z) || f == 0.0f)) {
                this.fragment.onBecomeFullyHidden();
                this.isFullyVisible = false;
            }
            if (this.isResumed) {
                if ((f4 != 0.0f || z2) && f != 0.0f) {
                    return;
                }
                this.fragment.onPause();
                this.isResumed = false;
            }
        }

        private FragmentState(BaseFragment baseFragment) {
            this.fragment = baseFragment;
        }
    }

    public class ViewPagerActivityPagerLayout extends ViewPagerFixed {
        private final Path clipPath;
        private boolean tabletLayout;

        public ViewPagerActivityPagerLayout(Context context) {
            super(context);
            this.clipPath = new Path();
        }

        @Override
        public boolean canScrollBackward(MotionEvent motionEvent) {
            return ViewPagerActivity.this.canScrollBackward(motionEvent);
        }

        @Override
        public boolean canScrollForward(MotionEvent motionEvent) {
            return ViewPagerActivity.this.canScrollForward(motionEvent);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (this.tabletLayout) {
                this.clipPath.rewind();
                float fDpf2 = AndroidUtilities.dpf2(24.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
                this.clipPath.addRoundRect(rectF, fDpf2, fDpf2, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.clipPath);
            }
            super.dispatchDraw(canvas);
            if (this.tabletLayout) {
                canvas.restore();
            }
        }

        @Override
        public float getAvailableTranslationX() {
            return getMeasuredWidth();
        }

        @Override
        public long getManualScrollDuration() {
            return 320L;
        }

        @Override
        public void onItemSelected(View view, View view2, int i, int i2) {
            super.onItemSelected(view, view2, i, i2);
            ViewPagerActivity.this.checkFragmentsVisibility();
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override
        public void onScrollEnd() {
            super.onScrollEnd();
            ViewPagerActivity.this.onViewPagerScrollEnd();
            ViewPagerActivity.this.checkFragmentsVisibility();
        }

        @Override
        public void onTabAnimationUpdate(boolean z) {
            super.onTabAnimationUpdate(z);
            ViewPagerActivity.this.onViewPagerTabAnimationUpdate(z);
            ViewPagerActivity.this.checkFragmentsVisibility();
            ViewPagerActivity.this.checkSystemBarColors();
        }

        @Override
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        public void setTabletLayout(boolean z) {
            if (this.tabletLayout == z) {
                return;
            }
            this.tabletLayout = z;
            invalidate();
        }
    }

    public static class ViewPagerFragmentRootLayout extends FrameLayout {
        public ViewPagerFragmentRootLayout(Context context) {
            super(context);
        }
    }

    public ViewPagerActivity() {
        super(null);
        this.fragmentsArr = new SparseArray<>();
        this.initialFragmentPosition = -1;
        this.visibilityByParent = 0.0f;
    }

    public void checkFragmentsVisibility() {
        int size = this.fragmentsArr.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentStateValueAt = this.fragmentsArr.valueAt(i);
            int iKeyAt = this.fragmentsArr.keyAt(i);
            if (fragmentStateValueAt != null && fragmentStateValueAt.fragment.fragmentView != null) {
                float positionVisibility = this.viewPager.getPositionVisibility(iKeyAt);
                boolean z = this.isResumed;
                fragmentStateValueAt.setVisibility(positionVisibility, z ? this.visibilityByParent : 0.0f, this.isFullyVisible, z);
            }
        }
    }

    public boolean canScrollBackward(MotionEvent motionEvent) {
        return true;
    }

    public boolean canScrollForward(MotionEvent motionEvent) {
        return true;
    }

    public void clearAllHiddenFragments() {
        int currentPosition = this.viewPager.getCurrentPosition();
        int size = this.fragmentsArr.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentStateValueAt = this.fragmentsArr.valueAt(i);
            if (this.fragmentsArr.keyAt(i) != currentPosition && fragmentStateValueAt != null) {
                fragmentStateValueAt.fragment.clearViews();
            }
        }
    }

    @Override
    public void clearViews() {
        ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
        if (viewPagerActivityPagerLayout != null) {
            this.initialFragmentPosition = viewPagerActivityPagerLayout.getCurrentPosition();
        }
        int size = this.fragmentsArr.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentStateValueAt = this.fragmentsArr.valueAt(i);
            if (fragmentStateValueAt != null) {
                if (fragmentStateValueAt.isResumed) {
                    fragmentStateValueAt.fragment.onPause();
                    fragmentStateValueAt.isResumed = false;
                }
                fragmentStateValueAt.fragment.clearViews();
            }
        }
        super.clearViews();
    }

    @Override
    public ActionBar createActionBar(Context context) {
        return null;
    }

    public abstract BaseFragment createBaseFragmentAt(int i);

    public FrameLayout createContentView(Context context) {
        return new FrameLayout(context);
    }

    @Override
    public View createView(final Context context) {
        this.hasOwnBackground = true;
        this.contentView = createContentView(context);
        this.viewPager = new ViewPagerActivityPagerLayout(context);
        if (this.initialFragmentPosition == -1) {
            this.initialFragmentPosition = getStartPosition();
        }
        this.viewPager.setPosition(this.initialFragmentPosition);
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public void bindView(View view, int i, int i2) {
                BaseFragment baseFragment;
                FragmentState fragmentState = ViewPagerActivity.this.fragmentsArr.get(i);
                if (fragmentState != null) {
                    baseFragment = fragmentState.fragment;
                } else {
                    BaseFragment baseFragmentCreateBaseFragmentAt = ViewPagerActivity.this.createBaseFragmentAt(i);
                    FragmentState fragmentState2 = new FragmentState(baseFragmentCreateBaseFragmentAt);
                    ViewPagerActivity.this.fragmentsArr.put(i, fragmentState2);
                    baseFragment = baseFragmentCreateBaseFragmentAt;
                    fragmentState = fragmentState2;
                }
                if (!fragmentState.onCreateCalled) {
                    baseFragment.onFragmentCreate();
                    fragmentState.onCreateCalled = true;
                }
                baseFragment.setParentLayout(ViewPagerActivity.this.getParentLayout());
                if (baseFragment.getFragmentView() == null) {
                    baseFragment.performCreateView(context);
                    baseFragment.setTitleOverlayText(ViewPagerActivity.this.titleOverlay, ViewPagerActivity.this.titleOverlayId, ViewPagerActivity.this.titleOverlayAction);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = baseFragment.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!baseFragment.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                }
                frameLayout.addView(fragmentView, LayoutHelper.createFrame(-1, -1.0f));
                if (baseFragment.getActionBar() != null && baseFragment.getActionBar().shouldAddToContainer()) {
                    AndroidUtilities.removeFromParent(baseFragment.getActionBar());
                    frameLayout.addView(baseFragment.getActionBar());
                }
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                ViewCompat.Api20Impl.requestApplyInsets(frameLayout);
                ViewPagerActivity.this.checkSystemBarColors();
                ViewPagerActivity.this.checkFragmentsVisibility();
            }

            @Override
            public View createView(int i) {
                return new ViewPagerFragmentRootLayout(context);
            }

            @Override
            public int getItemCount() {
                return ViewPagerActivity.this.getFragmentsCount();
            }
        });
        this.contentView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = this.contentView;
        this.fragmentView = frameLayout;
        TodoItemMenu$$ExternalSyntheticLambda3 todoItemMenu$$ExternalSyntheticLambda3 = new TodoItemMenu$$ExternalSyntheticLambda3(this, 24);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(frameLayout, todoItemMenu$$ExternalSyntheticLambda3);
        return this.fragmentView;
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    public void dropFragmentAtPosition(int i) {
        FragmentState fragmentState = this.fragmentsArr.get(i);
        if (fragmentState != null) {
            if (fragmentState.isFullyVisible) {
                fragmentState.fragment.onBecomeFullyHidden();
            }
            if (fragmentState.isResumed) {
                fragmentState.fragment.onPause();
            }
            fragmentState.fragment.onFragmentDestroy();
            fragmentState.fragment.setParentLayout(null);
        }
        this.fragmentsArr.remove(i);
    }

    public BaseFragment getCurrentVisibleFragment() {
        ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
        if (viewPagerActivityPagerLayout == null) {
            return null;
        }
        FragmentState fragmentState = this.fragmentsArr.get(viewPagerActivityPagerLayout.getCurrentPosition());
        if (fragmentState != null) {
            return fragmentState.fragment;
        }
        return null;
    }

    public abstract int getFragmentsCount();

    public abstract int getStartPosition();

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        int size = this.fragmentsArr.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentStateValueAt = this.fragmentsArr.valueAt(i);
            if (fragmentStateValueAt != null) {
                BaseFragment baseFragment = fragmentStateValueAt.fragment;
                if (baseFragment.fragmentView != null) {
                    arrayList.addAll(baseFragment.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        return (currentVisibleFragment == null || currentVisibleFragment.fragmentView == null) ? super.isLightStatusBar() : currentVisibleFragment.isLightStatusBar();
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        View fragmentView;
        int size = this.fragmentsArr.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentStateValueAt = this.fragmentsArr.valueAt(i);
            if (fragmentStateValueAt != null && (fragmentView = fragmentStateValueAt.fragment.getFragmentView()) != null) {
                ViewCompat.dispatchApplyWindowInsets(fragmentView, windowInsetsCompat);
            }
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
            }
            return false;
        }
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment == null || currentVisibleFragment.onBackPressed(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override
    public void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.visibilityByParent = 0.0f;
        this.isFullyVisible = false;
        checkFragmentsVisibility();
    }

    @Override
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.visibilityByParent = 1.0f;
        this.isFullyVisible = true;
        checkFragmentsVisibility();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        int size = this.fragmentsArr.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentStateValueAt = this.fragmentsArr.valueAt(i);
            if (fragmentStateValueAt.onCreateCalled) {
                fragmentStateValueAt.fragment.onFragmentDestroy();
                fragmentStateValueAt.fragment.setParentLayout(null);
            }
        }
        this.fragmentsArr.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.isResumed = false;
        checkFragmentsVisibility();
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            currentVisibleFragment.onRequestPermissionsResultFragment(i, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.isResumed = true;
        checkSystemBarColors();
        checkFragmentsVisibility();
    }

    @Override
    public void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        if (!z) {
            f = 1.0f - f;
        }
        this.visibilityByParent = f;
        checkFragmentsVisibility();
    }

    public void onViewPagerScrollEnd() {
    }

    public void onViewPagerTabAnimationUpdate(boolean z) {
    }

    public void putFragmentAtPosition(int i, BaseFragment baseFragment) {
        this.fragmentsArr.put(i, new FragmentState(baseFragment));
    }

    @Override
    public void setTitleOverlayText(String str, int i, Runnable runnable) {
        super.setTitleOverlayText(str, i, runnable);
        this.titleOverlay = str;
        this.titleOverlayId = i;
        this.titleOverlayAction = runnable;
        int size = this.fragmentsArr.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentState fragmentStateValueAt = this.fragmentsArr.valueAt(i2);
            if (fragmentStateValueAt != null) {
                fragmentStateValueAt.fragment.setTitleOverlayText(str, i, runnable);
            }
        }
    }

    @Override
    public void setTitleOverlayTextIfActionBarAttached(String str, int i, Runnable runnable) {
        setTitleOverlayText(str, i, runnable);
    }
}
