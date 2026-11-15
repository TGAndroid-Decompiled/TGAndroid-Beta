package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v1 implements RequestDelegate {
    public final int f40231a;
    public final Object f40232b;

    public v1(Object obj, int i7) {
        this.f40231a = i7;
        this.f40232b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f40231a;
        Object obj = this.f40232b;
        switch (i7) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.np.s1(cVar.f22778a).O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new od(27, (ar) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new od(28, (as) obj, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new vs(4, (hw) obj, tLObject));
                return;
            case 4:
                qx qxVar = (qx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new vs(9, qxVar, tLObject));
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new vs(17, (p50) obj, tLObject));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new yf((a60) obj, tL_error, tLObject, 12));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new yf((oa0) obj, tL_error, tLObject, 15));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new vs(26, (cf0) obj, tLObject));
                return;
            case 9:
                lh0 lh0Var = (lh0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i10 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    lh0Var.post(new org.telegram.ui.f0(lh0Var, i10, tL_messages_messageReactionsList, 16));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.g0.h3(new mh0((vh0) obj, tLObject, 0));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new yf((mr0) obj, tL_error, tLObject, 23));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new yf((bw0) obj, tL_error, tLObject, 29));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new di.b8(tLObject, (org.telegram.messenger.z10) obj, 1));
                return;
            case 14:
                p11 p11Var = (p11) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.np.s1(p11Var.f38152e).O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new hh0(17, p11Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.h3(new hh0(20, (p21) obj, tLObject));
                return;
            case 16:
                w31 w31Var = (w31) obj;
                w31Var.getClass();
                org.telegram.messenger.g0.h3(new lv0(w31Var, tL_error, tLObject, 2));
                return;
            default:
                int i11 = UndoView.f32774j0;
                org.telegram.messenger.g0.h3(new hh0(23, (UndoView) obj, tLObject));
                return;
        }
    }
}
