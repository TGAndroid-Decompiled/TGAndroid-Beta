package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f30458a;
    public final Object f30459b;

    public y1(Object obj, int i10) {
        this.f30458a = i10;
        this.f30459b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30458a;
        Object obj = this.f30459b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.fh(27, daVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new kd(24, (nr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new kd(25, (rs) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new vw(1, (fx) obj, tLObject));
                return;
            case 5:
                qy qyVar = (qy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new vw(6, qyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new vw(14, (c70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((m70) obj, tL_error, tLObject, 23));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((kc0) obj, tL_error, tLObject, 26));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new vw(23, (jh0) obj, tLObject));
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
                    MessagesController.getInstance(k31Var.f25634b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new wn0(13, k31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new wn0(15, (i41) obj, tLObject));
                return;
            case 17:
                q51 q51Var = (q51) obj;
                q51Var.getClass();
                AndroidUtilities.runOnUIThread(new cn0(q51Var, tL_error, tLObject, 14));
                return;
            default:
                int i12 = UndoView.f22450e0;
                AndroidUtilities.runOnUIThread(new wn0(19, (UndoView) obj, tLObject));
                return;
        }
    }
}
