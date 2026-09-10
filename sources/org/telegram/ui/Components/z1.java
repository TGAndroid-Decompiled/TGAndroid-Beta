package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z1 implements RequestDelegate {
    public final int f29563a;
    public final Object f29564b;

    public z1(Object obj, int i10) {
        this.f29563a = i10;
        this.f29564b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f29563a;
        Object obj = this.f29564b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                ca caVar = (ca) obj;
                caVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.qh(25, caVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ee(22, (sr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ee(23, (ws) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ee(29, (ix) obj, tLObject));
                return;
            case 5:
                wy wyVar = (wy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new hy(4, wyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hy(12, (a70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new gf((k70) obj, tL_error, tLObject, 12));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gf((ic0) obj, tL_error, tLObject, 15));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new hy(21, (ih0) obj, tLObject));
                return;
            case 10:
                pj0 pj0Var = (pj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    pj0Var.post(new my(pj0Var, i11, tL_messages_messageReactionsList, 6));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new qj0((zj0) obj, tLObject, 0));
                return;
            case 12:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                AndroidUtilities.runOnUIThread(new gf(st0Var, tL_error, tLObject, 24));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new sx0((Object) ((hy0) obj), (Object) tL_error, (Object) tLObject, 0));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new tx0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                k31 k31Var = (k31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(k31Var.f24588b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new yo0(11, k31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new yo0(13, (i41) obj, tLObject));
                return;
            case 17:
                q51 q51Var = (q51) obj;
                q51Var.getClass();
                AndroidUtilities.runOnUIThread(new sx0((Object) q51Var, (Object) tL_error, (Object) tLObject, 3));
                return;
            default:
                int i12 = UndoView.f21313e0;
                AndroidUtilities.runOnUIThread(new yo0(17, (UndoView) obj, tLObject));
                return;
        }
    }
}
