package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh implements Runnable {
    public final int f38252a;
    public final qn f38253b;
    public final int f38254c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38255f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38256n;
    public final TLRPC.Chat f38257r;
    public final int f38258s;
    public final MessageObject v;

    public jh(qn qnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38252a = i13;
        this.f38253b = qnVar;
        this.f38254c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38255f = i11;
        this.h = messageObject;
        this.f38256n = tL_messages_getDiscussionMessage;
        this.f38257r = chat;
        this.f38258s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38252a) {
            case 0:
                qn qnVar = this.f38253b;
                qnVar.k8(new jh(qnVar, this.f38254c, this.d, this.e, this.f38255f, this.h, this.f38256n, this.f38257r, this.f38258s, this.v, 1));
                return;
            default:
                qn qnVar2 = this.f38253b;
                if (this.f38254c == qnVar2.fc) {
                    qnVar2.hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        qnVar2.f40766mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(qnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        qnVar2.f40717ic = 0;
                        qnVar2.f40730jc = false;
                        qnVar2.f40895x0.f1();
                        return;
                    }
                    qnVar2.Ca(qnVar2.f40754lc, qnVar2.f40766mc, this.f38255f, this.h, this.f38256n, this.f38257r, this.f38258s, this.v);
                    return;
                }
                return;
        }
    }
}
