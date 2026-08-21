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
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
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
import org.telegram.ui.ChatActivity;
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
    private boolean isRightLayout;
    private boolean isSheet;
    ArrayList lastActions;
    private long lastFrameTime;
    private boolean lastPortrait;
    private WindowInsetsCompat lastWindowInsetsCompat;
    private View layoutToIgnore;
    private final boolean main;
    private boolean maybeStartTracking;
    private int[] measureSpec;
    public MessageDrawable messageDrawableOutMediaStart;
    public MessageDrawable messageDrawableOutStart;
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
    private Insets systemAndDisplayAndImeInsets;
    private Insets systemAndDisplayInsets;
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

    static float access$1816(ActionBarLayout actionBarLayout, float f) {
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
        private EdgeToEdgeSupportMode edgeToEdgeSupportMode;
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
        public void onViewAdded(View view) {
            super.onViewAdded(view);
            updateChildrenAccessibilityImportance();
        }

        @Override
        public void onViewRemoved(View view) {
            super.onViewRemoved(view);
            updateChildrenAccessibilityImportance();
        }

        private void updateChildrenAccessibilityImportance() {
            try {
                int childCount = getChildCount();
                int i = childCount - 1;
                while (true) {
                    if (i < 0) {
                        i = -1;
                        break;
                    }
                    View childAt = getChildAt(i);
                    if ((childAt instanceof BaseFragment.AttachedSheetWindow) && childAt.getVisibility() == 0) {
                        break;
                    } else {
                        i--;
                    }
                }
                int i2 = 0;
                while (i2 < childCount) {
                    View childAt2 = getChildAt(i2);
                    if (childAt2 != null) {
                        int i3 = (i == -1 || i2 == i) ? 0 : 4;
                        if (childAt2.getImportantForAccessibility() != i3) {
                            childAt2.setImportantForAccessibility(i3);
                        }
                    }
                    i2++;
                }
            } catch (Exception e) {
                FileLog.e(e);
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
            if (lastSheet != null && lastSheet.isFullyVisible() && lastSheet.mo1349getWindowView() != view) {
                return true;
            }
            if (view instanceof ActionBar) {
                return super.drawChild(canvas, view, j);
            }
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    View childAt = getChildAt(i);
                    if (childAt != view && (childAt instanceof ActionBar) && childAt.getVisibility() == 0) {
                        ActionBar actionBar = (ActionBar) childAt;
                        if (actionBar.getCastShadows() && actionBar.getShadowAlpha() > 0) {
                            measuredHeight = childAt.getMeasuredHeight();
                            y = (int) childAt.getY();
                            shadowAlpha = actionBar.getShadowAlpha();
                            break;
                        }
                        break;
                    }
                    i++;
                }
                shadowAlpha = 0;
                measuredHeight = 0;
                y = 0;
                break;
            }
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
        protected void dispatchDraw(Canvas canvas) {
            int color;
            if (!ActionBarLayout.this.isLayersLayout) {
                if (ActionBarLayout.this.drawerLayoutContainer != null) {
                    color = ActionBarLayout.this.drawerLayoutContainer.getInternalNavbarPaint().getColor();
                } else {
                    color = Theme.getColor(Theme.key_windowBackgroundGray);
                }
                ActionBarLayout actionBarLayout = ActionBarLayout.this;
                boolean z = false;
                if (this == actionBarLayout.sheetContainer) {
                    AnimatedFloat animatedFloat = actionBarLayout.hasSheetsAnimator;
                    if (ActionBarLayout.this.sheetFragment != null && ActionBarLayout.this.sheetFragment.hasSheet()) {
                        z = true;
                    }
                    float f = animatedFloat.set(z);
                    if (f > 0.0f) {
                        drawInsets(canvas, Theme.multAlpha(color, f), this.drawNavigationBar);
                    }
                } else {
                    BaseFragment lastFragment = actionBarLayout.getLastFragment();
                    if (lastFragment != null && !lastFragment.inPreviewMode) {
                        if (this == ActionBarLayout.this.containerView && this.edgeToEdgeSupportMode != EdgeToEdgeSupportMode.NONE) {
                            int childCount = getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                if (getChildAt(i) instanceof BaseFragment.AttachedSheetWindow) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        drawInsets(canvas, color, z);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            }
            super.dispatchDraw(canvas);
        }

        private void drawInsets(Canvas canvas, int i, boolean z) {
            Canvas canvas2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            Paint paintFillingPaint = Theme.fillingPaint(i);
            if (paddingLeft <= 0 || this.edgeToEdgeSupportMode == EdgeToEdgeSupportMode.FULL) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), paintFillingPaint);
            }
            if (paddingRight > 0 && this.edgeToEdgeSupportMode != EdgeToEdgeSupportMode.FULL) {
                canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), paintFillingPaint);
            }
            if (paddingBottom > 0) {
                if (this.edgeToEdgeSupportMode == EdgeToEdgeSupportMode.NONE || z) {
                    canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), paintFillingPaint);
                }
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int measuredHeight;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            boolean z = size2 > size;
            if (this.wasPortrait != z && ActionBarLayout.this.isInPreviewMode()) {
                ActionBarLayout.this.finishPreviewFragment();
            }
            this.wasPortrait = z;
            int childCount = getChildCount();
            getWindowVisibleDisplayFrame(this.rect);
            if (ActionBarLayout.this.bottomSheetTabs != null) {
                ActionBarLayout.this.bottomSheetTabs.updateCurrentAccount();
            }
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    measuredHeight = 0;
                    break;
                }
                View childAt = getChildAt(i3);
                if (childAt instanceof ActionBar) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    measuredHeight = childAt.getMeasuredHeight();
                    break;
                }
                i3++;
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (!(childAt2 instanceof ActionBar)) {
                    if (childAt2 instanceof BaseFragment.AttachedSheetWindow) {
                        measureChildWithMargins(childAt2, i, 0, i2, (ActionBarLayout.this.getBottomTabsHeight(false) > 0 || !this.isSupportEdgeToEdge) ? 0 : ActionBarLayout.this.systemAndDisplayInsets.bottom);
                    } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows()) {
                        measureChildWithMargins(childAt2, i, 0, i2, this.isSupportEdgeToEdge ? ActionBarLayout.this.systemAndDisplayInsets.bottom : 0);
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
            int paddingLeft = getPaddingLeft();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    measuredHeight = 0;
                    break;
                }
                View childAt = getChildAt(i5);
                if (childAt instanceof ActionBar) {
                    measuredHeight = childAt.getMeasuredHeight();
                    childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, measuredHeight);
                    break;
                }
                i5++;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (!(childAt2 instanceof ActionBar)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows() || (childAt2 instanceof BaseFragment.AttachedSheetWindow)) {
                        int i7 = layoutParams.leftMargin + paddingLeft;
                        childAt2.layout(i7, layoutParams.topMargin, childAt2.getMeasuredWidth() + i7, layoutParams.topMargin + childAt2.getMeasuredHeight());
                    } else {
                        int i8 = layoutParams.leftMargin + paddingLeft;
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
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            motionEvent.getAction();
            boolean z = ActionBarLayout.this.inPreviewMode && ActionBarLayout.this.previewMenu == null;
            if ((!z && !ActionBarLayout.this.transitionAnimationPreviewMode) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
                if (z) {
                    try {
                        if (this != ActionBarLayout.this.containerView) {
                            if (super.dispatchTouchEvent(motionEvent)) {
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                } else if (super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (this.fragmentPanTranslationOffset != 0) {
                int i = Theme.key_windowBackgroundWhite;
                if (this.backgroundColor != Theme.getColor(i)) {
                    Paint paint = this.backgroundPaint;
                    int color = Theme.getColor(i);
                    this.backgroundColor = color;
                    paint.setColor(color);
                }
                canvas2 = canvas;
                canvas2.drawRect(0.0f, (getMeasuredHeight() - this.fragmentPanTranslationOffset) - 3, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas2);
        }

        public void setShouldHandleBottomInsets(EdgeToEdgeSupportMode edgeToEdgeSupportMode) {
            if (this.edgeToEdgeSupportMode != edgeToEdgeSupportMode) {
                this.edgeToEdgeSupportMode = edgeToEdgeSupportMode;
                this.isSupportEdgeToEdge = edgeToEdgeSupportMode != EdgeToEdgeSupportMode.NONE;
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
            View viewPerformCreateView = emptyBaseFragment2.fragmentView;
            if (viewPerformCreateView == null) {
                viewPerformCreateView = emptyBaseFragment2.performCreateView(this.parentActivity);
            }
            if (viewPerformCreateView.getParent() != this.sheetContainer) {
                AndroidUtilities.removeFromParent(viewPerformCreateView);
                this.sheetContainer.addView(viewPerformCreateView, LayoutHelper.createFrame(-1, -1.0f));
                this.sheetContainer.setShouldHandleBottomInsets(this.sheetFragment.getEdgeToEdgeSupportMode());
                this.sheetContainer.setDrawNavigationBar(this.sheetFragment.drawEdgeNavigationBar());
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
                ActionBarLayout.m1230$r8$lambda$P9NMVBFozNo1lFmeoHq0CL3nSE(this.f$0);
            }
        };
        Insets insets = Insets.NONE;
        this.systemAndDisplayInsets = insets;
        this.systemAndDisplayAndImeInsets = insets;
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

    public void setIsRightLayout() {
        this.isRightLayout = true;
    }

    @Override
    public boolean isRightLayout() {
        return this.isRightLayout;
    }

    @Override
    public boolean isLayersLayout() {
        return this.isLayersLayout;
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
        this.hasSheetsAnimator.setParent(layoutContainer6);
        addView(this.sheetContainer);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.sheetContainer.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.sheetContainer.setLayoutParams(layoutParams4);
        EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
        if (emptyBaseFragment != null) {
            emptyBaseFragment.setParentLayout(this);
            EmptyBaseFragment emptyBaseFragment2 = this.sheetFragment;
            View viewPerformCreateView = emptyBaseFragment2.fragmentView;
            if (viewPerformCreateView == null) {
                viewPerformCreateView = emptyBaseFragment2.performCreateView(this.parentActivity);
            }
            if (viewPerformCreateView.getParent() != this.sheetContainer) {
                AndroidUtilities.removeFromParent(viewPerformCreateView);
                this.sheetContainer.addView(viewPerformCreateView, LayoutHelper.createFrame(-1, -1.0f));
                this.sheetContainer.setShouldHandleBottomInsets(this.sheetFragment.getEdgeToEdgeSupportMode());
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
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2 = getHeight() > getWidth();
        if (this.lastPortrait != z2) {
            this.lastPortrait = z2;
            this.savedBottomSheetTabsTop = 0;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                BottomSheetTabs bottomSheetTabs = this.bottomSheetTabs;
                if (childAt == bottomSheetTabs) {
                    bottomSheetTabs.updateCurrentAccount();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = layoutParams.gravity;
                if (i13 == -1) {
                    i13 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection());
                int i14 = i13 & 112;
                int i15 = absoluteGravity & 7;
                if (i15 == 1) {
                    i5 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else {
                    if (i15 == 5) {
                        i5 = paddingRight - measuredWidth;
                        i6 = layoutParams.rightMargin;
                    } else {
                        i7 = layoutParams.leftMargin + paddingLeft;
                    }
                    if (i14 != 16) {
                        i8 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    } else if (i14 != 48 && i14 == 80) {
                        i8 = paddingBottom - measuredHeight;
                        i9 = layoutParams.bottomMargin;
                    } else {
                        i11 = layoutParams.topMargin;
                        i10 = i11 + paddingTop;
                        if (childAt != this.bottomSheetTabs && this.savedBottomSheetTabsTop != 0 && (this.isKeyboardVisible || ((getParent() instanceof View) && ((View) getParent()).getHeight() > getHeight()))) {
                            i10 = this.savedBottomSheetTabsTop;
                        } else if (childAt == this.bottomSheetTabs) {
                            this.savedBottomSheetTabsTop = i10;
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                    }
                    i10 = i8 - i9;
                    if (childAt != this.bottomSheetTabs) {
                        if (childAt == this.bottomSheetTabs) {
                            this.savedBottomSheetTabsTop = i10;
                        }
                    } else if (childAt == this.bottomSheetTabs) {
                        this.savedBottomSheetTabsTop = i10;
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                }
                i7 = i5 - i6;
                if (i14 != 16) {
                    i8 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                    i9 = layoutParams.bottomMargin;
                } else {
                    if (i14 != 48) {
                        i11 = layoutParams.topMargin;
                    } else {
                        i11 = layoutParams.topMargin;
                    }
                    i10 = i11 + paddingTop;
                    if (childAt != this.bottomSheetTabs) {
                        if (childAt == this.bottomSheetTabs) {
                            this.savedBottomSheetTabsTop = i10;
                        }
                    } else if (childAt == this.bottomSheetTabs) {
                        this.savedBottomSheetTabsTop = i10;
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                }
                i10 = i8 - i9;
                if (childAt != this.bottomSheetTabs) {
                    if (childAt == this.bottomSheetTabs) {
                        this.savedBottomSheetTabsTop = i10;
                    }
                } else if (childAt == this.bottomSheetTabs) {
                    this.savedBottomSheetTabsTop = i10;
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
            }
        }
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
        List list2 = this.fragmentsStack;
        BaseFragment baseFragment2 = (BaseFragment) list2.get(list2.size() - 1);
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
            List list = this.fragmentsStack;
            ((BaseFragment) list.get(list.size() - 1)).onResume();
        }
        EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
        if (emptyBaseFragment != null) {
            emptyBaseFragment.onResume();
        }
    }

    public void onUserLeaveHint() {
        if (!this.fragmentsStack.isEmpty()) {
            List list = this.fragmentsStack;
            ((BaseFragment) list.get(list.size() - 1)).onUserLeaveHint();
        }
        EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
        if (emptyBaseFragment != null) {
            emptyBaseFragment.onUserLeaveHint();
        }
    }

    @Override
    public void onPause() {
        if (!this.fragmentsStack.isEmpty()) {
            List list = this.fragmentsStack;
            ((BaseFragment) list.get(list.size() - 1)).onPause();
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
        Canvas canvas2;
        if (this.bottomSheetTabs == null || getBottomTabsHeight(true) <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.systemAndDisplayInsets.bottom + this.bottomSheetTabs.getMeasuredHeight()), getWidth(), getHeight(), this.bottomSheetTabs.getBackgroundPaint());
        }
        this.withShadow = true;
        if (this.isLayersLayout) {
            canvas2.save();
            float fDp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            this.clipPath.rewind();
            this.clipPath.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
            canvas2.clipPath(this.clipPath);
        }
        super.dispatchDraw(canvas2);
        if (this.isLayersLayout) {
            canvas2.restore();
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int iMax;
        int i;
        Canvas canvas2;
        int i2;
        LayoutContainer layoutContainer;
        int i3;
        int i4;
        int iClamp;
        int i5;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        WindowInsets rootWindowInsets2;
        RectF rectF;
        float f;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        RoundedCorner roundedCorner5;
        RoundedCorner roundedCorner6;
        float radius3;
        float radius4;
        float radius5;
        float radius6;
        float f2;
        float fMin;
        float fClamp;
        float fDp;
        float fCenterY;
        BottomSheetTabs.ClipTools clipTools;
        DrawerLayoutContainer drawerLayoutContainer = this.drawerLayoutContainer;
        if (drawerLayoutContainer != null && drawerLayoutContainer.isDrawCurrentPreviewFragmentAbove() && (this.inPreviewMode || this.transitionAnimationPreviewMode || this.previewOpenAnimationInProgress)) {
            BaseFragment baseFragment = this.oldFragment;
            if (view == ((baseFragment == null || !baseFragment.inPreviewMode) ? this.containerView : this.containerViewBack)) {
                this.drawerLayoutContainer.invalidate();
                return false;
            }
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingRight = ((int) this.innerTranslationX) + getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view == this.containerViewBack) {
            paddingLeft2 = AndroidUtilities.dp(1.0f) + paddingRight;
        } else {
            if (view == this.containerView) {
                iMax = paddingLeft2;
                i = paddingRight;
            }
            int iSave = canvas.save();
            if (view != this.bottomSheetTabs || (clipTools = this.bottomSheetTabsClip) == null) {
                canvas2 = canvas;
            } else {
                clipTools.clip(canvas, this.withShadow, this.isKeyboardVisible, getWidth(), getHeight() + ((int) getY()), 1.0f);
                canvas2 = canvas;
                this.withShadow = false;
            }
            i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31 && !this.isSheet && (paddingRight != 0 || this.overrideWidthOffset != -1)) {
                if (view == this.containerView) {
                    rootWindowInsets2 = getRootWindowInsets();
                    if (rootWindowInsets2 != null) {
                        rectF = AndroidUtilities.rectTmp;
                        f = paddingRight;
                        rectF.set(f, 0.0f, paddingRight + getWidth(), getHeight());
                        if (newBackTransitions()) {
                            if (this.predictiveBackInProgress) {
                                f2 = 56.0f;
                                fMin = AndroidUtilities.lerp(1.0f, AndroidUtilities.lerp(0.9f, 0.85f, 1.0f - this.containerView.getAlpha()), Utilities.clamp01(f / AndroidUtilities.dpf2(56.0f)));
                            } else {
                                f2 = 56.0f;
                                fMin = 1.0f - Math.min(0.25f, (0.05f * f) / AndroidUtilities.dpf2(56.0f));
                            }
                            if (paddingRight > AndroidUtilities.dp(f2) || this.animationInProgress || !this.predictiveBackInProgress) {
                                fClamp = Utilities.clamp(paddingRight, AndroidUtilities.dp(f2), 0);
                            } else {
                                fClamp = f;
                            }
                            if (this.predictiveBackInProgress || this.predictiveBackLeft) {
                                canvas2.translate(-fClamp, 0.0f);
                                iMax = (int) (iMax + fClamp);
                            } else {
                                canvas2.translate(-fClamp, 0.0f);
                                rectF.set(f, 0.0f, getWidth() + paddingRight, getHeight());
                                iMax = (int) (iMax + fClamp);
                            }
                            if (this.predictiveBackLeft) {
                                fDp = rectF.right - AndroidUtilities.dp(82.0f);
                            } else {
                                fDp = rectF.left + AndroidUtilities.dp(82.0f);
                            }
                            if (this.predictiveBackInProgress) {
                                fCenterY = this.predictiveBackY;
                            } else {
                                fCenterY = rectF.centerY();
                            }
                            canvas2.scale(fMin, fMin, fDp, fCenterY);
                        }
                        roundedCorner3 = rootWindowInsets2.getRoundedCorner(0);
                        roundedCorner4 = rootWindowInsets2.getRoundedCorner(1);
                        roundedCorner5 = rootWindowInsets2.getRoundedCorner(2);
                        roundedCorner6 = rootWindowInsets2.getRoundedCorner(3);
                        float[] fArr = this.radii;
                        if (roundedCorner3 == null) {
                            radius3 = 0.0f;
                        } else {
                            radius3 = roundedCorner3.getRadius();
                        }
                        fArr[1] = radius3;
                        fArr[0] = radius3;
                        float[] fArr2 = this.radii;
                        if (roundedCorner4 == null) {
                            radius4 = 0.0f;
                        } else {
                            radius4 = roundedCorner4.getRadius();
                        }
                        fArr2[3] = radius4;
                        fArr2[2] = radius4;
                        float[] fArr3 = this.radii;
                        if (roundedCorner5 == null) {
                            radius5 = 0.0f;
                        } else {
                            radius5 = roundedCorner5.getRadius();
                        }
                        fArr3[5] = radius5;
                        fArr3[4] = radius5;
                        float[] fArr4 = this.radii;
                        if (roundedCorner6 == null) {
                            radius6 = 0.0f;
                        } else {
                            radius6 = roundedCorner6.getRadius();
                        }
                        fArr4[7] = radius6;
                        fArr4[6] = radius6;
                        if (this.isRightLayout) {
                            float fClamp01 = Utilities.clamp01(Math.abs(paddingRight) / AndroidUtilities.dpf2(12.0f));
                            float[] fArr5 = this.radii;
                            fArr5[0] = fArr5[0] * fClamp01;
                            fArr5[1] = fArr5[1] * fClamp01;
                            fArr5[6] = fArr5[6] * fClamp01;
                            fArr5[7] = fArr5[7] * fClamp01;
                        }
                        this.clipPath.rewind();
                        this.clipPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
                        canvas2.clipPath(this.clipPath);
                    }
                } else if (view == this.containerViewBack && (rootWindowInsets = getRootWindowInsets()) != null) {
                    roundedCorner = rootWindowInsets.getRoundedCorner(0);
                    roundedCorner2 = rootWindowInsets.getRoundedCorner(3);
                    if (roundedCorner == null) {
                        radius = 0;
                    } else {
                        radius = roundedCorner.getRadius();
                    }
                    if (roundedCorner2 == null) {
                        radius2 = 0;
                    } else {
                        radius2 = roundedCorner2.getRadius();
                    }
                    iMax += Math.max(radius, radius2);
                    if (newBackTransitions()) {
                        iMax = width + getPaddingLeft();
                    }
                }
            }
            int iSave2 = canvas2.save();
            if (!isTransitionAnimationInProgress() && !this.inPreviewMode) {
                canvas2.clipRect(i, 0, iMax, getHeight());
            }
            if ((!this.inPreviewMode || this.transitionAnimationPreviewMode) && view == (layoutContainer = this.containerView)) {
                drawPreviewDrawables(canvas2, layoutContainer);
            }
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas2.restoreToCount(iSave2);
            if (paddingRight == 0) {
                i3 = -1;
                if (this.overrideWidthOffset != -1) {
                }
                canvas2.restoreToCount(iSave);
                return zDrawChild;
            }
            i3 = -1;
            i4 = this.overrideWidthOffset;
            if (i4 == i3) {
                i4 = width - paddingRight;
            }
            if (view == this.containerView) {
                iClamp = MathUtils.clamp((i4 * 255) / AndroidUtilities.dp(20.0f), 0, 255);
                if (iClamp > 0) {
                    if (getBottomTabsHeight(false) == 0) {
                        i5 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
                    } else {
                        i5 = 0;
                    }
                    if (i2 >= 31 || this.isSheet) {
                        Drawable drawable = layerShadowDrawable;
                        drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i5);
                        layerShadowDrawable.setAlpha(iClamp);
                        layerShadowDrawable.draw(canvas2);
                    }
                }
            } else if (view == this.containerViewBack) {
                scrimPaint.setColor(Color.argb((int) (MathUtils.clamp(i4 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
                if (this.overrideWidthOffset != -1) {
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, scrimPaint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i, 0.0f, iMax, getHeight() * 1.5f, scrimPaint);
                }
            }
            canvas2.restoreToCount(iSave);
            return zDrawChild;
        }
        i = paddingLeft;
        iMax = paddingLeft2;
        int iSave3 = canvas.save();
        if (view != this.bottomSheetTabs) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (view == this.containerView) {
                rootWindowInsets2 = getRootWindowInsets();
                if (rootWindowInsets2 != null) {
                    rectF = AndroidUtilities.rectTmp;
                    f = paddingRight;
                    rectF.set(f, 0.0f, paddingRight + getWidth(), getHeight());
                    if (newBackTransitions()) {
                        if (this.predictiveBackInProgress) {
                            f2 = 56.0f;
                            fMin = AndroidUtilities.lerp(1.0f, AndroidUtilities.lerp(0.9f, 0.85f, 1.0f - this.containerView.getAlpha()), Utilities.clamp01(f / AndroidUtilities.dpf2(56.0f)));
                        } else {
                            f2 = 56.0f;
                            fMin = 1.0f - Math.min(0.25f, (0.05f * f) / AndroidUtilities.dpf2(56.0f));
                        }
                        if (paddingRight > AndroidUtilities.dp(f2)) {
                            fClamp = Utilities.clamp(paddingRight, AndroidUtilities.dp(f2), 0);
                        } else {
                            fClamp = Utilities.clamp(paddingRight, AndroidUtilities.dp(f2), 0);
                        }
                        if (this.predictiveBackInProgress) {
                            canvas2.translate(-fClamp, 0.0f);
                            iMax = (int) (iMax + fClamp);
                        } else {
                            canvas2.translate(-fClamp, 0.0f);
                            iMax = (int) (iMax + fClamp);
                        }
                        if (this.predictiveBackLeft) {
                            fDp = rectF.right - AndroidUtilities.dp(82.0f);
                        } else {
                            fDp = rectF.left + AndroidUtilities.dp(82.0f);
                        }
                        if (this.predictiveBackInProgress) {
                            fCenterY = this.predictiveBackY;
                        } else {
                            fCenterY = rectF.centerY();
                        }
                        canvas2.scale(fMin, fMin, fDp, fCenterY);
                    }
                    roundedCorner3 = rootWindowInsets2.getRoundedCorner(0);
                    roundedCorner4 = rootWindowInsets2.getRoundedCorner(1);
                    roundedCorner5 = rootWindowInsets2.getRoundedCorner(2);
                    roundedCorner6 = rootWindowInsets2.getRoundedCorner(3);
                    float[] fArr6 = this.radii;
                    if (roundedCorner3 == null) {
                        radius3 = 0.0f;
                    } else {
                        radius3 = roundedCorner3.getRadius();
                    }
                    fArr6[1] = radius3;
                    fArr6[0] = radius3;
                    float[] fArr7 = this.radii;
                    if (roundedCorner4 == null) {
                        radius4 = 0.0f;
                    } else {
                        radius4 = roundedCorner4.getRadius();
                    }
                    fArr7[3] = radius4;
                    fArr7[2] = radius4;
                    float[] fArr8 = this.radii;
                    if (roundedCorner5 == null) {
                        radius5 = 0.0f;
                    } else {
                        radius5 = roundedCorner5.getRadius();
                    }
                    fArr8[5] = radius5;
                    fArr8[4] = radius5;
                    float[] fArr9 = this.radii;
                    if (roundedCorner6 == null) {
                        radius6 = 0.0f;
                    } else {
                        radius6 = roundedCorner6.getRadius();
                    }
                    fArr9[7] = radius6;
                    fArr9[6] = radius6;
                    if (this.isRightLayout) {
                        float fClamp02 = Utilities.clamp01(Math.abs(paddingRight) / AndroidUtilities.dpf2(12.0f));
                        float[] fArr10 = this.radii;
                        fArr10[0] = fArr10[0] * fClamp02;
                        fArr10[1] = fArr10[1] * fClamp02;
                        fArr10[6] = fArr10[6] * fClamp02;
                        fArr10[7] = fArr10[7] * fClamp02;
                    }
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
                    canvas2.clipPath(this.clipPath);
                }
            } else if (view == this.containerViewBack) {
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                roundedCorner2 = rootWindowInsets.getRoundedCorner(3);
                if (roundedCorner == null) {
                    radius = 0;
                } else {
                    radius = roundedCorner.getRadius();
                }
                if (roundedCorner2 == null) {
                    radius2 = 0;
                } else {
                    radius2 = roundedCorner2.getRadius();
                }
                iMax += Math.max(radius, radius2);
                if (newBackTransitions()) {
                    iMax = width + getPaddingLeft();
                }
            }
        }
        int iSave4 = canvas2.save();
        if (!isTransitionAnimationInProgress()) {
            canvas2.clipRect(i, 0, iMax, getHeight());
        }
        if (!this.inPreviewMode) {
            drawPreviewDrawables(canvas2, layoutContainer);
        } else {
            drawPreviewDrawables(canvas2, layoutContainer);
        }
        boolean zDrawChild2 = super.drawChild(canvas, view, j);
        canvas2.restoreToCount(iSave4);
        if (paddingRight == 0) {
            i3 = -1;
            if (this.overrideWidthOffset != -1) {
            }
            canvas2.restoreToCount(iSave3);
            return zDrawChild2;
        }
        i3 = -1;
        i4 = this.overrideWidthOffset;
        if (i4 == i3) {
            i4 = width - paddingRight;
        }
        if (view == this.containerView) {
            iClamp = MathUtils.clamp((i4 * 255) / AndroidUtilities.dp(20.0f), 0, 255);
            if (iClamp > 0) {
                if (getBottomTabsHeight(false) == 0) {
                    i5 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
                } else {
                    i5 = 0;
                }
                if (i2 >= 31) {
                    Drawable drawable2 = layerShadowDrawable;
                    drawable2.setBounds(paddingRight - drawable2.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i5);
                    layerShadowDrawable.setAlpha(iClamp);
                    layerShadowDrawable.draw(canvas2);
                } else {
                    Drawable drawable3 = layerShadowDrawable;
                    drawable3.setBounds(paddingRight - drawable3.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i5);
                    layerShadowDrawable.setAlpha(iClamp);
                    layerShadowDrawable.draw(canvas2);
                }
            }
        } else if (view == this.containerViewBack) {
            scrimPaint.setColor(Color.argb((int) (MathUtils.clamp(i4 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
            if (this.overrideWidthOffset != -1) {
                canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, scrimPaint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i, 0.0f, iMax, getHeight() * 1.5f, scrimPaint);
            }
        }
        canvas2.restoreToCount(iSave3);
        return zDrawChild2;
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
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            this.previewBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.previewBackgroundDrawable.draw(canvas);
            if (this.previewMenu == null) {
                int iDp = AndroidUtilities.dp(32.0f);
                int measuredWidth = (getMeasuredWidth() - iDp) / 2;
                int top = (int) ((childAt.getTop() + viewGroup.getTranslationY()) - AndroidUtilities.dp(12.0f));
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
        View viewPerformCreateView = baseFragment.fragmentView;
        if (viewPerformCreateView == null && (viewPerformCreateView = baseFragment.performCreateView(this.parentActivity)) != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
            ViewCompat.setOnApplyWindowInsetsListener(viewPerformCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment));
            this.containerViewBack.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) viewPerformCreateView.getParent();
        if (viewGroup != null) {
            baseFragment.onRemoveFromParent();
            viewGroup.removeView(viewPerformCreateView);
        }
        this.containerViewBack.addView(viewPerformCreateView);
        this.containerViewBack.setShouldHandleBottomInsets(baseFragment.getEdgeToEdgeSupportMode());
        this.containerViewBack.setDrawNavigationBar(baseFragment.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewPerformCreateView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        viewPerformCreateView.setLayoutParams(layoutParams);
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
        if (!baseFragment.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
            viewPerformCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
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

    public boolean onBackStarted(float r6, float r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.onBackStarted(float, float):boolean");
    }

    public void onBackProgress(float f) {
        if (this.predictiveInput) {
            float fDp = AndroidUtilities.dp(56.0f) * CubicBezierInterpolator.StandardDecelerate.getInterpolation(f);
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
        Property property = View.TRANSLATION_X;
        if (!z) {
            x = Math.abs(this.containerView.getMeasuredWidth() - x);
            int iMax = Math.max((int) ((200.0f / this.containerView.getMeasuredWidth()) * x), newBackTransitions() ? 380 : 50);
            if (!zShouldOverrideSlideTransition) {
                LayoutContainer layoutContainer = this.containerView;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(layoutContainer, (Property<LayoutContainer, Float>) property, layoutContainer.getMeasuredWidth() + (this.predictiveBackInProgress ? AndroidUtilities.dp(56.0f) : 0));
                long j = iMax;
                animatorSet.playTogether(objectAnimatorOfFloat.setDuration(j), ObjectAnimator.ofFloat(this, "innerTranslationX", this.containerView.getMeasuredWidth()).setDuration(j));
                if (newBackTransitions()) {
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                }
            }
        } else {
            int iMax2 = Math.max((int) ((320.0f / this.containerView.getMeasuredWidth()) * x), newBackTransitions() ? 320 : 120);
            if (!zShouldOverrideSlideTransition) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.containerView, (Property<LayoutContainer, Float>) property, 0.0f);
                long j2 = iMax2;
                animatorSet.playTogether(objectAnimatorOfFloat2.setDuration(j2), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j2));
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

    public void onAnimationEndCheck(boolean z) {
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
        List list = this.fragmentsStack;
        return (BaseFragment) list.get(list.size() - 1);
    }

    public BaseFragment getLastFragmentIncludeMainTabs() {
        BaseFragment lastFragment = getLastFragment();
        return lastFragment instanceof MainTabsActivity ? ((MainTabsActivity) lastFragment).getCurrentVisibleFragment() : lastFragment;
    }

    @Override
    public boolean checkTransitionAnimation() {
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
            public void run() {
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
                ActionBarLayout.access$1816(ActionBarLayout.this, j / ((z3 && z) ? 190.0f : 150.0f));
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
        LaunchActivity launchActivity;
        final BaseFragment baseFragment2 = navigationParams.fragment;
        final boolean z = navigationParams.removeLast;
        boolean z2 = navigationParams.noAnimation;
        boolean z3 = navigationParams.checkPresentFromDelegate;
        final boolean z4 = navigationParams.preview;
        final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = navigationParams.menuView;
        if (baseFragment2 == null || checkTransitionAnimation() || !(((iNavigationLayoutDelegate = this.delegate) == null || !z3 || iNavigationLayoutDelegate.needPresentFragment(this, navigationParams)) && baseFragment2.onFragmentCreate())) {
            return false;
        }
        EdgeToEdgeSupportMode edgeToEdgeSupportMode = baseFragment2.getEdgeToEdgeSupportMode();
        EdgeToEdgeSupportMode edgeToEdgeSupportMode2 = EdgeToEdgeSupportMode.NONE;
        boolean z5 = edgeToEdgeSupportMode != edgeToEdgeSupportMode2;
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
        baseFragment2.setInPreviewMode(z4);
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.previewMenu;
        if (actionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.previewMenu.getParent()).removeView(this.previewMenu);
            }
            this.previewMenu = null;
        }
        this.previewMenu = actionBarPopupWindowLayout;
        baseFragment2.setInMenuMode(actionBarPopupWindowLayout != null);
        if (this.parentActivity.getCurrentFocus() != null && baseFragment2.hideKeyboardOnShow() && !z4) {
            AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
        }
        boolean z6 = z4 || (!z2 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        if (this.fragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            List list = this.fragmentsStack;
            baseFragment = (BaseFragment) list.get(list.size() - 1);
        }
        baseFragment2.setParentLayout(this);
        View viewPerformCreateView = baseFragment2.fragmentView;
        if (viewPerformCreateView == null) {
            viewPerformCreateView = baseFragment2.performCreateView(this.parentActivity);
            if (viewPerformCreateView != null && baseFragment2.isSupportEdgeToEdge() && baseFragment2.drawEdgeNavigationBar()) {
                ViewCompat.setOnApplyWindowInsetsListener(viewPerformCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment2));
                this.containerViewBack.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) viewPerformCreateView.getParent();
            if (viewGroup != null) {
                baseFragment2.onRemoveFromParent();
                viewGroup.removeView(viewPerformCreateView);
            }
        }
        this.containerViewBack.addView(viewPerformCreateView);
        LayoutContainer layoutContainer = this.containerViewBack;
        if (z4) {
            edgeToEdgeSupportMode = edgeToEdgeSupportMode2;
        }
        layoutContainer.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
        this.containerViewBack.setDrawNavigationBar(!z4 && zDrawEdgeNavigationBar);
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
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewPerformCreateView.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z4) {
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
                if (z5) {
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
        viewPerformCreateView.setLayoutParams(layoutParams2);
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
        if (!baseFragment2.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
            viewPerformCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }
        LayoutContainer layoutContainer2 = this.containerView;
        LayoutContainer layoutContainer3 = this.containerViewBack;
        this.containerView = layoutContainer3;
        this.containerViewBack = layoutContainer2;
        layoutContainer3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        if (z4) {
            if (!(baseFragment2 instanceof ChatActivity)) {
                viewPerformCreateView.setOutlineProvider(ViewOutlineProviderImpl.boundsWithPaddingRoundRect(0, AndroidUtilities.dp(actionBarPopupWindowLayout == null ? 24.0f : 12.0f)));
            } else if (actionBarPopupWindowLayout != null) {
                viewPerformCreateView.setOutlineProvider(new ViewOutlineProvider() {
                    private final Path path = new Path();

                    @Override
                    public void getOutline(View view, Outline outline) {
                        float fDp = AndroidUtilities.dp(29.0f);
                        float fDp2 = AndroidUtilities.dp(12.0f);
                        this.path.rewind();
                        this.path.addRoundRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new float[]{fDp, fDp, fDp, fDp, fDp2, fDp2, fDp2, fDp2}, Path.Direction.CW);
                        if (Build.VERSION.SDK_INT >= 30) {
                            outline.setPath(this.path);
                        } else {
                            outline.setConvexPath(this.path);
                        }
                    }
                });
            } else {
                viewPerformCreateView.setOutlineProvider(ViewOutlineProviderImpl.boundsWithPaddingRoundRect(0, AndroidUtilities.dp(29.0f)));
            }
            viewPerformCreateView.setClipToOutline(true);
            viewPerformCreateView.setElevation(AndroidUtilities.dp(4.0f));
            if (Build.VERSION.SDK_INT >= 28) {
                viewPerformCreateView.setOutlineSpotShadowColor(-1342177280);
                viewPerformCreateView.setOutlineAmbientShadowColor(-1342177280);
            }
            if (this.previewBackgroundDrawable == null) {
                this.previewBackgroundDrawable = new ColorDrawable(771751936);
            }
            this.previewBackgroundDrawable.setAlpha(0);
            Theme.moveUpDrawable.setAlpha(0);
        }
        bringChildToFront(this.containerView);
        LayoutContainer layoutContainer4 = this.sheetContainer;
        if (layoutContainer4 != null) {
            bringChildToFront(layoutContainer4);
        }
        if (!z6) {
            presentFragmentInternalRemoveOld(z, baseFragment);
            View view = this.backgroundView;
            if (view != null) {
                view.setVisibility(0);
            }
        }
        if (this.themeAnimatorSet != null) {
            this.presentingFragmentDescriptions = baseFragment2.getThemeDescriptions();
        }
        if (z6 || z4) {
            if (this.useAlphaAnimations && this.fragmentsStack.size() == 1) {
                presentFragmentInternalRemoveOld(z, baseFragment);
                this.transitionAnimationStartTime = System.currentTimeMillis();
                this.transitionAnimationInProgress = true;
                this.layoutToIgnore = this.containerView;
                this.onOpenAnimationEndRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        ActionBarLayout.$r8$lambda$ih0U8e7NecRRfqF8RPyn2Odmnik(baseFragment, baseFragment2);
                    }
                };
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 0.0f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 0.9f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 0.9f, 1.0f));
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
                this.currentAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.currentAnimation.setDuration(200L);
                this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ActionBarLayout.this.onAnimationEndCheck(false);
                    }
                });
                this.currentAnimation.start();
            } else {
                this.transitionAnimationPreviewMode = z4;
                this.transitionAnimationStartTime = System.currentTimeMillis();
                this.transitionAnimationInProgress = true;
                this.layoutToIgnore = this.containerView;
                final BaseFragment baseFragment3 = baseFragment;
                this.onOpenAnimationEndRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        ActionBarLayout.m1233$r8$lambda$sJ3DWoR_DF9PP3YJucIksznII(this.f$0, z4, actionBarPopupWindowLayout, z, baseFragment3, baseFragment2);
                    }
                };
                boolean zNeedDelayOpenAnimation = baseFragment2.needDelayOpenAnimation();
                final boolean z7 = !zNeedDelayOpenAnimation;
                if (!zNeedDelayOpenAnimation) {
                    if (baseFragment3 != null) {
                        baseFragment3.onTransitionAnimationStart(false, false);
                    }
                    baseFragment2.onTransitionAnimationStart(true, false);
                }
                this.delayedAnimationResumed = false;
                this.oldFragment = baseFragment3;
                this.newFragment = baseFragment2;
                AnimatorSet animatorSetOnCustomTransitionAnimation = !z4 ? baseFragment2.onCustomTransitionAnimation(true, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.onAnimationEndCheck(false);
                    }
                }) : null;
                if (animatorSetOnCustomTransitionAnimation != null) {
                    if (!z4 && ((this.containerView.isKeyboardVisible || this.containerViewBack.isKeyboardVisible) && baseFragment3 != null)) {
                        baseFragment3.saveKeyboardPositionBeforeTransition();
                    }
                    this.currentAnimation = animatorSetOnCustomTransitionAnimation;
                } else {
                    this.containerView.setAlpha(0.0f);
                    if (z4) {
                        this.containerView.setTranslationX(0.0f);
                        this.containerView.setScaleX(0.9f);
                        this.containerView.setScaleY(0.9f);
                    } else {
                        this.containerView.setTranslationX(48.0f);
                        this.containerView.setScaleX(1.0f);
                        this.containerView.setScaleY(1.0f);
                    }
                    if (this.containerView.isKeyboardVisible || this.containerViewBack.isKeyboardVisible) {
                        if (baseFragment3 != null && !z4) {
                            baseFragment3.saveKeyboardPositionBeforeTransition();
                        }
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
                                BaseFragment baseFragment4 = baseFragment3;
                                if (baseFragment4 != null) {
                                    baseFragment4.onTransitionAnimationStart(false, false);
                                }
                                baseFragment2.onTransitionAnimationStart(true, false);
                                ActionBarLayout.this.startLayoutAnimation(true, true, z4);
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
                                    BaseFragment baseFragment4 = baseFragment3;
                                    if (baseFragment4 != null) {
                                        baseFragment4.onTransitionAnimationStart(false, false);
                                    }
                                    baseFragment2.onTransitionAnimationStart(true, false);
                                    ActionBarLayout.this.startLayoutAnimation(true, true, z4);
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
                                ActionBarLayout.this.startLayoutAnimation(true, true, z4);
                            }
                        };
                        this.delayedOpenAnimationRunnable = runnable2;
                        AndroidUtilities.runOnUIThread(runnable2, 200L);
                    } else {
                        startLayoutAnimation(true, true, z4);
                    }
                }
            }
        } else {
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
        }
        return true;
    }

    public static void $r8$lambda$ih0U8e7NecRRfqF8RPyn2Odmnik(BaseFragment baseFragment, BaseFragment baseFragment2) {
        if (baseFragment != null) {
            baseFragment.onTransitionAnimationEnd(false, false);
        }
        baseFragment2.onTransitionAnimationEnd(true, false);
        baseFragment2.onBecomeFullyVisible();
    }

    public static void m1233$r8$lambda$sJ3DWoR_DF9PP3YJucIksznII(ActionBarLayout actionBarLayout, boolean z, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, boolean z2, BaseFragment baseFragment, BaseFragment baseFragment2) {
        if (z) {
            actionBarLayout.inPreviewMode = true;
            actionBarLayout.previewMenu = actionBarPopupWindowLayout;
            actionBarLayout.transitionAnimationPreviewMode = false;
            actionBarLayout.containerView.setScaleX(1.0f);
            actionBarLayout.containerView.setScaleY(1.0f);
        } else {
            actionBarLayout.presentFragmentInternalRemoveOld(z2, baseFragment);
            actionBarLayout.containerView.setTranslationX(0.0f);
        }
        if (baseFragment != null) {
            baseFragment.onTransitionAnimationEnd(false, false);
        }
        baseFragment2.onTransitionAnimationEnd(true, false);
        baseFragment2.onBecomeFullyVisible();
    }

    private boolean shouldOpenFragmentOverlay(Dialog dialog) {
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return (dialog instanceof ChatAttachAlert) || (dialog instanceof BotWebViewSheet);
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
        View viewPerformCreateView = baseFragment.fragmentView;
        if (viewPerformCreateView == null) {
            viewPerformCreateView = baseFragment.performCreateView(this.parentActivity);
            if (viewPerformCreateView != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
                ViewCompat.setOnApplyWindowInsetsListener(viewPerformCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment));
                this.containerView.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) viewPerformCreateView.getParent();
            if (viewGroup != null) {
                baseFragment.onRemoveFromParent();
                viewGroup.removeView(viewPerformCreateView);
            }
        }
        if (!baseFragment.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
            viewPerformCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }
        this.containerView.addView(viewPerformCreateView, LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.setShouldHandleBottomInsets(baseFragment.getEdgeToEdgeSupportMode());
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
        View viewPerformCreateView = baseFragment.fragmentView;
        if (viewPerformCreateView == null) {
            viewPerformCreateView = baseFragment.performCreateView(this.parentActivity);
            if (viewPerformCreateView != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
                ViewCompat.setOnApplyWindowInsetsListener(viewPerformCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment));
                this.containerView.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) viewPerformCreateView.getParent();
            if (viewGroup != null) {
                baseFragment.onRemoveFromParent();
                viewGroup.removeView(viewPerformCreateView);
            }
        }
        if (!baseFragment.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
            viewPerformCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }
        LayoutContainer layoutContainer = this.containerView;
        layoutContainer.addView(viewPerformCreateView, Utilities.clamp(i, layoutContainer.getChildCount(), 0), LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.setShouldHandleBottomInsets(baseFragment.getEdgeToEdgeSupportMode());
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
        this.containerView.setShouldHandleBottomInsets(baseFragment2.getEdgeToEdgeSupportMode());
        this.containerView.setDrawNavigationBar(baseFragment2.drawEdgeNavigationBar());
        baseFragment2.setInPreviewMode(false);
        baseFragment2.setInMenuMode(false);
        try {
            Activity activity = this.parentActivity;
            if (Theme.getColor(Theme.key_actionBarDefault) != -1 && (!baseFragment2.hasForceLightStatusBar() || Theme.getCurrentTheme().isDark())) {
                z = false;
            }
            AndroidUtilities.setLightStatusBar(activity, z);
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
                AndroidUtilities.setLightStatusBar(this.parentActivity, Theme.getColor(Theme.key_actionBarDefault) == -1 || (baseFragment.hasForceLightStatusBar() && !Theme.getCurrentTheme().isDark()));
                LayoutContainer layoutContainer = this.containerView;
                this.containerView = this.containerViewBack;
                this.containerViewBack = layoutContainer;
                baseFragment.setParentLayout(this);
                View viewPerformCreateView = baseFragment.fragmentView;
                if (viewPerformCreateView == null && (viewPerformCreateView = baseFragment.performCreateView(this.parentActivity)) != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
                    ViewCompat.setOnApplyWindowInsetsListener(viewPerformCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment));
                    this.containerView.invalidate();
                }
                if (!this.inPreviewMode) {
                    this.containerView.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) viewPerformCreateView.getParent();
                    if (viewGroup != null) {
                        baseFragment.onRemoveFromParent();
                        try {
                            viewGroup.removeView(viewPerformCreateView);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    this.containerView.addView(viewPerformCreateView);
                    this.containerView.setShouldHandleBottomInsets(baseFragment.getEdgeToEdgeSupportMode());
                    this.containerView.setDrawNavigationBar(baseFragment.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewPerformCreateView.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    viewPerformCreateView.setLayoutParams(layoutParams);
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
                if (!baseFragment.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
                    viewPerformCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                }
                if (z3) {
                    this.transitionAnimationStartTime = System.currentTimeMillis();
                    this.transitionAnimationInProgress = true;
                    this.layoutToIgnore = this.containerView;
                    baseFragment2.setRemovingFromStack(true);
                    this.onCloseAnimationEndRunnable = new Runnable() {
                        @Override
                        public final void run() {
                            ActionBarLayout.$r8$lambda$rVr9rDr_aoIyMUhaINoXFMCHFtc(this.f$0, baseFragment2, baseFragment);
                        }
                    };
                    if (!this.inPreviewMode && !this.transitionAnimationPreviewMode) {
                        animatorSetOnCustomTransitionAnimation = baseFragment2.onCustomTransitionAnimation(false, new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.onAnimationEndCheck(false);
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
                        ActionBarLayout.$r8$lambda$I0NoJTYOEbvWY3vyx8PzUDZtAv4(this.f$0, baseFragment2);
                    }
                };
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 1.0f, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 1.0f, 0.9f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 1.0f, 0.9f));
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
                    public void onAnimationEnd(Animator animator) {
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

    public static void $r8$lambda$rVr9rDr_aoIyMUhaINoXFMCHFtc(ActionBarLayout actionBarLayout, BaseFragment baseFragment, BaseFragment baseFragment2) {
        ViewGroup viewGroup;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = actionBarLayout.previewMenu;
        if (actionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindowLayout.getParent()) != null) {
            viewGroup.removeView(actionBarLayout.previewMenu);
        }
        if (actionBarLayout.inPreviewMode || actionBarLayout.transitionAnimationPreviewMode) {
            actionBarLayout.containerViewBack.setScaleX(1.0f);
            actionBarLayout.containerViewBack.setScaleY(1.0f);
            actionBarLayout.inPreviewMode = false;
            actionBarLayout.previewMenu = null;
            actionBarLayout.transitionAnimationPreviewMode = false;
        } else {
            actionBarLayout.containerViewBack.setTranslationX(0.0f);
        }
        actionBarLayout.closeLastFragmentInternalRemoveOld(baseFragment);
        baseFragment.setRemovingFromStack(false);
        baseFragment.onTransitionAnimationEnd(false, true);
        baseFragment2.onTransitionAnimationEnd(true, true);
        baseFragment2.onBecomeFullyVisible();
    }

    public static void $r8$lambda$I0NoJTYOEbvWY3vyx8PzUDZtAv4(ActionBarLayout actionBarLayout, BaseFragment baseFragment) {
        actionBarLayout.removeFragmentFromStackInternal(baseFragment, false);
        actionBarLayout.setVisibility(8);
        View view = actionBarLayout.backgroundView;
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
            View viewPerformCreateView = baseFragment2.fragmentView;
            if (viewPerformCreateView == null) {
                viewPerformCreateView = baseFragment2.performCreateView(this.parentActivity);
                if (viewPerformCreateView != null && baseFragment2.isSupportEdgeToEdge() && baseFragment2.drawEdgeNavigationBar()) {
                    ViewCompat.setOnApplyWindowInsetsListener(viewPerformCreateView, new ActionBarLayout$$ExternalSyntheticLambda5(baseFragment2));
                    this.containerView.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) viewPerformCreateView.getParent();
                if (viewGroup3 != null) {
                    baseFragment2.onRemoveFromParent();
                    viewGroup3.removeView(viewPerformCreateView);
                }
            }
            this.containerView.addView(viewPerformCreateView, LayoutHelper.createFrame(-1, -1.0f));
            this.containerView.setShouldHandleBottomInsets(baseFragment2.getEdgeToEdgeSupportMode());
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
            if (baseFragment2.hasOwnBackground || viewPerformCreateView.getBackground() != null) {
                return;
            }
            viewPerformCreateView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
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
    public void removeFragmentFromStack(BaseFragment baseFragment, boolean z) {
        List list;
        if (this.fragmentsStack.size() > 0) {
            List list2 = this.fragmentsStack;
            if (list2.get(list2.size() - 1) == baseFragment) {
                onOpenAnimationEnd();
                onCloseAnimationEnd();
            } else if (this.fragmentsStack.size() > 1) {
                list = this.fragmentsStack;
                if (list.get(list.size() - 2) == baseFragment) {
                    onOpenAnimationEnd();
                    onCloseAnimationEnd();
                }
            }
        } else if (this.fragmentsStack.size() > 1) {
            list = this.fragmentsStack;
            if (list.get(list.size() - 2) == baseFragment) {
                onOpenAnimationEnd();
                onCloseAnimationEnd();
            }
        }
        checkBlackScreen("removeFragmentFromStack " + z);
        if (this.useAlphaAnimations && this.fragmentsStack.size() == 1 && AndroidUtilities.isTablet()) {
            closeLastFragment(true);
            return;
        }
        if (this.delegate != null && this.fragmentsStack.size() == 1 && AndroidUtilities.isTablet()) {
            this.delegate.needCloseLastFragment(this);
        }
        removeFragmentFromStackInternal(baseFragment, baseFragment.allowFinishFragmentInsteadOfRemoveFromStack() && !z);
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
                    this.f$0.backgroundView.setVisibility(8);
                }
            }).start();
        }
    }

    public void setThemeAnimationValue(float f) {
        this.themeAnimationValue = f;
        int size = this.themeAnimatorDescriptions.size();
        int i = 0;
        while (i < size) {
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
                int iAlpha2 = Color.alpha(iArr[i2]);
                int iArgb = Color.argb(Math.min(255, (int) (iAlpha2 + ((iAlpha - iAlpha2) * f))), Math.min(255, (int) (iRed2 + ((iRed - iRed2) * f))), Math.min(255, (int) (iGreen2 + ((iGreen - iGreen2) * f))), Math.min(255, (int) (iBlue2 + ((iBlue - iBlue2) * f))));
                ThemeDescription themeDescription = (ThemeDescription) arrayList.get(i2);
                themeDescription.setAnimatedColor(iArgb);
                themeDescription.setColor(iArgb, false, false);
                i2++;
                i = i;
                size = i3;
            }
            i++;
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
    public void animateThemedValues(final INavigationLayout.ThemeAnimationSettings themeAnimationSettings, final Runnable runnable) {
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
            public final void run() {
                ActionBarLayout.m1232$r8$lambda$i1dfGW4gvrOfWHEPiZgmecrKs(this.f$0, size, themeAnimationSettings, runnable);
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

    public static void m1232$r8$lambda$i1dfGW4gvrOfWHEPiZgmecrKs(ActionBarLayout actionBarLayout, int i, final INavigationLayout.ThemeAnimationSettings themeAnimationSettings, Runnable runnable) {
        BaseFragment lastFragment;
        Runnable runnable2;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                lastFragment = actionBarLayout.getLastFragment();
            } else {
                if ((actionBarLayout.inPreviewMode || actionBarLayout.transitionAnimationPreviewMode) && actionBarLayout.fragmentsStack.size() > 1) {
                    List list = actionBarLayout.fragmentsStack;
                    lastFragment = (BaseFragment) list.get(list.size() - 2);
                }
            }
            if (lastFragment != null) {
                if (themeAnimationSettings.resourcesProvider != null) {
                    if (actionBarLayout.messageDrawableOutStart == null) {
                        MessageDrawable messageDrawable = new MessageDrawable(0, true, false, actionBarLayout.startColorsProvider);
                        actionBarLayout.messageDrawableOutStart = messageDrawable;
                        messageDrawable.isCrossfadeBackground = true;
                        MessageDrawable messageDrawable2 = new MessageDrawable(1, true, false, actionBarLayout.startColorsProvider);
                        actionBarLayout.messageDrawableOutMediaStart = messageDrawable2;
                        messageDrawable2.isCrossfadeBackground = true;
                    }
                    actionBarLayout.startColorsProvider.saveColors(themeAnimationSettings.resourcesProvider);
                }
                ArrayList<ThemeDescription> themeDescriptions = lastFragment.getThemeDescriptions();
                actionBarLayout.addStartDescriptions(themeDescriptions);
                Dialog dialog = lastFragment.visibleDialog;
                if (dialog instanceof BottomSheet) {
                    actionBarLayout.addStartDescriptions(((BottomSheet) dialog).getThemeDescriptions());
                } else if (dialog instanceof AlertDialog) {
                    actionBarLayout.addStartDescriptions(((AlertDialog) dialog).getThemeDescriptions());
                }
                if (i2 == 0 && (runnable2 = themeAnimationSettings.afterStartDescriptionsAddedRunnable) != null) {
                    runnable2.run();
                }
                actionBarLayout.addEndDescriptions(themeDescriptions);
                Dialog dialog2 = lastFragment.visibleDialog;
                if (dialog2 instanceof BottomSheet) {
                    actionBarLayout.addEndDescriptions(((BottomSheet) dialog2).getThemeDescriptions());
                } else if (dialog2 instanceof AlertDialog) {
                    actionBarLayout.addEndDescriptions(((AlertDialog) dialog2).getThemeDescriptions());
                }
                z = true;
            }
        }
        actionBarLayout.getClass();
        if (z) {
            if (!themeAnimationSettings.onlyTopFragment) {
                int size = actionBarLayout.fragmentsStack.size() - ((actionBarLayout.inPreviewMode || actionBarLayout.transitionAnimationPreviewMode) ? 2 : 1);
                for (int i3 = 0; i3 < size; i3++) {
                    BaseFragment baseFragment = (BaseFragment) actionBarLayout.fragmentsStack.get(i3);
                    baseFragment.clearViews();
                    baseFragment.setParentLayout(actionBarLayout);
                }
            }
            if (themeAnimationSettings.instant) {
                actionBarLayout.setThemeAnimationValue(1.0f);
                actionBarLayout.themeAnimatorDescriptions.clear();
                actionBarLayout.animateStartColors.clear();
                actionBarLayout.animateEndColors.clear();
                actionBarLayout.themeAnimatorDelegate.clear();
                actionBarLayout.presentingFragmentDescriptions = null;
                actionBarLayout.animationProgressListener = null;
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
            actionBarLayout.setThemeAnimationValue(0.0f);
            Runnable runnable4 = themeAnimationSettings.beforeAnimationRunnable;
            if (runnable4 != null) {
                runnable4.run();
            }
            INavigationLayout.ThemeAnimationSettings.onAnimationProgress onanimationprogress = themeAnimationSettings.animationProgress;
            actionBarLayout.animationProgressListener = onanimationprogress;
            if (onanimationprogress != null) {
                onanimationprogress.setProgress(0.0f);
            }
            actionBarLayout.notificationsLocker.lock();
            AnimatorSet animatorSet = new AnimatorSet();
            actionBarLayout.themeAnimatorSet = animatorSet;
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
                        ActionBarLayout actionBarLayout2 = ActionBarLayout.this;
                        actionBarLayout2.animationProgressListener = null;
                        actionBarLayout2.themeAnimatorSet = null;
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
                        ActionBarLayout actionBarLayout2 = ActionBarLayout.this;
                        actionBarLayout2.animationProgressListener = null;
                        actionBarLayout2.themeAnimatorSet = null;
                        Runnable runnable5 = themeAnimationSettings.afterAnimationRunnable;
                        if (runnable5 != null) {
                            runnable5.run();
                        }
                    }
                }
            });
            actionBarLayout.themeAnimatorSet.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
            actionBarLayout.themeAnimatorSet.setDuration(themeAnimationSettings.duration);
            actionBarLayout.themeAnimatorSet.start();
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

    private void onCloseAnimationEnd() {
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

    private void checkNeedRebuild() {
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

    private void onOpenAnimationEnd() {
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
    public void startActivityForResult(Intent intent, int i) {
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
    public MessageDrawable getMessageDrawableOutStart() {
        return this.messageDrawableOutStart;
    }

    @Override
    public MessageDrawable getMessageDrawableOutMediaStart() {
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
        if (this.fragmentsStack.isEmpty()) {
            return false;
        }
        List list = this.fragmentsStack;
        return ((BaseFragment) list.get(list.size() - 1)).extendActionMode(menu);
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
        return Collections.EMPTY_LIST;
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

    public static void m1230$r8$lambda$P9NMVBFozNo1lFmeoHq0CL3nSE(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.attached && actionBarLayout.getLastFragment() != null && actionBarLayout.containerView.getChildCount() == 0) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.lastActions)));
            }
            actionBarLayout.rebuildAllFragmentViews(true, true);
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
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        BaseFragment.AttachedSheet lastSheet;
        boolean z = motionEvent.getY() > ((float) ((getHeight() - getBottomTabsHeight(true)) - this.systemAndDisplayInsets.bottom));
        EmptyBaseFragment emptyBaseFragment = this.sheetFragment;
        BaseFragment.AttachedSheet attachedSheet = null;
        if (emptyBaseFragment == null || emptyBaseFragment.getLastSheet() == null) {
            lastSheet = null;
        } else {
            lastSheet = this.sheetFragment.getLastSheet();
            if (!lastSheet.attachedToParent() || lastSheet.mo1349getWindowView() == null) {
                lastSheet = null;
            }
        }
        if (lastSheet != null || getLastFragment() == null || getLastFragment().getLastSheet() == null) {
            attachedSheet = lastSheet;
        } else {
            lastSheet = getLastFragment().getLastSheet();
            if (lastSheet.attachedToParent() && lastSheet.mo1349getWindowView() != null) {
                attachedSheet = lastSheet;
            }
        }
        if (attachedSheet != null) {
            if (motionEvent.getAction() == 0) {
                this.tabsEvents = z;
            }
            if (!this.tabsEvents) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.tabsEvents = false;
                }
                return attachedSheet.mo1349getWindowView().dispatchTouchEvent(motionEvent);
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.tabsEvents = false;
        }
        return super.dispatchTouchEvent(motionEvent);
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
            if ((view instanceof LayoutContainer) && ((LayoutContainer) view).isSupportEdgeToEdge) {
                int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
                View view2 = getParent() instanceof View ? (View) getParent() : null;
                ViewCompat.dispatchApplyWindowInsets(view, new WindowInsetsCompat.Builder(WindowInsetsCompat.CONSUMED).setInsets(WindowInsetsCompat.Type.ime(), Insets.of(0, 0, 0, Math.max(0, i - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0)))).build());
                return;
            }
            ViewCompat.dispatchApplyWindowInsets(view, WindowInsetsCompat.CONSUMED);
            return;
        }
        boolean zIsRightLayout = isRightLayout();
        boolean z = (isLayersLayout() || zIsRightLayout || !(getParent() instanceof RelativeLayout)) ? false : true;
        Insets insets = this.systemAndDisplayInsets;
        Insets insets2 = this.systemAndDisplayAndImeInsets;
        if (view instanceof BottomSheetTabs) {
            AndroidUtilities.setViewLayoutMargins(view, zIsRightLayout ? 0 : insets.left, 0, z ? 0 : insets.right, insets.bottom);
            return;
        }
        if (view instanceof LayoutContainer) {
            LayoutContainer layoutContainer = (LayoutContainer) view;
            int bottomTabsHeight = getBottomTabsHeight(false);
            int iMax = bottomTabsHeight > 0 ? insets.bottom + bottomTabsHeight : 0;
            boolean z2 = layoutContainer.edgeToEdgeSupportMode == EdgeToEdgeSupportMode.FULL;
            int i2 = (z2 || zIsRightLayout) ? 0 : insets2.left;
            int i3 = (z2 || z) ? 0 : insets2.right;
            int i4 = (!z2 || zIsRightLayout) ? insets2.left : 0;
            int i5 = (!z2 || z) ? insets2.right : 0;
            if (layoutContainer.edgeToEdgeSupportMode == EdgeToEdgeSupportMode.NONE) {
                iMax = Math.max(iMax, insets2.bottom);
                ViewCompat.dispatchApplyWindowInsets(view, WindowInsetsCompat.CONSUMED);
            } else {
                ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat.inset(i4, 0, i5, iMax));
            }
            view.setPadding(i2, 0, i3, iMax);
        }
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        Insets defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, true);
        this.systemAndDisplayInsets = defaultWindowInsets;
        this.systemAndDisplayAndImeInsets = defaultWindowInsets2;
        this.lastWindowInsetsCompat = windowInsetsCompat;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            dispatchApplyWindowInsetsInternal(getChildAt(i), windowInsetsCompat);
        }
        return WindowInsetsCompat.CONSUMED;
    }
}
