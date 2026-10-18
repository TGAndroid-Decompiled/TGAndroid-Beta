package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh implements Runnable {
    public final int f38869a;
    public final sn f38870b;
    public final int f38871c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38872f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38873n;
    public final TLRPC.Chat f38874r;
    public final int f38875s;
    public final MessageObject v;

    public lh(sn snVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38869a = i13;
        this.f38870b = snVar;
        this.f38871c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38872f = i11;
        this.h = messageObject;
        this.f38873n = tL_messages_getDiscussionMessage;
        this.f38874r = chat;
        this.f38875s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38869a) {
            case 0:
                sn snVar = this.f38870b;
                snVar.k8(new lh(snVar, this.f38871c, this.d, this.e, this.f38872f, this.h, this.f38873n, this.f38874r, this.f38875s, this.v, 1));
                return;
            default:
                sn snVar2 = this.f38870b;
                if (this.f38871c == snVar2.fc) {
                    snVar2.hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        snVar2.f41325mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(snVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        snVar2.f41276ic = 0;
                        snVar2.f41289jc = false;
                        snVar2.f41454x0.f1();
                        return;
                    }
                    snVar2.Ca(snVar2.f41313lc, snVar2.f41325mc, this.f38872f, this.h, this.f38873n, this.f38874r, this.f38875s, this.v);
                    return;
                }
                return;
        }
    }
}
