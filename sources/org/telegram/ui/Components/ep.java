package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ep implements ResultCallback {
    public final ChatThemeController f24625a;
    public final kp f24626b;

    public ep(kp kpVar, ChatThemeController chatThemeController) {
        this.f24626b = kpVar;
        this.f24625a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.e4> emojiThemes = this.f24625a.getEmojiThemes(7);
        kp kpVar = this.f24626b;
        i10 = ((org.telegram.ui.ActionBar.g3) kpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new il(3, this, emojiThemes));
        kpVar.Y = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f24626b.getContext(), tL_error.text, 0).show();
    }
}
