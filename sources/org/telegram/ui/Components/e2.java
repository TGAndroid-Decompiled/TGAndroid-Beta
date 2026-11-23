package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e2 implements RequestDelegate {
    public final int f34539a;
    public final Object f34540b;

    public e2(Object obj, int i7) {
        this.f34539a = i7;
        this.f34540b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f34539a;
        Object obj = this.f34540b;
        switch (i7) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.mp.u1(cVar.f23343a).V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new xd(27, (gr) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new xd(28, (gs) obj, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bt(4, (mw) obj, tLObject));
                return;
            case 4:
                ux uxVar = (ux) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new bt(9, uxVar, tLObject));
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.g3(new bt(17, (x50) obj, tLObject));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa((i60) obj, tL_error, tLObject, 17));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa((wa0) obj, tL_error, tLObject, 20));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new bt(26, (nf0) obj, tLObject));
                return;
            case 9:
                wh0 wh0Var = (wh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i10 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    wh0Var.post(new org.telegram.ui.f0(wh0Var, i10, tL_messages_messageReactionsList, 16));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.g0.g3(new xh0((gi0) obj, tLObject, 0));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa((vr0) obj, tL_error, tLObject, 28));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new as0((jw0) obj, tL_error, tLObject, 4));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new di.e8(tLObject, (org.telegram.messenger.w10) obj, 1));
                return;
            case 14:
                z11 z11Var = (z11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.mp.u1(z11Var.f42630e).V3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.h3(new sh0(16, z11Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.g3(new sh0(19, (a31) obj, tLObject));
                return;
            case 16:
                i41 i41Var = (i41) obj;
                i41Var.getClass();
                org.telegram.messenger.g0.g3(new as0(i41Var, tL_error, tLObject, 7));
                return;
            default:
                int i11 = UndoView.f33271j0;
                org.telegram.messenger.g0.g3(new sh0(22, (UndoView) obj, tLObject));
                return;
        }
    }
}
