package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f33022a;
    public final Object f33023b;

    public y1(Object obj, int i10) {
        this.f33022a = i10;
        this.f33023b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f33022a;
        Object obj = this.f33023b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.oh(26, eaVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new be(23, (pr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new be(24, (ts) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new yw(0, (ix) obj, tLObject));
                return;
            case 5:
                sy syVar = (sy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new yw(5, syVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new yw(13, (f70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((p70) obj, tL_error, tLObject, 23));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((nc0) obj, tL_error, tLObject, 26));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new yw(22, (lh0) obj, tLObject));
                return;
            case 10:
                sj0 sj0Var = (sj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    sj0Var.post(new zm(sj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new tj0((ck0) obj, tLObject, 0));
                return;
            case 12:
                au0 au0Var = (au0) obj;
                au0Var.getClass();
                AndroidUtilities.runOnUIThread(new in0(au0Var, tL_error, tLObject, 5));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new in0((qy0) obj, tL_error, tLObject, 11));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new cy0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                v31 v31Var = (v31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(v31Var.f31546b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new uo0(12, v31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new uo0(14, (t41) obj, tLObject));
                return;
            case 17:
                b61 b61Var = (b61) obj;
                b61Var.getClass();
                AndroidUtilities.runOnUIThread(new in0(b61Var, tL_error, tLObject, 14));
                return;
            default:
                int i12 = UndoView.f24368e0;
                AndroidUtilities.runOnUIThread(new uo0(18, (UndoView) obj, tLObject));
                return;
        }
    }
}
