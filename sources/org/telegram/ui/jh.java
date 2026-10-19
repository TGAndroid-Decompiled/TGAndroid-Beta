package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh implements Runnable {
    public final int f38251a;
    public final qn f38252b;
    public final int f38253c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38254f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38255n;
    public final TLRPC.Chat f38256r;
    public final int f38257s;
    public final MessageObject v;

    public jh(qn qnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38251a = i13;
        this.f38252b = qnVar;
        this.f38253c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38254f = i11;
        this.h = messageObject;
        this.f38255n = tL_messages_getDiscussionMessage;
        this.f38256r = chat;
        this.f38257s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38251a) {
            case 0:
                qn qnVar = this.f38252b;
                qnVar.k8(new jh(qnVar, this.f38253c, this.d, this.e, this.f38254f, this.h, this.f38255n, this.f38256r, this.f38257s, this.v, 1));
                return;
            default:
                qn qnVar2 = this.f38252b;
                if (this.f38253c == qnVar2.fc) {
                    qnVar2.hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        qnVar2.f40774mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(qnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        qnVar2.f40725ic = 0;
                        qnVar2.f40738jc = false;
                        qnVar2.f40903x0.f1();
                        return;
                    }
                    qnVar2.Ca(qnVar2.f40762lc, qnVar2.f40774mc, this.f38254f, this.h, this.f38255n, this.f38256r, this.f38257s, this.v);
                    return;
                }
                return;
        }
    }
}
