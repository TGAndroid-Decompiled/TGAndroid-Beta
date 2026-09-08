package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cn implements Runnable {
    public final int f35207a;
    public final on f35208b;
    public final TLRPC.Chat f35209c;

    public cn(on onVar, TLRPC.Chat chat, int i10) {
        this.f35207a = i10;
        this.f35208b = onVar;
        this.f35209c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f35207a;
        TLRPC.Chat chat = this.f35209c;
        on onVar = this.f35208b;
        switch (i10) {
            case 0:
                onVar.v(chat);
                return;
            case 1:
                onVar.b(chat);
                return;
            case 2:
                onVar.f39310a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(onVar.f39310a);
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
