package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class up implements ResultCallback {
    public final ChatThemeController f33471a;
    public final yp f33472b;

    public up(yp ypVar, ChatThemeController chatThemeController) {
        this.f33472b = ypVar;
        this.f33471a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.h4> emojiThemes = this.f33471a.getEmojiThemes(7);
        yp ypVar = this.f33472b;
        i10 = ((org.telegram.ui.ActionBar.k3) ypVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new so(1, this, emojiThemes));
        ypVar.f35092a0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f33472b.getContext(), tL_error.text, 0).show();
    }
}
