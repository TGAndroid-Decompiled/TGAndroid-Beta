package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class yo implements ResultCallback {
    public final ChatThemeController f35041a;
    public final cp f35042b;

    public yo(cp cpVar, ChatThemeController chatThemeController) {
        this.f35042b = cpVar;
        this.f35041a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i9;
        int i10;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f35041a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        List<org.telegram.ui.ActionBar.b4> emojiThemes = chatThemeController.getEmojiThemes(i9 | 5);
        cp cpVar = this.f35042b;
        i10 = ((org.telegram.ui.ActionBar.f3) cpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new org.telegram.ui.wq(28, this, emojiThemes));
        cpVar.X = false;
    }

    @Override
    public final void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f35042b.getContext(), tL_error.text, 0).show();
    }
}
