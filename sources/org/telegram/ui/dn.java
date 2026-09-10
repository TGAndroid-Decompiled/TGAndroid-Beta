package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dn implements Runnable {
    public final int f31948a;
    public final pn f31949b;
    public final TLRPC.Chat f31950c;

    public dn(pn pnVar, TLRPC.Chat chat, int i10) {
        this.f31948a = i10;
        this.f31949b = pnVar;
        this.f31950c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f31948a;
        TLRPC.Chat chat = this.f31950c;
        pn pnVar = this.f31949b;
        switch (i10) {
            case 0:
                pnVar.w(chat);
                return;
            case 1:
                pnVar.b(chat);
                return;
            case 2:
                pnVar.f35881a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(pnVar.f35881a);
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
