package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f32906a;
    public final Object f32907b;

    public y1(Object obj, int i10) {
        this.f32906a = i10;
        this.f32907b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32906a;
        Object obj = this.f32907b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.nh(27, faVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new md(29, (fs) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new jt(0, (kt) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new jt(6, (wx) obj, tLObject));
                return;
            case 5:
                hz hzVar = (hz) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new jt(11, hzVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new jt(19, (w70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h((Object) ((g80) obj), (Object) tL_error, tLObject, 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h((Object) ((ed0) obj), (Object) tL_error, tLObject, 27));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new jt(28, (fi0) obj, tLObject));
                return;
            case 10:
                nk0 nk0Var = (nk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    nk0Var.post(new bl(nk0Var, i11, tL_messages_messageReactionsList, 9));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ok0((xk0) obj, tLObject, 0));
                return;
            case 12:
                su0 su0Var = (su0) obj;
                su0Var.getClass();
                AndroidUtilities.runOnUIThread(new mh0(su0Var, tL_error, tLObject, 6));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new mh0((dz0) obj, tL_error, tLObject, 12));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new py0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                h41 h41Var = (h41) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(h41Var.f26640b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new gi0(18, h41Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new gi0(20, (g51) obj, tLObject));
                return;
            case 17:
                p61 p61Var = (p61) obj;
                p61Var.getClass();
                AndroidUtilities.runOnUIThread(new mh0(p61Var, tL_error, tLObject, 15));
                return;
            default:
                int i12 = UndoView.f24148e0;
                AndroidUtilities.runOnUIThread(new gi0(23, (UndoView) obj, tLObject));
                return;
        }
    }
}
