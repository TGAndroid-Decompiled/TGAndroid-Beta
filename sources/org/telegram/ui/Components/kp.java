package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class kp implements ResultCallback {
    public final ChatThemeController f28176a;
    public final pp f28177b;

    public kp(pp ppVar, ChatThemeController chatThemeController) {
        this.f28177b = ppVar;
        this.f28176a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.c4> emojiThemes = this.f28176a.getEmojiThemes(7);
        pp ppVar = this.f28177b;
        i10 = ((org.telegram.ui.ActionBar.f3) ppVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new be(18, this, emojiThemes));
        ppVar.f29684b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f28177b.getContext(), tL_error.text, 0).show();
    }
}
