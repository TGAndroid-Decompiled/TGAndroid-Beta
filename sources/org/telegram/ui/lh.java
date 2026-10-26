package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh implements Runnable {
    public final int f41278a;
    public final un f41279b;
    public final int f41280c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f41281f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41282n;
    public final TLRPC.Chat f41283r;
    public final int f41284s;
    public final MessageObject v;

    public lh(un unVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41278a = i13;
        this.f41279b = unVar;
        this.f41280c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f41281f = i11;
        this.h = messageObject;
        this.f41282n = tL_messages_getDiscussionMessage;
        this.f41283r = chat;
        this.f41284s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41278a) {
            case 0:
                un unVar = this.f41279b;
                unVar.o8(new lh(unVar, this.f41280c, this.d, this.e, this.f41281f, this.h, this.f41282n, this.f41283r, this.f41284s, this.v, 1));
                return;
            default:
                un unVar2 = this.f41279b;
                if (this.f41280c == unVar2.Bc) {
                    unVar2.Dc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        unVar2.Ic = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(unVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        unVar2.Ec = 0;
                        unVar2.Fc = false;
                        unVar2.f44471x0.g1();
                        return;
                    }
                    unVar2.Ha(unVar2.Hc, unVar2.Ic, this.f41281f, this.h, this.f41282n, this.f41283r, this.f41284s, this.v);
                    return;
                }
                return;
        }
    }
}
