package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f32525a;
    public final Object f32526b;

    public y1(Object obj, int i10) {
        this.f32525a = i10;
        this.f32526b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32525a;
        Object obj = this.f32526b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                da daVar = (da) obj;
                daVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.eh(25, daVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ee(26, (xr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ee(27, (zs) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new yt(3, (lx) obj, tLObject));
                return;
            case 5:
                yy yyVar = (yy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new yt(8, yyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new yt(16, (l70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new lg((v70) obj, tL_error, tLObject, 11));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new lg((tc0) obj, tL_error, tLObject, 14));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new yt(25, (th0) obj, tLObject));
                return;
            case 10:
                ck0 ck0Var = (ck0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    ck0Var.post(new org.telegram.ui.i4(ck0Var, i11, tL_messages_messageReactionsList, 14));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new dk0((mk0) obj, tLObject, 0));
                return;
            case 12:
                eu0 eu0Var = (eu0) obj;
                eu0Var.getClass();
                AndroidUtilities.runOnUIThread(new lg(eu0Var, tL_error, tLObject, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new lg((py0) obj, tL_error, tLObject, 29));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ai.n9(tLObject, (Utilities.Callback) obj, 1));
                return;
            case 15:
                r31 r31Var = (r31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(r31Var.f29814b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new go0(14, r31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new go0(16, (s41) obj, tLObject));
                return;
            case 17:
                b61 b61Var = (b61) obj;
                b61Var.getClass();
                AndroidUtilities.runOnUIThread(new by0(b61Var, tL_error, tLObject, 2));
                return;
            default:
                int i12 = UndoView.f24403e0;
                AndroidUtilities.runOnUIThread(new go0(19, (UndoView) obj, tLObject));
                return;
        }
    }
}
