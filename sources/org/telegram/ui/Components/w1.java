package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w1 implements RequestDelegate {
    public final int f39856a;
    public final Object f39857b;

    public w1(Object obj, int i7) {
        this.f39856a = i7;
        this.f39857b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f39856a;
        Object obj = this.f39857b;
        switch (i7) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.qp.s1(cVar.f21770a).O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ro(4, (sq) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ro(5, (tr) obj, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ro(11, (bw) obj, tLObject));
                return;
            case 4:
                lx lxVar = (lx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new ro(16, lxVar, tLObject));
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ro(24, (m50) obj, tLObject));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new mg((x50) obj, tL_error, tLObject, 10));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new mg((na0) obj, tL_error, tLObject, 13));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new r80(3, (ze0) obj, tLObject));
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
                org.telegram.messenger.g0.h3(new mg((mr0) obj, tL_error, tLObject, 21));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new mg((yv0) obj, tL_error, tLObject, 27));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new bi.j9(tLObject, (org.telegram.messenger.c20) obj, 1));
                return;
            case 14:
                m11 m11Var = (m11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.qp.s1(m11Var.f35801e).O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new r80(24, m11Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.h3(new r80(26, (k21) obj, tLObject));
                return;
            case 16:
                s31 s31Var = (s31) obj;
                s31Var.getClass();
                org.telegram.messenger.g0.h3(new r31(s31Var, tL_error, tLObject, 0));
                return;
            default:
                int i11 = UndoView.f31609i0;
                org.telegram.messenger.g0.h3(new r80(29, (UndoView) obj, tLObject));
                return;
        }
    }
}
