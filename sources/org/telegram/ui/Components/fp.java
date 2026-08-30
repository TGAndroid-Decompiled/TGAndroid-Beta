package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class fp implements ResultCallback {
    public final ChatThemeController f24931a;
    public final kp f24932b;

    public fp(kp kpVar, ChatThemeController chatThemeController) {
        this.f24932b = kpVar;
        this.f24931a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f24931a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.e4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        kp kpVar = this.f24932b;
        i11 = ((org.telegram.ui.ActionBar.g3) kpVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new il(4, this, emojiThemes));
        kpVar.Y = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f24932b.getContext(), tL_error.text, 0).show();
    }
}
