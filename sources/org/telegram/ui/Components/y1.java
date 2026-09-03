package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f30794a;
    public final Object f30795b;

    public y1(Object obj, int i10) {
        this.f30794a = i10;
        this.f30795b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30794a;
        Object obj = this.f30795b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                v9 v9Var = (v9) obj;
                v9Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.np(9, v9Var, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new em(6, (ir) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new em(7, (ns) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new em(13, (ax) obj, tLObject));
                return;
            case 5:
                oy oyVar = (oy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new em(18, oyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new em(26, (t60) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new gp((Object) ((d70) obj), (Object) tL_error, tLObject, 7));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gp((Object) ((bc0) obj), (Object) tL_error, tLObject, 10));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new z80(5, (fh0) obj, tLObject));
                return;
            case 10:
                oj0 oj0Var = (oj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    oj0Var.post(new ey(oj0Var, i11, tL_messages_messageReactionsList, 6));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new pj0((yj0) obj, tLObject, 0));
                return;
            case 12:
                it0 it0Var = (it0) obj;
                it0Var.getClass();
                AndroidUtilities.runOnUIThread(new gp((Object) it0Var, (Object) tL_error, tLObject, 19));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new gp((Object) ((xx0) obj), (Object) tL_error, tLObject, 25));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new lh.c7(tLObject, (Utilities.Callback) obj, 1));
                return;
            case 15:
                w21 w21Var = (w21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w21Var.f30124b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new z80(25, w21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new z80(27, (v31) obj, tLObject));
                return;
            case 17:
                d51 d51Var = (d51) obj;
                d51Var.getClass();
                AndroidUtilities.runOnUIThread(new gp((Object) d51Var, (Object) tL_error, tLObject, 28));
                return;
            default:
                int i12 = UndoView.f23185b0;
                AndroidUtilities.runOnUIThread(new k41(1, (UndoView) obj, tLObject));
                return;
        }
    }
}
