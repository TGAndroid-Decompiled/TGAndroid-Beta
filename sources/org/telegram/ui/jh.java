package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh implements Runnable {
    public final int f38263a;
    public final qn f38264b;
    public final int f38265c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38266f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38267n;
    public final TLRPC.Chat f38268r;
    public final int f38269s;
    public final MessageObject v;

    public jh(qn qnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38263a = i13;
        this.f38264b = qnVar;
        this.f38265c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38266f = i11;
        this.h = messageObject;
        this.f38267n = tL_messages_getDiscussionMessage;
        this.f38268r = chat;
        this.f38269s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38263a) {
            case 0:
                qn qnVar = this.f38264b;
                qnVar.k8(new jh(qnVar, this.f38265c, this.d, this.e, this.f38266f, this.h, this.f38267n, this.f38268r, this.f38269s, this.v, 1));
                return;
            default:
                qn qnVar2 = this.f38264b;
                if (this.f38265c == qnVar2.fc) {
                    qnVar2.hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        qnVar2.f40776mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(qnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        qnVar2.f40727ic = 0;
                        qnVar2.f40740jc = false;
                        qnVar2.f40905x0.f1();
                        return;
                    }
                    qnVar2.Ca(qnVar2.f40764lc, qnVar2.f40776mc, this.f38266f, this.h, this.f38267n, this.f38268r, this.f38269s, this.v);
                    return;
                }
                return;
        }
    }
}
