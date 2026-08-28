package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ih implements Runnable {
    public final int f39155a;
    public final qn f39156b;
    public final int f39157c;
    public final TLObject d;
    public final TLRPC.TL_error f39158e;
    public final int f39159f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f39160n;
    public final TLRPC.Chat f39161r;
    public final int f39162s;
    public final MessageObject v;

    public ih(qn qnVar, int i9, TLObject tLObject, TLRPC.TL_error tL_error, int i10, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, MessageObject messageObject2, int i12) {
        this.f39155a = i12;
        this.f39156b = qnVar;
        this.f39157c = i9;
        this.d = tLObject;
        this.f39158e = tL_error;
        this.f39159f = i10;
        this.h = messageObject;
        this.f39160n = tL_messages_getDiscussionMessage;
        this.f39161r = chat;
        this.f39162s = i11;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f39155a) {
            case 0:
                qn qnVar = this.f39156b;
                qnVar.h8(new ih(qnVar, this.f39157c, this.d, this.f39158e, this.f39159f, this.h, this.f39160n, this.f39161r, this.f39162s, this.v, 1));
                return;
            default:
                qn qnVar2 = this.f39156b;
                if (this.f39157c == qnVar2.f41863bc) {
                    qnVar2.f41889dc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        qnVar2.f41953ic = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f39158e.text)) {
                        MessagesController.showCantOpenAlert(qnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        qnVar2.ec = 0;
                        qnVar2.fc = false;
                        qnVar2.f42077t0.f1();
                        return;
                    }
                    qnVar2.ya(qnVar2.f41941hc, qnVar2.f41953ic, this.f39159f, this.h, this.f39160n, this.f39161r, this.f39162s, this.v);
                    return;
                }
                return;
        }
    }
}
