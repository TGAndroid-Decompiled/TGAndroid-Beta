package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ih implements Runnable {
    public final int f39266a;
    public final tn f39267b;
    public final int f39268c;
    public final TLObject d;
    public final TLRPC.TL_error f39269e;
    public final int f39270f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f39271n;
    public final TLRPC.Chat f39272r;
    public final int f39273s;
    public final MessageObject v;

    public ih(tn tnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f39266a = i13;
        this.f39267b = tnVar;
        this.f39268c = i10;
        this.d = tLObject;
        this.f39269e = tL_error;
        this.f39270f = i11;
        this.h = messageObject;
        this.f39271n = tL_messages_getDiscussionMessage;
        this.f39272r = chat;
        this.f39273s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f39266a) {
            case 0:
                tn tnVar = this.f39267b;
                tnVar.h8(new ih(tnVar, this.f39268c, this.d, this.f39269e, this.f39270f, this.h, this.f39271n, this.f39272r, this.f39273s, this.v, 1));
                return;
            default:
                tn tnVar2 = this.f39267b;
                if (this.f39268c == tnVar2.f42762bc) {
                    tnVar2.f42786dc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        tnVar2.f42850ic = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f39269e.text)) {
                        MessagesController.showCantOpenAlert(tnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        tnVar2.f42800ec = 0;
                        tnVar2.f42813fc = false;
                        tnVar2.f42973t0.f1();
                        return;
                    }
                    tnVar2.ya(tnVar2.hc, tnVar2.f42850ic, this.f39270f, this.h, this.f39271n, this.f39272r, this.f39273s, this.v);
                    return;
                }
                return;
        }
    }
}
