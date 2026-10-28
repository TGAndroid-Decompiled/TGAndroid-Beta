package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class wp implements ResultCallback {
    public final ChatThemeController f34557a;
    public final zp f34558b;

    public wp(zp zpVar, ChatThemeController chatThemeController) {
        this.f34558b = zpVar;
        this.f34557a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r6 = (Void) obj;
        ChatThemeController chatThemeController = this.f34557a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.h4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        zp zpVar = this.f34558b;
        i11 = ((org.telegram.ui.ActionBar.k3) zpVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new so(2, this, emojiThemes));
        zpVar.f35408a0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f34558b.getContext(), tL_error.text, 0).show();
    }
}
