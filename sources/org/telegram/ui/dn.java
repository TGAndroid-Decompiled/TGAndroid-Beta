package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dn implements Runnable {
    public final int f36853a;
    public final pn f36854b;
    public final TLRPC.Chat f36855c;

    public dn(pn pnVar, TLRPC.Chat chat, int i10) {
        this.f36853a = i10;
        this.f36854b = pnVar;
        this.f36855c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f36853a;
        TLRPC.Chat chat = this.f36855c;
        pn pnVar = this.f36854b;
        switch (i10) {
            case 0:
                pnVar.v(chat);
                return;
            case 1:
                pnVar.a(chat);
                return;
            case 2:
                pnVar.f41000a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(pnVar.f41000a);
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
