package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class hp implements ResultCallback {
    public final ChatThemeController f24711a;
    public final mp f24712b;

    public hp(mp mpVar, ChatThemeController chatThemeController) {
        this.f24712b = mpVar;
        this.f24711a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.e4> emojiThemes = this.f24711a.getEmojiThemes(7);
        mp mpVar = this.f24712b;
        i10 = ((org.telegram.ui.ActionBar.g3) mpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new oh(15, this, emojiThemes));
        mpVar.f26225b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f24712b.getContext(), tL_error.text, 0).show();
    }
}
