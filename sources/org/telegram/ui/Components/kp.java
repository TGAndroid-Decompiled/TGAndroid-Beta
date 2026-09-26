package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class kp implements ResultCallback {
    public final ChatThemeController f25767a;
    public final op f25768b;

    public kp(op opVar, ChatThemeController chatThemeController) {
        this.f25768b = opVar;
        this.f25767a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f25767a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.b4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        op opVar = this.f25768b;
        i11 = ((org.telegram.ui.ActionBar.e3) opVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new kd(21, this, emojiThemes));
        opVar.f27069b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f25768b.getContext(), tL_error.text, 0).show();
    }
}
