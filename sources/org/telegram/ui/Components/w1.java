package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w1 implements RequestDelegate {
    public final int f39857a;
    public final Object f39858b;

    public w1(Object obj, int i3) {
        this.f39857a = i3;
        this.f39858b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f39857a;
        Object obj = this.f39858b;
        switch (i3) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.hp.s1(cVar.f21919a).O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new cl(8, (tq) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new cl(9, (ur) obj, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new cl(15, (aw) obj, tLObject));
                return;
            case 4:
                jx jxVar = (jx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new cl(20, jxVar, tLObject));
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new cl(28, (i50) obj, tLObject));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new e7((Object) ((t50) obj), (Object) tL_error, (Object) tLObject, 14));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new e7((Object) ((ia0) obj), (Object) tL_error, (Object) tLObject, 17));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new j50(7, (bf0) obj, tLObject));
                return;
            case 9:
                kh0 kh0Var = (kh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i10 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    kh0Var.post(new org.telegram.ui.f4(kh0Var, i10, tL_messages_messageReactionsList, 14));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.g0.h3(new lh0((uh0) obj, tLObject, 0));
                return;
            case 11:
                kr0 kr0Var = (kr0) obj;
                kr0Var.getClass();
                org.telegram.messenger.g0.h3(new e7((Object) kr0Var, (Object) tL_error, (Object) tLObject, 25));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new iv0((xv0) obj, tL_error, tLObject, 1));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new ci.j8(tLObject, (org.telegram.messenger.u10) obj, 1));
                return;
            case 14:
                g11 g11Var = (g11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.hp.s1(g11Var.f33925e).O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new j50(28, g11Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.h3(new p11(0, (f21) obj, tLObject));
                return;
            case 16:
                m31 m31Var = (m31) obj;
                m31Var.getClass();
                org.telegram.messenger.g0.h3(new iv0(m31Var, tL_error, tLObject, 4));
                return;
            default:
                int i11 = UndoView.f31669j0;
                org.telegram.messenger.g0.h3(new p11(3, (UndoView) obj, tLObject));
                return;
        }
    }
}
