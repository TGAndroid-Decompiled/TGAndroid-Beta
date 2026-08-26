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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.dynamite.zzf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.DispatchQueuePriority;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
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
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.SearchField$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.SeekBarView$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.StableAnimator;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.SecretVoicePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.SelectAnimatedEmojiDialog;

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
    public SeekBarView$$ExternalSyntheticLambda1 onDismiss;
    public final ArrayList reactions;
    public final ReactionsContainerLayout reactionsContainerLayout;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnonymousClass2 selectAnimatedEmojiDialog;
    public boolean transition;
    public final int type;
    public ValueAnimator valueAnimator;
    public boolean wasFocused;
    public final WindowManager windowManager;
    public final IntroActivity.AnonymousClass1 windowView;
    public float yTranslation;
    public final RectF fromRect = new RectF();
    public final RectF drawingRect = new RectF();

    public final class AnonymousClass2 extends SelectAnimatedEmojiDialog {
        public final BaseFragment val$baseFragment;
        public final ReactionsContainerLayout val$reactionsContainerLayout;

        public AnonymousClass2(BaseFragment baseFragment, Context context, int i, boolean z, Theme.ResourcesProvider resourcesProvider, ReactionsContainerLayout reactionsContainerLayout, BaseFragment baseFragment2) {
            super(baseFragment, context, false, null, i, z, resourcesProvider, 16, Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider));
            this.val$reactionsContainerLayout = reactionsContainerLayout;
            this.val$baseFragment = baseFragment2;
        }

        @Override
        public final void invalidateParent() {
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
                new BulletinFactory(customEmojiReactionsWindow.windowView, null).createEmojiBulletin(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new SeekBarView$$ExternalSyntheticLambda1(this, 1)).show();
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

    public final class AnonymousClass4 implements SelectAnimatedEmojiDialog.onLongPressedListener {
        public final ReactionsContainerLayout val$reactionsContainerLayout;

        public AnonymousClass4(ReactionsContainerLayout reactionsContainerLayout) {
            this.val$reactionsContainerLayout = reactionsContainerLayout;
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
            PhotoViewer.AnonymousClass11 anonymousClass11;
            int i4;
            HashMap map2;
            int i5;
            RectF rectF;
            RectF rectF2;
            float f3;
            float f4;
            float f5;
            float fDp;
            float fLerp;
            PhotoViewer.AnonymousClass11 anonymousClass12;
            int[] iArr;
            PhotoViewer.AnonymousClass11 anonymousClass13;
            int i6;
            float fDp2;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float measuredWidth;
            float f11;
            float f12;
            float f13;
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
                float f14 = customEmojiReactionsWindow.enterTransitionProgress;
                RectF rectF5 = customEmojiReactionsWindow.drawingRect;
                AndroidUtilities.lerp(rectF4, rectF3, f14, rectF5);
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
                    Rect rect = this.shadowPad;
                    f = 1.0f;
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
                    float fMax = (Math.max(0.25f, Math.min(reactionsContainerLayout.transitionProgress, 1.0f)) - 0.25f) / 0.75f;
                    Canvas canvas3 = canvas2;
                    reactionsContainerLayout.drawBubbles(reactionsContainerLayout.bigCircleRadius * fMax, fMax, reactionsContainerLayout.smallCircleRadius * fMax, reactionsContainerLayout.type == i ? 255 : (int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, reactionsContainerLayout.customEmojiReactionsEnterProgress, Utilities.clamp(reactionsContainerLayout.customEmojiReactionsEnterProgress / 0.2f, 1.0f, 0.0f), 255.0f), canvas3);
                    reactionsContainerLayout = reactionsContainerLayout;
                    canvas2 = canvas3;
                    canvas2.restore();
                }
                if (i7 == 5) {
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
                    float fMax2 = Math.max(1.0f - (anonymousClass2.emojiSearchGridView.getVisibility() == 0 ? anonymousClass2.emojiSearchGridView.getAlpha() : 0.0f), 1.0f - customEmojiReactionsWindow.enterTransitionProgress);
                    if (fMax2 != 1.0f) {
                        i5 = iSave;
                        map2 = map5;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, rectF5.width(), rectF5.height(), (int) (fMax2 * 255.0f), 31);
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
                                ReactionsContainerLayout.ReactionHolderView.AnonymousClass2 anonymousClass3 = reactionHolderView.loopImageView;
                                if (imageViewEmoji2 != null) {
                                    float x3 = childAt.getX();
                                    float y2 = childAt.getY();
                                    if (i10 == i9) {
                                        x3 -= reactionsContainerLayout.recyclerListView.getX();
                                        y2 -= reactionsContainerLayout.recyclerListView.getY();
                                    }
                                    float f15 = x3;
                                    float x4 = ((anonymousClass2.emojiGridView.getX() + (anonymousClass2.getX() + imageViewEmoji2.getX())) - anonymousClass3.getX()) - AndroidUtilities.dp(1.0f);
                                    float y3 = (anonymousClass2.emojiGridView.getY() + (anonymousClass2.gridViewContainer.getY() + (anonymousClass2.getY() + imageViewEmoji2.getY()))) - anonymousClass3.getY();
                                    float measuredWidth2 = imageViewEmoji2.getMeasuredWidth();
                                    if (imageViewEmoji2.selected) {
                                        i6 = 4;
                                    } else {
                                        i6 = 4;
                                        if (i7 != 4) {
                                            f8 = y3;
                                            f9 = x4;
                                            f7 = measuredWidth2;
                                        }
                                        float fLerp3 = AndroidUtilities.lerp(f15, f9, customEmojiReactionsWindow.enterTransitionProgress);
                                        float fLerp4 = AndroidUtilities.lerp(y2, f8, customEmojiReactionsWindow.enterTransitionProgress);
                                        f10 = y2;
                                        measuredWidth = f7 / anonymousClass3.getMeasuredWidth();
                                        fLerp = AndroidUtilities.lerp(1.0f, measuredWidth, customEmojiReactionsWindow.enterTransitionProgress);
                                        if (reactionHolderView.position == 0) {
                                            fDp = AndroidUtilities.dp(6.0f);
                                            f12 = fDp;
                                            f11 = 0.0f;
                                        } else {
                                            if (reactionHolderView.selected) {
                                                fDp = AndroidUtilities.dp(6.0f);
                                                f11 = fDp;
                                                f12 = f11;
                                                f13 = f12;
                                            } else {
                                                fDp = 0.0f;
                                                f11 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            canvas2.translate(fLerp3, fLerp4);
                                            canvas2.scale(fLerp, fLerp);
                                            if (this.enterTransitionOffsetX == 0.0f && this.enterTransitionOffsetY == 0.0f) {
                                                this.enterTransitionOffsetX = AndroidUtilities.lerp((rectF4.left + f15) - f9, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                                this.enterTransitionOffsetY = AndroidUtilities.lerp((rectF4.top + f10) - f8, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                                this.enterTransitionScale = AndroidUtilities.lerp(1.0f / measuredWidth, 1.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                                this.enterTransitionScalePx = f9;
                                                this.enterTransitionScalePy = f8;
                                            }
                                            f4 = f11;
                                            f3 = f12;
                                            f5 = f13;
                                        }
                                        f13 = 0.0f;
                                        canvas2.translate(fLerp3, fLerp4);
                                        canvas2.scale(fLerp, fLerp);
                                        if (this.enterTransitionOffsetX == 0.0f) {
                                            this.enterTransitionOffsetX = AndroidUtilities.lerp((rectF4.left + f15) - f9, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionOffsetY = AndroidUtilities.lerp((rectF4.top + f10) - f8, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionScale = AndroidUtilities.lerp(1.0f / measuredWidth, 1.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionScalePx = f9;
                                            this.enterTransitionScalePy = f8;
                                        }
                                        f4 = f11;
                                        f3 = f12;
                                        f5 = f13;
                                    }
                                    if (i7 == i6) {
                                        fDp2 = x4 - AndroidUtilities.dp(0.33f);
                                        y3 -= AndroidUtilities.dp(1.33f);
                                        f6 = 0.87f * measuredWidth2;
                                    } else {
                                        fDp2 = x4;
                                        f6 = measuredWidth2;
                                    }
                                    float f16 = imageViewEmoji2.selected ? 0.95f * f6 : f6;
                                    float f17 = (measuredWidth2 - f16) / 2.0f;
                                    float f18 = fDp2 + f17;
                                    float f19 = y3 + f17;
                                    f7 = f16;
                                    f8 = f19;
                                    f9 = f18;
                                    float fLerp5 = AndroidUtilities.lerp(f15, f9, customEmojiReactionsWindow.enterTransitionProgress);
                                    float fLerp6 = AndroidUtilities.lerp(y2, f8, customEmojiReactionsWindow.enterTransitionProgress);
                                    f10 = y2;
                                    measuredWidth = f7 / anonymousClass3.getMeasuredWidth();
                                    fLerp = AndroidUtilities.lerp(1.0f, measuredWidth, customEmojiReactionsWindow.enterTransitionProgress);
                                    if (reactionHolderView.position == 0) {
                                        fDp = AndroidUtilities.dp(6.0f);
                                        f12 = fDp;
                                        f11 = 0.0f;
                                    } else {
                                        if (reactionHolderView.selected) {
                                            fDp = AndroidUtilities.dp(6.0f);
                                            f11 = fDp;
                                            f12 = f11;
                                            f13 = f12;
                                        } else {
                                            fDp = 0.0f;
                                            f11 = 0.0f;
                                            f12 = 0.0f;
                                        }
                                        canvas2.translate(fLerp5, fLerp6);
                                        canvas2.scale(fLerp, fLerp);
                                        if (this.enterTransitionOffsetX == 0.0f) {
                                            this.enterTransitionOffsetX = AndroidUtilities.lerp((rectF4.left + f15) - f9, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionOffsetY = AndroidUtilities.lerp((rectF4.top + f10) - f8, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionScale = AndroidUtilities.lerp(1.0f / measuredWidth, 1.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                            this.enterTransitionScalePx = f9;
                                            this.enterTransitionScalePy = f8;
                                        }
                                        f4 = f11;
                                        f3 = f12;
                                        f5 = f13;
                                    }
                                    f13 = 0.0f;
                                    canvas2.translate(fLerp5, fLerp6);
                                    canvas2.scale(fLerp, fLerp);
                                    if (this.enterTransitionOffsetX == 0.0f) {
                                        this.enterTransitionOffsetX = AndroidUtilities.lerp((rectF4.left + f15) - f9, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                        this.enterTransitionOffsetY = AndroidUtilities.lerp((rectF4.top + f10) - f8, 0.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                        this.enterTransitionScale = AndroidUtilities.lerp(1.0f / measuredWidth, 1.0f, customEmojiReactionsWindow.enterTransitionProgress);
                                        this.enterTransitionScalePx = f9;
                                        this.enterTransitionScalePy = f8;
                                    }
                                    f4 = f11;
                                    f3 = f12;
                                    f5 = f13;
                                } else {
                                    map2 = map2;
                                    canvas2.translate(anonymousClass3.getX() + childAt.getX(), anonymousClass3.getY() + childAt.getY());
                                    f3 = 0.0f;
                                    f4 = 0.0f;
                                    f5 = 0.0f;
                                    fDp = 0.0f;
                                    fLerp = 1.0f;
                                }
                                if (imageViewEmoji2 != null) {
                                    if (imageViewEmoji2.selected) {
                                        float measuredWidth3 = reactionHolderView.getMeasuredWidth() / 2.0f;
                                        float measuredHeight = reactionHolderView.getMeasuredHeight() / 2.0f;
                                        float measuredWidth4 = reactionHolderView.getMeasuredWidth() - AndroidUtilities.dp(2.0f);
                                        float fLerp7 = AndroidUtilities.lerp(measuredWidth4, (imageViewEmoji2.getMeasuredWidth() - AndroidUtilities.dp(2.0f)) / fLerp, customEmojiReactionsWindow.enterTransitionProgress);
                                        RectF rectF6 = AndroidUtilities.rectTmp;
                                        float f20 = fLerp7 / 2.0f;
                                        rectF6.set(measuredWidth3 - f20, measuredHeight - f20, measuredWidth3 + f20, measuredHeight + f20);
                                        float fLerp8 = AndroidUtilities.lerp(measuredWidth4 / 2.0f, AndroidUtilities.dp(4.0f), customEmojiReactionsWindow.enterTransitionProgress);
                                        canvas2.drawRoundRect(rectF6, fLerp8, fLerp8, anonymousClass2.selectorPaint);
                                    }
                                    reactionHolderView.drawSelected = false;
                                    if (f3 == 0.0f) {
                                        reactionHolderView.draw(canvas2);
                                    } else {
                                        ImageReceiver imageReceiver = anonymousClass3.getImageReceiver();
                                        reactionHolderView.checkPlayLoopImage();
                                        AnimatedEmojiDrawable animatedEmojiDrawable = anonymousClass3.animatedEmojiDrawable;
                                        if (animatedEmojiDrawable != null && (anonymousClass13 = animatedEmojiDrawable.imageReceiver) != null) {
                                            imageReceiver = anonymousClass13;
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
                                        imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(fDp, 0.0f, customEmojiReactionsWindow.enterTransitionProgress), (int) AndroidUtilities.lerp(f4, 0.0f, customEmojiReactionsWindow.enterTransitionProgress), (int) AndroidUtilities.lerp(f5, 0.0f, customEmojiReactionsWindow.enterTransitionProgress), (int) AndroidUtilities.lerp(f3, 0.0f, customEmojiReactionsWindow.enterTransitionProgress));
                                        reactionHolderView.draw(canvas2);
                                        imageReceiver.setRoundRadius(iArr);
                                    }
                                    reactionHolderView.drawSelected = true;
                                    if (!imageViewEmoji2.notDraw) {
                                        imageViewEmoji2.notDraw = true;
                                        imageViewEmoji2.invalidate();
                                    }
                                } else {
                                    rectF4 = rectF4;
                                    reactionsContainerLayout = reactionsContainerLayout;
                                    if (reactionHolderView.hasEnterAnimation && anonymousClass3.getImageReceiver().getLottieAnimation() == null) {
                                        ReactionsContainerLayout.ReactionHolderView.AnonymousClass2 anonymousClass4 = reactionHolderView.enterImageView;
                                        float alpha = anonymousClass4.getImageReceiver().getAlpha();
                                        anonymousClass4.getImageReceiver().setAlpha((1.0f - fClamp) * alpha);
                                        anonymousClass4.draw(canvas2);
                                        anonymousClass4.getImageReceiver().setAlpha(alpha);
                                    } else {
                                        reactionHolderView.checkPlayLoopImage();
                                        ImageReceiver imageReceiver2 = anonymousClass3.getImageReceiver();
                                        AnimatedEmojiDrawable animatedEmojiDrawable2 = anonymousClass3.animatedEmojiDrawable;
                                        if (animatedEmojiDrawable2 != null && (anonymousClass12 = animatedEmojiDrawable2.imageReceiver) != null) {
                                            imageReceiver2 = anonymousClass12;
                                        }
                                        float alpha2 = imageReceiver2.getAlpha();
                                        imageReceiver2.setAlpha((1.0f - fClamp) * alpha2);
                                        anonymousClass3.draw(canvas2);
                                        imageReceiver2.setAlpha(alpha2);
                                    }
                                }
                                if (anonymousClass3.getVisibility() != 0) {
                                    invalidate();
                                }
                                rectF = rectF5;
                                reactionsContainerLayout = reactionsContainerLayout;
                                rectF2 = rectF4;
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
                        i5 = i5;
                        map2 = map2;
                        i7 = i7;
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
                if (anonymousClass2.selectedReactionView != null) {
                    ImageReceiver imageReceiver3 = anonymousClass2.bigReactionImageReceiver;
                    imageReceiver3.setParentView(this);
                    SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji3 = anonymousClass2.selectedReactionView;
                    if (imageViewEmoji3 != null) {
                        float f22 = anonymousClass2.pressedProgress;
                        if (f22 != 1.0f && !anonymousClass2.cancelPressed && anonymousClass2.isLongPressEnabled) {
                            float f23 = f22 + 0.010666667f;
                            anonymousClass2.pressedProgress = f23;
                            if (f23 >= 1.0f) {
                                anonymousClass2.pressedProgress = 1.0f;
                                SelectAnimatedEmojiDialog.onLongPressedListener onlongpressedlistener = anonymousClass2.bigReactionListener;
                                if (onlongpressedlistener != null) {
                                    boolean z2 = imageViewEmoji3.isDefaultReaction;
                                    ReactionsContainerLayout reactionsContainerLayout2 = ((AnonymousClass4) onlongpressedlistener).val$reactionsContainerLayout;
                                    if (z2) {
                                        reactionsContainerLayout2.onReactionClicked(imageViewEmoji3, imageViewEmoji3.reaction, true);
                                    } else {
                                        long j = imageViewEmoji3.span.documentId;
                                        ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = new ReactionsLayoutInBubble.VisibleReaction();
                                        visibleReaction2.documentId = j;
                                        visibleReaction2.hash = j;
                                        reactionsContainerLayout2.onReactionClicked(imageViewEmoji3, visibleReaction2, true);
                                    }
                                }
                            }
                            anonymousClass2.selectedReactionView.bigReactionSelectedProgress = anonymousClass2.pressedProgress;
                        }
                        float f24 = (anonymousClass2.pressedProgress * 2.0f) + 1.0f;
                        canvas2.save();
                        SelectAnimatedEmojiDialog.AnonymousClass7 anonymousClass7 = anonymousClass2.emojiGridView;
                        canvas2.translate(anonymousClass2.selectedReactionView.getX() + anonymousClass7.getX(), anonymousClass2.selectedReactionView.getY() + anonymousClass7.getY() + anonymousClass2.gridViewContainer.getY());
                        Paint paint2 = anonymousClass2.paint;
                        paint2.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, anonymousClass2.resourcesProvider));
                        canvas2.drawRect(0.0f, 0.0f, anonymousClass2.selectedReactionView.getMeasuredWidth(), anonymousClass2.selectedReactionView.getMeasuredHeight(), paint2);
                        canvas2.scale(f24, f24, anonymousClass2.selectedReactionView.getMeasuredWidth() / 2.0f, anonymousClass2.selectedReactionView.getMeasuredHeight());
                        SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji4 = anonymousClass2.selectedReactionView;
                        if (!imageViewEmoji4.isDefaultReaction) {
                            imageReceiver3 = imageViewEmoji4.imageReceiverToDraw;
                        }
                        AnimatedEmojiDrawable animatedEmojiDrawable3 = anonymousClass2.bigReactionAnimatedEmoji;
                        if (animatedEmojiDrawable3 != null && (anonymousClass11 = animatedEmojiDrawable3.imageReceiver) != null && anonymousClass11.hasBitmapImage()) {
                            imageReceiver3 = anonymousClass2.bigReactionAnimatedEmoji.imageReceiver;
                        }
                        if (imageReceiver3 != null) {
                            imageReceiver3.setImageCoords(0.0f, 0.0f, anonymousClass2.selectedReactionView.getMeasuredWidth(), anonymousClass2.selectedReactionView.getMeasuredHeight());
                            imageReceiver3.draw(canvas2);
                        }
                        canvas2.restore();
                        invalidate();
                    }
                }
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
            if (customEmojiReactionsWindow.type == 1 || !((reactionsContainerLayout = customEmojiReactionsWindow.reactionsContainerLayout) == null || reactionsContainerLayout.getDelegate() == null || !reactionsContainerLayout.getDelegate().drawBackground())) {
                customEmojiReactionsWindow.selectAnimatedEmojiDialog.searchBox.invalidate();
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
                if (customEmojiReactionsWindow.reactionsContainerLayout.showExpandableReactions) {
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

    public CustomEmojiReactionsWindow(int i, BaseFragment baseFragment, ArrayList arrayList, HashSet hashSet, ReactionsContainerLayout reactionsContainerLayout, Theme.ResourcesProvider resourcesProvider, boolean z) {
        int i2 = 1;
        new Path();
        this.location = new int[2];
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.animatingEnterChild = new HashSet();
        this.animators = new ArrayList();
        this.frameDrawCount = 0;
        this.type = i;
        this.reactions = arrayList;
        this.baseFragment = baseFragment;
        this.resourcesProvider = resourcesProvider;
        Context context = baseFragment != null ? baseFragment.getContext() : reactionsContainerLayout.getContext();
        IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, context);
        this.windowView = anonymousClass1;
        anonymousClass1.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 22));
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
        boolean z4 = reactionsContainerLayout.paused;
        boolean z5 = reactionsContainerLayout.pausedExceptSelected;
        if (anonymousClass2.paused != z4) {
            anonymousClass2.paused = z4;
            anonymousClass2.pausedExceptSelected = z5;
            SelectAnimatedEmojiDialog.AnonymousClass7 anonymousClass7 = anonymousClass2.emojiGridView;
            if (anonymousClass7 != null) {
                anonymousClass7.invalidate();
            }
            SelectAnimatedEmojiDialog.AnonymousClass13 anonymousClass13 = anonymousClass2.emojiSearchGridView;
            if (anonymousClass13 != null) {
                anonymousClass13.invalidate();
            }
        }
        anonymousClass2.setOnLongPressedListener(new AnonymousClass4(reactionsContainerLayout));
        anonymousClass2.setOnRecentClearedListener(new zzf(24));
        anonymousClass2.setRecentReactions(arrayList);
        anonymousClass2.setSelectedReactions((HashSet<ReactionsLayoutInBubble.VisibleReaction>) hashSet);
        anonymousClass2.setDrawBackground(false);
        anonymousClass2.onShow(null);
        containerView.addView(anonymousClass2, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i3 = i == 5 ? 2 : 16;
        if (i == 5) {
            containerView.setClipChildren(false);
            containerView.setClipToPadding(false);
            anonymousClass1.setClipChildren(false);
            anonymousClass1.setClipToPadding(false);
        }
        float f = i3;
        anonymousClass1.addView(containerView, LayoutHelper.createFrame(-1, -1.0f, i == 5 ? 85 : 48, f, f, f, 16.0f));
        anonymousClass1.setClipChildren(false);
        if (i == 1 || (reactionsContainerLayout.getDelegate() != null && reactionsContainerLayout.getDelegate().drawBackground())) {
            anonymousClass2.setBackgroundDelegate(new RateCallLayout$$ExternalSyntheticLambda1(16, this, reactionsContainerLayout));
        }
        if (z3) {
            ((ViewGroup) reactionsContainerLayout.getParent()).addView(anonymousClass1);
        } else {
            WindowManager.LayoutParams layoutParamsCreateLayoutParams = createLayoutParams(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.windowManager = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, anonymousClass1, layoutParamsCreateLayoutParams);
            windowManager.addView(anonymousClass1, layoutParamsCreateLayoutParams);
        }
        this.reactionsContainerLayout = reactionsContainerLayout;
        reactionsContainerLayout.setOnSwitchedToLoopView(new CustomEmojiReactionsWindow$$ExternalSyntheticLambda1(this, i2));
        reactionsContainerLayout.prepareAnimation = true;
        reactionsContainerLayout.invalidate();
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(9, this, reactionsContainerLayout), 50L);
        if (i != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void access$600(CustomEmojiReactionsWindow customEmojiReactionsWindow, boolean z) {
        View childAt;
        SelectAnimatedEmojiDialog.AnonymousClass13 anonymousClass13;
        if (customEmojiReactionsWindow.animators.isEmpty()) {
            customEmojiReactionsWindow.switchLayerType(false);
            HwEmojis.disableHw();
            customEmojiReactionsWindow.notificationsLocker.unlock();
            AnonymousClass2 anonymousClass2 = customEmojiReactionsWindow.selectAnimatedEmojiDialog;
            anonymousClass2.setEnterAnimationInProgress(false);
            if (z) {
                anonymousClass2.emojiTabs.showRecentTabStub(false);
                SelectAnimatedEmojiDialog.AnonymousClass7 anonymousClass7 = anonymousClass2.emojiGridView;
                anonymousClass7.invalidate();
                anonymousClass7.invalidateViews();
                anonymousClass2.searchBox.createCategoriesListView();
                anonymousClass2.sendAccessibilityEvent(32);
                ReactionsContainerLayout reactionsContainerLayout = customEmojiReactionsWindow.reactionsContainerLayout;
                reactionsContainerLayout.setImportantForAccessibility(4);
                int i = 0;
                while (true) {
                    if (i >= anonymousClass7.getChildCount()) {
                        childAt = null;
                        break;
                    } else {
                        if (anonymousClass7.getChildAt(i) instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                            childAt = anonymousClass7.getChildAt(i);
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
                    ValueAnimator valueAnimator = reactionsContainerLayout.pullingDownBackAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    reactionsContainerLayout.pullingLeftOffset = 0.0f;
                    IntroActivity.AnonymousClass1 anonymousClass1 = reactionsContainerLayout.customReactionsContainer;
                    if (anonymousClass1 != null) {
                        anonymousClass1.invalidate();
                    }
                    reactionsContainerLayout.invalidate();
                } else {
                    reactionsContainerLayout.isHiddenNextReaction = true;
                    ValueAnimator valueAnimator2 = reactionsContainerLayout.pullingDownBackAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    reactionsContainerLayout.pullingLeftOffset = 0.0f;
                    IntroActivity.AnonymousClass1 anonymousClass3 = reactionsContainerLayout.customReactionsContainer;
                    if (anonymousClass3 != null) {
                        anonymousClass3.invalidate();
                    }
                    reactionsContainerLayout.invalidate();
                }
                for (int i2 = 0; i2 < anonymousClass7.lineDrawables.size(); i2++) {
                    SelectAnimatedEmojiDialog.EmojiListView.DrawingInBackgroundLine drawingInBackgroundLine = (SelectAnimatedEmojiDialog.EmojiListView.DrawingInBackgroundLine) anonymousClass7.lineDrawables.get(i2);
                    for (int i3 = 0; i3 < drawingInBackgroundLine.imageViewEmojis.size(); i3++) {
                        if (((SelectAnimatedEmojiDialog.ImageViewEmoji) drawingInBackgroundLine.imageViewEmojis.get(i3)).notDraw) {
                            ((SelectAnimatedEmojiDialog.ImageViewEmoji) drawingInBackgroundLine.imageViewEmojis.get(i3)).notDraw = false;
                            ((SelectAnimatedEmojiDialog.ImageViewEmoji) drawingInBackgroundLine.imageViewEmojis.get(i3)).invalidate();
                            drawingInBackgroundLine.reset();
                        }
                    }
                }
                anonymousClass7.invalidate();
                int i4 = 0;
                while (true) {
                    anonymousClass13 = anonymousClass2.emojiSearchGridView;
                    if (i4 >= anonymousClass13.lineDrawables.size()) {
                        break;
                    }
                    SelectAnimatedEmojiDialog.EmojiListView.DrawingInBackgroundLine drawingInBackgroundLine2 = (SelectAnimatedEmojiDialog.EmojiListView.DrawingInBackgroundLine) anonymousClass13.lineDrawables.get(i4);
                    for (int i5 = 0; i5 < drawingInBackgroundLine2.imageViewEmojis.size(); i5++) {
                        if (((SelectAnimatedEmojiDialog.ImageViewEmoji) drawingInBackgroundLine2.imageViewEmojis.get(i5)).notDraw) {
                            ((SelectAnimatedEmojiDialog.ImageViewEmoji) drawingInBackgroundLine2.imageViewEmojis.get(i5)).notDraw = false;
                            ((SelectAnimatedEmojiDialog.ImageViewEmoji) drawingInBackgroundLine2.imageViewEmojis.get(i5)).invalidate();
                            drawingInBackgroundLine2.reset();
                        }
                    }
                    i4++;
                }
                anonymousClass13.invalidate();
                for (int i6 = 0; i6 < anonymousClass7.getChildCount(); i6++) {
                    if (anonymousClass7.getChildAt(i6) instanceof SelectAnimatedEmojiDialog.ImageViewEmoji) {
                        SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = (SelectAnimatedEmojiDialog.ImageViewEmoji) anonymousClass7.getChildAt(i6);
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
        this.windowView.getLocationOnScreen(iArr);
        float topOffset = this.reactionsContainerLayout.getTopOffset() + ((((this.location[1] - iArr[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (this.selectAnimatedEmojiDialog.includeHint ? AndroidUtilities.dp(26.0f) : 0));
        if (this.reactionsContainerLayout.showExpandableReactions) {
            topOffset = (this.location[1] - iArr[1]) - AndroidUtilities.dp(12.0f);
        }
        if (this.containerView.getMeasuredHeight() + topOffset > this.windowView.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (this.windowView.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - this.containerView.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (this.type == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        int i = this.type;
        if (i == 1) {
            this.containerView.setTranslationX(((this.windowView.getMeasuredWidth() - this.containerView.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
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
        valueAnimatorOfFloat.addUpdateListener(new SecretVoicePlayer$$ExternalSyntheticLambda1(8, this, z));
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
        this.valueAnimator.addListener(new LoginActivity.AnonymousClass9(6, this, z));
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
        if (z) {
            this.reactionsContainerLayout.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator2 = this.valueAnimator;
            Objects.requireNonNull(valueAnimator2);
            PasscodeView$9$$ExternalSyntheticLambda0 passcodeView$9$$ExternalSyntheticLambda0 = new PasscodeView$9$$ExternalSyntheticLambda0(valueAnimator2, 29);
            HwEmojis.isCascade = this.cascadeAnimation;
            HwEmojis.isPreparing = true;
            HwEmojis.isBeforePreparing = false;
            if (HwEmojis.firstOpen) {
                HwEmojis.firstOpen = false;
            }
            HwEmojis.task = passcodeView$9$$ExternalSyntheticLambda0;
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
            ValueAnimator valueAnimator = reactionsContainerLayout.pullingDownBackAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            reactionsContainerLayout.pullingLeftOffset = 0.0f;
            IntroActivity.AnonymousClass1 anonymousClass1 = reactionsContainerLayout.customReactionsContainer;
            if (anonymousClass1 != null) {
                anonymousClass1.invalidate();
            }
            reactionsContainerLayout.invalidate();
        }
        Bulletin bulletin = Bulletin.visibleBulletin;
        if (bulletin != null) {
            bulletin.hide();
        }
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

    public final void dismiss$1() {
        int i = 0;
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new CustomEmojiReactionsWindow$$ExternalSyntheticLambda0(this, 0));
        valueAnimatorOfFloat.addListener(new AnonymousClass8(this, i));
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.start();
    }

    public final void dismissWithAlpha() {
        if (this.dismissed) {
            return;
        }
        Bulletin bulletin = Bulletin.visibleBulletin;
        if (bulletin != null) {
            bulletin.hide();
        }
        this.dismissed = true;
        IntroActivity.AnonymousClass1 anonymousClass1 = this.windowView;
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
        int i = 0;
        if (this.type != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new CustomEmojiReactionsWindow$$ExternalSyntheticLambda1(this, i));
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
        AnonymousClass2 anonymousClass2 = this.selectAnimatedEmojiDialog;
        float y = anonymousClass2.getY();
        SelectAnimatedEmojiDialog.AnonymousClass2 anonymousClass3 = anonymousClass2.contentView;
        float y2 = anonymousClass3.getY() + y;
        SelectAnimatedEmojiDialog.AnonymousClass7 anonymousClass7 = anonymousClass2.emojiGridView;
        int y3 = (int) (anonymousClass7.getY() + y2);
        ArrayList arrayList = null;
        int i = 0;
        boolean z2 = false;
        while (true) {
            int childCount = anonymousClass7.getChildCount();
            rectF = this.drawingRect;
            hashSet = this.animatingEnterChild;
            if (i >= childCount) {
                break;
            }
            View childAt = anonymousClass7.getChildAt(i);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y3;
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
            i++;
        }
        int y4 = (int) (anonymousClass2.emojiTabs.getY() + anonymousClass3.getY() + anonymousClass2.getY());
        for (int i2 = 0; i2 < anonymousClass2.emojiTabs.contentView.getChildCount(); i2++) {
            View childAt2 = anonymousClass2.emojiTabs.contentView.getChildAt(i2);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y4;
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
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(16, this, arrayList));
            this.animators.add(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new ChatActivity.AnonymousClass63(this, valueAnimatorOfFloat, z, 5));
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
        SelectAnimatedEmojiDialog.AnonymousClass2 anonymousClass3 = anonymousClass2.contentView;
        boolean z = this.cascadeAnimation;
        ContainerView containerView = this.containerView;
        anonymousClass3.setTranslationX(z ? 0.0f : containerView.enterTransitionOffsetX);
        anonymousClass2.contentView.setTranslationY(containerView.enterTransitionOffsetY);
        anonymousClass2.contentView.setPivotX(containerView.enterTransitionScalePx);
        anonymousClass2.contentView.setPivotY(containerView.enterTransitionScalePy);
        anonymousClass2.contentView.setScaleX(containerView.enterTransitionScale);
        anonymousClass2.contentView.setScaleY(containerView.enterTransitionScale);
    }
}
