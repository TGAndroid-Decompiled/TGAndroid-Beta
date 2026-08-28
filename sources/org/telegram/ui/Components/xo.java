package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class xo implements ResultCallback {
    public final ChatThemeController f34729a;
    public final cp f34730b;

    public xo(cp cpVar, ChatThemeController chatThemeController) {
        this.f34730b = cpVar;
        this.f34729a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i9;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.f34729a.getEmojiThemes(7);
        cp cpVar = this.f34730b;
        i9 = ((org.telegram.ui.ActionBar.f3) cpVar).currentAccount;
        NotificationCenter.getInstance(i9).doOnIdle(new org.telegram.ui.wq(27, this, emojiThemes));
        cpVar.X = false;
    }

    @Override
    public final void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f34730b.getContext(), tL_error.text, 0).show();
    }
}
