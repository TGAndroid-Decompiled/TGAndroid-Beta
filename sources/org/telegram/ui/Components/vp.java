package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class vp implements ResultCallback {
    public final ChatThemeController f30288a;
    public final zp f30289b;

    public vp(zp zpVar, ChatThemeController chatThemeController) {
        this.f30289b = zpVar;
        this.f30288a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f30288a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.b4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        zp zpVar = this.f30289b;
        i11 = ((org.telegram.ui.ActionBar.e3) zpVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new vm(3, this, emojiThemes));
        zpVar.f31645b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f30289b.getContext(), tL_error.text, 0).show();
    }
}
