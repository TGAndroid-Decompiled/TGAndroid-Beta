package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bn implements Runnable {
    public final int f32207a;
    public final nn f32208b;
    public final TLRPC.Chat f32209c;

    public bn(nn nnVar, TLRPC.Chat chat, int i10) {
        this.f32207a = i10;
        this.f32208b = nnVar;
        this.f32209c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f32207a;
        TLRPC.Chat chat = this.f32209c;
        nn nnVar = this.f32208b;
        switch (i10) {
            case 0:
                nnVar.x(chat);
                return;
            case 1:
                nnVar.b(chat);
                return;
            case 2:
                nnVar.f36134a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(nnVar.f36134a);
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
