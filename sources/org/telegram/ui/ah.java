package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ah implements Runnable {
    public final int f43686a;
    public final cn f43687b;
    public final int f43688c;
    public final TLObject d;
    public final TLRPC.TL_error f43689e;
    public final int f43690f;
    public final org.telegram.messenger.ij h;
    public final TLRPC.TL_messages_getDiscussionMessage f43691n;
    public final TLRPC.Chat f43692r;
    public final int f43693s;
    public final org.telegram.messenger.ij f43694w;

    public ah(cn cnVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.ij ijVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.ij ijVar2, int i12) {
        this.f43686a = i12;
        this.f43687b = cnVar;
        this.f43688c = i7;
        this.d = tLObject;
        this.f43689e = tL_error;
        this.f43690f = i10;
        this.h = ijVar;
        this.f43691n = tL_messages_getDiscussionMessage;
        this.f43692r = chat;
        this.f43693s = i11;
        this.f43694w = ijVar2;
    }

    @Override
    public final void run() {
        switch (this.f43686a) {
            case 0:
                cn cnVar = this.f43687b;
                cnVar.x8(new ah(cnVar, this.f43688c, this.d, this.f43689e, this.f43690f, this.h, this.f43691n, this.f43692r, this.f43693s, this.f43694w, 1));
                return;
            default:
                cn cnVar2 = this.f43687b;
                if (this.f43688c == cnVar2.Kc) {
                    cnVar2.Mc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        cnVar2.Rc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f43689e.text)) {
                        org.telegram.messenger.qp.R4(org.telegram.messenger.id.M0(2131752445, null), cnVar2);
                        cnVar2.Nc = 0;
                        cnVar2.Oc = false;
                        cnVar2.f44700z0.g1();
                        return;
                    }
                    cnVar2.Za(cnVar2.Qc, cnVar2.Rc, this.f43690f, this.h, this.f43691n, this.f43692r, this.f43693s, this.f43694w);
                    return;
                }
                return;
        }
    }
}
