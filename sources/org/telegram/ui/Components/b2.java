package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b2 implements RequestDelegate {
    public final int f26709a;
    public final Object f26710b;

    public b2(Object obj, int i10) {
        this.f26709a = i10;
        this.f26710b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f26709a;
        Object obj = this.f26710b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                ha haVar = (ha) obj;
                haVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.kp(6, haVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new so(6, (zr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new so(7, (bt) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new so(13, (lx) obj, tLObject));
                return;
            case 5:
                xy xyVar = (xy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new so(18, xyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new so(26, (o70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new kg((z70) obj, tL_error, tLObject, 12));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new kg((sc0) obj, tL_error, tLObject, 15));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new u90(5, (xh0) obj, tLObject));
                return;
            case 10:
                gk0 gk0Var = (gk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    gk0Var.post(new org.telegram.ui.g4(gk0Var, i11, tL_messages_messageReactionsList, 14));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new hk0((qk0) obj, tLObject, 0));
                return;
            case 12:
                mu0 mu0Var = (mu0) obj;
                mu0Var.getClass();
                AndroidUtilities.runOnUIThread(new kg(mu0Var, tL_error, tLObject, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new kg((dz0) obj, tL_error, tLObject, 29));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new bi.i9(tLObject, (Utilities.Callback) obj, 1));
                return;
            case 15:
                f41 f41Var = (f41) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(f41Var.f28013b).lambda$processUpdates$379(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new u90(25, f41Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new u90(27, (g51) obj, tLObject));
                return;
            case 17:
                p61 p61Var = (p61) obj;
                p61Var.getClass();
                AndroidUtilities.runOnUIThread(new oy0(p61Var, tL_error, tLObject, 2));
                return;
            default:
                int i12 = UndoView.f26349i0;
                AndroidUtilities.runOnUIThread(new d71(0, (UndoView) obj, tLObject));
                return;
        }
    }
}
