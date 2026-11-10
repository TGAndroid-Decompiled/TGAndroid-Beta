package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ah implements Runnable {
    public final int f43674a;
    public final cn f43675b;
    public final int f43676c;
    public final TLObject d;
    public final TLRPC.TL_error f43677e;
    public final int f43678f;
    public final org.telegram.messenger.ij h;
    public final TLRPC.TL_messages_getDiscussionMessage f43679n;
    public final TLRPC.Chat f43680r;
    public final int f43681s;
    public final org.telegram.messenger.ij f43682w;

    public ah(cn cnVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.ij ijVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.ij ijVar2, int i12) {
        this.f43674a = i12;
        this.f43675b = cnVar;
        this.f43676c = i7;
        this.d = tLObject;
        this.f43677e = tL_error;
        this.f43678f = i10;
        this.h = ijVar;
        this.f43679n = tL_messages_getDiscussionMessage;
        this.f43680r = chat;
        this.f43681s = i11;
        this.f43682w = ijVar2;
    }

    @Override
    public final void run() {
        switch (this.f43674a) {
            case 0:
                cn cnVar = this.f43675b;
                cnVar.x8(new ah(cnVar, this.f43676c, this.d, this.f43677e, this.f43678f, this.h, this.f43679n, this.f43680r, this.f43681s, this.f43682w, 1));
                return;
            default:
                cn cnVar2 = this.f43675b;
                if (this.f43676c == cnVar2.Kc) {
                    cnVar2.Mc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        cnVar2.Rc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f43677e.text)) {
                        org.telegram.messenger.qp.R4(org.telegram.messenger.id.M0(2131752445, null), cnVar2);
                        cnVar2.Nc = 0;
                        cnVar2.Oc = false;
                        cnVar2.f44741z0.g1();
                        return;
                    }
                    cnVar2.Za(cnVar2.Qc, cnVar2.Rc, this.f43678f, this.h, this.f43679n, this.f43680r, this.f43681s, this.f43682w);
                    return;
                }
                return;
        }
    }
}
