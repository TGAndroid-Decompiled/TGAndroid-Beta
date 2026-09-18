package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bn implements Runnable {
    public final int f32211a;
    public final nn f32212b;
    public final TLRPC.Chat f32213c;

    public bn(nn nnVar, TLRPC.Chat chat, int i10) {
        this.f32211a = i10;
        this.f32212b = nnVar;
        this.f32213c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f32211a;
        TLRPC.Chat chat = this.f32213c;
        nn nnVar = this.f32212b;
        switch (i10) {
            case 0:
                nnVar.x(chat);
                return;
            case 1:
                nnVar.b(chat);
                return;
            case 2:
                nnVar.f36139a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(nnVar.f36139a);
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
