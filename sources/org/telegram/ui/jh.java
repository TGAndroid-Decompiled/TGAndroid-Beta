package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh implements Runnable {
    public final int f38258a;
    public final qn f38259b;
    public final int f38260c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38261f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38262n;
    public final TLRPC.Chat f38263r;
    public final int f38264s;
    public final MessageObject v;

    public jh(qn qnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38258a = i13;
        this.f38259b = qnVar;
        this.f38260c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38261f = i11;
        this.h = messageObject;
        this.f38262n = tL_messages_getDiscussionMessage;
        this.f38263r = chat;
        this.f38264s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38258a) {
            case 0:
                qn qnVar = this.f38259b;
                qnVar.k8(new jh(qnVar, this.f38260c, this.d, this.e, this.f38261f, this.h, this.f38262n, this.f38263r, this.f38264s, this.v, 1));
                return;
            default:
                qn qnVar2 = this.f38259b;
                if (this.f38260c == qnVar2.fc) {
                    qnVar2.hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        qnVar2.f40772mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(qnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        qnVar2.f40723ic = 0;
                        qnVar2.f40736jc = false;
                        qnVar2.f40901x0.f1();
                        return;
                    }
                    qnVar2.Ca(qnVar2.f40760lc, qnVar2.f40772mc, this.f38261f, this.h, this.f38262n, this.f38263r, this.f38264s, this.v);
                    return;
                }
                return;
        }
    }
}
