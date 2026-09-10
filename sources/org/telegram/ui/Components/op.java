package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class op implements ResultCallback {
    public final ChatThemeController f25879a;
    public final sp f25880b;

    public op(sp spVar, ChatThemeController chatThemeController) {
        this.f25880b = spVar;
        this.f25879a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f25879a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.f4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        sp spVar = this.f25880b;
        i11 = ((org.telegram.ui.ActionBar.h3) spVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new ee(19, this, emojiThemes));
        spVar.f27133b0 = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f25880b.getContext(), tL_error.text, 0).show();
    }
}
