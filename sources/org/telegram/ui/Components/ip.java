package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ip implements ResultCallback {
    public final ChatThemeController f25108a;
    public final np f25109b;

    public ip(np npVar, ChatThemeController chatThemeController) {
        this.f25109b = npVar;
        this.f25108a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.f25108a.getEmojiThemes(7);
        np npVar = this.f25109b;
        i10 = ((org.telegram.ui.ActionBar.e3) npVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new uc(21, this, emojiThemes));
        npVar.f26747b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f25109b.getContext(), tL_error.text, 0).show();
    }
}
