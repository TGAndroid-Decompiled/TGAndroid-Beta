package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f31107a;
    public final Object f31108b;

    public y1(Object obj, int i10) {
        this.f31107a = i10;
        this.f31108b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f31107a;
        Object obj = this.f31108b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.vp(6, faVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new vm(7, (as) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new vm(8, (dt) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new vm(14, (px) obj, tLObject));
                return;
            case 5:
                az azVar = (az) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new vm(19, azVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new vm(27, (p70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((z70) obj, tL_error, tLObject, 26));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((ad0) obj, tL_error, tLObject, 29));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new g90(6, (zh0) obj, tLObject));
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
                AndroidUtilities.runOnUIThread(new ze0(iu0Var, tL_error, tLObject, 8));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ze0((uy0) obj, tL_error, tLObject, 14));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gy0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                y31 y31Var = (y31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(y31Var.f31134b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new g90(26, y31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new g90(28, (x41) obj, tLObject));
                return;
            case 17:
                h61 h61Var = (h61) obj;
                h61Var.getClass();
                AndroidUtilities.runOnUIThread(new ze0(h61Var, tL_error, tLObject, 17));
                return;
            default:
                int i12 = UndoView.f23047e0;
                AndroidUtilities.runOnUIThread(new n51(1, (UndoView) obj, tLObject));
                return;
        }
    }
}
