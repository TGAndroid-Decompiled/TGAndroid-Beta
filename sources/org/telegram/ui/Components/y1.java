package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f33277a;
    public final Object f33278b;

    public y1(Object obj, int i10) {
        this.f33277a = i10;
        this.f33278b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f33277a;
        Object obj = this.f33278b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(8, v9Var, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new eo(5, (lr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new eo(6, (qs) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new eo(12, (cx) obj, tLObject));
                return;
            case 5:
                qy qyVar = (qy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new eo(17, qyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new eo(25, (u60) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new jp((Object) ((e70) obj), (Object) tL_error, tLObject, 7));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new jp((Object) ((cc0) obj), (Object) tL_error, tLObject, 10));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new b90(4, (gh0) obj, tLObject));
                return;
            case 10:
                pj0 pj0Var = (pj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    pj0Var.post(new gy(pj0Var, i11, tL_messages_messageReactionsList, 6));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new qj0((zj0) obj, tLObject, 0));
                return;
            case 12:
                it0 it0Var = (it0) obj;
                it0Var.getClass();
                AndroidUtilities.runOnUIThread(new jp((Object) it0Var, (Object) tL_error, tLObject, 19));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new jp((Object) ((xx0) obj), (Object) tL_error, tLObject, 25));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new mh.c7(tLObject, (Utilities.Callback) obj, 1));
                return;
            case 15:
                w21 w21Var = (w21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w21Var.f32620b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new b90(24, w21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new b90(26, (v31) obj, tLObject));
                return;
            case 17:
                c51 c51Var = (c51) obj;
                c51Var.getClass();
                AndroidUtilities.runOnUIThread(new jp((Object) c51Var, (Object) tL_error, tLObject, 28));
                return;
            default:
                int i12 = UndoView.f25076b0;
                AndroidUtilities.runOnUIThread(new q51(0, (UndoView) obj, tLObject));
                return;
        }
    }
}
