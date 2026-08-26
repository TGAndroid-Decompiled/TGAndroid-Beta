package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.FireworksEffect;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SnowflakesEffect;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.voip.EndCloseLayout;
import org.telegram.ui.Components.voip.VoIPWindowView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.iv.RichEditor;

public class ActionBar extends FrameLayout implements FactorAnimator.Target, Theme.Colorable {
    private int actionBarColor;
    public ActionBarMenuOnItemClick actionBarMenuOnItemClick;
    private ActionBarMenu actionMode;
    private AnimatorSet actionModeAnimation;
    private int actionModeColor;
    private View actionModeExtraView;
    private View[] actionModeHidingViews;
    private View actionModeShowingView;
    private String actionModeTag;
    private View actionModeTop;
    private View actionModeTranslationView;
    protected boolean actionModeVisible;
    private boolean adaptiveBackground;
    private boolean adaptiveBackgroundHideTitle;
    private ValueAnimator adaptive_animator;
    private int adaptive_lowerColorKey;
    private int adaptive_topColorKey;
    private boolean addToContainer;
    private ActionBarAnimatedSubtitleOverlayContainer additionalSubTitleOverlayContainer;
    private SimpleTextView additionalSubtitleTextView;
    private int additionalTextLeft;
    private boolean allowOverlayTitle;
    private final BoolAnimator animatorAvatarContainerHasAvatar;
    private final FactorAnimator animatorAvatarContainerWidth;
    private final BoolAnimator animatorHasMenuItems;
    private final FactorAnimator animatorMenuItemsWidth;
    private boolean attachState;
    private boolean attached;
    private BackupImageView avatarSearchImageView;
    private Drawable backButtonDrawable;
    public ImageView backButtonImageView;
    private INavigationLayout.BackButtonState backButtonState;
    Runnable backgroundUpdateListener;
    public Paint blurScrimPaint;
    boolean blurredBackground;
    private boolean castShadows;
    private boolean centerScale;
    private ChatAvatarContainer chatAvatarContainer;
    private boolean clipContent;
    SizeNotifierFrameLayout contentView;
    private boolean doNotDrawChild;
    public boolean doNotDrawGlassMenu;
    private Runnable doOnActionModeFactorChanged;
    private boolean drawBackButton;
    EllipsizeSpanAnimator ellipsizeSpanAnimator;
    private int extraHeight;
    private FireworksEffect fireworksEffect;
    private Paint.FontMetricsInt fontMetricsInt;
    private boolean forceSkipTouches;
    private int forcedMenuMinWidth;
    private int forcedMenuWidth;
    private boolean fromBottom;
    private BlurredBackgroundDrawable glassDrawable;
    private BlurredBackgroundDrawable glassDrawableBack;
    private BlurredBackgroundDrawable glassDrawableMenu;
    private boolean glassMode;
    private boolean glassModeIsForum;
    private boolean glassOnlyBack;
    private boolean hasForcedMenuMinWidth;
    private boolean hasForcedMenuWidth;
    private boolean ignoreLayoutRequest;
    private View.OnTouchListener interceptTouchEventListener;
    private boolean interceptTouches;
    private boolean isAnimationsAllowed;
    private boolean isBackOverlayVisible;
    private boolean isCenterTitle;
    private boolean isMenuOffsetSuppressed;
    protected boolean isSearchFieldVisible;
    protected int itemsActionModeBackgroundColor;
    protected int itemsActionModeColor;
    public int itemsBackgroundColor;
    protected int itemsColor;
    private CharSequence lastOverlayTitle;
    private Drawable lastRightDrawable;
    private Runnable lastRunnable;
    private CharSequence lastTitle;
    private boolean mAlwaysApplyColorFilterToBackButton;
    private boolean manualStart;
    public ActionBarMenu menu;
    public boolean menuOccupyBack;
    protected boolean occupyStatusBar;
    private boolean onTop;
    private float onTopAnimated;
    private boolean overlayTitleAnimation;
    boolean overlayTitleAnimationInProgress;
    private Object[] overlayTitleToSet;
    protected BaseFragment parentFragment;
    int prevWidth;
    private Rect rect;
    Rect rectTmp;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean resumed;
    private View.OnClickListener rightDrawableOnClickListener;
    private float searchFactor;
    public float searchFieldVisibleAlpha;
    AnimatorSet searchVisibleAnimator;
    private int shadowAlpha;
    private SnowflakesEffect snowflakesEffect;
    private CharSequence subtitle;
    private SimpleTextView subtitleTextView;
    private boolean supportsHolidayImage;
    private Runnable titleActionRunnable;
    private boolean titleAnimationRunning;
    private int titleColorToSet;
    private boolean titleOverlayShown;
    private int titleRightMargin;
    private final SimpleTextView[] titleTextView;
    private FrameLayout titlesContainer;
    private boolean useContainerForTitles;

    public final class AnonymousClass10 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ActionBar this$0;
        public final boolean val$onTop;

        public AnonymousClass10(ActionBar actionBar, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = actionBar;
            this.val$onTop = z;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    float f = this.val$onTop ? 1.0f : 0.0f;
                    ActionBar actionBar = this.this$0;
                    actionBar.onTopAnimated = f;
                    actionBar.adaptive_updateColor();
                    break;
                default:
                    float f2 = this.val$onTop ? 1.0f : 0.0f;
                    ActionBar actionBar2 = this.this$0;
                    actionBar2.onTopAnimated = f2;
                    actionBar2.adaptive_updateColor();
                    break;
            }
        }
    }

    public final class AnonymousClass5 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ActionBar this$0;

        public AnonymousClass5(ActionBar actionBar, int i) {
            this.$r8$classId = i;
            this.this$0 = actionBar;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    ActionBar actionBar = this.this$0;
                    if (actionBar.actionModeAnimation != null && actionBar.actionModeAnimation.equals(animator)) {
                        actionBar.actionModeAnimation = null;
                        break;
                    }
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ActionBar actionBar = this.this$0;
                    if (actionBar.titleTextView[1] != null && actionBar.titleTextView[1].getParent() != null) {
                        ((ViewGroup) actionBar.titleTextView[1].getParent()).removeView(actionBar.titleTextView[1]);
                    }
                    actionBar.ellipsizeSpanAnimator.removeView(actionBar.titleTextView[1]);
                    actionBar.titleTextView[1] = null;
                    actionBar.overlayTitleAnimationInProgress = false;
                    actionBar.setTitleOverlayText((String) actionBar.overlayTitleToSet[0], ((Integer) actionBar.overlayTitleToSet[1]).intValue(), (Runnable) actionBar.overlayTitleToSet[2]);
                    break;
                default:
                    ActionBar actionBar2 = this.this$0;
                    if (actionBar2.actionModeAnimation != null && actionBar2.actionModeAnimation.equals(animator)) {
                        actionBar2.actionModeAnimation = null;
                        actionBar2.actionMode.setVisibility(4);
                        if (actionBar2.actionModeExtraView != null) {
                            actionBar2.actionModeExtraView.setVisibility(4);
                        }
                        break;
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass6 extends AnimatorListenerAdapter {
        public final int $r8$classId = 0;
        public final FrameLayout this$0;
        public boolean val$crossfade;
        public final boolean val$fromBottom;

        public AnonymousClass6(ActionBar actionBar, boolean z, boolean z2) {
            this.this$0 = actionBar;
            this.val$crossfade = z;
            this.val$fromBottom = z2;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    this.val$crossfade = true;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) this.this$0;
                    actionBarLayout.predictiveBackInProgress = false;
                    actionBarLayout.containerView.setAlpha(1.0f);
                    ActionBarLayout.access$1300(actionBarLayout, true);
                    actionBarLayout.backAnimator = null;
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ActionBar actionBar = (ActionBar) this.this$0;
                    if (actionBar.titleTextView[1] != null && actionBar.titleTextView[1].getParent() != null) {
                        ((ViewGroup) actionBar.titleTextView[1].getParent()).removeView(actionBar.titleTextView[1]);
                    }
                    actionBar.titleTextView[1] = null;
                    actionBar.titleAnimationRunning = false;
                    if (this.val$crossfade && this.val$fromBottom) {
                        actionBar.subtitleTextView.setVisibility(8);
                    }
                    actionBar.requestLayout();
                    break;
                default:
                    if (!this.val$crossfade) {
                        ActionBarLayout actionBarLayout = (ActionBarLayout) this.this$0;
                        actionBarLayout.predictiveBackInProgress = false;
                        actionBarLayout.containerView.setAlpha(1.0f);
                        ActionBarLayout.access$1300(actionBarLayout, this.val$fromBottom);
                        actionBarLayout.backAnimator = null;
                        break;
                    }
                    break;
            }
        }

        public AnonymousClass6(ActionBarLayout actionBarLayout, boolean z) {
            this.this$0 = actionBarLayout;
            this.val$fromBottom = z;
        }
    }

    public final class AnonymousClass7 extends ChangeBounds {
        public final int $r8$classId;

        public final class AnonymousClass1 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final Object val$startValues;

            public AnonymousClass1(Object obj, int i) {
                this.$r8$classId = i;
                this.val$startValues = obj;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        super.onAnimationEnd(animator);
                        ((TransitionValues) this.val$startValues).view.setLayerType(0, null);
                        break;
                    case 1:
                        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) this.val$startValues;
                        actionBarPopupWindowLayout.startAnimationPending = false;
                        int itemsCount = actionBarPopupWindowLayout.getItemsCount();
                        for (int i = 0; i < itemsCount; i++) {
                            View itemAt = actionBarPopupWindowLayout.getItemAt(i);
                            if (!(itemAt instanceof ActionBarPopupWindow.GapView)) {
                                itemAt.setTranslationY(0.0f);
                                itemAt.setAlpha(itemAt.isEnabled() ? 1.0f : 0.5f);
                            }
                        }
                        break;
                    case 2:
                        AdjustPanLayoutHelper adjustPanLayoutHelper = (AdjustPanLayoutHelper) this.val$startValues;
                        if (!adjustPanLayoutHelper.usingInsetAnimator) {
                            adjustPanLayoutHelper.stopTransition();
                        }
                        break;
                    case 3:
                        BottomSheetTabs bottomSheetTabs = (BottomSheetTabs) this.val$startValues;
                        if (bottomSheetTabs.bottomTabsAnimator == animator) {
                            bottomSheetTabs.bottomTabsProgress = bottomSheetTabs.bottomTabsHeight;
                            Iterator it = bottomSheetTabs.invalidateListeners.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        break;
                    default:
                        BottomSheetTabsOverlay bottomSheetTabsOverlay = (BottomSheetTabsOverlay) this.val$startValues;
                        BottomSheetTabs bottomSheetTabs2 = bottomSheetTabsOverlay.tabsView;
                        if (bottomSheetTabs2 != null) {
                            bottomSheetTabs2.drawTabs = true;
                            bottomSheetTabs2.invalidate();
                        }
                        bottomSheetTabsOverlay.openProgress = bottomSheetTabsOverlay.isOpen ? 1.0f : 0.0f;
                        bottomSheetTabsOverlay.invalidate();
                        if (!bottomSheetTabsOverlay.isOpen) {
                            bottomSheetTabsOverlay.tabs.clear();
                        }
                        break;
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        super.onAnimationStart(animator);
                        ((TransitionValues) this.val$startValues).view.setLayerType(2, null);
                        break;
                    default:
                        super.onAnimationStart(animator);
                        break;
                }
            }
        }

        public AnonymousClass7(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final void captureEndValues(TransitionValues transitionValues) {
            switch (this.$r8$classId) {
                case 0:
                    super.captureEndValues(transitionValues);
                    View view = transitionValues.view;
                    if (view instanceof SimpleTextView) {
                        transitionValues.values.put("text_size", Float.valueOf(((SimpleTextView) view).getTextPaint().getTextSize()));
                    }
                    break;
                default:
                    super.captureEndValues(transitionValues);
                    View view2 = transitionValues.view;
                    if (view2 instanceof EndCloseLayout.EndCloseView) {
                        EndCloseLayout.EndCloseView endCloseView = (EndCloseLayout.EndCloseView) view2;
                        int i = endCloseView.backColor;
                        int i2 = endCloseView.round;
                        int i3 = endCloseView.callDeclineAlpha;
                        int i4 = endCloseView.closeTextAlpha;
                        transitionValues.values.put("back_color_end_close", Integer.valueOf(i));
                        transitionValues.values.put("round_end_close", Integer.valueOf(i2));
                        transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i3));
                        transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i4));
                    }
                    break;
            }
        }

        @Override
        public final void captureStartValues(TransitionValues transitionValues) {
            switch (this.$r8$classId) {
                case 0:
                    super.captureStartValues(transitionValues);
                    View view = transitionValues.view;
                    if (view instanceof SimpleTextView) {
                        transitionValues.values.put("text_size", Float.valueOf(((SimpleTextView) view).getTextPaint().getTextSize()));
                    }
                    break;
                default:
                    super.captureStartValues(transitionValues);
                    View view2 = transitionValues.view;
                    if (view2 instanceof EndCloseLayout.EndCloseView) {
                        EndCloseLayout.EndCloseView endCloseView = (EndCloseLayout.EndCloseView) view2;
                        int i = endCloseView.backColor;
                        int i2 = endCloseView.round;
                        int i3 = endCloseView.callDeclineAlpha;
                        int i4 = endCloseView.closeTextAlpha;
                        transitionValues.values.put("back_color_end_close", Integer.valueOf(i));
                        transitionValues.values.put("round_end_close", Integer.valueOf(i2));
                        transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i3));
                        transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i4));
                    }
                    break;
            }
        }

        @Override
        public final Animator createAnimator(ViewGroup viewGroup, final TransitionValues transitionValues, TransitionValues transitionValues2) {
            final int i = 0;
            final int i2 = 1;
            switch (this.$r8$classId) {
                case 0:
                    if (transitionValues == null || !(transitionValues.view instanceof SimpleTextView)) {
                        return super.createAnimator(viewGroup, transitionValues, transitionValues2);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (transitionValues2 != null) {
                        Animator animatorCreateAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                        float fFloatValue = ((Float) transitionValues.values.get("text_size")).floatValue() / ((Float) transitionValues2.values.get("text_size")).floatValue();
                        transitionValues.view.setScaleX(fFloatValue);
                        transitionValues.view.setScaleY(fFloatValue);
                        if (animatorCreateAnimator != null) {
                            animatorSet.playTogether(animatorCreateAnimator);
                        }
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, (Property<View, Float>) View.SCALE_X, 1.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, (Property<View, Float>) View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new AnonymousClass1(transitionValues, i));
                    return animatorSet;
                default:
                    if (transitionValues == null || transitionValues2 == null || !(transitionValues.view instanceof EndCloseLayout.EndCloseView)) {
                        return super.createAnimator(viewGroup, transitionValues, transitionValues2);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    Animator animatorCreateAnimator2 = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                    if (animatorCreateAnimator2 != null) {
                        animatorSet2.playTogether(animatorCreateAnimator2);
                    }
                    Integer num = (Integer) transitionValues.values.get("back_color_end_close");
                    Integer num2 = (Integer) transitionValues2.values.get("back_color_end_close");
                    Integer num3 = (Integer) transitionValues.values.get("round_end_close");
                    Integer num4 = (Integer) transitionValues2.values.get("round_end_close");
                    Integer num5 = (Integer) transitionValues.values.get("decline_call_alpha_end_close");
                    Integer num6 = (Integer) transitionValues2.values.get("decline_call_alpha_end_close");
                    Integer num7 = (Integer) transitionValues.values.get("close_text_alpha_end_close");
                    Integer num8 = (Integer) transitionValues2.values.get("close_text_alpha_end_close");
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(num.intValue(), num2.intValue());
                    valueAnimator.setEvaluator(new ArgbEvaluator());
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i) {
                                case 0:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).backColor = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).round = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).callDeclineAlpha = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).closeTextAlpha = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(valueAnimator);
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(num3.intValue(), num4.intValue());
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i2) {
                                case 0:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).backColor = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).round = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).callDeclineAlpha = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).closeTextAlpha = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(valueAnimatorOfInt);
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(num5.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue(), num6.intValue());
                    final int i3 = 2;
                    valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i3) {
                                case 0:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).backColor = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).round = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).callDeclineAlpha = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).closeTextAlpha = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(valueAnimatorOfInt2);
                    ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(num7.intValue(), num7.intValue(), (int) (num8.intValue() * 0.25f), (int) (num8.intValue() * 0.5f), (int) (num8.intValue() * 0.75f), num8.intValue());
                    final int i4 = 3;
                    valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i4) {
                                case 0:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).backColor = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 1:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).round = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                case 2:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).callDeclineAlpha = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                                default:
                                    ((EndCloseLayout.EndCloseView) transitionValues.view).closeTextAlpha = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    break;
                            }
                        }
                    });
                    animatorSet2.playTogether(valueAnimatorOfInt3);
                    animatorSet2.addListener(new VoIPWindowView.AnonymousClass1(transitionValues, i2));
                    return animatorSet2;
            }
        }
    }

    public final class AnonymousClass9 extends ActionBarAnimatedSubtitleOverlayContainer {
        public final int $r8$classId = 0;
        public final FrameLayout this$0;

        public AnonymousClass9(ActionBar actionBar, Context context, Theme.ResourcesProvider resourcesProvider, EllipsizeSpanAnimator ellipsizeSpanAnimator) {
            super(context, resourcesProvider, ellipsizeSpanAnimator);
            this.this$0 = actionBar;
        }

        @Override
        public final void onItemChanged(ReplaceAnimator replaceAnimator) {
            switch (this.$r8$classId) {
                case 0:
                    super.onItemChanged(replaceAnimator);
                    float totalVisibility = getTotalVisibility();
                    ActionBar actionBar = (ActionBar) this.this$0;
                    if (actionBar.titlesContainer != null) {
                        actionBar.titlesContainer.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    }
                    break;
                default:
                    super.onItemChanged(replaceAnimator);
                    ((DialogStoriesCell) this.this$0).invalidate();
                    break;
            }
        }

        public AnonymousClass9(DialogStoriesCell dialogStoriesCell, Context context, EllipsizeSpanAnimator ellipsizeSpanAnimator) {
            super(context, null, ellipsizeSpanAnimator);
            this.this$0 = dialogStoriesCell;
        }
    }

    public abstract class ActionBarMenuOnItemClick {
        public boolean canOpenMenu() {
            return true;
        }

        public abstract void onItemClick(int i);
    }

    public ActionBar(Context context) {
        this(context, null);
    }

    public static View findChildUnder(ViewGroup viewGroup, float f, float f2, View view) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f >= childAt.getX() && f <= childAt.getX() + childAt.getWidth() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        return point.x > point.y ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(56.0f);
    }

    public boolean actionModeIsExist(String str) {
        if (this.actionMode == null) {
            return false;
        }
        String str2 = this.actionModeTag;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public final void adaptive_updateColor() {
        if (this.adaptiveBackground) {
            if (this.adaptiveBackgroundHideTitle) {
                FrameLayout frameLayout = this.titlesContainer;
                if (frameLayout != null) {
                    frameLayout.setAlpha(1.0f - this.onTopAnimated);
                } else {
                    SimpleTextView simpleTextView = this.titleTextView[0];
                    if (simpleTextView != null) {
                        simpleTextView.setAlpha(1.0f - this.onTopAnimated);
                    }
                }
            }
            float f = this.onTopAnimated;
            int i = this.adaptive_lowerColorKey;
            int color = i == -1 ? 0 : Theme.getColor(i, this.resourcesProvider);
            int i2 = this.adaptive_topColorKey;
            int color2 = i2 == -1 ? 0 : Theme.getColor(i2, this.resourcesProvider);
            if (color2 == 0) {
                color2 = ColorUtils.setAlphaComponent(color, 0);
            }
            if (color == 0) {
                color = ColorUtils.setAlphaComponent(color2, 0);
            }
            setBackgroundColor(ColorUtils.blendARGB(f, color, color2));
            setShadowAlpha((int) ((1.0f - this.onTopAnimated) * 255.0f));
            if (this.blurredBackground) {
                invalidate();
            }
        }
    }

    public void alwaysApplyColorFilterToBackButton() {
        this.mAlwaysApplyColorFilterToBackButton = true;
    }

    public void beginDelayedTransition() {
        if (LocaleController.isRTL) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new AnonymousClass7(0));
        this.centerScale = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    public void centerTitle() {
        this.isCenterTitle = true;
        if (this.titleTextView == null) {
            return;
        }
        int i = 0;
        while (true) {
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if (i >= simpleTextViewArr.length) {
                return;
            }
            SimpleTextView simpleTextView = simpleTextViewArr[i];
            if (simpleTextView != null) {
                simpleTextView.setGravity(17);
            }
            i++;
        }
    }

    public void checkAvatarContainerWidth(boolean z) {
        ChatAvatarContainer chatAvatarContainer = this.chatAvatarContainer;
        if (chatAvatarContainer == null) {
            return;
        }
        boolean zHasVisibleAvatar = chatAvatarContainer.hasVisibleAvatar();
        int iMin = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.chatAvatarContainer.getVisualWidth());
        if (z) {
            FactorAnimator factorAnimator = this.animatorAvatarContainerWidth;
            float f = iMin;
            if ((factorAnimator.isAnimating ? factorAnimator.toFactor : factorAnimator.factor) != f) {
                factorAnimator.animateTo(f);
            }
        } else {
            this.animatorAvatarContainerWidth.forceFactor(iMin);
        }
        this.animatorAvatarContainerHasAvatar.setValue(zHasVisibleAvatar, z);
    }

    public void checkMenuItemsWidth() {
        ActionBarMenu actionBarMenu = this.menu;
        int iMax = Math.max(0, actionBarMenu != null ? (actionBarMenu.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        ActionBarMenu actionBarMenu2 = this.actionMode;
        int iMax2 = Math.max(0, actionBarMenu2 != null ? (actionBarMenu2.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        AndroidUtilities.dp(46.0f);
        if (this.actionModeVisible) {
            iMax = iMax2;
        }
        this.animatorHasMenuItems.setValue(iMax > 0, this.isAnimationsAllowed);
        FactorAnimator factorAnimator = this.animatorMenuItemsWidth;
        float f = iMax;
        if ((factorAnimator.isAnimating ? factorAnimator.toFactor : factorAnimator.factor) != f) {
            if (this.isAnimationsAllowed) {
                factorAnimator.animateTo(f);
            } else {
                factorAnimator.forceFactor(f);
            }
        }
    }

    public void clearSearchFilters() {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            int childCount = actionBarMenu.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = actionBarMenu.getChildAt(i);
                if (childAt instanceof ActionBarMenuItem) {
                    ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                    if (actionBarMenuItem.isSearchField()) {
                        actionBarMenuItem.clearSearchFilters();
                        return;
                    }
                }
            }
        }
    }

    public void closeSearchField() {
        closeSearchField(true);
    }

    public ActionBarMenu createActionMode() {
        return createActionMode(true, null);
    }

    public FrameLayout createAdditionalSubTitleOverlayContainer() {
        if (this.additionalSubTitleOverlayContainer == null) {
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this, getContext(), this.resourcesProvider, this.ellipsizeSpanAnimator);
            this.additionalSubTitleOverlayContainer = anonymousClass9;
            anonymousClass9.setClipChildren(false);
            addView(this.additionalSubTitleOverlayContainer);
        }
        return this.additionalSubTitleOverlayContainer;
    }

    public void createAdditionalSubtitleTextView() {
        if (this.additionalSubtitleTextView != null) {
            return;
        }
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.additionalSubtitleTextView = simpleTextView;
        simpleTextView.setGravity(3);
        this.additionalSubtitleTextView.setVisibility(8);
        this.additionalSubtitleTextView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubtitle, this.resourcesProvider));
        addView(this.additionalSubtitleTextView, 0, LayoutHelper.createFrame(-2, -2, 51));
    }

    public final void createBackButtonImage() {
        if (this.backButtonImageView != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.backButtonImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsBackgroundColor, 1, -1));
        this.backButtonImageView.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.backButtonImageView, LayoutHelper.createFrame(54, 54, 51));
        this.backButtonImageView.setOnClickListener(new ActionBar$$ExternalSyntheticLambda8(this, 1));
        this.backButtonImageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public ActionBarMenu createMenu() {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            return actionBarMenu;
        }
        ActionBarMenu actionBarMenu2 = new ActionBarMenu(getContext(), this);
        this.menu = actionBarMenu2;
        addView(actionBarMenu2, 0, LayoutHelper.createFrame(-2, -1, 5));
        return this.menu;
    }

    public final void createTitleTextView(int i) {
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[i] != null) {
            return;
        }
        simpleTextViewArr[i] = new SimpleTextView(getContext());
        this.titleTextView[i].setGravity(this.isCenterTitle ? 17 : 19);
        int i2 = this.titleColorToSet;
        if (i2 != 0) {
            this.titleTextView[i].setTextColor(i2);
        } else {
            this.titleTextView[i].setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle, this.resourcesProvider));
        }
        SimpleTextView simpleTextView = this.titleTextView[i];
        simpleTextView.setEmojiColor(simpleTextView.getTextColor());
        this.titleTextView[i].setTypeface(AndroidUtilities.bold());
        this.titleTextView[i].setDrawablePadding(AndroidUtilities.dp(4.0f));
        this.titleTextView[i].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.titleTextView[i].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.useContainerForTitles) {
            this.titlesContainer.addView(this.titleTextView[i], 0, LayoutHelper.createFrame(-2, -2, 51));
        } else {
            addView(this.titleTextView[i], 0, LayoutHelper.createFrame(-2, -2, 51));
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int iDp = AndroidUtilities.dp(6.0f);
        int iDp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        int iMax = this.hasForcedMenuWidth ? this.forcedMenuWidth : (int) this.animatorMenuItemsWidth.factor;
        if (this.hasForcedMenuMinWidth) {
            iMax = Math.max((int) ((1.0f - this.searchFactor) * this.forcedMenuMinWidth), iMax);
        }
        ImageView imageView = this.backButtonImageView;
        boolean z = imageView != null && imageView.getVisibility() == 0;
        int height = (getHeight() - ((getCurrentActionBarHeight() + iDp2) / 2)) - iDp;
        int i2 = iDp * 2;
        int i3 = height + iDp2 + i2;
        if (this.glassDrawable == null || this.glassOnlyBack) {
            f = 1.0f;
        } else {
            if (this.hasForcedMenuWidth || this.hasForcedMenuMinWidth) {
                i = iMax > 0 ? iDp : 0;
            } else {
                i = (int) (iDp * this.animatorHasMenuItems.floatValue);
            }
            int i4 = i + iMax;
            int i5 = iDp + iDp2;
            f = 1.0f;
            int iLerp = AndroidUtilities.lerp(i4, Math.max(i4, i5), this.chatAvatarContainer == null ? 0.0f : 1.0f - this.animatorAvatarContainerHasAvatar.floatValue);
            int iLerp2 = AndroidUtilities.lerp(z ? i5 : 0, i5, this.chatAvatarContainer == null ? 0.0f : 1.0f - this.animatorAvatarContainerHasAvatar.floatValue);
            int width = getWidth() - iLerp;
            int i6 = width - iLerp2;
            if (this.chatAvatarContainer != null) {
                int iLerp3 = AndroidUtilities.lerp(Math.min(i6, ((int) this.animatorAvatarContainerWidth.factor) + i2), i6, Math.max(this.searchFactor, actionModeFactor));
                iLerp2 = ((width + iLerp2) - iLerp3) / 2;
                width = iLerp2 + iLerp3;
                float fDp = AndroidUtilities.dp(3.0f) + ((iLerp2 - ((ViewGroup.MarginLayoutParams) this.chatAvatarContainer.getLayoutParams()).leftMargin) - this.chatAvatarContainer.getLeftPadding()) + iDp;
                this.chatAvatarContainer.setTranslationX(fDp);
                ChatAvatarContainer chatAvatarContainer = this.chatAvatarContainer;
                chatAvatarContainer.setPivotX((chatAvatarContainer.getMeasuredWidth() / 2.0f) - fDp);
            }
            this.glassDrawable.setBounds(iLerp2, height, width, i3);
            this.glassDrawable.draw(canvas);
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.glassDrawableBack;
        if (blurredBackgroundDrawable != null && z) {
            blurredBackgroundDrawable.setBounds(0, height, iDp2 + i2, i3);
            this.glassDrawableBack.draw(canvas);
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.glassDrawableMenu;
        if (blurredBackgroundDrawable2 != null && iMax > 0 && !this.glassOnlyBack && !this.doNotDrawGlassMenu) {
            blurredBackgroundDrawable2.setBounds((getWidth() - Math.max(iDp2, iMax)) - i2, height, getWidth(), i3);
            this.glassDrawableMenu.setAlpha(this.hasForcedMenuWidth ? 255 : (int) (this.animatorHasMenuItems.floatValue * 255.0f));
            this.glassDrawableMenu.draw(canvas);
        }
        if (this.blurredBackground && this.actionBarColor != 0) {
            this.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurScrimPaint.setColor(this.actionBarColor);
            if (this.adaptiveBackground) {
                this.contentView.drawBlurRect(canvas, getY(), this.rectTmp, this.blurScrimPaint, true, f - this.onTopAnimated);
            } else {
                this.contentView.drawBlurRect(canvas, getY(), this.rectTmp, this.blurScrimPaint, true);
            }
        }
        this.isAnimationsAllowed = true;
        if (this.doNotDrawChild) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.chatAvatarContainer != null && this.glassMode && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            float f = x;
            float f2 = y;
            View viewFindChildUnder = findChildUnder(this, f, f2, this.chatAvatarContainer);
            if (viewFindChildUnder == null) {
                viewFindChildUnder = findChildUnder(this, f, f2, null);
            }
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.glassDrawable;
            boolean z = blurredBackgroundDrawable != null && blurredBackgroundDrawable.getBounds().contains(x, y);
            if (viewFindChildUnder != null && viewFindChildUnder != this.chatAvatarContainer) {
                BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.glassDrawableBack;
                boolean z2 = z | (blurredBackgroundDrawable2 != null && blurredBackgroundDrawable2.getBounds().contains(x, y));
                BlurredBackgroundDrawable blurredBackgroundDrawable3 = this.glassDrawableMenu;
                z = z2 | (blurredBackgroundDrawable3 != null && blurredBackgroundDrawable3.getBounds().contains(x, y));
            }
            if (!z) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable currentHolidayDrawable;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null && baseFragment.getParentLayout() != null) {
            this.parentFragment.getParentLayout().getClass();
        }
        if (this.drawBackButton && view == this.backButtonImageView) {
            return true;
        }
        boolean zShouldClipChild = shouldClipChild(view);
        if (zShouldClipChild) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.supportsHolidayImage && !this.titleOverlayShown && !LocaleController.isRTL) {
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if ((view == simpleTextViewArr[0] || view == simpleTextViewArr[1] || (view == this.titlesContainer && this.useContainerForTitles)) && (currentHolidayDrawable = Theme.getCurrentHolidayDrawable()) != null) {
                SimpleTextView simpleTextView = view == this.titlesContainer ? this.titleTextView[0] : (SimpleTextView) view;
                if (simpleTextView != null && simpleTextView.getVisibility() == 0 && (simpleTextView.getText() instanceof String)) {
                    TextPaint textPaint = simpleTextView.getTextPaint();
                    textPaint.getFontMetricsInt(this.fontMetricsInt);
                    textPaint.getTextBounds((String) simpleTextView.getText(), 0, 1, this.rect);
                    int iWidth = ((this.rect.width() - (currentHolidayDrawable.getIntrinsicWidth() + Theme.dialogs_holidayDrawableOffsetX)) / 2) + simpleTextView.getTextStartX() + Theme.dialogs_holidayDrawableOffsetX;
                    int textStartY = simpleTextView.getTextStartY() + Theme.dialogs_holidayDrawableOffsetY + ((int) Math.ceil((simpleTextView.getTextHeight() - this.rect.height()) / 2.0f)) + ((int) ((1.0f - this.titlesContainer.getScaleY()) * AndroidUtilities.dp(8.0f)));
                    currentHolidayDrawable.setBounds(iWidth, textStartY - currentHolidayDrawable.getIntrinsicHeight(), currentHolidayDrawable.getIntrinsicWidth() + iWidth, textStartY);
                    currentHolidayDrawable.setAlpha((int) (simpleTextView.getAlpha() * this.titlesContainer.getAlpha() * 255.0f));
                    currentHolidayDrawable.draw(canvas);
                    if (this.overlayTitleAnimationInProgress) {
                        view.invalidate();
                        invalidate();
                    }
                }
                if (Theme.canStartHolidayAnimation) {
                    if (this.snowflakesEffect == null) {
                        this.snowflakesEffect = new SnowflakesEffect(0);
                    }
                } else if (!this.manualStart && this.snowflakesEffect != null) {
                    this.snowflakesEffect = null;
                }
                SnowflakesEffect snowflakesEffect = this.snowflakesEffect;
                if (snowflakesEffect != null) {
                    snowflakesEffect.onDraw(this, canvas);
                } else {
                    FireworksEffect fireworksEffect = this.fireworksEffect;
                    if (fireworksEffect != null) {
                        fireworksEffect.onDraw(this, canvas);
                    }
                }
            }
        }
        if (zShouldClipChild) {
            canvas.restore();
        }
        return zDrawChild;
    }

    public ActionBarMenuOnItemClick getActionBarMenuOnItemClick() {
        return this.actionBarMenuOnItemClick;
    }

    public ActionBarMenu getActionMode() {
        return this.actionMode;
    }

    public float getActionModeFactor() {
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            return actionBarMenu.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.additionalSubTitleOverlayContainer;
    }

    public SimpleTextView getAdditionalSubtitleTextView() {
        return this.additionalSubtitleTextView;
    }

    public ImageView getBackButton() {
        return this.backButtonImageView;
    }

    public Drawable getBackButtonDrawable() {
        return this.backButtonDrawable;
    }

    public INavigationLayout.BackButtonState getBackButtonState() {
        return this.backButtonState;
    }

    public int getBackgroundColor() {
        return this.actionBarColor;
    }

    public boolean getCastShadows() {
        return this.castShadows;
    }

    public int[] getColorKeys() {
        return null;
    }

    public boolean getOccupyStatusBar() {
        return this.occupyStatusBar;
    }

    public BackupImageView getSearchAvatarImageView() {
        return this.avatarSearchImageView;
    }

    public int getShadowAlpha() {
        return this.shadowAlpha;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.subtitleTextView == null || (charSequence = this.subtitle) == null) {
            return null;
        }
        return charSequence.toString();
    }

    public SimpleTextView getSubtitleTextView() {
        return this.subtitleTextView;
    }

    public String getTitle() {
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView == null) {
            return null;
        }
        return simpleTextView.getText().toString();
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView != null) {
            return simpleTextView.getPaint().getFontMetricsInt();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        return textPaint.getFontMetricsInt();
    }

    public SimpleTextView getTitleTextView() {
        return this.titleTextView[0];
    }

    public SimpleTextView getTitleTextView2() {
        return this.titleTextView[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.titlesContainer;
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void hideActionMode() {
        int i = 1;
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu == null || !this.actionModeVisible) {
            return;
        }
        int childCount = actionBarMenu.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = actionBarMenu.getChildAt(i2);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).closeSubMenu();
            }
        }
        this.actionModeVisible = false;
        checkMenuItemsWidth();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.actionMode, (Property<ActionBarMenu, Float>) property, 0.0f));
        if (this.actionModeHidingViews != null) {
            int i3 = 0;
            while (true) {
                View[] viewArr = this.actionModeHidingViews;
                if (i3 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i3];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.actionModeHidingViews[i3], (Property<View, Float>) property, 1.0f));
                }
                i3++;
            }
        }
        View view2 = this.actionModeTranslationView;
        Property property2 = View.TRANSLATION_Y;
        if (view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, 0.0f));
            this.actionModeTranslationView = null;
        }
        View view3 = this.actionModeShowingView;
        if (view3 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f));
        }
        View view4 = this.actionModeExtraView;
        if (view4 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view4, (Property<View, Float>) property2, view4.getMeasuredHeight()));
        }
        if (!this.isSearchFieldVisible) {
            SimpleTextView simpleTextView = this.titleTextView[0];
            if (simpleTextView != null) {
                arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, 1.0f));
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                arrayList.add(ObjectAnimator.ofFloat(this.subtitleTextView, (Property<SimpleTextView, Float>) property, 1.0f));
            }
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenu2, (Property<ActionBarMenu, Float>) property, 1.0f));
        }
        int i4 = this.actionBarColor;
        if (i4 == 0 || this.glassMode) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (ColorUtils.calculateLuminance(i4) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.actionModeAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.actionModeAnimation = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.backgroundUpdateListener != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ActionBar$$ExternalSyntheticLambda3(this, 2));
            this.actionModeAnimation.playTogether(valueAnimatorOfFloat);
        }
        this.actionModeAnimation.setDuration(200L);
        this.actionModeAnimation.addListener(new AnonymousClass5(this, i));
        this.actionModeAnimation.start();
        if (!this.isSearchFieldVisible) {
            SimpleTextView simpleTextView2 = this.titleTextView[0];
            if (simpleTextView2 != null) {
                simpleTextView2.setVisibility(0);
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                this.subtitleTextView.setVisibility(0);
            }
        }
        ActionBarMenu actionBarMenu3 = this.menu;
        if (actionBarMenu3 != null) {
            actionBarMenu3.setVisibility(0);
        }
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BackDrawable) {
                ((BackDrawable) drawable).setRotation(0.0f, true);
            }
            this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsBackgroundColor, 1, -1));
        }
    }

    public boolean isActionModeShowed() {
        return this.actionMode != null && this.actionModeVisible;
    }

    public boolean isSearchFieldVisible() {
        return this.isSearchFieldVisible;
    }

    public final void lambda$createBackButtonImage$1(View view) {
        if (!this.actionModeVisible && this.isSearchFieldVisible) {
            closeSearchField();
            return;
        }
        ActionBarMenuOnItemClick actionBarMenuOnItemClick = this.actionBarMenuOnItemClick;
        if (actionBarMenuOnItemClick != null) {
            actionBarMenuOnItemClick.onItemClick(-1);
        }
    }

    public final void lambda$hideActionMode$3(ValueAnimator valueAnimator) {
        Runnable runnable = this.backgroundUpdateListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void lambda$new$0$23(View view) {
        Runnable runnable;
        if (isSearchFieldVisible() || (runnable = this.titleActionRunnable) == null) {
            return;
        }
        runnable.run();
    }

    public final void lambda$onSearchFieldVisibilityChanged$4(ValueAnimator valueAnimator) {
        ActionBarMenu actionBarMenu;
        this.searchFieldVisibleAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.glassDrawable != null && this.glassModeIsForum) {
            float fDp = AndroidUtilities.dp(23.0f);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), this.searchFieldVisibleAlpha);
            this.glassDrawable.setRadius(fLerp, fDp, fDp, fLerp);
            invalidate();
        }
        if (this.glassMode && (actionBarMenu = this.menu) != null) {
            actionBarMenu.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), this.searchFieldVisibleAlpha));
        }
        Runnable runnable = this.backgroundUpdateListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void lambda$setAdaptiveBackground$5(ValueAnimator valueAnimator) {
        this.onTopAnimated = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        adaptive_updateColor();
    }

    public final void lambda$setAdaptiveBackground$6(RecyclerView recyclerView) {
        int i = 0;
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        boolean z = !zCanScrollVertically;
        if (this.onTop == z) {
            return;
        }
        ValueAnimator valueAnimator = this.adaptive_animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = this.onTopAnimated;
        this.onTop = z;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, !zCanScrollVertically ? 1.0f : 0.0f);
        this.adaptive_animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ActionBar$$ExternalSyntheticLambda3(this, 0));
        this.adaptive_animator.addListener(new AnonymousClass10(this, z, i));
        this.adaptive_animator.setDuration(320L);
        this.adaptive_animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.adaptive_animator.start();
    }

    public final void lambda$setAdaptiveBackground$7(ValueAnimator valueAnimator) {
        this.onTopAnimated = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        adaptive_updateColor();
    }

    public final void lambda$setAdaptiveBackground$8(SectionsScrollView sectionsScrollView) {
        boolean zCanScrollVertically = sectionsScrollView.canScrollVertically(-1);
        int i = 1;
        boolean z = !zCanScrollVertically;
        if (this.onTop == z) {
            return;
        }
        ValueAnimator valueAnimator = this.adaptive_animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = this.onTopAnimated;
        this.onTop = z;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, !zCanScrollVertically ? 1.0f : 0.0f);
        this.adaptive_animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ActionBar$$ExternalSyntheticLambda3(this, 1));
        this.adaptive_animator.addListener(new AnonymousClass10(this, z, i));
        this.adaptive_animator.setDuration(320L);
        this.adaptive_animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.adaptive_animator.start();
    }

    public final void lambda$showActionMode$2(ValueAnimator valueAnimator) {
        Runnable runnable = this.backgroundUpdateListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void listenToBackgroundUpdate(Runnable runnable) {
        this.backgroundUpdateListener = runnable;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        updateAttachState$1();
        if (this.actionModeVisible) {
            int i = this.actionModeColor;
            if (i == 0) {
                i = this.actionBarColor;
            }
            if (i == 0 || this.glassMode) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (ColorUtils.calculateLuminance(i) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.lastRightDrawable;
        if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
            ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(this.titleTextView[0]);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        updateAttachState$1();
        if (this.actionModeVisible) {
            int i = this.actionBarColor;
            if (i == 0 || this.actionModeColor == 0 || this.glassMode) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (ColorUtils.calculateLuminance(i) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.lastRightDrawable;
        if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
            ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(null);
        }
    }

    public void onDrawCrossfadeContent(Canvas canvas, boolean z, boolean z2, float f) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((!z2 || childAt != this.backButtonImageView) && childAt.getVisibility() == 0 && (childAt instanceof ActionBarMenu)) {
                canvas.save();
                canvas.translate(childAt.getX(), childAt.getY());
                childAt.draw(canvas);
                canvas.restore();
            }
        }
        canvas.save();
        canvas.translate(z ? getWidth() * f * 0.5f : (-getWidth()) * 0.4f * (1.0f - f), 0.0f);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            if ((!z2 || childAt2 != this.backButtonImageView) && childAt2.getVisibility() == 0 && !(childAt2 instanceof ActionBarMenu)) {
                canvas.save();
                canvas.translate(childAt2.getX(), childAt2.getY());
                childAt2.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        invalidate();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable currentHolidayDrawable;
        if (this.supportsHolidayImage && !this.titleOverlayShown && !LocaleController.isRTL && motionEvent.getAction() == 0 && (currentHolidayDrawable = Theme.getCurrentHolidayDrawable()) != null && currentHolidayDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.manualStart = true;
            if (this.snowflakesEffect == null) {
                this.fireworksEffect = null;
                this.snowflakesEffect = new SnowflakesEffect(0);
                this.titleTextView[0].invalidate();
                invalidate();
            } else {
                this.snowflakesEffect = null;
                this.fireworksEffect = new FireworksEffect();
                this.titleTextView[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.interceptTouchEventListener;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        int measuredWidth;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        SimpleTextView simpleTextView;
        int measuredWidth2;
        int i10 = this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0;
        if (this.prevWidth != getMeasuredWidth()) {
            this.prevWidth = getMeasuredWidth();
            checkAvatarContainerWidth(this.animatorAvatarContainerWidth.isAnimating);
        }
        ImageView imageView = this.backButtonImageView;
        if (imageView == null || imageView.getVisibility() == 8) {
            iDp = AndroidUtilities.dp(this.glassMode ? 24.0f : AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            ImageView imageView2 = this.backButtonImageView;
            imageView2.layout(0, i10, imageView2.getMeasuredWidth(), this.backButtonImageView.getMeasuredHeight() + i10);
            iDp = AndroidUtilities.dp(this.glassMode ? 76.0f : AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        int i11 = iDp + this.additionalTextLeft;
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null && actionBarMenu.getVisibility() != 8) {
            ActionBarMenu actionBarMenu2 = this.menu;
            int childCount = actionBarMenu2.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    measuredWidth2 = getMeasuredWidth() - this.menu.getMeasuredWidth();
                    break;
                }
                View childAt = actionBarMenu2.getChildAt(i12);
                if (childAt instanceof ActionBarMenuItem) {
                    ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                    if (actionBarMenuItem.getSearchContainer() != null && actionBarMenuItem.getSearchContainer().getVisibility() == 0) {
                        measuredWidth2 = AndroidUtilities.dp(this.menuOccupyBack ? 0.0f : AndroidUtilities.isTablet() ? 74.0f : 66.0f);
                        break;
                    }
                }
                i12++;
            }
            ActionBarMenu actionBarMenu3 = this.menu;
            actionBarMenu3.layout(measuredWidth2, i10, actionBarMenu3.getMeasuredWidth() + measuredWidth2, this.menu.getMeasuredHeight() + i10);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= 2) {
                break;
            }
            SimpleTextView simpleTextView2 = this.titleTextView[i13];
            if (simpleTextView2 != null && simpleTextView2.getVisibility() != 8) {
                boolean z2 = this.fromBottom;
                int currentActionBarHeight = ((((z2 && i13 == 0) || (!z2 && i13 == 1)) && this.overlayTitleAnimation && this.titleAnimationRunning) || (simpleTextView = this.subtitleTextView) == null || simpleTextView.getVisibility() == 8) ? (getCurrentActionBarHeight() - this.titleTextView[i13].getTextHeight()) / 2 : AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + AndroidUtilities.dp(2.0f) + (((getCurrentActionBarHeight() / 2) - this.titleTextView[i13].getTextHeight()) / 2);
                SimpleTextView simpleTextView3 = this.titleTextView[i13];
                int i14 = currentActionBarHeight + i10;
                simpleTextView3.layout(i11, i14 - simpleTextView3.getPaddingTop(), this.titleTextView[i13].getMeasuredWidth() + i11, this.titleTextView[i13].getPaddingBottom() + ((this.titleTextView[i13].getTextHeight() + i14) - this.titleTextView[i13].getPaddingTop()));
            }
            i13++;
        }
        if (this.additionalSubTitleOverlayContainer != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.additionalSubTitleOverlayContainer.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = this.additionalSubTitleOverlayContainer;
            int i15 = currentActionBarHeight2 + i10;
            actionBarAnimatedSubtitleOverlayContainer.layout(i11, i15, actionBarAnimatedSubtitleOverlayContainer.getMeasuredWidth() + i11, this.additionalSubTitleOverlayContainer.getMeasuredHeight() + i15);
        }
        SimpleTextView simpleTextView4 = this.subtitleTextView;
        if (simpleTextView4 != null && simpleTextView4.getVisibility() != 8) {
            int currentActionBarHeight3 = ((((getCurrentActionBarHeight() / 2) - this.subtitleTextView.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            SimpleTextView simpleTextView5 = this.subtitleTextView;
            int i16 = currentActionBarHeight3 + i10;
            simpleTextView5.layout(i11, i16, simpleTextView5.getMeasuredWidth() + i11, this.subtitleTextView.getTextHeight() + i16);
        }
        SimpleTextView simpleTextView6 = this.additionalSubtitleTextView;
        if (simpleTextView6 != null && simpleTextView6.getVisibility() != 8) {
            int currentActionBarHeight4 = (((getCurrentActionBarHeight() / 2) - this.additionalSubtitleTextView.getTextHeight()) / 2) + (getCurrentActionBarHeight() / 2);
            if (!AndroidUtilities.isTablet()) {
                int i17 = getResources().getConfiguration().orientation;
            }
            int iDp2 = currentActionBarHeight4 - AndroidUtilities.dp(1.0f);
            SimpleTextView simpleTextView7 = this.additionalSubtitleTextView;
            int i18 = iDp2 + i10;
            simpleTextView7.layout(i11, i18, simpleTextView7.getMeasuredWidth() + i11, this.additionalSubtitleTextView.getTextHeight() + i18);
        }
        BackupImageView backupImageView = this.avatarSearchImageView;
        if (backupImageView != null) {
            backupImageView.layout(AndroidUtilities.dp(64.0f), ((getCurrentActionBarHeight() - this.avatarSearchImageView.getMeasuredHeight()) / 2) + i10, this.avatarSearchImageView.getMeasuredWidth() + AndroidUtilities.dp(64.0f), ((this.avatarSearchImageView.getMeasuredHeight() + getCurrentActionBarHeight()) / 2) + i10);
        }
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                SimpleTextView[] simpleTextViewArr = this.titleTextView;
                if (childAt2 != simpleTextViewArr[0] && childAt2 != simpleTextViewArr[1] && childAt2 != this.additionalSubTitleOverlayContainer && childAt2 != this.subtitleTextView && childAt2 != this.menu && childAt2 != this.backButtonImageView && childAt2 != this.additionalSubtitleTextView && childAt2 != this.avatarSearchImageView) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    int measuredHeight = childAt2.getMeasuredHeight();
                    int i20 = layoutParams.gravity;
                    if (i20 == -1) {
                        i20 = 51;
                    }
                    int i21 = i20 & 112;
                    int i22 = i20 & 7;
                    if (i22 != 1) {
                        if (i22 != 5) {
                            i6 = layoutParams.leftMargin;
                        } else {
                            measuredWidth = getMeasuredWidth() - measuredWidth3;
                            i5 = layoutParams.rightMargin;
                        }
                        if (i21 != 16) {
                            if (i21 != 80) {
                                i9 = layoutParams.topMargin;
                            } else {
                                i7 = (i4 - i2) - measuredHeight;
                                i8 = layoutParams.bottomMargin;
                            }
                            childAt2.layout(i6, i9, measuredWidth3 + i6, measuredHeight + i9);
                        } else {
                            i7 = (((i4 - i2) - measuredHeight) / 2) + layoutParams.topMargin;
                            i8 = layoutParams.bottomMargin;
                        }
                        i9 = i7 - i8;
                        childAt2.layout(i6, i9, measuredWidth3 + i6, measuredHeight + i9);
                    } else {
                        measuredWidth = ((getMeasuredWidth() - measuredWidth3) / 2) + layoutParams.leftMargin;
                        i5 = layoutParams.rightMargin;
                    }
                    i6 = measuredWidth - i5;
                    if (i21 != 16) {
                        if (i21 != 80) {
                            i9 = layoutParams.topMargin;
                        } else {
                            i7 = (i4 - i2) - measuredHeight;
                            i8 = layoutParams.bottomMargin;
                        }
                        childAt2.layout(i6, i9, measuredWidth3 + i6, measuredHeight + i9);
                    } else {
                        i7 = (((i4 - i2) - measuredHeight) / 2) + layoutParams.topMargin;
                        i8 = layoutParams.bottomMargin;
                    }
                    i9 = i7 - i8;
                    childAt2.layout(i6, i9, measuredWidth3 + i6, measuredHeight + i9);
                }
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int iDp;
        SimpleTextView simpleTextView;
        SimpleTextView simpleTextView2;
        int iMakeMeasureSpec;
        float f;
        float f2;
        ActionBar actionBar = this;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i3 = 1;
        actionBar.ignoreLayoutRequest = true;
        View view = actionBar.actionModeTop;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        ActionBarMenu actionBarMenu = actionBar.actionMode;
        if (actionBarMenu != null) {
            actionBarMenu.setPadding(0, actionBar.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
        actionBar.ignoreLayoutRequest = false;
        actionBar.setMeasuredDimension(size, currentActionBarHeight + (actionBar.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0) + actionBar.extraHeight);
        ImageView imageView = actionBar.backButtonImageView;
        if (imageView == null || imageView.getVisibility() == 8) {
            iDp = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        } else {
            actionBar.backButtonImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54.0f), 1073741824), iMakeMeasureSpec2);
            iDp = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        }
        ActionBarMenu actionBarMenu2 = actionBar.menu;
        if (actionBarMenu2 != null && actionBarMenu2.getVisibility() != 8) {
            ActionBarMenu actionBarMenu3 = actionBar.menu;
            int childCount = actionBarMenu3.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 < childCount) {
                    View childAt = actionBarMenu3.getChildAt(i4);
                    if (childAt instanceof ActionBarMenuItem) {
                        ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                        if (actionBarMenuItem.getSearchContainer() != null && actionBarMenuItem.getSearchContainer().getVisibility() == 0) {
                            if (!actionBar.isSearchFieldVisible) {
                                actionBar.menu.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), iMakeMeasureSpec2);
                                int itemsMeasuredWidth = actionBar.menu.getItemsMeasuredWidth();
                                if (actionBar.menuOccupyBack) {
                                    f2 = 0.0f;
                                } else {
                                    f2 = AndroidUtilities.isTablet() ? 74.0f : 66.0f;
                                }
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(actionBar.menu.getItemsMeasuredWidth() + (size - AndroidUtilities.dp(f2)), 1073741824);
                                if (!actionBar.isMenuOffsetSuppressed) {
                                    actionBar.menu.translateXItems(-itemsMeasuredWidth);
                                }
                            }
                            actionBar.menu.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                    }
                    i4++;
                }
                if (actionBar.isSearchFieldVisible) {
                    if (actionBar.menuOccupyBack) {
                        f = 0.0f;
                    } else {
                        f = AndroidUtilities.isTablet() ? 74.0f : 66.0f;
                    }
                    iMakeMeasureSpec = OKLCH.m(f, size, 1073741824);
                    if (!actionBar.isMenuOffsetSuppressed) {
                        actionBar.menu.translateXItems(0.0f);
                    }
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                    if (!actionBar.isMenuOffsetSuppressed) {
                        actionBar.menu.translateXItems(0.0f);
                    }
                }
                actionBar.menu.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
        }
        int i5 = 0;
        while (i5 < 2) {
            SimpleTextView simpleTextView3 = actionBar.titleTextView[0];
            if ((simpleTextView3 != null && simpleTextView3.getVisibility() != 8) || ((simpleTextView = actionBar.subtitleTextView) != null && simpleTextView.getVisibility() != 8)) {
                ActionBarMenu actionBarMenu4 = actionBar.menu;
                int iMax = Math.max(RichMessageLayout$$ExternalSyntheticOutline1.m(16.0f, size - (actionBarMenu4 != null ? actionBarMenu4.getMeasuredWidth() : 0), iDp) - actionBar.titleRightMargin, 0);
                boolean z = actionBar.fromBottom;
                int i6 = 20;
                if (((z && i5 == 0) || (!z && i5 == i3)) && actionBar.overlayTitleAnimation && actionBar.titleAnimationRunning) {
                    SimpleTextView simpleTextView4 = actionBar.titleTextView[i5];
                    if (actionBar.glassMode) {
                        i6 = 17;
                    } else if (!AndroidUtilities.isTablet() && actionBar.getResources().getConfiguration().orientation == 2) {
                        i6 = 18;
                    }
                    simpleTextView4.setTextSize(i6);
                } else {
                    SimpleTextView simpleTextView5 = actionBar.titleTextView[0];
                    if (simpleTextView5 == null || simpleTextView5.getVisibility() == 8 || (simpleTextView2 = actionBar.subtitleTextView) == null || simpleTextView2.getVisibility() == 8) {
                        SimpleTextView simpleTextView6 = actionBar.titleTextView[i5];
                        if (simpleTextView6 != null && simpleTextView6.getVisibility() != 8) {
                            SimpleTextView simpleTextView7 = actionBar.titleTextView[i5];
                            if (actionBar.glassMode) {
                                i6 = 17;
                            } else if (!AndroidUtilities.isTablet() && actionBar.getResources().getConfiguration().orientation == 2) {
                                i6 = 18;
                            }
                            simpleTextView7.setTextSize(i6);
                        }
                        SimpleTextView simpleTextView8 = actionBar.subtitleTextView;
                        if (simpleTextView8 != null && simpleTextView8.getVisibility() != 8) {
                            actionBar.subtitleTextView.setTextSize((AndroidUtilities.isTablet() || actionBar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        SimpleTextView simpleTextView9 = actionBar.additionalSubtitleTextView;
                        if (simpleTextView9 != null) {
                            simpleTextView9.setTextSize((AndroidUtilities.isTablet() || actionBar.getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    } else {
                        SimpleTextView simpleTextView10 = actionBar.titleTextView[i5];
                        if (simpleTextView10 != null) {
                            if (actionBar.glassMode) {
                                i6 = 17;
                            } else if (!AndroidUtilities.isTablet()) {
                                i6 = 18;
                            }
                            simpleTextView10.setTextSize(i6);
                        }
                        actionBar.subtitleTextView.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        SimpleTextView simpleTextView11 = actionBar.additionalSubtitleTextView;
                        if (simpleTextView11 != null) {
                            simpleTextView11.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        }
                    }
                }
                SimpleTextView simpleTextView12 = actionBar.titleTextView[i5];
                if (simpleTextView12 != null && simpleTextView12.getVisibility() != 8) {
                    actionBar.titleTextView[i5].measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(actionBar.titleTextView[i5].getPaddingBottom() + actionBar.titleTextView[i5].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (actionBar.centerScale) {
                        CharSequence text = actionBar.titleTextView[i5].getText();
                        SimpleTextView simpleTextView13 = actionBar.titleTextView[i5];
                        simpleTextView13.setPivotX(simpleTextView13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        actionBar.titleTextView[i5].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        actionBar.titleTextView[i5].setPivotX(0.0f);
                        actionBar.titleTextView[i5].setPivotY(0.0f);
                    }
                }
                SimpleTextView simpleTextView14 = actionBar.subtitleTextView;
                if (simpleTextView14 != null && simpleTextView14.getVisibility() != 8) {
                    actionBar.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = actionBar.additionalSubTitleOverlayContainer;
                if (actionBarAnimatedSubtitleOverlayContainer != null) {
                    actionBarAnimatedSubtitleOverlayContainer.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                SimpleTextView simpleTextView15 = actionBar.additionalSubtitleTextView;
                if (simpleTextView15 != null && simpleTextView15.getVisibility() != 8) {
                    actionBar.additionalSubtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
            }
            i5++;
            i3 = 1;
        }
        BackupImageView backupImageView = actionBar.avatarSearchImageView;
        if (backupImageView != null) {
            backupImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
        }
        int childCount2 = actionBar.getChildCount();
        int i7 = 0;
        while (i7 < childCount2) {
            View childAt2 = actionBar.getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                SimpleTextView[] simpleTextViewArr = actionBar.titleTextView;
                if (childAt2 != simpleTextViewArr[0] && childAt2 != simpleTextViewArr[1] && childAt2 != actionBar.additionalSubTitleOverlayContainer && childAt2 != actionBar.subtitleTextView && childAt2 != actionBar.menu && childAt2 != actionBar.backButtonImageView && childAt2 != actionBar.additionalSubtitleTextView && childAt2 != actionBar.avatarSearchImageView) {
                    actionBar.measureChildWithMargins(childAt2, i, 0, View.MeasureSpec.makeMeasureSpec(actionBar.getMeasuredHeight(), 1073741824), 0);
                }
            }
            i7++;
            actionBar = this;
        }
    }

    public void onMenuButtonPressed() {
        ActionBarMenu actionBarMenu;
        if (isActionModeShowed() || (actionBarMenu = this.menu) == null) {
            return;
        }
        int childCount = actionBarMenu.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = actionBarMenu.getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.getVisibility() != 0) {
                    continue;
                } else if (actionBarMenuItem.hasSubMenu()) {
                    actionBarMenuItem.toggleSubMenu();
                    return;
                } else if (actionBarMenuItem.overrideMenuClick) {
                    actionBarMenu.onItemClick(((Integer) actionBarMenuItem.getTag()).intValue());
                    return;
                }
            }
        }
    }

    public void onPause() {
        this.resumed = false;
        updateAttachState$1();
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            int childCount = actionBarMenu.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = actionBarMenu.getChildAt(i);
                if (childAt instanceof ActionBarMenuItem) {
                    ((ActionBarMenuItem) childAt).closeSubMenu();
                }
            }
        }
    }

    public void onResume() {
        this.resumed = true;
        updateAttachState$1();
    }

    public boolean onSearchChangedIgnoreTitles() {
        return false;
    }

    public void onSearchFieldVisibilityChanged(final boolean z) {
        Property property;
        this.isSearchFieldVisible = z;
        checkMenuItemsWidth();
        AnimatorSet animatorSet = this.searchVisibleAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.searchVisibleAnimator = new AnimatorSet();
        final ArrayList arrayList = new ArrayList();
        final boolean zOnSearchChangedIgnoreTitles = onSearchChangedIgnoreTitles();
        if (!zOnSearchChangedIgnoreTitles) {
            SimpleTextView simpleTextView = this.titleTextView[0];
            if (simpleTextView != null) {
                arrayList.add(simpleTextView);
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                arrayList.add(this.subtitleTextView);
                this.subtitleTextView.setVisibility(z ? 4 : 0);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.searchFieldVisibleAlpha, z ? 1.0f : 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ActionBar$$ExternalSyntheticLambda3(this, 3));
        this.searchVisibleAnimator.playTogether(valueAnimatorOfFloat);
        int i = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i >= size) {
                break;
            }
            View view = (View) arrayList.get(i);
            float f = 0.95f;
            if (!z) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            this.searchVisibleAnimator.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z ? 0.0f : 1.0f));
            this.searchVisibleAnimator.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.searchVisibleAnimator;
            if (!z) {
                f = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f));
            i++;
        }
        BackupImageView backupImageView = this.avatarSearchImageView;
        if (backupImageView != null) {
            backupImageView.setVisibility(0);
            this.searchVisibleAnimator.playTogether(ObjectAnimator.ofFloat(this.avatarSearchImageView, (Property<BackupImageView, Float>) property, z ? 1.0f : 0.0f));
        }
        this.centerScale = true;
        requestLayout();
        this.searchVisibleAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator) {
                boolean z2;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = arrayList;
                    int size2 = arrayList2.size();
                    z2 = z;
                    if (i2 >= size2) {
                        break;
                    }
                    View view2 = (View) arrayList2.get(i2);
                    if (z2) {
                        view2.setVisibility(4);
                        view2.setAlpha(0.0f);
                    } else {
                        view2.setAlpha(1.0f);
                    }
                    i2++;
                }
                ActionBar actionBar = ActionBar.this;
                if (z2 && !zOnSearchChangedIgnoreTitles) {
                    if (actionBar.titleTextView[0] != null) {
                        actionBar.titleTextView[0].setVisibility(8);
                    }
                    if (actionBar.titleTextView[1] != null) {
                        actionBar.titleTextView[1].setVisibility(8);
                    }
                }
                if (actionBar.avatarSearchImageView == null || z2) {
                    return;
                }
                actionBar.avatarSearchImageView.setVisibility(8);
            }
        });
        this.searchVisibleAnimator.setDuration(150L).start();
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof MenuDrawable) {
                MenuDrawable menuDrawable = (MenuDrawable) drawable;
                menuDrawable.rotateToBack = true;
                menuDrawable.setRotation(z ? 1.0f : 0.0f, true);
            }
        }
    }

    public void onSearchPressed() {
        ActionBarMenu actionBarMenu = this.menu;
        int childCount = actionBarMenu.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = actionBarMenu.getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField()) {
                    actionBarMenuItem.onSearchPressed();
                }
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.forceSkipTouches) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.interceptTouches;
    }

    @Override
    public void onViewAdded(View view) {
        super.onViewAdded(view);
    }

    public void openSearchField(String str, boolean z) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu == null || str == null) {
            return;
        }
        boolean z2 = this.isSearchFieldVisible;
        boolean z3 = !z2;
        int childCount = actionBarMenu.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = actionBarMenu.getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField()) {
                    if (!z2) {
                        actionBarMenu.parentActionBar.onSearchFieldVisibilityChanged(actionBarMenuItem.toggleSearch(z3));
                    }
                    actionBarMenuItem.setSearchFieldText(str, z);
                    actionBarMenuItem.getSearchField().setSelection(str.length());
                    return;
                }
            }
        }
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayoutRequest) {
            return;
        }
        super.requestLayout();
    }

    public void setActionBarMenuOnItemClick(ActionBarMenuOnItemClick actionBarMenuOnItemClick) {
        this.actionBarMenuOnItemClick = actionBarMenuOnItemClick;
    }

    public void setActionModeColor(int i) {
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            actionBarMenu.setBackgroundColor(i);
        }
    }

    public void setActionModeOverrideColor(int i) {
        this.actionModeColor = i;
    }

    public void setActionModeTopColor(int i) {
        View view = this.actionModeTop;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        setAdaptiveBackground(recyclerView, false, Theme.key_windowBackgroundGray, Theme.key_actionBarDefault);
    }

    public void setAddToContainer(boolean z) {
        this.addToContainer = z;
    }

    public void setAdditionalTextLeft(int i) {
        this.additionalTextLeft = i;
    }

    public void setAllowOverlayTitle(boolean z) {
        this.allowOverlayTitle = z;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        if (this.backButtonImageView == null) {
            createBackButtonImage();
        }
        this.backButtonImageView.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.backButtonImageView;
        this.backButtonDrawable = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof BackDrawable) {
            BackDrawable backDrawable = (BackDrawable) drawable;
            backDrawable.setRotation(isActionModeShowed() ? 1.0f : 0.0f, false);
            backDrawable.rotatedColor = this.itemsActionModeColor;
            backDrawable.invalidateSelf();
            backDrawable.color = this.itemsColor;
            backDrawable.invalidateSelf();
        } else if (drawable instanceof MenuDrawable) {
            MenuDrawable menuDrawable = (MenuDrawable) drawable;
            menuDrawable.backColor = this.actionBarColor;
            menuDrawable.iconColor = this.itemsColor;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(this.itemsColor, PorterDuff.Mode.SRC_IN));
        }
        if (this.mAlwaysApplyColorFilterToBackButton) {
            this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(this.itemsColor, PorterDuff.Mode.SRC_IN));
        }
        ImageView imageView2 = this.backButtonImageView;
        if (imageView2 == null) {
            return;
        }
        Drawable drawable2 = imageView2.getDrawable();
        int i = ((drawable2 instanceof BackDrawable) || (drawable2 instanceof MenuDrawable)) ? 2 : 0;
        if (this.backButtonImageView.getLayerType() != i) {
            this.backButtonImageView.setLayerType(i, null);
            this.backButtonImageView.invalidate();
        }
    }

    public void setBackButtonImage(int i) {
        if (this.backButtonImageView == null) {
            createBackButtonImage();
        }
        this.backButtonImageView.setVisibility(i == 0 ? 8 : 0);
        this.backButtonImageView.setImageResource(i);
        this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(this.itemsColor, PorterDuff.Mode.SRC_IN));
        ImageView imageView = this.backButtonImageView;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i2 = ((drawable instanceof BackDrawable) || (drawable instanceof MenuDrawable)) ? 2 : 0;
        if (this.backButtonImageView.getLayerType() != i2) {
            this.backButtonImageView.setLayerType(i2, null);
            this.backButtonImageView.invalidate();
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        this.actionBarColor = i;
        if (!this.blurredBackground) {
            super.setBackgroundColor(i);
        }
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof MenuDrawable) {
                ((MenuDrawable) drawable).backColor = i;
            }
        }
    }

    public void setCastShadows(boolean z) {
        if (this.castShadows != z && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.castShadows = z;
    }

    public void setChatAvatarContainer(ChatAvatarContainer chatAvatarContainer) {
        this.chatAvatarContainer = chatAvatarContainer;
    }

    public void setClipContent(boolean z) {
        this.clipContent = z;
    }

    public void setDrawBackButton(boolean z) {
        this.drawBackButton = z;
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        this.blurredBackground = true;
        this.contentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.blurBehindViews.add(this);
        setBackground(null);
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setEnabled(z);
        }
        ActionBarMenu actionBarMenu2 = this.actionMode;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        this.extraHeight = i;
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarMenu.getLayoutParams();
            layoutParams.bottomMargin = this.extraHeight;
            this.actionMode.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z) {
        this.forceSkipTouches = z;
    }

    public void setForcedMenuMinWidth(int i) {
        this.hasForcedMenuMinWidth = true;
        if (this.forcedMenuMinWidth != i) {
            this.forcedMenuMinWidth = i;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i) {
        this.hasForcedMenuWidth = true;
        if (this.forcedMenuWidth != i) {
            this.forcedMenuWidth = i;
            invalidate();
        }
    }

    public void setGlassOnlyBack() {
        this.glassOnlyBack = true;
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.interceptTouchEventListener = onTouchListener;
    }

    public void setInterceptTouches(boolean z) {
        this.interceptTouches = z;
    }

    public void setItemsBackgroundColor(int i, boolean z) {
        ImageView imageView;
        int i2 = 0;
        if (z) {
            this.itemsActionModeBackgroundColor = i;
            if (this.actionModeVisible && (imageView = this.backButtonImageView) != null) {
                imageView.setBackgroundDrawable(Theme.createSelectorDrawable(i, 1, -1));
            }
            ActionBarMenu actionBarMenu = this.actionMode;
            if (actionBarMenu != null) {
                int childCount = actionBarMenu.getChildCount();
                while (i2 < childCount) {
                    View childAt = actionBarMenu.getChildAt(i2);
                    if (childAt instanceof ActionBarMenuItem) {
                        boolean z2 = actionBarMenu.isActionMode;
                        ActionBar actionBar = actionBarMenu.parentActionBar;
                        childAt.setBackgroundDrawable(Theme.createSelectorDrawable(z2 ? actionBar.itemsActionModeBackgroundColor : actionBar.itemsBackgroundColor, 1, -1));
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        this.itemsBackgroundColor = i;
        ImageView imageView2 = this.backButtonImageView;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(Theme.createSelectorDrawable(i, 1, -1));
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            int childCount2 = actionBarMenu2.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = actionBarMenu2.getChildAt(i2);
                if (childAt2 instanceof ActionBarMenuItem) {
                    boolean z3 = actionBarMenu2.isActionMode;
                    ActionBar actionBar2 = actionBarMenu2.parentActionBar;
                    childAt2.setBackgroundDrawable(Theme.createSelectorDrawable(z3 ? actionBar2.itemsActionModeBackgroundColor : actionBar2.itemsBackgroundColor, 1, -1));
                }
                i2++;
            }
        }
    }

    public void setItemsColor(int i, boolean z) {
        int i2 = 0;
        if (z) {
            this.itemsActionModeColor = i;
            ActionBarMenu actionBarMenu = this.actionMode;
            if (actionBarMenu != null) {
                int childCount = actionBarMenu.getChildCount();
                while (i2 < childCount) {
                    View childAt = actionBarMenu.getChildAt(i2);
                    if (childAt instanceof ActionBarMenuItem) {
                        ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                        boolean z2 = actionBarMenu.isActionMode;
                        ActionBar actionBar = actionBarMenu.parentActionBar;
                        actionBarMenuItem.setIconColor(z2 ? actionBar.itemsActionModeColor : actionBar.itemsColor);
                    }
                    i2++;
                }
            }
            ImageView imageView = this.backButtonImageView;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof BackDrawable) {
                    BackDrawable backDrawable = (BackDrawable) drawable;
                    backDrawable.rotatedColor = i;
                    backDrawable.invalidateSelf();
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.itemsColor = i;
            ImageView imageView2 = this.backButtonImageView;
            if (imageView2 != null && i != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof BackDrawable) {
                    BackDrawable backDrawable2 = (BackDrawable) drawable2;
                    backDrawable2.color = i;
                    backDrawable2.invalidateSelf();
                } else if (drawable2 instanceof MenuDrawable) {
                    ((MenuDrawable) drawable2).iconColor = i;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
            ActionBarMenu actionBarMenu2 = this.menu;
            if (actionBarMenu2 != null) {
                int childCount2 = actionBarMenu2.getChildCount();
                while (i2 < childCount2) {
                    View childAt2 = actionBarMenu2.getChildAt(i2);
                    if (childAt2 instanceof ActionBarMenuItem) {
                        ActionBarMenuItem actionBarMenuItem2 = (ActionBarMenuItem) childAt2;
                        boolean z3 = actionBarMenu2.isActionMode;
                        ActionBar actionBar2 = actionBarMenu2.parentActionBar;
                        actionBarMenuItem2.setIconColor(z3 ? actionBar2.itemsActionModeColor : actionBar2.itemsColor);
                    }
                    i2++;
                }
            }
        }
        ImageView imageView3 = this.backButtonImageView;
        if (imageView3 == null || !this.mAlwaysApplyColorFilterToBackButton) {
            return;
        }
        imageView3.setColorFilter(new PorterDuffColorFilter(this.itemsColor, PorterDuff.Mode.SRC_IN));
    }

    public void setMenuOffsetSuppressed(boolean z) {
        this.isMenuOffsetSuppressed = z;
    }

    public void setOccupyStatusBar(boolean z) {
        this.occupyStatusBar = z;
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            actionBarMenu.setPadding(0, z ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.doOnActionModeFactorChanged = runnable;
    }

    public void setOverlayTitleAnimation(boolean z) {
        this.overlayTitleAnimation = z;
    }

    public void setPopupBackgroundColor(int i, boolean z) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        int i2 = 0;
        if (z && (actionBarMenu2 = this.actionMode) != null) {
            int childCount = actionBarMenu2.getChildCount();
            while (i2 < childCount) {
                View childAt = actionBarMenu2.getChildAt(i2);
                if (childAt instanceof ActionBarMenuItem) {
                    ((ActionBarMenuItem) childAt).redrawPopup(i);
                }
                i2++;
            }
            return;
        }
        if (z || (actionBarMenu = this.menu) == null) {
            return;
        }
        int childCount2 = actionBarMenu.getChildCount();
        while (i2 < childCount2) {
            View childAt2 = actionBarMenu.getChildAt(i2);
            if (childAt2 instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt2).redrawPopup(i);
            }
            i2++;
        }
    }

    public void setPopupItemsColor(int i, boolean z, boolean z2) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        int i2 = 0;
        if (z2 && (actionBarMenu2 = this.actionMode) != null) {
            int childCount = actionBarMenu2.getChildCount();
            while (i2 < childCount) {
                View childAt = actionBarMenu2.getChildAt(i2);
                if (childAt instanceof ActionBarMenuItem) {
                    ((ActionBarMenuItem) childAt).setPopupItemsColor(i, z);
                }
                i2++;
            }
            return;
        }
        if (z2 || (actionBarMenu = this.menu) == null) {
            return;
        }
        int childCount2 = actionBarMenu.getChildCount();
        while (i2 < childCount2) {
            View childAt2 = actionBarMenu.getChildAt(i2);
            if (childAt2 instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt2).setPopupItemsColor(i, z);
            }
            i2++;
        }
    }

    public void setPopupItemsSelectorColor(int i, boolean z) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        if (z && (actionBarMenu2 = this.actionMode) != null) {
            actionBarMenu2.setPopupItemsSelectorColor(i);
        } else {
            if (z || (actionBarMenu = this.menu) == null) {
                return;
            }
            actionBarMenu.setPopupItemsSelectorColor(i);
        }
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.rightDrawableOnClickListener = onClickListener;
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView != null) {
            simpleTextView.setRightDrawableOnClick(onClickListener);
        }
        SimpleTextView simpleTextView2 = this.titleTextView[1];
        if (simpleTextView2 != null) {
            simpleTextView2.setRightDrawableOnClick(this.rightDrawableOnClickListener);
        }
    }

    public void setSearchAvatarImageView(BackupImageView backupImageView) {
        BackupImageView backupImageView2 = this.avatarSearchImageView;
        if (backupImageView2 == backupImageView) {
            return;
        }
        if (backupImageView2 != null) {
            removeView(backupImageView2);
        }
        this.avatarSearchImageView = backupImageView;
        if (backupImageView != null) {
            addView(backupImageView);
        }
    }

    public void setSearchCursorColor(int i) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setSearchCursorColor(i);
        }
    }

    public void setSearchFactor(float f) {
        if (this.searchFactor != f) {
            this.searchFactor = f;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.menu.setSearchFieldText(str);
    }

    public void setSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setFilter(mediaFilterData);
        }
    }

    public void setSearchTextColor(int i, boolean z) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            int childCount = actionBarMenu.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = actionBarMenu.getChildAt(i2);
                if (childAt instanceof ActionBarMenuItem) {
                    ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                    if (actionBarMenuItem.isSearchField()) {
                        if (z) {
                            actionBarMenuItem.getSearchField().setHintTextColor(i);
                            return;
                        } else {
                            actionBarMenuItem.getSearchField().setTextColor(i);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void setShadowAlpha(int i) {
        if (this.shadowAlpha == i) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.shadowAlpha = i;
    }

    public void setSkipDrawChild(boolean z) {
        if (this.doNotDrawChild != z) {
            this.doNotDrawChild = z;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        SimpleTextView simpleTextView;
        if (charSequence != null && (simpleTextView = this.subtitleTextView) == null && simpleTextView == null) {
            SimpleTextView simpleTextView2 = new SimpleTextView(getContext());
            this.subtitleTextView = simpleTextView2;
            simpleTextView2.setGravity(3);
            this.subtitleTextView.setVisibility(8);
            this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubtitle, this.resourcesProvider));
            addView(this.subtitleTextView, 0, LayoutHelper.createFrame(-2, -2, 51));
        }
        if (this.subtitleTextView != null) {
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            this.subtitleTextView.setVisibility((zIsEmpty || this.isSearchFieldVisible) ? 8 : 0);
            this.subtitleTextView.setAlpha(1.0f);
            if (!zIsEmpty) {
                this.subtitleTextView.setText(charSequence);
            }
            this.subtitle = charSequence;
        }
    }

    public void setSubtitleColor(int i) {
        SimpleTextView simpleTextView = this.subtitleTextView;
        if (simpleTextView == null && simpleTextView == null) {
            SimpleTextView simpleTextView2 = new SimpleTextView(getContext());
            this.subtitleTextView = simpleTextView2;
            simpleTextView2.setGravity(3);
            this.subtitleTextView.setVisibility(8);
            this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubtitle, this.resourcesProvider));
            addView(this.subtitleTextView, 0, LayoutHelper.createFrame(-2, -2, 51));
        }
        this.subtitleTextView.setTextColor(i);
    }

    public void setSupportsHolidayImage(boolean z) {
        this.supportsHolidayImage = z;
        if (z) {
            this.fontMetricsInt = new Paint.FontMetricsInt();
            this.rect = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.titleActionRunnable = runnable;
        this.lastRunnable = runnable;
    }

    public void setTitleAnimated(CharSequence charSequence, boolean z, long j) {
        setTitleAnimated(charSequence, z, j, null);
    }

    public void setTitleColor(int i) {
        if (this.titleTextView[0] == null) {
            createTitleTextView(0);
        }
        this.titleColorToSet = i;
        this.titleTextView[0].setTextColor(i);
        this.titleTextView[0].setEmojiColor(i);
        SimpleTextView simpleTextView = this.titleTextView[1];
        if (simpleTextView != null) {
            simpleTextView.setTextColor(i);
            this.titleTextView[1].setEmojiColor(i);
        }
    }

    public void setTitleOverlayText(String str, int i, Runnable runnable) {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        CharSequence charSequence3;
        boolean z2;
        SimpleTextView simpleTextView;
        int iIndexOf;
        SpannableString spannableStringValueOf;
        String string;
        if (!this.allowOverlayTitle || this.parentFragment.parentLayout == null) {
            return;
        }
        Object[] objArr = this.overlayTitleToSet;
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i);
        this.overlayTitleToSet[2] = runnable;
        if (this.overlayTitleAnimationInProgress) {
            return;
        }
        CharSequence charSequence4 = this.lastOverlayTitle;
        if (charSequence4 == null && str == null) {
            return;
        }
        if (charSequence4 == null || !charSequence4.equals(str)) {
            this.lastOverlayTitle = str;
            Drawable drawable = null;
            if (this.additionalSubTitleOverlayContainer != null) {
                this.additionalSubTitleOverlayContainer.setText(i == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null, true);
            }
            if (str != null) {
                string = LocaleController.getString(str, i);
            } else {
                charSequence = this.lastTitle;
            }
            if (str == null) {
                charSequence2 = charSequence;
                charSequence2 = string;
                drawable = this.lastRightDrawable;
            }
            if (str == null || (iIndexOf = TextUtils.indexOf(charSequence2, "...")) < 0) {
                z = false;
                charSequence3 = charSequence2;
            } else {
                spannableStringValueOf = SpannableString.valueOf(charSequence2);
                this.ellipsizeSpanAnimator.wrap(spannableStringValueOf, iIndexOf);
                z = true;
            }
            if (str != null) {
                charSequence3 = spannableStringValueOf;
                z2 = true;
            } else {
                charSequence3 = spannableStringValueOf;
                z2 = false;
            }
            this.titleOverlayShown = z2;
            if ((charSequence3 == null || this.titleTextView[0] != null) && getMeasuredWidth() != 0 && ((simpleTextView = this.titleTextView[0]) == null || simpleTextView.getVisibility() == 0)) {
                SimpleTextView simpleTextView2 = this.titleTextView[0];
                if (simpleTextView2 != null) {
                    simpleTextView2.animate().cancel();
                    SimpleTextView simpleTextView3 = this.titleTextView[1];
                    if (simpleTextView3 != null) {
                        simpleTextView3.animate().cancel();
                    }
                    if (this.titleTextView[1] == null) {
                        createTitleTextView(1);
                    }
                    this.titleTextView[1].setText(charSequence3);
                    this.titleTextView[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    this.titleTextView[1].setRightDrawable(drawable);
                    this.titleTextView[1].setRightDrawableOnClick(this.rightDrawableOnClickListener);
                    if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                        ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(this.titleTextView[1]);
                    }
                    if (z) {
                        this.ellipsizeSpanAnimator.addView(this.titleTextView[1]);
                    }
                    this.overlayTitleAnimationInProgress = true;
                    SimpleTextView[] simpleTextViewArr = this.titleTextView;
                    SimpleTextView simpleTextView4 = simpleTextViewArr[1];
                    simpleTextViewArr[1] = simpleTextViewArr[0];
                    simpleTextViewArr[0] = simpleTextView4;
                    simpleTextView4.setAlpha(0.0f);
                    this.titleTextView[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                    this.titleTextView[0].animate().alpha(this.adaptiveBackgroundHideTitle ? 1.0f - this.onTopAnimated : 1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = this.titleTextView[1].animate().alpha(0.0f);
                    if (this.subtitleTextView == null) {
                        viewPropertyAnimatorAlpha.translationY(AndroidUtilities.dp(20.0f));
                    } else {
                        viewPropertyAnimatorAlpha.scaleY(0.7f).scaleX(0.7f);
                    }
                    requestLayout();
                    this.centerScale = true;
                    viewPropertyAnimatorAlpha.setDuration(220L).setListener(new AnonymousClass5(this, 0)).start();
                }
            } else {
                createTitleTextView(0);
                if (this.supportsHolidayImage) {
                    this.titleTextView[0].invalidate();
                    invalidate();
                }
                this.titleTextView[0].setText(charSequence3);
                this.titleTextView[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                this.titleTextView[0].setRightDrawable(drawable);
                this.titleTextView[0].setRightDrawableOnClick(this.rightDrawableOnClickListener);
                if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(this.titleTextView[0]);
                }
                if (z) {
                    this.ellipsizeSpanAnimator.addView(this.titleTextView[0]);
                } else {
                    this.ellipsizeSpanAnimator.removeView(this.titleTextView[0]);
                }
            }
            if (runnable == null) {
                runnable = this.lastRunnable;
            }
            this.titleActionRunnable = runnable;
        }
    }

    public void setTitleRightMargin(int i) {
        this.titleRightMargin = i;
    }

    public void setTitleScrollNonFitText(boolean z) {
        this.titleTextView[0].setScrollNonFitText(z);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.clipContent) {
            invalidate();
        }
    }

    public void setUseContainerForTitles() {
        this.useContainerForTitles = true;
        if (this.titlesContainer == null) {
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(getContext(), 0);
            this.titlesContainer = anonymousClass8;
            addView(anonymousClass8);
        }
    }

    public void setupGlass(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        setupGlass(blurredBackgroundDrawableViewFactory, blurredBackgroundColorProvider, false);
    }

    public boolean shouldAddToContainer() {
        return this.addToContainer;
    }

    public boolean shouldClipChild(View view) {
        if (this.clipContent) {
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if (view == simpleTextViewArr[0] || view == simpleTextViewArr[1] || view == this.subtitleTextView || view == this.menu || view == this.backButtonImageView || view == this.additionalSubtitleTextView || view == this.titlesContainer) {
                return true;
            }
        }
        return false;
    }

    public void showActionMode() {
        showActionMode(true, null, null, null, null, null, 0);
    }

    public void showActionModeTop() {
        if (this.occupyStatusBar && this.actionModeTop == null) {
            View view = new View(getContext());
            this.actionModeTop = view;
            view.setBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultTop, this.resourcesProvider));
            addView(this.actionModeTop);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.actionModeTop.getLayoutParams();
            layoutParams.height = AndroidUtilities.statusBarHeight;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            this.actionModeTop.setLayoutParams(layoutParams);
        }
    }

    public final void updateAttachState$1() {
        boolean z = this.attached && this.resumed;
        if (this.attachState != z) {
            this.attachState = z;
            if (z) {
                this.ellipsizeSpanAnimator.onAttachedToWindow();
            } else {
                this.ellipsizeSpanAnimator.onDetachedFromWindow();
            }
        }
    }

    @Override
    public void updateColors() {
        adaptive_updateColor();
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.glassDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.glassDrawableMenu;
        if (blurredBackgroundDrawable2 != null) {
            blurredBackgroundDrawable2.updateColors();
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable3 = this.glassDrawableBack;
        if (blurredBackgroundDrawable3 != null) {
            blurredBackgroundDrawable3.updateColors();
        }
        ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = this.additionalSubTitleOverlayContainer;
        if (actionBarAnimatedSubtitleOverlayContainer != null) {
            ArrayList arrayList = actionBarAnimatedSubtitleOverlayContainer.titleOverlayAnimator.list.entries;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ListAnimator.Entry entry = (ListAnimator.Entry) obj;
                ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable simpleTextViewReplaceable = (ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable) entry.item;
                int i2 = Theme.key_telegram_color_dialogsLogo;
                Theme.ResourcesProvider resourcesProvider = actionBarAnimatedSubtitleOverlayContainer.resourcesProvider;
                simpleTextViewReplaceable.setTextColor(Theme.getColor(i2, resourcesProvider));
                ((ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable) entry.item).setLinkTextColor(Theme.getColor(i2, resourcesProvider));
            }
        }
    }

    public ActionBar(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.backButtonState = INavigationLayout.BackButtonState.BACK;
        this.titleTextView = new SimpleTextView[2];
        this.occupyStatusBar = true;
        this.addToContainer = true;
        this.interceptTouches = true;
        this.overlayTitleToSet = new Object[3];
        this.castShadows = true;
        this.shadowAlpha = 255;
        this.titleColorToSet = 0;
        this.blurScrimPaint = new Paint();
        this.rectTmp = new Rect();
        this.ellipsizeSpanAnimator = new EllipsizeSpanAnimator(this);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorAvatarContainerWidth = new FactorAnimator(0, this, cubicBezierInterpolator, 380L);
        this.animatorAvatarContainerHasAvatar = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, false);
        this.animatorMenuItemsWidth = new FactorAnimator(0, this, cubicBezierInterpolator, 320L);
        this.animatorHasMenuItems = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, false);
        this.onTop = true;
        this.onTopAnimated = 1.0f;
        this.resourcesProvider = resourcesProvider;
        setOnClickListener(new ActionBar$$ExternalSyntheticLambda8(this, 0));
    }

    public void closeSearchField(boolean z) {
        ActionBarMenu actionBarMenu;
        if (!this.isSearchFieldVisible || (actionBarMenu = this.menu) == null) {
            return;
        }
        actionBarMenu.closeSearchField(z);
    }

    public ActionBarMenu createActionMode(boolean z, String str) {
        if (actionModeIsExist(str)) {
            return this.actionMode;
        }
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            removeView(actionBarMenu);
            this.actionMode = null;
        }
        this.actionModeTag = str;
        ActionBarMenu actionBarMenu2 = new ActionBarMenu(getContext(), this) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                ActionBar actionBar = ActionBar.this;
                if (actionBar.blurredBackground && this.drawBlur && actionBar.actionModeColor != 0) {
                    actionBar.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    actionBar.blurScrimPaint.setColor(actionBar.actionModeColor);
                    canvas2 = canvas;
                    actionBar.contentView.drawBlurRect(canvas2, 0.0f, actionBar.rectTmp, actionBar.blurScrimPaint, true);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                SizeNotifierFrameLayout sizeNotifierFrameLayout = ActionBar.this.contentView;
                if (sizeNotifierFrameLayout != null) {
                    sizeNotifierFrameLayout.blurBehindViews.add(this);
                }
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                SizeNotifierFrameLayout sizeNotifierFrameLayout = ActionBar.this.contentView;
                if (sizeNotifierFrameLayout != null) {
                    sizeNotifierFrameLayout.blurBehindViews.remove(this);
                }
            }

            @Override
            public final void setAlpha(float f) {
                super.setAlpha(f);
                ActionBar actionBar = ActionBar.this;
                actionBar.invalidate();
                if (actionBar.doOnActionModeFactorChanged != null) {
                    actionBar.doOnActionModeFactorChanged.run();
                }
            }

            @Override
            public final void setBackgroundColor(int i) {
                ActionBar actionBar = ActionBar.this;
                actionBar.actionModeColor = i;
                if (actionBar.blurredBackground) {
                    return;
                }
                super.setBackgroundColor(actionBar.actionModeColor);
            }
        };
        this.actionMode = actionBarMenu2;
        actionBarMenu2.setTranslationX(this.glassMode ? -AndroidUtilities.dp(10.0f) : 0.0f);
        this.actionMode.setGlassMode(this.glassMode);
        ActionBarMenu actionBarMenu3 = this.actionMode;
        actionBarMenu3.isActionMode = true;
        actionBarMenu3.setClickable(true);
        if (!this.glassMode) {
            this.actionMode.setBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefault, this.resourcesProvider));
        }
        addView(this.actionMode, indexOfChild(this.backButtonImageView));
        this.actionMode.setPadding(0, this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.actionMode.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.extraHeight;
        layoutParams.gravity = 5;
        this.actionMode.setLayoutParams(layoutParams);
        this.actionMode.setVisibility(4);
        return this.actionMode;
    }

    public boolean isActionModeShowed(String str) {
        if (this.actionMode == null || !this.actionModeVisible) {
            return false;
        }
        String str2 = this.actionModeTag;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public void setAdaptiveBackground(RecyclerView recyclerView, boolean z) {
        setAdaptiveBackground(recyclerView, z, Theme.key_windowBackgroundGray, Theme.key_actionBarDefault);
    }

    public void setTitle(CharSequence charSequence, Drawable drawable) {
        if (charSequence != null && this.titleTextView[0] == null) {
            createTitleTextView(0);
        }
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView != null) {
            simpleTextView.setVisibility((charSequence == null || this.isSearchFieldVisible) ? 4 : 0);
            SimpleTextView simpleTextView2 = this.titleTextView[0];
            this.lastTitle = charSequence;
            simpleTextView2.setText(charSequence);
            if (this.attached) {
                Drawable drawable2 = this.lastRightDrawable;
                if (drawable2 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable2).setParentView(null);
                }
            }
            SimpleTextView simpleTextView3 = this.titleTextView[0];
            this.lastRightDrawable = drawable;
            simpleTextView3.setRightDrawable(drawable);
            if (this.attached) {
                Drawable drawable3 = this.lastRightDrawable;
                if (drawable3 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable3).setParentView(this.titleTextView[0]);
                }
            }
            this.titleTextView[0].setRightDrawableOnClick(this.rightDrawableOnClickListener);
        }
        this.fromBottom = false;
    }

    public void setTitleAnimated(CharSequence charSequence, boolean z, long j, Interpolator interpolator) {
        if (this.titleTextView[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        boolean z2 = this.overlayTitleAnimation && !TextUtils.isEmpty(this.subtitle);
        if (z2) {
            if (this.subtitleTextView.getVisibility() != 0) {
                this.subtitleTextView.setVisibility(0);
                this.subtitleTextView.setAlpha(0.0f);
            }
            OKLCH.m(this.subtitleTextView.animate(), z ? 0.0f : 1.0f, 220L);
        }
        SimpleTextView simpleTextView = this.titleTextView[1];
        if (simpleTextView != null) {
            if (simpleTextView.getParent() != null) {
                ((ViewGroup) this.titleTextView[1].getParent()).removeView(this.titleTextView[1]);
            }
            this.titleTextView[1] = null;
        }
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        simpleTextViewArr[1] = simpleTextViewArr[0];
        simpleTextViewArr[0] = null;
        setTitle(charSequence);
        this.fromBottom = z;
        this.titleTextView[0].setAlpha(0.0f);
        if (!z2) {
            SimpleTextView simpleTextView2 = this.titleTextView[0];
            int iDp = AndroidUtilities.dp(20.0f);
            if (!z) {
                iDp = -iDp;
            }
            simpleTextView2.setTranslationY(iDp);
        }
        ViewPropertyAnimator duration = this.titleTextView[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.titleAnimationRunning = true;
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.titleTextView[1].animate().alpha(0.0f);
        if (!z2) {
            viewPropertyAnimatorAlpha.translationY(z ? -AndroidUtilities.dp(20.0f) : AndroidUtilities.dp(20.0f));
        }
        if (interpolator != null) {
            viewPropertyAnimatorAlpha.setInterpolator(interpolator);
        }
        viewPropertyAnimatorAlpha.setDuration(j).setListener(new AnonymousClass6(this, z2, z)).start();
        requestLayout();
    }

    public void setupGlass(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundColorProvider blurredBackgroundColorProvider, boolean z) {
        setBackground(null);
        setClipChildren(false);
        this.glassMode = true;
        this.glassModeIsForum = z;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundColorProvider);
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(6.0f));
        this.glassDrawable = blurredBackgroundDrawableCreate;
        if (z) {
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(23.0f));
        }
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = blurredBackgroundDrawableViewFactory.create(this, null, false);
        blurredBackgroundDrawableCreate2.setColorProvider(blurredBackgroundColorProvider);
        Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate2, AndroidUtilities.dp(23.0f), 6.0f);
        this.glassDrawableBack = blurredBackgroundDrawableCreate2;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = blurredBackgroundDrawableViewFactory.create(this, null, false);
        blurredBackgroundDrawableCreate3.setColorProvider(blurredBackgroundColorProvider);
        Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate3, AndroidUtilities.dp(23.0f), 6.0f);
        this.glassDrawableMenu = blurredBackgroundDrawableCreate3;
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.menu.setGlassMode(true);
        }
        ActionBarMenu actionBarMenu2 = this.actionMode;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.actionMode.setGlassMode(true);
        }
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public void showActionMode(boolean z) {
        showActionMode(z, null, null, null, null, null, 0);
    }

    public void setAdaptiveBackground(RecyclerView recyclerView, boolean z, int i, int i2) {
        this.adaptive_topColorKey = i;
        this.adaptive_lowerColorKey = i2;
        ClickHelper$$ExternalSyntheticLambda0 clickHelper$$ExternalSyntheticLambda0 = new ClickHelper$$ExternalSyntheticLambda0(22, this, recyclerView);
        recyclerView.addOnScrollListener(new StarGiftSheet.AnonymousClass8(clickHelper$$ExternalSyntheticLambda0, 2));
        this.adaptiveBackgroundHideTitle = z;
        if (this.adaptiveBackground) {
            clickHelper$$ExternalSyntheticLambda0.run();
            return;
        }
        this.adaptiveBackground = true;
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        this.onTop = !zCanScrollVertically;
        this.onTopAnimated = !zCanScrollVertically ? 1.0f : 0.0f;
        adaptive_updateColor();
    }

    public void showActionMode(boolean z, View view, View view2, View[] viewArr, boolean[] zArr, View view3, int i) {
        int i2 = 2;
        if (this.actionMode == null || this.actionModeVisible) {
            return;
        }
        this.actionModeVisible = true;
        checkMenuItemsWidth();
        if (z) {
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.actionMode, (Property<ActionBarMenu, Float>) property, 0.0f, 1.0f));
            if (viewArr != null) {
                for (View view4 : viewArr) {
                    if (view4 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view4, (Property<View, Float>) property, 1.0f, 0.0f));
                    }
                }
            }
            if (view2 != null) {
                arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, 1.0f));
            }
            Property property2 = View.TRANSLATION_Y;
            if (view3 != null) {
                arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property2, i));
                this.actionModeTranslationView = view3;
            }
            this.actionModeExtraView = view;
            this.actionModeShowingView = view2;
            this.actionModeHidingViews = viewArr;
            if (view != null) {
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 0.0f));
            }
            if (this.actionModeColor == 0) {
                if (!this.isSearchFieldVisible) {
                    SimpleTextView simpleTextView = this.titleTextView[0];
                    if (simpleTextView != null) {
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, 0.0f));
                    }
                    if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.subtitleTextView, (Property<SimpleTextView, Float>) property, 0.0f));
                    }
                }
                ActionBarMenu actionBarMenu = this.menu;
                if (actionBarMenu != null) {
                    arrayList.add(ObjectAnimator.ofFloat(actionBarMenu, (Property<ActionBarMenu, Float>) property, 0.0f));
                }
            }
            int i3 = this.actionModeColor;
            if (i3 == 0) {
                i3 = this.actionBarColor;
            }
            if (i3 == 0 || this.glassMode) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (ColorUtils.calculateLuminance(i3) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
            AnimatorSet animatorSet = this.actionModeAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionModeAnimation = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.backgroundUpdateListener != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ActionBar$$ExternalSyntheticLambda3(this, 4));
                this.actionModeAnimation.playTogether(valueAnimatorOfFloat);
            }
            this.actionModeAnimation.setDuration(200L);
            this.actionModeAnimation.addListener(new RichEditor.AnonymousClass1(i2, this, zArr));
            this.actionModeAnimation.start();
            ImageView imageView = this.backButtonImageView;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof BackDrawable) {
                    ((BackDrawable) drawable).setRotation(1.0f, true);
                }
                this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsActionModeBackgroundColor, 1, -1));
                return;
            }
            return;
        }
        this.actionMode.setAlpha(1.0f);
        if (viewArr != null) {
            for (View view5 : viewArr) {
                if (view5 != null) {
                    view5.setAlpha(0.0f);
                }
            }
        }
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        if (view3 != null) {
            view3.setTranslationY(i);
            this.actionModeTranslationView = view3;
        }
        this.actionModeExtraView = view;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        this.actionModeShowingView = view2;
        this.actionModeHidingViews = viewArr;
        int i4 = this.actionModeColor;
        if (i4 == 0) {
            i4 = this.actionBarColor;
        }
        if (i4 == 0 || this.glassMode) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (ColorUtils.calculateLuminance(i4) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        this.actionMode.setVisibility(0);
        SimpleTextView simpleTextView2 = this.titleTextView[0];
        if (simpleTextView2 != null) {
            simpleTextView2.setVisibility(4);
        }
        if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
            this.subtitleTextView.setVisibility(4);
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setVisibility(4);
        }
        if (this.actionModeHidingViews != null) {
            int i5 = 0;
            while (true) {
                View[] viewArr2 = this.actionModeHidingViews;
                if (i5 >= viewArr2.length) {
                    break;
                }
                View view6 = viewArr2[i5];
                if (view6 != null && (zArr == null || i5 >= zArr.length || zArr[i5])) {
                    view6.setVisibility(4);
                }
                i5++;
            }
        }
        ImageView imageView2 = this.backButtonImageView;
        if (imageView2 != null) {
            Drawable drawable2 = imageView2.getDrawable();
            if (drawable2 instanceof BackDrawable) {
                ((BackDrawable) drawable2).setRotation(1.0f, false);
            }
            this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsActionModeBackgroundColor, 1, -1));
        }
    }

    public void openSearchField(boolean z) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu == null) {
            return;
        }
        boolean z2 = this.isSearchFieldVisible;
        int childCount = actionBarMenu.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = actionBarMenu.getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField()) {
                    if (!z2) {
                        actionBarMenu.parentActionBar.onSearchFieldVisibilityChanged(actionBarMenuItem.toggleSearch(false));
                    }
                    actionBarMenuItem.setSearchFieldText("", z);
                    actionBarMenuItem.getSearchField().setSelection(0);
                    return;
                }
            }
        }
    }

    public void setAdaptiveBackground(SectionsScrollView sectionsScrollView) {
        setAdaptiveBackground(sectionsScrollView, Theme.key_windowBackgroundGray, Theme.key_actionBarDefault);
    }

    public void setAdaptiveBackground(SectionsScrollView sectionsScrollView, int i, int i2) {
        this.adaptive_topColorKey = i;
        this.adaptive_lowerColorKey = i2;
        adaptive_updateColor();
        ClickHelper$$ExternalSyntheticLambda0 clickHelper$$ExternalSyntheticLambda0 = new ClickHelper$$ExternalSyntheticLambda0(23, this, sectionsScrollView);
        sectionsScrollView.onScroll(clickHelper$$ExternalSyntheticLambda0);
        if (this.adaptiveBackground) {
            clickHelper$$ExternalSyntheticLambda0.run();
            return;
        }
        this.adaptiveBackground = true;
        boolean zCanScrollVertically = sectionsScrollView.canScrollVertically(-1);
        this.onTop = !zCanScrollVertically;
        this.onTopAnimated = !zCanScrollVertically ? 1.0f : 0.0f;
        adaptive_updateColor();
    }

    public final class AnonymousClass8 extends FrameLayout {
        public final int $r8$classId;

        public AnonymousClass8(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 6:
                    return super.drawChild(canvas, view, j);
                case 7:
                    return false;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public boolean hasOverlappingRendering() {
            switch (this.$r8$classId) {
                case 5:
                    return false;
                default:
                    return super.hasOverlappingRendering();
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                    break;
                case 1:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
                    break;
                case 2:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
                    break;
                case 3:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), AndroidUtilities.dp(60.0f)), View.MeasureSpec.getMode(i2)));
                    break;
                case 4:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        private final void onLayout$org$telegram$ui$ActionBar$ActionBar$8(boolean z, int i, int i2, int i3, int i4) {
        }
    }
}
