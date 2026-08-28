package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qm implements Runnable {
    public final int f41834a;
    public final cn f41835b;
    public final TLRPC.Chat f41836c;

    public qm(cn cnVar, TLRPC.Chat chat, int i9) {
        this.f41834a = i9;
        this.f41835b = cnVar;
        this.f41836c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i9 = this.f41834a;
        TLRPC.Chat chat = this.f41836c;
        cn cnVar = this.f41835b;
        switch (i9) {
            case 0:
                cnVar.o(chat);
                return;
            case 1:
                cnVar.b(chat);
                return;
            case 2:
                cnVar.f37236a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(cnVar.f37236a);
                int i10 = R.raw.contact_check;
                int i11 = R.string.YouJoinedChannel;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                a02.Q(i10, 36, LocaleController.formatString(i11, str)).k(true);
                return;
        }
    }
}
