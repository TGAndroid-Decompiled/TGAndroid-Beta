package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

public final class vo implements ResultCallback {

    public final ChatThemeController f33466a;

    public final ap f33467b;

    public vo(ap apVar, ChatThemeController chatThemeController) {
        this.f33467b = apVar;
        this.f33466a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        List<org.telegram.ui.ActionBar.b4> emojiThemes = this.f33466a.getEmojiThemes(7);
        ap apVar = this.f33467b;
        NotificationCenter.getInstance(((org.telegram.ui.ActionBar.e3) apVar).currentAccount).doOnIdle(new org.telegram.ui.yq(27, this, emojiThemes));
        apVar.X = false;
    }

    @Override
    public final void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f33467b.getContext(), tL_error.text, 0).show();
    }
}
