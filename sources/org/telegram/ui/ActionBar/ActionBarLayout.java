package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.BackButtonMenu;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.LayoutHelper;

public class ActionBarLayout extends FrameLayout {
    private static Drawable headerShadowDrawable;
    private static Drawable layerShadowDrawable;
    private static Paint scrimPaint;
    private int animateSetThemeAccentIdAfterAnimation;
    private Theme.ThemeInfo animateSetThemeAfterAnimation;
    private boolean animateSetThemeNightAfterAnimation;
    private boolean animateThemeAfterAnimation;
    protected boolean animationInProgress;
    private float animationProgress;
    public ThemeAnimationSettings.onAnimationProgress animationProgressListener;
    private Runnable animationRunnable;
    private View backgroundView;
    private boolean beginTrackingSent;
    public LayoutContainer containerView;
    private LayoutContainer containerViewBack;
    private ActionBar currentActionBar;
    private AnimatorSet currentAnimation;
    private boolean delayedAnimationResumed;
    private Runnable delayedOpenAnimationRunnable;
    private ActionBarLayoutDelegate delegate;
    private DrawerLayoutContainer drawerLayoutContainer;
    public ArrayList<BaseFragment> fragmentsStack;
    private boolean inActionMode;
    private boolean inBubbleMode;
    private boolean inPreviewMode;
    public float innerTranslationX;
    private long lastFrameTime;
    private boolean maybeStartTracking;
    public Theme.MessageDrawable messageDrawableOutMediaStart;
    public Theme.MessageDrawable messageDrawableOutStart;
    private BaseFragment newFragment;
    private BaseFragment oldFragment;
    private Runnable onCloseAnimationEndRunnable;
    private Runnable onFragmentStackChangedListener;
    private Runnable onOpenAnimationEndRunnable;
    private Runnable overlayAction;
    protected Activity parentActivity;
    private ArrayList<ThemeDescription> presentingFragmentDescriptions;
    private ColorDrawable previewBackgroundDrawable;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout previewMenu;
    private boolean previewOpenAnimationInProgress;
    public ArrayList<BackButtonMenu.PulledDialog> pulledDialogs;
    private boolean rebuildAfterAnimation;
    private boolean rebuildLastAfterAnimation;
    private boolean removeActionBarExtraHeight;
    private boolean showLastAfterAnimation;
    protected boolean startedTracking;
    private int startedTrackingPointerId;
    private int startedTrackingX;
    private int startedTrackingY;
    private float themeAnimationValue;
    private AnimatorSet themeAnimatorSet;
    private String titleOverlayText;
    private int titleOverlayTextId;
    private boolean transitionAnimationInProgress;
    private boolean transitionAnimationPreviewMode;
    private long transitionAnimationStartTime;
    private boolean useAlphaAnimations;
    private VelocityTracker velocityTracker;
    private Runnable waitingForKeyboardCloseRunnable;
    public boolean highlightActionButtons = false;
    private DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
    private OvershootInterpolator overshootInterpolator = new OvershootInterpolator(1.02f);
    private AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
    private ArrayList<int[]> animateStartColors = new ArrayList<>();
    private ArrayList<int[]> animateEndColors = new ArrayList<>();
    StartColorsProvider startColorsProvider = new StartColorsProvider();
    private ArrayList<ArrayList<ThemeDescription>> themeAnimatorDescriptions = new ArrayList<>();
    private ArrayList<ThemeDescription.ThemeDescriptionDelegate> themeAnimatorDelegate = new ArrayList<>();
    private Rect rect = new Rect();
    private int overrideWidthOffset = -1;

    public interface ActionBarLayoutDelegate {
        boolean needAddFragmentToStack(BaseFragment baseFragment, ActionBarLayout actionBarLayout);

        boolean needCloseLastFragment(ActionBarLayout actionBarLayout);

        boolean needPresentFragment(BaseFragment baseFragment, boolean z, boolean z2, ActionBarLayout actionBarLayout);

        boolean onPreIme();

        void onRebuildAllFragments(ActionBarLayout actionBarLayout, boolean z);
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    static float access$1216(ActionBarLayout actionBarLayout, float f) {
        float f2 = actionBarLayout.animationProgress + f;
        actionBarLayout.animationProgress = f2;
        return f2;
    }

    public class LayoutContainer extends FrameLayout {
        private boolean allowToPressByHover;
        private int backgroundColor;
        private int fragmentPanTranslationOffset;
        private boolean isKeyboardVisible;
        private float pressX;
        private float pressY;
        private boolean wasPortrait;
        private Rect rect = new Rect();
        private Paint backgroundPaint = new Paint();

        public LayoutContainer(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            int i;
            int i2;
            if (view instanceof ActionBar) {
                return super.drawChild(canvas, view, j);
            }
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i3);
                if (childAt == view || !(childAt instanceof ActionBar) || childAt.getVisibility() != 0) {
                    i3++;
                } else if (((ActionBar) childAt).getCastShadows()) {
                    i2 = childAt.getMeasuredHeight();
                    i = (int) childAt.getY();
                }
            }
            i2 = 0;
            i = 0;
            boolean drawChild = super.drawChild(canvas, view, j);
            if (!(i2 == 0 || ActionBarLayout.headerShadowDrawable == null)) {
                int i4 = i + i2;
                ActionBarLayout.headerShadowDrawable.setBounds(0, i4, getMeasuredWidth(), ActionBarLayout.headerShadowDrawable.getIntrinsicHeight() + i4);
                ActionBarLayout.headerShadowDrawable.draw(canvas);
            }
            return drawChild;
        }

        @Override
        public boolean hasOverlappingRendering() {
            return Build.VERSION.SDK_INT >= 28;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            boolean z = size2 > size;
            if (this.wasPortrait != z && ActionBarLayout.this.isInPreviewMode()) {
                ActionBarLayout.this.finishPreviewFragment();
            }
            this.wasPortrait = z;
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    i3 = 0;
                    break;
                }
                View childAt = getChildAt(i4);
                if (childAt instanceof ActionBar) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    i3 = childAt.getMeasuredHeight();
                    break;
                }
                i4++;
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = getChildAt(i5);
                if (!(childAt2 instanceof ActionBar)) {
                    if (childAt2.getFitsSystemWindows()) {
                        measureChildWithMargins(childAt2, i, 0, i2, 0);
                    } else {
                        measureChildWithMargins(childAt2, i, 0, i2, i3);
                    }
                }
            }
            setMeasuredDimension(size, size2);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int childCount = getChildCount();
            boolean z2 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    i5 = 0;
                    break;
                }
                View childAt = getChildAt(i6);
                if (childAt instanceof ActionBar) {
                    i5 = childAt.getMeasuredHeight();
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), i5);
                    break;
                }
                i6++;
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = getChildAt(i7);
                if (!(childAt2 instanceof ActionBar)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getFitsSystemWindows()) {
                        int i8 = layoutParams.leftMargin;
                        childAt2.layout(i8, layoutParams.topMargin, childAt2.getMeasuredWidth() + i8, layoutParams.topMargin + childAt2.getMeasuredHeight());
                    } else {
                        int i9 = layoutParams.leftMargin;
                        childAt2.layout(i9, layoutParams.topMargin + i5, childAt2.getMeasuredWidth() + i9, layoutParams.topMargin + i5 + childAt2.getMeasuredHeight());
                    }
                }
            }
            View rootView = getRootView();
            getWindowVisibleDisplayFrame(this.rect);
            int height = (rootView.getHeight() - (this.rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView);
            Rect rect = this.rect;
            if (height - (rect.bottom - rect.top) > 0) {
                z2 = true;
            }
            this.isKeyboardVisible = z2;
            if (ActionBarLayout.this.waitingForKeyboardCloseRunnable != null) {
                ActionBarLayout actionBarLayout = ActionBarLayout.this;
                if (!(actionBarLayout.containerView.isKeyboardVisible || actionBarLayout.containerViewBack.isKeyboardVisible)) {
                    AndroidUtilities.cancelRunOnUIThread(ActionBarLayout.this.waitingForKeyboardCloseRunnable);
                    ActionBarLayout.this.waitingForKeyboardCloseRunnable.run();
                    ActionBarLayout.this.waitingForKeyboardCloseRunnable = null;
                }
            }
        }

        @Override
        public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.LayoutContainer.dispatchTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.fragmentPanTranslationOffset != 0) {
                if (this.backgroundColor != Theme.getColor("windowBackgroundWhite")) {
                    Paint paint = this.backgroundPaint;
                    int color = Theme.getColor("windowBackgroundWhite");
                    this.backgroundColor = color;
                    paint.setColor(color);
                }
                canvas.drawRect(0.0f, (getMeasuredHeight() - this.fragmentPanTranslationOffset) - 3, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
            }
            super.onDraw(canvas);
        }

        public void setFragmentPanTranslationOffset(int i) {
            this.fragmentPanTranslationOffset = i;
            invalidate();
        }

        public void processMenuButtonsTouch(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.pressX = motionEvent.getX();
                this.pressY = motionEvent.getY();
                this.allowToPressByHover = false;
            } else if ((motionEvent.getAction() == 2 || motionEvent.getAction() == 1) && ActionBarLayout.this.previewMenu != null && ActionBarLayout.this.highlightActionButtons) {
                if (!this.allowToPressByHover && Math.sqrt(Math.pow(this.pressX - motionEvent.getX(), 2.0d) + Math.pow(this.pressY - motionEvent.getY(), 2.0d)) > AndroidUtilities.dp(30.0f)) {
                    this.allowToPressByHover = true;
                }
                if (this.allowToPressByHover && (ActionBarLayout.this.previewMenu.getSwipeBack() == null || !ActionBarLayout.this.previewMenu.getSwipeBack().isForegroundOpen())) {
                    for (int i = 0; i < ActionBarLayout.this.previewMenu.getItemsCount(); i++) {
                        ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) ActionBarLayout.this.previewMenu.getItemAt(i);
                        if (actionBarMenuSubItem != null) {
                            Drawable background = actionBarMenuSubItem.getBackground();
                            Rect rect = AndroidUtilities.rectTmp2;
                            actionBarMenuSubItem.getGlobalVisibleRect(rect);
                            boolean contains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
                            boolean z = background.getState().length == 2;
                            if (motionEvent.getAction() == 2) {
                                if (contains != z) {
                                    background.setState(contains ? new int[]{16842919, 16842910} : new int[0]);
                                    if (contains) {
                                        try {
                                            actionBarMenuSubItem.performHapticFeedback(9, 1);
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            } else if (motionEvent.getAction() == 1 && contains) {
                                actionBarMenuSubItem.performClick();
                            }
                        }
                    }
                }
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (ActionBarLayout.this.previewMenu != null && ActionBarLayout.this.highlightActionButtons) {
                    int i2 = 255;
                    if (Build.VERSION.SDK_INT >= 19) {
                        i2 = Theme.moveUpDrawable.getAlpha();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(i2, 0.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ActionBarLayout.LayoutContainer.this.lambda$processMenuButtonsTouch$0(valueAnimator);
                        }
                    });
                    ofFloat.setDuration(150L);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                    ofFloat.setInterpolator(cubicBezierInterpolator);
                    ofFloat.start();
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ActionBarLayout.this.containerView, View.TRANSLATION_Y, 0.0f);
                    ofFloat2.setDuration(150L);
                    ofFloat2.setInterpolator(cubicBezierInterpolator);
                    ofFloat2.start();
                }
                ActionBarLayout.this.highlightActionButtons = false;
            }
        }

        public void lambda$processMenuButtonsTouch$0(ValueAnimator valueAnimator) {
            Theme.moveUpDrawable.setAlpha(((Float) valueAnimator.getAnimatedValue()).intValue());
            if (ActionBarLayout.this.drawerLayoutContainer != null) {
                ActionBarLayout.this.drawerLayoutContainer.invalidate();
            }
            LayoutContainer layoutContainer = ActionBarLayout.this.containerView;
            if (layoutContainer != null) {
                layoutContainer.invalidate();
            }
            ActionBarLayout.this.invalidate();
        }
    }

    public static class ThemeAnimationSettings {
        public final int accentId;
        public Runnable afterAnimationRunnable;
        public Runnable afterStartDescriptionsAddedRunnable;
        public onAnimationProgress animationProgress;
        public Runnable beforeAnimationRunnable;
        public final boolean instant;
        public final boolean nightTheme;
        public boolean onlyTopFragment;
        public Theme.ResourcesProvider resourcesProvider;
        public final Theme.ThemeInfo theme;
        public boolean applyTheme = true;
        public long duration = 200;

        public interface onAnimationProgress {
            void setProgress(float f);
        }

        public ThemeAnimationSettings(Theme.ThemeInfo themeInfo, int i, boolean z, boolean z2) {
            this.theme = themeInfo;
            this.accentId = i;
            this.nightTheme = z;
            this.instant = z2;
        }
    }

    public ActionBarLayout(Context context) {
        super(context);
        this.parentActivity = (Activity) context;
        if (layerShadowDrawable == null) {
            layerShadowDrawable = getResources().getDrawable(R.drawable.layer_shadow);
            headerShadowDrawable = getResources().getDrawable(R.drawable.header_shadow).mutate();
            scrimPaint = new Paint();
        }
    }

    public void init(ArrayList<BaseFragment> arrayList) {
        this.fragmentsStack = arrayList;
        LayoutContainer layoutContainer = new LayoutContainer(this.parentActivity);
        this.containerViewBack = layoutContainer;
        addView(layoutContainer);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.containerViewBack.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 51;
        this.containerViewBack.setLayoutParams(layoutParams);
        LayoutContainer layoutContainer2 = new LayoutContainer(this.parentActivity);
        this.containerView = layoutContainer2;
        addView(layoutContainer2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.containerView.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.containerView.setLayoutParams(layoutParams2);
        Iterator<BaseFragment> it = this.fragmentsStack.iterator();
        while (it.hasNext()) {
            it.next().setParentLayout(this);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.fragmentsStack.isEmpty()) {
            int size = this.fragmentsStack.size();
            for (int i = 0; i < size; i++) {
                BaseFragment baseFragment = this.fragmentsStack.get(i);
                baseFragment.onConfigurationChanged(configuration);
                Dialog dialog = baseFragment.visibleDialog;
                if (dialog instanceof BottomSheet) {
                    ((BottomSheet) dialog).onConfigurationChanged(configuration);
                }
            }
        }
    }

    public void drawHeaderShadow(Canvas canvas, int i) {
        drawHeaderShadow(canvas, 255, i);
    }

    public void setInBubbleMode(boolean z) {
        this.inBubbleMode = z;
    }

    public boolean isInBubbleMode() {
        return this.inBubbleMode;
    }

    public void drawHeaderShadow(Canvas canvas, int i, int i2) {
        Drawable drawable = headerShadowDrawable;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT < 19) {
                drawable.setAlpha(i);
            } else if (drawable.getAlpha() != i) {
                headerShadowDrawable.setAlpha(i);
            }
            headerShadowDrawable.setBounds(0, i2, getMeasuredWidth(), headerShadowDrawable.getIntrinsicHeight() + i2);
            headerShadowDrawable.draw(canvas);
        }
    }

    @Keep
    public void setInnerTranslationX(float f) {
        int navigationBarColor;
        int navigationBarColor2;
        this.innerTranslationX = f;
        invalidate();
        if (this.fragmentsStack.size() >= 2 && this.containerView.getMeasuredWidth() > 0) {
            float measuredWidth = f / this.containerView.getMeasuredWidth();
            ArrayList<BaseFragment> arrayList = this.fragmentsStack;
            BaseFragment baseFragment = arrayList.get(arrayList.size() - 2);
            int i = 0;
            baseFragment.onSlideProgress(false, measuredWidth);
            ArrayList<BaseFragment> arrayList2 = this.fragmentsStack;
            BaseFragment baseFragment2 = arrayList2.get(arrayList2.size() - 1);
            float clamp = MathUtils.clamp(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (baseFragment2.isBeginToShow() && (navigationBarColor = baseFragment2.getNavigationBarColor()) != (navigationBarColor2 = baseFragment.getNavigationBarColor())) {
                baseFragment2.setNavigationBarColor(ColorUtils.blendARGB(navigationBarColor, navigationBarColor2, clamp));
            }
            if (!baseFragment2.inPreviewMode && Build.VERSION.SDK_INT >= 23 && !SharedConfig.noStatusBar) {
                int i2 = Theme.getColor("actionBarDefault") == -1 ? AndroidUtilities.LIGHT_STATUS_BAR_OVERLAY : AndroidUtilities.DARK_STATUS_BAR_OVERLAY;
                int i3 = baseFragment.hasForceLightStatusBar() ? 0 : i2;
                if (!baseFragment2.hasForceLightStatusBar()) {
                    i = i2;
                }
                this.parentActivity.getWindow().setStatusBarColor(ColorUtils.blendARGB(i, i3, clamp));
            }
        }
    }

    @Keep
    public float getInnerTranslationX() {
        return this.innerTranslationX;
    }

    public void dismissDialogs() {
        if (!this.fragmentsStack.isEmpty()) {
            ArrayList<BaseFragment> arrayList = this.fragmentsStack;
            arrayList.get(arrayList.size() - 1).dismissCurrentDialog();
        }
    }

    public void onResume() {
        if (this.transitionAnimationInProgress) {
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.currentAnimation = null;
            }
            Runnable runnable = this.animationRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.animationRunnable = null;
            }
            Runnable runnable2 = this.waitingForKeyboardCloseRunnable;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                this.waitingForKeyboardCloseRunnable = null;
            }
            if (this.onCloseAnimationEndRunnable != null) {
                onCloseAnimationEnd();
            } else if (this.onOpenAnimationEndRunnable != null) {
                onOpenAnimationEnd();
            }
        }
        if (!this.fragmentsStack.isEmpty()) {
            ArrayList<BaseFragment> arrayList = this.fragmentsStack;
            arrayList.get(arrayList.size() - 1).onResume();
        }
    }

    public void onUserLeaveHint() {
        if (!this.fragmentsStack.isEmpty()) {
            ArrayList<BaseFragment> arrayList = this.fragmentsStack;
            arrayList.get(arrayList.size() - 1).onUserLeaveHint();
        }
    }

    public void onPause() {
        if (!this.fragmentsStack.isEmpty()) {
            ArrayList<BaseFragment> arrayList = this.fragmentsStack;
            arrayList.get(arrayList.size() - 1).onPause();
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
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        ActionBarLayoutDelegate actionBarLayoutDelegate = this.delegate;
        return (actionBarLayoutDelegate != null && actionBarLayoutDelegate.onPreIme()) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        LayoutContainer layoutContainer;
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
        } else if (view == this.containerView) {
            paddingLeft = paddingRight;
        }
        int save = canvas.save();
        if (!isTransitionAnimationInProgress() && !this.inPreviewMode) {
            canvas.clipRect(paddingLeft, 0, paddingLeft2, getHeight());
        }
        if ((this.inPreviewMode || this.transitionAnimationPreviewMode) && view == (layoutContainer = this.containerView)) {
            drawPreviewDrawables(canvas, layoutContainer);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (!(paddingRight == 0 && this.overrideWidthOffset == -1)) {
            int i = this.overrideWidthOffset;
            if (i == -1) {
                i = width - paddingRight;
            }
            if (view == this.containerView) {
                float clamp = MathUtils.clamp(i / AndroidUtilities.dp(20.0f), 0.0f, 1.0f);
                Drawable drawable = layerShadowDrawable;
                drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom());
                layerShadowDrawable.setAlpha((int) (clamp * 255.0f));
                layerShadowDrawable.draw(canvas);
            } else if (view == this.containerViewBack) {
                scrimPaint.setColor(Color.argb((int) (MathUtils.clamp(i / width, 0.0f, 0.8f) * 153.0f), 0, 0, 0));
                if (this.overrideWidthOffset != -1) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), scrimPaint);
                } else {
                    canvas.drawRect(paddingLeft, 0.0f, paddingLeft2, getHeight(), scrimPaint);
                }
            }
        }
        return drawChild;
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

    public void drawCurrentPreviewFragment(Canvas canvas, Drawable drawable) {
        if (this.inPreviewMode || this.transitionAnimationPreviewMode || this.previewOpenAnimationInProgress) {
            BaseFragment baseFragment = this.oldFragment;
            LayoutContainer layoutContainer = (baseFragment == null || !baseFragment.inPreviewMode) ? this.containerView : this.containerViewBack;
            drawPreviewDrawables(canvas, layoutContainer);
            if (layoutContainer.getAlpha() < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (layoutContainer.getAlpha() * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.concat(layoutContainer.getMatrix());
            layoutContainer.draw(canvas);
            if (drawable != null) {
                int i = 0;
                View childAt = layoutContainer.getChildAt(0);
                if (childAt != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    Rect rect = new Rect();
                    childAt.getLocalVisibleRect(rect);
                    rect.offset(marginLayoutParams.leftMargin, marginLayoutParams.topMargin);
                    int i2 = rect.top;
                    if (Build.VERSION.SDK_INT >= 21) {
                        i = AndroidUtilities.statusBarHeight - 1;
                    }
                    rect.top = i2 + i;
                    drawable.setAlpha((int) (layoutContainer.getAlpha() * 255.0f));
                    drawable.setBounds(rect);
                    drawable.draw(canvas);
                }
            }
            canvas.restore();
        }
    }

    private void drawPreviewDrawables(Canvas canvas, ViewGroup viewGroup) {
        int i = 0;
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            this.previewBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.previewBackgroundDrawable.draw(canvas);
            if (this.previewMenu == null) {
                int dp = AndroidUtilities.dp(32.0f);
                int i2 = dp / 2;
                int measuredWidth = (getMeasuredWidth() - dp) / 2;
                float top = childAt.getTop() + viewGroup.getTranslationY();
                if (Build.VERSION.SDK_INT < 21) {
                    i = 20;
                }
                int dp2 = (int) (top - AndroidUtilities.dp(i + 12));
                Theme.moveUpDrawable.setBounds(measuredWidth, dp2, dp + measuredWidth, i2 + dp2);
                Theme.moveUpDrawable.draw(canvas);
            }
        }
    }

    public void setDelegate(ActionBarLayoutDelegate actionBarLayoutDelegate) {
        this.delegate = actionBarLayoutDelegate;
    }

    public void onSlideAnimationEnd(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!z) {
            if (this.fragmentsStack.size() >= 2) {
                ArrayList<BaseFragment> arrayList = this.fragmentsStack;
                BaseFragment baseFragment = arrayList.get(arrayList.size() - 1);
                baseFragment.prepareFragmentToSlide(true, false);
                baseFragment.onPause();
                baseFragment.onFragmentDestroy();
                baseFragment.setParentLayout(null);
                ArrayList<BaseFragment> arrayList2 = this.fragmentsStack;
                arrayList2.remove(arrayList2.size() - 1);
                onFragmentStackChanged();
                LayoutContainer layoutContainer = this.containerView;
                LayoutContainer layoutContainer2 = this.containerViewBack;
                this.containerView = layoutContainer2;
                this.containerViewBack = layoutContainer;
                bringChildToFront(layoutContainer2);
                ArrayList<BaseFragment> arrayList3 = this.fragmentsStack;
                BaseFragment baseFragment2 = arrayList3.get(arrayList3.size() - 1);
                this.currentActionBar = baseFragment2.actionBar;
                baseFragment2.onResume();
                baseFragment2.onBecomeFullyVisible();
                baseFragment2.prepareFragmentToSlide(false, false);
            } else {
                return;
            }
        } else if (this.fragmentsStack.size() >= 2) {
            ArrayList<BaseFragment> arrayList4 = this.fragmentsStack;
            arrayList4.get(arrayList4.size() - 1).prepareFragmentToSlide(true, false);
            ArrayList<BaseFragment> arrayList5 = this.fragmentsStack;
            BaseFragment baseFragment3 = arrayList5.get(arrayList5.size() - 2);
            baseFragment3.prepareFragmentToSlide(false, false);
            baseFragment3.onPause();
            View view = baseFragment3.fragmentView;
            if (!(view == null || (viewGroup2 = (ViewGroup) view.getParent()) == null)) {
                baseFragment3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(baseFragment3.fragmentView);
            }
            ActionBar actionBar = baseFragment3.actionBar;
            if (!(actionBar == null || !actionBar.shouldAddToContainer() || (viewGroup = (ViewGroup) baseFragment3.actionBar.getParent()) == null)) {
                viewGroup.removeViewInLayout(baseFragment3.actionBar);
            }
        }
        this.containerViewBack.setVisibility(4);
        this.startedTracking = false;
        this.animationInProgress = false;
        this.containerView.setTranslationX(0.0f);
        this.containerViewBack.setTranslationX(0.0f);
        setInnerTranslationX(0.0f);
    }

    private void prepareForMoving(MotionEvent motionEvent) {
        this.maybeStartTracking = false;
        this.startedTracking = true;
        this.startedTrackingX = (int) motionEvent.getX();
        this.containerViewBack.setVisibility(0);
        this.beginTrackingSent = false;
        ArrayList<BaseFragment> arrayList = this.fragmentsStack;
        BaseFragment baseFragment = arrayList.get(arrayList.size() - 2);
        View view = baseFragment.fragmentView;
        if (view == null) {
            view = baseFragment.createView(this.parentActivity);
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            baseFragment.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.containerViewBack.addView(view);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        ActionBar actionBar = baseFragment.actionBar;
        if (actionBar != null && actionBar.shouldAddToContainer()) {
            ViewGroup viewGroup2 = (ViewGroup) baseFragment.actionBar.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(baseFragment.actionBar);
            }
            if (this.removeActionBarExtraHeight) {
                baseFragment.actionBar.setOccupyStatusBar(false);
            }
            this.containerViewBack.addView(baseFragment.actionBar);
            baseFragment.actionBar.setTitleOverlayText(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
        }
        if (!baseFragment.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        }
        baseFragment.onResume();
        if (this.themeAnimatorSet != null) {
            this.presentingFragmentDescriptions = baseFragment.getThemeDescriptions();
        }
        ArrayList<BaseFragment> arrayList2 = this.fragmentsStack;
        arrayList2.get(arrayList2.size() - 1).prepareFragmentToSlide(true, true);
        baseFragment.prepareFragmentToSlide(false, true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Animator customSlideTransition;
        LayoutContainer layoutContainer;
        if (checkTransitionAnimation() || this.inActionMode || this.animationInProgress) {
            return false;
        }
        if (this.fragmentsStack.size() > 1) {
            if (motionEvent != null && motionEvent.getAction() == 0) {
                ArrayList<BaseFragment> arrayList = this.fragmentsStack;
                if (!arrayList.get(arrayList.size() - 1).isSwipeBackEnabled(motionEvent)) {
                    this.maybeStartTracking = false;
                    this.startedTracking = false;
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
                int max = Math.max(0, (int) (motionEvent.getX() - this.startedTrackingX));
                int abs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                this.velocityTracker.addMovement(motionEvent);
                if (!this.transitionAnimationInProgress && !this.inPreviewMode && this.maybeStartTracking && !this.startedTracking && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                    ArrayList<BaseFragment> arrayList2 = this.fragmentsStack;
                    if (!arrayList2.get(arrayList2.size() - 1).canBeginSlide() || findScrollingChild(this, motionEvent.getX(), motionEvent.getY()) != null) {
                        this.maybeStartTracking = false;
                    } else {
                        prepareForMoving(motionEvent);
                    }
                } else if (this.startedTracking) {
                    if (!this.beginTrackingSent) {
                        if (this.parentActivity.getCurrentFocus() != null) {
                            AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
                        }
                        ArrayList<BaseFragment> arrayList3 = this.fragmentsStack;
                        arrayList3.get(arrayList3.size() - 1).onBeginSlide();
                        this.beginTrackingSent = true;
                    }
                    float f = max;
                    this.containerView.setTranslationX(f);
                    setInnerTranslationX(f);
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.computeCurrentVelocity(1000);
                ArrayList<BaseFragment> arrayList4 = this.fragmentsStack;
                BaseFragment baseFragment = arrayList4.get(arrayList4.size() - 1);
                if (!this.inPreviewMode && !this.transitionAnimationPreviewMode && !this.startedTracking && baseFragment.isSwipeBackEnabled(motionEvent)) {
                    float xVelocity = this.velocityTracker.getXVelocity();
                    float yVelocity = this.velocityTracker.getYVelocity();
                    if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && baseFragment.canBeginSlide()) {
                        prepareForMoving(motionEvent);
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
                    AnimatorSet animatorSet = new AnimatorSet();
                    float xVelocity2 = this.velocityTracker.getXVelocity();
                    final boolean z = x < ((float) this.containerView.getMeasuredWidth()) / 3.0f && (xVelocity2 < 3500.0f || xVelocity2 < this.velocityTracker.getYVelocity());
                    boolean shouldOverrideSlideTransition = baseFragment.shouldOverrideSlideTransition(false, z);
                    if (!z) {
                        x = this.containerView.getMeasuredWidth() - x;
                        int max2 = Math.max((int) ((200.0f / this.containerView.getMeasuredWidth()) * x), 50);
                        if (!shouldOverrideSlideTransition) {
                            long j = max2;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(this.containerView, View.TRANSLATION_X, layoutContainer.getMeasuredWidth()).setDuration(j), ObjectAnimator.ofFloat(this, "innerTranslationX", this.containerView.getMeasuredWidth()).setDuration(j));
                        }
                    } else {
                        int max3 = Math.max((int) ((200.0f / this.containerView.getMeasuredWidth()) * x), 50);
                        if (!shouldOverrideSlideTransition) {
                            long j2 = max3;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(this.containerView, View.TRANSLATION_X, 0.0f).setDuration(j2), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j2));
                        }
                    }
                    Animator customSlideTransition2 = baseFragment.getCustomSlideTransition(false, z, x);
                    if (customSlideTransition2 != null) {
                        animatorSet.playTogether(customSlideTransition2);
                    }
                    ArrayList<BaseFragment> arrayList5 = this.fragmentsStack;
                    BaseFragment baseFragment2 = arrayList5.get(arrayList5.size() - 2);
                    if (!(baseFragment2 == null || (customSlideTransition = baseFragment2.getCustomSlideTransition(false, z, x)) == null)) {
                        animatorSet.playTogether(customSlideTransition);
                    }
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ActionBarLayout.this.onSlideAnimationEnd(z);
                        }
                    });
                    animatorSet.start();
                    this.animationInProgress = true;
                } else {
                    this.maybeStartTracking = false;
                    this.startedTracking = false;
                }
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.velocityTracker = null;
                }
            } else if (motionEvent == null) {
                this.maybeStartTracking = false;
                this.startedTracking = false;
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.velocityTracker = null;
                }
            }
        }
        return this.startedTracking;
    }

    public void onBackPressed() {
        if (!this.transitionAnimationPreviewMode && !this.startedTracking && !checkTransitionAnimation() && !this.fragmentsStack.isEmpty() && !GroupCallPip.onBackPressed()) {
            ActionBar actionBar = this.currentActionBar;
            if (actionBar != null && !actionBar.isActionModeShowed()) {
                ActionBar actionBar2 = this.currentActionBar;
                if (actionBar2.isSearchFieldVisible) {
                    actionBar2.closeSearchField();
                    return;
                }
            }
            ArrayList<BaseFragment> arrayList = this.fragmentsStack;
            if (arrayList.get(arrayList.size() - 1).onBackPressed() && !this.fragmentsStack.isEmpty()) {
                closeLastFragment(true);
            }
        }
    }

    public void onLowMemory() {
        Iterator<BaseFragment> it = this.fragmentsStack.iterator();
        while (it.hasNext()) {
            it.next().onLowMemory();
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

    public BaseFragment getLastFragment() {
        if (this.fragmentsStack.isEmpty()) {
            return null;
        }
        ArrayList<BaseFragment> arrayList = this.fragmentsStack;
        return arrayList.get(arrayList.size() - 1);
    }

    public boolean checkTransitionAnimation() {
        if (this.transitionAnimationPreviewMode) {
            return false;
        }
        if (this.transitionAnimationInProgress && this.transitionAnimationStartTime < System.currentTimeMillis() - 1500) {
            onAnimationEndCheck(true);
        }
        return this.transitionAnimationInProgress;
    }

    public boolean isPreviewOpenAnimationInProgress() {
        return this.previewOpenAnimationInProgress;
    }

    public boolean isTransitionAnimationInProgress() {
        return this.transitionAnimationInProgress || this.animationInProgress;
    }

    private void presentFragmentInternalRemoveOld(boolean z, BaseFragment baseFragment) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (baseFragment != null) {
            baseFragment.onBecomeFullyHidden();
            baseFragment.onPause();
            if (z) {
                baseFragment.onFragmentDestroy();
                baseFragment.setParentLayout(null);
                this.fragmentsStack.remove(baseFragment);
                onFragmentStackChanged();
            } else {
                View view = baseFragment.fragmentView;
                if (!(view == null || (viewGroup2 = (ViewGroup) view.getParent()) == null)) {
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
                if (!(actionBar == null || !actionBar.shouldAddToContainer() || (viewGroup = (ViewGroup) baseFragment.actionBar.getParent()) == null)) {
                    viewGroup.removeViewInLayout(baseFragment.actionBar);
                }
            }
            this.containerViewBack.setVisibility(4);
        }
    }

    public boolean presentFragmentAsPreview(BaseFragment baseFragment) {
        return presentFragment(baseFragment, false, false, true, true, null);
    }

    public boolean presentFragmentAsPreviewWithMenu(BaseFragment baseFragment, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        return presentFragment(baseFragment, false, false, true, true, actionBarPopupWindowLayout);
    }

    public boolean presentFragment(BaseFragment baseFragment) {
        return presentFragment(baseFragment, false, false, true, false, null);
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z) {
        return presentFragment(baseFragment, z, false, true, false, null);
    }

    public void startLayoutAnimation(final boolean z, final boolean z2, final boolean z3) {
        if (z2) {
            this.animationProgress = 0.0f;
            this.lastFrameTime = System.nanoTime() / 1000000;
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (ActionBarLayout.this.animationRunnable == this) {
                    Integer num = null;
                    ActionBarLayout.this.animationRunnable = null;
                    if (z2) {
                        ActionBarLayout.this.transitionAnimationStartTime = System.currentTimeMillis();
                    }
                    long nanoTime = System.nanoTime() / 1000000;
                    long j = nanoTime - ActionBarLayout.this.lastFrameTime;
                    if (j > 18) {
                        j = 18;
                    }
                    ActionBarLayout.this.lastFrameTime = nanoTime;
                    ActionBarLayout.access$1216(ActionBarLayout.this, ((float) j) / ((!z3 || !z) ? 150.0f : 190.0f));
                    if (ActionBarLayout.this.animationProgress > 1.0f) {
                        ActionBarLayout.this.animationProgress = 1.0f;
                    }
                    if (ActionBarLayout.this.newFragment != null) {
                        ActionBarLayout.this.newFragment.onTransitionAnimationProgress(true, ActionBarLayout.this.animationProgress);
                    }
                    if (ActionBarLayout.this.oldFragment != null) {
                        ActionBarLayout.this.oldFragment.onTransitionAnimationProgress(false, ActionBarLayout.this.animationProgress);
                    }
                    Integer valueOf = ActionBarLayout.this.oldFragment != null ? Integer.valueOf(ActionBarLayout.this.oldFragment.getNavigationBarColor()) : null;
                    if (ActionBarLayout.this.newFragment != null) {
                        num = Integer.valueOf(ActionBarLayout.this.newFragment.getNavigationBarColor());
                    }
                    if (!(ActionBarLayout.this.newFragment == null || valueOf == null)) {
                        ActionBarLayout.this.newFragment.setNavigationBarColor(ColorUtils.blendARGB(valueOf.intValue(), num.intValue(), MathUtils.clamp((ActionBarLayout.this.animationProgress * 2.0f) - (z ? 1.0f : 0.0f), 0.0f, 1.0f)));
                    }
                    float interpolation = z3 ? z ? ActionBarLayout.this.overshootInterpolator.getInterpolation(ActionBarLayout.this.animationProgress) : CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(ActionBarLayout.this.animationProgress) : ActionBarLayout.this.decelerateInterpolator.getInterpolation(ActionBarLayout.this.animationProgress);
                    if (z) {
                        float clamp = MathUtils.clamp(interpolation, 0.0f, 1.0f);
                        ActionBarLayout.this.containerView.setAlpha(clamp);
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
                            ActionBarLayout.this.previewBackgroundDrawable.setAlpha((int) (46.0f * clamp));
                            Theme.moveUpDrawable.setAlpha((int) (clamp * 255.0f));
                            ActionBarLayout.this.containerView.invalidate();
                            ActionBarLayout.this.invalidate();
                        } else {
                            ActionBarLayout.this.containerView.setTranslationX(AndroidUtilities.dp(48.0f) * (1.0f - interpolation));
                        }
                    } else {
                        float f4 = 1.0f - interpolation;
                        float clamp2 = MathUtils.clamp(f4, 0.0f, 1.0f);
                        ActionBarLayout.this.containerViewBack.setAlpha(clamp2);
                        if (z3) {
                            float f5 = (f4 * 0.1f) + 0.9f;
                            ActionBarLayout.this.containerViewBack.setScaleX(f5);
                            ActionBarLayout.this.containerViewBack.setScaleY(f5);
                            ActionBarLayout.this.previewBackgroundDrawable.setAlpha((int) (46.0f * clamp2));
                            if (ActionBarLayout.this.previewMenu == null) {
                                Theme.moveUpDrawable.setAlpha((int) (clamp2 * 255.0f));
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
            }
        };
        this.animationRunnable = runnable;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void resumeDelayedFragmentAnimation() {
        this.delayedAnimationResumed = true;
        Runnable runnable = this.delayedOpenAnimationRunnable;
        if (runnable != null && this.waitingForKeyboardCloseRunnable == null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.delayedOpenAnimationRunnable.run();
            this.delayedOpenAnimationRunnable = null;
        }
    }

    public boolean isInPreviewMode() {
        return this.inPreviewMode || this.transitionAnimationPreviewMode;
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2, boolean z3, boolean z4) {
        return presentFragment(baseFragment, z, z2, z3, z4, null);
    }

    public boolean presentFragment(final BaseFragment baseFragment, final boolean z, boolean z2, boolean z3, final boolean z4, final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        ActionBarLayoutDelegate actionBarLayoutDelegate;
        final BaseFragment baseFragment2;
        int i;
        if (baseFragment == null || checkTransitionAnimation() || (((actionBarLayoutDelegate = this.delegate) != null && z3 && !actionBarLayoutDelegate.needPresentFragment(baseFragment, z, z2, this)) || !baseFragment.onFragmentCreate())) {
            return false;
        }
        if (this.inPreviewMode && this.transitionAnimationPreviewMode) {
            Runnable runnable = this.delayedOpenAnimationRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.delayedOpenAnimationRunnable = null;
            }
            closeLastFragment(false, true);
        }
        baseFragment.setInPreviewMode(z4);
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.previewMenu;
        if (actionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.previewMenu.getParent()).removeView(this.previewMenu);
            }
            this.previewMenu = null;
        }
        this.previewMenu = actionBarPopupWindowLayout;
        baseFragment.setInMenuMode(actionBarPopupWindowLayout != null);
        if (this.parentActivity.getCurrentFocus() != null && baseFragment.hideKeyboardOnShow() && !z4) {
            AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
        }
        boolean z5 = z4 || (!z2 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        if (!this.fragmentsStack.isEmpty()) {
            ArrayList<BaseFragment> arrayList = this.fragmentsStack;
            baseFragment2 = arrayList.get(arrayList.size() - 1);
        } else {
            baseFragment2 = null;
        }
        baseFragment.setParentLayout(this);
        View view = baseFragment.fragmentView;
        if (view == null) {
            view = baseFragment.createView(this.parentActivity);
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                baseFragment.onRemoveFromParent();
                viewGroup.removeView(view);
            }
        }
        this.containerViewBack.addView(view);
        if (actionBarPopupWindowLayout != null) {
            this.containerViewBack.addView(actionBarPopupWindowLayout);
            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            i = actionBarPopupWindowLayout.getMeasuredHeight() + AndroidUtilities.dp(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindowLayout.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.topMargin = (getMeasuredHeight() - i) - AndroidUtilities.dp(6.0f);
            actionBarPopupWindowLayout.setLayoutParams(layoutParams);
        } else {
            i = 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z4) {
            int previewHeight = baseFragment.getPreviewHeight();
            int i2 = Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0;
            if (previewHeight <= 0 || previewHeight >= getMeasuredHeight() - i2) {
                int dp = AndroidUtilities.dp(actionBarPopupWindowLayout != null ? 0.0f : 24.0f);
                layoutParams2.bottomMargin = dp;
                layoutParams2.topMargin = dp;
                layoutParams2.topMargin = dp + AndroidUtilities.statusBarHeight;
            } else {
                layoutParams2.height = previewHeight;
                layoutParams2.topMargin = i2 + (((getMeasuredHeight() - i2) - previewHeight) / 2);
            }
            if (actionBarPopupWindowLayout != null) {
                layoutParams2.bottomMargin += i + AndroidUtilities.dp(8.0f);
            }
            int dp2 = AndroidUtilities.dp(8.0f);
            layoutParams2.leftMargin = dp2;
            layoutParams2.rightMargin = dp2;
        } else {
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
        }
        view.setLayoutParams(layoutParams2);
        ActionBar actionBar = baseFragment.actionBar;
        if (actionBar != null && actionBar.shouldAddToContainer()) {
            if (this.removeActionBarExtraHeight) {
                baseFragment.actionBar.setOccupyStatusBar(false);
            }
            ViewGroup viewGroup2 = (ViewGroup) baseFragment.actionBar.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(baseFragment.actionBar);
            }
            this.containerViewBack.addView(baseFragment.actionBar);
            baseFragment.actionBar.setTitleOverlayText(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
        }
        this.fragmentsStack.add(baseFragment);
        onFragmentStackChanged();
        baseFragment.onResume();
        this.currentActionBar = baseFragment.actionBar;
        if (!baseFragment.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        }
        LayoutContainer layoutContainer = this.containerView;
        LayoutContainer layoutContainer2 = this.containerViewBack;
        this.containerView = layoutContainer2;
        this.containerViewBack = layoutContainer;
        layoutContainer2.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        if (z4) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setOutlineProvider(new ViewOutlineProvider(this) {
                    @Override
                    @TargetApi(R.styleable.MapAttrs_uiZoomGestures)
                    public void getOutline(View view2, Outline outline) {
                        outline.setRoundRect(0, AndroidUtilities.statusBarHeight, view2.getMeasuredWidth(), view2.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
                    }
                });
                view.setClipToOutline(true);
                view.setElevation(AndroidUtilities.dp(4.0f));
            }
            if (this.previewBackgroundDrawable == null) {
                this.previewBackgroundDrawable = new ColorDrawable(771751936);
            }
            this.previewBackgroundDrawable.setAlpha(0);
            Theme.moveUpDrawable.setAlpha(0);
        }
        bringChildToFront(this.containerView);
        if (!z5) {
            presentFragmentInternalRemoveOld(z, baseFragment2);
            View view2 = this.backgroundView;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (this.themeAnimatorSet != null) {
            this.presentingFragmentDescriptions = baseFragment.getThemeDescriptions();
        }
        if (z5 || z4) {
            if (!this.useAlphaAnimations || this.fragmentsStack.size() != 1) {
                this.transitionAnimationPreviewMode = z4;
                this.transitionAnimationStartTime = System.currentTimeMillis();
                this.transitionAnimationInProgress = true;
                final BaseFragment baseFragment3 = baseFragment2;
                this.onOpenAnimationEndRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        ActionBarLayout.this.lambda$presentFragment$1(z4, actionBarPopupWindowLayout, z, baseFragment3, baseFragment);
                    }
                };
                final boolean z6 = !baseFragment.needDelayOpenAnimation();
                if (z6) {
                    if (baseFragment2 != null) {
                        baseFragment2.onTransitionAnimationStart(false, false);
                    }
                    baseFragment.onTransitionAnimationStart(true, false);
                }
                this.delayedAnimationResumed = false;
                this.oldFragment = baseFragment2;
                this.newFragment = baseFragment;
                AnimatorSet onCustomTransitionAnimation = !z4 ? baseFragment.onCustomTransitionAnimation(true, new Runnable() {
                    @Override
                    public final void run() {
                        ActionBarLayout.this.lambda$presentFragment$2();
                    }
                }) : null;
                if (onCustomTransitionAnimation == null) {
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
                        long j = 200;
                        if (baseFragment2 != null && !z4) {
                            baseFragment2.saveKeyboardPositionBeforeTransition();
                        }
                        final BaseFragment baseFragment4 = baseFragment2;
                        this.waitingForKeyboardCloseRunnable = new Runnable() {
                            @Override
                            public void run() {
                                if (ActionBarLayout.this.waitingForKeyboardCloseRunnable == this) {
                                    ActionBarLayout.this.waitingForKeyboardCloseRunnable = null;
                                    if (z6) {
                                        BaseFragment baseFragment5 = baseFragment4;
                                        if (baseFragment5 != null) {
                                            baseFragment5.onTransitionAnimationStart(false, false);
                                        }
                                        baseFragment.onTransitionAnimationStart(true, false);
                                        ActionBarLayout.this.startLayoutAnimation(true, true, z4);
                                    } else if (ActionBarLayout.this.delayedOpenAnimationRunnable != null) {
                                        AndroidUtilities.cancelRunOnUIThread(ActionBarLayout.this.delayedOpenAnimationRunnable);
                                        if (ActionBarLayout.this.delayedAnimationResumed) {
                                            ActionBarLayout.this.delayedOpenAnimationRunnable.run();
                                        } else {
                                            AndroidUtilities.runOnUIThread(ActionBarLayout.this.delayedOpenAnimationRunnable, 200L);
                                        }
                                    }
                                }
                            }
                        };
                        if (baseFragment.needDelayOpenAnimation()) {
                            this.delayedOpenAnimationRunnable = new Runnable() {
                                @Override
                                public void run() {
                                    if (ActionBarLayout.this.delayedOpenAnimationRunnable == this) {
                                        ActionBarLayout.this.delayedOpenAnimationRunnable = null;
                                        BaseFragment baseFragment5 = baseFragment2;
                                        if (baseFragment5 != null) {
                                            baseFragment5.onTransitionAnimationStart(false, false);
                                        }
                                        baseFragment.onTransitionAnimationStart(true, false);
                                        ActionBarLayout.this.startLayoutAnimation(true, true, z4);
                                    }
                                }
                            };
                        }
                        Runnable runnable2 = this.waitingForKeyboardCloseRunnable;
                        if (SharedConfig.smoothKeyboard) {
                            j = 250;
                        }
                        AndroidUtilities.runOnUIThread(runnable2, j);
                    } else if (baseFragment.needDelayOpenAnimation()) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public void run() {
                                if (ActionBarLayout.this.delayedOpenAnimationRunnable == this) {
                                    ActionBarLayout.this.delayedOpenAnimationRunnable = null;
                                    baseFragment.onTransitionAnimationStart(true, false);
                                    ActionBarLayout.this.startLayoutAnimation(true, true, z4);
                                }
                            }
                        };
                        this.delayedOpenAnimationRunnable = runnable3;
                        AndroidUtilities.runOnUIThread(runnable3, 200L);
                    } else {
                        startLayoutAnimation(true, true, z4);
                    }
                } else {
                    if (!z4 && ((this.containerView.isKeyboardVisible || this.containerViewBack.isKeyboardVisible) && baseFragment2 != null)) {
                        baseFragment2.saveKeyboardPositionBeforeTransition();
                    }
                    this.currentAnimation = onCustomTransitionAnimation;
                }
            } else {
                presentFragmentInternalRemoveOld(z, baseFragment2);
                this.transitionAnimationStartTime = System.currentTimeMillis();
                this.transitionAnimationInProgress = true;
                this.onOpenAnimationEndRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        ActionBarLayout.lambda$presentFragment$0(BaseFragment.this, baseFragment);
                    }
                };
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f, 1.0f));
                View view3 = this.backgroundView;
                if (view3 != null) {
                    view3.setVisibility(0);
                    arrayList2.add(ObjectAnimator.ofFloat(this.backgroundView, View.ALPHA, 0.0f, 1.0f));
                }
                if (baseFragment2 != null) {
                    baseFragment2.onTransitionAnimationStart(false, false);
                }
                baseFragment.onTransitionAnimationStart(true, false);
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentAnimation = animatorSet;
                animatorSet.playTogether(arrayList2);
                this.currentAnimation.setInterpolator(this.accelerateDecelerateInterpolator);
                this.currentAnimation.setDuration(200L);
                this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ActionBarLayout.this.onAnimationEndCheck(false);
                    }
                });
                this.currentAnimation.start();
            }
            return true;
        }
        View view4 = this.backgroundView;
        if (view4 != null) {
            view4.setAlpha(1.0f);
            this.backgroundView.setVisibility(0);
        }
        if (baseFragment2 != null) {
            baseFragment2.onTransitionAnimationStart(false, false);
            baseFragment2.onTransitionAnimationEnd(false, false);
        }
        baseFragment.onTransitionAnimationStart(true, false);
        baseFragment.onTransitionAnimationEnd(true, false);
        baseFragment.onBecomeFullyVisible();
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

    public void lambda$presentFragment$2() {
        onAnimationEndCheck(false);
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.onFragmentStackChangedListener = runnable;
    }

    private void onFragmentStackChanged() {
        Runnable runnable = this.onFragmentStackChangedListener;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
    }

    public boolean addFragmentToStack(BaseFragment baseFragment) {
        return addFragmentToStack(baseFragment, -1);
    }

    public boolean addFragmentToStack(BaseFragment baseFragment, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ActionBarLayoutDelegate actionBarLayoutDelegate = this.delegate;
        if ((actionBarLayoutDelegate != null && !actionBarLayoutDelegate.needAddFragmentToStack(baseFragment, this)) || !baseFragment.onFragmentCreate()) {
            return false;
        }
        baseFragment.setParentLayout(this);
        if (i == -1) {
            if (!this.fragmentsStack.isEmpty()) {
                ArrayList<BaseFragment> arrayList = this.fragmentsStack;
                BaseFragment baseFragment2 = arrayList.get(arrayList.size() - 1);
                baseFragment2.onPause();
                ActionBar actionBar = baseFragment2.actionBar;
                if (!(actionBar == null || !actionBar.shouldAddToContainer() || (viewGroup2 = (ViewGroup) baseFragment2.actionBar.getParent()) == null)) {
                    viewGroup2.removeView(baseFragment2.actionBar);
                }
                View view = baseFragment2.fragmentView;
                if (!(view == null || (viewGroup = (ViewGroup) view.getParent()) == null)) {
                    baseFragment2.onRemoveFromParent();
                    viewGroup.removeView(baseFragment2.fragmentView);
                }
            }
            this.fragmentsStack.add(baseFragment);
            onFragmentStackChanged();
        } else {
            this.fragmentsStack.add(i, baseFragment);
            onFragmentStackChanged();
        }
        return true;
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
        onFragmentStackChanged();
    }

    public void movePreviewFragment(float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.movePreviewFragment(float):void");
    }

    public void expandPreviewFragment() {
        this.previewOpenAnimationInProgress = true;
        this.inPreviewMode = false;
        ArrayList<BaseFragment> arrayList = this.fragmentsStack;
        BaseFragment baseFragment = arrayList.get(arrayList.size() - 2);
        ArrayList<BaseFragment> arrayList2 = this.fragmentsStack;
        final BaseFragment baseFragment2 = arrayList2.get(arrayList2.size() - 1);
        if (Build.VERSION.SDK_INT >= 21) {
            baseFragment2.fragmentView.setOutlineProvider(null);
            baseFragment2.fragmentView.setClipToOutline(false);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) baseFragment2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        baseFragment2.fragmentView.setLayoutParams(layoutParams);
        presentFragmentInternalRemoveOld(false, baseFragment);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(baseFragment2.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(baseFragment2.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
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
        performHapticFeedback(3);
        baseFragment2.setInPreviewMode(false);
        baseFragment2.setInMenuMode(false);
    }

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

    public void closeLastFragment(boolean z) {
        closeLastFragment(z, false);
    }

    public void closeLastFragment(boolean z, boolean z2) {
        final BaseFragment baseFragment;
        ActionBarLayoutDelegate actionBarLayoutDelegate = this.delegate;
        if ((actionBarLayoutDelegate == null || actionBarLayoutDelegate.needCloseLastFragment(this)) && !checkTransitionAnimation() && !this.fragmentsStack.isEmpty()) {
            if (this.parentActivity.getCurrentFocus() != null) {
                AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            boolean z3 = !z2 && (this.inPreviewMode || this.transitionAnimationPreviewMode || (z && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)));
            ArrayList<BaseFragment> arrayList = this.fragmentsStack;
            final BaseFragment baseFragment2 = arrayList.get(arrayList.size() - 1);
            AnimatorSet animatorSet = null;
            if (this.fragmentsStack.size() > 1) {
                ArrayList<BaseFragment> arrayList2 = this.fragmentsStack;
                baseFragment = arrayList2.get(arrayList2.size() - 2);
            } else {
                baseFragment = null;
            }
            if (baseFragment != null) {
                AndroidUtilities.setLightStatusBar(this.parentActivity.getWindow(), Theme.getColor("actionBarDefault") == -1 || (baseFragment.hasForceLightStatusBar() && !Theme.getCurrentTheme().isDark()), baseFragment.hasForceLightStatusBar());
                LayoutContainer layoutContainer = this.containerView;
                this.containerView = this.containerViewBack;
                this.containerViewBack = layoutContainer;
                baseFragment.setParentLayout(this);
                View view = baseFragment.fragmentView;
                if (view == null) {
                    view = baseFragment.createView(this.parentActivity);
                }
                if (!this.inPreviewMode) {
                    this.containerView.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        baseFragment.onRemoveFromParent();
                        try {
                            viewGroup.removeView(view);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    this.containerView.addView(view);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    view.setLayoutParams(layoutParams);
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
                        baseFragment.actionBar.setTitleOverlayText(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
                    }
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
                if (!baseFragment.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                }
                if (z3) {
                    this.transitionAnimationStartTime = System.currentTimeMillis();
                    this.transitionAnimationInProgress = true;
                    baseFragment2.setRemovingFromStack(true);
                    this.onCloseAnimationEndRunnable = new Runnable() {
                        @Override
                        public final void run() {
                            ActionBarLayout.this.lambda$closeLastFragment$3(baseFragment2, baseFragment);
                        }
                    };
                    if (!this.inPreviewMode && !this.transitionAnimationPreviewMode) {
                        animatorSet = baseFragment2.onCustomTransitionAnimation(false, new Runnable() {
                            @Override
                            public final void run() {
                                ActionBarLayout.this.lambda$closeLastFragment$4();
                            }
                        });
                    }
                    if (animatorSet != null) {
                        this.currentAnimation = animatorSet;
                        if (Bulletin.getVisibleBulletin() != null && Bulletin.getVisibleBulletin().isShowing()) {
                            Bulletin.getVisibleBulletin().hide();
                        }
                    } else if (this.inPreviewMode || (!this.containerView.isKeyboardVisible && !this.containerViewBack.isKeyboardVisible)) {
                        startLayoutAnimation(false, true, this.inPreviewMode || this.transitionAnimationPreviewMode);
                    } else {
                        Runnable runnable = new Runnable() {
                            @Override
                            public void run() {
                                if (ActionBarLayout.this.waitingForKeyboardCloseRunnable == this) {
                                    ActionBarLayout.this.waitingForKeyboardCloseRunnable = null;
                                    ActionBarLayout.this.startLayoutAnimation(false, true, false);
                                }
                            }
                        };
                        this.waitingForKeyboardCloseRunnable = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    onFragmentStackChanged();
                    return;
                }
                closeLastFragmentInternalRemoveOld(baseFragment2);
                baseFragment2.onTransitionAnimationEnd(false, true);
                baseFragment.onTransitionAnimationEnd(true, true);
                baseFragment.onBecomeFullyVisible();
            } else if (!this.useAlphaAnimations || z2) {
                removeFragmentFromStackInternal(baseFragment2);
                setVisibility(8);
                View view2 = this.backgroundView;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                this.transitionAnimationStartTime = System.currentTimeMillis();
                this.transitionAnimationInProgress = true;
                this.onCloseAnimationEndRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        ActionBarLayout.this.lambda$closeLastFragment$5(baseFragment2);
                    }
                };
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(ObjectAnimator.ofFloat(this, View.ALPHA, 1.0f, 0.0f));
                View view3 = this.backgroundView;
                if (view3 != null) {
                    arrayList3.add(ObjectAnimator.ofFloat(view3, View.ALPHA, 1.0f, 0.0f));
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.currentAnimation = animatorSet2;
                animatorSet2.playTogether(arrayList3);
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
            }
        }
    }

    public void lambda$closeLastFragment$3(BaseFragment baseFragment, BaseFragment baseFragment2) {
        ViewGroup viewGroup;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.previewMenu;
        if (!(actionBarPopupWindowLayout == null || (viewGroup = (ViewGroup) actionBarPopupWindowLayout.getParent()) == null)) {
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

    public void lambda$closeLastFragment$4() {
        onAnimationEndCheck(false);
    }

    public void lambda$closeLastFragment$5(BaseFragment baseFragment) {
        removeFragmentFromStackInternal(baseFragment);
        setVisibility(8);
        View view = this.backgroundView;
        if (view != null) {
            view.setVisibility(8);
        }
        DrawerLayoutContainer drawerLayoutContainer = this.drawerLayoutContainer;
        if (drawerLayoutContainer != null) {
            drawerLayoutContainer.setAllowOpenDrawer(true, false);
        }
    }

    public void showFragment(int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.fragmentsStack.isEmpty()) {
            for (int i2 = 0; i2 < i; i2++) {
                BaseFragment baseFragment = this.fragmentsStack.get(i2);
                ActionBar actionBar = baseFragment.actionBar;
                if (!(actionBar == null || !actionBar.shouldAddToContainer() || (viewGroup2 = (ViewGroup) baseFragment.actionBar.getParent()) == null)) {
                    viewGroup2.removeView(baseFragment.actionBar);
                }
                View view = baseFragment.fragmentView;
                if (!(view == null || (viewGroup = (ViewGroup) view.getParent()) == null)) {
                    baseFragment.onPause();
                    baseFragment.onRemoveFromParent();
                    viewGroup.removeView(baseFragment.fragmentView);
                }
            }
            BaseFragment baseFragment2 = this.fragmentsStack.get(i);
            baseFragment2.setParentLayout(this);
            View view2 = baseFragment2.fragmentView;
            if (view2 == null) {
                view2 = baseFragment2.createView(this.parentActivity);
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                if (viewGroup3 != null) {
                    baseFragment2.onRemoveFromParent();
                    viewGroup3.removeView(view2);
                }
            }
            this.containerView.addView(view2, LayoutHelper.createFrame(-1, -1.0f));
            ActionBar actionBar2 = baseFragment2.actionBar;
            if (actionBar2 != null && actionBar2.shouldAddToContainer()) {
                if (this.removeActionBarExtraHeight) {
                    baseFragment2.actionBar.setOccupyStatusBar(false);
                }
                ViewGroup viewGroup4 = (ViewGroup) baseFragment2.actionBar.getParent();
                if (viewGroup4 != null) {
                    viewGroup4.removeView(baseFragment2.actionBar);
                }
                this.containerView.addView(baseFragment2.actionBar);
                baseFragment2.actionBar.setTitleOverlayText(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
            }
            baseFragment2.onResume();
            this.currentActionBar = baseFragment2.actionBar;
            if (!baseFragment2.hasOwnBackground && view2.getBackground() == null) {
                view2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            }
        }
    }

    public void showLastFragment() {
        if (!this.fragmentsStack.isEmpty()) {
            showFragment(this.fragmentsStack.size() - 1);
        }
    }

    private void removeFragmentFromStackInternal(BaseFragment baseFragment) {
        baseFragment.onPause();
        baseFragment.onFragmentDestroy();
        baseFragment.setParentLayout(null);
        this.fragmentsStack.remove(baseFragment);
        onFragmentStackChanged();
    }

    public void removeFragmentFromStack(int i) {
        if (i < this.fragmentsStack.size()) {
            removeFragmentFromStackInternal(this.fragmentsStack.get(i));
        }
    }

    public void removeFragmentFromStack(BaseFragment baseFragment) {
        if (!this.useAlphaAnimations || this.fragmentsStack.size() != 1 || !AndroidUtilities.isTablet()) {
            if (this.delegate != null && this.fragmentsStack.size() == 1 && AndroidUtilities.isTablet()) {
                this.delegate.needCloseLastFragment(this);
            }
            removeFragmentFromStackInternal(baseFragment);
            return;
        }
        closeLastFragment(true);
    }

    public void removeAllFragments() {
        while (this.fragmentsStack.size() > 0) {
            removeFragmentFromStackInternal(this.fragmentsStack.get(0));
        }
    }

    @Keep
    public void setThemeAnimationValue(float f) {
        this.themeAnimationValue = f;
        int size = this.themeAnimatorDescriptions.size();
        for (int i = 0; i < size; i++) {
            ArrayList<ThemeDescription> arrayList = this.themeAnimatorDescriptions.get(i);
            int[] iArr = this.animateStartColors.get(i);
            int[] iArr2 = this.animateEndColors.get(i);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int red = Color.red(iArr2[i2]);
                int green = Color.green(iArr2[i2]);
                int blue = Color.blue(iArr2[i2]);
                int alpha = Color.alpha(iArr2[i2]);
                int red2 = Color.red(iArr[i2]);
                int green2 = Color.green(iArr[i2]);
                int blue2 = Color.blue(iArr[i2]);
                size = size;
                int alpha2 = Color.alpha(iArr[i2]);
                iArr = iArr;
                int argb = Color.argb(Math.min(255, (int) (alpha2 + ((alpha - alpha2) * f))), Math.min(255, (int) (red2 + ((red - red2) * f))), Math.min(255, (int) (green2 + ((green - green2) * f))), Math.min(255, (int) (blue2 + ((blue - blue2) * f))));
                ThemeDescription themeDescription = arrayList.get(i2);
                themeDescription.setAnimatedColor(argb);
                themeDescription.setColor(argb, false, false);
            }
        }
        int size3 = this.themeAnimatorDelegate.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = this.themeAnimatorDelegate.get(i3);
            if (themeDescriptionDelegate != null) {
                themeDescriptionDelegate.didSetColor();
                themeDescriptionDelegate.onAnimationProgress(f);
            }
        }
        ArrayList<ThemeDescription> arrayList2 = this.presentingFragmentDescriptions;
        if (arrayList2 != null) {
            int size4 = arrayList2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ThemeDescription themeDescription2 = this.presentingFragmentDescriptions.get(i4);
                themeDescription2.setColor(Theme.getColor(themeDescription2.getCurrentKey()), false, false);
            }
        }
        ThemeAnimationSettings.onAnimationProgress onanimationprogress = this.animationProgressListener;
        if (onanimationprogress != null) {
            onanimationprogress.setProgress(f);
        }
    }

    @Keep
    public float getThemeAnimationValue() {
        return this.themeAnimationValue;
    }

    private void addStartDescriptions(ArrayList<ThemeDescription> arrayList) {
        if (arrayList != null) {
            this.themeAnimatorDescriptions.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.animateStartColors.add(iArr);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ThemeDescription themeDescription = arrayList.get(i);
                iArr[i] = themeDescription.getSetColor();
                ThemeDescription.ThemeDescriptionDelegate delegateDisabled = themeDescription.setDelegateDisabled();
                if (delegateDisabled != null && !this.themeAnimatorDelegate.contains(delegateDisabled)) {
                    this.themeAnimatorDelegate.add(delegateDisabled);
                }
            }
        }
    }

    private void addEndDescriptions(ArrayList<ThemeDescription> arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.animateEndColors.add(iArr);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                iArr[i] = arrayList.get(i).getSetColor();
            }
        }
    }

    public void animateThemedValues(Theme.ThemeInfo themeInfo, int i, boolean z, boolean z2) {
        animateThemedValues(new ThemeAnimationSettings(themeInfo, i, z, z2));
    }

    public void animateThemedValues(final ThemeAnimationSettings themeAnimationSettings) {
        BaseFragment baseFragment;
        Theme.ThemeInfo themeInfo;
        if (this.transitionAnimationInProgress || this.startedTracking) {
            this.animateThemeAfterAnimation = true;
            this.animateSetThemeAfterAnimation = themeAnimationSettings.theme;
            this.animateSetThemeNightAfterAnimation = themeAnimationSettings.nightTheme;
            this.animateSetThemeAccentIdAfterAnimation = themeAnimationSettings.accentId;
            return;
        }
        AnimatorSet animatorSet = this.themeAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.themeAnimatorSet = null;
        }
        int size = themeAnimationSettings.onlyTopFragment ? 1 : this.fragmentsStack.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                baseFragment = getLastFragment();
            } else {
                if ((this.inPreviewMode || this.transitionAnimationPreviewMode) && this.fragmentsStack.size() > 1) {
                    ArrayList<BaseFragment> arrayList = this.fragmentsStack;
                    baseFragment = arrayList.get(arrayList.size() - 2);
                }
            }
            if (baseFragment != null) {
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
                ArrayList<ThemeDescription> themeDescriptions = baseFragment.getThemeDescriptions();
                addStartDescriptions(themeDescriptions);
                Dialog dialog = baseFragment.visibleDialog;
                if (dialog instanceof BottomSheet) {
                    addStartDescriptions(((BottomSheet) dialog).getThemeDescriptions());
                } else if (dialog instanceof AlertDialog) {
                    addStartDescriptions(((AlertDialog) dialog).getThemeDescriptions());
                }
                if (i == 0) {
                    if (themeAnimationSettings.applyTheme) {
                        int i2 = themeAnimationSettings.accentId;
                        if (!(i2 == -1 || (themeInfo = themeAnimationSettings.theme) == null)) {
                            themeInfo.setCurrentAccentId(i2);
                            Theme.saveThemeAccents(themeAnimationSettings.theme, true, false, true, false);
                        }
                        Theme.applyTheme(themeAnimationSettings.theme, themeAnimationSettings.nightTheme);
                    }
                    Runnable runnable = themeAnimationSettings.afterStartDescriptionsAddedRunnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                addEndDescriptions(themeDescriptions);
                Dialog dialog2 = baseFragment.visibleDialog;
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
                int size2 = this.fragmentsStack.size() - ((this.inPreviewMode || this.transitionAnimationPreviewMode) ? 2 : 1);
                for (int i3 = 0; i3 < size2; i3++) {
                    BaseFragment baseFragment2 = this.fragmentsStack.get(i3);
                    baseFragment2.clearViews();
                    baseFragment2.setParentLayout(this);
                }
            }
            if (themeAnimationSettings.instant) {
                setThemeAnimationValue(1.0f);
                this.themeAnimatorDescriptions.clear();
                this.animateStartColors.clear();
                this.animateEndColors.clear();
                this.themeAnimatorDelegate.clear();
                this.presentingFragmentDescriptions = null;
                Runnable runnable2 = themeAnimationSettings.afterAnimationRunnable;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            }
            Theme.setAnimatingColor(true);
            Runnable runnable3 = themeAnimationSettings.beforeAnimationRunnable;
            if (runnable3 != null) {
                runnable3.run();
            }
            ThemeAnimationSettings.onAnimationProgress onanimationprogress = themeAnimationSettings.animationProgress;
            this.animationProgressListener = onanimationprogress;
            if (onanimationprogress != null) {
                onanimationprogress.setProgress(0.0f);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.themeAnimatorSet = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ActionBarLayout.this.themeAnimatorSet)) {
                        ActionBarLayout.this.themeAnimatorDescriptions.clear();
                        ActionBarLayout.this.animateStartColors.clear();
                        ActionBarLayout.this.animateEndColors.clear();
                        ActionBarLayout.this.themeAnimatorDelegate.clear();
                        Theme.setAnimatingColor(false);
                        ActionBarLayout.this.presentingFragmentDescriptions = null;
                        ActionBarLayout.this.themeAnimatorSet = null;
                        Runnable runnable4 = themeAnimationSettings.afterAnimationRunnable;
                        if (runnable4 != null) {
                            runnable4.run();
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
                        ActionBarLayout.this.themeAnimatorSet = null;
                        Runnable runnable4 = themeAnimationSettings.afterAnimationRunnable;
                        if (runnable4 != null) {
                            runnable4.run();
                        }
                    }
                }
            });
            this.themeAnimatorSet.playTogether(ObjectAnimator.ofFloat(this, "themeAnimationValue", 0.0f, 1.0f));
            this.themeAnimatorSet.setDuration(themeAnimationSettings.duration);
            this.themeAnimatorSet.start();
        }
    }

    public void rebuildLogout() {
        this.containerView.removeAllViews();
        this.containerViewBack.removeAllViews();
        this.currentActionBar = null;
        this.newFragment = null;
        this.oldFragment = null;
    }

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
            this.fragmentsStack.get(i).clearViews();
            this.fragmentsStack.get(i).setParentLayout(this);
        }
        ActionBarLayoutDelegate actionBarLayoutDelegate = this.delegate;
        if (actionBarLayoutDelegate != null) {
            actionBarLayoutDelegate.onRebuildAllFragments(this, z);
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
        Runnable runnable;
        if (this.transitionAnimationInProgress && (runnable = this.onCloseAnimationEndRunnable) != null) {
            this.transitionAnimationInProgress = false;
            this.transitionAnimationPreviewMode = false;
            this.transitionAnimationStartTime = 0L;
            this.newFragment = null;
            this.oldFragment = null;
            this.onCloseAnimationEndRunnable = null;
            runnable.run();
            checkNeedRebuild();
            checkNeedRebuild();
        }
    }

    private void checkNeedRebuild() {
        if (this.rebuildAfterAnimation) {
            rebuildAllFragmentViews(this.rebuildLastAfterAnimation, this.showLastAfterAnimation);
            this.rebuildAfterAnimation = false;
        } else if (this.animateThemeAfterAnimation) {
            animateThemedValues(this.animateSetThemeAfterAnimation, this.animateSetThemeAccentIdAfterAnimation, this.animateSetThemeNightAfterAnimation, false);
            this.animateSetThemeAfterAnimation = null;
            this.animateThemeAfterAnimation = false;
        }
    }

    private void onOpenAnimationEnd() {
        Runnable runnable;
        if (this.transitionAnimationInProgress && (runnable = this.onOpenAnimationEndRunnable) != null) {
            this.transitionAnimationInProgress = false;
            this.transitionAnimationPreviewMode = false;
            this.transitionAnimationStartTime = 0L;
            this.newFragment = null;
            this.oldFragment = null;
            this.onOpenAnimationEndRunnable = null;
            runnable.run();
            checkNeedRebuild();
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        if (this.parentActivity != null) {
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
    }

    public void setUseAlphaAnimations(boolean z) {
        this.useAlphaAnimations = z;
    }

    public void setBackgroundView(View view) {
        this.backgroundView = view;
    }

    public void setDrawerLayoutContainer(DrawerLayoutContainer drawerLayoutContainer) {
        this.drawerLayoutContainer = drawerLayoutContainer;
    }

    public DrawerLayoutContainer getDrawerLayoutContainer() {
        return this.drawerLayoutContainer;
    }

    public void setRemoveActionBarExtraHeight(boolean z) {
        this.removeActionBarExtraHeight = z;
    }

    public void setTitleOverlayText(String str, int i, Runnable runnable) {
        this.titleOverlayText = str;
        this.titleOverlayTextId = i;
        this.overlayAction = runnable;
        for (int i2 = 0; i2 < this.fragmentsStack.size(); i2++) {
            ActionBar actionBar = this.fragmentsStack.get(i2).actionBar;
            if (actionBar != null) {
                actionBar.setTitleOverlayText(this.titleOverlayText, this.titleOverlayTextId, runnable);
            }
        }
    }

    public boolean extendActionMode(Menu menu) {
        if (!this.fragmentsStack.isEmpty()) {
            ArrayList<BaseFragment> arrayList = this.fragmentsStack;
            if (arrayList.get(arrayList.size() - 1).extendActionMode(menu)) {
                return true;
            }
        }
        return false;
    }

    public void setFragmentPanTranslationOffset(int i) {
        LayoutContainer layoutContainer = this.containerView;
        if (layoutContainer != null) {
            layoutContainer.setFragmentPanTranslationOffset(i);
        }
    }

    private View findScrollingChild(ViewGroup viewGroup, float f, float f2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(this.rect);
                if (!this.rect.contains((int) f, (int) f2)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if (childAt instanceof ViewGroup) {
                        Rect rect = this.rect;
                        View findScrollingChild = findScrollingChild((ViewGroup) childAt, f - rect.left, f2 - rect.top);
                        if (findScrollingChild != null) {
                            return findScrollingChild;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public class StartColorsProvider implements Theme.ResourcesProvider {
        HashMap<String, Integer> colors;
        String[] keysToSave;

        @Override
        public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
            Theme.applyServiceShaderMatrix(i, i2, f, f2);
        }

        @Override
        public int getColorOrDefault(String str) {
            return getColor(str);
        }

        @Override
        public Drawable getDrawable(String str) {
            return Theme.ResourcesProvider.CC.$default$getDrawable(this, str);
        }

        @Override
        public Paint getPaint(String str) {
            return Theme.ResourcesProvider.CC.$default$getPaint(this, str);
        }

        @Override
        public boolean hasGradientService() {
            return Theme.ResourcesProvider.CC.$default$hasGradientService(this);
        }

        @Override
        public void setAnimatedColor(String str, int i) {
            Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, str, i);
        }

        private StartColorsProvider(ActionBarLayout actionBarLayout) {
            this.colors = new HashMap<>();
            this.keysToSave = new String[]{"chat_outBubble", "chat_outBubbleGradient", "chat_outBubbleGradient2", "chat_outBubbleGradient3", "chat_outBubbleGradientAnimated", "chat_outBubbleShadow"};
        }

        @Override
        public Integer getColor(String str) {
            return this.colors.get(str);
        }

        @Override
        public Integer getCurrentColor(String str) {
            return this.colors.get(str);
        }

        public void saveColors(Theme.ResourcesProvider resourcesProvider) {
            String[] strArr;
            this.colors.clear();
            for (String str : this.keysToSave) {
                this.colors.put(str, resourcesProvider.getCurrentColor(str));
            }
        }
    }
}
