package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f33065a;
    public final Object f33066b;

    public y1(Object obj, int i10) {
        this.f33065a = i10;
        this.f33066b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f33065a;
        Object obj = this.f33066b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                fa faVar = (fa) obj;
                faVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ug(29, faVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bs(0, (es) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bs(1, (ht) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new bs(7, (ux) obj, tLObject));
                return;
            case 5:
                fz fzVar = (fz) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new bs(12, fzVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new bs(20, (u70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((e80) obj, tL_error, tLObject, 26));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((ad0) obj, tL_error, tLObject, 29));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new bs(29, (ei0) obj, tLObject));
                return;
            case 10:
                mk0 mk0Var = (mk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    mk0Var.post(new zk(mk0Var, i11, tL_messages_messageReactionsList, 9));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new nk0((wk0) obj, tLObject, 0));
                return;
            case 12:
                ou0 ou0Var = (ou0) obj;
                ou0Var.getClass();
                AndroidUtilities.runOnUIThread(new cf0(ou0Var, tL_error, tLObject, 8));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new cf0((zy0) obj, tL_error, tLObject, 14));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ly0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                e41 e41Var = (e41) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(e41Var.f25842b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new fi0(19, e41Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new fi0(21, (d51) obj, tLObject));
                return;
            case 17:
                m61 m61Var = (m61) obj;
                m61Var.getClass();
                AndroidUtilities.runOnUIThread(new cf0(m61Var, tL_error, tLObject, 17));
                return;
            default:
                int i12 = UndoView.f24362e0;
                AndroidUtilities.runOnUIThread(new fi0(24, (UndoView) obj, tLObject));
                return;
        }
    }
}
