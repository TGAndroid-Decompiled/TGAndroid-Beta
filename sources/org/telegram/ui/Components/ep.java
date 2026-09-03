package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.List;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class ep implements ResultCallback {
    public final ChatThemeController f24664a;
    public final jp f24665b;

    public ep(jp jpVar, ChatThemeController chatThemeController) {
        this.f24665b = jpVar;
        this.f24664a = chatThemeController;
    }

    @Override
    public final void onComplete(Object obj) {
        int i10;
        int i11;
        Void r62 = (Void) obj;
        ChatThemeController chatThemeController = this.f24664a;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        List<org.telegram.ui.ActionBar.e4> emojiThemes = chatThemeController.getEmojiThemes(i10 | 5);
        jp jpVar = this.f24665b;
        i11 = ((org.telegram.ui.ActionBar.g3) jpVar).currentAccount;
        NotificationCenter.getInstance(i11).doOnIdle(new em(3, this, emojiThemes));
        jpVar.Y = false;
    }

    @Override
    public final void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.f24665b.getContext(), tL_error.text, 0).show();
    }
}
