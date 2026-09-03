package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class dp implements ResultCallback {
    public final ChatThemeController f24334a;
    public final jp f24335b;

    public dp(jp jpVar, ChatThemeController chatThemeController) {
        this.f24335b = jpVar;
        this.f24334a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        List list = (List) obj;
        List<org.telegram.ui.ActionBar.e4> emojiThemes = this.f24334a.getEmojiThemes(7);
        jp jpVar = this.f24335b;
        i10 = ((org.telegram.ui.ActionBar.g3) jpVar).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(new em(2, this, emojiThemes));
        jpVar.Y = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f24335b.getContext(), tL_error.text, 0).show();
    }
}
