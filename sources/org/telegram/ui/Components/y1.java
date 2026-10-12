package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f31446a;
    public final Object f31447b;

    public y1(Object obj, int i10) {
        this.f31446a = i10;
        this.f31447b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f31446a;
        Object obj = this.f31447b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.rp(11, faVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new sk(12, (as) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new sk(13, (dt) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new sk(19, (px) obj, tLObject));
                return;
            case 5:
                az azVar = (az) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new sk(24, azVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new f60(2, (p70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new n2.h((a80) obj, tL_error, tLObject, 29));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new v70((ad0) obj, tL_error, tLObject, 2));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new f60(11, (zh0) obj, tLObject));
                return;
            case 10:
                gk0 gk0Var = (gk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    gk0Var.post(new org.telegram.ui.gm(gk0Var, i11, tL_messages_messageReactionsList, 10));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new hk0((qk0) obj, tLObject, 0));
                return;
            case 12:
                iu0 iu0Var = (iu0) obj;
                iu0Var.getClass();
                AndroidUtilities.runOnUIThread(new v70(iu0Var, tL_error, tLObject, 11));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new v70((ty0) obj, tL_error, tLObject, 17));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new fy0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                y31 y31Var = (y31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(y31Var.f31472b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new k31(1, y31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new k31(3, (x41) obj, tLObject));
                return;
            case 17:
                g61 g61Var = (g61) obj;
                g61Var.getClass();
                AndroidUtilities.runOnUIThread(new v70(g61Var, tL_error, tLObject, 20));
                return;
            default:
                int i12 = UndoView.f23347e0;
                AndroidUtilities.runOnUIThread(new k31(6, (UndoView) obj, tLObject));
                return;
        }
    }
}
