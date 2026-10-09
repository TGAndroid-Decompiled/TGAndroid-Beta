package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class xp implements ResultCallback {
    public final ChatThemeController f32987a;
    public final cq f32988b;

    public xp(cq cqVar, ChatThemeController chatThemeController) {
        this.f32988b = cqVar;
        this.f32987a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.c4> emojiThemes = this.f32987a.getEmojiThemes(7);
        cq cqVar = this.f32988b;
        i10 = ((org.telegram.ui.ActionBar.f3) cqVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new ea(26, this, emojiThemes));
        cqVar.f25463b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f32988b.getContext(), tL_error.text, 0).show();
    }
}
