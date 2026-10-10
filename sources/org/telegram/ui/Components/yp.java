package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class yp implements ResultCallback {
    public final ChatThemeController f33385a;
    public final cq f33386b;

    public yp(cq cqVar, ChatThemeController chatThemeController) {
        this.f33386b = cqVar;
        this.f33385a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f33385a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.c4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        cq cqVar = this.f33386b;
        i11 = ((org.telegram.ui.ActionBar.f3) cqVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new ea(27, this, emojiThemes));
        cqVar.f25362b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f33386b.getContext(), tL_error.text, 0).show();
    }
}
