package org.telegram.p009ui.Components.Reactions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ChatActivity;
import org.telegram.p009ui.Components.AnimatedEmojiDrawable;
import org.telegram.p009ui.Components.Bulletin;
import org.telegram.p009ui.Components.BulletinFactory;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.p009ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.p009ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.p009ui.Components.ReactionsContainerLayout;
import org.telegram.p009ui.SelectAnimatedEmojiDialog;
import org.telegram.tgnet.TLRPC$Document;

public class CustomEmojiReactionsWindow {
    int animationIndex;
    BaseFragment baseFragment;
    ContainerView containerView;
    private float dismissProgress;
    private boolean dismissed;
    boolean enterTransitionFinished;
    float enterTransitionProgress;
    float fromRadius;
    private boolean invalidatePath;
    float keyboardHeight;
    private Runnable onDismiss;
    List<ReactionsLayoutInBubble.VisibleReaction> reactions;
    ReactionsContainerLayout reactionsContainerLayout;
    Theme.ResourcesProvider resourcesProvider;
    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog;
    private boolean wasFocused;
    WindowManager windowManager;
    FrameLayout windowView;
    float yTranslation;
    RectF fromRect = new RectF();
    public RectF drawingRect = new RectF();
    Path pathToClip = new Path();
    int[] location = new int[2];
    private int frameDrawCount = 0;

    static int access$808(CustomEmojiReactionsWindow customEmojiReactionsWindow) {
        int i = customEmojiReactionsWindow.frameDrawCount;
        customEmojiReactionsWindow.frameDrawCount = i + 1;
        return i;
    }

    public CustomEmojiReactionsWindow(BaseFragment baseFragment, List<ReactionsLayoutInBubble.VisibleReaction> list, HashSet<ReactionsLayoutInBubble.VisibleReaction> hashSet, final ReactionsContainerLayout reactionsContainerLayout, Theme.ResourcesProvider resourcesProvider) {
        this.reactions = list;
        this.baseFragment = baseFragment;
        this.resourcesProvider = resourcesProvider;
        Context context = baseFragment.getContext();
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void dispatchSetPressed(boolean z) {
            }

            @Override
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
                    if (customEmojiReactionsWindow.enterTransitionFinished) {
                        customEmojiReactionsWindow.dismiss();
                    }
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            }

            @Override
            protected boolean fitSystemWindows(Rect rect) {
                CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
                if (customEmojiReactionsWindow.keyboardHeight != rect.bottom && customEmojiReactionsWindow.wasFocused) {
                    CustomEmojiReactionsWindow customEmojiReactionsWindow2 = CustomEmojiReactionsWindow.this;
                    customEmojiReactionsWindow2.keyboardHeight = rect.bottom;
                    customEmojiReactionsWindow2.updateWindowPosition();
                }
                return super.fitSystemWindows(rect);
            }
        };
        this.windowView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CustomEmojiReactionsWindow.this.lambda$new$0(view);
            }
        });
        this.containerView = new ContainerView(context);
        C25362 c25362 = new C25362(baseFragment, context, false, null, 1, resourcesProvider, baseFragment, reactionsContainerLayout);
        this.selectAnimatedEmojiDialog = c25362;
        c25362.setOnLongPressedListener(new SelectAnimatedEmojiDialog.onLongPressedListener(this) {
            @Override
            public void onLongPressed(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji) {
                if (imageViewEmoji.isDefaultReaction) {
                    reactionsContainerLayout.onReactionClicked(imageViewEmoji, imageViewEmoji.reaction, true);
                } else {
                    reactionsContainerLayout.onReactionClicked(imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(Long.valueOf(imageViewEmoji.span.documentId)), true);
                }
            }
        });
        this.selectAnimatedEmojiDialog.setOnRecentClearedListener(new SelectAnimatedEmojiDialog.onRecentClearedListener(this) {
            @Override
            public void onRecentCleared() {
                reactionsContainerLayout.clearRecentReactions();
            }
        });
        this.selectAnimatedEmojiDialog.setRecentReactions(list);
        this.selectAnimatedEmojiDialog.setSelectedReactions(hashSet);
        this.selectAnimatedEmojiDialog.setDrawBackground(false);
        this.selectAnimatedEmojiDialog.onShow(null);
        this.containerView.addView(this.selectAnimatedEmojiDialog, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1.0f, 48, 16.0f, 16.0f, 16.0f, 16.0f));
        this.windowView.setClipChildren(false);
        WindowManager.LayoutParams createLayoutParams = createLayoutParams(false);
        WindowManager windowManager = baseFragment.getParentActivity().getWindowManager();
        this.windowManager = windowManager;
        windowManager.addView(this.windowView, createLayoutParams);
        this.reactionsContainerLayout = reactionsContainerLayout;
        reactionsContainerLayout.prepareAnimation(true);
        this.containerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CustomEmojiReactionsWindow.this.containerView.removeOnLayoutChangeListener(this);
                reactionsContainerLayout.prepareAnimation(false);
                CustomEmojiReactionsWindow.this.createTransition(true);
            }
        });
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 7);
    }

    public void lambda$new$0(View view) {
        if (this.enterTransitionFinished) {
            dismiss();
        }
    }

    public class C25362 extends SelectAnimatedEmojiDialog {
        final BaseFragment val$baseFragment;
        final ReactionsContainerLayout val$reactionsContainerLayout;

        C25362(BaseFragment baseFragment, Context context, boolean z, Integer num, int i, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment2, ReactionsContainerLayout reactionsContainerLayout) {
            super(baseFragment, context, z, num, i, resourcesProvider);
            this.val$baseFragment = baseFragment2;
            this.val$reactionsContainerLayout = reactionsContainerLayout;
        }

        @Override
        protected void onInputFocus() {
            if (CustomEmojiReactionsWindow.this.wasFocused) {
                return;
            }
            CustomEmojiReactionsWindow.this.wasFocused = true;
            CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
            customEmojiReactionsWindow.windowManager.updateViewLayout(customEmojiReactionsWindow.windowView, customEmojiReactionsWindow.createLayoutParams(true));
            BaseFragment baseFragment = this.val$baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ((ChatActivity) baseFragment).needEnterText();
            }
        }

        @Override
        protected void onReactionClick(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            this.val$reactionsContainerLayout.onReactionClicked(imageViewEmoji, visibleReaction, false);
            AndroidUtilities.hideKeyboard(CustomEmojiReactionsWindow.this.windowView);
        }

        @Override
        protected void onEmojiSelected(View view, Long l, TLRPC$Document tLRPC$Document, Integer num) {
            if (!UserConfig.getInstance(this.val$baseFragment.getCurrentAccount()).isPremium()) {
                CustomEmojiReactionsWindow.this.windowView.performHapticFeedback(3);
                BulletinFactory.m14of(CustomEmojiReactionsWindow.this.windowView, null).createEmojiBulletin(tLRPC$Document, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiReaction", C1010R.string.UnlockPremiumEmojiReaction)), LocaleController.getString("PremiumMore", C1010R.string.PremiumMore), new Runnable() {
                    @Override
                    public final void run() {
                        CustomEmojiReactionsWindow.C25362.this.lambda$onEmojiSelected$0();
                    }
                }).show();
                return;
            }
            this.val$reactionsContainerLayout.onReactionClicked(view, ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(l), false);
            AndroidUtilities.hideKeyboard(CustomEmojiReactionsWindow.this.windowView);
        }

        public void lambda$onEmojiSelected$0() {
            CustomEmojiReactionsWindow.this.showUnlockPremiumAlert();
        }
    }

    public void updateWindowPosition() {
        if (this.dismissed) {
            return;
        }
        float f = this.yTranslation;
        if (this.containerView.getMeasuredHeight() + f > (this.windowView.getMeasuredHeight() - this.keyboardHeight) - AndroidUtilities.m35dp(32.0f)) {
            f = ((this.windowView.getMeasuredHeight() - this.keyboardHeight) - this.containerView.getMeasuredHeight()) - AndroidUtilities.m35dp(32.0f);
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.containerView.animate().translationY(f).setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
    }

    public WindowManager.LayoutParams createLayoutParams(boolean z) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.type = 1000;
        layoutParams.softInputMode = 16;
        if (z) {
            layoutParams.flags = 65792;
        } else {
            layoutParams.flags = 65800;
        }
        layoutParams.format = -3;
        return layoutParams;
    }

    public void showUnlockPremiumAlert() {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(this.baseFragment, 11, false));
        }
    }

    public void createTransition(final boolean z) {
        this.fromRect.set(this.reactionsContainerLayout.rect);
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        this.fromRadius = reactionsContainerLayout.radius;
        int[] iArr = new int[2];
        if (z) {
            reactionsContainerLayout.getLocationOnScreen(this.location);
        }
        this.windowView.getLocationOnScreen(iArr);
        float m35dp = (this.location[1] - iArr[1]) - AndroidUtilities.m35dp(44.0f);
        if (this.containerView.getMeasuredHeight() + m35dp > this.windowView.getMeasuredHeight() - AndroidUtilities.m35dp(32.0f)) {
            m35dp = (this.windowView.getMeasuredHeight() - AndroidUtilities.m35dp(32.0f)) - this.containerView.getMeasuredHeight();
        }
        if (m35dp < AndroidUtilities.m35dp(16.0f)) {
            m35dp = AndroidUtilities.m35dp(16.0f);
        }
        this.containerView.setTranslationX((this.location[0] - iArr[0]) - AndroidUtilities.m35dp(2.0f));
        if (!z) {
            this.yTranslation = this.containerView.getTranslationY();
        } else {
            this.yTranslation = m35dp;
            this.containerView.setTranslationY(m35dp);
        }
        this.fromRect.offset((this.location[0] - iArr[0]) - this.containerView.getX(), (this.location[1] - iArr[1]) - this.containerView.getY());
        this.reactionsContainerLayout.setCustomEmojiEnterProgress(this.enterTransitionProgress);
        if (z) {
            this.enterTransitionFinished = false;
        }
        final int i = UserConfig.selectedAccount;
        this.animationIndex = NotificationCenter.getInstance(i).setAnimationInProgress(this.animationIndex, null);
        float[] fArr = new float[2];
        fArr[0] = this.enterTransitionProgress;
        fArr[1] = z ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomEmojiReactionsWindow.this.lambda$createTransition$1(valueAnimator);
            }
        });
        if (!z) {
            syncReactionFrames(z);
        }
        ofFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                NotificationCenter.getInstance(i).onAnimationFinish(CustomEmojiReactionsWindow.this.animationIndex);
                CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
                boolean z2 = z;
                customEmojiReactionsWindow.enterTransitionProgress = z2 ? 1.0f : 0.0f;
                if (z2) {
                    customEmojiReactionsWindow.enterTransitionFinished = true;
                    customEmojiReactionsWindow.selectAnimatedEmojiDialog.resetBackgroundBitmaps();
                    CustomEmojiReactionsWindow.this.reactionsContainerLayout.onCustomEmojiWindowOpened();
                    CustomEmojiReactionsWindow.this.containerView.invalidate();
                }
                CustomEmojiReactionsWindow customEmojiReactionsWindow2 = CustomEmojiReactionsWindow.this;
                customEmojiReactionsWindow2.reactionsContainerLayout.setCustomEmojiEnterProgress(customEmojiReactionsWindow2.enterTransitionProgress);
                boolean z3 = z;
                if (z3) {
                    CustomEmojiReactionsWindow.this.syncReactionFrames(z3);
                }
                if (!z) {
                    CustomEmojiReactionsWindow.this.reactionsContainerLayout.setSkipDraw(false);
                }
                if (z) {
                    return;
                }
                CustomEmojiReactionsWindow.this.removeView();
            }
        });
        ofFloat.setStartDelay(30L);
        ofFloat.setDuration(350L);
        ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
        ofFloat.start();
    }

    public void lambda$createTransition$1(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.enterTransitionProgress = floatValue;
        this.reactionsContainerLayout.setCustomEmojiEnterProgress(floatValue);
        this.invalidatePath = true;
        this.containerView.invalidate();
    }

    public void syncReactionFrames(boolean z) {
        new HashMap();
        for (int i = 0; i < this.selectAnimatedEmojiDialog.emojiGridView.getChildCount(); i++) {
            if (this.selectAnimatedEmojiDialog.emojiGridView.getChildAt(i) instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = (SelectAnimatedEmojiDialog.ImageViewEmoji) this.selectAnimatedEmojiDialog.emojiGridView.getChildAt(i);
                if (imageViewEmoji.reaction != null) {
                    imageViewEmoji.notDraw = false;
                    imageViewEmoji.invalidate();
                }
            }
        }
    }

    public void removeView() {
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 7);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CustomEmojiReactionsWindow.this.lambda$removeView$2();
            }
        });
    }

    public void lambda$removeView$2() {
        if (this.windowView.getParent() == null) {
            return;
        }
        try {
            this.windowManager.removeView(this.windowView);
        } catch (Exception unused) {
        }
        Runnable runnable = this.onDismiss;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void dismiss() {
        if (this.dismissed) {
            return;
        }
        Bulletin.hideVisible();
        this.dismissed = true;
        AndroidUtilities.hideKeyboard(this.windowView);
        createTransition(false);
        if (this.wasFocused) {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ((ChatActivity) baseFragment).onEditTextDialogClose(true, true);
            }
        }
    }

    public void onDismissListener(Runnable runnable) {
        this.onDismiss = runnable;
    }

    public void dismiss(boolean z) {
        if (this.dismissed && z) {
            return;
        }
        this.dismissed = true;
        if (!z) {
            removeView();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomEmojiReactionsWindow.this.lambda$dismiss$3(valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                CustomEmojiReactionsWindow.this.removeView();
            }
        });
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    public void lambda$dismiss$3(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.dismissProgress = floatValue;
        this.containerView.setAlpha(1.0f - floatValue);
    }

    public class ContainerView extends FrameLayout {
        Paint backgroundPaint;
        private Paint dimPaint;
        int[] radiusTmp;
        Drawable shadow;
        Rect shadowPad;
        HashMap<ReactionsLayoutInBubble.VisibleReaction, SelectAnimatedEmojiDialog.ImageViewEmoji> transitionReactions;

        public ContainerView(Context context) {
            super(context);
            this.shadowPad = new Rect();
            this.backgroundPaint = new Paint(1);
            this.dimPaint = new Paint(1);
            this.radiusTmp = new int[4];
            this.transitionReactions = new HashMap<>();
            this.shadow = ContextCompat.getDrawable(context, C1010R.C1011drawable.reactions_bubble_shadow).mutate();
            Rect rect = this.shadowPad;
            int m35dp = AndroidUtilities.m35dp(7.0f);
            rect.bottom = m35dp;
            rect.right = m35dp;
            rect.top = m35dp;
            rect.left = m35dp;
            this.shadow.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_messagePanelShadow", CustomEmojiReactionsWindow.this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.backgroundPaint.setColor(Theme.getColor("actionBarDefaultSubmenuBackground", CustomEmojiReactionsWindow.this.resourcesProvider));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            int m35dp = (AndroidUtilities.m35dp(36.0f) * 8) + AndroidUtilities.m35dp(12.0f);
            if (m35dp < min) {
                min = m35dp;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            int y;
            CustomEmojiReactionsWindow customEmojiReactionsWindow;
            View childAt;
            float f7;
            int i;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            int i2;
            boolean z;
            float f13;
            float f14;
            float f15;
            SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction;
            this.dimPaint.setAlpha((int) (CustomEmojiReactionsWindow.this.enterTransitionProgress * 0.2f * 255.0f));
            canvas.drawPaint(this.dimPaint);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            CustomEmojiReactionsWindow customEmojiReactionsWindow2 = CustomEmojiReactionsWindow.this;
            AndroidUtilities.lerp(customEmojiReactionsWindow2.fromRect, rectF, customEmojiReactionsWindow2.enterTransitionProgress, customEmojiReactionsWindow2.drawingRect);
            float lerp = AndroidUtilities.lerp(CustomEmojiReactionsWindow.this.fromRadius, AndroidUtilities.m35dp(8.0f), CustomEmojiReactionsWindow.this.enterTransitionProgress);
            float f16 = 1.0f;
            this.shadow.setAlpha((int) (Utilities.clamp(CustomEmojiReactionsWindow.this.enterTransitionProgress / 0.05f, 1.0f, 0.0f) * 255.0f));
            Drawable drawable = this.shadow;
            RectF rectF2 = CustomEmojiReactionsWindow.this.drawingRect;
            Rect rect = this.shadowPad;
            drawable.setBounds(((int) rectF2.left) - rect.left, ((int) rectF2.top) - rect.top, ((int) rectF2.right) + rect.right, ((int) rectF2.bottom) + rect.bottom);
            this.shadow.draw(canvas);
            this.transitionReactions.clear();
            canvas.drawRoundRect(CustomEmojiReactionsWindow.this.drawingRect, lerp, lerp, this.backgroundPaint);
            CustomEmojiReactionsWindow customEmojiReactionsWindow3 = CustomEmojiReactionsWindow.this;
            RectF rectF3 = customEmojiReactionsWindow3.drawingRect;
            float width = (rectF3.left - customEmojiReactionsWindow3.reactionsContainerLayout.rect.left) + (rectF3.width() - CustomEmojiReactionsWindow.this.reactionsContainerLayout.rect.width());
            if (CustomEmojiReactionsWindow.this.enterTransitionProgress > 0.05f) {
                canvas.save();
                CustomEmojiReactionsWindow customEmojiReactionsWindow4 = CustomEmojiReactionsWindow.this;
                RectF rectF4 = customEmojiReactionsWindow4.drawingRect;
                canvas.translate(width, (rectF4.top - customEmojiReactionsWindow4.reactionsContainerLayout.rect.top) + (rectF4.height() - CustomEmojiReactionsWindow.this.reactionsContainerLayout.rect.height()));
                CustomEmojiReactionsWindow.this.reactionsContainerLayout.drawBubbles(canvas);
                canvas.restore();
            }
            if (CustomEmojiReactionsWindow.this.reactionsContainerLayout != null) {
                for (int i3 = 0; i3 < CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getChildCount(); i3++) {
                    if ((CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getChildAt(i3) instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) && (visibleReaction = (imageViewEmoji = (SelectAnimatedEmojiDialog.ImageViewEmoji) CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getChildAt(i3)).reaction) != null) {
                        this.transitionReactions.put(visibleReaction, imageViewEmoji);
                    }
                }
                int save = canvas.save();
                CustomEmojiReactionsWindow customEmojiReactionsWindow5 = CustomEmojiReactionsWindow.this;
                RectF rectF5 = customEmojiReactionsWindow5.drawingRect;
                canvas.translate(rectF5.left, rectF5.top + (customEmojiReactionsWindow5.reactionsContainerLayout.expandSize() * (1.0f - CustomEmojiReactionsWindow.this.enterTransitionProgress)));
                float max = Math.max(CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getAlpha(), 1.0f - CustomEmojiReactionsWindow.this.enterTransitionProgress);
                if (max != 1.0f) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, CustomEmojiReactionsWindow.this.drawingRect.width(), CustomEmojiReactionsWindow.this.drawingRect.height(), (int) (max * 255.0f), 31);
                }
                int x = (int) (CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.getX() + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getX());
                canvas.clipRect((int) (CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.getY() + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getY()), x + (AndroidUtilities.m35dp(36.0f) * CustomEmojiReactionsWindow.this.enterTransitionProgress), y + customEmojiReactionsWindow.selectAnimatedEmojiDialog.emojiGridView.getMeasuredHeight(), x + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getMeasuredWidth());
                int i4 = -1;
                int i5 = -1;
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = 1.0f;
                float f20 = 0.0f;
                float f21 = 0.0f;
                while (i5 < CustomEmojiReactionsWindow.this.reactionsContainerLayout.recyclerListView.getChildCount()) {
                    CustomEmojiReactionsWindow customEmojiReactionsWindow6 = CustomEmojiReactionsWindow.this;
                    if (customEmojiReactionsWindow6.enterTransitionProgress != f16 || i5 != i4) {
                        if (i5 == i4) {
                            childAt = customEmojiReactionsWindow6.reactionsContainerLayout.nextRecentReaction;
                        } else {
                            childAt = customEmojiReactionsWindow6.reactionsContainerLayout.recyclerListView.getChildAt(i5);
                        }
                        View view = childAt;
                        if (view.getLeft() >= 0 && view.getVisibility() != 8) {
                            canvas.save();
                            if (view instanceof ReactionsContainerLayout.ReactionHolderView) {
                                ReactionsContainerLayout.ReactionHolderView reactionHolderView = (ReactionsContainerLayout.ReactionHolderView) view;
                                SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji2 = this.transitionReactions.get(reactionHolderView.currentReaction);
                                if (imageViewEmoji2 != null) {
                                    float x2 = view.getX();
                                    float y2 = view.getY();
                                    if (i5 == i4) {
                                        x2 -= CustomEmojiReactionsWindow.this.reactionsContainerLayout.recyclerListView.getX();
                                        y2 -= CustomEmojiReactionsWindow.this.reactionsContainerLayout.recyclerListView.getY();
                                    }
                                    float x3 = (((imageViewEmoji2.getX() + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.getX()) + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getX()) - reactionHolderView.loopImageView.getX()) - AndroidUtilities.m35dp(f16);
                                    float y3 = (((imageViewEmoji2.getY() + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.getY()) + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.gridViewContainer.getY()) + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getY()) - reactionHolderView.loopImageView.getY();
                                    float measuredWidth = imageViewEmoji2.getMeasuredWidth();
                                    if (imageViewEmoji2.selected) {
                                        float f22 = 0.86f * measuredWidth;
                                        float f23 = (measuredWidth - f22) / 2.0f;
                                        x3 += f23;
                                        y3 += f23;
                                        measuredWidth = f22;
                                    }
                                    float lerp2 = AndroidUtilities.lerp(x2, x3, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                    float lerp3 = AndroidUtilities.lerp(y2, y3, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                    float measuredWidth2 = measuredWidth / reactionHolderView.loopImageView.getMeasuredWidth();
                                    f11 = AndroidUtilities.lerp(f16, measuredWidth2, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                    if (reactionHolderView.position == 0) {
                                        f12 = AndroidUtilities.m35dp(6.0f);
                                        f13 = f12;
                                    } else if (reactionHolderView.selected) {
                                        f12 = AndroidUtilities.m35dp(6.0f);
                                        f13 = f12;
                                        f14 = f13;
                                        f15 = f14;
                                        canvas.translate(lerp2, lerp3);
                                        canvas.scale(f11, f11);
                                        if (f17 == 0.0f && f18 == 0.0f) {
                                            CustomEmojiReactionsWindow customEmojiReactionsWindow7 = CustomEmojiReactionsWindow.this;
                                            f17 = AndroidUtilities.lerp((customEmojiReactionsWindow7.fromRect.left + x2) - x3, 0.0f, customEmojiReactionsWindow7.enterTransitionProgress);
                                            CustomEmojiReactionsWindow customEmojiReactionsWindow8 = CustomEmojiReactionsWindow.this;
                                            f18 = AndroidUtilities.lerp((customEmojiReactionsWindow8.fromRect.top + y2) - y3, 0.0f, customEmojiReactionsWindow8.enterTransitionProgress);
                                            f19 = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                            f20 = x3;
                                            f21 = y3;
                                        }
                                        f8 = f13;
                                        f9 = f14;
                                        f10 = f15;
                                    } else {
                                        f12 = 0.0f;
                                        f13 = 0.0f;
                                    }
                                    f14 = 0.0f;
                                    f15 = 0.0f;
                                    canvas.translate(lerp2, lerp3);
                                    canvas.scale(f11, f11);
                                    if (f17 == 0.0f) {
                                        CustomEmojiReactionsWindow customEmojiReactionsWindow72 = CustomEmojiReactionsWindow.this;
                                        f17 = AndroidUtilities.lerp((customEmojiReactionsWindow72.fromRect.left + x2) - x3, 0.0f, customEmojiReactionsWindow72.enterTransitionProgress);
                                        CustomEmojiReactionsWindow customEmojiReactionsWindow82 = CustomEmojiReactionsWindow.this;
                                        f18 = AndroidUtilities.lerp((customEmojiReactionsWindow82.fromRect.top + y2) - y3, 0.0f, customEmojiReactionsWindow82.enterTransitionProgress);
                                        f19 = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                        f20 = x3;
                                        f21 = y3;
                                    }
                                    f8 = f13;
                                    f9 = f14;
                                    f10 = f15;
                                } else {
                                    canvas.translate(view.getX() + reactionHolderView.loopImageView.getX(), view.getY() + reactionHolderView.loopImageView.getY());
                                    f8 = 0.0f;
                                    f9 = 0.0f;
                                    f10 = 0.0f;
                                    f11 = 1.0f;
                                    f12 = 0.0f;
                                }
                                if (imageViewEmoji2 != null) {
                                    if (imageViewEmoji2.selected) {
                                        float measuredWidth3 = reactionHolderView.getMeasuredWidth() / 2.0f;
                                        float measuredHeight = reactionHolderView.getMeasuredHeight() / 2.0f;
                                        float measuredWidth4 = reactionHolderView.getMeasuredWidth() - AndroidUtilities.m35dp(2.0f);
                                        float lerp4 = AndroidUtilities.lerp(measuredWidth4, (imageViewEmoji2.getMeasuredWidth() - AndroidUtilities.m35dp(2.0f)) / f11, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                        RectF rectF6 = AndroidUtilities.rectTmp;
                                        float f24 = lerp4 / 2.0f;
                                        i2 = i5;
                                        f7 = lerp;
                                        rectF6.set(measuredWidth3 - f24, measuredHeight - f24, measuredWidth3 + f24, measuredHeight + f24);
                                        float lerp5 = AndroidUtilities.lerp(measuredWidth4 / 2.0f, AndroidUtilities.m35dp(4.0f), CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                        canvas.drawRoundRect(rectF6, lerp5, lerp5, CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.selectorPaint);
                                    } else {
                                        i2 = i5;
                                        f7 = lerp;
                                    }
                                    reactionHolderView.drawSelected = false;
                                    if (f12 != 0.0f) {
                                        ImageReceiver imageReceiver = reactionHolderView.loopImageView.getImageReceiver();
                                        AnimatedEmojiDrawable animatedEmojiDrawable = reactionHolderView.loopImageView.animatedEmojiDrawable;
                                        if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                                            imageReceiver = reactionHolderView.loopImageView.animatedEmojiDrawable.getImageReceiver();
                                        }
                                        int[] roundRadius = imageReceiver.getRoundRadius();
                                        for (int i6 = 0; i6 < 4; i6++) {
                                            this.radiusTmp[i6] = roundRadius[i6];
                                        }
                                        imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(f8, 0.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress), (int) AndroidUtilities.lerp(f9, 0.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress), (int) AndroidUtilities.lerp(f10, 0.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress), (int) AndroidUtilities.lerp(f12, 0.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress));
                                        reactionHolderView.draw(canvas);
                                        imageReceiver.setRoundRadius(this.radiusTmp);
                                        z = true;
                                    } else {
                                        reactionHolderView.draw(canvas);
                                        z = true;
                                    }
                                    reactionHolderView.drawSelected = z;
                                    if (!imageViewEmoji2.notDraw) {
                                        imageViewEmoji2.notDraw = z;
                                        imageViewEmoji2.invalidate();
                                    }
                                } else {
                                    i2 = i5;
                                    f7 = lerp;
                                    if (reactionHolderView.hasEnterAnimation && reactionHolderView.loopImageView.getImageReceiver().getLottieAnimation() == null) {
                                        float alpha = reactionHolderView.enterImageView.getImageReceiver().getAlpha();
                                        reactionHolderView.enterImageView.getImageReceiver().setAlpha((1.0f - CustomEmojiReactionsWindow.this.enterTransitionProgress) * alpha);
                                        reactionHolderView.enterImageView.draw(canvas);
                                        reactionHolderView.enterImageView.getImageReceiver().setAlpha(alpha);
                                    } else {
                                        ImageReceiver imageReceiver2 = reactionHolderView.loopImageView.getImageReceiver();
                                        AnimatedEmojiDrawable animatedEmojiDrawable2 = reactionHolderView.loopImageView.animatedEmojiDrawable;
                                        if (animatedEmojiDrawable2 != null && animatedEmojiDrawable2.getImageReceiver() != null) {
                                            imageReceiver2 = reactionHolderView.loopImageView.animatedEmojiDrawable.getImageReceiver();
                                        }
                                        float alpha2 = imageReceiver2.getAlpha();
                                        imageReceiver2.setAlpha((1.0f - CustomEmojiReactionsWindow.this.enterTransitionProgress) * alpha2);
                                        reactionHolderView.loopImageView.draw(canvas);
                                        imageReceiver2.setAlpha(alpha2);
                                    }
                                }
                                i = i2;
                            } else {
                                f7 = lerp;
                                float x4 = (view.getX() + CustomEmojiReactionsWindow.this.drawingRect.width()) - CustomEmojiReactionsWindow.this.reactionsContainerLayout.rect.width();
                                float y4 = view.getY();
                                CustomEmojiReactionsWindow customEmojiReactionsWindow9 = CustomEmojiReactionsWindow.this;
                                canvas.translate(x4, (y4 + customEmojiReactionsWindow9.fromRect.top) - customEmojiReactionsWindow9.drawingRect.top);
                                i = i5;
                                canvas.saveLayerAlpha(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), (int) ((1.0f - CustomEmojiReactionsWindow.this.enterTransitionProgress) * 255.0f), 31);
                                float f25 = CustomEmojiReactionsWindow.this.enterTransitionProgress;
                                canvas.scale(1.0f - f25, 1.0f - f25, view.getMeasuredWidth() >> 1, view.getMeasuredHeight() >> 1);
                                view.draw(canvas);
                                canvas.restore();
                            }
                            canvas.restore();
                            i5 = i + 1;
                            lerp = f7;
                            i4 = -1;
                            f16 = 1.0f;
                        }
                    }
                    i = i5;
                    f7 = lerp;
                    i5 = i + 1;
                    lerp = f7;
                    i4 = -1;
                    f16 = 1.0f;
                }
                f = lerp;
                canvas.restoreToCount(save);
                f5 = f17;
                f2 = f18;
                f6 = f19;
                f3 = f20;
                f4 = f21;
            } else {
                f = lerp;
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 0.0f;
                f5 = 0.0f;
                f6 = 1.0f;
            }
            if (CustomEmojiReactionsWindow.this.invalidatePath) {
                CustomEmojiReactionsWindow.this.invalidatePath = false;
                CustomEmojiReactionsWindow.this.pathToClip.rewind();
                CustomEmojiReactionsWindow customEmojiReactionsWindow10 = CustomEmojiReactionsWindow.this;
                float f26 = f;
                customEmojiReactionsWindow10.pathToClip.addRoundRect(customEmojiReactionsWindow10.drawingRect, f26, f26, Path.Direction.CW);
            }
            canvas.save();
            canvas.clipPath(CustomEmojiReactionsWindow.this.pathToClip);
            canvas.translate(f5, f2);
            canvas.scale(f6, f6, f3, f4);
            CustomEmojiReactionsWindow customEmojiReactionsWindow11 = CustomEmojiReactionsWindow.this;
            customEmojiReactionsWindow11.selectAnimatedEmojiDialog.setAlpha(customEmojiReactionsWindow11.enterTransitionProgress);
            super.dispatchDraw(canvas);
            canvas.restore();
            if (CustomEmojiReactionsWindow.this.frameDrawCount < 5) {
                if (CustomEmojiReactionsWindow.this.frameDrawCount == 3) {
                    CustomEmojiReactionsWindow.this.reactionsContainerLayout.setSkipDraw(true);
                }
                CustomEmojiReactionsWindow.access$808(CustomEmojiReactionsWindow.this);
            }
            CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.drawBigReaction(canvas, this);
            invalidate();
        }
    }

    public void setRecentReactions(List<ReactionsLayoutInBubble.VisibleReaction> list) {
        this.selectAnimatedEmojiDialog.setRecentReactions(list);
    }
}
