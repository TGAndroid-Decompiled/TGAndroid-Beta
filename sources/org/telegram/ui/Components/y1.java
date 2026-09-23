package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f30118a;
    public final Object f30119b;

    public y1(Object obj, int i10) {
        this.f30118a = i10;
        this.f30119b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30118a;
        Object obj = this.f30119b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                da daVar = (da) obj;
                daVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.rh(22, daVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ph(19, (nr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ph(20, (rs) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ph(26, (ex) obj, tLObject));
                return;
            case 5:
                qy qyVar = (qy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new oy(1, qyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new oy(9, (s60) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((c70) obj, tL_error, tLObject, 20));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((yb0) obj, tL_error, tLObject, 23));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new oy(18, (zg0) obj, tLObject));
                return;
            case 10:
                gj0 gj0Var = (gj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    gj0Var.post(new xm(gj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new hj0((qj0) obj, tLObject, 0));
                return;
            case 12:
                jt0 jt0Var = (jt0) obj;
                jt0Var.getClass();
                AndroidUtilities.runOnUIThread(new fr0(jt0Var, tL_error, tLObject, 2));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new fr0((ux0) obj, tL_error, tLObject, 8));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gx0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                w21 w21Var = (w21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w21Var.f29479b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ar0(8, w21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ar0(10, (u31) obj, tLObject));
                return;
            case 17:
                c51 c51Var = (c51) obj;
                c51Var.getClass();
                AndroidUtilities.runOnUIThread(new fr0(c51Var, tL_error, tLObject, 11));
                return;
            default:
                int i12 = UndoView.f22199e0;
                AndroidUtilities.runOnUIThread(new ar0(14, (UndoView) obj, tLObject));
                return;
        }
    }
}
