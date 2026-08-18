package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
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

    public Drawable updateDrawable(TLObject tLObject, int i, boolean z) {
        if (tLObject instanceof TLRPC.User) {
            return updateDrawable((TLRPC.User) tLObject, null, i, z);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return updateDrawable(null, (TLRPC.Chat) tLObject, i, z);
        }
        return updateDrawable(null, null, i, z);
    }

    public Drawable updateDrawable(TLRPC.User user, TLRPC.Chat chat, int i, boolean z) {
        if (chat != null && chat.verified) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.statusDrawable;
            Drawable combinedDrawable = this.verifiedDrawable;
            if (combinedDrawable == null) {
                combinedDrawable = new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
            }
            this.verifiedDrawable = combinedDrawable;
            swapAnimatedEmojiDrawable.set(combinedDrawable, z);
            this.statusDrawable.setColor(null);
        } else if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            this.statusDrawable.set(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z);
            this.statusDrawable.setColor(Integer.valueOf(i));
        } else if (user != null && user.verified) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.statusDrawable;
            Drawable combinedDrawable2 = this.verifiedDrawable;
            if (combinedDrawable2 == null) {
                combinedDrawable2 = new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
            }
            this.verifiedDrawable = combinedDrawable2;
            swapAnimatedEmojiDrawable2.set(combinedDrawable2, z);
            this.statusDrawable.setColor(null);
        } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            this.statusDrawable.set(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z);
            this.statusDrawable.setColor(Integer.valueOf(i));
        } else if (user != null && user.premium) {
            this.statusDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
            this.statusDrawable.setColor(Integer.valueOf(i));
        } else {
            this.statusDrawable.set((Drawable) null, z);
            this.statusDrawable.setColor(null);
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
