package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh implements Runnable {
    public final int f36650a;
    public final xn f36651b;
    public final int f36652c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f36653f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f36654n;
    public final TLRPC.Chat f36655r;
    public final int f36656s;
    public final MessageObject v;

    public nh(xn xnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f36650a = i13;
        this.f36651b = xnVar;
        this.f36652c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f36653f = i11;
        this.h = messageObject;
        this.f36654n = tL_messages_getDiscussionMessage;
        this.f36655r = chat;
        this.f36656s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f36650a) {
            case 0:
                xn xnVar = this.f36651b;
                xnVar.h8(new nh(xnVar, this.f36652c, this.d, this.e, this.f36653f, this.h, this.f36654n, this.f36655r, this.f36656s, this.v, 1));
                return;
            default:
                xn xnVar2 = this.f36651b;
                if (this.f36652c == xnVar2.f39983cc) {
                    xnVar2.f40008ec = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        xnVar2.jc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(xnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        xnVar2.f40021fc = 0;
                        xnVar2.f40034gc = false;
                        xnVar2.f40193u0.f1();
                        return;
                    }
                    xnVar2.ya(xnVar2.ic, xnVar2.jc, this.f36653f, this.h, this.f36654n, this.f36655r, this.f36656s, this.v);
                    return;
                }
                return;
        }
    }
}
