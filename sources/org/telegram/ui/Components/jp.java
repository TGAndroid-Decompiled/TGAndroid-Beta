package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class jp implements ResultCallback {
    public final ChatThemeController f25495a;
    public final op f25496b;

    public jp(op opVar, ChatThemeController chatThemeController) {
        this.f25496b = opVar;
        this.f25495a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.f25495a.getEmojiThemes(7);
        op opVar = this.f25496b;
        i10 = ((org.telegram.ui.ActionBar.e3) opVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new uc(21, this, emojiThemes));
        opVar.f27138b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f25496b.getContext(), tL_error.text, 0).show();
    }
}
