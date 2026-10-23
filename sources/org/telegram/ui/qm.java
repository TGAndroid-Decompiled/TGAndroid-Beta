package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qm implements Runnable {
    public final int f40611a;
    public final cn f40612b;
    public final TLRPC.Chat f40613c;

    public qm(cn cnVar, TLRPC.Chat chat, int i10) {
        this.f40611a = i10;
        this.f40612b = cnVar;
        this.f40613c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f40611a;
        TLRPC.Chat chat = this.f40613c;
        cn cnVar = this.f40612b;
        switch (i10) {
            case 0:
                cnVar.u(chat);
                return;
            case 1:
                cnVar.a(chat);
                return;
            case 2:
                cnVar.f36015a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(cnVar.f36015a);
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
