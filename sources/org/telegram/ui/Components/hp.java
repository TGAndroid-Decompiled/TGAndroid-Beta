package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class hp implements ResultCallback {
    public final ChatThemeController f26779a;
    public final lp f26780b;

    public hp(lp lpVar, ChatThemeController chatThemeController) {
        this.f26780b = lpVar;
        this.f26779a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f26779a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.d4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        lp lpVar = this.f26780b;
        i11 = ((org.telegram.ui.ActionBar.f3) lpVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new uc(22, this, emojiThemes));
        lpVar.f28257b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f26780b.getContext(), tL_error.text, 0).show();
    }
}
