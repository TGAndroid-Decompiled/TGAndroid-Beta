package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.PremiumGradient;

public final class StatusBadgeComponent {
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    public Drawable verifiedDrawable;

    public StatusBadgeComponent(int i, View view) {
        this.statusDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, AndroidUtilities.dp(i), 7);
    }

    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable updateDrawable(TLRPC.User user, TLRPC.Chat chat, int i, boolean z) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.statusDrawable;
        if (chat != null && chat.verified) {
            Drawable combinedDrawable = this.verifiedDrawable;
            if (combinedDrawable == null) {
                combinedDrawable = new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
            }
            this.verifiedDrawable = combinedDrawable;
            swapAnimatedEmojiDrawable.set(combinedDrawable, z);
            swapAnimatedEmojiDrawable.setColor(null);
            return swapAnimatedEmojiDrawable;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z);
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(i));
            return swapAnimatedEmojiDrawable;
        }
        if (user != null && user.verified) {
            Drawable combinedDrawable2 = this.verifiedDrawable;
            if (combinedDrawable2 == null) {
                combinedDrawable2 = new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
            }
            this.verifiedDrawable = combinedDrawable2;
            swapAnimatedEmojiDrawable.set(combinedDrawable2, z);
            swapAnimatedEmojiDrawable.setColor(null);
            return swapAnimatedEmojiDrawable;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z);
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(i));
            return swapAnimatedEmojiDrawable;
        }
        if (user == null || !user.premium) {
            swapAnimatedEmojiDrawable.set((Drawable) null, z);
            swapAnimatedEmojiDrawable.setColor(null);
            return swapAnimatedEmojiDrawable;
        }
        swapAnimatedEmojiDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
        swapAnimatedEmojiDrawable.setColor(Integer.valueOf(i));
        return swapAnimatedEmojiDrawable;
    }
}
