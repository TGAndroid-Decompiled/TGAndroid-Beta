package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class pu implements Runnable {
    public final int f48668a;
    public final uw f48669b;
    public final long f48670c;
    public final boolean d;

    public pu(uw uwVar, long j10, boolean z10, int i3) {
        this.f48668a = i3;
        this.f48669b = uwVar;
        this.f48670c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder X2;
        int i3 = this.f48668a;
        boolean z10 = this.d;
        long j10 = this.f48670c;
        uw uwVar = this.f48669b;
        switch (i3) {
            case 0:
                uw uwVar2 = this.f48669b;
                ei.z6 P1 = uwVar2.getMessagesController().P1();
                long j11 = this.f48670c;
                boolean z11 = this.d;
                P1.l0(j11, z11, false);
                m2.t tVar = new m2.t(12, false);
                tVar.f19006b = new pu(uwVar2, j11, z11, 1);
                tVar.f19007c = new pu(uwVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User a22 = uwVar2.getMessagesController().a2(Long.valueOf(j11));
                    str = org.telegram.messenger.g5.m(15, a22.first_name, null);
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = uwVar2.getMessagesController().M0(Long.valueOf(-j11));
                    str = M0.title;
                    chat = M0;
                }
                if (uwVar2.q4()) {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StoriesMovedToDialogs", null, 2131744768, str));
                } else {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StoriesMovedToContacts", null, 2131744769, org.telegram.messenger.g5.m(15, str, null)));
                }
                uwVar2.T = org.telegram.ui.Components.fc.X().V(Collections.singletonList(chat), X2, null, tVar).j();
                return;
            case 1:
                uwVar.getMessagesController().P1().l0(j10, !z10, false);
                return;
            default:
                uwVar.getMessagesController().P1().l0(j10, z10, true);
                return;
        }
    }
}
