package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f30451a;
    public final Object f30452b;

    public y1(Object obj, int i10) {
        this.f30451a = i10;
        this.f30452b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30451a;
        Object obj = this.f30452b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.dh(28, daVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new uc(25, (nr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new uc(26, (rs) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new cv(2, (fx) obj, tLObject));
                return;
            case 5:
                qy qyVar = (qy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new cv(7, qyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new cv(15, (c70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((m70) obj, tL_error, tLObject, 23));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((kc0) obj, tL_error, tLObject, 26));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new cv(24, (jh0) obj, tLObject));
                return;
            case 10:
                qj0 qj0Var = (qj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    qj0Var.post(new xm(qj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new rj0((ak0) obj, tLObject, 0));
                return;
            case 12:
                ut0 ut0Var = (ut0) obj;
                ut0Var.getClass();
                AndroidUtilities.runOnUIThread(new cn0(ut0Var, tL_error, tLObject, 5));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new cn0((fy0) obj, tL_error, tLObject, 11));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new rx0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                k31 k31Var = (k31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(k31Var.f25616b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new wn0(14, k31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new wn0(16, (i41) obj, tLObject));
                return;
            case 17:
                q51 q51Var = (q51) obj;
                q51Var.getClass();
                AndroidUtilities.runOnUIThread(new cn0(q51Var, tL_error, tLObject, 14));
                return;
            default:
                int i12 = UndoView.f22436e0;
                AndroidUtilities.runOnUIThread(new wn0(20, (UndoView) obj, tLObject));
                return;
        }
    }
}
