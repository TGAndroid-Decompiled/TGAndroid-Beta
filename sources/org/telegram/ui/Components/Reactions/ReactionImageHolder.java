package org.telegram.ui.Components.Reactions;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.PhotoViewer;

public final class ReactionImageHolder {
    public AnimatedEmojiDrawable animatedEmojiDrawable;
    public boolean attached;
    public PorterDuffColorFilter colorFilter;
    public ReactionsLayoutInBubble.VisibleReaction currentReaction;
    public final ImageReceiver imageReceiver;
    public boolean isStatic;
    public int lastColorForFilter;
    public View parent;
    public final Rect bounds = new Rect();
    public final int currentAccount = UserConfig.selectedAccount;
    public float alpha = 1.0f;

    public ReactionImageHolder(View view) {
        this.parent = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void draw(Canvas canvas) {
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        Rect rect = this.bounds;
        if (animatedEmojiDrawable == null) {
            ImageReceiver imageReceiver = this.imageReceiver;
            imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
            imageReceiver.setAlpha(this.alpha);
            imageReceiver.draw(canvas);
            return;
        }
        PhotoViewer.AnonymousClass11 anonymousClass11 = animatedEmojiDrawable.imageReceiver;
        if (anonymousClass11 != null) {
            anonymousClass11.setRoundRadius((int) (rect.width() * 0.1f));
        }
        this.animatedEmojiDrawable.setColorFilter(this.colorFilter);
        this.animatedEmojiDrawable.setBounds(rect);
        this.animatedEmojiDrawable.setAlpha((int) (this.alpha * 255.0f));
        this.animatedEmojiDrawable.draw(canvas);
    }

    public final void onAttachedToWindow(boolean z) {
        this.attached = z;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (z) {
            imageReceiver.onAttachedToWindow();
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this.parent);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable2 != null) {
            animatedEmojiDrawable2.removeView(this.parent);
        }
    }

    public final void setVisibleReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        if (Objects.equals(this.currentReaction, visibleReaction)) {
            return;
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.clearImage();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this.parent);
            this.animatedEmojiDrawable = null;
        }
        this.currentReaction = visibleReaction;
        boolean z = this.isStatic;
        String str = z ? "60_60_firstframe" : "60_60";
        if (visibleReaction.emojicon != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(visibleReaction.emojicon);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f), 0L, "tgs", visibleReaction, 0);
                return;
            }
            return;
        }
        AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(z ? 13 : 1, UserConfig.selectedAccount, visibleReaction.documentId);
        this.animatedEmojiDrawable = animatedEmojiDrawable2;
        if (this.attached) {
            animatedEmojiDrawable2.addView(this.parent);
        }
        AnimatedEmojiDrawable animatedEmojiDrawable3 = this.animatedEmojiDrawable;
        this.lastColorForFilter = -16777216;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.colorFilter = porterDuffColorFilter;
        animatedEmojiDrawable3.setColorFilter(porterDuffColorFilter);
    }
}
