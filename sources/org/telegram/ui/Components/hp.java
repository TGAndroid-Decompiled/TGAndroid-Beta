package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class hp implements ResultCallback {
    public final ChatThemeController f24710a;
    public final mp f24711b;

    public hp(mp mpVar, ChatThemeController chatThemeController) {
        this.f24711b = mpVar;
        this.f24710a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.d4> emojiThemes = this.f24710a.getEmojiThemes(7);
        mp mpVar = this.f24711b;
        i10 = ((org.telegram.ui.ActionBar.f3) mpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new zd(19, this, emojiThemes));
        mpVar.f26476b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f24711b.getContext(), tL_error.text, 0).show();
    }
}
