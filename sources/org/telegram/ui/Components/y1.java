package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f33091a;
    public final Object f33092b;

    public y1(Object obj, int i10) {
        this.f33091a = i10;
        this.f33092b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f33091a;
        Object obj = this.f33092b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                ga gaVar = (ga) obj;
                gaVar.getClass();
                AndroidUtilities.runOnUIThread(new ea(0, gaVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zr(1, (ds) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new zr(2, (gt) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new zr(8, (tx) obj, tLObject));
                return;
            case 5:
                ez ezVar = (ez) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new zr(13, ezVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new zr(21, (t70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((d80) obj, tL_error, tLObject, 25));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((zc0) obj, tL_error, tLObject, 28));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ci0(0, (di0) obj, tLObject));
                return;
            case 10:
                kk0 kk0Var = (kk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    kk0Var.post(new zk(kk0Var, i11, tL_messages_messageReactionsList, 9));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new lk0((uk0) obj, tLObject, 0));
                return;
            case 12:
                mu0 mu0Var = (mu0) obj;
                mu0Var.getClass();
                AndroidUtilities.runOnUIThread(new og0(mu0Var, tL_error, tLObject, 7));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new og0((xy0) obj, tL_error, tLObject, 13));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new jy0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                c41 c41Var = (c41) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(c41Var.f25237b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ci0(20, c41Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ci0(22, (b51) obj, tLObject));
                return;
            case 17:
                k61 k61Var = (k61) obj;
                k61Var.getClass();
                AndroidUtilities.runOnUIThread(new og0(k61Var, tL_error, tLObject, 16));
                return;
            default:
                int i12 = UndoView.f24370e0;
                AndroidUtilities.runOnUIThread(new ci0(25, (UndoView) obj, tLObject));
                return;
        }
    }
}
