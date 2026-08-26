package org.telegram.ui.Stories;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;

public final class StoriesLikeButton extends View {
    public boolean allowDrawReaction;
    public final ImageReceiver animateReactionImageReceiver;
    public boolean attachedToWindow;
    public boolean drawAnimateImageReciever;
    public AnimatedEmojiDrawable emojiDrawable;
    public boolean isLike;
    public boolean liked;
    public final AnimatedFloat progressToLiked;
    public final ImageReceiver reactionImageReceiver;
    public final PeerStoriesView.SharedResources sharedResources;

    public StoriesLikeButton(Context context, PeerStoriesView.SharedResources sharedResources) {
        super(context);
        this.progressToLiked = new AnimatedFloat(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.reactionImageReceiver = imageReceiver;
        this.animateReactionImageReceiver = new ImageReceiver(this);
        this.allowDrawReaction = true;
        this.sharedResources = sharedResources;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.reactionImageReceiver.onAttachedToWindow();
        this.animateReactionImageReceiver.onAttachedToWindow();
        this.attachedToWindow = true;
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.addView(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.reactionImageReceiver.onDetachedFromWindow();
        this.animateReactionImageReceiver.onDetachedFromWindow();
        this.attachedToWindow = false;
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.isLike) {
            float f = this.progressToLiked.set(this.liked ? 1.0f : 0.0f);
            PeerStoriesView.SharedResources sharedResources = this.sharedResources;
            if (f < 1.0f) {
                sharedResources.likeDrawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                Drawable drawable = sharedResources.likeDrawable;
                drawable.setAlpha(255);
                drawable.draw(canvas);
            }
            if (f > 0.0f) {
                sharedResources.likeDrawableFilled.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                Drawable drawable2 = sharedResources.likeDrawableFilled;
                drawable2.setAlpha((int) (f * 255.0f));
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (this.allowDrawReaction) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
            ImageReceiver imageReceiver = this.reactionImageReceiver;
            ImageReceiver imageReceiver2 = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : imageReceiver;
            if (this.drawAnimateImageReciever) {
                ImageReceiver imageReceiver3 = this.animateReactionImageReceiver;
                if (imageReceiver3.getBitmap() != null) {
                    int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                    float f2 = measuredWidth / 2.0f;
                    float f3 = measuredWidth * 2;
                    imageReceiver3.setImageCoords(getPaddingLeft() - f2, getPaddingTop() - f2, f3, f3);
                    if (imageReceiver3.getLottieAnimation() != null && imageReceiver3.getLottieAnimation().isLastFrame()) {
                        this.drawAnimateImageReciever = false;
                        imageReceiver.setCrossfadeAlpha((byte) 0);
                    }
                    imageReceiver2 = imageReceiver3;
                } else if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(getPaddingLeft(), getPaddingTop(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                }
            } else if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(getPaddingLeft(), getPaddingTop(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            }
            if (imageReceiver2 != null) {
                imageReceiver2.draw(canvas);
            }
        }
    }

    public void setAllowDrawReaction(boolean z) {
        if (this.allowDrawReaction == z) {
            return;
        }
        this.allowDrawReaction = z;
        invalidate();
    }

    public void setReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        String str;
        String str2;
        this.isLike = visibleReaction == null || ((str2 = visibleReaction.emojicon) != null && str2.equals("❤"));
        if (visibleReaction == null || (str = visibleReaction.emojicon) == null || !str.equals("❤")) {
            this.liked = false;
        } else {
            this.liked = true;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this);
        }
        this.emojiDrawable = null;
        if (visibleReaction != null) {
            if (visibleReaction.documentId != 0) {
                AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(3, UserConfig.selectedAccount, visibleReaction.documentId);
                this.emojiDrawable = animatedEmojiDrawable2;
                if (this.attachedToWindow) {
                    animatedEmojiDrawable2.addView(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(visibleReaction.emojicon);
                if (tL_availableReaction != null) {
                    this.reactionImageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, Theme.key_windowBackgroundGray, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
