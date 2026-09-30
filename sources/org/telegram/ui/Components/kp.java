package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class kp implements ResultCallback {
    public final ChatThemeController f25804a;
    public final pp f25805b;

    public kp(pp ppVar, ChatThemeController chatThemeController) {
        this.f25805b = ppVar;
        this.f25804a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.f25804a.getEmojiThemes(7);
        pp ppVar = this.f25805b;
        i10 = ((org.telegram.ui.ActionBar.e3) ppVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new ld(20, this, emojiThemes));
        ppVar.f27425b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f25805b.getContext(), tL_error.text, 0).show();
    }
}
