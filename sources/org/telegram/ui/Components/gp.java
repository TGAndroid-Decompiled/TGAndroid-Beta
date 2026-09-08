package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class gp implements ResultCallback {
    public final ChatThemeController f26505a;
    public final lp f26506b;

    public gp(lp lpVar, ChatThemeController chatThemeController) {
        this.f26506b = lpVar;
        this.f26505a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.d4> emojiThemes = this.f26505a.getEmojiThemes(7);
        lp lpVar = this.f26506b;
        i10 = ((org.telegram.ui.ActionBar.f3) lpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new uc(21, this, emojiThemes));
        lpVar.f28284b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f26506b.getContext(), tL_error.text, 0).show();
    }
}
