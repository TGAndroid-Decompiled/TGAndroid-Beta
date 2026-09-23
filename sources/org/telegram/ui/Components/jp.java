package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class jp implements ResultCallback {
    public final ChatThemeController f25382a;
    public final np f25383b;

    public jp(np npVar, ChatThemeController chatThemeController) {
        this.f25383b = npVar;
        this.f25382a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f25382a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.c4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        np npVar = this.f25383b;
        i11 = ((org.telegram.ui.ActionBar.f3) npVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new ph(16, this, emojiThemes));
        npVar.f26461b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f25383b.getContext(), tL_error.text, 0).show();
    }
}
