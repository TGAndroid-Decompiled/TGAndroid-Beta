package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh implements Runnable {
    public final int f38262a;
    public final qn f38263b;
    public final int f38264c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38265f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38266n;
    public final TLRPC.Chat f38267r;
    public final int f38268s;
    public final MessageObject v;

    public jh(qn qnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38262a = i13;
        this.f38263b = qnVar;
        this.f38264c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38265f = i11;
        this.h = messageObject;
        this.f38266n = tL_messages_getDiscussionMessage;
        this.f38267r = chat;
        this.f38268s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38262a) {
            case 0:
                qn qnVar = this.f38263b;
                qnVar.k8(new jh(qnVar, this.f38264c, this.d, this.e, this.f38265f, this.h, this.f38266n, this.f38267r, this.f38268s, this.v, 1));
                return;
            default:
                qn qnVar2 = this.f38263b;
                if (this.f38264c == qnVar2.fc) {
                    qnVar2.hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        qnVar2.f40775mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(qnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        qnVar2.f40726ic = 0;
                        qnVar2.f40739jc = false;
                        qnVar2.f40904x0.f1();
                        return;
                    }
                    qnVar2.Ca(qnVar2.f40763lc, qnVar2.f40775mc, this.f38265f, this.h, this.f38266n, this.f38267r, this.f38268s, this.v);
                    return;
                }
                return;
        }
    }
}
