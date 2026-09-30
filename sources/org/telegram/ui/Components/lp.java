package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class lp implements ResultCallback {
    public final ChatThemeController f26071a;
    public final pp f26072b;

    public lp(pp ppVar, ChatThemeController chatThemeController) {
        this.f26072b = ppVar;
        this.f26071a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f26071a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.b4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        pp ppVar = this.f26072b;
        i11 = ((org.telegram.ui.ActionBar.e3) ppVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new ld(21, this, emojiThemes));
        ppVar.f27425b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f26072b.getContext(), tL_error.text, 0).show();
    }
}
