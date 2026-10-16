package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class up implements ResultCallback {
    public final ChatThemeController f29415a;
    public final zp f29416b;

    public up(zp zpVar, ChatThemeController chatThemeController) {
        this.f29416b = zpVar;
        this.f29415a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.f29415a.getEmojiThemes(7);
        zp zpVar = this.f29416b;
        i10 = ((org.telegram.ui.ActionBar.e3) zpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new vm(2, this, emojiThemes));
        zpVar.f31645b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f29416b.getContext(), tL_error.text, 0).show();
    }
}
