package org.telegram.ui.Components.Reactions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.StableAnimator;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
public class CustomEmojiReactionsWindow {
    boolean attachToParent;
    BaseFragment baseFragment;
    private boolean cascadeAnimation;
    public ContainerView containerView;
    private float dismissProgress;
    private boolean dismissed;
    boolean enterTransitionFinished;
    float enterTransitionProgress;
    float fromRadius;
    float fromRectTranslateX;
    float fromRectTranslateY;
    private boolean invalidatePath;
    boolean isShowing;
    float keyboardHeight;
    private Runnable onDismiss;
    List<ReactionsLayoutInBubble.VisibleReaction> reactions;
    ReactionsContainerLayout reactionsContainerLayout;
    Theme.ResourcesProvider resourcesProvider;
    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog;
    private final int type;
    private ValueAnimator valueAnimator;
    private boolean wasFocused;
    WindowManager windowManager;
    public FrameLayout windowView;
    float yTranslation;
    RectF fromRect = new RectF();
    public RectF drawingRect = new RectF();
    private final Path pathToClipApi20 = new Path();
    int[] location = new int[2];
    final AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();
    HashSet<View> animatingEnterChild = new HashSet<>();
    ArrayList<ValueAnimator> animators = new ArrayList<>();
    private int frameDrawCount = 0;

    static int access$1108(CustomEmojiReactionsWindow customEmojiReactionsWindow) {
        int i = customEmojiReactionsWindow.frameDrawCount;
        customEmojiReactionsWindow.frameDrawCount = i + 1;
        return i;
    }

    public CustomEmojiReactionsWindow(int i, BaseFragment baseFragment, List<ReactionsLayoutInBubble.VisibleReaction> list, HashSet<ReactionsLayoutInBubble.VisibleReaction> hashSet, final ReactionsContainerLayout reactionsContainerLayout, Theme.ResourcesProvider resourcesProvider) {
        int i2;
        this.type = i;
        this.reactions = list;
        this.baseFragment = baseFragment;
        this.resourcesProvider = resourcesProvider;
        Context context = baseFragment != null ? baseFragment.getContext() : reactionsContainerLayout.getContext();
        FrameLayout frameLayout = new FrameLayout(context) {
            Bulletin.Delegate bulletinDelegate = new Bulletin.Delegate() {
                @Override
                public boolean allowLayoutChanges() {
                    return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public boolean clipWithGradient(int i3) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i3);
                }

                @Override
                public int getTopOffset(int i3) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i3);
                }

                @Override
                public void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                }

                @Override
                public int getBottomOffset(int i3) {
                    return (int) CustomEmojiReactionsWindow.this.keyboardHeight;
                }
            };

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

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                Bulletin.addDelegate(this, this.bulletinDelegate);
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                Bulletin.removeDelegate(this);
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
            }
        };
        this.windowView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CustomEmojiReactionsWindow.this.lambda$new$0(view);
            }
        });
        this.attachToParent = i == 2 || i == 4;
        this.containerView = new ContainerView(context);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(baseFragment, context, false, null, reactionsContainerLayout.getWindowType(), i != 1, resourcesProvider, 16, reactionsContainerLayout, baseFragment);
        this.selectAnimatedEmojiDialog = anonymousClass2;
        if (Build.VERSION.SDK_INT >= 21) {
            anonymousClass2.setOutlineProvider(new ViewOutlineProvider() {
                final Rect rect = new Rect();
                final RectF rectTmp = new RectF();
                final RectF rectF = new RectF();

                @Override
                public void getOutline(View view, Outline outline) {
                    float lerp = AndroidUtilities.lerp(CustomEmojiReactionsWindow.this.fromRadius, AndroidUtilities.dp(8.0f), CustomEmojiReactionsWindow.this.enterTransitionProgress);
                    this.rectTmp.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
                    CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
                    AndroidUtilities.lerp(customEmojiReactionsWindow.fromRect, this.rectTmp, customEmojiReactionsWindow.enterTransitionProgress, this.rectF);
                    this.rectF.round(this.rect);
                    outline.setRoundRect(this.rect, lerp);
                }
            });
            i2 = 1;
            this.selectAnimatedEmojiDialog.setClipToOutline(true);
        } else {
            i2 = 1;
        }
        this.selectAnimatedEmojiDialog.setOnLongPressedListener(new SelectAnimatedEmojiDialog.onLongPressedListener(this) {
            @Override
            public void onLongPressed(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji) {
                if (imageViewEmoji.isDefaultReaction) {
                    reactionsContainerLayout.onReactionClicked(imageViewEmoji, imageViewEmoji.reaction, true);
                } else {
                    reactionsContainerLayout.onReactionClicked(imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(Long.valueOf(imageViewEmoji.span.documentId)), true);
                }
            }
        });
        this.selectAnimatedEmojiDialog.setOnRecentClearedListener(new SelectAnimatedEmojiDialog.onRecentClearedListener(this, reactionsContainerLayout) {
        });
        this.selectAnimatedEmojiDialog.setRecentReactions(list);
        this.selectAnimatedEmojiDialog.setSelectedReactions(hashSet);
        this.selectAnimatedEmojiDialog.setDrawBackground(false);
        this.selectAnimatedEmojiDialog.onShow(null);
        this.containerView.addView(this.selectAnimatedEmojiDialog, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1.0f, 48, 16.0f, 16.0f, 16.0f, 16.0f));
        this.windowView.setClipChildren(false);
        if (i == i2 || (reactionsContainerLayout.getDelegate() != null && reactionsContainerLayout.getDelegate().drawBackground())) {
            this.selectAnimatedEmojiDialog.setBackgroundDelegate(new SelectAnimatedEmojiDialog.BackgroundDelegate() {
                @Override
                public final void drawRect(Canvas canvas, int i3, int i4, int i5, int i6, float f, float f2) {
                    CustomEmojiReactionsWindow.this.lambda$new$1(reactionsContainerLayout, canvas, i3, i4, i5, i6, f, f2);
                }
            });
        }
        if (this.attachToParent) {
            ((ViewGroup) reactionsContainerLayout.getParent()).addView(this.windowView);
        } else {
            WindowManager.LayoutParams createLayoutParams = createLayoutParams(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.windowManager = windowManager;
            windowManager.addView(this.windowView, createLayoutParams);
        }
        this.reactionsContainerLayout = reactionsContainerLayout;
        reactionsContainerLayout.setOnSwitchedToLoopView(new Runnable() {
            @Override
            public final void run() {
                CustomEmojiReactionsWindow.this.lambda$new$2();
            }
        });
        reactionsContainerLayout.prepareAnimation(i2);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CustomEmojiReactionsWindow.this.lambda$new$3(reactionsContainerLayout);
            }
        }, 50L);
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i3 = NotificationCenter.stopAllHeavyOperations;
        Object[] objArr = new Object[i2];
        objArr[0] = 7;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i3, objArr);
    }

    public void lambda$new$0(View view) {
        if (this.enterTransitionFinished) {
            dismiss();
        }
    }

    public class AnonymousClass2 extends SelectAnimatedEmojiDialog {
        final BaseFragment val$baseFragment;
        final ReactionsContainerLayout val$reactionsContainerLayout;

        AnonymousClass2(BaseFragment baseFragment, Context context, boolean z, Integer num, int i, boolean z2, Theme.ResourcesProvider resourcesProvider, int i2, ReactionsContainerLayout reactionsContainerLayout, BaseFragment baseFragment2) {
            super(baseFragment, context, z, num, i, z2, resourcesProvider, i2);
            this.val$reactionsContainerLayout = reactionsContainerLayout;
            this.val$baseFragment = baseFragment2;
        }

        @Override
        public boolean prevWindowKeyboardVisible() {
            if (this.val$reactionsContainerLayout.getDelegate() != null) {
                return this.val$reactionsContainerLayout.getDelegate().needEnterText();
            }
            return false;
        }

        @Override
        protected void onInputFocus() {
            if (CustomEmojiReactionsWindow.this.wasFocused) {
                return;
            }
            CustomEmojiReactionsWindow.this.wasFocused = true;
            CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
            if (!customEmojiReactionsWindow.attachToParent) {
                customEmojiReactionsWindow.windowManager.updateViewLayout(customEmojiReactionsWindow.windowView, customEmojiReactionsWindow.createLayoutParams(true));
            }
            BaseFragment baseFragment = this.val$baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ((ChatActivity) baseFragment).needEnterText();
            }
            if (this.val$reactionsContainerLayout.getDelegate() != null) {
                this.val$reactionsContainerLayout.getDelegate().needEnterText();
            }
        }

        @Override
        protected void onReactionClick(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            this.val$reactionsContainerLayout.onReactionClicked(imageViewEmoji, visibleReaction, false);
            AndroidUtilities.hideKeyboard(CustomEmojiReactionsWindow.this.windowView);
        }

        @Override
        protected void onEmojiSelected(View view, Long l, TLRPC$Document tLRPC$Document, Integer num) {
            if (this.val$baseFragment != null && this.val$reactionsContainerLayout.getWindowType() != 13 && !UserConfig.getInstance(this.val$baseFragment.getCurrentAccount()).isPremium()) {
                CustomEmojiReactionsWindow.this.windowView.performHapticFeedback(3);
                BulletinFactory.of(CustomEmojiReactionsWindow.this.windowView, null).createEmojiBulletin(tLRPC$Document, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiReaction", R.string.UnlockPremiumEmojiReaction)), LocaleController.getString("PremiumMore", R.string.PremiumMore), new Runnable() {
                    @Override
                    public final void run() {
                        CustomEmojiReactionsWindow.AnonymousClass2.this.lambda$onEmojiSelected$0();
                    }
                }).show();
            } else if (l == null && tLRPC$Document == null) {
            } else {
                if (tLRPC$Document != null) {
                    AnimatedEmojiDrawable.getDocumentFetcher(UserConfig.selectedAccount).putDocument(tLRPC$Document);
                }
                this.val$reactionsContainerLayout.onReactionClicked(view, ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(Long.valueOf(l == null ? tLRPC$Document.id : l.longValue())), false);
                AndroidUtilities.hideKeyboard(CustomEmojiReactionsWindow.this.windowView);
            }
        }

        public void lambda$onEmojiSelected$0() {
            CustomEmojiReactionsWindow.this.showUnlockPremiumAlert();
        }

        @Override
        public void invalidateParent() {
            CustomEmojiReactionsWindow.this.containerView.invalidate();
        }
    }

    public void lambda$new$1(ReactionsContainerLayout reactionsContainerLayout, Canvas canvas, int i, int i2, int i3, int i4, float f, float f2) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i, i2, i3, i4);
        reactionsContainerLayout.getDelegate().drawRoundRect(canvas, rectF, 0.0f, this.containerView.getX() + f, getBlurOffset() + f2, 255, true);
    }

    public void lambda$new$2() {
        this.containerView.invalidate();
    }

    public void lambda$new$3(ReactionsContainerLayout reactionsContainerLayout) {
        this.isShowing = true;
        this.containerView.invalidate();
        reactionsContainerLayout.prepareAnimation(false);
        createTransition(true);
    }

    public void updateWindowPosition() {
        if (this.dismissed) {
            return;
        }
        float f = this.yTranslation;
        int dp = AndroidUtilities.dp(32.0f);
        int i = this.type;
        if (i == 1 || i == 2) {
            dp = AndroidUtilities.dp(24.0f);
        }
        float f2 = dp;
        if (this.containerView.getMeasuredHeight() + f > (this.windowView.getMeasuredHeight() - this.keyboardHeight) - f2) {
            f = ((this.windowView.getMeasuredHeight() - this.keyboardHeight) - this.containerView.getMeasuredHeight()) - f2;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.containerView.animate().translationY(f).setDuration(250L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomEmojiReactionsWindow.this.lambda$updateWindowPosition$4(valueAnimator);
            }
        }).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
    }

    public void lambda$updateWindowPosition$4(ValueAnimator valueAnimator) {
        this.containerView.invalidate();
    }

    public WindowManager.LayoutParams createLayoutParams(boolean z) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i = this.type;
        layoutParams.type = (i == 0 || i == 3) ? 1000 : 99;
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
            return;
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.showDialog(new PremiumFeatureBottomSheet(this.baseFragment, 11, false));
        }
    }

    private void createTransition(final boolean z) {
        ValueAnimator ofFloat;
        this.fromRect.set(this.reactionsContainerLayout.rect);
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        this.fromRadius = reactionsContainerLayout.radius;
        int[] iArr = new int[2];
        if (z) {
            reactionsContainerLayout.getLocationOnScreen(this.location);
        }
        this.windowView.getLocationOnScreen(iArr);
        float dp = ((((this.location[1] - iArr[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (this.selectAnimatedEmojiDialog.includeHint ? AndroidUtilities.dp(26.0f) : 0)) + this.reactionsContainerLayout.getTopOffset();
        if (this.reactionsContainerLayout.showExpandableReactions()) {
            dp = (this.location[1] - iArr[1]) - AndroidUtilities.dp(12.0f);
        }
        if (this.containerView.getMeasuredHeight() + dp > this.windowView.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            dp = (this.windowView.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - this.containerView.getMeasuredHeight();
        }
        if (dp < AndroidUtilities.dp(16.0f)) {
            dp = AndroidUtilities.dp(16.0f);
        }
        int i = this.type;
        if (i == 1) {
            this.containerView.setTranslationX(((this.windowView.getMeasuredWidth() - this.containerView.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else if (i == 2 || i == 4) {
            this.containerView.setTranslationX((this.location[0] - iArr[0]) - AndroidUtilities.dp(18.0f));
        } else {
            this.containerView.setTranslationX((this.location[0] - iArr[0]) - AndroidUtilities.dp(2.0f));
        }
        if (!z) {
            this.yTranslation = this.containerView.getTranslationY();
        } else {
            this.yTranslation = dp;
            this.containerView.setTranslationY(dp);
        }
        RectF rectF = this.fromRect;
        float x = (this.location[0] - iArr[0]) - this.containerView.getX();
        this.fromRectTranslateX = x;
        float y = (this.location[1] - iArr[1]) - this.containerView.getY();
        this.fromRectTranslateY = y;
        rectF.offset(x, y);
        this.reactionsContainerLayout.setCustomEmojiEnterProgress(this.enterTransitionProgress);
        if (z) {
            this.cascadeAnimation = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
            this.enterTransitionFinished = false;
        } else {
            this.cascadeAnimation = false;
        }
        if (this.cascadeAnimation) {
            updateCascadeEnter(0.0f, true);
        }
        updateContainersAlpha();
        this.selectAnimatedEmojiDialog.setEnterAnimationInProgress(true);
        this.selectAnimatedEmojiDialog.emojiTabs.showRecentTabStub(z && this.cascadeAnimation);
        int i2 = UserConfig.selectedAccount;
        this.notificationsLocker.lock();
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.type == 4) {
            float[] fArr = new float[2];
            fArr[0] = this.enterTransitionProgress;
            fArr[1] = z ? 1.0f : 0.0f;
            ofFloat = ValueAnimator.ofFloat(fArr);
        } else {
            float[] fArr2 = new float[2];
            fArr2[0] = this.enterTransitionProgress;
            fArr2[1] = z ? 1.0f : 0.0f;
            ofFloat = StableAnimator.ofFloat(fArr2);
        }
        this.valueAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CustomEmojiReactionsWindow.this.lambda$createTransition$5(z, valueAnimator2);
            }
        });
        if (!z) {
            syncReactionFrames();
        }
        this.valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                CustomEmojiReactionsWindow.this.updateContainersAlpha();
                CustomEmojiReactionsWindow.this.updateContentPosition();
                CustomEmojiReactionsWindow.this.checkAnimationEnd(z);
                if (Build.VERSION.SDK_INT >= 21) {
                    CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.invalidateOutline();
                }
                CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
                boolean z2 = z;
                customEmojiReactionsWindow.enterTransitionProgress = z2 ? 1.0f : 0.0f;
                if (z2) {
                    customEmojiReactionsWindow.enterTransitionFinished = true;
                    customEmojiReactionsWindow.containerView.invalidate();
                }
                CustomEmojiReactionsWindow customEmojiReactionsWindow2 = CustomEmojiReactionsWindow.this;
                customEmojiReactionsWindow2.reactionsContainerLayout.setCustomEmojiEnterProgress(Utilities.clamp(customEmojiReactionsWindow2.enterTransitionProgress, 1.0f, 0.0f));
                if (z) {
                    return;
                }
                CustomEmojiReactionsWindow.this.reactionsContainerLayout.setSkipDraw(false);
                CustomEmojiReactionsWindow.this.removeView();
                Runtime.getRuntime().gc();
                CustomEmojiReactionsWindow.this.reactionsContainerLayout.setCustomEmojiReactionsBackground(true);
            }
        });
        if (this.type == 4) {
            this.valueAnimator.setDuration(420L);
            this.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        } else if (this.cascadeAnimation) {
            this.valueAnimator.setDuration(450L);
            this.valueAnimator.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.valueAnimator.setDuration(350L);
            this.valueAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        }
        this.containerView.invalidate();
        switchLayerType(true);
        if (!z) {
            ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsContainerLayout;
            reactionsContainerLayout2.isHiddenNextReaction = true;
            reactionsContainerLayout2.invalidate();
            this.valueAnimator.setStartDelay(30L);
            this.valueAnimator.start();
        } else {
            this.reactionsContainerLayout.setCustomEmojiReactionsBackground(false);
            final ValueAnimator valueAnimator2 = this.valueAnimator;
            Objects.requireNonNull(valueAnimator2);
            HwEmojis.prepare(new Runnable() {
                @Override
                public final void run() {
                    valueAnimator2.start();
                }
            }, this.cascadeAnimation);
        }
        HwEmojis.enableHw();
    }

    public void lambda$createTransition$5(boolean z, ValueAnimator valueAnimator) {
        this.valueAnimator = null;
        this.enterTransitionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateContainersAlpha();
        updateContentPosition();
        this.reactionsContainerLayout.setCustomEmojiEnterProgress(Utilities.clamp(this.enterTransitionProgress, 1.0f, 0.0f));
        this.invalidatePath = true;
        this.containerView.invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            this.selectAnimatedEmojiDialog.invalidateOutline();
        }
        if (this.cascadeAnimation) {
            updateCascadeEnter(this.enterTransitionProgress, z);
        }
    }

    public void updateContainersAlpha() {
        if (this.cascadeAnimation) {
            return;
        }
        this.selectAnimatedEmojiDialog.searchBox.setAlpha(this.enterTransitionProgress);
        this.selectAnimatedEmojiDialog.emojiGridView.setAlpha(this.enterTransitionProgress);
        this.selectAnimatedEmojiDialog.emojiSearchGridView.setAlpha(this.enterTransitionProgress);
        this.selectAnimatedEmojiDialog.emojiTabs.setAlpha(this.enterTransitionProgress);
        this.selectAnimatedEmojiDialog.emojiTabsShadow.setAlpha(this.enterTransitionProgress);
    }

    public void updateContentPosition() {
        this.selectAnimatedEmojiDialog.contentView.setTranslationX(this.cascadeAnimation ? 0.0f : this.containerView.enterTransitionOffsetX);
        this.selectAnimatedEmojiDialog.contentView.setTranslationY(this.containerView.enterTransitionOffsetY);
        this.selectAnimatedEmojiDialog.contentView.setPivotX(this.containerView.enterTransitionScalePx);
        this.selectAnimatedEmojiDialog.contentView.setPivotY(this.containerView.enterTransitionScalePy);
        this.selectAnimatedEmojiDialog.contentView.setScaleX(this.containerView.enterTransitionScale);
        this.selectAnimatedEmojiDialog.contentView.setScaleY(this.containerView.enterTransitionScale);
    }

    private void switchLayerType(boolean z) {
        int i = z ? 2 : 0;
        this.selectAnimatedEmojiDialog.emojiGridView.setLayerType(i, null);
        this.selectAnimatedEmojiDialog.searchBox.setLayerType(i, null);
        if (this.cascadeAnimation) {
            for (int i2 = 0; i2 < Math.min(this.selectAnimatedEmojiDialog.emojiTabs.contentView.getChildCount(), 16); i2++) {
                this.selectAnimatedEmojiDialog.emojiTabs.contentView.getChildAt(i2).setLayerType(i, null);
            }
            return;
        }
        this.selectAnimatedEmojiDialog.emojiTabsShadow.setLayerType(i, null);
        this.selectAnimatedEmojiDialog.emojiTabs.setLayerType(i, null);
    }

    private void setScaleForChild(View view, float f) {
        if (view instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
            ((SelectAnimatedEmojiDialog.ImageViewEmoji) view).setAnimatedScale(f);
        } else if (view instanceof EmojiTabsStrip.EmojiTabButton) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    private void updateCascadeEnter(float f, final boolean z) {
        int y = (int) (this.selectAnimatedEmojiDialog.getY() + this.selectAnimatedEmojiDialog.contentView.getY() + this.selectAnimatedEmojiDialog.emojiGridView.getY());
        final ArrayList arrayList = null;
        boolean z2 = false;
        for (int i = 0; i < this.selectAnimatedEmojiDialog.emojiGridView.getChildCount(); i++) {
            View childAt = this.selectAnimatedEmojiDialog.emojiGridView.getChildAt(i);
            if (!this.animatingEnterChild.contains(childAt)) {
                float top = childAt.getTop() + y + (childAt.getMeasuredHeight() / 2.0f);
                RectF rectF = this.drawingRect;
                if (top < rectF.bottom && top > rectF.top && f != 0.0f) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    this.animatingEnterChild.add(childAt);
                } else {
                    setScaleForChild(childAt, 0.0f);
                    z2 = true;
                }
            }
        }
        int y2 = (int) (this.selectAnimatedEmojiDialog.getY() + this.selectAnimatedEmojiDialog.contentView.getY() + this.selectAnimatedEmojiDialog.emojiTabs.getY());
        for (int i2 = 0; i2 < this.selectAnimatedEmojiDialog.emojiTabs.contentView.getChildCount(); i2++) {
            View childAt2 = this.selectAnimatedEmojiDialog.emojiTabs.contentView.getChildAt(i2);
            if (!this.animatingEnterChild.contains(childAt2)) {
                float top2 = childAt2.getTop() + y2 + (childAt2.getMeasuredHeight() / 2.0f);
                RectF rectF2 = this.drawingRect;
                if (top2 < rectF2.bottom && top2 > rectF2.top && f != 0.0f) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    this.animatingEnterChild.add(childAt2);
                } else {
                    setScaleForChild(childAt2, 0.0f);
                    z2 = true;
                }
            }
        }
        if (z2) {
            this.selectAnimatedEmojiDialog.emojiGridViewContainer.invalidate();
        }
        if (arrayList != null) {
            final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CustomEmojiReactionsWindow.this.lambda$updateCascadeEnter$6(arrayList, valueAnimator);
                }
            });
            this.animators.add(ofFloat);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CustomEmojiReactionsWindow.this.animators.remove(ofFloat);
                    CustomEmojiReactionsWindow.this.checkAnimationEnd(z);
                }
            });
            if (this.type == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public void lambda$updateCascadeEnter$6(ArrayList arrayList, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < arrayList.size(); i++) {
            setScaleForChild((View) arrayList.get(i), floatValue);
        }
        this.selectAnimatedEmojiDialog.emojiGridViewContainer.invalidate();
    }

    public void checkAnimationEnd(boolean z) {
        if (this.animators.isEmpty()) {
            switchLayerType(false);
            HwEmojis.disableHw();
            this.notificationsLocker.unlock();
            this.selectAnimatedEmojiDialog.setEnterAnimationInProgress(false);
            if (z) {
                this.selectAnimatedEmojiDialog.emojiTabs.showRecentTabStub(false);
                this.selectAnimatedEmojiDialog.emojiGridView.invalidate();
                this.selectAnimatedEmojiDialog.emojiGridView.invalidateViews();
                this.selectAnimatedEmojiDialog.searchBox.checkInitialization();
                if (this.reactionsContainerLayout.getPullingLeftProgress() > 0.0f) {
                    ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
                    reactionsContainerLayout.isHiddenNextReaction = false;
                    reactionsContainerLayout.onCustomEmojiWindowOpened();
                } else {
                    ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsContainerLayout;
                    reactionsContainerLayout2.isHiddenNextReaction = true;
                    reactionsContainerLayout2.onCustomEmojiWindowOpened();
                }
                this.selectAnimatedEmojiDialog.resetBackgroundBitmaps();
                syncReactionFrames();
                this.containerView.invalidate();
            }
        }
    }

    private void syncReactionFrames() {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CustomEmojiReactionsWindow.this.lambda$removeView$7();
            }
        });
    }

    public void lambda$removeView$7() {
        if (this.windowView.getParent() == null) {
            return;
        }
        if (this.attachToParent) {
            AndroidUtilities.removeFromParent(this.windowView);
        } else {
            try {
                this.windowManager.removeView(this.windowView);
            } catch (Exception unused) {
            }
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
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            reactionsContainerLayout.onCustomEmojiWindowClosing();
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
                CustomEmojiReactionsWindow.this.lambda$dismiss$8(valueAnimator);
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

    public void lambda$dismiss$8(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.dismissProgress = floatValue;
        this.containerView.setAlpha(1.0f - floatValue);
    }

    public boolean isShowing() {
        return !this.dismissed;
    }

    public void dismissWithAlpha() {
        if (this.dismissed) {
            return;
        }
        Bulletin.hideVisible();
        this.dismissed = true;
        AndroidUtilities.hideKeyboard(this.windowView);
        this.windowView.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                CustomEmojiReactionsWindow.this.checkAnimationEnd(false);
                CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
                customEmojiReactionsWindow.enterTransitionProgress = 0.0f;
                customEmojiReactionsWindow.reactionsContainerLayout.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                CustomEmojiReactionsWindow.this.reactionsContainerLayout.setSkipDraw(false);
                CustomEmojiReactionsWindow.this.windowView.setVisibility(8);
                CustomEmojiReactionsWindow.this.removeView();
            }
        });
        if (this.wasFocused) {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ((ChatActivity) baseFragment).onEditTextDialogClose(true, true);
            }
        }
    }

    public class ContainerView extends FrameLayout {
        Paint backgroundPaint;
        float enterTransitionOffsetX;
        float enterTransitionOffsetY;
        float enterTransitionScale;
        float enterTransitionScalePx;
        float enterTransitionScalePy;
        int[] radiusTmp;
        Drawable shadow;
        Rect shadowPad;
        HashMap<ReactionsLayoutInBubble.VisibleReaction, SelectAnimatedEmojiDialog.ImageViewEmoji> transitionReactions;

        public ContainerView(Context context) {
            super(context);
            this.shadowPad = new Rect();
            this.backgroundPaint = new Paint(1);
            this.radiusTmp = new int[4];
            this.transitionReactions = new HashMap<>();
            this.enterTransitionOffsetX = 0.0f;
            this.enterTransitionOffsetY = 0.0f;
            this.enterTransitionScale = 1.0f;
            this.enterTransitionScalePx = 0.0f;
            this.enterTransitionScalePy = 0.0f;
            this.shadow = ContextCompat.getDrawable(context, R.drawable.reactions_bubble_shadow).mutate();
            Rect rect = this.shadowPad;
            int dp = AndroidUtilities.dp(7.0f);
            rect.bottom = dp;
            rect.right = dp;
            rect.top = dp;
            rect.left = dp;
            this.shadow.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelShadow, CustomEmojiReactionsWindow.this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            if (CustomEmojiReactionsWindow.this.type == 2) {
                this.backgroundPaint.setColor(ColorUtils.blendARGB(-16777216, -1, 0.13f));
            } else {
                this.backgroundPaint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, CustomEmojiReactionsWindow.this.resourcesProvider));
            }
        }

        @Override
        public void invalidate() {
            ReactionsContainerLayout reactionsContainerLayout;
            super.invalidate();
            if (CustomEmojiReactionsWindow.this.type == 1 || !((reactionsContainerLayout = CustomEmojiReactionsWindow.this.reactionsContainerLayout) == null || reactionsContainerLayout.getDelegate() == null || !CustomEmojiReactionsWindow.this.reactionsContainerLayout.getDelegate().drawBackground())) {
                CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.invalidateSearchBox();
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int measuredWidth;
            int i3;
            int dp;
            int dp2;
            if (CustomEmojiReactionsWindow.this.type == 1 || CustomEmojiReactionsWindow.this.type == 2 || CustomEmojiReactionsWindow.this.type == 4) {
                measuredWidth = CustomEmojiReactionsWindow.this.reactionsContainerLayout.getMeasuredWidth();
            } else {
                measuredWidth = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                int dp3 = (AndroidUtilities.dp(36.0f) * 8) + AndroidUtilities.dp(12.0f);
                if (dp3 < measuredWidth) {
                    measuredWidth = dp3;
                }
            }
            if (CustomEmojiReactionsWindow.this.type == 4) {
                dp = AndroidUtilities.dp(36.0f) * 8;
                dp2 = AndroidUtilities.dp(8.0f);
            } else {
                if (CustomEmojiReactionsWindow.this.reactionsContainerLayout.showExpandableReactions()) {
                    int ceil = (int) Math.ceil(CustomEmojiReactionsWindow.this.reactions.size() / 8.0f);
                    if (ceil <= 8) {
                        i3 = (ceil * AndroidUtilities.dp(36.0f)) + AndroidUtilities.dp(8.0f);
                    } else {
                        dp = AndroidUtilities.dp(36.0f) * 8;
                        dp2 = AndroidUtilities.dp(8.0f);
                    }
                } else {
                    i3 = measuredWidth;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            }
            i3 = dp - dp2;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float f;
            boolean z;
            int i;
            int y;
            View childAt;
            int i2;
            int i3;
            float f2;
            int i4;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            boolean z2;
            float f8;
            float f9;
            float f10;
            float f11;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction;
            CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
            if (customEmojiReactionsWindow.isShowing) {
                float f12 = 1.0f;
                float clamp = Utilities.clamp(customEmojiReactionsWindow.enterTransitionProgress, 1.0f, 0.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                int i5 = 4;
                if (CustomEmojiReactionsWindow.this.type == 4) {
                    CustomEmojiReactionsWindow customEmojiReactionsWindow2 = CustomEmojiReactionsWindow.this;
                    customEmojiReactionsWindow2.fromRect.set(customEmojiReactionsWindow2.reactionsContainerLayout.rect);
                    CustomEmojiReactionsWindow customEmojiReactionsWindow3 = CustomEmojiReactionsWindow.this;
                    customEmojiReactionsWindow3.fromRect.offset(customEmojiReactionsWindow3.fromRectTranslateX, customEmojiReactionsWindow3.fromRectTranslateY);
                }
                CustomEmojiReactionsWindow customEmojiReactionsWindow4 = CustomEmojiReactionsWindow.this;
                AndroidUtilities.lerp(customEmojiReactionsWindow4.fromRect, rectF, customEmojiReactionsWindow4.enterTransitionProgress, customEmojiReactionsWindow4.drawingRect);
                float lerp = AndroidUtilities.lerp(CustomEmojiReactionsWindow.this.fromRadius, AndroidUtilities.dp(8.0f), CustomEmojiReactionsWindow.this.enterTransitionProgress);
                this.transitionReactions.clear();
                if (CustomEmojiReactionsWindow.this.type == 1 || (CustomEmojiReactionsWindow.this.reactionsContainerLayout.getDelegate() != null && CustomEmojiReactionsWindow.this.reactionsContainerLayout.getDelegate().drawBackground())) {
                    CustomEmojiReactionsWindow.this.reactionsContainerLayout.getDelegate().drawRoundRect(canvas, CustomEmojiReactionsWindow.this.drawingRect, lerp, getX(), CustomEmojiReactionsWindow.this.getBlurOffset(), 255, true);
                } else {
                    this.shadow.setAlpha((int) (Utilities.clamp(clamp / 0.05f, 1.0f, 0.0f) * 255.0f));
                    Drawable drawable = this.shadow;
                    RectF rectF2 = CustomEmojiReactionsWindow.this.drawingRect;
                    Rect rect = this.shadowPad;
                    drawable.setBounds(((int) rectF2.left) - rect.left, ((int) rectF2.top) - rect.top, ((int) rectF2.right) + rect.right, ((int) rectF2.bottom) + rect.bottom);
                    this.shadow.draw(canvas);
                    canvas.drawRoundRect(CustomEmojiReactionsWindow.this.drawingRect, lerp, lerp, this.backgroundPaint);
                }
                if (CustomEmojiReactionsWindow.this.reactionsContainerLayout.hintView != null) {
                    canvas.save();
                    CustomEmojiReactionsWindow customEmojiReactionsWindow5 = CustomEmojiReactionsWindow.this;
                    RectF rectF3 = customEmojiReactionsWindow5.drawingRect;
                    canvas.translate(rectF3.left, (rectF3.top + customEmojiReactionsWindow5.reactionsContainerLayout.hintView.getY()) - ((CustomEmojiReactionsWindow.this.type == 3 || CustomEmojiReactionsWindow.this.type == 4) ? CustomEmojiReactionsWindow.this.reactionsContainerLayout.rect.top : 0.0f));
                    canvas.saveLayerAlpha(0.0f, 0.0f, CustomEmojiReactionsWindow.this.reactionsContainerLayout.hintView.getMeasuredWidth(), CustomEmojiReactionsWindow.this.reactionsContainerLayout.hintView.getMeasuredHeight(), (int) (CustomEmojiReactionsWindow.this.reactionsContainerLayout.hintView.getAlpha() * 255.0f * (1.0f - CustomEmojiReactionsWindow.this.enterTransitionProgress)), 31);
                    CustomEmojiReactionsWindow.this.reactionsContainerLayout.hintView.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                }
                CustomEmojiReactionsWindow customEmojiReactionsWindow6 = CustomEmojiReactionsWindow.this;
                RectF rectF4 = customEmojiReactionsWindow6.drawingRect;
                float width = (rectF4.left - customEmojiReactionsWindow6.reactionsContainerLayout.rect.left) + (rectF4.width() - CustomEmojiReactionsWindow.this.reactionsContainerLayout.rect.width());
                if (CustomEmojiReactionsWindow.this.enterTransitionProgress > 0.05f) {
                    canvas.save();
                    CustomEmojiReactionsWindow customEmojiReactionsWindow7 = CustomEmojiReactionsWindow.this;
                    RectF rectF5 = customEmojiReactionsWindow7.drawingRect;
                    canvas.translate(width, (rectF5.top - customEmojiReactionsWindow7.reactionsContainerLayout.rect.top) + (rectF5.height() - CustomEmojiReactionsWindow.this.reactionsContainerLayout.rect.height()));
                    CustomEmojiReactionsWindow.this.reactionsContainerLayout.drawBubbles(canvas);
                    canvas.restore();
                }
                this.enterTransitionOffsetX = 0.0f;
                this.enterTransitionOffsetY = 0.0f;
                this.enterTransitionScale = 1.0f;
                this.enterTransitionScalePx = 0.0f;
                this.enterTransitionScalePy = 0.0f;
                CustomEmojiReactionsWindow customEmojiReactionsWindow8 = CustomEmojiReactionsWindow.this;
                if (customEmojiReactionsWindow8.reactionsContainerLayout != null) {
                    for (int childCount = customEmojiReactionsWindow8.selectAnimatedEmojiDialog.emojiGridView.getChildCount() - 1; childCount >= 0; childCount--) {
                        if (CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getChildAt(childCount) instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                            SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = (SelectAnimatedEmojiDialog.ImageViewEmoji) CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getChildAt(childCount);
                            if (imageViewEmoji.isFirstReactions && (visibleReaction = imageViewEmoji.reaction) != null) {
                                this.transitionReactions.put(visibleReaction, imageViewEmoji);
                            }
                        }
                    }
                    int save = canvas.save();
                    CustomEmojiReactionsWindow customEmojiReactionsWindow9 = CustomEmojiReactionsWindow.this;
                    RectF rectF6 = customEmojiReactionsWindow9.drawingRect;
                    canvas.translate(rectF6.left, rectF6.top + ((customEmojiReactionsWindow9.reactionsContainerLayout.getTopOffset() + CustomEmojiReactionsWindow.this.reactionsContainerLayout.expandSize()) * (1.0f - CustomEmojiReactionsWindow.this.enterTransitionProgress)));
                    float max = Math.max(1.0f - (CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiSearchGridView.getVisibility() == 0 ? CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiSearchGridView.getAlpha() : 0.0f), 1.0f - CustomEmojiReactionsWindow.this.enterTransitionProgress);
                    if (max != 1.0f) {
                        i = save;
                        canvas.saveLayerAlpha(0.0f, 0.0f, CustomEmojiReactionsWindow.this.drawingRect.width(), CustomEmojiReactionsWindow.this.drawingRect.height(), (int) (max * 255.0f), 31);
                    } else {
                        i = save;
                    }
                    int x = (int) (CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.getX() + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getX());
                    canvas.clipRect((int) (CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.getY() + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getY()), CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiTabs.getParent() != null ? x + (AndroidUtilities.dp(36.0f) * CustomEmojiReactionsWindow.this.enterTransitionProgress) : 0.0f, y + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getMeasuredWidth(), x + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getMeasuredHeight());
                    int i6 = -1;
                    int i7 = -1;
                    while (i7 < CustomEmojiReactionsWindow.this.reactionsContainerLayout.recyclerListView.getChildCount()) {
                        if (i7 == i6) {
                            childAt = CustomEmojiReactionsWindow.this.reactionsContainerLayout.nextRecentReaction;
                        } else {
                            childAt = CustomEmojiReactionsWindow.this.reactionsContainerLayout.recyclerListView.getChildAt(i7);
                        }
                        View view = childAt;
                        if (view.getLeft() < 0 || view.getVisibility() == 8) {
                            i2 = i7;
                            i3 = i;
                            f2 = lerp;
                        } else {
                            canvas.save();
                            if (view instanceof ReactionsContainerLayout.ReactionHolderView) {
                                ReactionsContainerLayout.ReactionHolderView reactionHolderView = (ReactionsContainerLayout.ReactionHolderView) view;
                                SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji2 = this.transitionReactions.get(reactionHolderView.currentReaction);
                                if (imageViewEmoji2 != null) {
                                    float x2 = view.getX();
                                    float y2 = view.getY();
                                    if (i7 == i6) {
                                        x2 -= CustomEmojiReactionsWindow.this.reactionsContainerLayout.recyclerListView.getX();
                                        y2 -= CustomEmojiReactionsWindow.this.reactionsContainerLayout.recyclerListView.getY();
                                    }
                                    float x3 = (((imageViewEmoji2.getX() + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.getX()) + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getX()) - reactionHolderView.loopImageView.getX()) - AndroidUtilities.dp(f12);
                                    float y3 = (((imageViewEmoji2.getY() + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.getY()) + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.gridViewContainer.getY()) + CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.emojiGridView.getY()) - reactionHolderView.loopImageView.getY();
                                    float measuredWidth = imageViewEmoji2.getMeasuredWidth();
                                    if (imageViewEmoji2.selected || CustomEmojiReactionsWindow.this.type == i5) {
                                        if (CustomEmojiReactionsWindow.this.type == i5) {
                                            f8 = 0.87f * measuredWidth;
                                            x3 -= AndroidUtilities.dp(0.33f);
                                            y3 -= AndroidUtilities.dp(1.33f);
                                        } else {
                                            f8 = measuredWidth;
                                        }
                                        if (imageViewEmoji2.selected) {
                                            f8 *= 0.86f;
                                        }
                                        float f13 = (measuredWidth - f8) / 2.0f;
                                        x3 += f13;
                                        y3 += f13;
                                        measuredWidth = f8;
                                    }
                                    float lerp2 = AndroidUtilities.lerp(x2, x3, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                    float lerp3 = AndroidUtilities.lerp(y2, y3, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                    float measuredWidth2 = measuredWidth / reactionHolderView.loopImageView.getMeasuredWidth();
                                    i4 = i7;
                                    f3 = AndroidUtilities.lerp(1.0f, measuredWidth2, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                    if (reactionHolderView.position == 0) {
                                        f6 = AndroidUtilities.dp(6.0f);
                                        f10 = f6;
                                        f9 = 0.0f;
                                    } else if (reactionHolderView.selected) {
                                        f6 = AndroidUtilities.dp(6.0f);
                                        f9 = f6;
                                        f10 = f9;
                                        f11 = f10;
                                        canvas.translate(lerp2, lerp3);
                                        canvas.scale(f3, f3);
                                        if (this.enterTransitionOffsetX == 0.0f && this.enterTransitionOffsetY == 0.0f) {
                                            CustomEmojiReactionsWindow customEmojiReactionsWindow10 = CustomEmojiReactionsWindow.this;
                                            this.enterTransitionOffsetX = AndroidUtilities.lerp((customEmojiReactionsWindow10.fromRect.left + x2) - x3, 0.0f, customEmojiReactionsWindow10.enterTransitionProgress);
                                            CustomEmojiReactionsWindow customEmojiReactionsWindow11 = CustomEmojiReactionsWindow.this;
                                            this.enterTransitionOffsetY = AndroidUtilities.lerp((customEmojiReactionsWindow11.fromRect.top + y2) - y3, 0.0f, customEmojiReactionsWindow11.enterTransitionProgress);
                                            this.enterTransitionScale = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                            this.enterTransitionScalePx = x3;
                                            this.enterTransitionScalePy = y3;
                                        }
                                        f4 = f9;
                                        f5 = f10;
                                        f7 = f11;
                                    } else {
                                        f6 = 0.0f;
                                        f9 = 0.0f;
                                        f10 = 0.0f;
                                    }
                                    f11 = 0.0f;
                                    canvas.translate(lerp2, lerp3);
                                    canvas.scale(f3, f3);
                                    if (this.enterTransitionOffsetX == 0.0f) {
                                        CustomEmojiReactionsWindow customEmojiReactionsWindow102 = CustomEmojiReactionsWindow.this;
                                        this.enterTransitionOffsetX = AndroidUtilities.lerp((customEmojiReactionsWindow102.fromRect.left + x2) - x3, 0.0f, customEmojiReactionsWindow102.enterTransitionProgress);
                                        CustomEmojiReactionsWindow customEmojiReactionsWindow112 = CustomEmojiReactionsWindow.this;
                                        this.enterTransitionOffsetY = AndroidUtilities.lerp((customEmojiReactionsWindow112.fromRect.top + y2) - y3, 0.0f, customEmojiReactionsWindow112.enterTransitionProgress);
                                        this.enterTransitionScale = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                        this.enterTransitionScalePx = x3;
                                        this.enterTransitionScalePy = y3;
                                    }
                                    f4 = f9;
                                    f5 = f10;
                                    f7 = f11;
                                } else {
                                    i4 = i7;
                                    canvas.translate(view.getX() + reactionHolderView.loopImageView.getX(), view.getY() + reactionHolderView.loopImageView.getY());
                                    f3 = 1.0f;
                                    f4 = 0.0f;
                                    f5 = 0.0f;
                                    f6 = 0.0f;
                                    f7 = 0.0f;
                                }
                                if (imageViewEmoji2 != null) {
                                    if (imageViewEmoji2.selected) {
                                        float measuredWidth3 = reactionHolderView.getMeasuredWidth() / 2.0f;
                                        float measuredHeight = reactionHolderView.getMeasuredHeight() / 2.0f;
                                        float measuredWidth4 = reactionHolderView.getMeasuredWidth() - AndroidUtilities.dp(2.0f);
                                        float lerp4 = AndroidUtilities.lerp(measuredWidth4, (imageViewEmoji2.getMeasuredWidth() - AndroidUtilities.dp(2.0f)) / f3, CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                        RectF rectF7 = AndroidUtilities.rectTmp;
                                        float f14 = lerp4 / 2.0f;
                                        f2 = lerp;
                                        i3 = i;
                                        rectF7.set(measuredWidth3 - f14, measuredHeight - f14, measuredWidth3 + f14, measuredHeight + f14);
                                        float lerp5 = AndroidUtilities.lerp(measuredWidth4 / 2.0f, AndroidUtilities.dp(4.0f), CustomEmojiReactionsWindow.this.enterTransitionProgress);
                                        canvas.drawRoundRect(rectF7, lerp5, lerp5, CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.selectorPaint);
                                    } else {
                                        i3 = i;
                                        f2 = lerp;
                                    }
                                    reactionHolderView.drawSelected = false;
                                    if (f5 != 0.0f) {
                                        ImageReceiver imageReceiver = reactionHolderView.loopImageView.getImageReceiver();
                                        reactionHolderView.checkPlayLoopImage();
                                        AnimatedEmojiDrawable animatedEmojiDrawable = reactionHolderView.loopImageView.animatedEmojiDrawable;
                                        if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                                            imageReceiver = reactionHolderView.loopImageView.animatedEmojiDrawable.getImageReceiver();
                                        }
                                        int[] roundRadius = imageReceiver.getRoundRadius();
                                        for (int i8 = 0; i8 < 4; i8++) {
                                            this.radiusTmp[i8] = roundRadius[i8];
                                        }
                                        imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(f6, 0.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress), (int) AndroidUtilities.lerp(f4, 0.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress), (int) AndroidUtilities.lerp(f7, 0.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress), (int) AndroidUtilities.lerp(f5, 0.0f, CustomEmojiReactionsWindow.this.enterTransitionProgress));
                                        reactionHolderView.draw(canvas);
                                        imageReceiver.setRoundRadius(this.radiusTmp);
                                        z2 = true;
                                    } else {
                                        reactionHolderView.draw(canvas);
                                        z2 = true;
                                    }
                                    reactionHolderView.drawSelected = z2;
                                    if (!imageViewEmoji2.notDraw) {
                                        imageViewEmoji2.notDraw = z2;
                                        imageViewEmoji2.invalidate();
                                    }
                                } else {
                                    i3 = i;
                                    f2 = lerp;
                                    if (reactionHolderView.hasEnterAnimation && reactionHolderView.loopImageView.getImageReceiver().getLottieAnimation() == null) {
                                        float alpha = reactionHolderView.enterImageView.getImageReceiver().getAlpha();
                                        reactionHolderView.enterImageView.getImageReceiver().setAlpha((1.0f - clamp) * alpha);
                                        reactionHolderView.enterImageView.draw(canvas);
                                        reactionHolderView.enterImageView.getImageReceiver().setAlpha(alpha);
                                    } else {
                                        reactionHolderView.checkPlayLoopImage();
                                        ImageReceiver imageReceiver2 = reactionHolderView.loopImageView.getImageReceiver();
                                        AnimatedEmojiDrawable animatedEmojiDrawable2 = reactionHolderView.loopImageView.animatedEmojiDrawable;
                                        if (animatedEmojiDrawable2 != null && animatedEmojiDrawable2.getImageReceiver() != null) {
                                            imageReceiver2 = reactionHolderView.loopImageView.animatedEmojiDrawable.getImageReceiver();
                                        }
                                        float alpha2 = imageReceiver2.getAlpha();
                                        imageReceiver2.setAlpha((1.0f - clamp) * alpha2);
                                        reactionHolderView.loopImageView.draw(canvas);
                                        imageReceiver2.setAlpha(alpha2);
                                    }
                                }
                                if (reactionHolderView.loopImageView.getVisibility() != 0) {
                                    invalidate();
                                }
                                i2 = i4;
                            } else {
                                i3 = i;
                                f2 = lerp;
                                float x4 = (view.getX() + CustomEmojiReactionsWindow.this.drawingRect.width()) - CustomEmojiReactionsWindow.this.reactionsContainerLayout.rect.width();
                                float y4 = view.getY();
                                CustomEmojiReactionsWindow customEmojiReactionsWindow12 = CustomEmojiReactionsWindow.this;
                                canvas.translate(x4, (y4 + customEmojiReactionsWindow12.fromRect.top) - customEmojiReactionsWindow12.drawingRect.top);
                                i2 = i7;
                                canvas.saveLayerAlpha(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight(), (int) ((1.0f - clamp) * 255.0f), 31);
                                float f15 = CustomEmojiReactionsWindow.this.enterTransitionProgress;
                                canvas.scale(1.0f - f15, 1.0f - f15, view.getMeasuredWidth() >> 1, view.getMeasuredHeight() >> 1);
                                view.draw(canvas);
                                canvas.restore();
                            }
                            canvas.restore();
                        }
                        i7 = i2 + 1;
                        lerp = f2;
                        i = i3;
                        i6 = -1;
                        f12 = 1.0f;
                        i5 = 4;
                    }
                    int i9 = i;
                    f = lerp;
                    z = true;
                    canvas.restoreToCount(i9);
                } else {
                    f = lerp;
                    z = true;
                }
                if (Build.VERSION.SDK_INT < 21) {
                    if (CustomEmojiReactionsWindow.this.invalidatePath) {
                        CustomEmojiReactionsWindow.this.invalidatePath = false;
                        CustomEmojiReactionsWindow.this.pathToClipApi20.rewind();
                        float f16 = f;
                        CustomEmojiReactionsWindow.this.pathToClipApi20.addRoundRect(CustomEmojiReactionsWindow.this.drawingRect, f16, f16, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.clipPath(CustomEmojiReactionsWindow.this.pathToClipApi20);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                } else {
                    super.dispatchDraw(canvas);
                }
                if (CustomEmojiReactionsWindow.this.frameDrawCount < 5) {
                    if (CustomEmojiReactionsWindow.this.frameDrawCount == 3) {
                        CustomEmojiReactionsWindow.this.reactionsContainerLayout.setSkipDraw(z);
                    }
                    CustomEmojiReactionsWindow.access$1108(CustomEmojiReactionsWindow.this);
                }
                CustomEmojiReactionsWindow.this.selectAnimatedEmojiDialog.drawBigReaction(canvas, this);
                if (CustomEmojiReactionsWindow.this.valueAnimator != null) {
                    invalidate();
                }
                HwEmojis.exec();
            }
        }
    }

    public float getBlurOffset() {
        if (this.type == 1) {
            return this.containerView.getY() - AndroidUtilities.statusBarHeight;
        }
        return this.containerView.getY() + this.windowView.getY();
    }

    public SelectAnimatedEmojiDialog getSelectAnimatedEmojiDialog() {
        return this.selectAnimatedEmojiDialog;
    }
}
