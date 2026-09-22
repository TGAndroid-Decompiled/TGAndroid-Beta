package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f29840a;
    public final Object f29841b;

    public x1(Object obj, int i10) {
        this.f29840a = i10;
        this.f29841b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f29840a;
        Object obj = this.f29841b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uh(22, baVar, tLObject));
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((b70) obj, tL_error, tLObject, 20));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((zb0) obj, tL_error, tLObject, 23));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ny(18, (yg0) obj, tLObject));
                return;
            case 10:
                fj0 fj0Var = (fj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    fj0Var.post(new wm(fj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gj0((pj0) obj, tLObject, 0));
                return;
            case 12:
                jt0 jt0Var = (jt0) obj;
                jt0Var.getClass();
                AndroidUtilities.runOnUIThread(new fr0(jt0Var, tL_error, tLObject, 2));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new fr0((vx0) obj, tL_error, tLObject, 8));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new hx0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                x21 x21Var = (x21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(x21Var.f29868b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ar0(8, x21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ar0(10, (v31) obj, tLObject));
                return;
            case 17:
                d51 d51Var = (d51) obj;
                d51Var.getClass();
                AndroidUtilities.runOnUIThread(new fr0(d51Var, tL_error, tLObject, 11));
                return;
            default:
                int i12 = UndoView.f22225e0;
                AndroidUtilities.runOnUIThread(new ar0(14, (UndoView) obj, tLObject));
                return;
        }
    }
}
