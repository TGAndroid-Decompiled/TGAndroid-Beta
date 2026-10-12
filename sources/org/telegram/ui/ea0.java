package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ea0 implements Runnable {
    public final int f35497a;
    public final fo f35498b;
    public final long f35499c;
    public final TLRPC.Chat d;

    public ea0(fo foVar, long j10, TLRPC.Chat chat, int i10) {
        this.f35497a = i10;
        this.f35498b = foVar;
        this.f35499c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f35497a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f35499c;
        fo foVar = this.f35498b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.zc.a0(foVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.zc.a0(foVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
