package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f30561a;
    public final Object f30562b;

    public y1(Object obj, int i10) {
        this.f30561a = i10;
        this.f30562b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30561a;
        Object obj = this.f30562b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                ea eaVar = (ea) obj;
                eaVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.fh(27, eaVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ld(24, (pr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ld(25, (ts) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new xw(1, (hx) obj, tLObject));
                return;
            case 5:
                sy syVar = (sy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new xw(6, syVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new xw(14, (f70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((p70) obj, tL_error, tLObject, 23));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((nc0) obj, tL_error, tLObject, 26));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new xw(23, (mh0) obj, tLObject));
                return;
            case 10:
                tj0 tj0Var = (tj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    tj0Var.post(new zm(tj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new uj0((dk0) obj, tLObject, 0));
                return;
            case 12:
                xt0 xt0Var = (xt0) obj;
                xt0Var.getClass();
                AndroidUtilities.runOnUIThread(new fn0(xt0Var, tL_error, tLObject, 5));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new fn0((iy0) obj, tL_error, tLObject, 11));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ux0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                n31 n31Var = (n31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(n31Var.f26561b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new zn0(13, n31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new zn0(15, (l41) obj, tLObject));
                return;
            case 17:
                t51 t51Var = (t51) obj;
                t51Var.getClass();
                AndroidUtilities.runOnUIThread(new fn0(t51Var, tL_error, tLObject, 14));
                return;
            default:
                int i12 = UndoView.f22472e0;
                AndroidUtilities.runOnUIThread(new zn0(19, (UndoView) obj, tLObject));
                return;
        }
    }
}
