package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qm implements Runnable {
    public final int f40609a;
    public final cn f40610b;
    public final TLRPC.Chat f40611c;

    public qm(cn cnVar, TLRPC.Chat chat, int i10) {
        this.f40609a = i10;
        this.f40610b = cnVar;
        this.f40611c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f40609a;
        TLRPC.Chat chat = this.f40611c;
        cn cnVar = this.f40610b;
        switch (i10) {
            case 0:
                cnVar.u(chat);
                return;
            case 1:
                cnVar.a(chat);
                return;
            case 2:
                cnVar.f36032a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(cnVar.f36032a);
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
