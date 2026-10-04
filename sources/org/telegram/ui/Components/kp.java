package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class kp implements ResultCallback {
    public final ChatThemeController f28181a;
    public final pp f28182b;

    public kp(pp ppVar, ChatThemeController chatThemeController) {
        this.f28182b = ppVar;
        this.f28181a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.c4> emojiThemes = this.f28181a.getEmojiThemes(7);
        pp ppVar = this.f28182b;
        i10 = ((org.telegram.ui.ActionBar.f3) ppVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new be(18, this, emojiThemes));
        ppVar.f29689b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f28182b.getContext(), tL_error.text, 0).show();
    }
}
