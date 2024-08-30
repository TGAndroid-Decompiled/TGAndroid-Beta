package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Premium.PremiumGradient;

public class StatusBadgeComponent {
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    private Drawable verifiedDrawable;

    public StatusBadgeComponent(View view) {
        this(view, 18);
    }

    public StatusBadgeComponent(View view, int i) {
        this.statusDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, AndroidUtilities.dp(i));
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

    public Drawable updateDrawable(TLObject tLObject, int i, boolean z) {
        return tLObject instanceof TLRPC$User ? updateDrawable((TLRPC$User) tLObject, null, i, z) : tLObject instanceof TLRPC$Chat ? updateDrawable(null, (TLRPC$Chat) tLObject, i, z) : updateDrawable(null, null, i, z);
    }

    public Drawable updateDrawable(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, int i, boolean z) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        Drawable drawable;
        if (tLRPC$Chat == null || !tLRPC$Chat.verified) {
            if (tLRPC$Chat != null && DialogObject.getEmojiStatusDocumentId(tLRPC$Chat.emoji_status) != 0) {
                this.statusDrawable.set(DialogObject.getEmojiStatusDocumentId(tLRPC$Chat.emoji_status), z);
            } else if (tLRPC$User != null && tLRPC$User.verified) {
                swapAnimatedEmojiDrawable = this.statusDrawable;
                drawable = this.verifiedDrawable;
                if (drawable == null) {
                    drawable = new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
                }
            } else if (tLRPC$User != null && DialogObject.getEmojiStatusDocumentId(tLRPC$User.emoji_status) != 0) {
                this.statusDrawable.set(DialogObject.getEmojiStatusDocumentId(tLRPC$User.emoji_status), z);
            } else {
                if (tLRPC$User == null || !tLRPC$User.premium) {
                    this.statusDrawable.set((Drawable) null, z);
                    this.statusDrawable.setColor(null);
                    return this.statusDrawable;
                }
                this.statusDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
            }
            this.statusDrawable.setColor(Integer.valueOf(i));
            return this.statusDrawable;
        }
        swapAnimatedEmojiDrawable = this.statusDrawable;
        drawable = this.verifiedDrawable;
        if (drawable == null) {
            drawable = new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
        }
        this.verifiedDrawable = drawable;
        swapAnimatedEmojiDrawable.set(drawable, z);
        this.statusDrawable.setColor(null);
        return this.statusDrawable;
    }
}
