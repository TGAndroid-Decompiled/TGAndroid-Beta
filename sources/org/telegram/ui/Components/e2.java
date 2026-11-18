package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e2 implements RequestDelegate {
    public final int f34573a;
    public final Object f34574b;

    public e2(Object obj, int i7) {
        this.f34573a = i7;
        this.f34574b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f34573a;
        Object obj = this.f34574b;
        switch (i7) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.mp.u1(cVar.f23221a).V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new mg(23, (hr) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new mg(24, (hs) obj, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new dw(0, (nw) obj, tLObject));
                return;
            case 4:
                vx vxVar = (vx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new dw(5, vxVar, tLObject));
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.g3(new dw(13, (x50) obj, tLObject));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new k7((Object) ((j60) obj), (Object) tL_error, (Object) tLObject, 15));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new k7((Object) ((ya0) obj), (Object) tL_error, (Object) tLObject, 18));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new dw(22, (mf0) obj, tLObject));
                return;
            case 9:
                uh0 uh0Var = (uh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i10 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    uh0Var.post(new org.telegram.ui.b0(uh0Var, i10, tL_messages_messageReactionsList, 17));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.g0.g3(new vh0((ei0) obj, tLObject, 0));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new k7((Object) ((ur0) obj), (Object) tL_error, (Object) tLObject, 26));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new sv0((iw0) obj, tL_error, tLObject, 2));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new di.d8(tLObject, (org.telegram.messenger.x10) obj, 1));
                return;
            case 14:
                z11 z11Var = (z11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.mp.u1(z11Var.f42735e).V3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.h3(new hn0(12, z11Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.g3(new hn0(15, (y21) obj, tLObject));
                return;
            case 16:
                g41 g41Var = (g41) obj;
                g41Var.getClass();
                org.telegram.messenger.g0.g3(new sv0(g41Var, tL_error, tLObject, 5));
                return;
            default:
                int i11 = UndoView.f33171j0;
                org.telegram.messenger.g0.g3(new hn0(18, (UndoView) obj, tLObject));
                return;
        }
    }
}
