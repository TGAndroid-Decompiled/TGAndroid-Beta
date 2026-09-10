package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class np implements ResultCallback {
    public final ChatThemeController f25563a;
    public final sp f25564b;

    public np(sp spVar, ChatThemeController chatThemeController) {
        this.f25564b = spVar;
        this.f25563a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.f4> emojiThemes = this.f25563a.getEmojiThemes(7);
        sp spVar = this.f25564b;
        i10 = ((org.telegram.ui.ActionBar.h3) spVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new ee(18, this, emojiThemes));
        spVar.f27133b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f25564b.getContext(), tL_error.text, 0).show();
    }
}
