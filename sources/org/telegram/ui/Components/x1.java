package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f40132a;
    public final Object f40133b;

    public x1(Object obj, int i7) {
        this.f40132a = i7;
        this.f40133b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f40132a;
        Object obj = this.f40133b;
        switch (i7) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.qp.s1(cVar.f21723a).O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new fq(3, (tq) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new fq(4, (ur) obj, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new fq(10, (bw) obj, tLObject));
                return;
            case 4:
                lx lxVar = (lx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new fq(15, lxVar, tLObject));
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new fq(23, (m50) obj, tLObject));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ng((x50) obj, tL_error, tLObject, 10));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new ng((na0) obj, tL_error, tLObject, 13));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new v80(2, (ze0) obj, tLObject));
                return;
            case 9:
                hh0 hh0Var = (hh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i10 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    hh0Var.post(new org.telegram.ui.q8(hh0Var, i10, tL_messages_messageReactionsList, 13));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.g0.h3(new ih0((rh0) obj, tLObject, 0));
                return;
            case 11:
                lr0 lr0Var = (lr0) obj;
                lr0Var.getClass();
                org.telegram.messenger.g0.h3(new ng(lr0Var, tL_error, tLObject, 21));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new ng((yv0) obj, tL_error, tLObject, 27));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new bi.j9(tLObject, (org.telegram.messenger.c20) obj, 1));
                return;
            case 14:
                l11 l11Var = (l11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.qp.s1(l11Var.f35485e).O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new v80(23, l11Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.h3(new v80(25, (j21) obj, tLObject));
                return;
            case 16:
                r31 r31Var = (r31) obj;
                r31Var.getClass();
                org.telegram.messenger.g0.h3(new q31(r31Var, tL_error, tLObject, 0));
                return;
            default:
                int i11 = UndoView.f31591i0;
                org.telegram.messenger.g0.h3(new v80(28, (UndoView) obj, tLObject));
                return;
        }
    }
}
