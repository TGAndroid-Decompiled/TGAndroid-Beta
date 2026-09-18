package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ip implements ResultCallback {
    public final ChatThemeController f25023a;
    public final mp f25024b;

    public ip(mp mpVar, ChatThemeController chatThemeController) {
        this.f25024b = mpVar;
        this.f25023a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f25023a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.d4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        mp mpVar = this.f25024b;
        i11 = ((org.telegram.ui.ActionBar.f3) mpVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new zd(20, this, emojiThemes));
        mpVar.f26476b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f25024b.getContext(), tL_error.text, 0).show();
    }
}
