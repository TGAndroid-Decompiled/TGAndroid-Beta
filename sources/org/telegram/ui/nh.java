package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh implements Runnable {
    public final int f39440a;
    public final xn f39441b;
    public final int f39442c;
    public final TLObject d;
    public final TLRPC.TL_error f39443e;
    public final int f39444f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f39445n;
    public final TLRPC.Chat f39446r;
    public final int f39447s;
    public final MessageObject v;

    public nh(xn xnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f39440a = i13;
        this.f39441b = xnVar;
        this.f39442c = i10;
        this.d = tLObject;
        this.f39443e = tL_error;
        this.f39444f = i11;
        this.h = messageObject;
        this.f39445n = tL_messages_getDiscussionMessage;
        this.f39446r = chat;
        this.f39447s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f39440a) {
            case 0:
                xn xnVar = this.f39441b;
                xnVar.h8(new nh(xnVar, this.f39442c, this.d, this.f39443e, this.f39444f, this.h, this.f39445n, this.f39446r, this.f39447s, this.v, 1));
                return;
            default:
                xn xnVar2 = this.f39441b;
                if (this.f39442c == xnVar2.f43151cc) {
                    xnVar2.f43177ec = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        xnVar2.jc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f39443e.text)) {
                        MessagesController.showCantOpenAlert(xnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        xnVar2.f43190fc = 0;
                        xnVar2.f43203gc = false;
                        xnVar2.f43362u0.f1();
                        return;
                    }
                    xnVar2.ya(xnVar2.ic, xnVar2.jc, this.f39444f, this.h, this.f39445n, this.f39446r, this.f39447s, this.v);
                    return;
                }
                return;
        }
    }
}
