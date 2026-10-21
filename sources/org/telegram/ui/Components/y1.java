package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f32538a;
    public final Object f32539b;

    public y1(Object obj, int i10) {
        this.f32538a = i10;
        this.f32539b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32538a;
        Object obj = this.f32539b;
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
                AndroidUtilities.runOnUIThread(new yt(25, (uh0) obj, tLObject));
                return;
            case 10:
                dk0 dk0Var = (dk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    dk0Var.post(new org.telegram.ui.i4(dk0Var, i11, tL_messages_messageReactionsList, 14));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ek0((nk0) obj, tLObject, 0));
                return;
            case 12:
                fu0 fu0Var = (fu0) obj;
                fu0Var.getClass();
                AndroidUtilities.runOnUIThread(new lg(fu0Var, tL_error, tLObject, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new lg((qy0) obj, tL_error, tLObject, 29));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ai.n9(tLObject, (Utilities.Callback) obj, 1));
                return;
            case 15:
                s31 s31Var = (s31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(s31Var.f30180b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ho0(14, s31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ho0(16, (t41) obj, tLObject));
                return;
            case 17:
                c61 c61Var = (c61) obj;
                c61Var.getClass();
                AndroidUtilities.runOnUIThread(new cy0(c61Var, tL_error, tLObject, 2));
                return;
            default:
                int i12 = UndoView.f24406e0;
                AndroidUtilities.runOnUIThread(new ho0(19, (UndoView) obj, tLObject));
                return;
        }
    }
}
