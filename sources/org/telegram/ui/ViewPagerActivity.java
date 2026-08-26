package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.glass.GlassTabView;

public abstract class ViewPagerActivity extends BaseFragment {
    public LoginActivity.AnonymousClass4 contentView;
    public final SparseArray fragmentsArr;
    public int initialFragmentPosition;
    public boolean isFullyVisible;
    public boolean isResumed;
    public String titleOverlay;
    public Runnable titleOverlayAction;
    public int titleOverlayId;
    public ViewPagerActivityPagerLayout viewPager;
    public float visibilityByParent;

    public final class FragmentState {
        public final BaseFragment fragment;
        public boolean isFullyVisible;
        public boolean isInAnimation;
        public boolean isResumed;
        public float lastVisibility;
        public boolean onCreateCalled;

        public FragmentState(BaseFragment baseFragment) {
            this.fragment = baseFragment;
        }
    }

    public final class ViewPagerActivityPagerLayout extends ViewPagerFixed {
        public final Path clipPath;
        public boolean tabletLayout;

        public ViewPagerActivityPagerLayout(Context context) {
            super(context, null);
            this.clipPath = new Path();
        }

        @Override
        public final boolean canScrollBackward(MotionEvent motionEvent) {
            Object currentVisibleFragment = ((MainTabsActivity) ViewPagerActivity.this).getCurrentVisibleFragment();
            if (currentVisibleFragment instanceof MainTabsActivity.TabFragmentDelegate) {
                return ((MainTabsActivity.TabFragmentDelegate) currentVisibleFragment).canParentTabsSlide(motionEvent, false);
            }
            return false;
        }

        @Override
        public final boolean canScrollForward(MotionEvent motionEvent) {
            Object currentVisibleFragment = ((MainTabsActivity) ViewPagerActivity.this).getCurrentVisibleFragment();
            if (currentVisibleFragment instanceof MainTabsActivity.TabFragmentDelegate) {
                return ((MainTabsActivity.TabFragmentDelegate) currentVisibleFragment).canParentTabsSlide(motionEvent, true);
            }
            return false;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            if (this.tabletLayout) {
                Path path = this.clipPath;
                path.rewind();
                float fDpf2 = AndroidUtilities.dpf2(24.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
                path.addRoundRect(rectF, fDpf2, fDpf2, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
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
        public final void onItemSelected(View view, View view2, int i, int i2) {
            ViewPagerActivity.this.checkFragmentsVisibility();
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override
        public final void onScrollEnd() {
            DialogsActivity dialogsActivity;
            ViewPagerActivity viewPagerActivity = ViewPagerActivity.this;
            MainTabsActivity mainTabsActivity = (MainTabsActivity) viewPagerActivity;
            if (mainTabsActivity.tabsView != null) {
                mainTabsActivity.selectTab(mainTabsActivity.viewPager.getCurrentPosition(), true);
                int i = 0;
                while (i < mainTabsActivity.tabs.length) {
                    float fMax = Math.max(0.0f, 1.0f - Math.abs((i > 2 ? i - 1 : i) - 0.0f));
                    GlassTabView glassTabView = mainTabsActivity.tabs[i];
                    glassTabView.gestureSelectedOverride = fMax;
                    glassTabView.hasGestureSelectedOverride = false;
                    glassTabView.invalidate();
                    i++;
                }
                mainTabsActivity.tabsView.invalidate();
            }
            mainTabsActivity.blur3_invalidateBlur();
            ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = mainTabsActivity.viewPager;
            if (viewPagerActivityPagerLayout != null) {
                int currentPosition = viewPagerActivityPagerLayout.getCurrentPosition();
                if (currentPosition != 2 && mainTabsActivity.dropCallsFragmentAfterPageScroll) {
                    mainTabsActivity.dropFragmentAtPosition(2);
                    mainTabsActivity.dropCallsFragmentAfterPageScroll = false;
                }
                if (currentPosition != 3) {
                    mainTabsActivity.dropFragmentAtPosition(3);
                }
                Integer num = mainTabsActivity.pendingFolderId;
                if (num != null && currentPosition == 0 && (dialogsActivity = mainTabsActivity.dialogsActivity) != null) {
                    dialogsActivity.scrollToFolder(num.intValue());
                    mainTabsActivity.pendingFolderId = null;
                }
            }
            viewPagerActivity.checkFragmentsVisibility();
        }

        @Override
        public final void onTabAnimationUpdate(boolean z) {
            ViewPagerActivity viewPagerActivity = ViewPagerActivity.this;
            MainTabsActivity mainTabsActivity = (MainTabsActivity) viewPagerActivity;
            boolean z2 = !z;
            if (mainTabsActivity.tabsView != null) {
                float positionAnimated = mainTabsActivity.viewPager.getPositionAnimated();
                int i = 0;
                while (i < mainTabsActivity.tabs.length) {
                    float fMax = Math.max(0.0f, 1.0f - Math.abs((i > 2 ? i - 1 : i) - positionAnimated));
                    GlassTabView glassTabView = mainTabsActivity.tabs[i];
                    glassTabView.gestureSelectedOverride = fMax;
                    glassTabView.hasGestureSelectedOverride = z2;
                    glassTabView.invalidate();
                    i++;
                }
                mainTabsActivity.tabsView.invalidate();
                if (!z) {
                    mainTabsActivity.selectTab(Math.round(positionAnimated), true);
                }
            }
            mainTabsActivity.checkUi_fadeView$1();
            mainTabsActivity.blur3_invalidateBlur();
            mainTabsActivity.contentView.invalidate();
            viewPagerActivity.checkFragmentsVisibility();
            viewPagerActivity.checkSystemBarColors();
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

    public ViewPagerActivity() {
        super(null);
        this.fragmentsArr = new SparseArray();
        this.initialFragmentPosition = -1;
        this.visibilityByParent = 0.0f;
    }

    public final void checkFragmentsVisibility() {
        SparseArray sparseArray = this.fragmentsArr;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = (FragmentState) sparseArray.valueAt(i);
            int iKeyAt = sparseArray.keyAt(i);
            if (fragmentState != null) {
                BaseFragment baseFragment = fragmentState.fragment;
                if (baseFragment.fragmentView != null) {
                    ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
                    float fClamp = viewPagerActivityPagerLayout.getMeasuredWidth() == 0 ? MathUtils.clamp(1 - Math.abs(viewPagerActivityPagerLayout.getCurrentPosition() - iKeyAt), 0, 1) : MathUtils.clamp(1.0f - Math.abs(viewPagerActivityPagerLayout.getPositionAnimated() - iKeyAt), 0.0f, 1.0f);
                    boolean z = this.isResumed;
                    float f = z ? this.visibilityByParent : 0.0f;
                    boolean z2 = this.isFullyVisible;
                    float f2 = fragmentState.lastVisibility;
                    float f3 = f * fClamp;
                    fragmentState.lastVisibility = f3;
                    boolean z3 = f3 > f2;
                    if (!fragmentState.isResumed && fClamp > 0.0f && z && baseFragment.fragmentView != null) {
                        baseFragment.onResume();
                        fragmentState.isResumed = true;
                    }
                    if (!fragmentState.isInAnimation && ((f2 == 0.0f || f2 == 1.0f) && f2 != f3 && Math.abs(f2 - f3) != 1.0f)) {
                        baseFragment.onTransitionAnimationStart(z3, false);
                        fragmentState.isInAnimation = true;
                    }
                    if (fragmentState.isInAnimation && f2 != f3) {
                        baseFragment.onTransitionAnimationProgress(z3, z3 ? f3 : 1.0f - f3);
                    }
                    if (fragmentState.isInAnimation && (f3 == 0.0f || f3 == 1.0f)) {
                        baseFragment.onTransitionAnimationEnd(z3, false);
                        fragmentState.isInAnimation = false;
                    }
                    if (!fragmentState.isFullyVisible && f3 >= 1.0f) {
                        baseFragment.onBecomeFullyVisible();
                        fragmentState.isFullyVisible = true;
                    }
                    if (fragmentState.isFullyVisible && ((f3 == 0.0f && !z2) || fClamp == 0.0f)) {
                        baseFragment.onBecomeFullyHidden();
                        fragmentState.isFullyVisible = false;
                    }
                    if (fragmentState.isResumed && ((f3 == 0.0f && !z) || fClamp == 0.0f)) {
                        baseFragment.onPause();
                        fragmentState.isResumed = false;
                    }
                }
            }
        }
    }

    @Override
    public final void clearViews() {
        ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
        if (viewPagerActivityPagerLayout != null) {
            this.initialFragmentPosition = viewPagerActivityPagerLayout.getCurrentPosition();
        }
        SparseArray sparseArray = this.fragmentsArr;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = (FragmentState) sparseArray.valueAt(i);
            if (fragmentState != null) {
                boolean z = fragmentState.isResumed;
                BaseFragment baseFragment = fragmentState.fragment;
                if (z) {
                    baseFragment.onPause();
                    fragmentState.isResumed = false;
                }
                baseFragment.clearViews();
            }
        }
        super.clearViews();
    }

    @Override
    public final ActionBar createActionBar(Context context) {
        return null;
    }

    public abstract BaseFragment createBaseFragmentAt(int i);

    @Override
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.contentView = new LoginActivity.AnonymousClass4((MainTabsActivity) this, context, 10);
        ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = new ViewPagerActivityPagerLayout(context);
        this.viewPager = viewPagerActivityPagerLayout;
        if (this.initialFragmentPosition == -1) {
            this.initialFragmentPosition = 0;
        }
        viewPagerActivityPagerLayout.setPosition(this.initialFragmentPosition);
        this.viewPager.setAdapter(new PollItemMenu.AnonymousClass4(this, context, 5));
        this.contentView.addView(this.viewPager, LayoutHelper.createFrame(-1.0f, -1));
        LoginActivity.AnonymousClass4 anonymousClass4 = this.contentView;
        this.fragmentView = anonymousClass4;
        TodoItemMenu$$ExternalSyntheticLambda3 todoItemMenu$$ExternalSyntheticLambda3 = new TodoItemMenu$$ExternalSyntheticLambda3(this, 6);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(anonymousClass4, todoItemMenu$$ExternalSyntheticLambda3);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void dropFragmentAtPosition(int i) {
        SparseArray sparseArray = this.fragmentsArr;
        FragmentState fragmentState = (FragmentState) sparseArray.get(i);
        if (fragmentState != null) {
            boolean z = fragmentState.isFullyVisible;
            BaseFragment baseFragment = fragmentState.fragment;
            if (z) {
                baseFragment.onBecomeFullyHidden();
            }
            if (fragmentState.isResumed) {
                baseFragment.onPause();
            }
            baseFragment.onFragmentDestroy();
            baseFragment.setParentLayout(null);
        }
        sparseArray.remove(i);
    }

    public final BaseFragment getCurrentVisibleFragment() {
        ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
        if (viewPagerActivityPagerLayout == null) {
            return null;
        }
        FragmentState fragmentState = (FragmentState) this.fragmentsArr.get(viewPagerActivityPagerLayout.getCurrentPosition());
        if (fragmentState != null) {
            return fragmentState.fragment;
        }
        return null;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.fragmentsArr;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = (FragmentState) sparseArray.valueAt(i);
            if (fragmentState != null) {
                BaseFragment baseFragment = fragmentState.fragment;
                if (baseFragment.fragmentView != null) {
                    arrayList.addAll(baseFragment.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        return (currentVisibleFragment == null || currentVisibleFragment.fragmentView == null) ? super.isLightStatusBar() : currentVisibleFragment.isLightStatusBar();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
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
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.visibilityByParent = 0.0f;
        this.isFullyVisible = false;
        checkFragmentsVisibility();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.visibilityByParent = 1.0f;
        this.isFullyVisible = true;
        checkFragmentsVisibility();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.fragmentsArr;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = (FragmentState) sparseArray.valueAt(i);
            if (fragmentState.onCreateCalled) {
                BaseFragment baseFragment = fragmentState.fragment;
                baseFragment.onFragmentDestroy();
                baseFragment.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.isResumed = false;
        checkFragmentsVisibility();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
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
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        if (!z) {
            f = 1.0f - f;
        }
        this.visibilityByParent = f;
        checkFragmentsVisibility();
    }

    @Override
    public final void setTitleOverlayText(String str, int i, Runnable runnable) {
        super.setTitleOverlayText(str, i, runnable);
        this.titleOverlay = str;
        this.titleOverlayId = i;
        this.titleOverlayAction = runnable;
        SparseArray sparseArray = this.fragmentsArr;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentState fragmentState = (FragmentState) sparseArray.valueAt(i2);
            if (fragmentState != null) {
                fragmentState.fragment.setTitleOverlayText(str, i, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i, Runnable runnable) {
        setTitleOverlayText(str, i, runnable);
    }
}
