package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class xp implements ResultCallback {
    public final ChatThemeController f33000a;
    public final cq f33001b;

    public xp(cq cqVar, ChatThemeController chatThemeController) {
        this.f33001b = cqVar;
        this.f33000a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.f33000a.getEmojiThemes(7);
        cq cqVar = this.f33001b;
        i10 = ((org.telegram.ui.ActionBar.e3) cqVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new wc(25, this, emojiThemes));
        cqVar.f25263b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f33001b.getContext(), tL_error.text, 0).show();
    }
}
