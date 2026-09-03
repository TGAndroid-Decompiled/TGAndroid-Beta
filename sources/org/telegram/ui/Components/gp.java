package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class gp implements ResultCallback {
    public final ChatThemeController f27227a;
    public final mp f27228b;

    public gp(mp mpVar, ChatThemeController chatThemeController) {
        this.f27228b = mpVar;
        this.f27227a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.f4> emojiThemes = this.f27227a.getEmojiThemes(7);
        mp mpVar = this.f27228b;
        i10 = ((org.telegram.ui.ActionBar.h3) mpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new eo(1, this, emojiThemes));
        mpVar.Y = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f27228b.getContext(), tL_error.text, 0).show();
    }
}
