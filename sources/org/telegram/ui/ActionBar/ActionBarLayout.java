package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.cloudmessaging.zzf;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import com.google.zxing.BinaryBitmap;
import fi.iki.elonen.NanoHTTPD;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda271;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BackButtonMenu;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugProvider;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.EmptyBaseFragment;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda20;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda15;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.web.MHTML;

public class ActionBarLayout extends FrameLayout implements INavigationLayout, FloatingDebugProvider {
    public static Drawable headerShadowDrawable;
    public static Drawable layerShadowDrawable;
    public static Paint scrimPaint;
    public final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator;
    public final ArrayList animateEndColors;
    public int animateSetThemeAccentIdAfterAnimation;
    public Theme.ThemeInfo animateSetThemeAfterAnimation;
    public boolean animateSetThemeAfterAnimationApply;
    public boolean animateSetThemeNightAfterAnimation;
    public final ArrayList animateStartColors;
    public boolean animateThemeAfterAnimation;
    public boolean animationInProgress;
    public float animationProgress;
    public ChatActivity.ThemeDelegate.AnonymousClass1 animationProgressListener;
    public AnonymousClass3 animationRunnable;
    public boolean attached;
    public AnimatorSet backAnimator;
    public View backgroundView;
    public boolean beginTrackingSent;
    public BottomSheetTabs bottomSheetTabs;
    public MHTML bottomSheetTabsClip;
    public final Path clipPath;
    public LayoutContainer containerView;
    public LayoutContainer containerViewBack;
    public ActionBar currentActionBar;
    public AnimatorSet currentAnimation;
    public int currentNavigationBarColor;
    public final ActionBarLayout$$ExternalSyntheticLambda11 debugBlackScreenRunnable;
    public final DecelerateInterpolator decelerateInterpolator;
    public boolean delayedAnimationResumed;
    public Runnable delayedOpenAnimationRunnable;
    public INavigationLayout.INavigationLayoutDelegate delegate;
    public DrawerLayoutContainer drawerLayoutContainer;
    public List fragmentsStack;
    public final AnimatedFloat hasSheetsAnimator;
    public boolean inActionMode;
    public boolean inBubbleMode;
    public boolean inPreviewMode;
    public float innerTranslationX;
    public boolean isKeyboardVisible;
    public boolean isLayersLayout;
    public boolean isRightLayout;
    public boolean isSheet;
    public ArrayList lastActions;
    public long lastFrameTime;
    public boolean lastPortrait;
    public WindowInsetsCompat lastWindowInsetsCompat;
    public final boolean main;
    public boolean maybeStartTracking;
    public final int[] measureSpec;
    public MessageDrawable messageDrawableOutMediaStart;
    public MessageDrawable messageDrawableOutStart;
    public BaseFragment newFragment;
    public final AnimationNotificationsLocker notificationsLocker;
    public BaseFragment oldFragment;
    public Runnable onCloseAnimationEndRunnable;
    public Runnable onFragmentStackChangedListener;
    public Runnable onOpenAnimationEndRunnable;
    public LaunchActivity$$ExternalSyntheticLambda20 overlayAction;
    public int overrideWidthOffset;
    public final OvershootInterpolator overshootInterpolator;
    public final Activity parentActivity;
    public boolean predictiveBackHasProgress;
    public boolean predictiveBackInProgress;
    public boolean predictiveBackLeft;
    public float predictiveBackY;
    public boolean predictiveInput;
    public ArrayList presentingFragmentDescriptions;
    public ColorDrawable previewBackgroundDrawable;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout previewMenu;
    public boolean previewOpenAnimationInProgress;
    public List pulledDialogs;
    public final float[] radii;
    public boolean rebuildAfterAnimation;
    public boolean rebuildLastAfterAnimation;
    public final Rect rect;
    public boolean removeActionBarExtraHeight;
    public int savedBottomSheetTabsTop;
    public LayoutContainer sheetContainer;
    public AnonymousClass1 sheetFragment;
    public boolean showLastAfterAnimation;
    public final BinaryBitmap startColorsProvider;
    public boolean startedTracking;
    public int startedTrackingPointerId;
    public int startedTrackingX;
    public int startedTrackingY;
    public Insets systemAndDisplayAndImeInsets;
    public Insets systemAndDisplayInsets;
    public boolean tabsEvents;
    public float themeAnimationValue;
    public final ArrayList themeAnimatorDelegate;
    public final ArrayList themeAnimatorDescriptions;
    public AnimatorSet themeAnimatorSet;
    public String titleOverlayText;
    public int titleOverlayTextId;
    public boolean transitionAnimationInProgress;
    public boolean transitionAnimationPreviewMode;
    public long transitionAnimationStartTime;
    public boolean useAlphaAnimations;
    public VelocityTracker velocityTracker;
    public Runnable waitingForKeyboardCloseRunnable;
    public Window window;
    public boolean withShadow;

    public final class AnonymousClass5 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ActionBarLayout this$0;

        public AnonymousClass5(ActionBarLayout actionBarLayout, int i) {
            this.$r8$classId = i;
            this.this$0 = actionBarLayout;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            ActionBarLayout actionBarLayout = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    Drawable drawable = ActionBarLayout.headerShadowDrawable;
                    actionBarLayout.onAnimationEndCheck(false);
                    break;
                default:
                    Drawable drawable2 = ActionBarLayout.headerShadowDrawable;
                    actionBarLayout.onAnimationEndCheck(false);
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    this.this$0.transitionAnimationStartTime = System.currentTimeMillis();
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }
    }

    public final class LayoutContainer extends FrameLayout {
        public int backgroundColor;
        public final Paint backgroundPaint;
        public boolean drawNavigationBar;
        public EdgeToEdgeSupportMode edgeToEdgeSupportMode;
        public int fragmentPanTranslationOffset;
        public boolean isKeyboardVisible;
        public boolean isSupportEdgeToEdge;
        public int navbarColor;
        public LinearGradient navbarGradient;
        public final Matrix navbarGradientMatrix;
        public int navbarHeight;
        public Paint navbarPaint;
        public final Rect rect;
        public final ActionBarLayout this$0;
        public boolean wasPortrait;

        public LayoutContainer(Context context, ActionBarLayout actionBarLayout) {
            super(context);
            this.this$0 = actionBarLayout;
            this.rect = new Rect();
            this.backgroundPaint = new Paint();
            this.navbarGradientMatrix = new Matrix();
            setWillNotDraw(false);
        }

        @Override
        public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api20Impl.requestApplyInsets(this);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            ActionBarLayout actionBarLayout = this.this$0;
            if (actionBarLayout.isLayersLayout) {
                super.dispatchDraw(canvas);
                return;
            }
            DrawerLayoutContainer drawerLayoutContainer = actionBarLayout.drawerLayoutContainer;
            boolean z = false;
            int color = drawerLayoutContainer != null ? drawerLayoutContainer.getInternalNavbarPaint().getColor() : Theme.getColor(null, Theme.key_windowBackgroundGray, false);
            if (this == actionBarLayout.sheetContainer) {
                AnonymousClass1 anonymousClass1 = actionBarLayout.sheetFragment;
                if (anonymousClass1 != null && anonymousClass1.hasSheet()) {
                    z = true;
                }
                float f = actionBarLayout.hasSheetsAnimator.set(z);
                if (f > 0.0f) {
                    drawInsets(canvas, this.drawNavigationBar, Theme.multAlpha(f, color));
                }
            } else {
                BaseFragment lastFragment = actionBarLayout.getLastFragment();
                if (lastFragment != null && !lastFragment.inPreviewMode) {
                    if (this == actionBarLayout.containerView && this.edgeToEdgeSupportMode != EdgeToEdgeSupportMode.NONE) {
                        int childCount = getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            if (getChildAt(i) instanceof BaseFragment.AttachedSheetWindow) {
                                z = true;
                                break;
                            }
                        }
                    }
                    drawInsets(canvas, z, color);
                }
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            motionEvent.getAction();
            ActionBarLayout actionBarLayout = this.this$0;
            boolean z = actionBarLayout.inPreviewMode && actionBarLayout.previewMenu == null;
            if ((!z && !actionBarLayout.transitionAnimationPreviewMode) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
                if (z) {
                    try {
                        if (this != actionBarLayout.containerView) {
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
            }
            return false;
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            int shadowAlpha;
            int measuredHeight;
            int y;
            int i;
            Drawable drawable;
            ArrayList<BaseFragment.AttachedSheet> arrayList;
            ActionBarLayout actionBarLayout = this.this$0;
            BaseFragment baseFragment = !actionBarLayout.fragmentsStack.isEmpty() ? (BaseFragment) zzir.m(1, actionBarLayout.fragmentsStack) : null;
            AnonymousClass1 anonymousClass1 = actionBarLayout.sheetFragment;
            if (anonymousClass1 != null && (arrayList = anonymousClass1.sheetsStack) != null && !arrayList.isEmpty()) {
                baseFragment = actionBarLayout.sheetFragment;
            }
            BaseFragment.AttachedSheet lastSheet = baseFragment != null ? baseFragment.getLastSheet() : null;
            if (lastSheet != null && lastSheet.isFullyVisible() && lastSheet.getWindowView() != view) {
                return true;
            }
            if (view instanceof ActionBar) {
                return super.drawChild(canvas, view, j);
            }
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = getChildAt(i2);
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
                    i2++;
                }
                shadowAlpha = 0;
                measuredHeight = 0;
                y = 0;
                break;
            }
            boolean zDrawChild = super.drawChild(canvas, view, j);
            if (measuredHeight != 0 && (drawable = ActionBarLayout.headerShadowDrawable) != null) {
                int alpha = drawable.getAlpha();
                int i3 = y + measuredHeight;
                ActionBarLayout.headerShadowDrawable.setBounds(0, i3, getMeasuredWidth(), ActionBarLayout.headerShadowDrawable.getIntrinsicHeight() + i3);
                ActionBarLayout.headerShadowDrawable.setAlpha(shadowAlpha);
                ActionBarLayout.headerShadowDrawable.draw(canvas);
                ActionBarLayout.headerShadowDrawable.setAlpha(alpha);
            }
            if (this.drawNavigationBar && this.isSupportEdgeToEdge && baseFragment != null && (i = AndroidUtilities.navigationBarHeight) >= AndroidUtilities.dp(32.0f)) {
                int i4 = (int) (i * 1.33f);
                int navigationBarColor = baseFragment.getNavigationBarColor();
                if (i4 != this.navbarHeight || this.navbarColor != navigationBarColor || this.navbarPaint == null) {
                    if (this.navbarPaint == null) {
                        this.navbarPaint = new Paint(1);
                    }
                    this.navbarColor = navigationBarColor;
                    this.navbarHeight = i4;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i4, new int[]{Theme.multAlpha(0.1f, navigationBarColor), Theme.multAlpha(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                    this.navbarGradient = linearGradient;
                    this.navbarPaint.setShader(linearGradient);
                }
                Matrix matrix = this.navbarGradientMatrix;
                matrix.reset();
                matrix.postTranslate(0.0f, getHeight() - i4);
                this.navbarGradient.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, getHeight() - i4, getWidth(), getHeight(), this.navbarPaint);
            }
            return zDrawChild;
        }

        public final void drawInsets(Canvas canvas, boolean z, int i) {
            Canvas canvas2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            Paint paintFillingPaint = Theme.fillingPaint(i);
            EdgeToEdgeSupportMode edgeToEdgeSupportMode = EdgeToEdgeSupportMode.FULL;
            if (paddingLeft <= 0 || this.edgeToEdgeSupportMode == edgeToEdgeSupportMode) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), paintFillingPaint);
            }
            if (paddingRight > 0 && this.edgeToEdgeSupportMode != edgeToEdgeSupportMode) {
                canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), paintFillingPaint);
            }
            if (paddingBottom > 0) {
                if (this.edgeToEdgeSupportMode == EdgeToEdgeSupportMode.NONE || z) {
                    canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), paintFillingPaint);
                }
            }
        }

        @Override
        public final boolean hasOverlappingRendering() {
            return Build.VERSION.SDK_INT >= 28;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (this.fragmentPanTranslationOffset != 0) {
                int i = Theme.key_windowBackgroundWhite;
                int color = Theme.getColor(null, i, false);
                int i2 = this.backgroundColor;
                Paint paint = this.backgroundPaint;
                if (i2 != color) {
                    int color2 = Theme.getColor(null, i, false);
                    this.backgroundColor = color2;
                    paint.setColor(color2);
                }
                canvas2 = canvas;
                canvas2.drawRect(0.0f, (getMeasuredHeight() - this.fragmentPanTranslationOffset) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas2);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
                        childAt2.layout(i7, layoutParams.topMargin, childAt2.getMeasuredWidth() + i7, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                    } else {
                        int i8 = layoutParams.leftMargin + paddingLeft;
                        childAt2.layout(i8, layoutParams.topMargin + measuredHeight, childAt2.getMeasuredWidth() + i8, childAt2.getMeasuredHeight() + layoutParams.topMargin + measuredHeight);
                    }
                }
            }
            View rootView = getRootView();
            Rect rect = this.rect;
            getWindowVisibleDisplayFrame(rect);
            this.isKeyboardVisible = ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top) > 0;
            ActionBarLayout actionBarLayout = this.this$0;
            Runnable runnable = actionBarLayout.waitingForKeyboardCloseRunnable;
            if (runnable == null || actionBarLayout.containerView.isKeyboardVisible || actionBarLayout.containerViewBack.isKeyboardVisible) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable);
            actionBarLayout.waitingForKeyboardCloseRunnable.run();
            actionBarLayout.waitingForKeyboardCloseRunnable = null;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int measuredHeight;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            boolean z = size2 > size;
            boolean z2 = this.wasPortrait;
            ActionBarLayout actionBarLayout = this.this$0;
            if (z2 != z && actionBarLayout.isInPreviewMode() && (actionBarLayout.inPreviewMode || actionBarLayout.transitionAnimationPreviewMode)) {
                Runnable runnable = actionBarLayout.delayedOpenAnimationRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    actionBarLayout.delayedOpenAnimationRunnable = null;
                }
                actionBarLayout.closeLastFragment(true, false);
            }
            this.wasPortrait = z;
            int childCount = getChildCount();
            getWindowVisibleDisplayFrame(this.rect);
            BottomSheetTabs bottomSheetTabs = actionBarLayout.bottomSheetTabs;
            if (bottomSheetTabs != null) {
                bottomSheetTabs.setCurrentAccount(UserConfig.selectedAccount);
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
                        measureChildWithMargins(childAt2, i, 0, i2, (actionBarLayout.getBottomTabsHeight(false) > 0 || !this.isSupportEdgeToEdge) ? 0 : actionBarLayout.systemAndDisplayInsets.bottom);
                    } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows()) {
                        measureChildWithMargins(childAt2, i, 0, i2, this.isSupportEdgeToEdge ? actionBarLayout.systemAndDisplayInsets.bottom : 0);
                    } else {
                        measureChildWithMargins(childAt2, i, 0, i2, measuredHeight);
                    }
                }
            }
            setMeasuredDimension(size, size2);
        }

        @Override
        public final void onViewAdded(View view) {
            super.onViewAdded(view);
            updateChildrenAccessibilityImportance();
        }

        @Override
        public final void onViewRemoved(View view) {
            super.onViewRemoved(view);
            updateChildrenAccessibilityImportance();
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

        public void setShouldHandleBottomInsets(EdgeToEdgeSupportMode edgeToEdgeSupportMode) {
            if (this.edgeToEdgeSupportMode != edgeToEdgeSupportMode) {
                this.edgeToEdgeSupportMode = edgeToEdgeSupportMode;
                this.isSupportEdgeToEdge = edgeToEdgeSupportMode != EdgeToEdgeSupportMode.NONE;
                View view = (View) getParent();
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                ViewCompat.Api20Impl.requestApplyInsets(view);
            }
        }

        public final void updateChildrenAccessibilityImportance() {
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
    }

    public ActionBarLayout(Context context, boolean z) {
        super(context);
        this.decelerateInterpolator = new DecelerateInterpolator(1.5f);
        this.overshootInterpolator = new OvershootInterpolator(1.02f);
        this.accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        this.animateStartColors = new ArrayList();
        this.animateEndColors = new ArrayList();
        this.startColorsProvider = new BinaryBitmap(21);
        this.themeAnimatorDescriptions = new ArrayList();
        this.themeAnimatorDelegate = new ArrayList();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.rect = new Rect();
        this.overrideWidthOffset = -1;
        this.clipPath = new Path();
        this.radii = new float[8];
        this.measureSpec = new int[2];
        this.hasSheetsAnimator = new AnimatedFloat(280L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.lastActions = new ArrayList();
        int i = 1;
        this.debugBlackScreenRunnable = new ActionBarLayout$$ExternalSyntheticLambda11(this, i);
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
        AlertDialog$$ExternalSyntheticLambda11 alertDialog$$ExternalSyntheticLambda11 = new AlertDialog$$ExternalSyntheticLambda11(this, i);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this, alertDialog$$ExternalSyntheticLambda11);
    }

    public static void access$1300(ActionBarLayout actionBarLayout, boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (z) {
            if (actionBarLayout.fragmentsStack.size() >= 2) {
                ((BaseFragment) zzir.m(1, actionBarLayout.fragmentsStack)).prepareFragmentToSlide(true, false);
                BaseFragment baseFragment = (BaseFragment) zzir.m(2, actionBarLayout.fragmentsStack);
                baseFragment.prepareFragmentToSlide(false, false);
                baseFragment.onPause();
                View view = baseFragment.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    baseFragment.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(baseFragment.fragmentView);
                }
                ActionBar actionBar = baseFragment.actionBar;
                if (actionBar != null && actionBar.addToContainer && (viewGroup = (ViewGroup) actionBar.getParent()) != null) {
                    viewGroup.removeViewInLayout(baseFragment.actionBar);
                }
                baseFragment.detachSheets();
            }
        } else {
            if (actionBarLayout.fragmentsStack.size() < 2) {
                actionBarLayout.checkBlackScreen("onSlideAnimationEnd exit");
                return;
            }
            BaseFragment baseFragment2 = (BaseFragment) zzir.m(1, actionBarLayout.fragmentsStack);
            baseFragment2.prepareFragmentToSlide(true, false);
            baseFragment2.onPause();
            baseFragment2.onFragmentDestroy();
            baseFragment2.setParentLayout(null);
            List list = actionBarLayout.fragmentsStack;
            list.remove(list.size() - 1);
            actionBarLayout.onFragmentStackChanged("onSlideAnimationEnd");
            LayoutContainer layoutContainer = actionBarLayout.containerView;
            layoutContainer.setAlpha(1.0f);
            LayoutContainer layoutContainer2 = actionBarLayout.containerViewBack;
            actionBarLayout.containerView = layoutContainer2;
            actionBarLayout.containerViewBack = layoutContainer;
            actionBarLayout.bringChildToFront(layoutContainer2);
            View view2 = actionBarLayout.sheetContainer;
            if (view2 != null) {
                actionBarLayout.bringChildToFront(view2);
            }
            if (actionBarLayout.fragmentsStack.size() > 0) {
                BaseFragment baseFragment3 = (BaseFragment) zzir.m(1, actionBarLayout.fragmentsStack);
                actionBarLayout.currentActionBar = baseFragment3.actionBar;
                baseFragment3.onResume();
                baseFragment3.onBecomeFullyVisible();
                baseFragment3.prepareFragmentToSlide(false, false);
            }
        }
        actionBarLayout.containerViewBack.setVisibility(4);
        actionBarLayout.startedTracking = false;
        actionBarLayout.animationInProgress = false;
        actionBarLayout.containerView.setTranslationX(0.0f);
        actionBarLayout.containerViewBack.setTranslationX(0.0f);
        actionBarLayout.containerView.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View findScrollingChild$1(ViewGroup viewGroup, float f, float f2) {
        View viewFindScrollingChild$1;
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
                    if ((childAt instanceof ViewGroup) && (viewFindScrollingChild$1 = findScrollingChild$1((ViewGroup) childAt, f - rect.left, f2 - rect.top)) != null) {
                        return viewFindScrollingChild$1;
                    }
                }
            }
        }
        return null;
    }

    public static void globallyUpdateColors(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Theme.Colorable) {
                ((Theme.Colorable) childAt).updateColors$1();
            }
            if (childAt instanceof ViewGroup) {
                globallyUpdateColors((ViewGroup) childAt);
            }
        }
    }

    public static void observeDebugItemsFromView(View view, ArrayList arrayList) {
        if (view instanceof FloatingDebugProvider) {
            arrayList.addAll(((FloatingDebugProvider) view).onGetDebugItems());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                observeDebugItemsFromView(viewGroup.getChildAt(i), arrayList);
            }
        }
    }

    public final boolean addFragmentToStack(int i, BaseFragment baseFragment) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i2 = 2;
        INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate = this.delegate;
        if ((iNavigationLayoutDelegate != null && !iNavigationLayoutDelegate.needAddFragmentToStack(this, baseFragment)) || !baseFragment.onFragmentCreate() || this.fragmentsStack.contains(baseFragment)) {
            return false;
        }
        baseFragment.setParentLayout(this);
        Activity activity = this.parentActivity;
        if (i == -1 || i == -2) {
            if (!this.fragmentsStack.isEmpty()) {
                BaseFragment baseFragment2 = (BaseFragment) zzir.m(1, this.fragmentsStack);
                baseFragment2.onPause();
                ActionBar actionBar = baseFragment2.actionBar;
                if (actionBar != null && actionBar.addToContainer && (viewGroup2 = (ViewGroup) actionBar.getParent()) != null) {
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
                View viewPerformCreateView = baseFragment.fragmentView;
                if (viewPerformCreateView == null) {
                    viewPerformCreateView = baseFragment.performCreateView(activity);
                    if (viewPerformCreateView != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
                        AlertDialog$$ExternalSyntheticLambda11 alertDialog$$ExternalSyntheticLambda11 = new AlertDialog$$ExternalSyntheticLambda11(baseFragment, i2);
                        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(viewPerformCreateView, alertDialog$$ExternalSyntheticLambda11);
                        this.containerView.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) viewPerformCreateView.getParent();
                    if (viewGroup3 != null) {
                        baseFragment.onRemoveFromParent();
                        viewGroup3.removeView(viewPerformCreateView);
                    }
                }
                if (!baseFragment.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
                    viewPerformCreateView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                }
                this.containerView.addView(viewPerformCreateView, LayoutHelper.createFrame(-1.0f, -1));
                this.containerView.setShouldHandleBottomInsets(baseFragment.getEdgeToEdgeSupportMode());
                this.containerView.setDrawNavigationBar(baseFragment.drawEdgeNavigationBar());
                ActionBar actionBar2 = baseFragment.actionBar;
                if (actionBar2 != null && actionBar2.addToContainer) {
                    if (this.removeActionBarExtraHeight) {
                        actionBar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) baseFragment.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(baseFragment.actionBar);
                    }
                    this.containerView.addView(baseFragment.actionBar);
                }
                baseFragment.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
                baseFragment.attachSheets(this.containerView);
                baseFragment.onResume();
                baseFragment.onTransitionAnimationEnd(false, true);
                baseFragment.onTransitionAnimationEnd(true, true);
                baseFragment.onBecomeFullyVisible();
            }
            onFragmentStackChanged("addFragmentToStack " + i);
        } else {
            if (i == -3) {
                View viewPerformCreateView2 = baseFragment.fragmentView;
                if (viewPerformCreateView2 == null) {
                    viewPerformCreateView2 = baseFragment.performCreateView(activity);
                    if (viewPerformCreateView2 != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
                        AlertDialog$$ExternalSyntheticLambda11 alertDialog$$ExternalSyntheticLambda12 = new AlertDialog$$ExternalSyntheticLambda11(baseFragment, i2);
                        WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(viewPerformCreateView2, alertDialog$$ExternalSyntheticLambda12);
                        this.containerView.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) viewPerformCreateView2.getParent();
                    if (viewGroup5 != null) {
                        baseFragment.onRemoveFromParent();
                        viewGroup5.removeView(viewPerformCreateView2);
                    }
                }
                if (!baseFragment.hasOwnBackground && viewPerformCreateView2.getBackground() == null) {
                    viewPerformCreateView2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                }
                LayoutContainer layoutContainer = this.containerView;
                layoutContainer.addView(viewPerformCreateView2, Utilities.clamp(0, layoutContainer.getChildCount(), 0), LayoutHelper.createFrame(-1.0f, -1));
                this.containerView.setShouldHandleBottomInsets(baseFragment.getEdgeToEdgeSupportMode());
                this.containerView.setDrawNavigationBar(baseFragment.drawEdgeNavigationBar());
                ActionBar actionBar3 = baseFragment.actionBar;
                if (actionBar3 != null && actionBar3.addToContainer) {
                    if (this.removeActionBarExtraHeight) {
                        actionBar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) baseFragment.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(baseFragment.actionBar);
                    }
                    this.containerView.addView(baseFragment.actionBar);
                }
                baseFragment.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
                baseFragment.attachSheets(this.containerView);
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

    public final void addStartDescriptions(ArrayList arrayList) {
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
            ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = themeDescription.delegate;
            themeDescription.delegate = null;
            if (themeDescriptionDelegate != null) {
                ArrayList arrayList2 = this.themeAnimatorDelegate;
                if (!arrayList2.contains(themeDescriptionDelegate)) {
                    arrayList2.add(themeDescriptionDelegate);
                }
            }
        }
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        WindowInsetsCompat windowInsetsCompat = this.lastWindowInsetsCompat;
        if (windowInsetsCompat != null) {
            dispatchApplyWindowInsetsInternal(view, windowInsetsCompat);
        }
    }

    public final void animateBackEndAnimation(boolean z) {
        Animator customSlideTransition;
        BaseFragment baseFragment = !this.fragmentsStack.isEmpty() ? (BaseFragment) zzir.m(1, this.fragmentsStack) : null;
        if (baseFragment == null) {
            return;
        }
        float x = this.containerView.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean zShouldOverrideSlideTransition = baseFragment.shouldOverrideSlideTransition(false, z);
        Property property = View.TRANSLATION_X;
        if (z) {
            int iMax = Math.max((int) ((320.0f / this.containerView.getMeasuredWidth()) * x), newBackTransitions() ? 320 : 120);
            if (!zShouldOverrideSlideTransition) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.containerView, (Property<LayoutContainer, Float>) property, 0.0f);
                long j = iMax;
                animatorSet.playTogether(objectAnimatorOfFloat.setDuration(j), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j));
                if (newBackTransitions()) {
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                }
            }
        } else {
            x = Math.abs(this.containerView.getMeasuredWidth() - x);
            int iMax2 = Math.max((int) ((200.0f / this.containerView.getMeasuredWidth()) * x), newBackTransitions() ? 380 : 50);
            if (!zShouldOverrideSlideTransition) {
                LayoutContainer layoutContainer = this.containerView;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(layoutContainer, (Property<LayoutContainer, Float>) property, layoutContainer.getMeasuredWidth() + (this.predictiveBackInProgress ? AndroidUtilities.dp(56.0f) : 0));
                long j2 = iMax2;
                animatorSet.playTogether(objectAnimatorOfFloat2.setDuration(j2), ObjectAnimator.ofFloat(this, "innerTranslationX", this.containerView.getMeasuredWidth()).setDuration(j2));
                if (newBackTransitions()) {
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                }
            }
        }
        Animator customSlideTransition2 = baseFragment.getCustomSlideTransition(false, z, x);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        BaseFragment baseFragment2 = (BaseFragment) zzir.m(2, this.fragmentsStack);
        if (baseFragment2 != null && (customSlideTransition = baseFragment2.getCustomSlideTransition(false, z, x)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new LoginActivity.AnonymousClass8(this, z));
        this.backAnimator = animatorSet;
        animatorSet.start();
        this.animationInProgress = true;
    }

    public final void animateThemedValues(INavigationLayout.ThemeAnimationSettings themeAnimationSettings, Runnable runnable) {
        Theme.ThemeInfo themeInfo;
        Theme.ThemeInfo themeInfo2;
        final int i = 0;
        final int i2 = 1;
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
        Object obj = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.themeAnimatorSet = null;
        }
        int size = themeAnimationSettings.onlyTopFragment ? 1 : this.fragmentsStack.size();
        ArticleViewer$$ExternalSyntheticLambda71 articleViewer$$ExternalSyntheticLambda71 = new ArticleViewer$$ExternalSyntheticLambda71(this, size, themeAnimationSettings, runnable, 3);
        if (size < 1 || !themeAnimationSettings.applyTheme || !themeAnimationSettings.applyTrulyTheme) {
            articleViewer$$ExternalSyntheticLambda71.run();
            return;
        }
        int i3 = themeAnimationSettings.accentId;
        if (i3 != -1 && (themeInfo2 = themeAnimationSettings.theme) != null) {
            themeInfo2.setCurrentAccentId(i3);
            Theme.saveThemeAccents(themeAnimationSettings.theme, true, false, true, false, false);
        }
        if (runnable == null) {
            Theme.applyTheme(themeAnimationSettings.theme, true, themeAnimationSettings.nightTheme);
            articleViewer$$ExternalSyntheticLambda71.run();
            return;
        }
        Theme.ThemeInfo themeInfo3 = themeAnimationSettings.theme;
        boolean z = themeAnimationSettings.nightTheme;
        Theme$$ExternalSyntheticLambda8 theme$$ExternalSyntheticLambda8 = new Theme$$ExternalSyntheticLambda8(articleViewer$$ExternalSyntheticLambda71, i2);
        int i4 = Theme.default_shadow_color;
        if (themeInfo3 == null) {
            theme$$ExternalSyntheticLambda8.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.Instance;
        if (themeEditorView != null) {
            themeEditorView.destroy();
        }
        try {
            if (themeInfo3.pathToFile == null && themeInfo3.assetName == null) {
                if (!z) {
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.remove("theme");
                    editorEdit.apply();
                }
                Theme.currentColorsNoAccent.clear();
                Theme.themedWallpaperFileOffset = 0;
                Theme.themedWallpaperLink = null;
                Theme.wallpaper = null;
                Theme.themedWallpaper = null;
                if (!z && Theme.previousTheme == null) {
                    Theme.currentDayTheme = themeInfo3;
                    if (Theme.currentTheme == Theme.currentNightTheme) {
                        Theme.switchNightThemeDelay = 2000;
                        Theme.lastDelayUpdateTime = SystemClock.elapsedRealtime();
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(3), 2100L);
                    }
                }
                Theme.currentTheme = themeInfo3;
                Theme.refreshThemeColors(false, false);
                themeInfo = themeInfo3;
                if (Theme.previousTheme == null && !Theme.switchingNightTheme) {
                    MessagesController.getInstance(themeInfo.account).saveTheme(themeInfo, themeInfo.getAccent(false), z, false);
                }
                theme$$ExternalSyntheticLambda8.run();
            }
            if (!z) {
                SharedPreferences.Editor editorEdit2 = MessagesController.getGlobalMainSettings().edit();
                editorEdit2.putString("theme", themeInfo3.getKey());
                editorEdit2.apply();
            }
            String[] strArr = new String[1];
            final QrActivity$$ExternalSyntheticLambda15 qrActivity$$ExternalSyntheticLambda15 = new QrActivity$$ExternalSyntheticLambda15(strArr, themeInfo3, z, theme$$ExternalSyntheticLambda8, 2);
            themeInfo = themeInfo3;
            try {
                String str = themeInfo.assetName;
                if (str != null) {
                    Utilities.themeQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda271(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj2) {
                            SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                            switch (i) {
                                case 0:
                                    Theme.currentColorsNoAccent = sparseIntArray;
                                    qrActivity$$ExternalSyntheticLambda15.run();
                                    break;
                                default:
                                    Theme.currentColorsNoAccent = sparseIntArray;
                                    qrActivity$$ExternalSyntheticLambda15.run();
                                    break;
                            }
                        }
                    }, obj, str, obj, 8));
                } else {
                    Utilities.themeQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda271(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj2) {
                            SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                            switch (i2) {
                                case 0:
                                    Theme.currentColorsNoAccent = sparseIntArray;
                                    qrActivity$$ExternalSyntheticLambda15.run();
                                    break;
                                default:
                                    Theme.currentColorsNoAccent = sparseIntArray;
                                    qrActivity$$ExternalSyntheticLambda15.run();
                                    break;
                            }
                        }
                    }, new File(themeInfo.pathToFile), obj, strArr, 8));
                }
            } catch (Exception e) {
                e = e;
                FileLog.e(e);
                if (Theme.previousTheme == null) {
                    MessagesController.getInstance(themeInfo.account).saveTheme(themeInfo, themeInfo.getAccent(false), z, false);
                }
                theme$$ExternalSyntheticLambda8.run();
            }
        } catch (Exception e2) {
            e = e2;
            themeInfo = themeInfo3;
        }
    }

    public final void checkBlackScreen(String str) {
        if (BuildVars.DEBUG_VERSION) {
            ArrayList arrayList = this.lastActions;
            StringBuilder sbM = Log.m(str, " ");
            sbM.append(this.fragmentsStack.size());
            arrayList.add(0, sbM.toString());
            if (this.lastActions.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < 10; i++) {
                    arrayList2.add((String) this.lastActions.get(i));
                }
                this.lastActions = arrayList2;
            }
        }
        ActionBarLayout$$ExternalSyntheticLambda11 actionBarLayout$$ExternalSyntheticLambda11 = this.debugBlackScreenRunnable;
        AndroidUtilities.cancelRunOnUIThread(actionBarLayout$$ExternalSyntheticLambda11);
        AndroidUtilities.runOnUIThread(actionBarLayout$$ExternalSyntheticLambda11, 500L);
    }

    public final void checkNeedRebuild() {
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

    public final boolean checkTransitionAnimation() {
        if (this.transitionAnimationPreviewMode) {
            return false;
        }
        if (this.transitionAnimationInProgress && (this.transitionAnimationStartTime < System.currentTimeMillis() - 1500 || this.inPreviewMode)) {
            onAnimationEndCheck(true);
        }
        return this.transitionAnimationInProgress;
    }

    public final void closeLastFragment() {
        closeLastFragment(false, false);
    }

    public final void dismissDialogs() {
        List<BaseFragment> fragmentStack = getFragmentStack();
        if (fragmentStack.isEmpty()) {
            return;
        }
        ((BaseFragment) RendererCapabilities.CC.m(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void dispatchApplyWindowInsetsInternal(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat.BuilderImpl builderImpl29;
        boolean z = this.isLayersLayout;
        if (z) {
            if (!(view instanceof LayoutContainer) || !((LayoutContainer) view).isSupportEdgeToEdge) {
                ViewCompat.dispatchApplyWindowInsets(view, WindowInsetsCompat.CONSUMED);
                return;
            }
            int i = windowInsetsCompat.mImpl.getInsets(8).bottom;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int iMax = Math.max(0, i - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                builderImpl29 = new WindowInsetsCompat.BuilderImpl34(windowInsetsCompat2);
            } else if (i2 >= 30) {
                builderImpl29 = new WindowInsetsCompat.BuilderImpl30(windowInsetsCompat2);
            } else {
                builderImpl29 = i2 >= 29 ? new WindowInsetsCompat.BuilderImpl29(windowInsetsCompat2) : new WindowInsetsCompat.BuilderImpl20(windowInsetsCompat2);
            }
            builderImpl29.setInsets(8, Insets.of(0, 0, 0, iMax));
            ViewCompat.dispatchApplyWindowInsets(view, builderImpl29.build());
            return;
        }
        boolean z2 = this.isRightLayout;
        boolean z3 = (z || z2 || !(getParent() instanceof RelativeLayout)) ? false : true;
        Insets insets = this.systemAndDisplayInsets;
        Insets insets2 = this.systemAndDisplayAndImeInsets;
        if (view instanceof BottomSheetTabs) {
            AndroidUtilities.setViewLayoutMargins(view, z2 ? 0 : insets.left, 0, z3 ? 0 : insets.right, insets.bottom);
            return;
        }
        if (view instanceof LayoutContainer) {
            LayoutContainer layoutContainer = (LayoutContainer) view;
            int bottomTabsHeight = getBottomTabsHeight(false);
            int iMax2 = bottomTabsHeight > 0 ? insets.bottom + bottomTabsHeight : 0;
            EdgeToEdgeSupportMode edgeToEdgeSupportMode = layoutContainer.edgeToEdgeSupportMode;
            boolean z4 = edgeToEdgeSupportMode == EdgeToEdgeSupportMode.FULL;
            int i3 = (z4 || z2) ? 0 : insets2.left;
            int i4 = (z4 || z3) ? 0 : insets2.right;
            int i5 = (!z4 || z2) ? insets2.left : 0;
            int i6 = (!z4 || z3) ? insets2.right : 0;
            if (edgeToEdgeSupportMode == EdgeToEdgeSupportMode.NONE) {
                iMax2 = Math.max(iMax2, insets2.bottom);
                ViewCompat.dispatchApplyWindowInsets(view, WindowInsetsCompat.CONSUMED);
            } else {
                ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat.mImpl.inset(i5, 0, i6, iMax2));
            }
            view.setPadding(i3, 0, i4, iMax2);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.bottomSheetTabs == null || getBottomTabsHeight(true) <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.bottomSheetTabs.getMeasuredHeight() + this.systemAndDisplayInsets.bottom), getWidth(), getHeight(), this.bottomSheetTabs.getBackgroundPaint());
        }
        this.withShadow = true;
        if (this.isLayersLayout) {
            canvas2.save();
            float fDp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.clipPath;
            path.rewind();
            path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.isLayersLayout) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate = this.delegate;
        return (iNavigationLayoutDelegate != null && iNavigationLayoutDelegate.onPreIme()) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        BaseFragment.AttachedSheet lastSheet;
        boolean z = motionEvent.getY() > ((float) ((getHeight() - getBottomTabsHeight(true)) - this.systemAndDisplayInsets.bottom));
        AnonymousClass1 anonymousClass1 = this.sheetFragment;
        BaseFragment.AttachedSheet attachedSheet = null;
        if (anonymousClass1 == null || anonymousClass1.getLastSheet() == null) {
            lastSheet = null;
        } else {
            lastSheet = getLastSheet();
            if (!lastSheet.attachedToParent() || lastSheet.getWindowView() == null) {
                lastSheet = null;
            }
        }
        if (lastSheet != null || getLastFragment() == null || getLastFragment().getLastSheet() == null) {
            attachedSheet = lastSheet;
        } else {
            lastSheet = getLastFragment().getLastSheet();
            if (lastSheet.attachedToParent() && lastSheet.getWindowView() != null) {
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
                return attachedSheet.getWindowView().dispatchTouchEvent(motionEvent);
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.tabsEvents = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int iMax;
        int i;
        Canvas canvas2;
        int i2;
        float f;
        LayoutContainer layoutContainer;
        View childAt;
        int i3;
        int i4;
        int iClamp;
        int i5;
        WindowInsets rootWindowInsets;
        float f2;
        float fMin;
        MHTML mhtml;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingRight = getPaddingRight() + ((int) this.innerTranslationX);
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view != this.containerViewBack) {
            if (view == this.containerView) {
                iMax = paddingLeft2;
                i = paddingRight;
            }
            int iSave = canvas.save();
            if (view != this.bottomSheetTabs || (mhtml = this.bottomSheetTabsClip) == null) {
                canvas2 = canvas;
            } else {
                boolean z = this.withShadow;
                boolean z2 = this.isKeyboardVisible;
                int width2 = getWidth();
                getY();
                getHeight();
                mhtml.clip(canvas, z, z2, width2, 1.0f);
                canvas2 = canvas;
                this.withShadow = false;
            }
            i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31 || this.isSheet || (paddingRight == 0 && this.overrideWidthOffset == -1)) {
                f = 12.0f;
            } else if (view == this.containerView) {
                WindowInsets rootWindowInsets2 = getRootWindowInsets();
                if (rootWindowInsets2 != null) {
                    f = 12.0f;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f3 = paddingRight;
                    rectF.set(f3, 0.0f, getWidth() + paddingRight, getHeight());
                    if (newBackTransitions()) {
                        if (this.predictiveBackInProgress) {
                            f2 = 56.0f;
                            fMin = AndroidUtilities.lerp(1.0f, AndroidUtilities.lerp(0.9f, 0.85f, 1.0f - this.containerView.getAlpha()), Utilities.clamp01(f3 / AndroidUtilities.dpf2(56.0f)));
                        } else {
                            f2 = 56.0f;
                            fMin = 1.0f - Math.min(0.25f, (0.05f * f3) / AndroidUtilities.dpf2(56.0f));
                        }
                        float fClamp = (paddingRight <= AndroidUtilities.dp(f2) || this.animationInProgress || !this.predictiveBackInProgress) ? Utilities.clamp(paddingRight, AndroidUtilities.dp(f2), 0) : f3;
                        if (!this.predictiveBackInProgress || this.predictiveBackLeft) {
                            canvas2.translate(-fClamp, 0.0f);
                            iMax = (int) (iMax + fClamp);
                        } else {
                            canvas2.translate(-fClamp, 0.0f);
                            rectF.set(f3, 0.0f, getWidth() + paddingRight, getHeight());
                            iMax = (int) (iMax + fClamp);
                        }
                        canvas2.scale(fMin, fMin, this.predictiveBackLeft ? rectF.right - AndroidUtilities.dp(82.0f) : rectF.left + AndroidUtilities.dp(82.0f), this.predictiveBackInProgress ? this.predictiveBackY : rectF.centerY());
                    }
                    RoundedCorner roundedCorner = rootWindowInsets2.getRoundedCorner(0);
                    RoundedCorner roundedCorner2 = rootWindowInsets2.getRoundedCorner(1);
                    RoundedCorner roundedCorner3 = rootWindowInsets2.getRoundedCorner(2);
                    RoundedCorner roundedCorner4 = rootWindowInsets2.getRoundedCorner(3);
                    float radius = roundedCorner == null ? 0.0f : roundedCorner.getRadius();
                    float[] fArr = this.radii;
                    fArr[1] = radius;
                    fArr[0] = radius;
                    float radius2 = roundedCorner2 == null ? 0.0f : roundedCorner2.getRadius();
                    fArr[3] = radius2;
                    fArr[2] = radius2;
                    float radius3 = roundedCorner3 == null ? 0.0f : roundedCorner3.getRadius();
                    fArr[5] = radius3;
                    fArr[4] = radius3;
                    float radius4 = roundedCorner4 == null ? 0.0f : roundedCorner4.getRadius();
                    fArr[7] = radius4;
                    fArr[6] = radius4;
                    if (this.isRightLayout) {
                        float fClamp01 = Utilities.clamp01(Math.abs(paddingRight) / AndroidUtilities.dpf2(12.0f));
                        fArr[0] = fArr[0] * fClamp01;
                        fArr[1] = fArr[1] * fClamp01;
                        fArr[6] = fArr[6] * fClamp01;
                        fArr[7] = fArr[7] * fClamp01;
                    }
                    Path path = this.clipPath;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas2.clipPath(path);
                } else {
                    f = 12.0f;
                }
            } else {
                f = 12.0f;
                if (view == this.containerViewBack && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner5 = rootWindowInsets.getRoundedCorner(0);
                    RoundedCorner roundedCorner6 = rootWindowInsets.getRoundedCorner(3);
                    iMax += Math.max(roundedCorner5 == null ? 0 : roundedCorner5.getRadius(), roundedCorner6 == null ? 0 : roundedCorner6.getRadius());
                    if (newBackTransitions()) {
                        iMax = getPaddingLeft() + width;
                    }
                }
            }
            int iSave2 = canvas2.save();
            if (!this.transitionAnimationInProgress && !this.animationInProgress && !this.inPreviewMode) {
                canvas2.clipRect(i, 0, iMax, getHeight());
            }
            if ((this.inPreviewMode || this.transitionAnimationPreviewMode) && view == (layoutContainer = this.containerView) && (childAt = layoutContainer.getChildAt(0)) != null) {
                this.previewBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.previewBackgroundDrawable.draw(canvas2);
                if (this.previewMenu == null) {
                    int iDp = AndroidUtilities.dp(32.0f);
                    int measuredWidth = (getMeasuredWidth() - iDp) / 2;
                    int translationY = (int) ((layoutContainer.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(f));
                    Theme.moveUpDrawable.setBounds(measuredWidth, translationY, iDp + measuredWidth, (iDp / 2) + translationY);
                    Theme.moveUpDrawable.draw(canvas2);
                }
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
        paddingLeft2 = AndroidUtilities.dp(1.0f) + paddingRight;
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
            f = 12.0f;
        } else {
            f = 12.0f;
        }
        int iSave4 = canvas2.save();
        if (!this.transitionAnimationInProgress) {
            canvas2.clipRect(i, 0, iMax, getHeight());
        }
        if (this.inPreviewMode) {
            this.previewBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.previewBackgroundDrawable.draw(canvas2);
            if (this.previewMenu == null) {
                int iDp2 = AndroidUtilities.dp(32.0f);
                int measuredWidth2 = (getMeasuredWidth() - iDp2) / 2;
                int translationY2 = (int) ((layoutContainer.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(f));
                Theme.moveUpDrawable.setBounds(measuredWidth2, translationY2, iDp2 + measuredWidth2, (iDp2 / 2) + translationY2);
                Theme.moveUpDrawable.draw(canvas2);
            }
        } else {
            this.previewBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.previewBackgroundDrawable.draw(canvas2);
            if (this.previewMenu == null) {
                int iDp3 = AndroidUtilities.dp(32.0f);
                int measuredWidth3 = (getMeasuredWidth() - iDp3) / 2;
                int translationY3 = (int) ((layoutContainer.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(f));
                Theme.moveUpDrawable.setBounds(measuredWidth3, translationY3, iDp3 + measuredWidth3, (iDp3 / 2) + translationY3);
                Theme.moveUpDrawable.draw(canvas2);
            }
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

    public final void drawHeaderShadow(Canvas canvas, int i, int i2) {
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

    public final void expandPreviewFragment() {
        boolean z = true;
        this.previewOpenAnimationInProgress = true;
        this.inPreviewMode = false;
        BaseFragment baseFragment = (BaseFragment) zzir.m(2, this.fragmentsStack);
        BaseFragment baseFragment2 = (BaseFragment) zzir.m(1, this.fragmentsStack);
        baseFragment2.fragmentView.setOutlineProvider(null);
        baseFragment2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) baseFragment2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        baseFragment2.fragmentView.setLayoutParams(layoutParams);
        presentFragmentInternalRemoveOld(baseFragment, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(baseFragment2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(baseFragment2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new CubicBezierInterpolator(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ChatActivity.AnonymousClass74(this, baseFragment2, false, 4));
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
            if (Theme.getColor(null, Theme.key_actionBarDefault, false) != -1) {
                if (baseFragment2.hasForceLightStatusBar()) {
                    Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
                    if (themeInfo == null) {
                        themeInfo = Theme.defaultTheme;
                    }
                    if (themeInfo.isDark()) {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            AndroidUtilities.setLightStatusBar(activity, z);
        } catch (Exception unused2) {
        }
    }

    public final boolean extendActionMode(Menu menu) {
        return !this.fragmentsStack.isEmpty() && ((BaseFragment) zzir.m(1, this.fragmentsStack)).extendActionMode(menu);
    }

    public final BaseFragment findFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int iM = ArticleViewer.IBlock.CC.m(this, 1); iM >= 0; iM--) {
            BaseFragment baseFragment = getFragmentStack().get(iM);
            if (baseFragment != null && !baseFragment.isFinishing() && !baseFragment.isRemovingFromStack() && LoginActivity.class.isInstance(baseFragment)) {
                return baseFragment;
            }
        }
        return null;
    }

    public BaseFragment getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (BaseFragment) ArticleViewer.IBlock.CC.m(this, 2, getFragmentStack());
    }

    @Override
    public BottomSheet getBottomSheet() {
        return null;
    }

    public BottomSheetTabs getBottomSheetTabs() {
        return this.bottomSheetTabs;
    }

    public final int getBottomTabsHeight(boolean z) {
        BottomSheetTabs bottomSheetTabs;
        if (!this.main || (bottomSheetTabs = this.bottomSheetTabs) == null) {
            return 0;
        }
        return z ? (int) bottomSheetTabs.bottomTabsProgress : bottomSheetTabs.bottomTabsHeight;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.inPreviewMode && !this.transitionAnimationPreviewMode && !this.previewOpenAnimationInProgress) {
            return 0.0f;
        }
        BaseFragment baseFragment = this.oldFragment;
        return ((baseFragment == null || !baseFragment.inPreviewMode) ? this.containerView : this.containerViewBack).getAlpha();
    }

    public DrawerLayoutContainer getDrawerLayoutContainer() {
        return this.drawerLayoutContainer;
    }

    public List<BaseFragment> getFragmentStack() {
        return this.fragmentsStack;
    }

    public float getInnerTranslationX() {
        return this.innerTranslationX;
    }

    public BaseFragment getLastFragment() {
        if (this.fragmentsStack.isEmpty()) {
            return null;
        }
        return (BaseFragment) zzir.m(1, this.fragmentsStack);
    }

    public BaseFragment getLastFragmentIncludeMainTabs() {
        BaseFragment lastFragment = getLastFragment();
        return lastFragment instanceof MainTabsActivity ? ((MainTabsActivity) lastFragment).getCurrentVisibleFragment() : lastFragment;
    }

    public MessageDrawable getMessageDrawableOutMediaStart() {
        return this.messageDrawableOutMediaStart;
    }

    public MessageDrawable getMessageDrawableOutStart() {
        return this.messageDrawableOutStart;
    }

    public FrameLayout getOverlayContainerView() {
        return this;
    }

    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
    }

    public List<BackButtonMenu.PulledDialog> getPulledDialogs() {
        return this.pulledDialogs;
    }

    public BaseFragment getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int iM = ArticleViewer.IBlock.CC.m(this, 1); iM >= 0; iM--) {
            BaseFragment baseFragment = getFragmentStack().get(iM);
            if (baseFragment != null && !baseFragment.isFinishing() && !baseFragment.isRemovingFromStack()) {
                return baseFragment;
            }
        }
        return null;
    }

    public EmptyBaseFragment getSheetFragment() {
        return getSheetFragment$1();
    }

    public final EmptyBaseFragment getSheetFragment$1() {
        Activity activity = this.parentActivity;
        if (activity == null) {
            return null;
        }
        if (this.sheetFragment == null) {
            ?? r1 = new EmptyBaseFragment() {
                @Override
                public final void updateSheetsVisibility() {
                    super.updateSheetsVisibility();
                    ActionBarLayout.this.invalidate();
                }
            };
            this.sheetFragment = r1;
            r1.setParentLayout(this);
            AnonymousClass1 anonymousClass1 = this.sheetFragment;
            View viewPerformCreateView = anonymousClass1.fragmentView;
            if (viewPerformCreateView == null) {
                viewPerformCreateView = anonymousClass1.performCreateView(activity);
            }
            if (viewPerformCreateView.getParent() != this.sheetContainer) {
                AndroidUtilities.removeFromParent(viewPerformCreateView);
                this.sheetContainer.addView(viewPerformCreateView, LayoutHelper.createFrame(-1.0f, -1));
                this.sheetContainer.setShouldHandleBottomInsets(getEdgeToEdgeSupportMode());
                this.sheetContainer.setDrawNavigationBar(drawEdgeNavigationBar());
            }
            onResume();
            onBecomeFullyVisible();
        }
        return this.sheetFragment;
    }

    public float getThemeAnimationValue() {
        return this.themeAnimationValue;
    }

    public ViewGroup getView() {
        return this;
    }

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

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean isInPreviewMode() {
        return this.inPreviewMode || this.transitionAnimationPreviewMode;
    }

    public final boolean isLayersLayout() {
        return this.isLayersLayout;
    }

    public final int measureKeyboardHeight() {
        View rootView = getRootView();
        Rect rect = this.rect;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean newBackTransitions() {
        return this.predictiveBackInProgress && this.predictiveBackHasProgress;
    }

    public final void onAnimationEndCheck(boolean z) {
        onCloseAnimationEnd();
        onOpenAnimationEnd$1();
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
        AnonymousClass3 anonymousClass3 = this.animationRunnable;
        if (anonymousClass3 != null) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass3);
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
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
    }

    public final void onBackPressed() {
        ActionBar actionBar;
        if (this.transitionAnimationPreviewMode || this.startedTracking || checkTransitionAnimation() || this.fragmentsStack.isEmpty()) {
            return;
        }
        GroupCallPip groupCallPip = GroupCallPip.instance;
        if (groupCallPip != null && groupCallPip.showAlert) {
            groupCallPip.showAlert(false);
            return;
        }
        if (!storyViewerAttached() && (actionBar = this.currentActionBar) != null && !actionBar.isActionModeShowed()) {
            ActionBar actionBar2 = this.currentActionBar;
            if (actionBar2.isSearchFieldVisible) {
                actionBar2.closeSearchField(true);
                return;
            }
        }
        AnonymousClass1 anonymousClass1 = this.sheetFragment;
        if ((anonymousClass1 == null || anonymousClass1.onBackPressed(true)) && ((BaseFragment) zzir.m(1, this.fragmentsStack)).onBackPressed(true) && !this.fragmentsStack.isEmpty()) {
            closeLastFragment(true, false);
        }
    }

    public final void onCloseAnimationEnd() {
        if (!this.transitionAnimationInProgress || this.onCloseAnimationEndRunnable == null) {
            return;
        }
        AnimatorSet animatorSet = this.currentAnimation;
        if (animatorSet != null) {
            this.currentAnimation = null;
            animatorSet.cancel();
        }
        this.transitionAnimationInProgress = false;
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

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
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
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
    }

    public final void onFragmentStackChanged(String str) {
        Runnable runnable = this.onFragmentStackChangedListener;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        checkBlackScreen(str);
    }

    @Override
    public final List onGetDebugItems() {
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof FloatingDebugProvider) {
            arrayList.addAll(((FloatingDebugProvider) lastFragment).onGetDebugItems());
        }
        observeDebugItemsFromView(lastFragment.getFragmentView(), arrayList);
        return arrayList;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.animationInProgress || checkTransitionAnimation() || onTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        ActionBar actionBar;
        ActionBarMenu actionBarMenu;
        if (i == 82 && !checkTransitionAnimation() && !this.startedTracking && (actionBar = this.currentActionBar) != null && !actionBar.isActionModeShowed() && (actionBarMenu = actionBar.menu) != null) {
            int childCount = actionBarMenu.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = actionBarMenu.getChildAt(i2);
                if (childAt instanceof ActionBarMenuItem) {
                    ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                    if (actionBarMenuItem.getVisibility() == 0) {
                        if (actionBarMenuItem.hasSubMenu()) {
                            actionBarMenuItem.toggleSubMenu(null, null);
                            break;
                        }
                        if (actionBarMenuItem.overrideMenuClick) {
                            actionBarMenu.onItemClick(((Integer) actionBarMenuItem.getTag()).intValue());
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
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
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                BottomSheetTabs bottomSheetTabs = this.bottomSheetTabs;
                if (childAt == bottomSheetTabs) {
                    bottomSheetTabs.setCurrentAccount(UserConfig.selectedAccount);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.gravity;
                if (i12 == -1) {
                    i12 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection());
                int i13 = i12 & 112;
                int i14 = absoluteGravity & 7;
                if (i14 != 1) {
                    if (i14 != 5) {
                        i7 = layoutParams.leftMargin + paddingLeft;
                    } else {
                        i5 = paddingRight - measuredWidth;
                        i6 = layoutParams.rightMargin;
                    }
                    if (i13 == 16) {
                        i8 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    } else if (i13 == 48 && i13 == 80) {
                        i8 = paddingBottom - measuredHeight;
                        i9 = layoutParams.bottomMargin;
                    } else {
                        i10 = i + paddingTop;
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
                } else {
                    i5 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                if (i13 == 16) {
                    int i15 = i13 == 48 ? layoutParams.topMargin : layoutParams.topMargin;
                    i10 = i15 + paddingTop;
                    if (childAt != this.bottomSheetTabs) {
                        if (childAt == this.bottomSheetTabs) {
                            this.savedBottomSheetTabsTop = i10;
                        }
                    } else if (childAt == this.bottomSheetTabs) {
                        this.savedBottomSheetTabsTop = i10;
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                } else {
                    i8 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                    i9 = layoutParams.bottomMargin;
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

    public final void onLowMemory() {
        Iterator it = this.fragmentsStack.iterator();
        while (it.hasNext()) {
            ((BaseFragment) it.next()).onLowMemory();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        BaseFragment baseFragment = !this.fragmentsStack.isEmpty() ? (BaseFragment) zzir.m(1, this.fragmentsStack) : null;
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
            i = iArr[0];
            i2 = iArr[1];
        }
        this.isKeyboardVisible = measureKeyboardHeight() > AndroidUtilities.dp(20.0f);
        super.onMeasure(i, i2);
    }

    public final void onOpenAnimationEnd$1() {
        Runnable runnable;
        if (!this.transitionAnimationInProgress || (runnable = this.onOpenAnimationEndRunnable) == null) {
            return;
        }
        this.transitionAnimationInProgress = false;
        this.transitionAnimationPreviewMode = false;
        this.transitionAnimationStartTime = 0L;
        this.newFragment = null;
        this.oldFragment = null;
        this.onOpenAnimationEndRunnable = null;
        runnable.run();
        checkNeedRebuild();
    }

    public final void onPause() {
        if (!this.fragmentsStack.isEmpty()) {
            ((BaseFragment) zzir.m(1, this.fragmentsStack)).onPause();
        }
        AnonymousClass1 anonymousClass1 = this.sheetFragment;
        if (anonymousClass1 != null) {
            anonymousClass1.onPause();
        }
    }

    public final void onResume() {
        if (!this.fragmentsStack.isEmpty()) {
            ((BaseFragment) zzir.m(1, this.fragmentsStack)).onResume();
        }
        AnonymousClass1 anonymousClass1 = this.sheetFragment;
        if (anonymousClass1 != null) {
            anonymousClass1.onResume();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass1 anonymousClass1;
        boolean z = false;
        if (!checkTransitionAnimation() && !this.inActionMode && !this.animationInProgress && !this.predictiveBackInProgress) {
            if (this.fragmentsStack.size() > 1 && ((anonymousClass1 = this.sheetFragment) == null || anonymousClass1.getLastSheet() == null || !getLastSheet().isShown())) {
                if (motionEvent == null || motionEvent.getAction() != 0) {
                    if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                        if (this.velocityTracker == null) {
                            this.velocityTracker = VelocityTracker.obtain();
                        }
                        int iMax = Math.max(0, (int) (motionEvent.getX() - this.startedTrackingX));
                        int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                        this.velocityTracker.addMovement(motionEvent);
                        if (this.transitionAnimationInProgress || this.inPreviewMode || !this.maybeStartTracking || this.startedTracking || iMax < AndroidUtilities.getPixelsInCM(0.4f, true) || Math.abs(iMax) / 3 <= iAbs) {
                            if (this.startedTracking) {
                                if (!this.beginTrackingSent) {
                                    Activity activity = this.parentActivity;
                                    if (activity.getCurrentFocus() != null) {
                                        AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                                    }
                                    ((BaseFragment) zzir.m(1, this.fragmentsStack)).onBeginSlide();
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
                        } else if (((BaseFragment) zzir.m(1, this.fragmentsStack)).canBeginSlide() && findScrollingChild$1(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.startedTrackingX = (int) motionEvent.getX();
                            prepareForMoving();
                        } else {
                            this.maybeStartTracking = false;
                        }
                    } else if (motionEvent != null && motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                        if (this.velocityTracker == null) {
                            this.velocityTracker = VelocityTracker.obtain();
                        }
                        this.velocityTracker.addMovement(motionEvent);
                        this.velocityTracker.computeCurrentVelocity(1000);
                        BaseFragment baseFragment = (BaseFragment) zzir.m(1, this.fragmentsStack);
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
                            LayoutContainer layoutContainer = this.containerView;
                            if (layoutContainer != null) {
                                layoutContainer.setLayerType(0, null);
                            }
                        }
                        VelocityTracker velocityTracker = this.velocityTracker;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.velocityTracker = null;
                        }
                    } else if (motionEvent == null) {
                        this.maybeStartTracking = false;
                        this.startedTracking = false;
                        LayoutContainer layoutContainer2 = this.containerView;
                        if (layoutContainer2 != null) {
                            layoutContainer2.setLayerType(0, null);
                        }
                        VelocityTracker velocityTracker2 = this.velocityTracker;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.velocityTracker = null;
                        }
                    }
                } else if (((BaseFragment) zzir.m(1, this.fragmentsStack)).isSwipeBackEnabled(motionEvent)) {
                    this.startedTrackingPointerId = motionEvent.getPointerId(0);
                    this.maybeStartTracking = true;
                    this.startedTrackingX = (int) motionEvent.getX();
                    this.startedTrackingY = (int) motionEvent.getY();
                    VelocityTracker velocityTracker3 = this.velocityTracker;
                    if (velocityTracker3 != null) {
                        velocityTracker3.clear();
                    }
                } else {
                    this.maybeStartTracking = false;
                    this.startedTracking = false;
                    LayoutContainer layoutContainer3 = this.containerView;
                    if (layoutContainer3 != null) {
                        layoutContainer3.setLayerType(0, null);
                        return false;
                    }
                }
            }
            return this.startedTracking;
        }
        return false;
    }

    public final void parentDraw(Canvas canvas, ViewGroup viewGroup) {
        if (this.bottomSheetTabs == null || getHeight() >= viewGroup.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(this.bottomSheetTabs.getX() + getX(), this.bottomSheetTabs.getY() + getY());
        this.bottomSheetTabs.draw(canvas);
        canvas.restore();
    }

    public final void prepareForMoving() {
        this.maybeStartTracking = false;
        this.startedTracking = true;
        this.containerViewBack.setVisibility(0);
        this.beginTrackingSent = false;
        int i = 2;
        BaseFragment baseFragment = (BaseFragment) zzir.m(2, this.fragmentsStack);
        View viewPerformCreateView = baseFragment.fragmentView;
        if (viewPerformCreateView == null && (viewPerformCreateView = baseFragment.performCreateView(this.parentActivity)) != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
            AlertDialog$$ExternalSyntheticLambda11 alertDialog$$ExternalSyntheticLambda11 = new AlertDialog$$ExternalSyntheticLambda11(baseFragment, i);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(viewPerformCreateView, alertDialog$$ExternalSyntheticLambda11);
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
        if (actionBar != null && actionBar.addToContainer) {
            AndroidUtilities.removeFromParent(actionBar);
            if (this.removeActionBarExtraHeight) {
                baseFragment.actionBar.setOccupyStatusBar(false);
            }
            this.containerViewBack.addView(baseFragment.actionBar);
        }
        baseFragment.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
        baseFragment.attachSheets(this.containerViewBack);
        if (!baseFragment.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
            viewPerformCreateView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        }
        baseFragment.onResume();
        if (this.themeAnimatorSet != null) {
            this.presentingFragmentDescriptions = baseFragment.getThemeDescriptions();
        }
        this.containerView.setLayerType(2, null);
        ((BaseFragment) zzir.m(1, this.fragmentsStack)).prepareFragmentToSlide(true, true);
        baseFragment.prepareFragmentToSlide(false, true);
    }

    public final boolean presentFragment(INavigationLayout.NavigationParams navigationParams) {
        INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate;
        Dialog dialog;
        ArrayList arrayList;
        int iDp;
        AnimatorSet animatorSet;
        LaunchActivity launchActivity;
        Dialog dialog2;
        int i = 1;
        final BaseFragment baseFragment = navigationParams.fragment;
        boolean z = navigationParams.removeLast;
        boolean z2 = navigationParams.noAnimation;
        boolean z3 = navigationParams.checkPresentFromDelegate;
        final boolean z4 = navigationParams.preview;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = navigationParams.menuView;
        int i2 = 0;
        if (baseFragment == null || checkTransitionAnimation() || !(((iNavigationLayoutDelegate = this.delegate) == null || !z3 || iNavigationLayoutDelegate.needPresentFragment(this, navigationParams)) && baseFragment.onFragmentCreate())) {
            return false;
        }
        EdgeToEdgeSupportMode edgeToEdgeSupportMode = baseFragment.getEdgeToEdgeSupportMode();
        EdgeToEdgeSupportMode edgeToEdgeSupportMode2 = EdgeToEdgeSupportMode.NONE;
        boolean z5 = edgeToEdgeSupportMode != edgeToEdgeSupportMode2;
        boolean zDrawEdgeNavigationBar = baseFragment.drawEdgeNavigationBar();
        BaseFragment lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.instance) != null) {
            ArrayList arrayList2 = launchActivity.visibleDialogs;
            int size = arrayList2.size() - 1;
            while (true) {
                if (size < 0) {
                    dialog2 = null;
                    break;
                }
                dialog2 = (Dialog) arrayList2.get(size);
                if (dialog2.isShowing()) {
                    break;
                }
                size--;
            }
            if (dialog2 == null) {
                dialog = visibleDialog;
                break;
            }
            LaunchActivity launchActivity2 = LaunchActivity.instance;
            int size2 = launchActivity2.visibleDialogs.size() - 1;
            while (true) {
                if (size2 < 0) {
                    dialog = null;
                    break;
                }
                visibleDialog = (Dialog) launchActivity2.visibleDialogs.get(size2);
                if (visibleDialog.isShowing()) {
                    dialog = visibleDialog;
                    break;
                }
                size2--;
            }
        } else {
            dialog = visibleDialog;
            break;
        }
        if (lastFragment != null && dialog != null && dialog.isShowing() && ((dialog instanceof ChatAttachAlert) || (dialog instanceof BotWebViewSheet))) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            lastFragment.showAsSheet(baseFragment, bottomSheetParams);
            return true;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("present fragment " + baseFragment.getClass().getSimpleName() + " args=" + baseFragment.getArguments());
        }
        int i3 = 0;
        while (true) {
            arrayList = StoryViewer.globalInstances;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((StoryViewer) arrayList.get(i3)).close(false);
            i3++;
        }
        arrayList.clear();
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
        Activity activity = this.parentActivity;
        if (activity.getCurrentFocus() != null && baseFragment.hideKeyboardOnShow() && !z4) {
            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
        }
        boolean z6 = z4 || (!z2 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        BaseFragment baseFragment2 = !this.fragmentsStack.isEmpty() ? (BaseFragment) zzir.m(1, this.fragmentsStack) : null;
        baseFragment.setParentLayout(this);
        View viewPerformCreateView = baseFragment.fragmentView;
        if (viewPerformCreateView == null) {
            viewPerformCreateView = baseFragment.performCreateView(activity);
            if (viewPerformCreateView != null && baseFragment.isSupportEdgeToEdge() && baseFragment.drawEdgeNavigationBar()) {
                AlertDialog$$ExternalSyntheticLambda11 alertDialog$$ExternalSyntheticLambda11 = new AlertDialog$$ExternalSyntheticLambda11(baseFragment, 2);
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(viewPerformCreateView, alertDialog$$ExternalSyntheticLambda11);
                this.containerViewBack.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) viewPerformCreateView.getParent();
            if (viewGroup != null) {
                baseFragment.onRemoveFromParent();
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
            iDp = AndroidUtilities.dp(24.0f) + actionBarPopupWindowLayout.getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindowLayout.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.topMargin = ((getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - iDp) - AndroidUtilities.dp(6.0f);
            actionBarPopupWindowLayout.setLayoutParams(layoutParams);
        } else {
            iDp = 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewPerformCreateView.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z4) {
            int previewHeight = baseFragment.getPreviewHeight();
            int i4 = AndroidUtilities.statusBarHeight;
            if (previewHeight <= 0 || previewHeight >= getMeasuredHeight() - i4) {
                int iDp2 = AndroidUtilities.dp(actionBarPopupWindowLayout != null ? 0.0f : 24.0f);
                layoutParams2.bottomMargin = iDp2;
                layoutParams2.topMargin = iDp2;
                int i5 = AndroidUtilities.statusBarHeight;
                int i6 = iDp2 + i5;
                layoutParams2.topMargin = i6;
                if (z5) {
                    layoutParams2.topMargin = i6 + i5;
                }
            } else {
                layoutParams2.height = previewHeight;
                layoutParams2.topMargin = (((getMeasuredHeight() - i4) - previewHeight) / 2) + i4;
            }
            if (actionBarPopupWindowLayout != null) {
                layoutParams2.bottomMargin = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(iDp, 8.0f, layoutParams2.bottomMargin);
            }
            int iDp3 = AndroidUtilities.dp(8.0f);
            layoutParams2.leftMargin = iDp3;
            layoutParams2.rightMargin = iDp3;
        } else {
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
        }
        viewPerformCreateView.setLayoutParams(layoutParams2);
        ActionBar actionBar = baseFragment.actionBar;
        if (actionBar != null && actionBar.addToContainer) {
            if (this.removeActionBarExtraHeight) {
                actionBar.setOccupyStatusBar(false);
            }
            AndroidUtilities.removeFromParent(baseFragment.actionBar);
            this.containerViewBack.addView(baseFragment.actionBar);
        }
        baseFragment.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
        baseFragment.attachSheets(this.containerViewBack);
        this.fragmentsStack.add(baseFragment);
        onFragmentStackChanged("presentFragment");
        baseFragment.onResume();
        this.currentActionBar = baseFragment.actionBar;
        if (baseFragment.hasOwnBackground || viewPerformCreateView.getBackground() != null) {
            animatorSet = null;
        } else {
            animatorSet = null;
            viewPerformCreateView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        }
        LayoutContainer layoutContainer2 = this.containerView;
        LayoutContainer layoutContainer3 = this.containerViewBack;
        this.containerView = layoutContainer3;
        this.containerViewBack = layoutContainer2;
        layoutContainer3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        if (z4) {
            if (!(baseFragment instanceof ChatActivity)) {
                float fDp = AndroidUtilities.dp(actionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
                viewPerformCreateView.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(0, fDp));
            } else if (actionBarPopupWindowLayout != null) {
                viewPerformCreateView.setOutlineProvider(new PremiumPreviewFragment.AnonymousClass3());
            } else {
                float fDp2 = AndroidUtilities.dp(29.0f);
                RichEditor.AnonymousClass5 anonymousClass6 = ViewOutlineProviderImpl.BOUNDS_OVAL;
                viewPerformCreateView.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(0, fDp2));
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
        if (z6 == 0) {
            presentFragmentInternalRemoveOld(baseFragment2, z);
            View view = this.backgroundView;
            if (view != null) {
                view.setVisibility(0);
            }
        }
        if (this.themeAnimatorSet != null) {
            this.presentingFragmentDescriptions = baseFragment.getThemeDescriptions();
        }
        if (!z6 && !z4) {
            View view2 = this.backgroundView;
            if (view2 != null) {
                view2.setAlpha(1.0f);
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
        if (this.useAlphaAnimations && this.fragmentsStack.size() == 1) {
            presentFragmentInternalRemoveOld(baseFragment2, z);
            this.transitionAnimationStartTime = System.currentTimeMillis();
            this.transitionAnimationInProgress = true;
            this.onOpenAnimationEndRunnable = new ClickHelper$$ExternalSyntheticLambda0(26, baseFragment2, baseFragment);
            ArrayList arrayList3 = new ArrayList();
            Property property = View.ALPHA;
            arrayList3.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 0.0f, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 0.9f, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 0.9f, 1.0f));
            View view3 = this.backgroundView;
            if (view3 != null) {
                view3.setVisibility(0);
                arrayList3.add(ObjectAnimator.ofFloat(this.backgroundView, (Property<View, Float>) property, 0.0f, 1.0f));
            }
            if (baseFragment2 != null) {
                baseFragment2.onTransitionAnimationStart(false, false);
            }
            baseFragment.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.playTogether(arrayList3);
            this.currentAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.currentAnimation.setDuration(200L);
            this.currentAnimation.addListener(new AnonymousClass5(this, i2));
            this.currentAnimation.start();
            return true;
        }
        this.transitionAnimationPreviewMode = z4;
        this.transitionAnimationStartTime = System.currentTimeMillis();
        this.transitionAnimationInProgress = true;
        ActionBarLayout$$ExternalSyntheticLambda16 actionBarLayout$$ExternalSyntheticLambda16 = new ActionBarLayout$$ExternalSyntheticLambda16(this, z4, actionBarPopupWindowLayout, z, baseFragment2, baseFragment);
        final BaseFragment baseFragment3 = baseFragment2;
        this.onOpenAnimationEndRunnable = actionBarLayout$$ExternalSyntheticLambda16;
        boolean zNeedDelayOpenAnimation = baseFragment.needDelayOpenAnimation();
        final boolean z7 = !zNeedDelayOpenAnimation;
        if (!zNeedDelayOpenAnimation) {
            if (baseFragment3 != null) {
                baseFragment3.onTransitionAnimationStart(false, false);
            }
            baseFragment.onTransitionAnimationStart(true, false);
        }
        this.delayedAnimationResumed = false;
        this.oldFragment = baseFragment3;
        this.newFragment = baseFragment;
        AnimatorSet animatorSetOnCustomTransitionAnimation = !z4 ? baseFragment.onCustomTransitionAnimation(true, new ActionBarLayout$$ExternalSyntheticLambda11(this, 2)) : animatorSet;
        if (animatorSetOnCustomTransitionAnimation != null) {
            if (!z4 && ((this.containerView.isKeyboardVisible || this.containerViewBack.isKeyboardVisible) && baseFragment3 != null)) {
                baseFragment3.saveKeyboardPositionBeforeTransition();
            }
            this.currentAnimation = animatorSetOnCustomTransitionAnimation;
            return true;
        }
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
        if (!this.containerView.isKeyboardVisible && !this.containerViewBack.isKeyboardVisible) {
            if (!baseFragment.needDelayOpenAnimation()) {
                startLayoutAnimation(true, true, z4);
                return true;
            }
            NanoHTTPD.ServerRunnable serverRunnable = new NanoHTTPD.ServerRunnable(this, baseFragment, z4, i);
            this.delayedOpenAnimationRunnable = serverRunnable;
            AndroidUtilities.runOnUIThread(serverRunnable, 200L);
            return true;
        }
        if (baseFragment3 != null && !z4) {
            baseFragment3.saveKeyboardPositionBeforeTransition();
        }
        this.waitingForKeyboardCloseRunnable = new Runnable() {
            @Override
            public final void run() {
                ActionBarLayout actionBarLayout = ActionBarLayout.this;
                if (actionBarLayout.waitingForKeyboardCloseRunnable != this) {
                    return;
                }
                actionBarLayout.waitingForKeyboardCloseRunnable = null;
                if (z7) {
                    BaseFragment baseFragment4 = baseFragment3;
                    if (baseFragment4 != null) {
                        baseFragment4.onTransitionAnimationStart(false, false);
                    }
                    baseFragment.onTransitionAnimationStart(true, false);
                    actionBarLayout.startLayoutAnimation(true, true, z4);
                    return;
                }
                Runnable runnable2 = actionBarLayout.delayedOpenAnimationRunnable;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    if (actionBarLayout.delayedAnimationResumed) {
                        actionBarLayout.delayedOpenAnimationRunnable.run();
                    } else {
                        AndroidUtilities.runOnUIThread(actionBarLayout.delayedOpenAnimationRunnable, 200L);
                    }
                }
            }
        };
        if (baseFragment.needDelayOpenAnimation()) {
            this.delayedOpenAnimationRunnable = new zzf(this, baseFragment3, baseFragment, z4);
        }
        AndroidUtilities.runOnUIThread(this.waitingForKeyboardCloseRunnable, 250L);
        return true;
    }

    public final boolean presentFragment$1(BaseFragment baseFragment, boolean z, boolean z2) {
        INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(baseFragment);
        navigationParams.removeLast = z;
        navigationParams.noAnimation = z2;
        navigationParams.checkPresentFromDelegate = true;
        navigationParams.preview = false;
        return presentFragment(navigationParams);
    }

    public final void presentFragmentInternalRemoveOld(BaseFragment baseFragment, boolean z) {
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
            if (actionBar != null && actionBar.addToContainer && (viewGroup = (ViewGroup) actionBar.getParent()) != null) {
                viewGroup.removeViewInLayout(baseFragment.actionBar);
            }
            baseFragment.detachSheets();
        }
        this.containerViewBack.setVisibility(4);
    }

    public final void rebuildAllFragmentViews(boolean z, boolean z2) {
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

    public final void rebuildFragments() {
        rebuildAllFragmentViews(true, true);
    }

    public final void removeAllFragments() {
        while (this.fragmentsStack.size() > 0) {
            removeFragmentFromStackInternal((BaseFragment) this.fragmentsStack.get(0), false);
        }
        View view = this.backgroundView;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new ActionBarLayout$$ExternalSyntheticLambda11(this, 3)).start();
        }
    }

    public final void removeFragmentFromStack(BaseFragment baseFragment) {
        removeFragmentFromStack(baseFragment, false);
    }

    public final void removeFragmentFromStackInternal(BaseFragment baseFragment, boolean z) {
        if (this.fragmentsStack.contains(baseFragment)) {
            if (z && zzir.m(1, this.fragmentsStack) == baseFragment) {
                baseFragment.finishFragment();
                return;
            }
            if (zzir.m(1, this.fragmentsStack) == baseFragment && this.fragmentsStack.size() > 1) {
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
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setBackgroundView(View view) {
        this.backgroundView = view;
    }

    @Override
    public void setDelegate(INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate) {
        this.delegate = iNavigationLayoutDelegate;
    }

    public void setDrawerLayoutContainer(DrawerLayoutContainer drawerLayoutContainer) {
        this.drawerLayoutContainer = drawerLayoutContainer;
    }

    public void setFragmentPanTranslationOffset(int i) {
        LayoutContainer layoutContainer = this.containerView;
        if (layoutContainer != null) {
            layoutContainer.setFragmentPanTranslationOffset(i);
        }
    }

    @Override
    public void setFragmentStack(List<BaseFragment> list) {
        this.fragmentsStack = list;
        BottomSheetTabs bottomSheetTabs = this.bottomSheetTabs;
        if (bottomSheetTabs != null) {
            ActionBarLayout$$ExternalSyntheticLambda11 actionBarLayout$$ExternalSyntheticLambda11 = new ActionBarLayout$$ExternalSyntheticLambda11(this, 4);
            ActionBarLayout$$ExternalSyntheticLambda11 actionBarLayout$$ExternalSyntheticLambda12 = new ActionBarLayout$$ExternalSyntheticLambda11(this, 5);
            bottomSheetTabs.invalidateListeners.remove(actionBarLayout$$ExternalSyntheticLambda11);
            bottomSheetTabs.relayoutListeners.remove(actionBarLayout$$ExternalSyntheticLambda12);
            AndroidUtilities.removeFromParent(this.bottomSheetTabs);
            this.bottomSheetTabs = null;
        }
        boolean z = this.main;
        Activity activity = this.parentActivity;
        if (z) {
            BottomSheetTabs bottomSheetTabs2 = new BottomSheetTabs(activity, this);
            this.bottomSheetTabs = bottomSheetTabs2;
            this.bottomSheetTabsClip = new MHTML(bottomSheetTabs2);
            BottomSheetTabs bottomSheetTabs3 = this.bottomSheetTabs;
            ActionBarLayout$$ExternalSyntheticLambda11 actionBarLayout$$ExternalSyntheticLambda13 = new ActionBarLayout$$ExternalSyntheticLambda11(this, 4);
            ActionBarLayout$$ExternalSyntheticLambda11 actionBarLayout$$ExternalSyntheticLambda14 = new ActionBarLayout$$ExternalSyntheticLambda11(this, 5);
            bottomSheetTabs3.invalidateListeners.add(actionBarLayout$$ExternalSyntheticLambda13);
            bottomSheetTabs3.relayoutListeners.add(actionBarLayout$$ExternalSyntheticLambda14);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.bottomSheetTabs, layoutParams);
            BottomSheetTabsOverlay bottomSheetTabsOverlay = LaunchActivity.instance.bottomSheetTabsOverlay;
            if (bottomSheetTabsOverlay != null) {
                bottomSheetTabsOverlay.setTabsView(this.bottomSheetTabs);
            }
        }
        LayoutContainer layoutContainer = this.containerViewBack;
        if (layoutContainer != null) {
            AndroidUtilities.removeFromParent(layoutContainer);
        }
        LayoutContainer layoutContainer2 = new LayoutContainer(activity, this);
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
        LayoutContainer layoutContainer4 = new LayoutContainer(activity, this);
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
        LayoutContainer layoutContainer6 = new LayoutContainer(activity, this);
        this.sheetContainer = layoutContainer6;
        this.hasSheetsAnimator.parent = layoutContainer6;
        addView(layoutContainer6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.sheetContainer.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.sheetContainer.setLayoutParams(layoutParams4);
        AnonymousClass1 anonymousClass1 = this.sheetFragment;
        if (anonymousClass1 != null) {
            anonymousClass1.setParentLayout(this);
            AnonymousClass1 anonymousClass2 = this.sheetFragment;
            View viewPerformCreateView = anonymousClass2.fragmentView;
            if (viewPerformCreateView == null) {
                viewPerformCreateView = anonymousClass2.performCreateView(activity);
            }
            if (viewPerformCreateView.getParent() != this.sheetContainer) {
                AndroidUtilities.removeFromParent(viewPerformCreateView);
                this.sheetContainer.addView(viewPerformCreateView, LayoutHelper.createFrame(-1.0f, -1));
                this.sheetContainer.setShouldHandleBottomInsets(getEdgeToEdgeSupportMode());
            }
            onResume();
            onBecomeFullyVisible();
        }
        Iterator it = this.fragmentsStack.iterator();
        while (it.hasNext()) {
            ((BaseFragment) it.next()).setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.onFragmentStackChangedListener = runnable;
    }

    public void setHighlightActionButtons(boolean z) {
    }

    @Override
    public void setInBubbleMode(boolean z) {
        this.inBubbleMode = z;
    }

    public void setInnerTranslationX(float f) {
        int navigationBarColor;
        int navigationBarColor2;
        this.innerTranslationX = f;
        invalidate();
        if (this.fragmentsStack.size() < 2 || this.containerView.getMeasuredWidth() <= 0) {
            return;
        }
        float fClamp01 = newBackTransitions() ? Utilities.clamp01(f / (AndroidUtilities.dp(56.0f) * 6)) : f / this.containerView.getMeasuredWidth();
        BaseFragment baseFragment = (BaseFragment) zzir.m(2, this.fragmentsStack);
        baseFragment.onSlideProgress(false, fClamp01);
        BaseFragment baseFragment2 = (BaseFragment) zzir.m(1, this.fragmentsStack);
        float fClamp = MathUtils.clamp(fClamp01 * 2.0f, 0.0f, 1.0f);
        if (!baseFragment2.isBeginToShow() || (navigationBarColor = baseFragment2.getNavigationBarColor()) == (navigationBarColor2 = baseFragment.getNavigationBarColor())) {
            return;
        }
        baseFragment2.setNavigationBarColor(ColorUtils.blendARGB(fClamp, navigationBarColor, navigationBarColor2));
    }

    public void setIsSheet(boolean z) {
        this.isSheet = z;
    }

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

    public void setOverrideWidthOffset(int i) {
        this.overrideWidthOffset = i;
        invalidate();
    }

    public void setPulledDialogs(List<BackButtonMenu.PulledDialog> list) {
        this.pulledDialogs = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z) {
        this.removeActionBarExtraHeight = z;
    }

    public void setThemeAnimationValue(float f) {
        this.themeAnimationValue = f;
        ArrayList arrayList = this.themeAnimatorDescriptions;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i);
            int[] iArr = (int[]) this.animateStartColors.get(i);
            int[] iArr2 = (int[]) this.animateEndColors.get(i);
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                int iRed = Color.red(iArr2[i2]);
                int iGreen = Color.green(iArr2[i2]);
                int iBlue = Color.blue(iArr2[i2]);
                int iAlpha = Color.alpha(iArr2[i2]);
                int iRed2 = Color.red(iArr[i2]);
                int iGreen2 = Color.green(iArr[i2]);
                ArrayList arrayList3 = arrayList;
                int iBlue2 = Color.blue(iArr[i2]);
                int i3 = size;
                int iAlpha2 = Color.alpha(iArr[i2]);
                int i4 = i;
                int iArgb = Color.argb(Math.min(255, (int) (((iAlpha - iAlpha2) * f) + iAlpha2)), Math.min(255, (int) (((iRed - iRed2) * f) + iRed2)), Math.min(255, (int) (((iGreen - iGreen2) * f) + iGreen2)), Math.min(255, (int) (((iBlue - iBlue2) * f) + iBlue2)));
                ThemeDescription themeDescription = (ThemeDescription) arrayList2.get(i2);
                Theme.ResourcesProvider resourcesProvider = themeDescription.resourcesProvider;
                int i5 = themeDescription.currentKey;
                if (resourcesProvider != null) {
                    resourcesProvider.setAnimatedColor(i5, iArgb);
                } else {
                    SparseIntArray sparseIntArray = Theme.animatingColors;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(i5, iArgb);
                    }
                }
                themeDescription.setColor(iArgb, false, false);
                i2++;
                i = i4;
                arrayList = arrayList3;
                size = i3;
            }
            i++;
        }
        ArrayList arrayList4 = this.themeAnimatorDelegate;
        int size3 = arrayList4.size();
        for (int i6 = 0; i6 < size3; i6++) {
            ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = (ThemeDescription.ThemeDescriptionDelegate) arrayList4.get(i6);
            if (themeDescriptionDelegate != null) {
                themeDescriptionDelegate.didSetColor();
                themeDescriptionDelegate.onAnimationProgress(f);
            }
        }
        ArrayList arrayList5 = this.presentingFragmentDescriptions;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i7 = 0; i7 < size4; i7++) {
                ThemeDescription themeDescription2 = (ThemeDescription) this.presentingFragmentDescriptions.get(i7);
                themeDescription2.setColor(Theme.getColor(themeDescription2.currentKey, themeDescription2.resourcesProvider), false, false);
            }
        }
        ChatActivity.ThemeDelegate.AnonymousClass1 anonymousClass1 = this.animationProgressListener;
        if (anonymousClass1 != null) {
            ChatActivity.ThemeDelegate themeDelegate = ChatActivity.ThemeDelegate.this;
            ChatActivity.this.chatListView.invalidate();
            themeDelegate.animatingMessageDrawable.crossfadeProgress = f;
            themeDelegate.animatingMessageMediaDrawable.crossfadeProgress = f;
            themeDelegate.updateServiceMessageColor(f);
        }
        INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate = this.delegate;
        if (iNavigationLayoutDelegate != null) {
            iNavigationLayoutDelegate.onThemeProgress(f);
        }
        globallyUpdateColors(this);
    }

    public void setUseAlphaAnimations(boolean z) {
        this.useAlphaAnimations = z;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public final void showLastFragment() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.fragmentsStack.isEmpty()) {
            return;
        }
        int size = this.fragmentsStack.size() - 1;
        if (this.fragmentsStack.isEmpty()) {
            return;
        }
        if (this.fragmentsStack.isEmpty() || this.fragmentsStack.size() - 1 != size || ((BaseFragment) this.fragmentsStack.get(size)).fragmentView == null) {
            for (int i = 0; i < size; i++) {
                BaseFragment baseFragment = (BaseFragment) this.fragmentsStack.get(i);
                ActionBar actionBar = baseFragment.actionBar;
                if (actionBar != null && actionBar.addToContainer && (viewGroup2 = (ViewGroup) actionBar.getParent()) != null) {
                    viewGroup2.removeView(baseFragment.actionBar);
                }
                View view = baseFragment.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    baseFragment.onPause();
                    baseFragment.onRemoveFromParent();
                    viewGroup.removeView(baseFragment.fragmentView);
                }
            }
            BaseFragment baseFragment2 = (BaseFragment) this.fragmentsStack.get(size);
            baseFragment2.setParentLayout(this);
            View viewPerformCreateView = baseFragment2.fragmentView;
            if (viewPerformCreateView == null) {
                viewPerformCreateView = baseFragment2.performCreateView(this.parentActivity);
                if (viewPerformCreateView != null && baseFragment2.isSupportEdgeToEdge() && baseFragment2.drawEdgeNavigationBar()) {
                    AlertDialog$$ExternalSyntheticLambda11 alertDialog$$ExternalSyntheticLambda11 = new AlertDialog$$ExternalSyntheticLambda11(baseFragment2, 2);
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(viewPerformCreateView, alertDialog$$ExternalSyntheticLambda11);
                    this.containerView.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) viewPerformCreateView.getParent();
                if (viewGroup3 != null) {
                    baseFragment2.onRemoveFromParent();
                    viewGroup3.removeView(viewPerformCreateView);
                }
            }
            this.containerView.addView(viewPerformCreateView, LayoutHelper.createFrame(-1.0f, -1));
            this.containerView.setShouldHandleBottomInsets(baseFragment2.getEdgeToEdgeSupportMode());
            this.containerView.setDrawNavigationBar(baseFragment2.drawEdgeNavigationBar());
            ActionBar actionBar2 = baseFragment2.actionBar;
            if (actionBar2 != null && actionBar2.addToContainer) {
                if (this.removeActionBarExtraHeight) {
                    actionBar2.setOccupyStatusBar(false);
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
            viewPerformCreateView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        }
    }

    public final void startLayoutAnimation(final boolean z, final boolean z2, final boolean z3) {
        if (z2) {
            this.animationProgress = 0.0f;
            this.lastFrameTime = System.nanoTime() / 1000000;
        }
        ?? r0 = new Runnable() {
            @Override
            public final void run() {
                ActionBarLayout actionBarLayout = ActionBarLayout.this;
                if (actionBarLayout.animationRunnable != this) {
                    return;
                }
                actionBarLayout.animationRunnable = null;
                boolean z4 = z2;
                if (z4) {
                    actionBarLayout.transitionAnimationStartTime = System.currentTimeMillis();
                }
                long jNanoTime = System.nanoTime() / 1000000;
                long j = jNanoTime - actionBarLayout.lastFrameTime;
                if (j > 40 && z4) {
                    j = 0;
                } else if (j > 18) {
                    j = 18;
                }
                actionBarLayout.lastFrameTime = jNanoTime;
                boolean z5 = z;
                boolean z6 = z3;
                float f = actionBarLayout.animationProgress + (j / ((z6 && z5) ? 190.0f : 150.0f));
                actionBarLayout.animationProgress = f;
                if (f > 1.0f) {
                    actionBarLayout.animationProgress = 1.0f;
                }
                BaseFragment baseFragment = actionBarLayout.newFragment;
                if (baseFragment != null) {
                    baseFragment.onTransitionAnimationProgress(true, actionBarLayout.animationProgress);
                }
                BaseFragment baseFragment2 = actionBarLayout.oldFragment;
                if (baseFragment2 != null) {
                    baseFragment2.onTransitionAnimationProgress(false, actionBarLayout.animationProgress);
                }
                BaseFragment baseFragment3 = actionBarLayout.oldFragment;
                Integer numValueOf = baseFragment3 != null ? Integer.valueOf(baseFragment3.getNavigationBarColor()) : null;
                BaseFragment baseFragment4 = actionBarLayout.newFragment;
                Integer numValueOf2 = baseFragment4 != null ? Integer.valueOf(baseFragment4.getNavigationBarColor()) : null;
                BaseFragment baseFragment5 = actionBarLayout.oldFragment;
                if (baseFragment5 != null && baseFragment5.isSupportEdgeToEdge() && numValueOf2 != null) {
                    numValueOf = numValueOf2;
                }
                BaseFragment baseFragment6 = actionBarLayout.newFragment;
                if (baseFragment6 != null && baseFragment6.isSupportEdgeToEdge() && numValueOf != null) {
                    numValueOf2 = numValueOf;
                }
                if (actionBarLayout.newFragment != null && numValueOf != null && numValueOf2 != null) {
                    int iBlendARGB = ColorUtils.blendARGB(MathUtils.clamp(actionBarLayout.animationProgress * 4.0f, 0.0f, 1.0f), numValueOf.intValue(), numValueOf2.intValue());
                    AnonymousClass1 anonymousClass1 = actionBarLayout.sheetFragment;
                    if (anonymousClass1 != null && anonymousClass1.sheetsStack != null) {
                        for (int i = 0; i < actionBarLayout.sheetFragment.sheetsStack.size(); i++) {
                            BaseFragment.AttachedSheet attachedSheet = actionBarLayout.sheetFragment.sheetsStack.get(i);
                            if (attachedSheet.attachedToParent()) {
                                iBlendARGB = attachedSheet.getNavigationBarColor(iBlendARGB);
                            }
                        }
                    }
                    actionBarLayout.newFragment.setNavigationBarColor(iBlendARGB);
                }
                float interpolation = z6 ? z5 ? actionBarLayout.overshootInterpolator.getInterpolation(actionBarLayout.animationProgress) : CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(actionBarLayout.animationProgress) : actionBarLayout.decelerateInterpolator.getInterpolation(actionBarLayout.animationProgress);
                if (z5) {
                    float fClamp = MathUtils.clamp(interpolation, 0.0f, 1.0f);
                    actionBarLayout.containerView.setAlpha(fClamp);
                    if (z6) {
                        float f2 = (0.3f * interpolation) + 0.7f;
                        actionBarLayout.containerView.setScaleX(f2);
                        actionBarLayout.containerView.setScaleY(f2);
                        if (actionBarLayout.previewMenu != null) {
                            float f3 = 1.0f - interpolation;
                            actionBarLayout.containerView.setTranslationY(AndroidUtilities.dp(40.0f) * f3);
                            actionBarLayout.previewMenu.setTranslationY((-AndroidUtilities.dp(70.0f)) * f3);
                            float f4 = (interpolation * 0.05f) + 0.95f;
                            actionBarLayout.previewMenu.setScaleX(f4);
                            actionBarLayout.previewMenu.setScaleY(f4);
                        }
                        actionBarLayout.previewBackgroundDrawable.setAlpha((int) (46.0f * fClamp));
                        Theme.moveUpDrawable.setAlpha((int) (fClamp * 255.0f));
                        actionBarLayout.containerView.invalidate();
                        actionBarLayout.invalidate();
                    } else {
                        actionBarLayout.containerView.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
                    }
                } else {
                    float f5 = 1.0f - interpolation;
                    float fClamp2 = MathUtils.clamp(f5, 0.0f, 1.0f);
                    actionBarLayout.containerViewBack.setAlpha(fClamp2);
                    if (z6) {
                        float f6 = (f5 * 0.1f) + 0.9f;
                        actionBarLayout.containerViewBack.setScaleX(f6);
                        actionBarLayout.containerViewBack.setScaleY(f6);
                        actionBarLayout.previewBackgroundDrawable.setAlpha((int) (46.0f * fClamp2));
                        if (actionBarLayout.previewMenu == null) {
                            Theme.moveUpDrawable.setAlpha((int) (fClamp2 * 255.0f));
                        }
                        actionBarLayout.containerView.invalidate();
                        actionBarLayout.invalidate();
                    } else {
                        actionBarLayout.containerViewBack.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
                    }
                }
                if (actionBarLayout.animationProgress < 1.0f) {
                    actionBarLayout.startLayoutAnimation(z5, false, z6);
                } else {
                    actionBarLayout.onAnimationEndCheck(false);
                }
            }
        };
        this.animationRunnable = r0;
        AndroidUtilities.runOnUIThread(r0);
    }

    public final boolean storyViewerAttached() {
        BaseFragment baseFragment = !this.fragmentsStack.isEmpty() ? (BaseFragment) zzir.m(1, this.fragmentsStack) : null;
        return (baseFragment == null || baseFragment.getLastStoryViewer() == null || !baseFragment.getLastStoryViewer().attachedToParent()) ? false : true;
    }

    public final void closeLastFragment(boolean z, boolean z2) {
        boolean z3;
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            INavigationLayout.INavigationLayoutDelegate iNavigationLayoutDelegate = this.delegate;
            if ((iNavigationLayoutDelegate != null && !iNavigationLayoutDelegate.needCloseLastFragment(this)) || checkTransitionAnimation() || this.fragmentsStack.isEmpty()) {
                return;
            }
            Activity activity = this.parentActivity;
            if (activity.getCurrentFocus() != null) {
                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            boolean z4 = !z2 && (this.inPreviewMode || this.transitionAnimationPreviewMode || (z && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)));
            BaseFragment baseFragment = (BaseFragment) zzir.m(1, this.fragmentsStack);
            AnimatorSet animatorSetOnCustomTransitionAnimation = null;
            BaseFragment baseFragment2 = this.fragmentsStack.size() > 1 ? (BaseFragment) zzir.m(2, this.fragmentsStack) : null;
            if (baseFragment2 != null) {
                if (Theme.getColor(null, Theme.key_actionBarDefault, false) != -1) {
                    if (baseFragment2.hasForceLightStatusBar()) {
                        Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
                        if (themeInfo == null) {
                            themeInfo = Theme.defaultTheme;
                        }
                        z3 = themeInfo.isDark() ? false : true;
                    }
                }
                AndroidUtilities.setLightStatusBar(activity, z3);
                LayoutContainer layoutContainer = this.containerView;
                this.containerView = this.containerViewBack;
                this.containerViewBack = layoutContainer;
                baseFragment2.setParentLayout(this);
                View viewPerformCreateView = baseFragment2.fragmentView;
                if (viewPerformCreateView == null && (viewPerformCreateView = baseFragment2.performCreateView(activity)) != null && baseFragment2.isSupportEdgeToEdge() && baseFragment2.drawEdgeNavigationBar()) {
                    AlertDialog$$ExternalSyntheticLambda11 alertDialog$$ExternalSyntheticLambda11 = new AlertDialog$$ExternalSyntheticLambda11(baseFragment2, i3);
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(viewPerformCreateView, alertDialog$$ExternalSyntheticLambda11);
                    this.containerView.invalidate();
                }
                if (!this.inPreviewMode) {
                    this.containerView.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) viewPerformCreateView.getParent();
                    if (viewGroup != null) {
                        baseFragment2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(viewPerformCreateView);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    this.containerView.addView(viewPerformCreateView);
                    this.containerView.setShouldHandleBottomInsets(baseFragment2.getEdgeToEdgeSupportMode());
                    this.containerView.setDrawNavigationBar(baseFragment2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewPerformCreateView.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    viewPerformCreateView.setLayoutParams(layoutParams);
                    ActionBar actionBar = baseFragment2.actionBar;
                    if (actionBar != null && actionBar.addToContainer) {
                        if (this.removeActionBarExtraHeight) {
                            actionBar.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(baseFragment2.actionBar);
                        this.containerView.addView(baseFragment2.actionBar);
                    }
                    baseFragment2.setTitleOverlayTextIfActionBarAttached(this.titleOverlayText, this.titleOverlayTextId, this.overlayAction);
                    baseFragment2.attachSheets(this.containerView);
                }
                this.newFragment = baseFragment2;
                this.oldFragment = baseFragment;
                baseFragment2.onTransitionAnimationStart(true, true);
                baseFragment.onTransitionAnimationStart(false, true);
                baseFragment2.onResume();
                if (this.themeAnimatorSet != null) {
                    this.presentingFragmentDescriptions = baseFragment2.getThemeDescriptions();
                }
                this.currentActionBar = baseFragment2.actionBar;
                if (!baseFragment2.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
                    viewPerformCreateView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                }
                if (z4) {
                    this.transitionAnimationStartTime = System.currentTimeMillis();
                    this.transitionAnimationInProgress = true;
                    baseFragment.setRemovingFromStack(true);
                    this.onCloseAnimationEndRunnable = new BottomSheetTabs$$ExternalSyntheticLambda1(this, baseFragment, baseFragment2, i2);
                    if (!this.inPreviewMode && !this.transitionAnimationPreviewMode) {
                        animatorSetOnCustomTransitionAnimation = baseFragment.onCustomTransitionAnimation(false, new ActionBarLayout$$ExternalSyntheticLambda11(this, i));
                    }
                    if (animatorSetOnCustomTransitionAnimation == null) {
                        boolean z5 = this.inPreviewMode;
                        if (z5 || !(this.containerView.isKeyboardVisible || this.containerViewBack.isKeyboardVisible)) {
                            startLayoutAnimation(false, true, z5 || this.transitionAnimationPreviewMode);
                        } else {
                            BottomSheet.AnonymousClass4 anonymousClass4 = new BottomSheet.AnonymousClass4(this, i2);
                            this.waitingForKeyboardCloseRunnable = anonymousClass4;
                            AndroidUtilities.runOnUIThread(anonymousClass4, 200L);
                        }
                    } else {
                        this.currentAnimation = animatorSetOnCustomTransitionAnimation;
                        Bulletin bulletin = Bulletin.visibleBulletin;
                        if (bulletin != null && bulletin.showing) {
                            bulletin.hide();
                        }
                    }
                    onFragmentStackChanged("closeLastFragment");
                } else {
                    baseFragment.finishing = true;
                    baseFragment.onPause();
                    baseFragment.onFragmentDestroy();
                    baseFragment.setParentLayout(null);
                    this.fragmentsStack.remove(baseFragment);
                    this.containerViewBack.setVisibility(4);
                    this.containerViewBack.setTranslationY(0.0f);
                    bringChildToFront(this.containerView);
                    LayoutContainer layoutContainer2 = this.sheetContainer;
                    if (layoutContainer2 != null) {
                        bringChildToFront(layoutContainer2);
                    }
                    onFragmentStackChanged("closeLastFragmentInternalRemoveOld");
                    baseFragment.onTransitionAnimationEnd(false, true);
                    baseFragment2.onTransitionAnimationEnd(true, true);
                    baseFragment2.onBecomeFullyVisible();
                }
            } else if (!this.useAlphaAnimations || z2) {
                removeFragmentFromStackInternal(baseFragment, false);
                setVisibility(8);
                View view = this.backgroundView;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                this.transitionAnimationStartTime = System.currentTimeMillis();
                this.transitionAnimationInProgress = true;
                this.onCloseAnimationEndRunnable = new ClickHelper$$ExternalSyntheticLambda0(25, this, baseFragment);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 1.0f, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 1.0f, 0.9f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 1.0f, 0.9f));
                View view2 = this.backgroundView;
                if (view2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 1.0f, 0.0f));
                }
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentAnimation = animatorSet;
                animatorSet.playTogether(arrayList);
                this.currentAnimation.setInterpolator(this.accelerateDecelerateInterpolator);
                this.currentAnimation.setDuration(200L);
                this.currentAnimation.addListener(new AnonymousClass5(this, i2));
                this.currentAnimation.start();
            }
            baseFragment.onFragmentClosed();
        }
    }

    public final void removeFragmentFromStack(BaseFragment baseFragment, boolean z) {
        if ((this.fragmentsStack.size() > 0 && zzir.m(1, this.fragmentsStack) == baseFragment) || (this.fragmentsStack.size() > 1 && zzir.m(2, this.fragmentsStack) == baseFragment)) {
            onOpenAnimationEnd$1();
            onCloseAnimationEnd();
        }
        checkBlackScreen("removeFragmentFromStack " + z);
        if (this.useAlphaAnimations && this.fragmentsStack.size() == 1 && AndroidUtilities.isTablet()) {
            closeLastFragment(true, false);
            return;
        }
        if (this.delegate != null && this.fragmentsStack.size() == 1 && AndroidUtilities.isTablet()) {
            this.delegate.needCloseLastFragment(this);
        }
        removeFragmentFromStackInternal(baseFragment, baseFragment.allowFinishFragmentInsteadOfRemoveFromStack() && !z);
    }

    public final void removeFragmentFromStack(int i) {
        if (i < 0 || i >= getFragmentStack().size()) {
            return;
        }
        removeFragmentFromStack(getFragmentStack().get(i), false);
    }

    public final void animateThemedValues(Theme.ThemeInfo themeInfo, int i, boolean z, boolean z2, Runnable runnable) {
        animateThemedValues(new INavigationLayout.ThemeAnimationSettings(themeInfo, i, z, z2), runnable);
    }
}
