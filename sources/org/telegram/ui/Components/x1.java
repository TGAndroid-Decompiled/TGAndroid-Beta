package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f40272a;
    public final Object f40273b;

    public x1(Object obj, int i7) {
        this.f40272a = i7;
        this.f40273b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f40272a;
        Object obj = this.f40273b;
        switch (i7) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.qp.s1(cVar.f21765a).O3((TLRPC.Updates) tLObject, false);
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
                org.telegram.messenger.g0.h3(new fq(10, (cw) obj, tLObject));
                return;
            case 4:
                mx mxVar = (mx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new fq(15, mxVar, tLObject));
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new fq(23, (n50) obj, tLObject));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ng((y50) obj, tL_error, tLObject, 10));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new ng((oa0) obj, tL_error, tLObject, 13));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new w80(2, (af0) obj, tLObject));
                return;
            case 9:
                ih0 ih0Var = (ih0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i10 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    ih0Var.post(new org.telegram.ui.q8(ih0Var, i10, tL_messages_messageReactionsList, 13));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.g0.h3(new jh0((sh0) obj, tLObject, 0));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new ng((nr0) obj, tL_error, tLObject, 21));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new ng((zv0) obj, tL_error, tLObject, 27));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new bi.j9(tLObject, (org.telegram.messenger.c20) obj, 1));
                return;
            case 14:
                n11 n11Var = (n11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.qp.s1(n11Var.f36208e).O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new w80(23, n11Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.h3(new w80(25, (l21) obj, tLObject));
                return;
            case 16:
                t31 t31Var = (t31) obj;
                t31Var.getClass();
                org.telegram.messenger.g0.h3(new s31(t31Var, tL_error, tLObject, 0));
                return;
            default:
                int i11 = UndoView.f31601i0;
                org.telegram.messenger.g0.h3(new w80(28, (UndoView) obj, tLObject));
                return;
        }
    }
}
