package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oh implements Runnable {
    public final int f40261a;
    public final un f40262b;
    public final int f40263c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f40264f;
    public final org.telegram.messenger.jj h;
    public final TLRPC.TL_messages_getDiscussionMessage f40265n;
    public final TLRPC.Chat f40266r;
    public final int f40267s;
    public final org.telegram.messenger.jj f40268w;

    public oh(un unVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, org.telegram.messenger.jj jjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, org.telegram.messenger.jj jjVar2, int i13) {
        this.f40261a = i13;
        this.f40262b = unVar;
        this.f40263c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f40264f = i11;
        this.h = jjVar;
        this.f40265n = tL_messages_getDiscussionMessage;
        this.f40266r = chat;
        this.f40267s = i12;
        this.f40268w = jjVar2;
    }

    @Override
    public final void run() {
        switch (this.f40261a) {
            case 0:
                un unVar = this.f40262b;
                unVar.p8(new oh(unVar, this.f40263c, this.d, this.e, this.f40264f, this.h, this.f40265n, this.f40266r, this.f40267s, this.f40268w, 1));
                return;
            default:
                un unVar2 = this.f40262b;
                if (this.f40263c == unVar2.Ac) {
                    unVar2.Cc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        unVar2.Hc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        org.telegram.messenger.vp.O4(org.telegram.messenger.cd.L0(2131752445, null), unVar2);
                        unVar2.Dc = 0;
                        unVar2.Ec = false;
                        unVar2.f42492z0.g1();
                        return;
                    }
                    unVar2.Na(unVar2.Gc, unVar2.Hc, this.f40264f, this.h, this.f40265n, this.f40266r, this.f40267s, this.f40268w);
                    return;
                }
                return;
        }
    }
}
