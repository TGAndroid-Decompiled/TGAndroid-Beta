package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class cp implements ResultCallback {
    public final ChatThemeController f27546a;
    public final gp f27547b;

    public cp(gp gpVar, ChatThemeController chatThemeController) {
        this.f27547b = gpVar;
        this.f27546a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r6 = (Void) obj;
        ChatThemeController chatThemeController = this.f27546a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.b4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        gp gpVar = this.f27547b;
        i11 = ((org.telegram.ui.ActionBar.f3) gpVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new z2(25, this, emojiThemes));
        gpVar.X = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f27547b.getContext(), tL_error.text, 0).show();
    }
}
