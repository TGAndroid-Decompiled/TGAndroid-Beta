package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ip implements ResultCallback {
    public final ChatThemeController f25039a;
    public final np f25040b;

    public ip(np npVar, ChatThemeController chatThemeController) {
        this.f25040b = npVar;
        this.f25039a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.c4> emojiThemes = this.f25039a.getEmojiThemes(7);
        np npVar = this.f25040b;
        i10 = ((org.telegram.ui.ActionBar.f3) npVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new ph(15, this, emojiThemes));
        npVar.f26461b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f25040b.getContext(), tL_error.text, 0).show();
    }
}
