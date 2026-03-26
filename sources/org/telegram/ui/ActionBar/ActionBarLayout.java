package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BackButtonMenu;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugProvider;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.EmptyBaseFragment;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.bots.BotWebViewSheet;

public class ActionBarLayout extends FrameLayout implements INavigationLayout, FloatingDebugProvider {
    private static Drawable headerShadowDrawable;
    private static Drawable layerShadowDrawable;
    private static Paint scrimPaint;
    private AccelerateDecelerateInterpolator accelerateDecelerateInterpolator;
    private ArrayList animateEndColors;
    private int animateSetThemeAccentIdAfterAnimation;
    private Theme.ThemeInfo animateSetThemeAfterAnimation;
    private boolean animateSetThemeAfterAnimationApply;
    private boolean animateSetThemeNightAfterAnimation;
    private ArrayList animateStartColors;
    private boolean animateThemeAfterAnimation;
    protected boolean animationInProgress;
    private float animationProgress;
    public INavigationLayout.ThemeAnimationSettings.onAnimationProgress animationProgressListener;
    private Runnable animationRunnable;
    private boolean attached;
    private AnimatorSet backAnimator;
    private boolean backAnimatorIsBack;
    private View backgroundView;
    private boolean beginTrackingSent;
    private BottomSheetTabs bottomSheetTabs;
    private BottomSheetTabs.ClipTools bottomSheetTabsClip;
    private final Path clipPath;
    public LayoutContainer containerView;
    public LayoutContainer containerViewBack;
    private ActionBar currentActionBar;
    private AnimatorSet currentAnimation;
    private int currentNavigationBarColor;
    Runnable debugBlackScreenRunnable;
    private DecelerateInterpolator decelerateInterpolator;
    private boolean delayedAnimationResumed;
    private Runnable delayedOpenAnimationRunnable;
    private INavigationLayout.INavigationLayoutDelegate delegate;
    private DrawerLayoutContainer drawerLayoutContainer;
    private List fragmentsStack;
    private final AnimatedFloat hasSheetsAnimator;
    public boolean highlightActionButtons;
    private boolean inActionMode;
    private boolean inBubbleMode;
    private boolean inPreviewMode;
    public float innerTranslationX;
    public boolean isKeyboardVisible;
    private boolean isLayersLayout;
    private boolean isSheet;
    ArrayList lastActions;
    private long lastFrameTime;
    private WindowInsetsCompat lastWindowInsetsCompat;
    private View layoutToIgnore;
    private final boolean main;
    private boolean maybeStartTracking;
    private int[] measureSpec;
    public Theme.MessageDrawable messageDrawableOutMediaStart;
    public Theme.MessageDrawable messageDrawableOutStart;
    private int navigationBarInsetHeight;
    private BaseFragment newFragment;
    AnimationNotificationsLocker notificationsLocker;
    private BaseFragment oldFragment;
    private Runnable onCloseAnimationEndRunnable;
    private Runnable onFragmentStackChangedListener;
    private Runnable onOpenAnimationEndRunnable;
    private Runnable overlayAction;
    private int overrideWidthOffset;
    private OvershootInterpolator overshootInterpolator;
    protected Activity parentActivity;
    private boolean predictiveBackHasProgress;
    private boolean predictiveBackInProgress;
    private boolean predictiveBackLeft;
    private float predictiveBackY;
    private boolean predictiveInput;
    private ArrayList presentingFragmentDescriptions;
    private ColorDrawable previewBackgroundDrawable;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout previewMenu;
    private boolean previewOpenAnimationInProgress;
    private List pulledDialogs;
    private float[] radii;
    private boolean rebuildAfterAnimation;
    private boolean rebuildLastAfterAnimation;
    private Rect rect;
    private boolean removeActionBarExtraHeight;
    private int savedBottomSheetTabsTop;
    public LayoutContainer sheetContainer;
    private EmptyBaseFragment sheetFragment;
    private boolean showLastAfterAnimation;
    INavigationLayout.StartColorsProvider startColorsProvider;
    protected boolean startedTracking;
    private int startedTrackingPointerId;
    private int startedTrackingX;
    private int startedTrackingY;
    private int statusBarInsetHeight;
    private boolean tabsEvents;
    private float themeAnimationValue;
    private ArrayList themeAnimatorDelegate;
    private ArrayList themeAnimatorDescriptions;
    private AnimatorSet themeAnimatorSet;
    private String titleOverlayText;
    private int titleOverlayTextId;
    private boolean transitionAnimationInProgress;
    private boolean transitionAnimationPreviewMode;
    private long transitionAnimationStartTime;
    private boolean useAlphaAnimations;
    private VelocityTracker velocityTracker;
    private Runnable waitingForKeyboardCloseRunnable;
    private Window window;
    private boolean withShadow;

    @Override
    public boolean addFragmentToStack(BaseFragment baseFragment) {
        return addFragmentToStack(baseFragment, -1);
    }

    @Override
    public void animateThemedValues(Theme.ThemeInfo themeInfo, int i, boolean z, boolean z2) {
        animateThemedValues(new INavigationLayout.ThemeAnimationSettings(themeInfo, i, z, z2), null);
    }

    @Override
    public void animateThemedValues(Theme.ThemeInfo themeInfo, int i, boolean z, boolean z2, Runnable runnable) {
        animateThemedValues(new INavigationLayout.ThemeAnimationSettings(themeInfo, i, z, z2), runnable);
    }

    @Override
    public void closeLastFragment() {
        closeLastFragment(true);
    }

    @Override
    public void dismissDialogs() {
        INavigationLayout.CC.$default$dismissDialogs(this);
    }

    @Override
    public void drawHeaderShadow(Canvas canvas, int i) {
        drawHeaderShadow(canvas, 255, i);
    }

    @Override
    public BaseFragment findFragment(Class cls) {
        return INavigationLayout.CC.$default$findFragment(this, cls);
    }

    @Override
    public BaseFragment getBackgroundFragment() {
        return INavigationLayout.CC.$default$getBackgroundFragment(this);
    }

    @Override
    public BottomSheet getBottomSheet() {
        return INavigationLayout.CC.$default$getBottomSheet(this);
    }

    @Override
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override
    public Activity getParentActivity() {
        return INavigationLayout.CC.$default$getParentActivity(this);
    }

    @Override
    public BaseFragment getSafeLastFragment() {
        return INavigationLayout.CC.$default$getSafeLastFragment(this);
    }

    @Override
    public ViewGroup getView() {
        return INavigationLayout.CC.$default$getView(this);
    }

    @Override
    public boolean hasIntegratedBlurInPreview() {
        return INavigationLayout.CC.$default$hasIntegratedBlurInPreview(this);
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public boolean isActionBarInCrossfade() {
        return INavigationLayout.CC.$default$isActionBarInCrossfade(this);
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment) {
        return presentFragment(new INavigationLayout.NavigationParams(baseFragment));
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment, boolean z) {
        return presentFragment(new INavigationLayout.NavigationParams(baseFragment).setRemoveLast(z));
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2, boolean z3, boolean z4) {
        return presentFragment(new INavigationLayout.NavigationParams(baseFragment).setRemoveLast(z).setNoAnimation(z2).setCheckPresentFromDelegate(z3).setPreview(z4));
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2, boolean z3, boolean z4, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        return presentFragment(new INavigationLayout.NavigationParams(baseFragment).setRemoveLast(z).setNoAnimation(z2).setCheckPresentFromDelegate(z3).setPreview(z4).setMenuView(actionBarPopupWindowLayout));
    }

    @Override
    public boolean presentFragmentAsPreview(BaseFragment baseFragment) {
        return presentFragment(new INavigationLayout.NavigationParams(baseFragment).setPreview(true));
    }

    @Override
    public boolean presentFragmentAsPreviewWithMenu(BaseFragment baseFragment, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        return presentFragment(new INavigationLayout.NavigationParams(baseFragment).setPreview(true).setMenuView(actionBarPopupWindowLayout));
    }

    @Override
    public void rebuildFragments(int i) {
        INavigationLayout.CC.$default$rebuildFragments(this, i);
    }

    @Override
    public void removeFragmentFromStack(int i) {
        INavigationLayout.CC.$default$removeFragmentFromStack(this, i);
    }

    @Override
    public void removeFragmentFromStack(BaseFragment baseFragment) {
        removeFragmentFromStack(baseFragment, false);
    }

    static float access$1716(ActionBarLayout actionBarLayout, float f) {
        float f2 = actionBarLayout.animationProgress + f;
        actionBarLayout.animationProgress = f2;
        return f2;
    }

    @Override
    public void setHighlightActionButtons(boolean z) {
        this.highlightActionButtons = z;
    }

    public boolean storyViewerAttached() {
        BaseFragment baseFragment;
        if (this.fragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            List list = this.fragmentsStack;
            baseFragment = (BaseFragment) list.get(list.size() - 1);
        }
        return (baseFragment == null || baseFragment.getLastStoryViewer() == null || !baseFragment.getLastStoryViewer().attachedToParent()) ? false : true;
    }

    public class LayoutContainer extends FrameLayout {
        private int backgroundColor;
        private Paint backgroundPaint;
        private boolean drawNavigationBar;
        private int fragmentPanTranslationOffset;
        private boolean isKeyboardVisible;
        private boolean isSupportEdgeToEdge;
        private int navbarColor;
        private LinearGradient navbarGradient;
        private Matrix navbarGradientMatrix;
        private int navbarHeight;
        private Paint navbarPaint;
        private Rect rect;
        private boolean wasPortrait;

        public LayoutContainer(Context context) {
            super(context);
            this.rect = new Rect();
            this.backgroundPaint = new Paint();
            this.navbarGradientMatrix = new Matrix();
            setWillNotDraw(false);
        }

        @Override
        public void setTranslationX(float f) {
            boolean z = (getTranslationX() == f || this.isSupportEdgeToEdge) ? false : true;
            super.setTranslationX(f);
            if (z) {
                ActionBarLayout.this.invalidate();
            }
        }

        @Override
        public void setAlpha(float f) {
            boolean z = (getAlpha() == f || this.isSupportEdgeToEdge) ? false : true;
            super.setAlpha(f);
            if (z) {
                ActionBarLayout.this.invalidate();
            }
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            int shadowAlpha;
            int measuredHeight;
            int y;
            BaseFragment baseFragment = !ActionBarLayout.this.fragmentsStack.isEmpty() ? (BaseFragment) ActionBarLayout.this.fragmentsStack.get(ActionBarLayout.this.fragmentsStack.size() - 1) : null;
            if (ActionBarLayout.this.sheetFragment != null && ActionBarLayout.this.sheetFragment.sheetsStack != null && !ActionBarLayout.this.sheetFragment.sheetsStack.isEmpty()) {
                baseFragment = ActionBarLayout.this.sheetFragment;
            }
            BaseFragment.AttachedSheet lastSheet = baseFragment != null ? baseFragment.getLastSheet() : null;
            if (lastSheet != null && lastSheet.isFullyVisible() && lastSheet.mo1302getWindowView() != view) {
                return true;
            }
            if (view instanceof ActionBar) {
                return super.drawChild(canvas, view, j);
            }
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt != view && (childAt instanceof ActionBar) && childAt.getVisibility() == 0) {
                    ActionBar actionBar = (ActionBar) childAt;
                    if (!actionBar.getCastShadows() || actionBar.getShadowAlpha() <= 0) {
                        break;
                    }
                    measuredHeight = childAt.getMeasuredHeight();
                    y = (int) childAt.getY();
                    shadowAlpha = actionBar.getShadowAlpha();
                } else {
                    i++;
                }
            }
            shadowAlpha = 0;
            measuredHeight = 0;
            y = 0;
            boolean zDrawChild = super.drawChild(canvas, view, j);
            if (measuredHeight != 0 && ActionBarLayout.headerShadowDrawable != null) {
                int alpha = ActionBarLayout.headerShadowDrawable.getAlpha();
                int i2 = y + measuredHeight;
                ActionBarLayout.headerShadowDrawable.setBounds(0, i2, getMeasuredWidth(), ActionBarLayout.headerShadowDrawable.getIntrinsicHeight() + i2);
                ActionBarLayout.headerShadowDrawable.setAlpha(shadowAlpha);
                ActionBarLayout.headerShadowDrawable.draw(canvas);
                ActionBarLayout.headerShadowDrawable.setAlpha(alpha);
            }
            drawNavigationBarGradient(canvas, baseFragment);
            return zDrawChild;
        }

        private void drawNavigationBarGradient(Canvas canvas, BaseFragment baseFragment) {
            int i;
            if (!this.drawNavigationBar || !this.isSupportEdgeToEdge || baseFragment == null || (i = AndroidUtilities.navigationBarHeight) < AndroidUtilities.dp(32.0f)) {
                return;
            }
            int i2 = (int) (i * 1.33f);
            int navigationBarColor = baseFragment.getNavigationBarColor();
            if (i2 != this.navbarHeight || this.navbarColor != navigationBarColor || this.navbarPaint == null) {
                if (this.navbarPaint == null) {
                    this.navbarPaint = new Paint(1);
                }
                this.navbarColor = navigationBarColor;
                this.navbarHeight = i2;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i2, new int[]{Theme.multAlpha(navigationBarColor, 0.1f), Theme.multAlpha(navigationBarColor, 1.0f)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.navbarGradient = linearGradient;
                this.navbarPaint.setShader(linearGradient);
            }
            this.navbarGradientMatrix.reset();
            this.navbarGradientMatrix.postTranslate(0.0f, getHeight() - i2);
            this.navbarGradient.setLocalMatrix(this.navbarGradientMatrix);
            canvas.drawRect(0.0f, getHeight() - i2, getWidth(), getHeight(), this.navbarPaint);
        }

        @Override
        public boolean hasOverlappingRendering() {
            return Build.VERSION.SDK_INT >= 28;
        }

        @Override
        protected void onMeasure(int i, int i2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            int measuredHeight;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            boolean z = size2 > size;
            if (this.wasPortrait != z && ActionBarLayout.this.isInPreviewMode()) {
                ActionBarLayout.this.finishPreviewFragment();
            }
            this.wasPortrait = z;
            int childCount = getChildCount();
            View rootView = getRootView();
            getWindowVisibleDisplayFrame(this.rect);
            rootView.getHeight();
            if (this.rect.top != 0) {
                int i3 = AndroidUtilities.LIGHT_STATUS_BAR_OVERLAY;
            }
            AndroidUtilities.getViewInset(rootView);
            int i4 = this.rect.bottom;
            if (ActionBarLayout.this.bottomSheetTabs != null) {
                ActionBarLayout.this.bottomSheetTabs.updateCurrentAccount();
            }
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    measuredHeight = 0;
                    break;
                }
                View childAt = getChildAt(i5);
                if (childAt instanceof ActionBar) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    measuredHeight = childAt.getMeasuredHeight();
                    break;
                }
                i5++;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (!(childAt2 instanceof ActionBar)) {
                    if (childAt2.getTag(-15654349) != null || childAt2.getFitsSystemWindows() || (childAt2 instanceof BaseFragment.AttachedSheetWindow)) {
                        measureChildWithMargins(childAt2, i, 0, i2, this.isSupportEdgeToEdge ? ActionBarLayout.this.navigationBarInsetHeight : 0);
                    } else {
                        measureChildWithMargins(childAt2, i, 0, i2, measuredHeight);
                    }
                }
            }
            setMeasuredDimension(size, size2);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredHeight;
            int childCount = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    measuredHeight = 0;
                    break;
                }
                View childAt = getChildAt(i5);
                if (childAt instanceof ActionBar) {
                    measuredHeight = childAt.getMeasuredHeight();
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), measuredHeight);
                    break;
                }
                i5++;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (!(childAt2 instanceof ActionBar)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getTag(-15654349) != null || childAt2.getFitsSystemWindows() || (childAt2 instanceof BaseFragment.AttachedSheetWindow)) {
                        int i7 = layoutParams.leftMargin;
                        childAt2.layout(i7, layoutParams.topMargin, childAt2.getMeasuredWidth() + i7, layoutParams.topMargin + childAt2.getMeasuredHeight());
                    } else {
                        int i8 = layoutParams.leftMargin;
                        childAt2.layout(i8, layoutParams.topMargin + measuredHeight, childAt2.getMeasuredWidth() + i8, layoutParams.topMargin + measuredHeight + childAt2.getMeasuredHeight());
                    }
                }
            }
            View rootView = getRootView();
            getWindowVisibleDisplayFrame(this.rect);
            int height = (rootView.getHeight() - (this.rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView);
            Rect rect = this.rect;
            this.isKeyboardVisible = height - (rect.bottom - rect.top) > 0;
            if (ActionBarLayout.this.waitingForKeyboardCloseRunnable != null) {
                ActionBarLayout actionBarLayout = ActionBarLayout.this;
                if (actionBarLayout.containerView.isKeyboardVisible || actionBarLayout.containerViewBack.isKeyboardVisible) {
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(actionBarLayout.waitingForKeyboardCloseRunnable);
                ActionBarLayout.this.waitingForKeyboardCloseRunnable.run();
                ActionBarLayout.this.waitingForKeyboardCloseRunnable = null;
            }
        }

        @Override
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            ViewCompat.requestApplyInsets(this);
        }

        @Override
        public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.LayoutContainer.dispatchTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.fragmentPanTranslationOffset != 0) {
                int i = Theme.key_windowBackgroundWhite;
                if (this.backgroundColor != Theme.getColor(i)) {
                    Paint paint = this.backgroundPaint;
                    int color = Theme.getColor(i);
                    this.backgroundColor = color;
                    paint.setColor(color);
                }
                canvas.drawRect(0.0f, (getMeasuredHeight() - this.fragmentPanTranslationOffset) - 3, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
            }
            super.onDraw(canvas);
        }

        public void setShouldHandleBottomInsets(boolean z) {
            if (this.isSupportEdgeToEdge != z) {
                this.isSupportEdgeToEdge = z;
                ViewCompat.requestApplyInsets((View) getParent());
            }
        }

        public void setDrawNavigationBar(boolean z) {
            if (this.drawNavigationBar != z) {
                this.drawNavigationBar = z;
                invalidate();
            }
        }

        public void setFragmentPanTranslationOffset(int i) {
            this.fragmentPanTranslationOffset = i;
            invalidate();
        }
    }

    public boolean allowSwipe() {
        EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
        return emptyBaseFragment == null || emptyBaseFragment.getLastSheet() == null || !this.sheetFragment.getLastSheet().isShown();
    }

    public EmptyBaseFragment getSheetFragment() {
        return getSheetFragment(true);
    }

    public EmptyBaseFragment getSheetFragment(boolean z) {
        if (this.parentActivity == null) {
            return null;
        }
        if (this.sheetFragment == null) {
            EmptyBaseFragment emptyBaseFragment = new EmptyBaseFragment() {
                @Override
                protected void updateSheetsVisibility() {
                    super.updateSheetsVisibility();
                    ActionBarLayout.this.invalidate();
                }
            };
            this.sheetFragment = emptyBaseFragment;
            emptyBaseFragment.setParentLayout(this);
            EmptyBaseFragment emptyBaseFragment2 = this.sheetFragment;
            View viewCreateView = emptyBaseFragment2.fragmentView;
            if (viewCreateView == null) {
                viewCreateView = emptyBaseFragment2.createView(this.parentActivity);
            }
            if (viewCreateView.getParent() != this.sheetContainer) {
                AndroidUtilities.removeFromParent(viewCreateView);
                this.sheetContainer.addView(viewCreateView, LayoutHelper.createFrame(-1, -1.0f));
                this.sheetContainer.setShouldHandleBottomInsets(this.sheetFragment.isSupportEdgeToEdge());
                this.sheetContainer.setShouldHandleBottomInsets(this.sheetFragment.drawEdgeNavigationBar());
            }
            this.sheetFragment.onResume();
            this.sheetFragment.onBecomeFullyVisible();
        }
        return this.sheetFragment;
    }

    public ActionBarLayout(Context context, boolean z) {
        super(context);
        this.highlightActionButtons = false;
        this.decelerateInterpolator = new DecelerateInterpolator(1.5f);
        this.overshootInterpolator = new OvershootInterpolator(1.02f);
        this.accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        this.animateStartColors = new ArrayList();
        this.animateEndColors = new ArrayList();
        this.startColorsProvider = new INavigationLayout.StartColorsProvider();
        this.themeAnimatorDescriptions = new ArrayList();
        this.themeAnimatorDelegate = new ArrayList();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.rect = new Rect();
        this.overrideWidthOffset = -1;
        this.clipPath = new Path();
        this.radii = new float[8];
        this.measureSpec = new int[2];
        this.hasSheetsAnimator = new AnimatedFloat(this, 280L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.lastActions = new ArrayList();
        this.debugBlackScreenRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$9();
            }
        };
        this.parentActivity = (Activity) context;
        this.main = z;
        if (layerShadowDrawable == null) {
            layerShadowDrawable = getResources().getDrawable(R.drawable.layer_shadow);
            headerShadowDrawable = getResources().getDrawable(R.drawable.header_shadow).mutate();
            scrimPaint = new Paint();
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
            }
        });
    }

    public void setIsLayersLayout() {
        this.isLayersLayout = true;
    }

    @Override
    public void setFragmentStack(List<BaseFragment> list) {
        this.fragmentsStack = list;
        BottomSheetTabs bottomSheetTabs = this.bottomSheetTabs;
        if (bottomSheetTabs != null) {
            bottomSheetTabs.stopListening(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidate();
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.relayout();
                }
            });
            AndroidUtilities.removeFromParent(this.bottomSheetTabs);
            this.bottomSheetTabs = null;
        }
        if (this.main) {
            BottomSheetTabs bottomSheetTabs2 = new BottomSheetTabs(this.parentActivity, this);
            this.bottomSheetTabs = bottomSheetTabs2;
            this.bottomSheetTabsClip = new BottomSheetTabs.ClipTools(bottomSheetTabs2);
            this.bottomSheetTabs.listen(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidate();
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.relayout();
                }
            });
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.bottomSheetTabs, layoutParams);
            if (LaunchActivity.instance.getBottomSheetTabsOverlay() != null) {
                LaunchActivity.instance.getBottomSheetTabsOverlay().setTabsView(this.bottomSheetTabs);
            }
        }
        LayoutContainer layoutContainer = this.containerViewBack;
        if (layoutContainer != null) {
            AndroidUtilities.removeFromParent(layoutContainer);
        }
        LayoutContainer layoutContainer2 = new LayoutContainer(this.parentActivity);
        this.containerViewBack = layoutContainer2;
        addView(layoutContainer2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.containerViewBack.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.containerViewBack.setLayoutParams(layoutParams2);
        LayoutContainer layoutContainer3 = this.containerView;
        if (layoutContainer3 != null) {
            AndroidUtilities.removeFromParent(layoutContainer3);
        }
        LayoutContainer layoutContainer4 = new LayoutContainer(this.parentActivity);
        this.containerView = layoutContainer4;
        addView(layoutContainer4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.containerView.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.containerView.setLayoutParams(layoutParams3);
        LayoutContainer layoutContainer5 = this.sheetContainer;
        if (layoutContainer5 != null) {
            AndroidUtilities.removeFromParent(layoutContainer5);
        }
        LayoutContainer layoutContainer6 = new LayoutContainer(this.parentActivity);
        this.sheetContainer = layoutContainer6;
        addView(layoutContainer6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.sheetContainer.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.sheetContainer.setLayoutParams(layoutParams4);
        EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
        if (emptyBaseFragment != null) {
            emptyBaseFragment.setParentLayout(this);
            EmptyBaseFragment emptyBaseFragment2 = this.sheetFragment;
            View viewCreateView = emptyBaseFragment2.fragmentView;
            if (viewCreateView == null) {
                viewCreateView = emptyBaseFragment2.createView(this.parentActivity);
            }
            if (viewCreateView.getParent() != this.sheetContainer) {
                AndroidUtilities.removeFromParent(viewCreateView);
                this.sheetContainer.addView(viewCreateView, LayoutHelper.createFrame(-1, -1.0f));
                this.sheetContainer.setShouldHandleBottomInsets(this.sheetFragment.isSupportEdgeToEdge());
            }
            this.sheetFragment.onResume();
            this.sheetFragment.onBecomeFullyVisible();
        }
        Iterator it = this.fragmentsStack.iterator();
        while (it.hasNext()) {
            ((BaseFragment) it.next()).setParentLayout(this);
        }
    }

    @Override
    public void setIsSheet(boolean z) {
        this.isSheet = z;
    }

    @Override
    public boolean isSheet() {
        return this.isSheet;
    }

    public void updateTitleOverlay() {
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.fragmentsStack.isEmpty()) {
            return;
        }
        int size = this.fragmentsStack.size();
        for (int i = 0; i < size; i++) {
            BaseFragment baseFragment = (BaseFragment) this.fragmentsStack.get(i);
            baseFragment.onConfigurationChanged(configuration);
            Dialog dialog = baseFragment.visibleDialog;
            if (dialog instanceof BottomSheet) {
                ((BottomSheet) dialog).onConfigurationChanged(configuration);
            }
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        BaseFragment baseFragment;
        if (this.fragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            List list = this.fragmentsStack;
            baseFragment = (BaseFragment) list.get(list.size() - 1);
        }
        if (baseFragment != null && !baseFragment.isSupportEdgeToEdge() && storyViewerAttached()) {
            int iMeasureKeyboardHeight = measureKeyboardHeight();
            baseFragment.setKeyboardHeightFromParent(iMeasureKeyboardHeight);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + iMeasureKeyboardHeight, 1073741824));
            return;
        }
        INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate = this.delegate;
        if (iNavigationLayoutDelegate != null) {
            int[] iArr = this.measureSpec;
            iArr[0] = i;
            iArr[1] = i2;
            iNavigationLayoutDelegate.onMeasureOverride(iArr);
            int[] iArr2 = this.measureSpec;
            int i3 = iArr2[0];
            i2 = iArr2[1];
            i = i3;
        }
        this.isKeyboardVisible = measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        super.onMeasure(i, i2);
    }

    @Override
    protected void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void setInBubbleMode(boolean z) {
        this.inBubbleMode = z;
    }

    @Override
    public boolean isInBubbleMode() {
        return this.inBubbleMode;
    }

    @Override
    public void drawHeaderShadow(Canvas canvas, int i, int i2) {
        if (headerShadowDrawable == null || !SharedConfig.drawActionBarShadow) {
            return;
        }
        int i3 = i / 2;
        if (headerShadowDrawable.getAlpha() != i3) {
            headerShadowDrawable.setAlpha(i3);
        }
        headerShadowDrawable.setBounds(0, i2, getMeasuredWidth(), headerShadowDrawable.getIntrinsicHeight() + i2);
        headerShadowDrawable.draw(canvas);
    }

    public void setInnerTranslationX(float f) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.innerTranslationX = f;
        invalidate();
        if (this.fragmentsStack.size() < 2 || this.containerView.getMeasuredWidth() <= 0) {
            return;
        }
        if (newBackTransitions()) {
            measuredWidth = Utilities.clamp01(f / (AndroidUtilities.dp(56.0f) * 6));
        } else {
            measuredWidth = f / this.containerView.getMeasuredWidth();
        }
        List list = this.fragmentsStack;
        BaseFragment baseFragment = (BaseFragment) list.get(list.size() - 2);
        baseFragment.onSlideProgress(false, measuredWidth);
        BaseFragment baseFragment2 = (BaseFragment) this.fragmentsStack.get(r1.size() - 1);
        float fClamp = MathUtils.clamp(measuredWidth * 2.0f, 0.0f, 1.0f);
        if (!baseFragment2.isBeginToShow() || (navigationBarColor = baseFragment2.getNavigationBarColor()) == (navigationBarColor2 = baseFragment.getNavigationBarColor())) {
            return;
        }
        baseFragment2.setNavigationBarColor(ColorUtils.blendARGB(navigationBarColor, navigationBarColor2, fClamp));
    }

    public float getInnerTranslationX() {
        return this.innerTranslationX;
    }

    @Override
    public void onResume() {
        if (!this.fragmentsStack.isEmpty()) {
            ((BaseFragment) this.fragmentsStack.get(r0.size() - 1)).onResume();
        }
        EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
        if (emptyBaseFragment != null) {
            emptyBaseFragment.onResume();
        }
    }

    public void onUserLeaveHint() {
        if (!this.fragmentsStack.isEmpty()) {
            ((BaseFragment) this.fragmentsStack.get(r0.size() - 1)).onUserLeaveHint();
        }
        EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
        if (emptyBaseFragment != null) {
            emptyBaseFragment.onUserLeaveHint();
        }
    }

    @Override
    public void onPause() {
        if (!this.fragmentsStack.isEmpty()) {
            ((BaseFragment) this.fragmentsStack.get(r0.size() - 1)).onPause();
        }
        EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
        if (emptyBaseFragment != null) {
            emptyBaseFragment.onPause();
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.animationInProgress || checkTransitionAnimation() || onTouchEvent(motionEvent);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate = this.delegate;
            return (iNavigationLayoutDelegate != null && iNavigationLayoutDelegate.onPreIme()) || super.dispatchKeyEventPreIme(keyEvent);
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        this.withShadow = true;
        super.dispatchDraw(canvas);
    }

    @Override
    protected boolean drawChild(android.graphics.Canvas r21, android.view.View r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public void parentDraw(View view, Canvas canvas) {
        if (this.bottomSheetTabs == null || getHeight() >= view.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(getX() + this.bottomSheetTabs.getX(), getY() + this.bottomSheetTabs.getY());
        this.bottomSheetTabs.draw(canvas);
        canvas.restore();
    }

    public void setOverrideWidthOffset(int i) {
        this.overrideWidthOffset = i;
        invalidate();
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.inPreviewMode && !this.transitionAnimationPreviewMode && !this.previewOpenAnimationInProgress) {
            return 0.0f;
        }
        BaseFragment baseFragment = this.oldFragment;
        return ((baseFragment == null || !baseFragment.inPreviewMode) ? this.containerView : this.containerViewBack).getAlpha();
    }

    private void drawPreviewDrawables(Canvas canvas, ViewGroup viewGroup) {
        if (viewGroup.getChildAt(0) != null) {
            this.previewBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.previewBackgroundDrawable.draw(canvas);
            if (this.previewMenu == null) {
                int iDp = AndroidUtilities.dp(32.0f);
                int measuredWidth = (getMeasuredWidth() - iDp) / 2;
                int top = (int) ((r1.getTop() + viewGroup.getTranslationY()) - AndroidUtilities.dp(12.0f));
                Theme.moveUpDrawable.setBounds(measuredWidth, top, iDp + measuredWidth, (iDp / 2) + top);
                Theme.moveUpDrawable.draw(canvas);
            }
        }
    }

    @Override
    public void setDelegate(INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate) {
        this.delegate = iNavigationLayoutDelegate;
    }

    public void onSlideAnimationEnd(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!z) {
            if (this.fragmentsStack.size() < 2) {
                checkBlackScreen("onSlideAnimationEnd exit");
                return;
            }
            List list = this.fragmentsStack;
            BaseFragment baseFragment = (BaseFragment) list.get(list.size() - 1);
            baseFragment.prepareFragmentToSlide(true, false);
            baseFragment.onPause();
            baseFragment.onFragmentDestroy();
            baseFragment.setParentLayout(null);
            List list2 = this.fragmentsStack;
            list2.remove(list2.size() - 1);
            onFragmentStackChanged("onSlideAnimationEnd");
            LayoutContainer layoutContainer = this.containerView;
            layoutContainer.setAlpha(1.0f);
            LayoutContainer layoutContainer2 = this.containerViewBack;
            this.containerView = layoutContainer2;
            this.containerViewBack = layoutContainer;
            bringChildToFront(layoutContainer2);
            View view = this.sheetContainer;
            if (view != null) {
                bringChildToFront(view);
            }
            if (this.fragmentsStack.size() > 0) {
                List list3 = this.fragmentsStack;
                BaseFragment baseFragment2 = (BaseFragment) list3.get(list3.size() - 1);
                this.currentActionBar = baseFragment2.actionBar;
                baseFragment2.onResume();
                baseFragment2.onBecomeFullyVisible();
                baseFragment2.prepareFragmentToSlide(false, false);
            }
            this.layoutToIgnore = this.containerView;
        } else {
            if (this.fragmentsStack.size() >= 2) {
                List list4 = this.fragmentsStack;
                ((BaseFragment) list4.get(list4.size() - 1)).prepareFragmentToSlide(true, false);
                List list5 = this.fragmentsStack;
                BaseFragment baseFragment3 = (BaseFragment) list5.get(list5.size() - 2);
                baseFragment3.prepareFragmentToSlide(false, false);
                baseFragment3.onPause();
                View view2 = baseFragment3.fragmentView;
                if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                    baseFragment3.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(baseFragment3.fragmentView);
                }
                ActionBar actionBar = baseFragment3.actionBar;
                if (actionBar != null && actionBar.shouldAddToContainer() && (viewGroup = (ViewGroup) baseFragment3.actionBar.getParent()) != null) {
                    viewGroup.removeViewInLayout(baseFragment3.actionBar);
                }
                baseFragment3.detachSheets();
            }
            this.layoutToIgnore = null;
        }
        this.containerViewBack.setVisibility(4);
        this.startedTracking = false;
        this.animationInProgress = false;
        this.containerView.setTranslationX(0.0f);
        this.containerViewBack.setTranslationX(0.0f);
        this.containerView.setLayerType(0, null);
        setInnerTranslationX(0.0f);
    }

    private void prepareForMoving() {
        this.maybeStartTracking = false;
        this.startedTracking = true;
        LayoutContainer layoutContainer = this.containerViewBack;
        this.layoutToIgnore = layoutContainer;
        layoutContainer.setVisibility(0);
        this.beginTrackingSent = false;
        List list = this.fragmentsStack;
        BaseFragment baseFragment = (BaseFragment) list.get(list.size() - 2);
        View viewCreateView = baseFragment.fragmentView;
        if (viewCreateView == null && (viewCreateView = baseFragment.createView(this.parentActivity)) != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
            ViewCompat.setOnApplyWindowInsetsListener(viewCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment));
            this.containerViewBack.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) viewCreateView.getParent();
        if (viewGroup != null) {
            baseFragment.onRemoveFromParent();
            viewGroup.removeView(viewCreateView);
        }
        this.containerViewBack.addView(viewCreateView);
        this.containerViewBack.setShouldHandleBottomInsets(baseFragment.isSupportEdgeToEdge());
        this.containerViewBack.setDrawNavigationBar(baseFragment.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewCreateView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        viewCreateView.setLayoutParams(layoutParams);
        ActionBar actionBar = baseFragment.actionBar;
        if (actionBar != null && actionBar.shouldAddToContainer()) {
            AndroidUtilities.removeFromParent(baseFragment.actionBar);
            if (this.removeActionBarExtraHeight) {
                baseFragment.actionBar.setOccupyStatusBar(false);
            }
            this.containerViewBack.addView(baseFragment.actionBar);
        }
        baseFragment.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
        baseFragment.attachSheets(this.containerViewBack);
        if (!baseFragment.hasOwnBackground && viewCreateView.getBackground() == null) {
            viewCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }
        baseFragment.onResume();
        if (this.themeAnimatorSet != null) {
            this.presentingFragmentDescriptions = baseFragment.getThemeDescriptions();
        }
        this.containerView.setLayerType(2, null);
        List list2 = this.fragmentsStack;
        ((BaseFragment) list2.get(list2.size() - 1)).prepareFragmentToSlide(true, true);
        baseFragment.prepareFragmentToSlide(false, true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (checkTransitionAnimation() || this.inActionMode || this.animationInProgress || this.predictiveBackInProgress) {
            return false;
        }
        if (this.fragmentsStack.size() > 1 && allowSwipe()) {
            if (motionEvent != null && motionEvent.getAction() == 0) {
                List list = this.fragmentsStack;
                if (!((BaseFragment) list.get(list.size() - 1)).isSwipeBackEnabled(motionEvent)) {
                    this.maybeStartTracking = false;
                    this.startedTracking = false;
                    LayoutContainer layoutContainer = this.containerView;
                    if (layoutContainer != null) {
                        layoutContainer.setLayerType(0, null);
                    }
                    return false;
                }
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                this.maybeStartTracking = true;
                this.startedTrackingX = (int) motionEvent.getX();
                this.startedTrackingY = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                int iMax = Math.max(0, (int) (motionEvent.getX() - this.startedTrackingX));
                int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                this.velocityTracker.addMovement(motionEvent);
                if (!this.transitionAnimationInProgress && !this.inPreviewMode && this.maybeStartTracking && !this.startedTracking && iMax >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(iMax) / 3 > iAbs) {
                    List list2 = this.fragmentsStack;
                    if (((BaseFragment) list2.get(list2.size() - 1)).canBeginSlide() && findScrollingChild(this, motionEvent.getX(), motionEvent.getY()) == null) {
                        this.startedTrackingX = (int) motionEvent.getX();
                        prepareForMoving();
                    } else {
                        this.maybeStartTracking = false;
                    }
                } else if (this.startedTracking) {
                    if (!this.beginTrackingSent) {
                        if (this.parentActivity.getCurrentFocus() != null) {
                            AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
                        }
                        List list3 = this.fragmentsStack;
                        ((BaseFragment) list3.get(list3.size() - 1)).onBeginSlide();
                        this.beginTrackingSent = true;
                    }
                    if (newBackTransitions()) {
                        float f = iMax;
                        this.containerView.setTranslationX((f / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                        setInnerTranslationX((f / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                    } else {
                        float f2 = iMax;
                        this.containerView.setTranslationX(f2);
                        setInnerTranslationX(f2);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.addMovement(motionEvent);
                this.velocityTracker.computeCurrentVelocity(1000);
                List list4 = this.fragmentsStack;
                BaseFragment baseFragment = (BaseFragment) list4.get(list4.size() - 1);
                if (!this.inPreviewMode && !this.transitionAnimationPreviewMode && !this.startedTracking && baseFragment.isSwipeBackEnabled(motionEvent)) {
                    float xVelocity = this.velocityTracker.getXVelocity();
                    float yVelocity = this.velocityTracker.getYVelocity();
                    if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && baseFragment.canBeginSlide()) {
                        this.startedTrackingX = (int) motionEvent.getX();
                        prepareForMoving();
                        if (!this.beginTrackingSent) {
                            if (((Activity) getContext()).getCurrentFocus() != null) {
                                AndroidUtilities.hideKeyboard(((Activity) getContext()).getCurrentFocus());
                            }
                            this.beginTrackingSent = true;
                        }
                    }
                }
                if (this.startedTracking) {
                    float x = this.containerView.getX();
                    float xVelocity2 = this.velocityTracker.getXVelocity();
                    float yVelocity2 = this.velocityTracker.getYVelocity();
                    if (!newBackTransitions() ? x < this.containerView.getMeasuredWidth() / 3.0f : !(x >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                        if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                            z = true;
                        }
                    }
                    animateBackEndAnimation(z);
                } else {
                    this.maybeStartTracking = false;
                    this.startedTracking = false;
                    this.layoutToIgnore = null;
                    LayoutContainer layoutContainer2 = this.containerView;
                    if (layoutContainer2 != null) {
                        layoutContainer2.setLayerType(0, null);
                    }
                }
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.velocityTracker = null;
                }
            } else if (motionEvent == null) {
                this.maybeStartTracking = false;
                this.startedTracking = false;
                this.layoutToIgnore = null;
                LayoutContainer layoutContainer3 = this.containerView;
                if (layoutContainer3 != null) {
                    layoutContainer3.setLayerType(0, null);
                }
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.velocityTracker = null;
                }
            }
        }
        return this.startedTracking;
    }

    public void onBackStarted(float f, float f2) {
        if (this.animationInProgress) {
            AnimatorSet animatorSet = this.backAnimator;
            if (animatorSet == null) {
                return;
            }
            animatorSet.end();
            this.backAnimator = null;
            if (this.animationInProgress) {
                return;
            }
        }
        if (this.predictiveBackInProgress || this.predictiveInput || this.transitionAnimationPreviewMode || this.startedTracking || checkTransitionAnimation()) {
            return;
        }
        if (this.fragmentsStack.size() > 1 && !isInPreviewMode()) {
            EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
            if (emptyBaseFragment == null || !emptyBaseFragment.hasShownSheet()) {
                List list = this.fragmentsStack;
                BaseFragment baseFragment = (BaseFragment) list.get(list.size() - 1);
                if (baseFragment.onBackPressed(false) && !baseFragment.hasShownSheet() && baseFragment.canBeginSlide()) {
                    this.predictiveBackHasProgress = false;
                    this.predictiveBackInProgress = true;
                    this.predictiveInput = true;
                    this.predictiveBackLeft = f < ((float) AndroidUtilities.displaySize.x) / 2.0f;
                    this.predictiveBackY = f2;
                    prepareForMoving();
                    Activity activity = this.parentActivity;
                    if (activity != null && activity.getCurrentFocus() != null) {
                        AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
                    }
                    baseFragment.onBeginSlide();
                }
            }
        }
    }

    public void onBackProgress(float f) {
        if (this.predictiveInput) {
            float fDp = AndroidUtilities.dp(56.0f) * f;
            this.predictiveBackHasProgress = f > 0.0f;
            this.containerView.setTranslationX(fDp);
            setInnerTranslationX(fDp);
        }
    }

    public void onBackCancelled() {
        if (this.predictiveInput) {
            this.predictiveInput = false;
            animateBackEndAnimation(true);
        }
    }

    public void onBackInvoked() {
        if (!this.predictiveInput) {
            onBackPressed();
        } else {
            this.predictiveInput = false;
            animateBackEndAnimation(false);
        }
    }

    private boolean newBackTransitions() {
        return this.predictiveBackInProgress && this.predictiveBackHasProgress;
    }

    private void animateBackEndAnimation(final boolean z) {
        BaseFragment baseFragment;
        Animator customSlideTransition;
        if (this.fragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            List list = this.fragmentsStack;
            baseFragment = (BaseFragment) list.get(list.size() - 1);
        }
        if (baseFragment == null) {
            return;
        }
        float x = this.containerView.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean zShouldOverrideSlideTransition = baseFragment.shouldOverrideSlideTransition(false, z);
        if (!z) {
            x = Math.abs(this.containerView.getMeasuredWidth() - x);
            int iMax = Math.max((int) ((200.0f / this.containerView.getMeasuredWidth()) * x), newBackTransitions() ? 380 : 50);
            if (!zShouldOverrideSlideTransition) {
                long j = iMax;
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.containerView, (Property<LayoutContainer, Float>) View.TRANSLATION_X, r6.getMeasuredWidth() + (this.predictiveBackInProgress ? AndroidUtilities.dp(56.0f) : 0)).setDuration(j), ObjectAnimator.ofFloat(this, "innerTranslationX", this.containerView.getMeasuredWidth()).setDuration(j));
                if (newBackTransitions()) {
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                }
            }
        } else {
            int iMax2 = Math.max((int) ((320.0f / this.containerView.getMeasuredWidth()) * x), newBackTransitions() ? 320 : 120);
            if (!zShouldOverrideSlideTransition) {
                long j2 = iMax2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.containerView, (Property<LayoutContainer, Float>) View.TRANSLATION_X, 0.0f).setDuration(j2), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j2));
                if (newBackTransitions()) {
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                }
            }
        }
        Animator customSlideTransition2 = baseFragment.getCustomSlideTransition(false, z, x);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        List list2 = this.fragmentsStack;
        BaseFragment baseFragment2 = (BaseFragment) list2.get(list2.size() - 2);
        if (baseFragment2 != null && (customSlideTransition = baseFragment2.getCustomSlideTransition(false, z, x)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new AnimatorListenerAdapter() {
            private boolean cancelled;

            @Override
            public void onAnimationCancel(Animator animator) {
                this.cancelled = true;
                ActionBarLayout.this.predictiveBackInProgress = false;
                ActionBarLayout.this.containerView.setAlpha(1.0f);
                ActionBarLayout.this.onSlideAnimationEnd(true);
                ActionBarLayout.this.backAnimator = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (this.cancelled) {
                    return;
                }
                ActionBarLayout.this.predictiveBackInProgress = false;
                ActionBarLayout.this.containerView.setAlpha(1.0f);
                ActionBarLayout.this.onSlideAnimationEnd(z);
                ActionBarLayout.this.backAnimator = null;
            }
        });
        this.backAnimator = animatorSet;
        this.backAnimatorIsBack = z;
        animatorSet.start();
        this.animationInProgress = true;
        this.layoutToIgnore = this.containerViewBack;
    }

    @Override
    public void onBackPressed() {
        ActionBar actionBar;
        if (this.transitionAnimationPreviewMode || this.startedTracking || checkTransitionAnimation() || this.fragmentsStack.isEmpty() || GroupCallPip.onBackPressed()) {
            return;
        }
        if (!storyViewerAttached() && (actionBar = this.currentActionBar) != null && !actionBar.isActionModeShowed()) {
            ActionBar actionBar2 = this.currentActionBar;
            if (actionBar2.isSearchFieldVisible) {
                actionBar2.closeSearchField();
                return;
            }
        }
        EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
        if (emptyBaseFragment == null || emptyBaseFragment.onBackPressed(true)) {
            List list = this.fragmentsStack;
            if (!((BaseFragment) list.get(list.size() - 1)).onBackPressed(true) || this.fragmentsStack.isEmpty()) {
                return;
            }
            closeLastFragment(true);
        }
    }

    @Override
    public void onLowMemory() {
        Iterator it = this.fragmentsStack.iterator();
        while (it.hasNext()) {
            ((BaseFragment) it.next()).onLowMemory();
        }
    }

    public void onAnimationEndCheck(boolean z) throws IOException {
        onCloseAnimationEnd();
        onOpenAnimationEnd();
        Runnable runnable = this.waitingForKeyboardCloseRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.waitingForKeyboardCloseRunnable = null;
        }
        AnimatorSet animatorSet = this.currentAnimation;
        if (animatorSet != null) {
            if (z) {
                animatorSet.cancel();
            }
            this.currentAnimation = null;
        }
        Runnable runnable2 = this.animationRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.animationRunnable = null;
        }
        setAlpha(1.0f);
        this.containerView.setAlpha(1.0f);
        this.containerView.setScaleX(1.0f);
        this.containerView.setScaleY(1.0f);
        this.containerViewBack.setAlpha(1.0f);
        this.containerViewBack.setScaleX(1.0f);
        this.containerViewBack.setScaleY(1.0f);
    }

    @Override
    public BaseFragment getLastFragment() {
        if (this.fragmentsStack.isEmpty()) {
            return null;
        }
        return (BaseFragment) this.fragmentsStack.get(r0.size() - 1);
    }

    public BaseFragment getLastFragmentIncludeMainTabs() {
        BaseFragment lastFragment = getLastFragment();
        return lastFragment instanceof MainTabsActivity ? ((MainTabsActivity) lastFragment).getCurrentVisibleFragment() : lastFragment;
    }

    @Override
    public boolean checkTransitionAnimation() throws IOException {
        if (this.transitionAnimationPreviewMode) {
            return false;
        }
        if (this.transitionAnimationInProgress && (this.transitionAnimationStartTime < System.currentTimeMillis() - 1500 || this.inPreviewMode)) {
            onAnimationEndCheck(true);
        }
        return this.transitionAnimationInProgress;
    }

    @Override
    public boolean isPreviewOpenAnimationInProgress() {
        return this.previewOpenAnimationInProgress;
    }

    @Override
    public boolean isSwipeInProgress() {
        return this.startedTracking;
    }

    @Override
    public boolean isTransitionAnimationInProgress() {
        return this.transitionAnimationInProgress || this.animationInProgress;
    }

    private void presentFragmentInternalRemoveOld(boolean z, BaseFragment baseFragment) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (baseFragment == null) {
            return;
        }
        baseFragment.onBecomeFullyHidden();
        baseFragment.onPause();
        if (z) {
            baseFragment.onFragmentDestroy();
            baseFragment.setParentLayout(null);
            this.fragmentsStack.remove(baseFragment);
            onFragmentStackChanged("presentFragmentInternalRemoveOld");
        } else {
            View view = baseFragment.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                baseFragment.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(baseFragment.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                    try {
                        viewGroup2.removeView(baseFragment.fragmentView);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
            }
            ActionBar actionBar = baseFragment.actionBar;
            if (actionBar != null && actionBar.shouldAddToContainer() && (viewGroup = (ViewGroup) baseFragment.actionBar.getParent()) != null) {
                viewGroup.removeViewInLayout(baseFragment.actionBar);
            }
            baseFragment.detachSheets();
        }
        this.containerViewBack.setVisibility(4);
    }

    public void startLayoutAnimation(final boolean z, final boolean z2, final boolean z3) {
        if (z2) {
            this.animationProgress = 0.0f;
            this.lastFrameTime = System.nanoTime() / 1000000;
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() throws IOException {
                float interpolation;
                if (ActionBarLayout.this.animationRunnable != this) {
                    return;
                }
                ActionBarLayout.this.animationRunnable = null;
                if (z2) {
                    ActionBarLayout.this.transitionAnimationStartTime = System.currentTimeMillis();
                }
                long jNanoTime = System.nanoTime() / 1000000;
                long j = jNanoTime - ActionBarLayout.this.lastFrameTime;
                if (j > 40 && z2) {
                    j = 0;
                } else if (j > 18) {
                    j = 18;
                }
                ActionBarLayout.this.lastFrameTime = jNanoTime;
                ActionBarLayout.access$1716(ActionBarLayout.this, j / ((z3 && z) ? 190.0f : 150.0f));
                if (ActionBarLayout.this.animationProgress > 1.0f) {
                    ActionBarLayout.this.animationProgress = 1.0f;
                }
                if (ActionBarLayout.this.newFragment != null) {
                    ActionBarLayout.this.newFragment.onTransitionAnimationProgress(true, ActionBarLayout.this.animationProgress);
                }
                if (ActionBarLayout.this.oldFragment != null) {
                    ActionBarLayout.this.oldFragment.onTransitionAnimationProgress(false, ActionBarLayout.this.animationProgress);
                }
                Integer numValueOf = ActionBarLayout.this.oldFragment != null ? Integer.valueOf(ActionBarLayout.this.oldFragment.getNavigationBarColor()) : null;
                Integer numValueOf2 = ActionBarLayout.this.newFragment != null ? Integer.valueOf(ActionBarLayout.this.newFragment.getNavigationBarColor()) : null;
                if (ActionBarLayout.this.oldFragment != null && ActionBarLayout.this.oldFragment.isSupportEdgeToEdge() && numValueOf2 != null) {
                    numValueOf = numValueOf2;
                }
                if (ActionBarLayout.this.newFragment != null && ActionBarLayout.this.newFragment.isSupportEdgeToEdge() && numValueOf != null) {
                    numValueOf2 = numValueOf;
                }
                if (ActionBarLayout.this.newFragment != null && numValueOf != null && numValueOf2 != null) {
                    int iBlendARGB = ColorUtils.blendARGB(numValueOf.intValue(), numValueOf2.intValue(), MathUtils.clamp(ActionBarLayout.this.animationProgress * 4.0f, 0.0f, 1.0f));
                    if (ActionBarLayout.this.sheetFragment != null && ActionBarLayout.this.sheetFragment.sheetsStack != null) {
                        for (int i = 0; i < ActionBarLayout.this.sheetFragment.sheetsStack.size(); i++) {
                            BaseFragment.AttachedSheet attachedSheet = ActionBarLayout.this.sheetFragment.sheetsStack.get(i);
                            if (attachedSheet.attachedToParent()) {
                                iBlendARGB = attachedSheet.getNavigationBarColor(iBlendARGB);
                            }
                        }
                    }
                    ActionBarLayout.this.newFragment.setNavigationBarColor(iBlendARGB);
                }
                if (!z3) {
                    interpolation = ActionBarLayout.this.decelerateInterpolator.getInterpolation(ActionBarLayout.this.animationProgress);
                } else {
                    interpolation = z ? ActionBarLayout.this.overshootInterpolator.getInterpolation(ActionBarLayout.this.animationProgress) : CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(ActionBarLayout.this.animationProgress);
                }
                if (z) {
                    float fClamp = MathUtils.clamp(interpolation, 0.0f, 1.0f);
                    ActionBarLayout.this.containerView.setAlpha(fClamp);
                    if (z3) {
                        float f = (0.3f * interpolation) + 0.7f;
                        ActionBarLayout.this.containerView.setScaleX(f);
                        ActionBarLayout.this.containerView.setScaleY(f);
                        if (ActionBarLayout.this.previewMenu != null) {
                            float f2 = 1.0f - interpolation;
                            ActionBarLayout.this.containerView.setTranslationY(AndroidUtilities.dp(40.0f) * f2);
                            ActionBarLayout.this.previewMenu.setTranslationY((-AndroidUtilities.dp(70.0f)) * f2);
                            float f3 = (interpolation * 0.05f) + 0.95f;
                            ActionBarLayout.this.previewMenu.setScaleX(f3);
                            ActionBarLayout.this.previewMenu.setScaleY(f3);
                        }
                        ActionBarLayout.this.previewBackgroundDrawable.setAlpha((int) (46.0f * fClamp));
                        Theme.moveUpDrawable.setAlpha((int) (fClamp * 255.0f));
                        ActionBarLayout.this.containerView.invalidate();
                        ActionBarLayout.this.invalidate();
                    } else {
                        ActionBarLayout.this.containerView.setTranslationX(AndroidUtilities.dp(48.0f) * (1.0f - interpolation));
                    }
                } else {
                    float f4 = 1.0f - interpolation;
                    float fClamp2 = MathUtils.clamp(f4, 0.0f, 1.0f);
                    ActionBarLayout.this.containerViewBack.setAlpha(fClamp2);
                    if (z3) {
                        float f5 = (f4 * 0.1f) + 0.9f;
                        ActionBarLayout.this.containerViewBack.setScaleX(f5);
                        ActionBarLayout.this.containerViewBack.setScaleY(f5);
                        ActionBarLayout.this.previewBackgroundDrawable.setAlpha((int) (46.0f * fClamp2));
                        if (ActionBarLayout.this.previewMenu == null) {
                            Theme.moveUpDrawable.setAlpha((int) (fClamp2 * 255.0f));
                        }
                        ActionBarLayout.this.containerView.invalidate();
                        ActionBarLayout.this.invalidate();
                    } else {
                        ActionBarLayout.this.containerViewBack.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
                    }
                }
                if (ActionBarLayout.this.animationProgress < 1.0f) {
                    ActionBarLayout.this.startLayoutAnimation(z, false, z3);
                } else {
                    ActionBarLayout.this.onAnimationEndCheck(false);
                }
            }
        };
        this.animationRunnable = runnable;
        AndroidUtilities.runOnUIThread(runnable);
    }

    @Override
    public void resumeDelayedFragmentAnimation() {
        this.delayedAnimationResumed = true;
        Runnable runnable = this.delayedOpenAnimationRunnable;
        if (runnable == null || this.waitingForKeyboardCloseRunnable != null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable);
        this.delayedOpenAnimationRunnable.run();
        this.delayedOpenAnimationRunnable = null;
    }

    @Override
    public boolean isInPreviewMode() {
        return this.inPreviewMode || this.transitionAnimationPreviewMode;
    }

    @Override
    public boolean isInPassivePreviewMode() {
        return (this.inPreviewMode && this.previewMenu == null) || this.transitionAnimationPreviewMode;
    }

    @Override
    public boolean presentFragment(INavigationLayout.NavigationParams navigationParams) {
        INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate;
        final BaseFragment baseFragment;
        int measuredHeight;
        boolean z;
        LaunchActivity launchActivity;
        final BaseFragment baseFragment2 = navigationParams.fragment;
        final boolean z2 = navigationParams.removeLast;
        boolean z3 = navigationParams.noAnimation;
        boolean z4 = navigationParams.checkPresentFromDelegate;
        final boolean z5 = navigationParams.preview;
        final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = navigationParams.menuView;
        if (baseFragment2 == null || checkTransitionAnimation() || !(((iNavigationLayoutDelegate = this.delegate) == null || !z4 || iNavigationLayoutDelegate.needPresentFragment(this, navigationParams)) && baseFragment2.onFragmentCreate())) {
            return false;
        }
        boolean zIsSupportEdgeToEdge = baseFragment2.isSupportEdgeToEdge();
        boolean zDrawEdgeNavigationBar = baseFragment2.drawEdgeNavigationBar();
        BaseFragment lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.instance) != null && launchActivity.getVisibleDialog() != null) {
            visibleDialog = LaunchActivity.instance.getVisibleDialog();
        }
        if (lastFragment != null && shouldOpenFragmentOverlay(visibleDialog)) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(baseFragment2, bottomSheetParams);
            return true;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("present fragment " + baseFragment2.getClass().getSimpleName() + " args=" + baseFragment2.getArguments());
        }
        StoryViewer.closeGlobalInstances();
        BottomSheetTabs bottomSheetTabs = this.bottomSheetTabs;
        if (bottomSheetTabs != null && !bottomSheetTabs.doNotDismiss) {
            LaunchActivity.dismissAllWeb();
        }
        if (this.inPreviewMode && this.transitionAnimationPreviewMode) {
            Runnable runnable = this.delayedOpenAnimationRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.delayedOpenAnimationRunnable = null;
            }
            closeLastFragment(false, true);
        }
        baseFragment2.setInPreviewMode(z5);
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.previewMenu;
        if (actionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.previewMenu.getParent()).removeView(this.previewMenu);
            }
            this.previewMenu = null;
        }
        this.previewMenu = actionBarPopupWindowLayout;
        baseFragment2.setInMenuMode(actionBarPopupWindowLayout != null);
        if (this.parentActivity.getCurrentFocus() != null && baseFragment2.hideKeyboardOnShow() && !z5) {
            AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
        }
        boolean z6 = z5 || (!z3 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        if (this.fragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            List list = this.fragmentsStack;
            baseFragment = (BaseFragment) list.get(list.size() - 1);
        }
        baseFragment2.setParentLayout(this);
        View viewCreateView = baseFragment2.fragmentView;
        if (viewCreateView == null) {
            viewCreateView = baseFragment2.createView(this.parentActivity);
            if (viewCreateView != null && baseFragment2.isSupportEdgeToEdge() && baseFragment2.drawEdgeNavigationBar()) {
                ViewCompat.setOnApplyWindowInsetsListener(viewCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment2));
                this.containerViewBack.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) viewCreateView.getParent();
            if (viewGroup != null) {
                baseFragment2.onRemoveFromParent();
                viewGroup.removeView(viewCreateView);
            }
        }
        this.containerViewBack.addView(viewCreateView);
        this.containerViewBack.setShouldHandleBottomInsets(!z5 && zIsSupportEdgeToEdge);
        this.containerViewBack.setDrawNavigationBar(!z5 && zDrawEdgeNavigationBar);
        if (actionBarPopupWindowLayout != null) {
            this.containerViewBack.addView(actionBarPopupWindowLayout);
            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            measuredHeight = actionBarPopupWindowLayout.getMeasuredHeight() + AndroidUtilities.dp(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindowLayout.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.topMargin = ((getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - measuredHeight) - AndroidUtilities.dp(6.0f);
            actionBarPopupWindowLayout.setLayoutParams(layoutParams);
        } else {
            measuredHeight = 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewCreateView.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z5) {
            int previewHeight = baseFragment2.getPreviewHeight();
            int i = AndroidUtilities.statusBarHeight;
            if (previewHeight > 0 && previewHeight < getMeasuredHeight() - i) {
                layoutParams2.height = previewHeight;
                layoutParams2.topMargin = i + (((getMeasuredHeight() - i) - previewHeight) / 2);
            } else {
                int iDp = AndroidUtilities.dp(actionBarPopupWindowLayout != null ? 0.0f : 24.0f);
                layoutParams2.bottomMargin = iDp;
                layoutParams2.topMargin = iDp;
                int i2 = AndroidUtilities.statusBarHeight;
                int i3 = iDp + i2;
                layoutParams2.topMargin = i3;
                if (zIsSupportEdgeToEdge) {
                    layoutParams2.topMargin = i3 + i2;
                }
            }
            if (actionBarPopupWindowLayout != null) {
                layoutParams2.bottomMargin += measuredHeight + AndroidUtilities.dp(8.0f);
            }
            int iDp2 = AndroidUtilities.dp(8.0f);
            layoutParams2.leftMargin = iDp2;
            layoutParams2.rightMargin = iDp2;
        } else {
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
        }
        viewCreateView.setLayoutParams(layoutParams2);
        ActionBar actionBar = baseFragment2.actionBar;
        if (actionBar != null && actionBar.shouldAddToContainer()) {
            if (this.removeActionBarExtraHeight) {
                baseFragment2.actionBar.setOccupyStatusBar(false);
            }
            AndroidUtilities.removeFromParent(baseFragment2.actionBar);
            this.containerViewBack.addView(baseFragment2.actionBar);
        }
        baseFragment2.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
        baseFragment2.attachSheets(this.containerViewBack);
        this.fragmentsStack.add(baseFragment2);
        onFragmentStackChanged("presentFragment");
        baseFragment2.onResume();
        this.currentActionBar = baseFragment2.actionBar;
        if (!baseFragment2.hasOwnBackground && viewCreateView.getBackground() == null) {
            viewCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }
        LayoutContainer layoutContainer = this.containerView;
        LayoutContainer layoutContainer2 = this.containerViewBack;
        this.containerView = layoutContainer2;
        this.containerViewBack = layoutContainer;
        layoutContainer2.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        if (z5) {
            viewCreateView.setOutlineProvider(ViewOutlineProviderImpl.boundsWithPaddingRoundRect(0, AndroidUtilities.dp(actionBarPopupWindowLayout == null ? 24.0f : 12.0f)));
            viewCreateView.setClipToOutline(true);
            viewCreateView.setElevation(AndroidUtilities.dp(4.0f));
            if (Build.VERSION.SDK_INT >= 28) {
                viewCreateView.setOutlineSpotShadowColor(-1342177280);
                viewCreateView.setOutlineAmbientShadowColor(-1342177280);
            }
            if (this.previewBackgroundDrawable == null) {
                this.previewBackgroundDrawable = new ColorDrawable(771751936);
            }
            this.previewBackgroundDrawable.setAlpha(0);
            Theme.moveUpDrawable.setAlpha(0);
        }
        bringChildToFront(this.containerView);
        LayoutContainer layoutContainer3 = this.sheetContainer;
        if (layoutContainer3 != null) {
            bringChildToFront(layoutContainer3);
        }
        if (!z6) {
            presentFragmentInternalRemoveOld(z2, baseFragment);
            View view = this.backgroundView;
            if (view != null) {
                view.setVisibility(0);
            }
        }
        if (this.themeAnimatorSet != null) {
            this.presentingFragmentDescriptions = baseFragment2.getThemeDescriptions();
        }
        if (z6 || z5) {
            if (this.useAlphaAnimations && this.fragmentsStack.size() == 1) {
                presentFragmentInternalRemoveOld(z2, baseFragment);
                this.transitionAnimationStartTime = System.currentTimeMillis();
                this.transitionAnimationInProgress = true;
                this.layoutToIgnore = this.containerView;
                this.onOpenAnimationEndRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        ActionBarLayout.lambda$presentFragment$0(baseFragment, baseFragment2);
                    }
                };
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 0.0f, 1.0f));
                View view2 = this.backgroundView;
                if (view2 != null) {
                    view2.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.backgroundView, (Property<View, Float>) property, 0.0f, 1.0f));
                }
                if (baseFragment != null) {
                    baseFragment.onTransitionAnimationStart(false, false);
                }
                baseFragment2.onTransitionAnimationStart(true, false);
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentAnimation = animatorSet;
                animatorSet.playTogether(arrayList);
                this.currentAnimation.setInterpolator(this.accelerateDecelerateInterpolator);
                this.currentAnimation.setDuration(200L);
                this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) throws IOException {
                        ActionBarLayout.this.onAnimationEndCheck(false);
                    }
                });
                this.currentAnimation.start();
            } else {
                this.transitionAnimationPreviewMode = z5;
                this.transitionAnimationStartTime = System.currentTimeMillis();
                this.transitionAnimationInProgress = true;
                this.layoutToIgnore = this.containerView;
                final BaseFragment baseFragment3 = baseFragment;
                this.onOpenAnimationEndRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$presentFragment$1(z5, actionBarPopupWindowLayout, z2, baseFragment3, baseFragment2);
                    }
                };
                boolean zNeedDelayOpenAnimation = baseFragment2.needDelayOpenAnimation();
                final boolean z7 = !zNeedDelayOpenAnimation;
                if (zNeedDelayOpenAnimation) {
                    z = false;
                } else {
                    z = false;
                    if (baseFragment != null) {
                        baseFragment.onTransitionAnimationStart(false, false);
                    }
                    baseFragment2.onTransitionAnimationStart(true, false);
                }
                this.delayedAnimationResumed = z;
                this.oldFragment = baseFragment;
                this.newFragment = baseFragment2;
                AnimatorSet animatorSetOnCustomTransitionAnimation = !z5 ? baseFragment2.onCustomTransitionAnimation(true, new Runnable() {
                    @Override
                    public final void run() throws IOException {
                        this.f$0.lambda$presentFragment$2();
                    }
                }) : null;
                if (animatorSetOnCustomTransitionAnimation != null) {
                    if (!z5 && ((this.containerView.isKeyboardVisible || this.containerViewBack.isKeyboardVisible) && baseFragment != null)) {
                        baseFragment.saveKeyboardPositionBeforeTransition();
                    }
                    this.currentAnimation = animatorSetOnCustomTransitionAnimation;
                } else {
                    this.containerView.setAlpha(0.0f);
                    if (z5) {
                        this.containerView.setTranslationX(0.0f);
                        this.containerView.setScaleX(0.9f);
                        this.containerView.setScaleY(0.9f);
                    } else {
                        this.containerView.setTranslationX(48.0f);
                        this.containerView.setScaleX(1.0f);
                        this.containerView.setScaleY(1.0f);
                    }
                    if (this.containerView.isKeyboardVisible || this.containerViewBack.isKeyboardVisible) {
                        if (baseFragment != null && !z5) {
                            baseFragment.saveKeyboardPositionBeforeTransition();
                        }
                        final BaseFragment baseFragment4 = baseFragment;
                        this.waitingForKeyboardCloseRunnable = new Runnable() {
                            @Override
                            public void run() {
                                if (ActionBarLayout.this.waitingForKeyboardCloseRunnable != this) {
                                    return;
                                }
                                ActionBarLayout.this.waitingForKeyboardCloseRunnable = null;
                                if (!z7) {
                                    if (ActionBarLayout.this.delayedOpenAnimationRunnable != null) {
                                        AndroidUtilities.cancelRunOnUIThread(ActionBarLayout.this.delayedOpenAnimationRunnable);
                                        if (ActionBarLayout.this.delayedAnimationResumed) {
                                            ActionBarLayout.this.delayedOpenAnimationRunnable.run();
                                            return;
                                        } else {
                                            AndroidUtilities.runOnUIThread(ActionBarLayout.this.delayedOpenAnimationRunnable, 200L);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                BaseFragment baseFragment5 = baseFragment4;
                                if (baseFragment5 != null) {
                                    baseFragment5.onTransitionAnimationStart(false, false);
                                }
                                baseFragment2.onTransitionAnimationStart(true, false);
                                ActionBarLayout.this.startLayoutAnimation(true, true, z5);
                            }
                        };
                        if (baseFragment2.needDelayOpenAnimation()) {
                            this.delayedOpenAnimationRunnable = new Runnable() {
                                @Override
                                public void run() {
                                    if (ActionBarLayout.this.delayedOpenAnimationRunnable != this) {
                                        return;
                                    }
                                    ActionBarLayout.this.delayedOpenAnimationRunnable = null;
                                    BaseFragment baseFragment5 = baseFragment;
                                    if (baseFragment5 != null) {
                                        baseFragment5.onTransitionAnimationStart(false, false);
                                    }
                                    baseFragment2.onTransitionAnimationStart(true, false);
                                    ActionBarLayout.this.startLayoutAnimation(true, true, z5);
                                }
                            };
                        }
                        AndroidUtilities.runOnUIThread(this.waitingForKeyboardCloseRunnable, 250L);
                    } else if (baseFragment2.needDelayOpenAnimation()) {
                        Runnable runnable2 = new Runnable() {
                            @Override
                            public void run() {
                                if (ActionBarLayout.this.delayedOpenAnimationRunnable != this) {
                                    return;
                                }
                                ActionBarLayout.this.delayedOpenAnimationRunnable = null;
                                baseFragment2.onTransitionAnimationStart(true, false);
                                ActionBarLayout.this.startLayoutAnimation(true, true, z5);
                            }
                        };
                        this.delayedOpenAnimationRunnable = runnable2;
                        AndroidUtilities.runOnUIThread(runnable2, 200L);
                    } else {
                        startLayoutAnimation(true, true, z5);
                        return true;
                    }
                }
            }
            return true;
        }
        View view3 = this.backgroundView;
        if (view3 != null) {
            view3.setAlpha(1.0f);
            this.backgroundView.setVisibility(0);
        }
        if (baseFragment != null) {
            baseFragment.onTransitionAnimationStart(false, false);
            baseFragment.onTransitionAnimationEnd(false, false);
        }
        baseFragment2.onTransitionAnimationStart(true, false);
        baseFragment2.onTransitionAnimationEnd(true, false);
        baseFragment2.onBecomeFullyVisible();
        return true;
    }

    public static void lambda$presentFragment$0(BaseFragment baseFragment, BaseFragment baseFragment2) {
        if (baseFragment != null) {
            baseFragment.onTransitionAnimationEnd(false, false);
        }
        baseFragment2.onTransitionAnimationEnd(true, false);
        baseFragment2.onBecomeFullyVisible();
    }

    public void lambda$presentFragment$1(boolean z, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, boolean z2, BaseFragment baseFragment, BaseFragment baseFragment2) {
        if (z) {
            this.inPreviewMode = true;
            this.previewMenu = actionBarPopupWindowLayout;
            this.transitionAnimationPreviewMode = false;
            this.containerView.setScaleX(1.0f);
            this.containerView.setScaleY(1.0f);
        } else {
            presentFragmentInternalRemoveOld(z2, baseFragment);
            this.containerView.setTranslationX(0.0f);
        }
        if (baseFragment != null) {
            baseFragment.onTransitionAnimationEnd(false, false);
        }
        baseFragment2.onTransitionAnimationEnd(true, false);
        baseFragment2.onBecomeFullyVisible();
    }

    public void lambda$presentFragment$2() throws IOException {
        onAnimationEndCheck(false);
    }

    private boolean shouldOpenFragmentOverlay(Dialog dialog) {
        return dialog != null && dialog.isShowing() && ((dialog instanceof ChatAttachAlert) || (dialog instanceof BotWebViewSheet));
    }

    @Override
    public List<BaseFragment> getFragmentStack() {
        return this.fragmentsStack;
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.onFragmentStackChangedListener = runnable;
    }

    private void onFragmentStackChanged(String str) {
        Runnable runnable = this.onFragmentStackChangedListener;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        checkBlackScreen(str);
    }

    @Override
    public boolean addFragmentToStack(BaseFragment baseFragment, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate = this.delegate;
        if ((iNavigationLayoutDelegate != null && !iNavigationLayoutDelegate.needAddFragmentToStack(baseFragment, this)) || !baseFragment.onFragmentCreate() || this.fragmentsStack.contains(baseFragment)) {
            return false;
        }
        baseFragment.setParentLayout(this);
        if (i == -1 || i == -2) {
            if (!this.fragmentsStack.isEmpty()) {
                List list = this.fragmentsStack;
                BaseFragment baseFragment2 = (BaseFragment) list.get(list.size() - 1);
                baseFragment2.onPause();
                ActionBar actionBar = baseFragment2.actionBar;
                if (actionBar != null && actionBar.shouldAddToContainer() && (viewGroup2 = (ViewGroup) baseFragment2.actionBar.getParent()) != null) {
                    viewGroup2.removeView(baseFragment2.actionBar);
                }
                View view = baseFragment2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    baseFragment2.onRemoveFromParent();
                    viewGroup.removeView(baseFragment2.fragmentView);
                }
                baseFragment2.detachSheets();
            }
            this.fragmentsStack.add(baseFragment);
            if (i != -2) {
                attachView(baseFragment);
                baseFragment.onResume();
                baseFragment.onTransitionAnimationEnd(false, true);
                baseFragment.onTransitionAnimationEnd(true, true);
                baseFragment.onBecomeFullyVisible();
            }
            onFragmentStackChanged("addFragmentToStack " + i);
        } else {
            if (i == -3) {
                attachViewTo(baseFragment, 0);
                i = 0;
            }
            this.fragmentsStack.add(i, baseFragment);
            onFragmentStackChanged("addFragmentToStack");
        }
        if (!this.useAlphaAnimations) {
            setVisibility(0);
            View view2 = this.backgroundView;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        return true;
    }

    private void attachView(BaseFragment baseFragment) {
        View viewCreateView = baseFragment.fragmentView;
        if (viewCreateView == null) {
            viewCreateView = baseFragment.createView(this.parentActivity);
            if (viewCreateView != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
                ViewCompat.setOnApplyWindowInsetsListener(viewCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment));
                this.containerView.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) viewCreateView.getParent();
            if (viewGroup != null) {
                baseFragment.onRemoveFromParent();
                viewGroup.removeView(viewCreateView);
            }
        }
        if (!baseFragment.hasOwnBackground && viewCreateView.getBackground() == null) {
            viewCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }
        this.containerView.addView(viewCreateView, LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.setShouldHandleBottomInsets(baseFragment.isSupportEdgeToEdge());
        this.containerView.setDrawNavigationBar(baseFragment.drawEdgeNavigationBar());
        ActionBar actionBar = baseFragment.actionBar;
        if (actionBar != null && actionBar.shouldAddToContainer()) {
            if (this.removeActionBarExtraHeight) {
                baseFragment.actionBar.setOccupyStatusBar(false);
            }
            ViewGroup viewGroup2 = (ViewGroup) baseFragment.actionBar.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(baseFragment.actionBar);
            }
            this.containerView.addView(baseFragment.actionBar);
        }
        baseFragment.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
        baseFragment.attachSheets(this.containerView);
    }

    private void attachViewTo(BaseFragment baseFragment, int i) {
        View viewCreateView = baseFragment.fragmentView;
        if (viewCreateView == null) {
            viewCreateView = baseFragment.createView(this.parentActivity);
            if (viewCreateView != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
                ViewCompat.setOnApplyWindowInsetsListener(viewCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment));
                this.containerView.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) viewCreateView.getParent();
            if (viewGroup != null) {
                baseFragment.onRemoveFromParent();
                viewGroup.removeView(viewCreateView);
            }
        }
        if (!baseFragment.hasOwnBackground && viewCreateView.getBackground() == null) {
            viewCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }
        LayoutContainer layoutContainer = this.containerView;
        layoutContainer.addView(viewCreateView, Utilities.clamp(i, layoutContainer.getChildCount(), 0), LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.setShouldHandleBottomInsets(baseFragment.isSupportEdgeToEdge());
        this.containerView.setDrawNavigationBar(baseFragment.drawEdgeNavigationBar());
        ActionBar actionBar = baseFragment.actionBar;
        if (actionBar != null && actionBar.shouldAddToContainer()) {
            if (this.removeActionBarExtraHeight) {
                baseFragment.actionBar.setOccupyStatusBar(false);
            }
            ViewGroup viewGroup2 = (ViewGroup) baseFragment.actionBar.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(baseFragment.actionBar);
            }
            this.containerView.addView(baseFragment.actionBar);
        }
        baseFragment.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
        baseFragment.attachSheets(this.containerView);
    }

    private void closeLastFragmentInternalRemoveOld(BaseFragment baseFragment) {
        baseFragment.finishing = true;
        baseFragment.onPause();
        baseFragment.onFragmentDestroy();
        baseFragment.setParentLayout(null);
        this.fragmentsStack.remove(baseFragment);
        this.containerViewBack.setVisibility(4);
        this.containerViewBack.setTranslationY(0.0f);
        bringChildToFront(this.containerView);
        LayoutContainer layoutContainer = this.sheetContainer;
        if (layoutContainer != null) {
            bringChildToFront(layoutContainer);
        }
        onFragmentStackChanged("closeLastFragmentInternalRemoveOld");
    }

    @Override
    public void movePreviewFragment(float f) {
        if (this.inPreviewMode && this.previewMenu == null && !this.transitionAnimationPreviewMode) {
            float translationY = this.containerView.getTranslationY();
            float f2 = -f;
            if (f2 > 0.0f) {
                f2 = 0.0f;
            } else if (f2 < (-AndroidUtilities.dp(60.0f))) {
                expandPreviewFragment();
                f2 = 0.0f;
            }
            if (translationY != f2) {
                this.containerView.setTranslationY(f2);
                invalidate();
            }
        }
    }

    @Override
    public void expandPreviewFragment() {
        boolean z = true;
        this.previewOpenAnimationInProgress = true;
        this.inPreviewMode = false;
        List list = this.fragmentsStack;
        BaseFragment baseFragment = (BaseFragment) list.get(list.size() - 2);
        List list2 = this.fragmentsStack;
        final BaseFragment baseFragment2 = (BaseFragment) list2.get(list2.size() - 1);
        baseFragment2.fragmentView.setOutlineProvider(null);
        baseFragment2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) baseFragment2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        baseFragment2.fragmentView.setLayoutParams(layoutParams);
        presentFragmentInternalRemoveOld(false, baseFragment);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(baseFragment2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(baseFragment2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new CubicBezierInterpolator(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ActionBarLayout.this.previewOpenAnimationInProgress = false;
                baseFragment2.onPreviewOpenAnimationEnd();
            }
        });
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.containerView.setShouldHandleBottomInsets(baseFragment2.isSupportEdgeToEdge());
        this.containerView.setDrawNavigationBar(baseFragment2.drawEdgeNavigationBar());
        baseFragment2.setInPreviewMode(false);
        baseFragment2.setInMenuMode(false);
        try {
            Window window = this.parentActivity.getWindow();
            if (Theme.getColor(Theme.key_actionBarDefault) != -1 && (!baseFragment2.hasForceLightStatusBar() || Theme.getCurrentTheme().isDark())) {
                z = false;
            }
            AndroidUtilities.setLightStatusBar(window, z, baseFragment2.hasForceLightStatusBar());
        } catch (Exception unused2) {
        }
    }

    @Override
    public void finishPreviewFragment() {
        if (this.inPreviewMode || this.transitionAnimationPreviewMode) {
            Runnable runnable = this.delayedOpenAnimationRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.delayedOpenAnimationRunnable = null;
            }
            closeLastFragment(true);
        }
    }

    @Override
    public void closeLastFragment(boolean z) {
        closeLastFragment(z, false);
    }

    public void closeLastFragment(boolean z, boolean z2) {
        final BaseFragment baseFragment;
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate = this.delegate;
            if ((iNavigationLayoutDelegate != null && !iNavigationLayoutDelegate.needCloseLastFragment(this)) || checkTransitionAnimation() || this.fragmentsStack.isEmpty()) {
                return;
            }
            if (this.parentActivity.getCurrentFocus() != null) {
                AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            boolean z3 = !z2 && (this.inPreviewMode || this.transitionAnimationPreviewMode || (z && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)));
            List list = this.fragmentsStack;
            final BaseFragment baseFragment2 = (BaseFragment) list.get(list.size() - 1);
            AnimatorSet animatorSetOnCustomTransitionAnimation = null;
            if (this.fragmentsStack.size() > 1) {
                List list2 = this.fragmentsStack;
                baseFragment = (BaseFragment) list2.get(list2.size() - 2);
            } else {
                baseFragment = null;
            }
            if (baseFragment != null) {
                AndroidUtilities.setLightStatusBar(this.parentActivity.getWindow(), Theme.getColor(Theme.key_actionBarDefault) == -1 || (baseFragment.hasForceLightStatusBar() && !Theme.getCurrentTheme().isDark()), baseFragment.hasForceLightStatusBar());
                LayoutContainer layoutContainer = this.containerView;
                this.containerView = this.containerViewBack;
                this.containerViewBack = layoutContainer;
                baseFragment.setParentLayout(this);
                View viewCreateView = baseFragment.fragmentView;
                if (viewCreateView == null && (viewCreateView = baseFragment.createView(this.parentActivity)) != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
                    ViewCompat.setOnApplyWindowInsetsListener(viewCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment));
                    this.containerView.invalidate();
                }
                if (!this.inPreviewMode) {
                    this.containerView.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) viewCreateView.getParent();
                    if (viewGroup != null) {
                        baseFragment.onRemoveFromParent();
                        try {
                            viewGroup.removeView(viewCreateView);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    this.containerView.addView(viewCreateView);
                    this.containerView.setShouldHandleBottomInsets(baseFragment.isSupportEdgeToEdge());
                    this.containerView.setDrawNavigationBar(baseFragment.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewCreateView.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    viewCreateView.setLayoutParams(layoutParams);
                    ActionBar actionBar = baseFragment.actionBar;
                    if (actionBar != null && actionBar.shouldAddToContainer()) {
                        if (this.removeActionBarExtraHeight) {
                            baseFragment.actionBar.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(baseFragment.actionBar);
                        this.containerView.addView(baseFragment.actionBar);
                    }
                    baseFragment.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
                    baseFragment.attachSheets(this.containerView);
                }
                this.newFragment = baseFragment;
                this.oldFragment = baseFragment2;
                baseFragment.onTransitionAnimationStart(true, true);
                baseFragment2.onTransitionAnimationStart(false, true);
                baseFragment.onResume();
                if (this.themeAnimatorSet != null) {
                    this.presentingFragmentDescriptions = baseFragment.getThemeDescriptions();
                }
                this.currentActionBar = baseFragment.actionBar;
                if (!baseFragment.hasOwnBackground && viewCreateView.getBackground() == null) {
                    viewCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                }
                if (z3) {
                    this.transitionAnimationStartTime = System.currentTimeMillis();
                    this.transitionAnimationInProgress = true;
                    this.layoutToIgnore = this.containerView;
                    baseFragment2.setRemovingFromStack(true);
                    this.onCloseAnimationEndRunnable = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$closeLastFragment$3(baseFragment2, baseFragment);
                        }
                    };
                    if (!this.inPreviewMode && !this.transitionAnimationPreviewMode) {
                        animatorSetOnCustomTransitionAnimation = baseFragment2.onCustomTransitionAnimation(false, new Runnable() {
                            @Override
                            public final void run() throws IOException {
                                this.f$0.lambda$closeLastFragment$4();
                            }
                        });
                    }
                    if (animatorSetOnCustomTransitionAnimation == null) {
                        if (!this.inPreviewMode && (this.containerView.isKeyboardVisible || this.containerViewBack.isKeyboardVisible)) {
                            Runnable runnable = new Runnable() {
                                @Override
                                public void run() {
                                    if (ActionBarLayout.this.waitingForKeyboardCloseRunnable != this) {
                                        return;
                                    }
                                    ActionBarLayout.this.waitingForKeyboardCloseRunnable = null;
                                    ActionBarLayout.this.startLayoutAnimation(false, true, false);
                                }
                            };
                            this.waitingForKeyboardCloseRunnable = runnable;
                            AndroidUtilities.runOnUIThread(runnable, 200L);
                        } else {
                            startLayoutAnimation(false, true, this.inPreviewMode || this.transitionAnimationPreviewMode);
                        }
                    } else {
                        this.currentAnimation = animatorSetOnCustomTransitionAnimation;
                        if (Bulletin.getVisibleBulletin() != null && Bulletin.getVisibleBulletin().isShowing()) {
                            Bulletin.getVisibleBulletin().hide();
                        }
                    }
                    onFragmentStackChanged("closeLastFragment");
                } else {
                    closeLastFragmentInternalRemoveOld(baseFragment2);
                    baseFragment2.onTransitionAnimationEnd(false, true);
                    baseFragment.onTransitionAnimationEnd(true, true);
                    baseFragment.onBecomeFullyVisible();
                }
            } else if (this.useAlphaAnimations && !z2) {
                this.transitionAnimationStartTime = System.currentTimeMillis();
                this.transitionAnimationInProgress = true;
                this.layoutToIgnore = this.containerView;
                this.onCloseAnimationEndRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$closeLastFragment$5(baseFragment2);
                    }
                };
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 1.0f, 0.0f));
                View view = this.backgroundView;
                if (view != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.0f));
                }
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentAnimation = animatorSet;
                animatorSet.playTogether(arrayList);
                this.currentAnimation.setInterpolator(this.accelerateDecelerateInterpolator);
                this.currentAnimation.setDuration(200L);
                this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        ActionBarLayout.this.transitionAnimationStartTime = System.currentTimeMillis();
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) throws IOException {
                        ActionBarLayout.this.onAnimationEndCheck(false);
                    }
                });
                this.currentAnimation.start();
            } else {
                removeFragmentFromStackInternal(baseFragment2, false);
                setVisibility(8);
                View view2 = this.backgroundView;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            baseFragment2.onFragmentClosed();
        }
    }

    public void lambda$closeLastFragment$3(BaseFragment baseFragment, BaseFragment baseFragment2) {
        ViewGroup viewGroup;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.previewMenu;
        if (actionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindowLayout.getParent()) != null) {
            viewGroup.removeView(this.previewMenu);
        }
        if (this.inPreviewMode || this.transitionAnimationPreviewMode) {
            this.containerViewBack.setScaleX(1.0f);
            this.containerViewBack.setScaleY(1.0f);
            this.inPreviewMode = false;
            this.previewMenu = null;
            this.transitionAnimationPreviewMode = false;
        } else {
            this.containerViewBack.setTranslationX(0.0f);
        }
        closeLastFragmentInternalRemoveOld(baseFragment);
        baseFragment.setRemovingFromStack(false);
        baseFragment.onTransitionAnimationEnd(false, true);
        baseFragment2.onTransitionAnimationEnd(true, true);
        baseFragment2.onBecomeFullyVisible();
    }

    public void lambda$closeLastFragment$4() throws IOException {
        onAnimationEndCheck(false);
    }

    public void lambda$closeLastFragment$5(BaseFragment baseFragment) {
        removeFragmentFromStackInternal(baseFragment, false);
        setVisibility(8);
        View view = this.backgroundView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void bringToFront(int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.fragmentsStack.isEmpty()) {
            return;
        }
        if (this.fragmentsStack.isEmpty() || this.fragmentsStack.size() - 1 != i || ((BaseFragment) this.fragmentsStack.get(i)).fragmentView == null) {
            for (int i2 = 0; i2 < i; i2++) {
                BaseFragment baseFragment = (BaseFragment) this.fragmentsStack.get(i2);
                ActionBar actionBar = baseFragment.actionBar;
                if (actionBar != null && actionBar.shouldAddToContainer() && (viewGroup2 = (ViewGroup) baseFragment.actionBar.getParent()) != null) {
                    viewGroup2.removeView(baseFragment.actionBar);
                }
                View view = baseFragment.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    baseFragment.onPause();
                    baseFragment.onRemoveFromParent();
                    viewGroup.removeView(baseFragment.fragmentView);
                }
            }
            BaseFragment baseFragment2 = (BaseFragment) this.fragmentsStack.get(i);
            baseFragment2.setParentLayout(this);
            View viewCreateView = baseFragment2.fragmentView;
            if (viewCreateView == null) {
                viewCreateView = baseFragment2.createView(this.parentActivity);
                if (viewCreateView != null && baseFragment2.isSupportEdgeToEdge() && baseFragment2.drawEdgeNavigationBar()) {
                    ViewCompat.setOnApplyWindowInsetsListener(viewCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment2));
                    this.containerView.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) viewCreateView.getParent();
                if (viewGroup3 != null) {
                    baseFragment2.onRemoveFromParent();
                    viewGroup3.removeView(viewCreateView);
                }
            }
            this.containerView.addView(viewCreateView, LayoutHelper.createFrame(-1, -1.0f));
            this.containerView.setShouldHandleBottomInsets(baseFragment2.isSupportEdgeToEdge());
            this.containerView.setDrawNavigationBar(baseFragment2.drawEdgeNavigationBar());
            ActionBar actionBar2 = baseFragment2.actionBar;
            if (actionBar2 != null && actionBar2.shouldAddToContainer()) {
                if (this.removeActionBarExtraHeight) {
                    baseFragment2.actionBar.setOccupyStatusBar(false);
                }
                AndroidUtilities.removeFromParent(baseFragment2.actionBar);
                this.containerView.addView(baseFragment2.actionBar);
            }
            baseFragment2.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
            baseFragment2.attachSheets(this.containerView);
            baseFragment2.onResume();
            baseFragment2.onBecomeFullyVisible();
            this.currentActionBar = baseFragment2.actionBar;
            if (baseFragment2.hasOwnBackground || viewCreateView.getBackground() != null) {
                return;
            }
            viewCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }
    }

    @Override
    public void showLastFragment() {
        if (this.fragmentsStack.isEmpty()) {
            return;
        }
        bringToFront(this.fragmentsStack.size() - 1);
    }

    private void removeFragmentFromStackInternal(BaseFragment baseFragment, boolean z) {
        if (this.fragmentsStack.contains(baseFragment)) {
            if (z) {
                List list = this.fragmentsStack;
                if (list.get(list.size() - 1) == baseFragment) {
                    baseFragment.finishFragment();
                    return;
                }
            }
            List list2 = this.fragmentsStack;
            if (list2.get(list2.size() - 1) == baseFragment && this.fragmentsStack.size() > 1) {
                baseFragment.finishFragment(false);
                return;
            }
            baseFragment.onPause();
            baseFragment.onFragmentDestroy();
            baseFragment.setParentLayout(null);
            this.fragmentsStack.remove(baseFragment);
            onFragmentStackChanged("removeFragmentFromStackInternal " + z);
        }
    }

    @Override
    public void removeFragmentFromStack(org.telegram.ui.ActionBar.BaseFragment r4, boolean r5) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.removeFragmentFromStack(org.telegram.ui.ActionBar.BaseFragment, boolean):void");
    }

    @Override
    public void removeAllFragments() {
        while (this.fragmentsStack.size() > 0) {
            removeFragmentFromStackInternal((BaseFragment) this.fragmentsStack.get(0), false);
        }
        View view = this.backgroundView;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$removeAllFragments$6();
                }
            }).start();
        }
    }

    public void lambda$removeAllFragments$6() {
        this.backgroundView.setVisibility(8);
    }

    public void setThemeAnimationValue(float f) throws NoSuchFieldException, IOException, SecurityException {
        this.themeAnimationValue = f;
        int size = this.themeAnimatorDescriptions.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.themeAnimatorDescriptions.get(i);
            int[] iArr = (int[]) this.animateStartColors.get(i);
            int[] iArr2 = (int[]) this.animateEndColors.get(i);
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                int iRed = Color.red(iArr2[i2]);
                int iGreen = Color.green(iArr2[i2]);
                int iBlue = Color.blue(iArr2[i2]);
                int iAlpha = Color.alpha(iArr2[i2]);
                int iRed2 = Color.red(iArr[i2]);
                int iGreen2 = Color.green(iArr[i2]);
                int iBlue2 = Color.blue(iArr[i2]);
                int i3 = size;
                int iArgb = Color.argb(Math.min(255, (int) (Color.alpha(iArr[i2]) + ((iAlpha - r2) * f))), Math.min(255, (int) (iRed2 + ((iRed - iRed2) * f))), Math.min(255, (int) (iGreen2 + ((iGreen - iGreen2) * f))), Math.min(255, (int) (iBlue2 + ((iBlue - iBlue2) * f))));
                ThemeDescription themeDescription = (ThemeDescription) arrayList.get(i2);
                themeDescription.setAnimatedColor(iArgb);
                themeDescription.setColor(iArgb, false, false);
                i2++;
                iArr = iArr;
                size = i3;
            }
        }
        int size3 = this.themeAnimatorDelegate.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = (ThemeDescription.ThemeDescriptionDelegate) this.themeAnimatorDelegate.get(i4);
            if (themeDescriptionDelegate != null) {
                themeDescriptionDelegate.didSetColor();
                themeDescriptionDelegate.onAnimationProgress(f);
            }
        }
        ArrayList arrayList2 = this.presentingFragmentDescriptions;
        if (arrayList2 != null) {
            int size4 = arrayList2.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ThemeDescription themeDescription2 = (ThemeDescription) this.presentingFragmentDescriptions.get(i5);
                themeDescription2.setColor(Theme.getColor(themeDescription2.getCurrentKey(), themeDescription2.resourcesProvider), false, false);
            }
        }
        INavigationLayout.ThemeAnimationSettings.onAnimationProgress onanimationprogress = this.animationProgressListener;
        if (onanimationprogress != null) {
            onanimationprogress.setProgress(f);
        }
        INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate = this.delegate;
        if (iNavigationLayoutDelegate != null) {
            iNavigationLayoutDelegate.onThemeProgress(f);
        }
        globallyUpdateColors(this);
    }

    @Override
    public float getThemeAnimationValue() {
        return this.themeAnimationValue;
    }

    private void addStartDescriptions(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        this.themeAnimatorDescriptions.add(arrayList);
        int[] iArr = new int[arrayList.size()];
        this.animateStartColors.add(iArr);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ThemeDescription themeDescription = (ThemeDescription) arrayList.get(i);
            iArr[i] = themeDescription.getSetColor();
            ThemeDescription.ThemeDescriptionDelegate delegateDisabled = themeDescription.setDelegateDisabled();
            if (delegateDisabled != null && !this.themeAnimatorDelegate.contains(delegateDisabled)) {
                this.themeAnimatorDelegate.add(delegateDisabled);
            }
        }
    }

    private void addEndDescriptions(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int[] iArr = new int[arrayList.size()];
        this.animateEndColors.add(iArr);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = ((ThemeDescription) arrayList.get(i)).getSetColor();
        }
    }

    @Override
    public void animateThemedValues(final INavigationLayout.ThemeAnimationSettings themeAnimationSettings, final Runnable runnable) throws IOException {
        Theme.ThemeInfo themeInfo;
        if (this.transitionAnimationInProgress || this.startedTracking) {
            this.animateThemeAfterAnimation = true;
            this.animateSetThemeAfterAnimation = themeAnimationSettings.theme;
            this.animateSetThemeNightAfterAnimation = themeAnimationSettings.nightTheme;
            this.animateSetThemeAccentIdAfterAnimation = themeAnimationSettings.accentId;
            this.animateSetThemeAfterAnimationApply = themeAnimationSettings.applyTrulyTheme;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.themeAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.themeAnimatorSet = null;
        }
        final int size = themeAnimationSettings.onlyTopFragment ? 1 : this.fragmentsStack.size();
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() throws NoSuchFieldException, IOException, SecurityException {
                this.f$0.lambda$animateThemedValues$7(size, themeAnimationSettings, runnable);
            }
        };
        if (size >= 1 && themeAnimationSettings.applyTheme && themeAnimationSettings.applyTrulyTheme) {
            int i = themeAnimationSettings.accentId;
            if (i != -1 && (themeInfo = themeAnimationSettings.theme) != null) {
                themeInfo.setCurrentAccentId(i);
                Theme.saveThemeAccents(themeAnimationSettings.theme, true, false, true, false);
            }
            if (runnable == null) {
                Theme.applyTheme(themeAnimationSettings.theme, themeAnimationSettings.nightTheme);
                runnable2.run();
                return;
            } else {
                Theme.applyThemeInBackground(themeAnimationSettings.theme, themeAnimationSettings.nightTheme, new Runnable() {
                    @Override
                    public final void run() {
                        AndroidUtilities.runOnUIThread(runnable2);
                    }
                });
                return;
            }
        }
        runnable2.run();
    }

    public void lambda$animateThemedValues$7(int i, final INavigationLayout.ThemeAnimationSettings themeAnimationSettings, Runnable runnable) throws NoSuchFieldException, IOException, SecurityException {
        BaseFragment lastFragment;
        Runnable runnable2;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                lastFragment = getLastFragment();
            } else if ((this.inPreviewMode || this.transitionAnimationPreviewMode) && this.fragmentsStack.size() > 1) {
                List list = this.fragmentsStack;
                lastFragment = (BaseFragment) list.get(list.size() - 2);
            }
            if (lastFragment != null) {
                if (themeAnimationSettings.resourcesProvider != null) {
                    if (this.messageDrawableOutStart == null) {
                        Theme.MessageDrawable messageDrawable = new Theme.MessageDrawable(0, true, false, this.startColorsProvider);
                        this.messageDrawableOutStart = messageDrawable;
                        messageDrawable.isCrossfadeBackground = true;
                        Theme.MessageDrawable messageDrawable2 = new Theme.MessageDrawable(1, true, false, this.startColorsProvider);
                        this.messageDrawableOutMediaStart = messageDrawable2;
                        messageDrawable2.isCrossfadeBackground = true;
                    }
                    this.startColorsProvider.saveColors(themeAnimationSettings.resourcesProvider);
                }
                ArrayList<ThemeDescription> themeDescriptions = lastFragment.getThemeDescriptions();
                addStartDescriptions(themeDescriptions);
                Dialog dialog = lastFragment.visibleDialog;
                if (dialog instanceof BottomSheet) {
                    addStartDescriptions(((BottomSheet) dialog).getThemeDescriptions());
                } else if (dialog instanceof AlertDialog) {
                    addStartDescriptions(((AlertDialog) dialog).getThemeDescriptions());
                }
                if (i2 == 0 && (runnable2 = themeAnimationSettings.afterStartDescriptionsAddedRunnable) != null) {
                    runnable2.run();
                }
                addEndDescriptions(themeDescriptions);
                Dialog dialog2 = lastFragment.visibleDialog;
                if (dialog2 instanceof BottomSheet) {
                    addEndDescriptions(((BottomSheet) dialog2).getThemeDescriptions());
                } else if (dialog2 instanceof AlertDialog) {
                    addEndDescriptions(((AlertDialog) dialog2).getThemeDescriptions());
                }
                z = true;
            }
        }
        if (z) {
            if (!themeAnimationSettings.onlyTopFragment) {
                int size = this.fragmentsStack.size() - ((this.inPreviewMode || this.transitionAnimationPreviewMode) ? 2 : 1);
                for (int i3 = 0; i3 < size; i3++) {
                    BaseFragment baseFragment = (BaseFragment) this.fragmentsStack.get(i3);
                    baseFragment.clearViews();
                    baseFragment.setParentLayout(this);
                }
            }
            if (themeAnimationSettings.instant) {
                setThemeAnimationValue(1.0f);
                this.themeAnimatorDescriptions.clear();
                this.animateStartColors.clear();
                this.animateEndColors.clear();
                this.themeAnimatorDelegate.clear();
                this.presentingFragmentDescriptions = null;
                this.animationProgressListener = null;
                Runnable runnable3 = themeAnimationSettings.afterAnimationRunnable;
                if (runnable3 != null) {
                    runnable3.run();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            Theme.setAnimatingColor(true);
            setThemeAnimationValue(0.0f);
            Runnable runnable4 = themeAnimationSettings.beforeAnimationRunnable;
            if (runnable4 != null) {
                runnable4.run();
            }
            INavigationLayout.ThemeAnimationSettings.onAnimationProgress onanimationprogress = themeAnimationSettings.animationProgress;
            this.animationProgressListener = onanimationprogress;
            if (onanimationprogress != null) {
                onanimationprogress.setProgress(0.0f);
            }
            this.notificationsLocker.lock();
            AnimatorSet animatorSet = new AnimatorSet();
            this.themeAnimatorSet = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ActionBarLayout.this.notificationsLocker.unlock();
                    if (animator.equals(ActionBarLayout.this.themeAnimatorSet)) {
                        ActionBarLayout.this.themeAnimatorDescriptions.clear();
                        ActionBarLayout.this.animateStartColors.clear();
                        ActionBarLayout.this.animateEndColors.clear();
                        ActionBarLayout.this.themeAnimatorDelegate.clear();
                        Theme.setAnimatingColor(false);
                        ActionBarLayout.this.presentingFragmentDescriptions = null;
                        ActionBarLayout actionBarLayout = ActionBarLayout.this;
                        actionBarLayout.animationProgressListener = null;
                        actionBarLayout.themeAnimatorSet = null;
                        Runnable runnable5 = themeAnimationSettings.afterAnimationRunnable;
                        if (runnable5 != null) {
                            runnable5.run();
                        }
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (animator.equals(ActionBarLayout.this.themeAnimatorSet)) {
                        ActionBarLayout.this.themeAnimatorDescriptions.clear();
                        ActionBarLayout.this.animateStartColors.clear();
                        ActionBarLayout.this.animateEndColors.clear();
                        ActionBarLayout.this.themeAnimatorDelegate.clear();
                        Theme.setAnimatingColor(false);
                        ActionBarLayout.this.presentingFragmentDescriptions = null;
                        ActionBarLayout actionBarLayout = ActionBarLayout.this;
                        actionBarLayout.animationProgressListener = null;
                        actionBarLayout.themeAnimatorSet = null;
                        Runnable runnable5 = themeAnimationSettings.afterAnimationRunnable;
                        if (runnable5 != null) {
                            runnable5.run();
                        }
                    }
                }
            });
            this.themeAnimatorSet.playTogether(ObjectAnimator.ofFloat(this, "themeAnimationValue", 0.0f, 1.0f));
            this.themeAnimatorSet.setDuration(themeAnimationSettings.duration);
            this.themeAnimatorSet.start();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    private void globallyUpdateColors(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Theme.Colorable) {
                ((Theme.Colorable) childAt).updateColors();
            }
            if (childAt instanceof ViewGroup) {
                globallyUpdateColors((ViewGroup) childAt);
            }
        }
    }

    public void rebuildLogout() {
        this.containerView.removeAllViews();
        this.containerViewBack.removeAllViews();
        this.currentActionBar = null;
        this.newFragment = null;
        this.oldFragment = null;
    }

    @Override
    public void rebuildAllFragmentViews(boolean z, boolean z2) {
        if (this.transitionAnimationInProgress || this.startedTracking) {
            this.rebuildAfterAnimation = true;
            this.rebuildLastAfterAnimation = z;
            this.showLastAfterAnimation = z2;
            return;
        }
        int size = this.fragmentsStack.size();
        if (!z) {
            size--;
        }
        if (this.inPreviewMode) {
            size--;
        }
        for (int i = 0; i < size; i++) {
            ((BaseFragment) this.fragmentsStack.get(i)).clearViews();
            ((BaseFragment) this.fragmentsStack.get(i)).setParentLayout(this);
        }
        INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate = this.delegate;
        if (iNavigationLayoutDelegate != null) {
            iNavigationLayoutDelegate.onRebuildAllFragments(this, z);
        }
        if (z2) {
            showLastFragment();
        }
    }

    @Override
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        ActionBar actionBar;
        if (i == 82 && !checkTransitionAnimation() && !this.startedTracking && (actionBar = this.currentActionBar) != null) {
            actionBar.onMenuButtonPressed();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onActionModeStarted(Object obj) {
        ActionBar actionBar = this.currentActionBar;
        if (actionBar != null) {
            actionBar.setVisibility(8);
        }
        this.inActionMode = true;
    }

    public void onActionModeFinished(Object obj) {
        ActionBar actionBar = this.currentActionBar;
        if (actionBar != null) {
            actionBar.setVisibility(0);
        }
        this.inActionMode = false;
    }

    private void onCloseAnimationEnd() throws IOException {
        if (!this.transitionAnimationInProgress || this.onCloseAnimationEndRunnable == null) {
            return;
        }
        AnimatorSet animatorSet = this.currentAnimation;
        if (animatorSet != null) {
            this.currentAnimation = null;
            animatorSet.cancel();
        }
        this.transitionAnimationInProgress = false;
        this.layoutToIgnore = null;
        this.transitionAnimationPreviewMode = false;
        this.transitionAnimationStartTime = 0L;
        this.newFragment = null;
        this.oldFragment = null;
        Runnable runnable = this.onCloseAnimationEndRunnable;
        this.onCloseAnimationEndRunnable = null;
        if (runnable != null) {
            runnable.run();
        }
        checkNeedRebuild();
        checkNeedRebuild();
    }

    private void checkNeedRebuild() throws IOException {
        if (this.rebuildAfterAnimation) {
            rebuildAllFragmentViews(this.rebuildLastAfterAnimation, this.showLastAfterAnimation);
            this.rebuildAfterAnimation = false;
        } else if (this.animateThemeAfterAnimation) {
            INavigationLayout.ThemeAnimationSettings themeAnimationSettings = new INavigationLayout.ThemeAnimationSettings(this.animateSetThemeAfterAnimation, this.animateSetThemeAccentIdAfterAnimation, this.animateSetThemeNightAfterAnimation, false);
            boolean z = this.animateSetThemeAfterAnimationApply;
            if (!z) {
                themeAnimationSettings.applyTrulyTheme = z;
                themeAnimationSettings.applyTheme = z;
            }
            animateThemedValues(themeAnimationSettings, null);
            this.animateSetThemeAfterAnimation = null;
            this.animateThemeAfterAnimation = false;
        }
    }

    private void onOpenAnimationEnd() throws IOException {
        Runnable runnable;
        if (!this.transitionAnimationInProgress || (runnable = this.onOpenAnimationEndRunnable) == null) {
            return;
        }
        this.transitionAnimationInProgress = false;
        this.layoutToIgnore = null;
        this.transitionAnimationPreviewMode = false;
        this.transitionAnimationStartTime = 0L;
        this.newFragment = null;
        this.oldFragment = null;
        this.onOpenAnimationEndRunnable = null;
        runnable.run();
        checkNeedRebuild();
    }

    @Override
    public void startActivityForResult(Intent intent, int i) throws IOException {
        if (this.parentActivity == null) {
            return;
        }
        if (this.transitionAnimationInProgress) {
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.currentAnimation = null;
            }
            if (this.onCloseAnimationEndRunnable != null) {
                onCloseAnimationEnd();
            } else if (this.onOpenAnimationEndRunnable != null) {
                onOpenAnimationEnd();
            }
            this.containerView.invalidate();
        }
        if (intent != null) {
            this.parentActivity.startActivityForResult(intent, i);
        }
    }

    @Override
    public Theme.MessageDrawable getMessageDrawableOutStart() {
        return this.messageDrawableOutStart;
    }

    @Override
    public Theme.MessageDrawable getMessageDrawableOutMediaStart() {
        return this.messageDrawableOutMediaStart;
    }

    @Override
    public List<BackButtonMenu.PulledDialog> getPulledDialogs() {
        return this.pulledDialogs;
    }

    @Override
    public void setPulledDialogs(List<BackButtonMenu.PulledDialog> list) {
        this.pulledDialogs = list;
    }

    @Override
    public void setUseAlphaAnimations(boolean z) {
        this.useAlphaAnimations = z;
    }

    @Override
    public void setBackgroundView(View view) {
        this.backgroundView = view;
    }

    @Override
    public void setDrawerLayoutContainer(DrawerLayoutContainer drawerLayoutContainer) {
        this.drawerLayoutContainer = drawerLayoutContainer;
    }

    @Override
    public DrawerLayoutContainer getDrawerLayoutContainer() {
        return this.drawerLayoutContainer;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z) {
        this.removeActionBarExtraHeight = z;
    }

    public void setTitleOverlayText(String str, int i, Runnable runnable) {
        this.titleOverlayText = str;
        this.titleOverlayTextId = i;
        this.overlayAction = runnable;
        for (int i2 = 0; i2 < this.fragmentsStack.size(); i2++) {
            ((BaseFragment) this.fragmentsStack.get(i2)).setTitleOverlayText(this.titleOverlayText, this.titleOverlayTextId, runnable);
        }
    }

    public boolean extendActionMode(Menu menu) {
        if (!this.fragmentsStack.isEmpty()) {
            List list = this.fragmentsStack;
            if (((BaseFragment) list.get(list.size() - 1)).extendActionMode(menu)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i) {
        LayoutContainer layoutContainer = this.containerView;
        if (layoutContainer != null) {
            layoutContainer.setFragmentPanTranslationOffset(i);
        }
    }

    @Override
    public List onGetDebugItems() {
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment != 0) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof FloatingDebugProvider) {
                arrayList.addAll(((FloatingDebugProvider) lastFragment).onGetDebugItems());
            }
            observeDebugItemsFromView(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.emptyList();
    }

    private void observeDebugItemsFromView(List list, View view) {
        if (view instanceof FloatingDebugProvider) {
            list.addAll(((FloatingDebugProvider) view).onGetDebugItems());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                observeDebugItemsFromView(list, viewGroup.getChildAt(i));
            }
        }
    }

    public static View findScrollingChild(ViewGroup viewGroup, float f, float f2) {
        View viewFindScrollingChild;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                Rect rect = AndroidUtilities.rectTmp2;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f, (int) f2)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (viewFindScrollingChild = findScrollingChild((ViewGroup) childAt, f - rect.left, f2 - rect.top)) != null) {
                        return viewFindScrollingChild;
                    }
                }
            }
        }
        return null;
    }

    public void lambda$new$9() {
        if (this.attached && getLastFragment() != null && this.containerView.getChildCount() == 0) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.e(new RuntimeException(TextUtils.join(", ", this.lastActions)));
            }
            rebuildAllFragmentViews(true, true);
        }
    }

    public void checkBlackScreen(String str) {
        if (BuildVars.DEBUG_VERSION) {
            this.lastActions.add(0, str + " " + this.fragmentsStack.size());
            if (this.lastActions.size() > 20) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 10; i++) {
                    arrayList.add((String) this.lastActions.get(i));
                }
                this.lastActions = arrayList;
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.debugBlackScreenRunnable);
        AndroidUtilities.runOnUIThread(this.debugBlackScreenRunnable, 500L);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
    }

    public int measureKeyboardHeight() {
        View rootView = getRootView();
        getWindowVisibleDisplayFrame(this.rect);
        Rect rect = this.rect;
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = (rootView.getHeight() - (this.rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView);
        Rect rect2 = this.rect;
        return Math.max(0, height - (rect2.bottom - rect2.top));
    }

    @Override
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setWindow(Window window) {
        this.window = window;
    }

    @Override
    public Window getWindow() {
        Window window = this.window;
        if (window != null) {
            return window;
        }
        if (getParentActivity() != null) {
            return getParentActivity().getWindow();
        }
        return null;
    }

    public BottomSheetTabs getBottomSheetTabs() {
        return this.bottomSheetTabs;
    }

    @Override
    public void setNavigationBarColor(int i) {
        if (this.currentNavigationBarColor != i) {
            this.currentNavigationBarColor = i;
            invalidate();
        }
        DrawerLayoutContainer drawerLayoutContainer = this.drawerLayoutContainer;
        if (drawerLayoutContainer != null) {
            drawerLayoutContainer.setInternalNavigationBarColor(i);
        }
        BottomSheetTabs bottomSheetTabs = this.bottomSheetTabs;
        if (bottomSheetTabs != null) {
            bottomSheetTabs.setNavigationBarColor(i, (this.startedTracking || this.animationInProgress) ? false : true);
        }
    }

    public void relayout() {
        requestLayout();
        this.containerView.requestLayout();
        this.containerViewBack.requestLayout();
        this.sheetContainer.requestLayout();
    }

    @Override
    public int getBottomTabsHeight(boolean z) {
        BottomSheetTabs bottomSheetTabs;
        if (!this.main || (bottomSheetTabs = this.bottomSheetTabs) == null) {
            return 0;
        }
        return bottomSheetTabs.getHeight(z);
    }

    @Override
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        WindowInsetsCompat windowInsetsCompat = this.lastWindowInsetsCompat;
        if (windowInsetsCompat != null) {
            dispatchApplyWindowInsetsInternal(view, windowInsetsCompat);
        }
    }

    private void dispatchApplyWindowInsetsInternal(View view, WindowInsetsCompat windowInsetsCompat) {
        if (this.isLayersLayout) {
            ViewCompat.dispatchApplyWindowInsets(view, WindowInsetsCompat.CONSUMED);
            return;
        }
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.displayCutout());
        if (view instanceof BottomSheetTabs) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i = marginLayoutParams.bottomMargin;
            int i2 = insets.bottom;
            if (i != i2) {
                marginLayoutParams.bottomMargin = i2;
                view.requestLayout();
                return;
            }
            return;
        }
        if (view instanceof LayoutContainer) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            LayoutContainer layoutContainer = (LayoutContainer) view;
            int bottomTabsHeight = getBottomTabsHeight(false);
            int i3 = bottomTabsHeight > 0 ? insets.bottom + bottomTabsHeight : 0;
            if (layoutContainer.isSupportEdgeToEdge) {
                if (marginLayoutParams2.bottomMargin != i3) {
                    marginLayoutParams2.bottomMargin = i3;
                    view.requestLayout();
                }
                ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat.inset(0, 0, 0, marginLayoutParams2.bottomMargin));
                return;
            }
            int iMax = Math.max(i3, insets2.bottom);
            if (marginLayoutParams2.bottomMargin != iMax) {
                marginLayoutParams2.bottomMargin = iMax;
                view.requestLayout();
            }
            ViewCompat.dispatchApplyWindowInsets(view, WindowInsetsCompat.CONSUMED);
        }
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        this.lastWindowInsetsCompat = windowInsetsCompat;
        this.navigationBarInsetHeight = insets.bottom;
        this.statusBarInsetHeight = insets.top;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            dispatchApplyWindowInsetsInternal(getChildAt(i), windowInsetsCompat);
        }
        return WindowInsetsCompat.CONSUMED;
    }
}
