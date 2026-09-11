package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class aa0 implements Runnable {
    public final int f34364a;
    public final co f34365b;
    public final long f34366c;
    public final TLRPC.Chat d;

    public aa0(co coVar, long j3, TLRPC.Chat chat, int i10) {
        this.f34364a = i10;
        this.f34365b = coVar;
        this.f34366c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f34364a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f34366c;
        co coVar = this.f34365b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.yc.a0(coVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.yc.a0(coVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
