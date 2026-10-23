package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f32394a;
    public final Object f32395b;

    public x1(Object obj, int i10) {
        this.f32394a = i10;
        this.f32395b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32394a;
        Object obj = this.f32395b;
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
                AndroidUtilities.runOnUIThread(new yt(16, (m70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new lg((x70) obj, tL_error, tLObject, 11));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new lg((vc0) obj, tL_error, tLObject, 14));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new yt(25, (xh0) obj, tLObject));
                return;
            case 10:
                gk0 gk0Var = (gk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    gk0Var.post(new org.telegram.ui.h4(gk0Var, i11, tL_messages_messageReactionsList, 14));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new hk0((qk0) obj, tLObject, 0));
                return;
            case 12:
                iu0 iu0Var = (iu0) obj;
                iu0Var.getClass();
                AndroidUtilities.runOnUIThread(new lg(iu0Var, tL_error, tLObject, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new lg((ty0) obj, tL_error, tLObject, 29));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ai.n9(tLObject, (Utilities.Callback) obj, 1));
                return;
            case 15:
                w31 w31Var = (w31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w31Var.f32132b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ko0(14, w31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ko0(16, (y41) obj, tLObject));
                return;
            case 17:
                h61 h61Var = (h61) obj;
                h61Var.getClass();
                AndroidUtilities.runOnUIThread(new fy0(h61Var, tL_error, tLObject, 2));
                return;
            default:
                int i12 = UndoView.f24554i0;
                AndroidUtilities.runOnUIThread(new ko0(19, (UndoView) obj, tLObject));
                return;
        }
    }
}
