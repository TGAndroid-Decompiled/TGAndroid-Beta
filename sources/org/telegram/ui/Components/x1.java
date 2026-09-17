package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f29804a;
    public final Object f29805b;

    public x1(Object obj, int i10) {
        this.f29804a = i10;
        this.f29805b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f29804a;
        Object obj = this.f29805b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                ba baVar = (ba) obj;
                baVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.wh(22, baVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new oh(19, (mr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new oh(20, (qs) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new oh(26, (dx) obj, tLObject));
                return;
            case 5:
                py pyVar = (py) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ny(1, pyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ny(9, (r60) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((b70) obj, tL_error, tLObject, 20));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((zb0) obj, tL_error, tLObject, 23));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ny(18, (zg0) obj, tLObject));
                return;
            case 10:
                gj0 gj0Var = (gj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    gj0Var.post(new wm(gj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new hj0((qj0) obj, tLObject, 0));
                return;
            case 12:
                kt0 kt0Var = (kt0) obj;
                kt0Var.getClass();
                AndroidUtilities.runOnUIThread(new gr0(kt0Var, tL_error, tLObject, 2));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new gr0((wx0) obj, tL_error, tLObject, 8));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ix0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                y21 y21Var = (y21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(y21Var.f30098b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new br0(8, y21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new br0(10, (w31) obj, tLObject));
                return;
            case 17:
                e51 e51Var = (e51) obj;
                e51Var.getClass();
                AndroidUtilities.runOnUIThread(new gr0(e51Var, tL_error, tLObject, 11));
                return;
            default:
                int i12 = UndoView.f22238e0;
                AndroidUtilities.runOnUIThread(new br0(14, (UndoView) obj, tLObject));
                return;
        }
    }
}
