package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f30535a;
    public final Object f30536b;

    public y1(Object obj, int i10) {
        this.f30535a = i10;
        this.f30536b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30535a;
        Object obj = this.f30536b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.dh(28, daVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new uc(25, (or) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new uc(26, (ss) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new dv(2, (gx) obj, tLObject));
                return;
            case 5:
                ry ryVar = (ry) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new dv(7, ryVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new dv(15, (e70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((o70) obj, tL_error, tLObject, 23));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((mc0) obj, tL_error, tLObject, 26));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new dv(24, (lh0) obj, tLObject));
                return;
            case 10:
                sj0 sj0Var = (sj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    sj0Var.post(new ym(sj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new tj0((ck0) obj, tLObject, 0));
                return;
            case 12:
                wt0 wt0Var = (wt0) obj;
                wt0Var.getClass();
                AndroidUtilities.runOnUIThread(new en0(wt0Var, tL_error, tLObject, 5));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new en0((hy0) obj, tL_error, tLObject, 11));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new tx0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                m31 m31Var = (m31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(m31Var.f26270b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new yn0(14, m31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new yn0(16, (k41) obj, tLObject));
                return;
            case 17:
                s51 s51Var = (s51) obj;
                s51Var.getClass();
                AndroidUtilities.runOnUIThread(new en0(s51Var, tL_error, tLObject, 14));
                return;
            default:
                int i12 = UndoView.f22452e0;
                AndroidUtilities.runOnUIThread(new yn0(20, (UndoView) obj, tLObject));
                return;
        }
    }
}
