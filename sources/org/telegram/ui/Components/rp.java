package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class rp implements ResultCallback {
    public final ChatThemeController f30253a;
    public final up f30254b;

    public rp(up upVar, ChatThemeController chatThemeController) {
        this.f30254b = upVar;
        this.f30253a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f30253a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.f4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        up upVar = this.f30254b;
        i11 = ((org.telegram.ui.ActionBar.h3) upVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new ce(22, this, emojiThemes));
        upVar.f31174a0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f30254b.getContext(), tL_error.text, 0).show();
    }
}
