package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f30525a;
    public final Object f30526b;

    public y1(Object obj, int i10) {
        this.f30525a = i10;
        this.f30526b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30525a;
        Object obj = this.f30526b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.fh(27, daVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new kd(24, (or) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new kd(25, (ss) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ww(1, (gx) obj, tLObject));
                return;
            case 5:
                ry ryVar = (ry) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ww(6, ryVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ww(14, (d70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((n70) obj, tL_error, tLObject, 23));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((lc0) obj, tL_error, tLObject, 26));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ww(23, (kh0) obj, tLObject));
                return;
            case 10:
                rj0 rj0Var = (rj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    rj0Var.post(new ym(rj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new sj0((bk0) obj, tLObject, 0));
                return;
            case 12:
                vt0 vt0Var = (vt0) obj;
                vt0Var.getClass();
                AndroidUtilities.runOnUIThread(new dn0(vt0Var, tL_error, tLObject, 5));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new dn0((gy0) obj, tL_error, tLObject, 11));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new sx0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                l31 l31Var = (l31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(l31Var.f25943b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new xn0(13, l31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new xn0(15, (j41) obj, tLObject));
                return;
            case 17:
                r51 r51Var = (r51) obj;
                r51Var.getClass();
                AndroidUtilities.runOnUIThread(new dn0(r51Var, tL_error, tLObject, 14));
                return;
            default:
                int i12 = UndoView.f22450e0;
                AndroidUtilities.runOnUIThread(new xn0(19, (UndoView) obj, tLObject));
                return;
        }
    }
}
