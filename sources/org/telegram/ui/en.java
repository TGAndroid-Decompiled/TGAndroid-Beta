package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class en implements Runnable {
    public final int f35639a;
    public final qn f35640b;
    public final TLRPC.Chat f35641c;

    public en(qn qnVar, TLRPC.Chat chat, int i10) {
        this.f35639a = i10;
        this.f35640b = qnVar;
        this.f35641c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f35639a;
        TLRPC.Chat chat = this.f35641c;
        qn qnVar = this.f35640b;
        switch (i10) {
            case 0:
                qnVar.q(chat);
                return;
            case 1:
                qnVar.a(chat);
                return;
            case 2:
                qnVar.f39497a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(qnVar.f39497a);
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
