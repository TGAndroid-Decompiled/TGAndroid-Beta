package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f33259a;
    public final Object f33260b;

    public y1(Object obj, int i10) {
        this.f33259a = i10;
        this.f33260b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f33259a;
        Object obj = this.f33260b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(9, v9Var, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gm(6, (lr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new gm(7, (qs) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gm(13, (cx) obj, tLObject));
                return;
            case 5:
                qy qyVar = (qy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new gm(18, qyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gm(26, (u60) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new jp((Object) ((e70) obj), (Object) tL_error, tLObject, 7));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new jp((Object) ((cc0) obj), (Object) tL_error, tLObject, 10));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a90(5, (gh0) obj, tLObject));
                return;
            case 10:
                qj0 qj0Var = (qj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    qj0Var.post(new gy(qj0Var, i11, tL_messages_messageReactionsList, 6));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new rj0((ak0) obj, tLObject, 0));
                return;
            case 12:
                jt0 jt0Var = (jt0) obj;
                jt0Var.getClass();
                AndroidUtilities.runOnUIThread(new jp((Object) jt0Var, (Object) tL_error, tLObject, 19));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new jp((Object) ((yx0) obj), (Object) tL_error, tLObject, 25));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new mh.c7(tLObject, (Utilities.Callback) obj, 1));
                return;
            case 15:
                x21 x21Var = (x21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(x21Var.f32928b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new a90(25, x21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new a90(27, (w31) obj, tLObject));
                return;
            case 17:
                e51 e51Var = (e51) obj;
                e51Var.getClass();
                AndroidUtilities.runOnUIThread(new jp((Object) e51Var, (Object) tL_error, tLObject, 28));
                return;
            default:
                int i12 = UndoView.f25074b0;
                AndroidUtilities.runOnUIThread(new l41(1, (UndoView) obj, tLObject));
                return;
        }
    }
}
