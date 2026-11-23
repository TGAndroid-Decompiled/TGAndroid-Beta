package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f2 implements RequestDelegate {
    public final int f35038a;
    public final Object f35039b;

    public f2(Object obj, int i7) {
        this.f35038a = i7;
        this.f35039b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f35038a;
        Object obj = this.f35039b;
        switch (i7) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.np.u1(cVar.f23166a).V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new og(23, (jr) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new og(24, (js) obj, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new fw(0, (pw) obj, tLObject));
                return;
            case 4:
                xx xxVar = (xx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new fw(5, xxVar, tLObject));
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.g3(new fw(13, (a60) obj, tLObject));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new g((l60) obj, tL_error, tLObject, 16));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new g((za0) obj, tL_error, tLObject, 19));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new fw(22, (of0) obj, tLObject));
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
                org.telegram.messenger.g0.g3(new g((wr0) obj, tL_error, tLObject, 27));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new es0((kw0) obj, tL_error, tLObject, 3));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new di.e8(tLObject, (org.telegram.messenger.y10) obj, 1));
                return;
            case 14:
                a21 a21Var = (a21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.np.u1(a21Var.f33253e).V3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.h3(new jn0(12, a21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.g0.g3(new jn0(15, (b31) obj, tLObject));
                return;
            case 16:
                j41 j41Var = (j41) obj;
                j41Var.getClass();
                org.telegram.messenger.g0.g3(new es0(j41Var, tL_error, tLObject, 6));
                return;
            default:
                int i11 = UndoView.f33173j0;
                org.telegram.messenger.g0.g3(new jn0(18, (UndoView) obj, tLObject));
                return;
        }
    }
}
