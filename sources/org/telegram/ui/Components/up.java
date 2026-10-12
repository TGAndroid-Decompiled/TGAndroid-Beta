package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class up implements ResultCallback {
    public final ChatThemeController f29745a;
    public final zp f29746b;

    public up(zp zpVar, ChatThemeController chatThemeController) {
        this.f29746b = zpVar;
        this.f29745a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.f29745a.getEmojiThemes(7);
        zp zpVar = this.f29746b;
        i10 = ((org.telegram.ui.ActionBar.e3) zpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new sk(7, this, emojiThemes));
        zpVar.f31942b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f29746b.getContext(), tL_error.text, 0).show();
    }
}
