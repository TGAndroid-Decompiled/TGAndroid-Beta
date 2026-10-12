package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class zp implements ResultCallback {
    public final ChatThemeController f33467a;
    public final eq f33468b;

    public zp(eq eqVar, ChatThemeController chatThemeController) {
        this.f33468b = eqVar;
        this.f33467a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.f33467a.getEmojiThemes(7);
        eq eqVar = this.f33468b;
        i10 = ((org.telegram.ui.ActionBar.e3) eqVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new md(24, this, emojiThemes));
        eqVar.f25746b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.m.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f33468b.getContext(), tL_error.text, 0).show();
    }
}
