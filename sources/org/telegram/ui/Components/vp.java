package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class vp implements ResultCallback {
    public final ChatThemeController f34344a;
    public final zp f34345b;

    public vp(zp zpVar, ChatThemeController chatThemeController) {
        this.f34345b = zpVar;
        this.f34344a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.h4> emojiThemes = this.f34344a.getEmojiThemes(7);
        zp zpVar = this.f34345b;
        i10 = ((org.telegram.ui.ActionBar.k3) zpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new so(1, this, emojiThemes));
        zpVar.f35408a0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f34345b.getContext(), tL_error.text, 0).show();
    }
}
