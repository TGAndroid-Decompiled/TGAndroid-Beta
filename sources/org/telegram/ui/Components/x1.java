package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f32475a;
    public final Object f32476b;

    public x1(Object obj, int i10) {
        this.f32475a = i10;
        this.f32476b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32475a;
        Object obj = this.f32476b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                ba baVar = (ba) obj;
                baVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.eh(25, baVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ce(26, (vr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ce(27, (xs) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new wt(3, (jx) obj, tLObject));
                return;
            case 5:
                wy wyVar = (wy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new wt(8, wyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new wt(16, (k70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new jg((v70) obj, tL_error, tLObject, 11));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new jg((tc0) obj, tL_error, tLObject, 14));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new wt(25, (wh0) obj, tLObject));
                return;
            case 10:
                fk0 fk0Var = (fk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    fk0Var.post(new org.telegram.ui.h4(fk0Var, i11, tL_messages_messageReactionsList, 14));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gk0((pk0) obj, tLObject, 0));
                return;
            case 12:
                hu0 hu0Var = (hu0) obj;
                hu0Var.getClass();
                AndroidUtilities.runOnUIThread(new jg(hu0Var, tL_error, tLObject, 23));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new jg((sy0) obj, tL_error, tLObject, 29));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ai.n9(tLObject, (Utilities.Callback) obj, 1));
                return;
            case 15:
                v31 v31Var = (v31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(v31Var.f31298b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new jo0(14, v31Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new jo0(16, (x41) obj, tLObject));
                return;
            case 17:
                g61 g61Var = (g61) obj;
                g61Var.getClass();
                AndroidUtilities.runOnUIThread(new ey0(g61Var, tL_error, tLObject, 2));
                return;
            default:
                int i12 = UndoView.f24555i0;
                AndroidUtilities.runOnUIThread(new jo0(19, (UndoView) obj, tLObject));
                return;
        }
    }
}
