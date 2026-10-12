package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dn implements Runnable {
    public final int f36850a;
    public final pn f36851b;
    public final TLRPC.Chat f36852c;

    public dn(pn pnVar, TLRPC.Chat chat, int i10) {
        this.f36850a = i10;
        this.f36851b = pnVar;
        this.f36852c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f36850a;
        TLRPC.Chat chat = this.f36852c;
        pn pnVar = this.f36851b;
        switch (i10) {
            case 0:
                pnVar.v(chat);
                return;
            case 1:
                pnVar.a(chat);
                return;
            case 2:
                pnVar.f40998a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(pnVar.f40998a);
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
