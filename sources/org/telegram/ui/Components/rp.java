package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class rp implements ResultCallback {
    public final ChatThemeController f29989a;
    public final wp f29990b;

    public rp(wp wpVar, ChatThemeController chatThemeController) {
        this.f29990b = wpVar;
        this.f29989a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.c4> emojiThemes = this.f29989a.getEmojiThemes(7);
        wp wpVar = this.f29990b;
        i10 = ((org.telegram.ui.ActionBar.f3) wpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new ee(21, this, emojiThemes));
        wpVar.f32210b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f29990b.getContext(), tL_error.text, 0).show();
    }
}
