package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class qp implements ResultCallback {
    public final ChatThemeController f29970a;
    public final up f29971b;

    public qp(up upVar, ChatThemeController chatThemeController) {
        this.f29971b = upVar;
        this.f29970a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.f4> emojiThemes = this.f29970a.getEmojiThemes(7);
        up upVar = this.f29971b;
        i10 = ((org.telegram.ui.ActionBar.h3) upVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new ce(21, this, emojiThemes));
        upVar.f31174a0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f29971b.getContext(), tL_error.text, 0).show();
    }
}
