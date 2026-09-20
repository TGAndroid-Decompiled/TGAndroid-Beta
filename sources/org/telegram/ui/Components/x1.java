package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f30122a;
    public final Object f30123b;

    public x1(Object obj, int i10) {
        this.f30122a = i10;
        this.f30123b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30122a;
        Object obj = this.f30123b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.gh(28, caVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new tc(25, (mr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new tc(26, (qs) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new bv(2, (ex) obj, tLObject));
                return;
            case 5:
                py pyVar = (py) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new bv(7, pyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new bv(15, (z60) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((j70) obj, tL_error, tLObject, 23));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((hc0) obj, tL_error, tLObject, 26));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new bv(24, (ih0) obj, tLObject));
                return;
            case 10:
                pj0 pj0Var = (pj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    pj0Var.post(new wm(pj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new qj0((zj0) obj, tLObject, 0));
                return;
            case 12:
                ut0 ut0Var = (ut0) obj;
                ut0Var.getClass();
                AndroidUtilities.runOnUIThread(new cn0(ut0Var, tL_error, tLObject, 5));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new cn0((gy0) obj, tL_error, tLObject, 11));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new sx0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                l31 l31Var = (l31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(l31Var.f26012b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new wn0(14, l31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new wn0(16, (j41) obj, tLObject));
                return;
            case 17:
                r51 r51Var = (r51) obj;
                r51Var.getClass();
                AndroidUtilities.runOnUIThread(new cn0(r51Var, tL_error, tLObject, 14));
                return;
            default:
                int i12 = UndoView.f22449e0;
                AndroidUtilities.runOnUIThread(new wn0(20, (UndoView) obj, tLObject));
                return;
        }
    }
}
