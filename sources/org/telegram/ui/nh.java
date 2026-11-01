package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh implements Runnable {
    public final int f39903a;
    public final un f39904b;
    public final int f39905c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f39906f;
    public final org.telegram.messenger.kj h;
    public final TLRPC.TL_messages_getDiscussionMessage f39907n;
    public final TLRPC.Chat f39908r;
    public final int f39909s;
    public final org.telegram.messenger.kj f39910w;

    public nh(un unVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, org.telegram.messenger.kj kjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, org.telegram.messenger.kj kjVar2, int i13) {
        this.f39903a = i13;
        this.f39904b = unVar;
        this.f39905c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f39906f = i11;
        this.h = kjVar;
        this.f39907n = tL_messages_getDiscussionMessage;
        this.f39908r = chat;
        this.f39909s = i12;
        this.f39910w = kjVar2;
    }

    @Override
    public final void run() {
        switch (this.f39903a) {
            case 0:
                un unVar = this.f39904b;
                unVar.t8(new nh(unVar, this.f39905c, this.d, this.e, this.f39906f, this.h, this.f39907n, this.f39908r, this.f39909s, this.f39910w, 1));
                return;
            default:
                un unVar2 = this.f39904b;
                if (this.f39905c == unVar2.Bc) {
                    unVar2.Dc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        unVar2.Ic = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        org.telegram.messenger.wp.O4(org.telegram.messenger.dd.L0(2131752445, null), unVar2);
                        unVar2.Ec = 0;
                        unVar2.Fc = false;
                        unVar2.f42303z0.g1();
                        return;
                    }
                    unVar2.Sa(unVar2.Hc, unVar2.Ic, this.f39906f, this.h, this.f39907n, this.f39908r, this.f39909s, this.f39910w);
                    return;
                }
                return;
        }
    }
}
