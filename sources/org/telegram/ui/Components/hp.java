package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class hp implements ResultCallback {
    public final ChatThemeController f27555a;
    public final mp f27556b;

    public hp(mp mpVar, ChatThemeController chatThemeController) {
        this.f27556b = mpVar;
        this.f27555a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f27555a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.f4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        mp mpVar = this.f27556b;
        i11 = ((org.telegram.ui.ActionBar.h3) mpVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new gm(3, this, emojiThemes));
        mpVar.Y = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f27556b.getContext(), tL_error.text, 0).show();
    }
}
