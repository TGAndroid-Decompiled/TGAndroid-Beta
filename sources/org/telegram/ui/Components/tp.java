package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class tp implements ResultCallback {
    public final ChatThemeController f30883a;
    public final wp f30884b;

    public tp(wp wpVar, ChatThemeController chatThemeController) {
        this.f30884b = wpVar;
        this.f30883a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f30883a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.f4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        wp wpVar = this.f30884b;
        i11 = ((org.telegram.ui.ActionBar.h3) wpVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new ee(22, this, emojiThemes));
        wpVar.f32283a0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f30884b.getContext(), tL_error.text, 0).show();
    }
}
