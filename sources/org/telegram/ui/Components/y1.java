package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f33149a;
    public final Object f33150b;

    public y1(Object obj, int i10) {
        this.f33149a = i10;
        this.f33150b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f33149a;
        Object obj = this.f33150b;
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
                bu0 bu0Var = (bu0) obj;
                bu0Var.getClass();
                AndroidUtilities.runOnUIThread(new in0(bu0Var, tL_error, tLObject, 5));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new in0((ry0) obj, tL_error, tLObject, 11));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new dy0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                w31 w31Var = (w31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w31Var.f32500b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new vo0(12, w31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new vo0(14, (u41) obj, tLObject));
                return;
            case 17:
                c61 c61Var = (c61) obj;
                c61Var.getClass();
                AndroidUtilities.runOnUIThread(new in0(c61Var, tL_error, tLObject, 14));
                return;
            default:
                int i12 = UndoView.f24375e0;
                AndroidUtilities.runOnUIThread(new vo0(18, (UndoView) obj, tLObject));
                return;
        }
    }
}
