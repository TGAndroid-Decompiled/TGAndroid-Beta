package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class aq implements ResultCallback {
    public final ChatThemeController f24457a;
    public final eq f24458b;

    public aq(eq eqVar, ChatThemeController chatThemeController) {
        this.f24458b = eqVar;
        this.f24457a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f24457a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.b4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        eq eqVar = this.f24458b;
        i11 = ((org.telegram.ui.ActionBar.e3) eqVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new md(24, this, emojiThemes));
        eqVar.f25746b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.m.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f24458b.getContext(), tL_error.text, 0).show();
    }
}
