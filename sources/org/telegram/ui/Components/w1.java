package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w1 implements RequestDelegate {
    public final int f34069a;
    public final Object f34070b;

    public w1(Object obj, int i9) {
        this.f34069a = i9;
        this.f34070b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f34069a;
        Object obj = this.f34070b;
        switch (i9) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                v9 v9Var = (v9) obj;
                v9Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(4, v9Var, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zq(1, (cr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new zq(2, (gs) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new zq(8, (pw) obj, tLObject));
                return;
            case 5:
                ay ayVar = (ay) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new zq(13, ayVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new zq(21, (a60) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((k60) obj, tL_error, tLObject, 25));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((gb0) obj, tL_error, tLObject, 28));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new jg0(0, (kg0) obj, tLObject));
                return;
            case 10:
                ui0 ui0Var = (ui0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i10 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    ui0Var.post(new org.telegram.ui.rl(ui0Var, i10, tL_messages_messageReactionsList, 9));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new vi0((ej0) obj, tLObject, 0));
                return;
            case 12:
                ps0 ps0Var = (ps0) obj;
                ps0Var.getClass();
                AndroidUtilities.runOnUIThread(new ue0(ps0Var, tL_error, tLObject, 7));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ue0((cx0) obj, tL_error, tLObject, 13));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gh.e7(tLObject, (Utilities.Callback) obj, 1));
                return;
            case 15:
                b21 b21Var = (b21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(b21Var.f27001b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new jg0(20, b21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new jg0(22, (z21) obj, tLObject));
                return;
            case 17:
                g41 g41Var = (g41) obj;
                g41Var.getClass();
                AndroidUtilities.runOnUIThread(new ue0(g41Var, tL_error, tLObject, 16));
                return;
            default:
                int i11 = UndoView.f26575a0;
                AndroidUtilities.runOnUIThread(new jg0(26, (UndoView) obj, tLObject));
                return;
        }
    }
}
