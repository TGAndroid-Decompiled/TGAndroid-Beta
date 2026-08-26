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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.DispatchQueuePriority;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda13;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.StableAnimator;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.SuperRipple$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class CustomEmojiReactionsWindow {
    public final HashSet animatingEnterChild;
    public final ArrayList animators;
    public final boolean attachToParent;
    public final BaseFragment baseFragment;
    public BlurredBackgroundDrawable blurredBackgroundDrawable;
    public boolean cascadeAnimation;
    public final ContainerView containerView;
    public boolean dismissed;
    public boolean enterTransitionFinished;
    public float enterTransitionProgress;
    public int frameDrawCount;
    public float fromRadius;
    public float fromRectTranslateX;
    public float fromRectTranslateY;
    public boolean isShowing;
    public float keyboardHeight;
    public final int[] location;
    public final AnimationNotificationsLocker notificationsLocker;
    public Tooltip$$ExternalSyntheticLambda0 onDismiss;
    public final List reactions;
    public final ReactionsContainerLayout reactionsContainerLayout;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnonymousClass2 selectAnimatedEmojiDialog;
    public boolean transition;
    public final int type;
    public ValueAnimator valueAnimator;
    public boolean wasFocused;
    public final WindowManager windowManager;
    public final AnonymousClass1 windowView;
    public float yTranslation;
    public final RectF fromRect = new RectF();
    public final RectF drawingRect = new RectF();

    public final class AnonymousClass2 extends SelectAnimatedEmojiDialog {
        public final BaseFragment val$baseFragment;
        public final ReactionsContainerLayout val$reactionsContainerLayout;

        public AnonymousClass2(BaseFragment baseFragment, Context context, int i, boolean z, Theme.ResourcesProvider resourcesProvider, ReactionsContainerLayout reactionsContainerLayout, BaseFragment baseFragment2) {
            super(baseFragment, context, false, null, i, z, resourcesProvider, 16);
            this.val$reactionsContainerLayout = reactionsContainerLayout;
            this.val$baseFragment = baseFragment2;
        }

        @Override
        public final void lambda$new$3() {
            CustomEmojiReactionsWindow.this.containerView.invalidate();
        }

        @Override
        public final void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
            ReactionsContainerLayout reactionsContainerLayout = this.val$reactionsContainerLayout;
            CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
            BaseFragment baseFragment = this.val$baseFragment;
            if (baseFragment != null && !reactionsContainerLayout.channelReactions && reactionsContainerLayout.getWindowType() != 13 && !UserConfig.getInstance(baseFragment.getCurrentAccount()).isPremium()) {
                try {
                    customEmojiReactionsWindow.windowView.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                BulletinFactory.of(customEmojiReactionsWindow.windowView, null).createEmojiBulletin(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new GiftSheet$$ExternalSyntheticLambda9(this, 7)).show();
                return;
            }
            if (l == null && document == null) {
                return;
            }
            if (document != null) {
                AnimatedEmojiDrawable.getDocumentFetcher(UserConfig.selectedAccount).putDocument(document);
            }
            long jLongValue = l == null ? document.id : l.longValue();
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = new ReactionsLayoutInBubble.VisibleReaction();
            visibleReaction.documentId = jLongValue;
            visibleReaction.hash = jLongValue;
            reactionsContainerLayout.onReactionClicked(view, visibleReaction, false);
            AndroidUtilities.hideKeyboard(customEmojiReactionsWindow.windowView);
        }

        @Override
        public final void onInputFocus() {
            CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
            if (customEmojiReactionsWindow.wasFocused) {
                return;
            }
            customEmojiReactionsWindow.wasFocused = true;
            if (!customEmojiReactionsWindow.attachToParent) {
                customEmojiReactionsWindow.windowManager.updateViewLayout(customEmojiReactionsWindow.windowView, customEmojiReactionsWindow.createLayoutParams(true));
            }
            BaseFragment baseFragment = this.val$baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ((ChatActivity) baseFragment).needEnterText();
            }
            ReactionsContainerLayout reactionsContainerLayout = this.val$reactionsContainerLayout;
            if (reactionsContainerLayout.getDelegate() != null) {
                reactionsContainerLayout.getDelegate().needEnterText();
            }
        }

        @Override
        public final void onReactionClick(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            this.val$reactionsContainerLayout.onReactionClicked(imageViewEmoji, visibleReaction, false);
            AndroidUtilities.hideKeyboard(CustomEmojiReactionsWindow.this.windowView);
        }

        @Override
        public final boolean prevWindowKeyboardVisible() {
            ReactionsContainerLayout reactionsContainerLayout = this.val$reactionsContainerLayout;
            if (reactionsContainerLayout.getDelegate() != null) {
                return reactionsContainerLayout.getDelegate().needEnterText();
            }
            return false;
        }
    }

    public final class AnonymousClass8 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final CustomEmojiReactionsWindow this$0;

        public AnonymousClass8(CustomEmojiReactionsWindow customEmojiReactionsWindow, int i) {
            this.$r8$classId = i;
            this.this$0 = customEmojiReactionsWindow;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.removeView();
                    break;
                default:
                    CustomEmojiReactionsWindow customEmojiReactionsWindow = this.this$0;
                    CustomEmojiReactionsWindow.access$600(customEmojiReactionsWindow, false);
                    customEmojiReactionsWindow.enterTransitionProgress = 0.0f;
                    customEmojiReactionsWindow.reactionsContainerLayout.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                    customEmojiReactionsWindow.reactionsContainerLayout.setSkipDraw(false);
                    customEmojiReactionsWindow.windowView.setVisibility(8);
                    customEmojiReactionsWindow.removeView();
                    break;
            }
        }
    }

    public final class ContainerView extends FrameLayout {
        public final Paint backgroundPaint;
        public final Path clipPath;
        public float enterTransitionOffsetX;
        public float enterTransitionOffsetY;
        public float enterTransitionScale;
        public float enterTransitionScalePx;
        public float enterTransitionScalePy;
        public final int[] radiusTmp;
        public final Drawable shadow;
        public final Rect shadowPad;
        public final HashMap transitionReactions;

        public ContainerView(Context context) {
            super(context);
            Rect rect = new Rect();
            this.shadowPad = rect;
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            this.radiusTmp = new int[4];
            this.transitionReactions = new HashMap();
            this.enterTransitionOffsetX = 0.0f;
            this.enterTransitionOffsetY = 0.0f;
            this.enterTransitionScale = 1.0f;
            this.enterTransitionScalePx = 0.0f;
            this.enterTransitionScalePy = 0.0f;
            this.clipPath = new Path();
            Drawable drawableMutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
            this.shadow = drawableMutate;
            int iDp = AndroidUtilities.dp(7.0f);
            rect.bottom = iDp;
            rect.right = iDp;
            rect.top = iDp;
            rect.left = iDp;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelShadow, CustomEmojiReactionsWindow.this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            if (CustomEmojiReactionsWindow.this.type == 2) {
                paint.setColor(ColorUtils.blendARGB(0.13f, -16777216, -1));
            } else {
                paint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, CustomEmojiReactionsWindow.this.resourcesProvider));
            }
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f;
            HashMap map;
            int i;
            int i2;
            float f2;
            int i3;
            int i4;
            HashMap map2;
            int i5;
            RectF rectF;
            RectF rectF2;
            float f3;
            float f4;
            float f5;
            float f6;
            float fDp;
            float fLerp;
            int[] iArr;
            int i6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float measuredWidth;
            float f12;
            float f13;
            float f14;
            HashMap map3;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction;
            Canvas canvas2 = canvas;
            CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
            if (customEmojiReactionsWindow.isShowing) {
                float fClamp = Utilities.clamp(customEmojiReactionsWindow.enterTransitionProgress, 1.0f, 0.0f);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                RectF rectF4 = customEmojiReactionsWindow.fromRect;
                int i7 = customEmojiReactionsWindow.type;
                ReactionsContainerLayout reactionsContainerLayout = customEmojiReactionsWindow.reactionsContainerLayout;
                if (i7 == 4) {
                    rectF4.set(reactionsContainerLayout.rect);
                    rectF4.offset(customEmojiReactionsWindow.fromRectTranslateX, customEmojiReactionsWindow.fromRectTranslateY);
                }
                float f15 = customEmojiReactionsWindow.enterTransitionProgress;
                RectF rectF5 = customEmojiReactionsWindow.drawingRect;
                AndroidUtilities.lerp(rectF4, rectF3, f15, rectF5);
                float fLerp2 = AndroidUtilities.lerp(customEmojiReactionsWindow.fromRadius, AndroidUtilities.dp(i7 == 5 ? 20.0f : 8.0f), customEmojiReactionsWindow.enterTransitionProgress);
                HashMap map4 = this.transitionReactions;
                map4.clear();
                if (i7 == 1 || (reactionsContainerLayout.getDelegate() != null && reactionsContainerLayout.getDelegate().drawBackground())) {
                    f = 1.0f;
                    ReactionsContainerLayout.ReactionsContainerDelegate delegate = reactionsContainerLayout.getDelegate();
                    float x = getX();
                    ContainerView containerView = customEmojiReactionsWindow.containerView;
                    map = map4;
                    i = 5;
                    i2 = 4;
                    delegate.drawRoundRect(canvas, rectF5, fLerp2, x, i7 == 1 ? containerView.getY() - AndroidUtilities.statusBarHeight : containerView.getY() + customEmojiReactionsWindow.windowView.getY(), 255, true);
                    canvas2 = canvas;
                } else {
                    int iClamp = (int) (Utilities.clamp(fClamp / 0.05f, 1.0f, 0.0f) * 255.0f);
                    Drawable drawable = this.shadow;
                    drawable.setAlpha(iClamp);
                    int i8 = (int) rectF5.left;
                    f = 1.0f;
                    Rect rect = this.shadowPad;
                    drawable.setBounds(i8 - rect.left, ((int) rectF5.top) - rect.top, ((int) rectF5.right) + rect.right, ((int) rectF5.bottom) + rect.bottom);
                    BlurredBackgroundDrawable blurredBackgroundDrawable = customEmojiReactionsWindow.blurredBackgroundDrawable;
                    Paint paint = this.backgroundPaint;
                    if (blurredBackgroundDrawable != null) {
                        rectF3.set(rectF5);
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rectF3.round(rect2);
                        rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                        customEmojiReactionsWindow.blurredBackgroundDrawable.setBounds(rect2);
                        customEmojiReactionsWindow.blurredBackgroundDrawable.setAlpha(paint.getAlpha());
                        customEmojiReactionsWindow.blurredBackgroundDrawable.setRadius(fLerp2);
                        customEmojiReactionsWindow.blurredBackgroundDrawable.draw(canvas2);
                    } else {
                        drawable.draw(canvas2);
                        canvas2.drawRoundRect(rectF5, fLerp2, fLerp2, paint);
                    }
                    map = map4;
                    i = 5;
                    i2 = 4;
                }
                if (reactionsContainerLayout.hintView != null) {
                    canvas2.save();
                    canvas2.translate(rectF5.left, (reactionsContainerLayout.hintView.getY() + rectF5.top) - ((i7 == 3 || i7 == i2 || i7 == i) ? reactionsContainerLayout.rect.top : 0.0f));
                    f2 = fLerp2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, reactionsContainerLayout.hintView.getMeasuredWidth(), reactionsContainerLayout.hintView.getMeasuredHeight(), (int) ((f - customEmojiReactionsWindow.enterTransitionProgress) * reactionsContainerLayout.hintView.getAlpha() * 255.0f), 31);
                    reactionsContainerLayout.hintView.draw(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                } else {
                    f2 = fLerp2;
                }
                float fWidth = (rectF5.width() - reactionsContainerLayout.rect.width()) + (rectF5.left - reactionsContainerLayout.rect.left);
                if (customEmojiReactionsWindow.enterTransitionProgress > 0.05f || i7 == i) {
                    canvas2.save();
                    canvas2.translate(fWidth, (rectF5.height() - reactionsContainerLayout.rect.height()) + (rectF5.top - reactionsContainerLayout.rect.top));
                    reactionsContainerLayout.drawBubbles(canvas2);
                    canvas2.restore();
                }
                if (i7 == i) {
                    Path path = this.clipPath;
                    path.rewind();
                    path.addRoundRect(rectF5, f2, f2, Path.Direction.CW);
                    canvas2.save();
                    canvas2.clipPath(path);
                }
                this.enterTransitionOffsetX = 0.0f;
                this.enterTransitionOffsetY = 0.0f;
                this.enterTransitionScale = 1.0f;
                this.enterTransitionScalePx = 0.0f;
                this.enterTransitionScalePy = 0.0f;
                AnonymousClass2 anonymousClass2 = customEmojiReactionsWindow.selectAnimatedEmojiDialog;
                if (reactionsContainerLayout != null) {
                    int childCount = anonymousClass2.emojiGridView.getChildCount() - 1;
                    while (childCount >= 0) {
                        if (anonymousClass2.emojiGridView.getChildAt(childCount) instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                            SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = (SelectAnimatedEmojiDialog.ImageViewEmoji) anonymousClass2.emojiGridView.getChildAt(childCount);
                            if (!imageViewEmoji.isFirstReactions || (visibleReaction = imageViewEmoji.reaction) == null) {
                                map3 = map;
                            } else {
                                map3 = map;
                                map3.put(visibleReaction, imageViewEmoji);
                            }
                        } else {
                            map3 = map;
                        }
                        childCount--;
                        map = map3;
                    }
                    HashMap map5 = map;
                    int iSave = canvas2.save();
                    canvas2.translate(rectF5.left, DiffUtil.m(1.0f, customEmojiReactionsWindow.enterTransitionProgress, reactionsContainerLayout.expandSize() + reactionsContainerLayout.getTopOffset(), rectF5.top));
                    float fMax = Math.max(1.0f - (anonymousClass2.emojiSearchGridView.getVisibility() == 0 ? anonymousClass2.emojiSearchGridView.getAlpha() : 0.0f), 1.0f - customEmojiReactionsWindow.enterTransitionProgress);
                    if (fMax != 1.0f) {
                        i5 = iSave;
                        map2 = map5;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, rectF5.width(), rectF5.height(), (int) (fMax * 255.0f), 31);
                    } else {
                        map2 = map5;
                        i5 = iSave;
                    }
                    int x2 = (int) (anonymousClass2.emojiGridView.getX() + anonymousClass2.getX());
                    int y = (int) (anonymousClass2.emojiGridView.getY() + anonymousClass2.getY());
                    boolean z = anonymousClass2.emojiTabs.getParent() != null;
                    if (i7 != 5) {
                        canvas2.clipRect(y, z ? x2 + (AndroidUtilities.dp(36.0f) * customEmojiReactionsWindow.enterTransitionProgress) : 0.0f, anonymousClass2.emojiGridView.getMeasuredWidth() + y, anonymousClass2.emojiGridView.getMeasuredHeight() + x2);
                    }
                    int i9 = -1;
                    int i10 = -1;
                    while (i10 < reactionsContainerLayout.recyclerListView.getChildCount()) {
                        View childAt = i10 == i9 ? reactionsContainerLayout.nextRecentReaction : reactionsContainerLayout.recyclerListView.getChildAt(i10);
                        if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                            i10 = i10;
                            map2 = map2;
                            i5 = i5;
                            i7 = i7;
                            rectF = rectF5;
                            rectF2 = rectF4;
                        } else {
                            canvas2.save();
                            if (childAt instanceof ReactionsContainerLayout.ReactionHolderView) {
                                ReactionsContainerLayout.ReactionHolderView reactionHolderView = (ReactionsContainerLayout.ReactionHolderView) childAt;
                                PremiumLockIconView premiumLockIconView = reactionHolderView.lockIconView;
                                if (premiumLockIconView != null) {
                                    premiumLockIconView.setAlpha(1.0f - customEmojiReactionsWindow.enterTransitionProgress);
                                }
                                SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji2 = (SelectAnimatedEmojiDialog.ImageViewEmoji) map2.get(reactionHolderView.currentReaction);
                                if (imageViewEmoji2 != null) {
                                    float x3 = childAt.getX();
                                    float y2 = childAt.getY();
                                    if (i10 == i9) {
                                        x3 -= reactionsContainerLayout.recyclerListView.getX();
                                        y2 -= reactionsContainerLayout.recyclerListView.getY();
                                    }
                                    float f16 = x3;
                                    f3 = 2.0f;
                                    float x4 = ((anonymousClass2.emojiGridView.getX() + (anonymousClass2.getX() + imageViewEmoji2.getX())) - reactionHolderView.loopImageView.getX()) - AndroidUtilities.dp(1.0f);
                                    float y3 = (anonymousClass2.emojiGridView.getY() + (anonymousClass2.gridViewContainer.getY() + (anonymousClass2.getY() + imageViewEmoji2.getY()))) - reactionHolderView.loopImageView.getY();
                                    float measuredWidth2 = imageViewEmoji2.getMeasuredWidth();
                                    if (imageViewEmoji2.selected) {
                                        i6 = 4;
                                    } else {
                                        i6 = 4;
                                        if (i7 != 4) {
                                            f9 = x4;
                                            f10 = y3;
                                            f8 = measuredWidth2;
                                        }
                                        float fLerp3 = AndroidUtilities.lerp(f16, f9, customEmojiReactionsWindow.enterTransitionProgress);
                                        float fLerp4 = AndroidUtilities.lerp(y2, f10, customEmojiReactionsWindow.enterTransitionProgress);
                                        f11 = y2;
                                        measuredWidth = f8 / reactionHolderView.loopImageView.getMeasuredWidth();
                                        fLerp = AndroidUtilities.lerp(1.0f, measuredWidth, customEmojiReactionsWindow.enterTransitionProgress);
                                        if (reactionHolderView.position == 0) {
                                            fDp = AndroidUtilities.dp(6.0f);
                                            f13 = fDp;
                                            f12 = 0.0f;
                                        } else {
                                            if (reactionHolderView.selected) {
                                                fDp = AndroidUtilities.dp(6.0f);
                                                f12 = fDp;
                                                f13 = f12;
                                                f14 = f13;
                                            } else {
                                                fDp = 0.0f;
                                                f12 = 0.0f;
                                                f13 = 0.0f;
                                            }
                                            canvas2.translate(fLerp3, fLerp4);
                                            canvas2.scale(fLerp, fLerp);
                                            if (this.enterTransitionOffsetX == 0.0f && this.enterTransitionOffsetY == 0.0f) {
                                                this.enterTransitionOffsetX = AndroidUtilities.lerp((rectF4.left + f16) - f9, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                                this.enterTransitionOffsetY = AndroidUtilities.lerp((rectF4.top + f11) - f10, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                                this.enterTransitionScale = AndroidUtilities.lerp(1.0f / measuredWidth, 1.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                                this.enterTransitionScalePx = f9;
                                                this.enterTransitionScalePy = f10;
                                            }
                                            f5 = f12;
                                            f4 = f13;
                                            f6 = f14;
                                        }
                                        f14 = 0.0f;
                                        canvas2.translate(fLerp3, fLerp4);
                                        canvas2.scale(fLerp, fLerp);
                                        if (this.enterTransitionOffsetX == 0.0f) {
                                            this.enterTransitionOffsetX = AndroidUtilities.lerp((rectF4.left + f16) - f9, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionOffsetY = AndroidUtilities.lerp((rectF4.top + f11) - f10, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionScale = AndroidUtilities.lerp(1.0f / measuredWidth, 1.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionScalePx = f9;
                                            this.enterTransitionScalePy = f10;
                                        }
                                        f5 = f12;
                                        f4 = f13;
                                        f6 = f14;
                                    }
                                    if (i7 == i6) {
                                        x4 -= AndroidUtilities.dp(0.33f);
                                        y3 -= AndroidUtilities.dp(1.33f);
                                        f7 = 0.87f * measuredWidth2;
                                    } else {
                                        f7 = measuredWidth2;
                                    }
                                    float f17 = imageViewEmoji2.selected ? 0.95f * f7 : f7;
                                    float f18 = (measuredWidth2 - f17) / 2.0f;
                                    float f19 = y3 + f18;
                                    f8 = f17;
                                    f9 = x4 + f18;
                                    f10 = f19;
                                    float fLerp5 = AndroidUtilities.lerp(f16, f9, customEmojiReactionsWindow.enterTransitionProgress);
                                    float fLerp6 = AndroidUtilities.lerp(y2, f10, customEmojiReactionsWindow.enterTransitionProgress);
                                    f11 = y2;
                                    measuredWidth = f8 / reactionHolderView.loopImageView.getMeasuredWidth();
                                    fLerp = AndroidUtilities.lerp(1.0f, measuredWidth, customEmojiReactionsWindow.enterTransitionProgress);
                                    if (reactionHolderView.position == 0) {
                                        fDp = AndroidUtilities.dp(6.0f);
                                        f13 = fDp;
                                        f12 = 0.0f;
                                    } else {
                                        if (reactionHolderView.selected) {
                                            fDp = AndroidUtilities.dp(6.0f);
                                            f12 = fDp;
                                            f13 = f12;
                                            f14 = f13;
                                        } else {
                                            fDp = 0.0f;
                                            f12 = 0.0f;
                                            f13 = 0.0f;
                                        }
                                        canvas2.translate(fLerp5, fLerp6);
                                        canvas2.scale(fLerp, fLerp);
                                        if (this.enterTransitionOffsetX == 0.0f) {
                                            this.enterTransitionOffsetX = AndroidUtilities.lerp((rectF4.left + f16) - f9, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionOffsetY = AndroidUtilities.lerp((rectF4.top + f11) - f10, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionScale = AndroidUtilities.lerp(1.0f / measuredWidth, 1.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionScalePx = f9;
                                            this.enterTransitionScalePy = f10;
                                        }
                                        f5 = f12;
                                        f4 = f13;
                                        f6 = f14;
                                    }
                                    f14 = 0.0f;
                                    canvas2.translate(fLerp5, fLerp6);
                                    canvas2.scale(fLerp, fLerp);
                                    if (this.enterTransitionOffsetX == 0.0f) {
                                        this.enterTransitionOffsetX = AndroidUtilities.lerp((rectF4.left + f16) - f9, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                        this.enterTransitionOffsetY = AndroidUtilities.lerp((rectF4.top + f11) - f10, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                        this.enterTransitionScale = AndroidUtilities.lerp(1.0f / measuredWidth, 1.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                        this.enterTransitionScalePx = f9;
                                        this.enterTransitionScalePy = f10;
                                    }
                                    f5 = f12;
                                    f4 = f13;
                                    f6 = f14;
                                } else {
                                    f3 = 2.0f;
                                    canvas2.translate(reactionHolderView.loopImageView.getX() + childAt.getX(), reactionHolderView.loopImageView.getY() + childAt.getY());
                                    f4 = 0.0f;
                                    f5 = 0.0f;
                                    f6 = 0.0f;
                                    fDp = 0.0f;
                                    fLerp = 1.0f;
                                }
                                if (imageViewEmoji2 != null) {
                                    if (imageViewEmoji2.selected) {
                                        float measuredWidth3 = reactionHolderView.getMeasuredWidth() / f3;
                                        float measuredHeight = reactionHolderView.getMeasuredHeight() / f3;
                                        float measuredWidth4 = reactionHolderView.getMeasuredWidth() - AndroidUtilities.dp(f3);
                                        float fLerp7 = AndroidUtilities.lerp(measuredWidth4, (imageViewEmoji2.getMeasuredWidth() - AndroidUtilities.dp(f3)) / fLerp, customEmojiReactionsWindow.enterTransitionProgress);
                                        RectF rectF6 = AndroidUtilities.rectTmp;
                                        float f20 = fLerp7 / f3;
                                        rectF6.set(measuredWidth3 - f20, measuredHeight - f20, measuredWidth3 + f20, measuredHeight + f20);
                                        float fLerp8 = AndroidUtilities.lerp(measuredWidth4 / f3, AndroidUtilities.dp(4.0f), customEmojiReactionsWindow.enterTransitionProgress);
                                        canvas2.drawRoundRect(rectF6, fLerp8, fLerp8, anonymousClass2.selectorPaint);
                                    }
                                    reactionHolderView.drawSelected = false;
                                    if (f4 == 0.0f) {
                                        reactionHolderView.draw(canvas2);
                                    } else {
                                        ImageReceiver imageReceiver = reactionHolderView.loopImageView.getImageReceiver();
                                        reactionHolderView.checkPlayLoopImage();
                                        AnimatedEmojiDrawable animatedEmojiDrawable = reactionHolderView.loopImageView.animatedEmojiDrawable;
                                        if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                                            imageReceiver = reactionHolderView.loopImageView.animatedEmojiDrawable.getImageReceiver();
                                        }
                                        int[] roundRadius = imageReceiver.getRoundRadius();
                                        int i11 = 0;
                                        while (true) {
                                            iArr = this.radiusTmp;
                                            if (i11 >= 4) {
                                                break;
                                            }
                                            iArr[i11] = roundRadius[i11];
                                            i11++;
                                        }
                                        imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(fDp, 0.0f, customEmojiReactionsWindow.enterTransitionProgress), (int) AndroidUtilities.lerp(f5, 0.0f, customEmojiReactionsWindow.enterTransitionProgress), (int) AndroidUtilities.lerp(f6, 0.0f, customEmojiReactionsWindow.enterTransitionProgress), (int) AndroidUtilities.lerp(f4, 0.0f, customEmojiReactionsWindow.enterTransitionProgress));
                                        reactionHolderView.draw(canvas2);
                                        imageReceiver.setRoundRadius(iArr);
                                    }
                                    reactionHolderView.drawSelected = true;
                                    if (!imageViewEmoji2.notDraw) {
                                        imageViewEmoji2.notDraw = true;
                                        imageViewEmoji2.invalidate();
                                    }
                                } else {
                                    rectF5 = rectF5;
                                    rectF4 = rectF4;
                                    if (reactionHolderView.hasEnterAnimation && reactionHolderView.loopImageView.getImageReceiver().getLottieAnimation() == null) {
                                        float alpha = reactionHolderView.enterImageView.getImageReceiver().getAlpha();
                                        reactionHolderView.enterImageView.getImageReceiver().setAlpha((1.0f - fClamp) * alpha);
                                        reactionHolderView.enterImageView.draw(canvas2);
                                        reactionHolderView.enterImageView.getImageReceiver().setAlpha(alpha);
                                    } else {
                                        reactionHolderView.checkPlayLoopImage();
                                        ImageReceiver imageReceiver2 = reactionHolderView.loopImageView.getImageReceiver();
                                        AnimatedEmojiDrawable animatedEmojiDrawable2 = reactionHolderView.loopImageView.animatedEmojiDrawable;
                                        if (animatedEmojiDrawable2 != null && animatedEmojiDrawable2.getImageReceiver() != null) {
                                            imageReceiver2 = reactionHolderView.loopImageView.animatedEmojiDrawable.getImageReceiver();
                                        }
                                        float alpha2 = imageReceiver2.getAlpha();
                                        imageReceiver2.setAlpha((1.0f - fClamp) * alpha2);
                                        reactionHolderView.loopImageView.draw(canvas2);
                                        imageReceiver2.setAlpha(alpha2);
                                    }
                                }
                                if (reactionHolderView.loopImageView.getVisibility() != 0) {
                                    invalidate();
                                }
                                rectF2 = rectF4;
                                rectF = rectF5;
                            } else {
                                i10 = i10;
                                RectF rectF7 = rectF5;
                                map2 = map2;
                                i5 = i5;
                                i7 = i7;
                                rectF2 = rectF4;
                                rectF = rectF7;
                                canvas2.translate((rectF7.width() + childAt.getX()) - reactionsContainerLayout.rect.width(), (childAt.getY() + rectF2.top) - rectF.top);
                                View view = childAt;
                                canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - fClamp) * 255.0f), 31);
                                float f21 = 1.0f - customEmojiReactionsWindow.enterTransitionProgress;
                                canvas2.scale(f21, f21, view.getMeasuredWidth() >> 1, view.getMeasuredHeight() >> 1);
                                view.draw(canvas2);
                                canvas2.restore();
                            }
                            canvas2.restore();
                        }
                        i10++;
                        rectF4 = rectF2;
                        rectF5 = rectF;
                        i7 = i7;
                        map2 = map2;
                        i5 = i5;
                        i9 = -1;
                    }
                    i3 = i7;
                    canvas2.restoreToCount(i5);
                } else {
                    i3 = i7;
                }
                super.dispatchDraw(canvas);
                int i12 = customEmojiReactionsWindow.frameDrawCount;
                if (i12 < 5) {
                    if (i12 == 3) {
                        i4 = 1;
                        reactionsContainerLayout.setSkipDraw(true);
                    } else {
                        i4 = 1;
                    }
                    customEmojiReactionsWindow.frameDrawCount += i4;
                }
                anonymousClass2.drawBigReaction(canvas2, this);
                if (i3 == 5) {
                    canvas2.restore();
                }
                if (customEmojiReactionsWindow.valueAnimator != null) {
                    invalidate();
                }
                Runnable runnable = HwEmojis.task;
                if (runnable != null) {
                    runnable.run();
                    HwEmojis.task = null;
                }
            }
        }

        @Override
        public final void invalidate() {
            ReactionsContainerLayout reactionsContainerLayout;
            super.invalidate();
            CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
            if (customEmojiReactionsWindow.type == 1 || !((reactionsContainerLayout = customEmojiReactionsWindow.reactionsContainerLayout) == null || reactionsContainerLayout.getDelegate() == null || !customEmojiReactionsWindow.reactionsContainerLayout.getDelegate().drawBackground())) {
                customEmojiReactionsWindow.selectAnimatedEmojiDialog.invalidateSearchBox();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int measuredWidth;
            int iDp;
            int iDp2;
            int iDp3;
            CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
            int i3 = customEmojiReactionsWindow.type;
            if (i3 == 1 || i3 == 2 || i3 == 4) {
                measuredWidth = customEmojiReactionsWindow.reactionsContainerLayout.getMeasuredWidth();
            } else if (i3 == 5) {
                measuredWidth = AndroidUtilities.dp(12.0f) + (AndroidUtilities.dp(36.0f) * 8);
            } else {
                measuredWidth = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                int iDp4 = (AndroidUtilities.dp(36.0f) * 8) + AndroidUtilities.dp(12.0f);
                if (iDp4 < measuredWidth) {
                    measuredWidth = iDp4;
                }
            }
            if (customEmojiReactionsWindow.type != 4) {
                if (customEmojiReactionsWindow.reactionsContainerLayout.showExpandableReactions()) {
                    int iCeil = (int) Math.ceil(customEmojiReactionsWindow.reactions.size() / 8.0f);
                    if (iCeil <= 8) {
                        iDp = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * iCeil);
                    } else {
                        iDp2 = AndroidUtilities.dp(36.0f) * 8;
                        iDp3 = AndroidUtilities.dp(8.0f);
                    }
                } else {
                    iDp = measuredWidth;
                }
                if (customEmojiReactionsWindow.type == 5) {
                    iDp = Math.min(AndroidUtilities.dp(254.0f), iDp);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
            }
            iDp2 = AndroidUtilities.dp(36.0f) * 8;
            iDp3 = AndroidUtilities.dp(8.0f);
            iDp = iDp2 - iDp3;
            if (customEmojiReactionsWindow.type == 5) {
                iDp = Math.min(AndroidUtilities.dp(254.0f), iDp);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
        }
    }

    public CustomEmojiReactionsWindow(int i, BaseFragment baseFragment, List list, HashSet hashSet, final ReactionsContainerLayout reactionsContainerLayout, Theme.ResourcesProvider resourcesProvider, boolean z) {
        new Path();
        this.location = new int[2];
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.animatingEnterChild = new HashSet();
        this.animators = new ArrayList();
        int i2 = 0;
        this.frameDrawCount = 0;
        this.type = i;
        this.reactions = list;
        this.baseFragment = baseFragment;
        this.resourcesProvider = resourcesProvider;
        Context context = baseFragment != null ? baseFragment.getContext() : reactionsContainerLayout.getContext();
        ?? r14 = new FrameLayout(context) {
            public final C00221 bulletinDelegate = new Bulletin.Delegate() {
                @Override
                public final boolean allowLayoutChanges() {
                    return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public final boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public final boolean clipWithGradient(int i3) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i3);
                }

                @Override
                public final int getBottomOffset(int i3) {
                    return (int) CustomEmojiReactionsWindow.this.keyboardHeight;
                }

                @Override
                public final int getLeftPadding() {
                    return Bulletin.Delegate.CC.$default$getLeftPadding(this);
                }

                @Override
                public final int getRightPadding() {
                    return Bulletin.Delegate.CC.$default$getRightPadding(this);
                }

                @Override
                public final int getTopOffset(int i3) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i3);
                }

                @Override
                public final void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public final void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public final void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                }
            };

            @Override
            public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
                if (customEmojiReactionsWindow.enterTransitionFinished) {
                    customEmojiReactionsWindow.dismiss();
                }
                return true;
            }

            @Override
            public final void dispatchSetPressed(boolean z2) {
            }

            @Override
            public final boolean fitSystemWindows(Rect rect) {
                CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
                float f = customEmojiReactionsWindow.keyboardHeight;
                float f2 = rect.bottom;
                if (f != f2 && customEmojiReactionsWindow.wasFocused) {
                    customEmojiReactionsWindow.keyboardHeight = f2;
                    if (!customEmojiReactionsWindow.dismissed) {
                        float measuredHeight = customEmojiReactionsWindow.yTranslation;
                        int iDp = AndroidUtilities.dp(32.0f);
                        int i3 = customEmojiReactionsWindow.type;
                        if (i3 == 1 || i3 == 2) {
                            iDp = AndroidUtilities.dp(24.0f);
                        }
                        ContainerView containerView = customEmojiReactionsWindow.containerView;
                        float measuredHeight2 = containerView.getMeasuredHeight() + measuredHeight;
                        AnonymousClass1 anonymousClass1 = customEmojiReactionsWindow.windowView;
                        float f3 = iDp;
                        if (measuredHeight2 > (anonymousClass1.getMeasuredHeight() - customEmojiReactionsWindow.keyboardHeight) - f3) {
                            measuredHeight = ((anonymousClass1.getMeasuredHeight() - customEmojiReactionsWindow.keyboardHeight) - containerView.getMeasuredHeight()) - f3;
                        }
                        if (measuredHeight < 0.0f) {
                            measuredHeight = 0.0f;
                        }
                        containerView.animate().translationY(measuredHeight).setDuration(250L).setUpdateListener(new CustomEmojiReactionsWindow$$ExternalSyntheticLambda5(customEmojiReactionsWindow, 1)).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                }
                return super.fitSystemWindows(rect);
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                Bulletin.addDelegate(this, this.bulletinDelegate);
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                Bulletin.removeDelegate(this);
            }
        };
        this.windowView = r14;
        r14.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 24));
        boolean z2 = i == 2 || i == 4 || i == 5 || z;
        this.attachToParent = z2;
        ContainerView containerView = new ContainerView(context);
        this.containerView = containerView;
        boolean z3 = z2;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(baseFragment, context, reactionsContainerLayout.getWindowType(), i != 1, resourcesProvider, reactionsContainerLayout, baseFragment);
        this.selectAnimatedEmojiDialog = anonymousClass2;
        anonymousClass2.setOutlineProvider(new ViewOutlineProvider() {
            public final Rect rect = new Rect();
            public final RectF rectTmp = new RectF();
            public final RectF rectF = new RectF();

            @Override
            public final void getOutline(View view, Outline outline) {
                CustomEmojiReactionsWindow customEmojiReactionsWindow = CustomEmojiReactionsWindow.this;
                float fLerp = AndroidUtilities.lerp(customEmojiReactionsWindow.fromRadius, AndroidUtilities.dp(8.0f), customEmojiReactionsWindow.enterTransitionProgress);
                RectF rectF = this.rectTmp;
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
                RectF rectF2 = customEmojiReactionsWindow.fromRect;
                float f = customEmojiReactionsWindow.enterTransitionProgress;
                RectF rectF3 = this.rectF;
                AndroidUtilities.lerp(rectF2, rectF, f, rectF3);
                Rect rect = this.rect;
                rectF3.round(rect);
                outline.setRoundRect(rect, fLerp);
            }
        });
        anonymousClass2.setClipToOutline(true);
        anonymousClass2.setPaused(reactionsContainerLayout.paused, reactionsContainerLayout.pausedExceptSelected);
        anonymousClass2.setOnLongPressedListener(new SelectAnimatedEmojiDialog.onLongPressedListener() {
            @Override
            public final void onLongPressed(SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji) {
                boolean z4 = imageViewEmoji.isDefaultReaction;
                ReactionsContainerLayout reactionsContainerLayout2 = reactionsContainerLayout;
                if (z4) {
                    reactionsContainerLayout2.onReactionClicked(imageViewEmoji, imageViewEmoji.reaction, true);
                    return;
                }
                long j = imageViewEmoji.span.documentId;
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = new ReactionsLayoutInBubble.VisibleReaction();
                visibleReaction.documentId = j;
                visibleReaction.hash = j;
                reactionsContainerLayout2.onReactionClicked(imageViewEmoji, visibleReaction, true);
            }
        });
        anonymousClass2.setOnRecentClearedListener(new SelectAnimatedEmojiDialog.onRecentClearedListener() {
            @Override
            public final void onRecentCleared() {
                reactionsContainerLayout.clearRecentReactions();
            }
        });
        anonymousClass2.setRecentReactions(list);
        anonymousClass2.setSelectedReactions((HashSet<ReactionsLayoutInBubble.VisibleReaction>) hashSet);
        anonymousClass2.setDrawBackground(false);
        anonymousClass2.onShow(null);
        containerView.addView(anonymousClass2, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i3 = i == 5 ? 2 : 16;
        if (i == 5) {
            containerView.setClipChildren(false);
            containerView.setClipToPadding(false);
            r14.setClipChildren(false);
            r14.setClipToPadding(false);
        }
        float f = i3;
        r14.addView(containerView, LayoutHelper.createFrame(-1, -1.0f, i == 5 ? 85 : 48, f, f, f, 16.0f));
        r14.setClipChildren(false);
        if (i == 1 || (reactionsContainerLayout.getDelegate() != null && reactionsContainerLayout.getDelegate().drawBackground())) {
            anonymousClass2.setBackgroundDelegate(new RateCallLayout$$ExternalSyntheticLambda1(8, this, reactionsContainerLayout));
        }
        if (z3) {
            ((ViewGroup) reactionsContainerLayout.getParent()).addView(r14);
        } else {
            WindowManager.LayoutParams layoutParamsCreateLayoutParams = createLayoutParams(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.windowManager = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, r14, layoutParamsCreateLayoutParams);
            windowManager.addView(r14, layoutParamsCreateLayoutParams);
        }
        this.reactionsContainerLayout = reactionsContainerLayout;
        reactionsContainerLayout.setOnSwitchedToLoopView(new CustomEmojiReactionsWindow$$ExternalSyntheticLambda2(this, i2));
        reactionsContainerLayout.prepareAnimation(true);
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(13, this, reactionsContainerLayout), 50L);
        if (i != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void access$600(CustomEmojiReactionsWindow customEmojiReactionsWindow, boolean z) {
        View childAt;
        if (customEmojiReactionsWindow.animators.isEmpty()) {
            customEmojiReactionsWindow.switchLayerType(false);
            HwEmojis.disableHw();
            customEmojiReactionsWindow.notificationsLocker.unlock();
            AnonymousClass2 anonymousClass2 = customEmojiReactionsWindow.selectAnimatedEmojiDialog;
            anonymousClass2.setEnterAnimationInProgress(false);
            if (z) {
                anonymousClass2.emojiTabs.showRecentTabStub(false);
                anonymousClass2.emojiGridView.invalidate();
                anonymousClass2.emojiGridView.invalidateViews();
                anonymousClass2.searchBox.checkInitialization();
                anonymousClass2.sendAccessibilityEvent(32);
                ReactionsContainerLayout reactionsContainerLayout = customEmojiReactionsWindow.reactionsContainerLayout;
                reactionsContainerLayout.setImportantForAccessibility(4);
                int i = 0;
                while (true) {
                    if (i >= anonymousClass2.emojiGridView.getChildCount()) {
                        childAt = null;
                        break;
                    } else {
                        if (anonymousClass2.emojiGridView.getChildAt(i) instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                            childAt = anonymousClass2.emojiGridView.getChildAt(i);
                            break;
                        }
                        i++;
                    }
                }
                if (childAt != null) {
                    childAt.performAccessibilityAction(64, null);
                } else {
                    anonymousClass2.performAccessibilityAction(64, null);
                }
                if (reactionsContainerLayout.getPullingLeftProgress() > 0.0f) {
                    reactionsContainerLayout.isHiddenNextReaction = false;
                    reactionsContainerLayout.onCustomEmojiWindowOpened();
                } else {
                    reactionsContainerLayout.isHiddenNextReaction = true;
                    reactionsContainerLayout.onCustomEmojiWindowOpened();
                }
                anonymousClass2.resetBackgroundBitmaps();
                for (int i2 = 0; i2 < anonymousClass2.emojiGridView.getChildCount(); i2++) {
                    if (anonymousClass2.emojiGridView.getChildAt(i2) instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                        SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = (SelectAnimatedEmojiDialog.ImageViewEmoji) anonymousClass2.emojiGridView.getChildAt(i2);
                        if (imageViewEmoji.reaction != null) {
                            imageViewEmoji.notDraw = false;
                            imageViewEmoji.invalidate();
                        }
                    }
                }
                customEmojiReactionsWindow.containerView.invalidate();
            }
        }
    }

    public final WindowManager.LayoutParams createLayoutParams(boolean z) {
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

    public final void createTransition(boolean z) {
        this.fromRect.set(this.reactionsContainerLayout.rect);
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        this.fromRadius = reactionsContainerLayout.radius;
        int[] iArr = new int[2];
        if (z) {
            reactionsContainerLayout.getLocationOnScreen(this.location);
        }
        getLocationOnScreen(iArr);
        float topOffset = this.reactionsContainerLayout.getTopOffset() + ((((this.location[1] - iArr[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (this.selectAnimatedEmojiDialog.includeHint ? AndroidUtilities.dp(26.0f) : 0));
        if (this.reactionsContainerLayout.showExpandableReactions()) {
            topOffset = (this.location[1] - iArr[1]) - AndroidUtilities.dp(12.0f);
        }
        if (this.containerView.getMeasuredHeight() + topOffset > getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - this.containerView.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (this.type == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        int i = this.type;
        if (i == 1) {
            this.containerView.setTranslationX(((getMeasuredWidth() - this.containerView.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else if (i == 2 || i == 4) {
            this.containerView.setTranslationX((this.location[0] - iArr[0]) - AndroidUtilities.dp(18.0f));
        } else {
            this.containerView.setTranslationX((this.location[0] - iArr[0]) - AndroidUtilities.dp(2.0f));
        }
        if (z) {
            this.yTranslation = topOffset;
            this.containerView.setTranslationY(topOffset);
        } else {
            this.yTranslation = this.containerView.getTranslationY();
        }
        RectF rectF = this.fromRect;
        float x = (this.location[0] - iArr[0]) - this.containerView.getX();
        this.fromRectTranslateX = x;
        float y = (this.location[1] - iArr[1]) - this.containerView.getY();
        this.fromRectTranslateY = y;
        rectF.offset(x, y);
        this.reactionsContainerLayout.setCustomEmojiEnterProgress(this.enterTransitionProgress);
        if (z) {
            this.cascadeAnimation = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200);
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
        this.notificationsLocker.lock();
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.transition = true;
        ValueAnimator valueAnimatorOfFloat = this.type == 4 ? ValueAnimator.ofFloat(this.enterTransitionProgress, z ? 1.0f : 0.0f) : StableAnimator.ofFloat(this.enterTransitionProgress, z ? 1.0f : 0.0f);
        this.valueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ChatMessageCell$$ExternalSyntheticLambda13(this, z, 3));
        if (!z) {
            for (int i2 = 0; i2 < this.selectAnimatedEmojiDialog.emojiGridView.getChildCount(); i2++) {
                if (this.selectAnimatedEmojiDialog.emojiGridView.getChildAt(i2) instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                    SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = (SelectAnimatedEmojiDialog.ImageViewEmoji) this.selectAnimatedEmojiDialog.emojiGridView.getChildAt(i2);
                    if (imageViewEmoji.reaction != null) {
                        imageViewEmoji.notDraw = false;
                        imageViewEmoji.invalidate();
                    }
                }
            }
        }
        this.valueAnimator.addListener(new StoryViewer.AnonymousClass7(this, z, 7));
        if (this.type == 4) {
            this.valueAnimator.setDuration(420L);
            this.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        } else if (this.cascadeAnimation) {
            this.valueAnimator.setDuration(450L);
            zzkk.m(0.5f, this.valueAnimator);
        } else {
            this.valueAnimator.setDuration(350L);
            this.valueAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        }
        this.containerView.invalidate();
        switchLayerType(true);
        if (z) {
            this.reactionsContainerLayout.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator2 = this.valueAnimator;
            Objects.requireNonNull(valueAnimator2);
            GiftSheet$$ExternalSyntheticLambda9 giftSheet$$ExternalSyntheticLambda9 = new GiftSheet$$ExternalSyntheticLambda9(valueAnimator2, 6);
            HwEmojis.isCascade = this.cascadeAnimation;
            HwEmojis.isPreparing = true;
            HwEmojis.isBeforePreparing = false;
            if (HwEmojis.firstOpen) {
                HwEmojis.firstOpen = false;
            }
            HwEmojis.task = giftSheet$$ExternalSyntheticLambda9;
        } else {
            ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsContainerLayout;
            reactionsContainerLayout2.isHiddenNextReaction = true;
            reactionsContainerLayout2.invalidate();
            this.valueAnimator.setStartDelay(30L);
            this.valueAnimator.start();
        }
        HashSet hashSet = HwEmojis.hwViews;
        DispatchQueuePriority cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.pauseLatch == null) {
            cacheOutQueue.pauseLatch = new CountDownLatch(1);
        }
        HwEmojis.hwEnabled = true;
        HwEmojis.isPreparing = false;
        HwEmojis.isBeforePreparing = false;
    }

    public final void dismiss() {
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

    public final void dismissWithAlpha() {
        if (this.dismissed) {
            return;
        }
        Bulletin.hideVisible();
        this.dismissed = true;
        AnonymousClass1 anonymousClass1 = this.windowView;
        AndroidUtilities.hideKeyboard(anonymousClass1);
        anonymousClass1.animate().alpha(0.0f).setDuration(150L).setListener(new AnonymousClass8(this, 1));
        if (this.wasFocused) {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ((ChatActivity) baseFragment).onEditTextDialogClose(true, true);
            }
        }
    }

    public final void removeView() {
        int i = 1;
        if (this.type != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new CustomEmojiReactionsWindow$$ExternalSyntheticLambda2(this, i));
    }

    public final void switchLayerType(boolean z) {
        int i = z ? 2 : 0;
        AnonymousClass2 anonymousClass2 = this.selectAnimatedEmojiDialog;
        anonymousClass2.emojiGridView.setLayerType(i, null);
        anonymousClass2.searchBox.setLayerType(i, null);
        if (!this.cascadeAnimation) {
            anonymousClass2.emojiTabsShadow.setLayerType(i, null);
            anonymousClass2.emojiTabs.setLayerType(i, null);
        } else {
            for (int i2 = 0; i2 < Math.min(anonymousClass2.emojiTabs.contentView.getChildCount(), 16); i2++) {
                anonymousClass2.emojiTabs.contentView.getChildAt(i2).setLayerType(i, null);
            }
        }
    }

    public final void updateCascadeEnter(float f, boolean z) {
        RectF rectF;
        HashSet hashSet;
        int i = 2;
        AnonymousClass2 anonymousClass2 = this.selectAnimatedEmojiDialog;
        int y = (int) (anonymousClass2.emojiGridView.getY() + anonymousClass2.contentView.getY() + anonymousClass2.getY());
        ArrayList arrayList = null;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            int childCount = anonymousClass2.emojiGridView.getChildCount();
            rectF = this.drawingRect;
            hashSet = this.animatingEnterChild;
            if (i2 >= childCount) {
                break;
            }
            View childAt = anonymousClass2.emojiGridView.getChildAt(i2);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y;
                if (measuredHeight >= rectF.bottom || measuredHeight <= rectF.top || f == 0.0f) {
                    if (childAt instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                        ((SelectAnimatedEmojiDialog.ImageViewEmoji) childAt).setAnimatedScale(0.0f);
                    } else if (childAt instanceof EmojiTabsStrip.EmojiTabButton) {
                        childAt.setScaleX(0.0f);
                        childAt.setScaleY(0.0f);
                    }
                    z2 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    hashSet.add(childAt);
                }
            }
            i2++;
        }
        int y2 = (int) (anonymousClass2.emojiTabs.getY() + anonymousClass2.contentView.getY() + anonymousClass2.getY());
        for (int i3 = 0; i3 < anonymousClass2.emojiTabs.contentView.getChildCount(); i3++) {
            View childAt2 = anonymousClass2.emojiTabs.contentView.getChildAt(i3);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y2;
                if (measuredHeight2 >= rectF.bottom || measuredHeight2 <= rectF.top || f == 0.0f) {
                    if (childAt2 instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                        ((SelectAnimatedEmojiDialog.ImageViewEmoji) childAt2).setAnimatedScale(0.0f);
                    } else if (childAt2 instanceof EmojiTabsStrip.EmojiTabButton) {
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                    }
                    z2 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    hashSet.add(childAt2);
                }
            }
        }
        if (z2) {
            anonymousClass2.emojiGridViewContainer.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(8, this, arrayList));
            this.animators.add(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new StoryRecorder.AnonymousClass34(this, valueAnimatorOfFloat, z, i));
            if (this.type == 4) {
                valueAnimatorOfFloat.setDuration(420L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                valueAnimatorOfFloat.setDuration(350L);
                valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            valueAnimatorOfFloat.start();
        }
    }

    public final void updateContainersAlpha() {
        if (this.cascadeAnimation) {
            return;
        }
        AnonymousClass2 anonymousClass2 = this.selectAnimatedEmojiDialog;
        anonymousClass2.searchBox.setAlpha(this.enterTransitionProgress);
        anonymousClass2.emojiGridView.setAlpha(this.enterTransitionProgress);
        anonymousClass2.emojiSearchGridView.setAlpha(this.enterTransitionProgress);
        anonymousClass2.emojiTabs.setAlpha(this.enterTransitionProgress);
        anonymousClass2.emojiTabsShadow.setAlpha(this.enterTransitionProgress);
    }

    public final void updateContentPosition() {
        AnonymousClass2 anonymousClass2 = this.selectAnimatedEmojiDialog;
        FrameLayout frameLayout = anonymousClass2.contentView;
        boolean z = this.cascadeAnimation;
        ContainerView containerView = this.containerView;
        frameLayout.setTranslationX(z ? 0.0f : containerView.enterTransitionOffsetX);
        anonymousClass2.contentView.setTranslationY(containerView.enterTransitionOffsetY);
        anonymousClass2.contentView.setPivotX(containerView.enterTransitionScalePx);
        anonymousClass2.contentView.setPivotY(containerView.enterTransitionScalePy);
        anonymousClass2.contentView.setScaleX(containerView.enterTransitionScale);
        anonymousClass2.contentView.setScaleY(containerView.enterTransitionScale);
    }
}
