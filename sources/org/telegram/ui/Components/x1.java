package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f30183a;
    public final Object f30184b;

    public x1(Object obj, int i10) {
        this.f30183a = i10;
        this.f30184b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30183a;
        Object obj = this.f30184b;
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
                AndroidUtilities.runOnUIThread(new bv(15, (c70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((m70) obj, tL_error, tLObject, 23));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((lc0) obj, tL_error, tLObject, 26));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new bv(24, (lh0) obj, tLObject));
                return;
            case 10:
                sj0 sj0Var = (sj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    sj0Var.post(new wm(sj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new tj0((ck0) obj, tLObject, 0));
                return;
            case 12:
                wt0 wt0Var = (wt0) obj;
                wt0Var.getClass();
                AndroidUtilities.runOnUIThread(new en0(wt0Var, tL_error, tLObject, 5));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new en0((iy0) obj, tL_error, tLObject, 11));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ux0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                n31 n31Var = (n31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(n31Var.f26610b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new yn0(14, n31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new yn0(16, (l41) obj, tLObject));
                return;
            case 17:
                t51 t51Var = (t51) obj;
                t51Var.getClass();
                AndroidUtilities.runOnUIThread(new en0(t51Var, tL_error, tLObject, 14));
                return;
            default:
                int i12 = UndoView.f22465e0;
                AndroidUtilities.runOnUIThread(new yn0(20, (UndoView) obj, tLObject));
                return;
        }
    }
}
