package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class gp implements ResultCallback {
    public final ChatThemeController f27243a;
    public final mp f27244b;

    public gp(mp mpVar, ChatThemeController chatThemeController) {
        this.f27244b = mpVar;
        this.f27243a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.f4> emojiThemes = this.f27243a.getEmojiThemes(7);
        mp mpVar = this.f27244b;
        i10 = ((org.telegram.ui.ActionBar.h3) mpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new gm(2, this, emojiThemes));
        mpVar.Y = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f27244b.getContext(), tL_error.text, 0).show();
    }
}
