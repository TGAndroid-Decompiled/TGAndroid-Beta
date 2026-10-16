package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class en implements Runnable {
    public final int f35335a;
    public final qn f35336b;
    public final TLRPC.Chat f35337c;

    public en(qn qnVar, TLRPC.Chat chat, int i10) {
        this.f35335a = i10;
        this.f35336b = qnVar;
        this.f35337c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f35335a;
        TLRPC.Chat chat = this.f35337c;
        qn qnVar = this.f35336b;
        switch (i10) {
            case 0:
                qnVar.q(chat);
                return;
            case 1:
                qnVar.a(chat);
                return;
            case 2:
                qnVar.f39190a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(qnVar.f39190a);
                int i11 = R.raw.contact_check;
                int i12 = R.string.YouJoinedChannel;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                a02.Q(i11, 36, LocaleController.formatString(i12, str)).k(true);
                return;
        }
    }
}
