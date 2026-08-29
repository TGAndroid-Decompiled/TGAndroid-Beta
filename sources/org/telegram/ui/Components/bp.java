package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class bp implements ResultCallback {
    public final ChatThemeController f27197a;
    public final gp f27198b;

    public bp(gp gpVar, ChatThemeController chatThemeController) {
        this.f27198b = gpVar;
        this.f27197a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.f27197a.getEmojiThemes(7);
        gp gpVar = this.f27198b;
        i10 = ((org.telegram.ui.ActionBar.f3) gpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new z2(24, this, emojiThemes));
        gpVar.X = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f27198b.getContext(), tL_error.text, 0).show();
    }
}
