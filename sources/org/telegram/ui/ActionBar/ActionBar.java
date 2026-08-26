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
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.opengl.GLSurfaceView;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
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
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.AvatarPreviewer;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FireworksEffect;
import org.telegram.ui.Components.FireworksEffect.Particle;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SnowflakesEffect;
import org.telegram.ui.Components.Tooltip;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.voip.EndCloseLayout;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity$9$$ExternalSyntheticLambda1;

public class ActionBar extends FrameLayout implements FactorAnimator.Target, Theme.Colorable {
    public int actionBarColor;
    public ActionBarMenuOnItemClick actionBarMenuOnItemClick;
    public AnonymousClass1 actionMode;
    public AnimatorSet actionModeAnimation;
    public int actionModeColor;
    public View[] actionModeHidingViews;
    public String actionModeTag;
    public View actionModeTop;
    public boolean actionModeVisible;
    public boolean adaptiveBackground;
    public boolean adaptiveBackgroundHideTitle;
    public ValueAnimator adaptive_animator;
    public int adaptive_lowerColorKey;
    public int adaptive_topColorKey;
    public boolean addToContainer;
    public AnonymousClass9 additionalSubTitleOverlayContainer;
    public SimpleTextView additionalSubtitleTextView;
    public int additionalTextLeft;
    public boolean allowOverlayTitle;
    public final BoolAnimator animatorAvatarContainerHasAvatar;
    public final FactorAnimator animatorAvatarContainerWidth;
    public final BoolAnimator animatorHasMenuItems;
    public final FactorAnimator animatorMenuItemsWidth;
    public boolean attachState;
    public boolean attached;
    public BackupImageView avatarSearchImageView;
    public Drawable backButtonDrawable;
    public ImageView backButtonImageView;
    public final INavigationLayout.BackButtonState backButtonState;
    public ProfileActivity$9$$ExternalSyntheticLambda1 backgroundUpdateListener;
    public final Paint blurScrimPaint;
    public boolean blurredBackground;
    public boolean castShadows;
    public boolean centerScale;
    public ChatAvatarContainer chatAvatarContainer;
    public boolean clipContent;
    public SizeNotifierFrameLayout contentView;
    public boolean doNotDrawChild;
    public boolean doNotDrawGlassMenu;
    public Runnable doOnActionModeFactorChanged;
    public boolean drawBackButton;
    public final AvatarPreviewer ellipsizeSpanAnimator;
    public int extraHeight;
    public FireworksEffect fireworksEffect;
    public Paint.FontMetricsInt fontMetricsInt;
    public boolean forceSkipTouches;
    public int forcedMenuMinWidth;
    public int forcedMenuWidth;
    public boolean fromBottom;
    public BlurredBackgroundDrawable glassDrawable;
    public BlurredBackgroundDrawable glassDrawableBack;
    public BlurredBackgroundDrawable glassDrawableMenu;
    public boolean glassMode;
    public boolean glassModeIsForum;
    public boolean glassOnlyBack;
    public boolean hasForcedMenuMinWidth;
    public boolean hasForcedMenuWidth;
    public boolean ignoreLayoutRequest;
    public View.OnTouchListener interceptTouchEventListener;
    public boolean interceptTouches;
    public boolean isAnimationsAllowed;
    public boolean isMenuOffsetSuppressed;
    public boolean isSearchFieldVisible;
    public int itemsActionModeBackgroundColor;
    public int itemsActionModeColor;
    public int itemsBackgroundColor;
    public int itemsColor;
    public String lastOverlayTitle;
    public AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable lastRightDrawable;
    public Runnable lastRunnable;
    public CharSequence lastTitle;
    public boolean mAlwaysApplyColorFilterToBackButton;
    public boolean manualStart;
    public ActionBarMenu menu;
    public boolean menuOccupyBack;
    public boolean occupyStatusBar;
    public boolean onTop;
    public float onTopAnimated;
    public boolean overlayTitleAnimation;
    public boolean overlayTitleAnimationInProgress;
    public final Object[] overlayTitleToSet;
    public BaseFragment parentFragment;
    public int prevWidth;
    public Rect rect;
    public final Rect rectTmp;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean resumed;
    public View.OnClickListener rightDrawableOnClickListener;
    public float searchFactor;
    public float searchFieldVisibleAlpha;
    public AnimatorSet searchVisibleAnimator;
    public int shadowAlpha;
    public SnowflakesEffect snowflakesEffect;
    public CharSequence subtitle;
    public SimpleTextView subtitleTextView;
    public boolean supportsHolidayImage;
    public Runnable titleActionRunnable;
    public boolean titleAnimationRunning;
    public int titleColorToSet;
    public boolean titleOverlayShown;
    public int titleRightMargin;
    public final SimpleTextView[] titleTextView;
    public PhotoViewer.AnonymousClass19 titlesContainer;
    public boolean useContainerForTitles;

    public final class AnonymousClass1 extends ActionBarMenu {
        public AnonymousClass1(Context context, ActionBar actionBar) {
            super(context, actionBar);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            ActionBar actionBar = ActionBar.this;
            if (actionBar.blurredBackground && this.drawBlur && actionBar.actionModeColor != 0) {
                actionBar.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Paint paint = actionBar.blurScrimPaint;
                paint.setColor(actionBar.actionModeColor);
                canvas2 = canvas;
                actionBar.contentView.drawBlurRect(canvas2, 0.0f, actionBar.rectTmp, paint, true);
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
            Runnable runnable = actionBar.doOnActionModeFactorChanged;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public final void setBackgroundColor(int i) {
            ActionBar actionBar = ActionBar.this;
            actionBar.actionModeColor = i;
            if (actionBar.blurredBackground) {
                return;
            }
            super.setBackgroundColor(i);
        }
    }

    public final class AnonymousClass3 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ActionBar this$0;

        public AnonymousClass3(ActionBar actionBar, int i) {
            this.$r8$classId = i;
            this.this$0 = actionBar;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ActionBar actionBar = this.this$0;
                    AnimatorSet animatorSet = actionBar.actionModeAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
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
                    AnimatorSet animatorSet = actionBar.actionModeAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        actionBar.actionModeAnimation = null;
                        actionBar.actionMode.setVisibility(4);
                        break;
                    }
                    break;
                default:
                    ActionBar actionBar2 = this.this$0;
                    SimpleTextView simpleTextView = actionBar2.titleTextView[1];
                    if (simpleTextView != null && simpleTextView.getParent() != null) {
                        ((ViewGroup) actionBar2.titleTextView[1].getParent()).removeView(actionBar2.titleTextView[1]);
                    }
                    actionBar2.ellipsizeSpanAnimator.removeView(actionBar2.titleTextView[1]);
                    actionBar2.titleTextView[1] = null;
                    actionBar2.overlayTitleAnimationInProgress = false;
                    Object[] objArr = actionBar2.overlayTitleToSet;
                    actionBar2.setTitleOverlayText((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) actionBar2.overlayTitleToSet[2]);
                    break;
            }
        }
    }

    public final class AnonymousClass4 extends AnimatorListenerAdapter {
        public final int $r8$classId = 0;
        public final KeyEvent.Callback this$0;
        public final boolean val$ignoreTitles;
        public final Object val$viewsToHide;
        public final boolean val$visible;

        public AnonymousClass4(ActionBar actionBar, ArrayList arrayList, boolean z, boolean z2) {
            this.this$0 = actionBar;
            this.val$viewsToHide = arrayList;
            this.val$visible = z;
            this.val$ignoreTitles = z2;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            ChatActivityEnterView.AnonymousClass50 anonymousClass50;
            ChatMessageCell chatMessageCell;
            ViewGroup viewGroup;
            MessageSendPreview.AnonymousClass13 anonymousClass13;
            switch (this.$r8$classId) {
                case 0:
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) this.val$viewsToHide;
                        int size = arrayList.size();
                        boolean z = this.val$visible;
                        if (i >= size) {
                            ActionBar actionBar = (ActionBar) this.this$0;
                            if (z && !this.val$ignoreTitles) {
                                SimpleTextView simpleTextView = actionBar.titleTextView[0];
                                if (simpleTextView != null) {
                                    simpleTextView.setVisibility(8);
                                }
                                SimpleTextView simpleTextView2 = actionBar.titleTextView[1];
                                if (simpleTextView2 != null) {
                                    simpleTextView2.setVisibility(8);
                                }
                            }
                            BackupImageView backupImageView = actionBar.avatarSearchImageView;
                            if (backupImageView != null && !z) {
                                backupImageView.setVisibility(8);
                                break;
                            }
                        } else {
                            View view = (View) arrayList.get(i);
                            if (z) {
                                view.setVisibility(4);
                                view.setAlpha(0.0f);
                            } else {
                                view.setAlpha(1.0f);
                            }
                            i++;
                        }
                    }
                    break;
                default:
                    boolean z2 = this.val$visible;
                    float f = z2 ? 1.0f : 0.0f;
                    MessageSendPreview messageSendPreview = (MessageSendPreview) this.this$0;
                    messageSendPreview.openProgress = f;
                    messageSendPreview.firstOpenFrame = false;
                    messageSendPreview.firstOpenFrame2 = false;
                    messageSendPreview.effectsView.setAlpha(f);
                    if (z2) {
                        messageSendPreview.openInProgress = false;
                        messageSendPreview.closing = false;
                    }
                    ChatActivityEnterView.AnonymousClass50 anonymousClass51 = messageSendPreview.editText;
                    if (anonymousClass51 != null) {
                        anonymousClass51.setAlpha(1.0f);
                    }
                    ChatMessageCell chatMessageCell2 = messageSendPreview.destCell;
                    if (chatMessageCell2 != null) {
                        chatMessageCell2.setVisibility(0);
                    }
                    ChatActivityEnterView.SendButton sendButton = messageSendPreview.anchorSendButton;
                    if (sendButton != null && !messageSendPreview.sent) {
                        sendButton.setAlpha(1.0f);
                    }
                    if (!z2 && (anonymousClass13 = messageSendPreview.sendButton) != null) {
                        anonymousClass13.setAlpha(0.0f);
                    }
                    if (!this.val$ignoreTitles && (viewGroup = messageSendPreview.optionsView) != null) {
                        viewGroup.setAlpha(messageSendPreview.openProgress);
                    }
                    MessageSendPreview.AnonymousClass4 anonymousClass4 = messageSendPreview.chatListView;
                    anonymousClass4.invalidate();
                    anonymousClass4.setAlpha(messageSendPreview.openProgress);
                    messageSendPreview.windowView.invalidate();
                    messageSendPreview.containerView.invalidate();
                    Runnable runnable = (Runnable) this.val$viewsToHide;
                    if (runnable != null) {
                        if (!z2 && (chatMessageCell = messageSendPreview.destCell) != null && chatMessageCell.isAttachedToWindow()) {
                            messageSendPreview.destCell.post(runnable);
                        } else if (z2 || (anonymousClass50 = messageSendPreview.editText) == null || !anonymousClass50.isAttachedToWindow()) {
                            AndroidUtilities.runOnUIThread(runnable);
                        } else {
                            messageSendPreview.editText.post(runnable);
                        }
                    }
                    break;
            }
        }

        public AnonymousClass4(MessageSendPreview messageSendPreview, boolean z, boolean z2, Runnable runnable) {
            this.this$0 = messageSendPreview;
            this.val$visible = z;
            this.val$ignoreTitles = z2;
            this.val$viewsToHide = runnable;
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
                            View childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(i);
                            if (!(childAt instanceof ActionBarPopupWindow.GapView)) {
                                childAt.setTranslationY(0.0f);
                                childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                            }
                        }
                        break;
                    case 2:
                        AdjustPanLayoutHelper adjustPanLayoutHelper = (AdjustPanLayoutHelper) this.val$startValues;
                        adjustPanLayoutHelper.getClass();
                        adjustPanLayoutHelper.stopTransition();
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
            final int i = 1;
            final int i2 = 0;
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
                    animatorSet.addListener(new AnonymousClass1(transitionValues, i2));
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
                    animatorSet2.playTogether(valueAnimator);
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(num3.intValue(), num4.intValue());
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
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
                    animatorSet2.addListener(new Tooltip.AnonymousClass1(transitionValues, 23));
                    return animatorSet2;
            }
        }
    }

    public final class AnonymousClass9 extends ActionBarAnimatedSubtitleOverlayContainer {
        public final int $r8$classId = 0;
        public final FrameLayout this$0;

        public AnonymousClass9(ActionBar actionBar, Context context, Theme.ResourcesProvider resourcesProvider, AvatarPreviewer avatarPreviewer) {
            super(context, resourcesProvider, avatarPreviewer);
            this.this$0 = actionBar;
        }

        @Override
        public final void onItemChanged$1(ReplaceAnimator replaceAnimator) {
            switch (this.$r8$classId) {
                case 0:
                    super.onItemChanged$1(replaceAnimator);
                    float totalVisibility = getTotalVisibility();
                    PhotoViewer.AnonymousClass19 anonymousClass19 = ((ActionBar) this.this$0).titlesContainer;
                    if (anonymousClass19 != null) {
                        anonymousClass19.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    }
                    break;
                default:
                    super.onItemChanged$1(replaceAnimator);
                    ((DialogsActivity.AnonymousClass25) this.this$0).invalidate();
                    break;
            }
        }

        public AnonymousClass9(DialogsActivity.AnonymousClass25 anonymousClass25, Context context, AvatarPreviewer avatarPreviewer) {
            super(context, null, avatarPreviewer);
            this.this$0 = anonymousClass25;
        }
    }

    public abstract class ActionBarMenuOnItemClick {
        public boolean canOpenMenu() {
            return true;
        }

        public abstract void onItemClick(int i);
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
        this.ellipsizeSpanAnimator = new AvatarPreviewer(this);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorAvatarContainerWidth = new FactorAnimator(0, this, cubicBezierInterpolator, 380L);
        this.animatorAvatarContainerHasAvatar = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, false);
        this.animatorMenuItemsWidth = new FactorAnimator(0, this, cubicBezierInterpolator, 320L);
        this.animatorHasMenuItems = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, false);
        this.onTop = true;
        this.onTopAnimated = 1.0f;
        this.resourcesProvider = resourcesProvider;
        setOnClickListener(new ActionBar$$ExternalSyntheticLambda2(this, 0));
    }

    public static View findChildUnder(ActionBar actionBar, float f, float f2, View view) {
        for (int childCount = actionBar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = actionBar.getChildAt(childCount);
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

    public final boolean actionModeIsExist(String str) {
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
                PhotoViewer.AnonymousClass19 anonymousClass19 = this.titlesContainer;
                if (anonymousClass19 != null) {
                    anonymousClass19.setAlpha(1.0f - this.onTopAnimated);
                } else {
                    SimpleTextView simpleTextView = this.titleTextView[0];
                    if (simpleTextView != null) {
                        simpleTextView.setAlpha(1.0f - this.onTopAnimated);
                    }
                }
            }
            float f = this.onTopAnimated;
            int i = this.adaptive_lowerColorKey;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int color = i == -1 ? 0 : Theme.getColor(i, resourcesProvider);
            int i2 = this.adaptive_topColorKey;
            int color2 = i2 == -1 ? 0 : Theme.getColor(i2, resourcesProvider);
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

    public final void beginDelayedTransition$1() {
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

    public final void checkAvatarContainerWidth(boolean z) {
        ChatAvatarContainer chatAvatarContainer = this.chatAvatarContainer;
        if (chatAvatarContainer == null) {
            return;
        }
        ChatAvatarContainer.AnonymousClass1 anonymousClass1 = chatAvatarContainer.avatarImageView;
        boolean z2 = anonymousClass1 != null && anonymousClass1.getVisibility() == 0;
        int iMin = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), this.chatAvatarContainer.getVisualWidth());
        FactorAnimator factorAnimator = this.animatorAvatarContainerWidth;
        if (z) {
            float f = iMin;
            if ((factorAnimator.isAnimating ? factorAnimator.toFactor : factorAnimator.factor) != f) {
                factorAnimator.animateTo(f);
            }
        } else {
            factorAnimator.forceFactor(iMin);
        }
        this.animatorAvatarContainerHasAvatar.setValue(z2, z);
    }

    public final void checkMenuItemsWidth() {
        ActionBarMenu actionBarMenu = this.menu;
        int iMax = Math.max(0, actionBarMenu != null ? (actionBarMenu.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        AnonymousClass1 anonymousClass1 = this.actionMode;
        int iMax2 = Math.max(0, anonymousClass1 != null ? (anonymousClass1.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
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

    public void closeSearchField(boolean z) {
        ActionBarMenu actionBarMenu;
        if (!this.isSearchFieldVisible || (actionBarMenu = this.menu) == null) {
            return;
        }
        actionBarMenu.closeSearchField(z);
    }

    public final AnonymousClass1 createActionMode() {
        return createActionMode(null);
    }

    public final void createAdditionalSubtitleTextView() {
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
        this.backButtonImageView.setOnClickListener(new ActionBar$$ExternalSyntheticLambda2(this, 1));
        this.backButtonImageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public final ActionBarMenu createMenu() {
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
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        simpleTextViewArr[i] = simpleTextView;
        simpleTextView.setGravity(19);
        int i2 = this.titleColorToSet;
        if (i2 != 0) {
            simpleTextViewArr[i].setTextColor(i2);
        } else {
            simpleTextViewArr[i].setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle, this.resourcesProvider));
        }
        SimpleTextView simpleTextView2 = simpleTextViewArr[i];
        simpleTextView2.setEmojiColor(simpleTextView2.getTextColor());
        simpleTextViewArr[i].setTypeface(AndroidUtilities.bold());
        simpleTextViewArr[i].setDrawablePadding(AndroidUtilities.dp(4.0f));
        simpleTextViewArr[i].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        simpleTextViewArr[i].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.useContainerForTitles) {
            this.titlesContainer.addView(simpleTextViewArr[i], 0, LayoutHelper.createFrame(-2, -2, 51));
        } else {
            addView(simpleTextViewArr[i], 0, LayoutHelper.createFrame(-2, -2, 51));
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
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.glassDrawable;
        BoolAnimator boolAnimator = this.animatorHasMenuItems;
        if (blurredBackgroundDrawable == null || this.glassOnlyBack) {
            f = 1.0f;
        } else {
            if (this.hasForcedMenuWidth || this.hasForcedMenuMinWidth) {
                f = 1.0f;
                i = iMax > 0 ? iDp : 0;
            } else {
                f = 1.0f;
                i = (int) (iDp * boolAnimator.floatValue);
            }
            int i4 = i + iMax;
            int i5 = iDp + iDp2;
            int iMax2 = Math.max(i4, i5);
            ChatAvatarContainer chatAvatarContainer = this.chatAvatarContainer;
            BoolAnimator boolAnimator2 = this.animatorAvatarContainerHasAvatar;
            int iLerp = AndroidUtilities.lerp(i4, iMax2, chatAvatarContainer == null ? 0.0f : f - boolAnimator2.floatValue);
            int iLerp2 = AndroidUtilities.lerp(z ? i5 : 0, i5, this.chatAvatarContainer == null ? 0.0f : f - boolAnimator2.floatValue);
            int width = getWidth() - iLerp;
            int i6 = width - iLerp2;
            if (this.chatAvatarContainer != null) {
                int iLerp3 = AndroidUtilities.lerp(Math.min(i6, ((int) this.animatorAvatarContainerWidth.factor) + i2), i6, Math.max(this.searchFactor, actionModeFactor));
                iLerp2 = ((width + iLerp2) - iLerp3) / 2;
                width = iLerp2 + iLerp3;
                float fDp = AndroidUtilities.dp(3.0f) + ((iLerp2 - ((ViewGroup.MarginLayoutParams) this.chatAvatarContainer.getLayoutParams()).leftMargin) - this.chatAvatarContainer.getLeftPadding()) + iDp;
                this.chatAvatarContainer.setTranslationX(fDp);
                ChatAvatarContainer chatAvatarContainer2 = this.chatAvatarContainer;
                chatAvatarContainer2.setPivotX((chatAvatarContainer2.getMeasuredWidth() / 2.0f) - fDp);
            }
            this.glassDrawable.setBounds(iLerp2, height, width, i3);
            this.glassDrawable.draw(canvas);
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.glassDrawableBack;
        if (blurredBackgroundDrawable2 != null && z) {
            blurredBackgroundDrawable2.setBounds(0, height, iDp2 + i2, i3);
            this.glassDrawableBack.draw(canvas);
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable3 = this.glassDrawableMenu;
        if (blurredBackgroundDrawable3 != null && iMax > 0 && !this.glassOnlyBack && !this.doNotDrawGlassMenu) {
            blurredBackgroundDrawable3.setBounds((getWidth() - Math.max(iDp2, iMax)) - i2, height, getWidth(), i3);
            this.glassDrawableMenu.setAlpha(this.hasForcedMenuWidth ? 255 : (int) (boolAnimator.floatValue * 255.0f));
            this.glassDrawableMenu.draw(canvas);
        }
        if (this.blurredBackground && this.actionBarColor != 0) {
            this.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Paint paint = this.blurScrimPaint;
            paint.setColor(this.actionBarColor);
            if (this.adaptiveBackground) {
                SizeNotifierFrameLayout sizeNotifierFrameLayout = this.contentView;
                float y = getY();
                float f2 = f - this.onTopAnimated;
                sizeNotifierFrameLayout.getClass();
                sizeNotifierFrameLayout.drawBlurRect(canvas, y, this.rectTmp, paint, true, AndroidUtilities.lerp(255, Color.alpha(Theme.getColor((SizeNotifierFrameLayout.DRAW_USING_RENDERNODE() && SharedConfig.getDevicePerformanceClass() == 2) ? Theme.key_chat_BlurAlpha : Theme.key_chat_BlurAlphaSlow, sizeNotifierFrameLayout.getResourceProvider())), f2));
            } else {
                this.contentView.drawBlurRect(canvas, getY(), this.rectTmp, paint, true);
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
        boolean z;
        Drawable currentHolidayDrawable;
        float f;
        int i;
        FireworksEffect.Particle particle;
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
        if (!this.supportsHolidayImage || this.titleOverlayShown || LocaleController.isRTL) {
            z = zDrawChild;
        } else {
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if ((view == simpleTextViewArr[0] || view == simpleTextViewArr[1] || (view == this.titlesContainer && this.useContainerForTitles)) && (currentHolidayDrawable = Theme.getCurrentHolidayDrawable()) != null) {
                SimpleTextView simpleTextView = view == this.titlesContainer ? simpleTextViewArr[0] : (SimpleTextView) view;
                if (simpleTextView != null && simpleTextView.getVisibility() == 0 && (simpleTextView.getText() instanceof String)) {
                    TextPaint textPaint = simpleTextView.getTextPaint();
                    textPaint.getFontMetricsInt(this.fontMetricsInt);
                    textPaint.getTextBounds((String) simpleTextView.getText(), 0, 1, this.rect);
                    int iWidth = ((this.rect.width() - (currentHolidayDrawable.getIntrinsicWidth() + Theme.dialogs_holidayDrawableOffsetX)) / 2) + simpleTextView.getTextStartX() + Theme.dialogs_holidayDrawableOffsetX;
                    f = 255.0f;
                    int textStartY = simpleTextView.getTextStartY() + Theme.dialogs_holidayDrawableOffsetY + ((int) Math.ceil((simpleTextView.getTextHeight() - this.rect.height()) / 2.0f)) + ((int) ((1.0f - this.titlesContainer.getScaleY()) * AndroidUtilities.dp(8.0f)));
                    currentHolidayDrawable.setBounds(iWidth, textStartY - currentHolidayDrawable.getIntrinsicHeight(), currentHolidayDrawable.getIntrinsicWidth() + iWidth, textStartY);
                    currentHolidayDrawable.setAlpha((int) (simpleTextView.getAlpha() * this.titlesContainer.getAlpha() * 255.0f));
                    currentHolidayDrawable.draw(canvas);
                    if (this.overlayTitleAnimationInProgress) {
                        view.invalidate();
                        invalidate();
                    }
                } else {
                    f = 255.0f;
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
                    snowflakesEffect.onDraw(canvas, this);
                } else {
                    FireworksEffect fireworksEffect = this.fireworksEffect;
                    if (fireworksEffect != null && canvas != null) {
                        ArrayList arrayList = fireworksEffect.particles;
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            FireworksEffect.Particle particle2 = (FireworksEffect.Particle) arrayList.get(i2);
                            particle2.getClass();
                            FireworksEffect fireworksEffect2 = FireworksEffect.this;
                            fireworksEffect2.particlePaint.setColor(particle2.color);
                            Paint paint = fireworksEffect2.particlePaint;
                            paint.setStrokeWidth(AndroidUtilities.dp(1.5f) * particle2.scale);
                            paint.setAlpha((int) (particle2.alpha * f));
                            canvas.drawPoint(particle2.x, particle2.y, paint);
                        }
                        boolean zNextBoolean = Utilities.random.nextBoolean();
                        ArrayList arrayList2 = fireworksEffect.freeParticles;
                        if (zNextBoolean && arrayList.size() + 8 < 150) {
                            int i3 = AndroidUtilities.statusBarHeight;
                            float fNextFloat = Utilities.random.nextFloat() * getMeasuredWidth();
                            float fNextFloat2 = (Utilities.random.nextFloat() * RichMessageLayout$$ExternalSyntheticOutline2.m(getMeasuredHeight(), 20.0f, i3)) + i3;
                            int iNextInt = Utilities.random.nextInt(4);
                            if (iNextInt == 0) {
                                i = -13357350;
                            } else if (iNextInt == 1) {
                                i = -843755;
                            } else if (iNextInt != 2) {
                                i = iNextInt != 3 ? -5752 : -15088582;
                            } else {
                                i = -207021;
                            }
                            int i4 = 0;
                            while (i4 < 8) {
                                boolean z2 = zDrawChild;
                                double dNextInt = ((double) (Utilities.random.nextInt(270) - 225)) * 0.017453292519943295d;
                                int i5 = i;
                                float fCos = (float) Math.cos(dNextInt);
                                float fSin = (float) Math.sin(dNextInt);
                                if (arrayList2.isEmpty()) {
                                    particle = fireworksEffect.new Particle();
                                } else {
                                    particle = (FireworksEffect.Particle) arrayList2.get(0);
                                    arrayList2.remove(0);
                                }
                                particle.x = fNextFloat;
                                particle.y = fNextFloat2;
                                particle.vx = fCos * 1.5f;
                                particle.vy = fSin;
                                i = i5;
                                particle.color = i;
                                particle.alpha = 1.0f;
                                particle.currentTime = 0.0f;
                                particle.scale = Math.max(1.0f, Utilities.random.nextFloat() * 1.5f);
                                particle.lifeTime = Utilities.random.nextInt(1000) + 1000;
                                particle.velocity = (Utilities.random.nextFloat() * 4.0f) + 20.0f;
                                arrayList.add(particle);
                                i4++;
                                zDrawChild = z2;
                            }
                        }
                        z = zDrawChild;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long jMin = Math.min(17L, jCurrentTimeMillis - fireworksEffect.lastAnimationTime);
                        int size2 = arrayList.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            FireworksEffect.Particle particle3 = (FireworksEffect.Particle) arrayList.get(i6);
                            float f2 = particle3.currentTime;
                            float f3 = particle3.lifeTime;
                            if (f2 >= f3) {
                                if (arrayList2.size() < 40) {
                                    arrayList2.add(particle3);
                                }
                                arrayList.remove(i6);
                                i6--;
                                size2--;
                            } else {
                                particle3.alpha = 1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(f2 / f3);
                                float f4 = particle3.x;
                                float f5 = particle3.vx;
                                float f6 = particle3.velocity;
                                float f7 = jMin;
                                particle3.x = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(f5 * f6, f7, 500.0f, f4);
                                float f8 = particle3.y;
                                float f9 = particle3.vy;
                                particle3.y = (((f6 * f9) * f7) / 500.0f) + f8;
                                particle3.vy = (f7 / 100.0f) + f9;
                                particle3.currentTime += f7;
                            }
                            i6++;
                        }
                        fireworksEffect.lastAnimationTime = jCurrentTimeMillis;
                        invalidate();
                    }
                }
                z = zDrawChild;
            } else {
                z = zDrawChild;
            }
        }
        if (zShouldClipChild) {
            canvas.restore();
        }
        return z;
    }

    public ActionBarMenuOnItemClick getActionBarMenuOnItemClick() {
        return this.actionBarMenuOnItemClick;
    }

    public ActionBarMenu getActionMode() {
        return this.actionMode;
    }

    public float getActionModeFactor() {
        AnonymousClass1 anonymousClass1 = this.actionMode;
        if (anonymousClass1 != null) {
            return anonymousClass1.getAlpha();
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
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void hideActionMode$1() {
        int i = 0;
        int i2 = 1;
        AnonymousClass1 anonymousClass1 = this.actionMode;
        if (anonymousClass1 == null || !this.actionModeVisible) {
            return;
        }
        int childCount = anonymousClass1.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = anonymousClass1.getChildAt(i3);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).closeSubMenu();
            }
        }
        this.actionModeVisible = false;
        checkMenuItemsWidth();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.actionMode, (Property<AnonymousClass1, Float>) property, 0.0f));
        if (this.actionModeHidingViews != null) {
            int i4 = 0;
            while (true) {
                View[] viewArr = this.actionModeHidingViews;
                if (i4 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i4];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.actionModeHidingViews[i4], (Property<View, Float>) property, 1.0f));
                }
                i4++;
            }
        }
        boolean z = this.isSearchFieldVisible;
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (!z) {
            SimpleTextView simpleTextView = simpleTextViewArr[0];
            if (simpleTextView != null) {
                arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, 1.0f));
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                arrayList.add(ObjectAnimator.ofFloat(this.subtitleTextView, (Property<SimpleTextView, Float>) property, 1.0f));
            }
        }
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenu, (Property<ActionBarMenu, Float>) property, 1.0f));
        }
        int i5 = this.actionBarColor;
        if (i5 == 0 || this.glassMode) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (ColorUtils.calculateLuminance(i5) < 0.699999988079071d) {
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
            valueAnimatorOfFloat.addUpdateListener(new ActionBar$$ExternalSyntheticLambda0(this, i2));
            this.actionModeAnimation.playTogether(valueAnimatorOfFloat);
        }
        this.actionModeAnimation.setDuration(200L);
        this.actionModeAnimation.addListener(new AnonymousClass3(this, i));
        this.actionModeAnimation.start();
        if (!this.isSearchFieldVisible) {
            SimpleTextView simpleTextView2 = simpleTextViewArr[0];
            if (simpleTextView2 != null) {
                simpleTextView2.setVisibility(0);
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                this.subtitleTextView.setVisibility(0);
            }
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setVisibility(0);
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

    public final boolean isActionModeShowed() {
        return this.actionMode != null && this.actionModeVisible;
    }

    @Override
    public final void onAttachedToWindow() {
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
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.lastRightDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.setParentView(this.titleTextView[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
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
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.lastRightDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.setParentView(null);
        }
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable currentHolidayDrawable;
        if (this.supportsHolidayImage && !this.titleOverlayShown && !LocaleController.isRTL && motionEvent.getAction() == 0 && (currentHolidayDrawable = Theme.getCurrentHolidayDrawable()) != null && currentHolidayDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.manualStart = true;
            SnowflakesEffect snowflakesEffect = this.snowflakesEffect;
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if (snowflakesEffect == null) {
                this.fireworksEffect = null;
                this.snowflakesEffect = new SnowflakesEffect(0);
                simpleTextViewArr[0].invalidate();
                invalidate();
            } else {
                this.snowflakesEffect = null;
                this.fireworksEffect = new FireworksEffect();
                simpleTextViewArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.interceptTouchEventListener;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        SimpleTextView[] simpleTextViewArr;
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
            simpleTextViewArr = this.titleTextView;
            if (i13 >= 2) {
                break;
            }
            SimpleTextView simpleTextView2 = simpleTextViewArr[i13];
            if (simpleTextView2 != null && simpleTextView2.getVisibility() != 8) {
                boolean z2 = this.fromBottom;
                int currentActionBarHeight = ((((z2 && i13 == 0) || (!z2 && i13 == 1)) && this.overlayTitleAnimation && this.titleAnimationRunning) || (simpleTextView = this.subtitleTextView) == null || simpleTextView.getVisibility() == 8) ? (getCurrentActionBarHeight() - simpleTextViewArr[i13].getTextHeight()) / 2 : AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 3.0f : 2.0f) + AndroidUtilities.dp(2.0f) + (((getCurrentActionBarHeight() / 2) - simpleTextViewArr[i13].getTextHeight()) / 2);
                SimpleTextView simpleTextView3 = simpleTextViewArr[i13];
                int i14 = currentActionBarHeight + i10;
                simpleTextView3.layout(i11, i14 - simpleTextView3.getPaddingTop(), simpleTextViewArr[i13].getMeasuredWidth() + i11, simpleTextViewArr[i13].getPaddingBottom() + ((simpleTextViewArr[i13].getTextHeight() + i14) - simpleTextViewArr[i13].getPaddingTop()));
            }
            i13++;
        }
        if (this.additionalSubTitleOverlayContainer != null) {
            int currentActionBarHeight2 = ((((getCurrentActionBarHeight() / 2) - this.additionalSubTitleOverlayContainer.getMeasuredHeight()) / 2) + (getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(2.0f);
            AnonymousClass9 anonymousClass9 = this.additionalSubTitleOverlayContainer;
            int i15 = currentActionBarHeight2 + i10;
            anonymousClass9.layout(i11, i15, anonymousClass9.getMeasuredWidth() + i11, this.additionalSubTitleOverlayContainer.getMeasuredHeight() + i15);
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
            if (childAt2.getVisibility() != 8 && childAt2 != simpleTextViewArr[0] && childAt2 != simpleTextViewArr[1] && childAt2 != this.additionalSubTitleOverlayContainer && childAt2 != this.subtitleTextView && childAt2 != this.menu && childAt2 != this.backButtonImageView && childAt2 != this.additionalSubtitleTextView && childAt2 != this.avatarSearchImageView) {
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

    @Override
    public void onMeasure(int i, int i2) {
        int iDp;
        SimpleTextView[] simpleTextViewArr;
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
        AnonymousClass1 anonymousClass1 = actionBar.actionMode;
        if (anonymousClass1 != null) {
            anonymousClass1.setPadding(0, actionBar.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0, 0, 0);
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
        ActionBarMenu actionBarMenu = actionBar.menu;
        if (actionBarMenu != null && actionBarMenu.getVisibility() != 8) {
            ActionBarMenu actionBarMenu2 = actionBar.menu;
            int childCount = actionBarMenu2.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 < childCount) {
                    View childAt = actionBarMenu2.getChildAt(i4);
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
                    iMakeMeasureSpec = OKLCH.m(size, f, 1073741824);
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
        while (true) {
            simpleTextViewArr = actionBar.titleTextView;
            if (i5 >= 2) {
                break;
            }
            SimpleTextView simpleTextView3 = simpleTextViewArr[0];
            if ((simpleTextView3 != null && simpleTextView3.getVisibility() != 8) || ((simpleTextView = actionBar.subtitleTextView) != null && simpleTextView.getVisibility() != 8)) {
                ActionBarMenu actionBarMenu3 = actionBar.menu;
                int iMax = Math.max(RichMessageLayout$$ExternalSyntheticOutline2.m(size - (actionBarMenu3 != null ? actionBarMenu3.getMeasuredWidth() : 0), 16.0f, iDp) - actionBar.titleRightMargin, 0);
                boolean z = actionBar.fromBottom;
                int i6 = 20;
                if (((z && i5 == 0) || (!z && i5 == i3)) && actionBar.overlayTitleAnimation && actionBar.titleAnimationRunning) {
                    SimpleTextView simpleTextView4 = simpleTextViewArr[i5];
                    if (actionBar.glassMode) {
                        i6 = 17;
                    } else if (!AndroidUtilities.isTablet() && actionBar.getResources().getConfiguration().orientation == 2) {
                        i6 = 18;
                    }
                    simpleTextView4.setTextSize(i6);
                } else {
                    SimpleTextView simpleTextView5 = simpleTextViewArr[0];
                    if (simpleTextView5 == null || simpleTextView5.getVisibility() == 8 || (simpleTextView2 = actionBar.subtitleTextView) == null || simpleTextView2.getVisibility() == 8) {
                        SimpleTextView simpleTextView6 = simpleTextViewArr[i5];
                        if (simpleTextView6 != null && simpleTextView6.getVisibility() != 8) {
                            SimpleTextView simpleTextView7 = simpleTextViewArr[i5];
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
                        SimpleTextView simpleTextView10 = simpleTextViewArr[i5];
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
                SimpleTextView simpleTextView12 = simpleTextViewArr[i5];
                if (simpleTextView12 != null && simpleTextView12.getVisibility() != 8) {
                    simpleTextViewArr[i5].measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(simpleTextViewArr[i5].getPaddingBottom() + simpleTextViewArr[i5].getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    if (actionBar.centerScale) {
                        CharSequence text = simpleTextViewArr[i5].getText();
                        SimpleTextView simpleTextView13 = simpleTextViewArr[i5];
                        simpleTextView13.setPivotX(simpleTextView13.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        simpleTextViewArr[i5].setPivotY(AndroidUtilities.dp(24.0f) >> 1);
                    } else {
                        simpleTextViewArr[i5].setPivotX(0.0f);
                        simpleTextViewArr[i5].setPivotY(0.0f);
                    }
                }
                SimpleTextView simpleTextView14 = actionBar.subtitleTextView;
                if (simpleTextView14 != null && simpleTextView14.getVisibility() != 8) {
                    actionBar.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                AnonymousClass9 anonymousClass9 = actionBar.additionalSubTitleOverlayContainer;
                if (anonymousClass9 != null) {
                    anonymousClass9.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
            if (childAt2.getVisibility() != 8 && childAt2 != simpleTextViewArr[0] && childAt2 != simpleTextViewArr[1] && childAt2 != actionBar.additionalSubTitleOverlayContainer && childAt2 != actionBar.subtitleTextView && childAt2 != actionBar.menu && childAt2 != actionBar.backButtonImageView && childAt2 != actionBar.additionalSubtitleTextView && childAt2 != actionBar.avatarSearchImageView) {
                actionBar.measureChildWithMargins(childAt2, i, 0, View.MeasureSpec.makeMeasureSpec(actionBar.getMeasuredHeight(), 1073741824), 0);
            }
            i7++;
            actionBar = this;
        }
    }

    public boolean onSearchChangedIgnoreTitles() {
        return false;
    }

    public void onSearchFieldVisibilityChanged(boolean z) {
        Property property;
        int i = 0;
        this.isSearchFieldVisible = z;
        checkMenuItemsWidth();
        AnimatorSet animatorSet = this.searchVisibleAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.searchVisibleAnimator = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean zOnSearchChangedIgnoreTitles = onSearchChangedIgnoreTitles();
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
        valueAnimatorOfFloat.addUpdateListener(new ActionBar$$ExternalSyntheticLambda0(this, i));
        this.searchVisibleAnimator.playTogether(valueAnimatorOfFloat);
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i2 >= size) {
                break;
            }
            View view = (View) arrayList.get(i2);
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
            i2++;
        }
        BackupImageView backupImageView = this.avatarSearchImageView;
        if (backupImageView != null) {
            backupImageView.setVisibility(0);
            this.searchVisibleAnimator.playTogether(ObjectAnimator.ofFloat(this.avatarSearchImageView, (Property<BackupImageView, Float>) property, z ? 1.0f : 0.0f));
        }
        this.centerScale = true;
        if (!this.ignoreLayoutRequest) {
            super.requestLayout();
        }
        this.searchVisibleAnimator.addListener(new AnonymousClass4(this, arrayList, z, zOnSearchChangedIgnoreTitles));
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

    public final void onSearchPressed() {
        OKLCH oklch;
        ActionBarMenu actionBarMenu = this.menu;
        int childCount = actionBarMenu.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = actionBarMenu.getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField && (oklch = actionBarMenuItem.listener) != null) {
                    oklch.onSearchPressed(actionBarMenuItem.searchField);
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

    public final void openSearchField(String str) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu == null || str == null) {
            return;
        }
        boolean z = this.isSearchFieldVisible;
        boolean z2 = !z;
        int childCount = actionBarMenu.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = actionBarMenu.getChildAt(i);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.isSearchField) {
                    if (!z) {
                        actionBarMenu.parentActionBar.onSearchFieldVisibilityChanged(actionBarMenuItem.toggleSearch(z2));
                    }
                    actionBarMenuItem.setSearchFieldText(str, false);
                    actionBarMenuItem.getSearchField().setSelection(str.length());
                    return;
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayoutRequest) {
            return;
        }
        super.requestLayout();
    }

    public void setActionBarMenuOnItemClick(ActionBarMenuOnItemClick actionBarMenuOnItemClick) {
        this.actionBarMenuOnItemClick = actionBarMenuOnItemClick;
    }

    public void setActionModeColor(int i) {
        AnonymousClass1 anonymousClass1 = this.actionMode;
        if (anonymousClass1 != null) {
            anonymousClass1.setBackgroundColor(i);
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
        AnonymousClass1 anonymousClass1 = this.actionMode;
        if (anonymousClass1 != null) {
            anonymousClass1.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        this.extraHeight = i;
        AnonymousClass1 anonymousClass1 = this.actionMode;
        if (anonymousClass1 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass1.getLayoutParams();
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

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.interceptTouchEventListener = onTouchListener;
    }

    public void setInterceptTouches(boolean z) {
        this.interceptTouches = z;
    }

    public final void setItemsBackgroundColor(int i, boolean z) {
        ImageView imageView;
        int i2 = 0;
        if (z) {
            this.itemsActionModeBackgroundColor = i;
            if (this.actionModeVisible && (imageView = this.backButtonImageView) != null) {
                imageView.setBackgroundDrawable(Theme.createSelectorDrawable(i, 1, -1));
            }
            AnonymousClass1 anonymousClass1 = this.actionMode;
            if (anonymousClass1 != null) {
                int childCount = anonymousClass1.getChildCount();
                while (i2 < childCount) {
                    View childAt = anonymousClass1.getChildAt(i2);
                    if (childAt instanceof ActionBarMenuItem) {
                        boolean z2 = anonymousClass1.isActionMode;
                        ActionBar actionBar = anonymousClass1.parentActionBar;
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
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            int childCount2 = actionBarMenu.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = actionBarMenu.getChildAt(i2);
                if (childAt2 instanceof ActionBarMenuItem) {
                    boolean z3 = actionBarMenu.isActionMode;
                    ActionBar actionBar2 = actionBarMenu.parentActionBar;
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
            AnonymousClass1 anonymousClass1 = this.actionMode;
            if (anonymousClass1 != null) {
                int childCount = anonymousClass1.getChildCount();
                while (i2 < childCount) {
                    View childAt = anonymousClass1.getChildAt(i2);
                    if (childAt instanceof ActionBarMenuItem) {
                        ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                        boolean z2 = anonymousClass1.isActionMode;
                        ActionBar actionBar = anonymousClass1.parentActionBar;
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
            ActionBarMenu actionBarMenu = this.menu;
            if (actionBarMenu != null) {
                int childCount2 = actionBarMenu.getChildCount();
                while (i2 < childCount2) {
                    View childAt2 = actionBarMenu.getChildAt(i2);
                    if (childAt2 instanceof ActionBarMenuItem) {
                        ActionBarMenuItem actionBarMenuItem2 = (ActionBarMenuItem) childAt2;
                        boolean z3 = actionBarMenu.isActionMode;
                        ActionBar actionBar2 = actionBarMenu.parentActionBar;
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
        AnonymousClass1 anonymousClass1 = this.actionMode;
        if (anonymousClass1 != null) {
            anonymousClass1.setPadding(0, z ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.doOnActionModeFactorChanged = runnable;
    }

    public void setOverlayTitleAnimation(boolean z) {
        this.overlayTitleAnimation = z;
    }

    public final void setPopupBackgroundColor(int i, boolean z) {
        ActionBarMenu actionBarMenu;
        AnonymousClass1 anonymousClass1;
        int i2 = 0;
        if (z && (anonymousClass1 = this.actionMode) != null) {
            int childCount = anonymousClass1.getChildCount();
            while (i2 < childCount) {
                View childAt = anonymousClass1.getChildAt(i2);
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

    public final void setPopupItemsColor(int i, boolean z, boolean z2) {
        ActionBarMenu actionBarMenu;
        AnonymousClass1 anonymousClass1;
        int i2 = 0;
        if (z2 && (anonymousClass1 = this.actionMode) != null) {
            int childCount = anonymousClass1.getChildCount();
            while (i2 < childCount) {
                View childAt = anonymousClass1.getChildAt(i2);
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

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.rightDrawableOnClickListener = onClickListener;
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        SimpleTextView simpleTextView = simpleTextViewArr[0];
        if (simpleTextView != null) {
            simpleTextView.setRightDrawableOnClick(onClickListener);
        }
        SimpleTextView simpleTextView2 = simpleTextViewArr[1];
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

    public final void setSearchTextColor(int i, boolean z) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            int childCount = actionBarMenu.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = actionBarMenu.getChildAt(i2);
                if (childAt instanceof ActionBarMenuItem) {
                    ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                    if (actionBarMenuItem.isSearchField) {
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
        int i = 8;
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
            SimpleTextView simpleTextView3 = this.subtitleTextView;
            if (!zIsEmpty && !this.isSearchFieldVisible) {
                i = 0;
            }
            simpleTextView3.setVisibility(i);
            this.subtitleTextView.setAlpha(1.0f);
            if (!zIsEmpty) {
                this.subtitleTextView.setText(charSequence, false);
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

    public final void setTitleAnimated(CharSequence charSequence, boolean z, long j, CubicBezierInterpolator cubicBezierInterpolator) {
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[0] == null || charSequence == null) {
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
        SimpleTextView simpleTextView = simpleTextViewArr[1];
        if (simpleTextView != null) {
            if (simpleTextView.getParent() != null) {
                ((ViewGroup) simpleTextViewArr[1].getParent()).removeView(simpleTextViewArr[1]);
            }
            simpleTextViewArr[1] = null;
        }
        simpleTextViewArr[1] = simpleTextViewArr[0];
        simpleTextViewArr[0] = null;
        setTitle(charSequence);
        this.fromBottom = z;
        simpleTextViewArr[0].setAlpha(0.0f);
        if (!z2) {
            SimpleTextView simpleTextView2 = simpleTextViewArr[0];
            int iDp = AndroidUtilities.dp(20.0f);
            if (!z) {
                iDp = -iDp;
            }
            simpleTextView2.setTranslationY(iDp);
        }
        ViewPropertyAnimator duration = simpleTextViewArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j);
        if (cubicBezierInterpolator != null) {
            duration.setInterpolator(cubicBezierInterpolator);
        }
        duration.start();
        this.titleAnimationRunning = true;
        ViewPropertyAnimator viewPropertyAnimatorAlpha = simpleTextViewArr[1].animate().alpha(0.0f);
        if (!z2) {
            viewPropertyAnimatorAlpha.translationY(z ? -AndroidUtilities.dp(20.0f) : AndroidUtilities.dp(20.0f));
        }
        if (cubicBezierInterpolator != null) {
            viewPropertyAnimatorAlpha.setInterpolator(cubicBezierInterpolator);
        }
        viewPropertyAnimatorAlpha.setDuration(j).setListener(new LoginActivity.AnonymousClass8(this, z2, z, 1)).start();
        if (this.ignoreLayoutRequest) {
            return;
        }
        super.requestLayout();
    }

    public void setTitleColor(int i) {
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[0] == null) {
            createTitleTextView(0);
        }
        this.titleColorToSet = i;
        simpleTextViewArr[0].setTextColor(i);
        simpleTextViewArr[0].setEmojiColor(i);
        SimpleTextView simpleTextView = simpleTextViewArr[1];
        if (simpleTextView != null) {
            simpleTextView.setTextColor(i);
            simpleTextViewArr[1].setEmojiColor(i);
        }
    }

    public final void setTitleOverlayText(String str, int i, Runnable runnable) {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        CharSequence charSequence3;
        boolean z2;
        GLSurfaceView gLSurfaceView;
        int iIndexOf;
        SpannableString spannableStringValueOf;
        String string;
        if (!this.allowOverlayTitle || this.parentFragment.parentLayout == null) {
            return;
        }
        Object[] objArr = this.overlayTitleToSet;
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = runnable;
        if (this.overlayTitleAnimationInProgress) {
            return;
        }
        String str2 = this.lastOverlayTitle;
        if (str2 == null && str == null) {
            return;
        }
        if (str2 == null || !str2.equals(str)) {
            this.lastOverlayTitle = str;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = null;
            if (this.additionalSubTitleOverlayContainer != null) {
                this.additionalSubTitleOverlayContainer.setText$1(i == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            }
            if (str != null) {
                string = LocaleController.getString(str, i);
            } else {
                charSequence = this.lastTitle;
            }
            if (str == null) {
                charSequence2 = charSequence;
                charSequence2 = string;
                swapAnimatedEmojiDrawable = this.lastRightDrawable;
            }
            charSequence2 = charSequence;
            charSequence2 = string;
            AvatarPreviewer avatarPreviewer = this.ellipsizeSpanAnimator;
            if (str == null || (iIndexOf = TextUtils.indexOf(charSequence2, "...")) < 0) {
                z = false;
                charSequence3 = charSequence2;
            } else {
                spannableStringValueOf = SpannableString.valueOf(charSequence2);
                avatarPreviewer.wrap(spannableStringValueOf, iIndexOf);
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
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if ((charSequence3 == null || simpleTextViewArr[0] != 0) && getMeasuredWidth() != 0 && ((gLSurfaceView = simpleTextViewArr[0]) == 0 || gLSurfaceView.getVisibility() == 0)) {
                GLSurfaceView gLSurfaceView2 = simpleTextViewArr[0];
                if (gLSurfaceView2 != 0) {
                    gLSurfaceView2.animate().cancel();
                    GLSurfaceView gLSurfaceView3 = simpleTextViewArr[1];
                    if (gLSurfaceView3 != 0) {
                        gLSurfaceView3.animate().cancel();
                    }
                    if (simpleTextViewArr[1] == 0) {
                        createTitleTextView(1);
                    }
                    simpleTextViewArr[1].setText(charSequence3);
                    simpleTextViewArr[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    simpleTextViewArr[1].setRightDrawable(swapAnimatedEmojiDrawable);
                    simpleTextViewArr[1].setRightDrawableOnClick(this.rightDrawableOnClickListener);
                    if (swapAnimatedEmojiDrawable != null) {
                        swapAnimatedEmojiDrawable.setParentView(simpleTextViewArr[1]);
                    }
                    if (z) {
                        avatarPreviewer.addView(simpleTextViewArr[1]);
                    }
                    this.overlayTitleAnimationInProgress = true;
                    GLSurfaceView gLSurfaceView4 = simpleTextViewArr[1];
                    simpleTextViewArr[1] = simpleTextViewArr[0];
                    simpleTextViewArr[0] = gLSurfaceView4;
                    gLSurfaceView4.setAlpha(0.0f);
                    simpleTextViewArr[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                    simpleTextViewArr[0].animate().alpha(this.adaptiveBackgroundHideTitle ? 1.0f - this.onTopAnimated : 1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = simpleTextViewArr[1].animate().alpha(0.0f);
                    if (this.subtitleTextView == null) {
                        viewPropertyAnimatorAlpha.translationY(AndroidUtilities.dp(20.0f));
                    } else {
                        viewPropertyAnimatorAlpha.scaleY(0.7f).scaleX(0.7f);
                    }
                    if (!this.ignoreLayoutRequest) {
                        super.requestLayout();
                    }
                    this.centerScale = true;
                    viewPropertyAnimatorAlpha.setDuration(220L).setListener(new AnonymousClass3(this, 1)).start();
                }
            } else {
                createTitleTextView(0);
                if (this.supportsHolidayImage) {
                    simpleTextViewArr[0].invalidate();
                    invalidate();
                }
                simpleTextViewArr[0].setText(charSequence3);
                simpleTextViewArr[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                simpleTextViewArr[0].setRightDrawable(swapAnimatedEmojiDrawable);
                simpleTextViewArr[0].setRightDrawableOnClick(this.rightDrawableOnClickListener);
                if (swapAnimatedEmojiDrawable != null) {
                    swapAnimatedEmojiDrawable.setParentView(simpleTextViewArr[0]);
                }
                if (z) {
                    avatarPreviewer.addView(simpleTextViewArr[0]);
                } else {
                    avatarPreviewer.removeView(simpleTextViewArr[0]);
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

    public final void setupGlass(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder, boolean z) {
        setBackground(null);
        setClipChildren(false);
        this.glassMode = true;
        this.glassModeIsForum = z;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProviderBuilder);
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(6.0f));
        this.glassDrawable = blurredBackgroundDrawableCreate;
        if (z) {
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(23.0f));
        }
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = blurredBackgroundDrawableViewFactory.create(this, null, false);
        blurredBackgroundDrawableCreate2.setColorProvider(blurredBackgroundProviderBuilder);
        blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(23.0f));
        blurredBackgroundDrawableCreate2.setPadding(AndroidUtilities.dp(6.0f));
        this.glassDrawableBack = blurredBackgroundDrawableCreate2;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = blurredBackgroundDrawableViewFactory.create(this, null, false);
        blurredBackgroundDrawableCreate3.setColorProvider(blurredBackgroundProviderBuilder);
        blurredBackgroundDrawableCreate3.setRadius(AndroidUtilities.dp(23.0f));
        blurredBackgroundDrawableCreate3.setPadding(AndroidUtilities.dp(6.0f));
        this.glassDrawableMenu = blurredBackgroundDrawableCreate3;
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.menu.setGlassMode(true);
        }
        AnonymousClass1 anonymousClass1 = this.actionMode;
        if (anonymousClass1 != null) {
            anonymousClass1.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.actionMode.setGlassMode(true);
        }
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
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

    public void showActionMode(View[] viewArr, boolean[] zArr) {
        int i = 2;
        boolean z = false;
        if (this.actionMode == null || this.actionModeVisible) {
            return;
        }
        this.actionModeVisible = true;
        checkMenuItemsWidth();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(this.actionMode, (Property<AnonymousClass1, Float>) property, 0.0f, 1.0f));
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.0f));
                }
            }
        }
        this.actionModeHidingViews = viewArr;
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
        int i2 = this.actionModeColor;
        if (i2 == 0) {
            i2 = this.actionBarColor;
        }
        if (i2 == 0 || this.glassMode) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (ColorUtils.calculateLuminance(i2) < 0.699999988079071d) {
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
            valueAnimatorOfFloat.addUpdateListener(new ActionBar$$ExternalSyntheticLambda0(this, 4));
            this.actionModeAnimation.playTogether(valueAnimatorOfFloat);
        }
        this.actionModeAnimation.setDuration(200L);
        this.actionModeAnimation.addListener(new ChatActivity.AnonymousClass74(this, zArr, z, i));
        this.actionModeAnimation.start();
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BackDrawable) {
                ((BackDrawable) drawable).setRotation(1.0f, true);
            }
            this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsActionModeBackgroundColor, 1, -1));
        }
    }

    public final void updateAttachState$1() {
        boolean z = this.attached && this.resumed;
        if (this.attachState != z) {
            this.attachState = z;
            AvatarPreviewer avatarPreviewer = this.ellipsizeSpanAnimator;
            if (!z) {
                avatarPreviewer.visible = false;
                ((AnimatorSet) avatarPreviewer.windowManager).cancel();
                return;
            }
            avatarPreviewer.visible = true;
            AnimatorSet animatorSet = (AnimatorSet) avatarPreviewer.windowManager;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    @Override
    public final void updateColors$1() {
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
        AnonymousClass9 anonymousClass9 = this.additionalSubTitleOverlayContainer;
        if (anonymousClass9 != null) {
            ArrayList arrayList = anonymousClass9.titleOverlayAnimator.list.entries;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ListAnimator.Entry entry = (ListAnimator.Entry) obj;
                ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable simpleTextViewReplaceable = (ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable) entry.item;
                int i2 = Theme.key_telegram_color_dialogsLogo;
                Theme.ResourcesProvider resourcesProvider = anonymousClass9.resourcesProvider;
                simpleTextViewReplaceable.setTextColor(Theme.getColor(i2, resourcesProvider));
                ((ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable) entry.item).setLinkTextColor(Theme.getColor(i2, resourcesProvider));
            }
        }
    }

    public final AnonymousClass1 createActionMode(String str) {
        if (actionModeIsExist(str)) {
            return this.actionMode;
        }
        AnonymousClass1 anonymousClass1 = this.actionMode;
        if (anonymousClass1 != null) {
            removeView(anonymousClass1);
            this.actionMode = null;
        }
        this.actionModeTag = str;
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(getContext(), this);
        this.actionMode = anonymousClass2;
        anonymousClass2.setTranslationX(this.glassMode ? -AndroidUtilities.dp(10.0f) : 0.0f);
        this.actionMode.setGlassMode(this.glassMode);
        AnonymousClass1 anonymousClass3 = this.actionMode;
        anonymousClass3.isActionMode = true;
        anonymousClass3.setClickable(true);
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

    public final boolean isActionModeShowed(String str) {
        if (this.actionMode == null || !this.actionModeVisible) {
            return false;
        }
        String str2 = this.actionModeTag;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public final void setAdaptiveBackground(RecyclerView recyclerView, boolean z, int i, int i2) {
        this.adaptive_topColorKey = i;
        this.adaptive_lowerColorKey = i2;
        ClickHelper$$ExternalSyntheticLambda0 clickHelper$$ExternalSyntheticLambda0 = new ClickHelper$$ExternalSyntheticLambda0(24, this, recyclerView);
        recyclerView.addOnScrollListener(new ChatActivity.AnonymousClass53(clickHelper$$ExternalSyntheticLambda0, 1));
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

    public final void setTitle(CharSequence charSequence, AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3;
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (charSequence != null && simpleTextViewArr[0] == null) {
            createTitleTextView(0);
        }
        SimpleTextView simpleTextView = simpleTextViewArr[0];
        if (simpleTextView != null) {
            simpleTextView.setVisibility((charSequence == null || this.isSearchFieldVisible) ? 4 : 0);
            SimpleTextView simpleTextView2 = simpleTextViewArr[0];
            this.lastTitle = charSequence;
            simpleTextView2.setText(charSequence);
            if (this.attached && (swapAnimatedEmojiDrawable3 = this.lastRightDrawable) != null) {
                swapAnimatedEmojiDrawable3.setParentView(null);
            }
            SimpleTextView simpleTextView3 = simpleTextViewArr[0];
            this.lastRightDrawable = swapAnimatedEmojiDrawable;
            simpleTextView3.setRightDrawable(swapAnimatedEmojiDrawable);
            if (this.attached && (swapAnimatedEmojiDrawable2 = this.lastRightDrawable) != null) {
                swapAnimatedEmojiDrawable2.setParentView(simpleTextViewArr[0]);
            }
            simpleTextViewArr[0].setRightDrawableOnClick(this.rightDrawableOnClickListener);
        }
        this.fromBottom = false;
    }

    public void setAdaptiveBackground(SectionsScrollView sectionsScrollView) {
        int i = Theme.key_windowBackgroundGray;
        int i2 = Theme.key_actionBarDefault;
        this.adaptive_topColorKey = i;
        this.adaptive_lowerColorKey = i2;
        adaptive_updateColor();
        ClickHelper$$ExternalSyntheticLambda0 clickHelper$$ExternalSyntheticLambda0 = new ClickHelper$$ExternalSyntheticLambda0(23, this, sectionsScrollView);
        sectionsScrollView.onScroll.add(clickHelper$$ExternalSyntheticLambda0);
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
}
