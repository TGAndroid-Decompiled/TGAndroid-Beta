package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ba0 implements Runnable {
    public final int f36118a;
    public final eo f36119b;
    public final long f36120c;
    public final TLRPC.Chat d;

    public ba0(eo eoVar, long j3, TLRPC.Chat chat, int i10) {
        this.f36118a = i10;
        this.f36119b = eoVar;
        this.f36120c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f36118a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f36120c;
        eo eoVar = this.f36119b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.zc.a0(eoVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.zc.a0(eoVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
