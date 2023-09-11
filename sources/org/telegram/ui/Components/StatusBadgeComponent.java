package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$TL_emojiStatus;
import org.telegram.tgnet.TLRPC$TL_emojiStatusUntil;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Premium.PremiumGradient;
public class StatusBadgeComponent {
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    private Drawable verifiedDrawable;

    public StatusBadgeComponent(View view) {
        this.statusDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, AndroidUtilities.dp(18.0f));
    }

    public Drawable updateDrawable(TLObject tLObject, int i, boolean z) {
        if (tLObject instanceof TLRPC$User) {
            return updateDrawable((TLRPC$User) tLObject, null, i, z);
        }
        if (tLObject instanceof TLRPC$Chat) {
            return updateDrawable(null, (TLRPC$Chat) tLObject, i, z);
        }
        return updateDrawable(null, null, i, z);
    }

    public Drawable updateDrawable(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, int i, boolean z) {
        if (tLRPC$Chat != null && tLRPC$Chat.verified) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.statusDrawable;
            Drawable drawable = this.verifiedDrawable;
            if (drawable == null) {
                drawable = new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
            }
            this.verifiedDrawable = drawable;
            swapAnimatedEmojiDrawable.set(drawable, z);
            this.statusDrawable.setColor(null);
            return this.statusDrawable;
        }
        if (tLRPC$User != null && tLRPC$User.verified) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.statusDrawable;
            Drawable drawable2 = this.verifiedDrawable;
            if (drawable2 == null) {
                drawable2 = new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
            }
            this.verifiedDrawable = drawable2;
            swapAnimatedEmojiDrawable2.set(drawable2, z);
            this.statusDrawable.setColor(null);
        } else {
            if (tLRPC$User != null) {
                TLRPC$EmojiStatus tLRPC$EmojiStatus = tLRPC$User.emoji_status;
                if (tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatus) {
                    this.statusDrawable.set(((TLRPC$TL_emojiStatus) tLRPC$EmojiStatus).document_id, z);
                    this.statusDrawable.setColor(null);
                }
            }
            if (tLRPC$User != null) {
                TLRPC$EmojiStatus tLRPC$EmojiStatus2 = tLRPC$User.emoji_status;
                if ((tLRPC$EmojiStatus2 instanceof TLRPC$TL_emojiStatusUntil) && ((TLRPC$TL_emojiStatusUntil) tLRPC$EmojiStatus2).until > ((int) (System.currentTimeMillis() / 1000))) {
                    this.statusDrawable.set(((TLRPC$TL_emojiStatusUntil) tLRPC$User.emoji_status).document_id, z);
                    this.statusDrawable.setColor(null);
                }
            }
            if (tLRPC$User != null && tLRPC$User.premium) {
                this.statusDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                this.statusDrawable.setColor(Integer.valueOf(i));
            } else {
                this.statusDrawable.set((Drawable) null, z);
                this.statusDrawable.setColor(null);
            }
        }
        return this.statusDrawable;
    }

    public Drawable getDrawable() {
        return this.statusDrawable;
    }

    public void onAttachedToWindow() {
        this.statusDrawable.attach();
    }

    public void onDetachedFromWindow() {
        this.statusDrawable.detach();
    }
}
