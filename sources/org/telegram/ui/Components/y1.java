package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f32835a;
    public final Object f32836b;

    public y1(Object obj, int i10) {
        this.f32835a = i10;
        this.f32836b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32835a;
        Object obj = this.f32836b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.fh(28, daVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new uc(25, (lr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new uc(26, (ps) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new zu(2, (dx) obj, tLObject));
                return;
            case 5:
                py pyVar = (py) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new zu(7, pyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new zu(15, (r60) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((b70) obj, tL_error, tLObject, 20));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((ac0) obj, tL_error, tLObject, 23));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new zu(24, (yg0) obj, tLObject));
                return;
            case 10:
                fj0 fj0Var = (fj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    fj0Var.post(new org.telegram.ui.dm(fj0Var, i11, tL_messages_messageReactionsList, 9));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gj0((pj0) obj, tLObject, 0));
                return;
            case 12:
                it0 it0Var = (it0) obj;
                it0Var.getClass();
                AndroidUtilities.runOnUIThread(new er0(it0Var, tL_error, tLObject, 2));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new er0((ux0) obj, tL_error, tLObject, 8));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gx0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                w21 w21Var = (w21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w21Var.f32120b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new jn0(14, w21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new jn0(16, (u31) obj, tLObject));
                return;
            case 17:
                c51 c51Var = (c51) obj;
                c51Var.getClass();
                AndroidUtilities.runOnUIThread(new er0(c51Var, tL_error, tLObject, 11));
                return;
            default:
                int i12 = UndoView.f24208e0;
                AndroidUtilities.runOnUIThread(new jn0(20, (UndoView) obj, tLObject));
                return;
        }
    }
}
