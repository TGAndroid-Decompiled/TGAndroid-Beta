package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class aa0 implements Runnable {
    public final int f31990a;
    public final zn f31991b;
    public final long f31992c;
    public final TLRPC.Chat d;

    public aa0(zn znVar, long j3, TLRPC.Chat chat, int i10) {
        this.f31990a = i10;
        this.f31991b = znVar;
        this.f31992c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f31990a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f31992c;
        zn znVar = this.f31991b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.xc.a0(znVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.xc.a0(znVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
