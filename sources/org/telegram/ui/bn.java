package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bn implements Runnable {
    public final int f32227a;
    public final nn f32228b;
    public final TLRPC.Chat f32229c;

    public bn(nn nnVar, TLRPC.Chat chat, int i10) {
        this.f32227a = i10;
        this.f32228b = nnVar;
        this.f32229c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f32227a;
        TLRPC.Chat chat = this.f32229c;
        nn nnVar = this.f32228b;
        switch (i10) {
            case 0:
                nnVar.x(chat);
                return;
            case 1:
                nnVar.b(chat);
                return;
            case 2:
                nnVar.f36017a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(nnVar.f36017a);
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
