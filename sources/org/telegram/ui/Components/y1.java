package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y1 implements RequestDelegate {
    public final int f33109a;
    public final Object f33110b;

    public y1(Object obj, int i10) {
        this.f33109a = i10;
        this.f33110b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f33109a;
        Object obj = this.f33110b;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ug(29, faVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bs(0, (es) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bs(1, (ht) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new bs(7, (ux) obj, tLObject));
                return;
            case 5:
                fz fzVar = (fz) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new bs(12, fzVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new bs(20, (t70) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((d80) obj, tL_error, tLObject, 26));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((ad0) obj, tL_error, tLObject, 29));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new bs(29, (di0) obj, tLObject));
                return;
            case 10:
                lk0 lk0Var = (lk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    lk0Var.post(new zk(lk0Var, i11, tL_messages_messageReactionsList, 9));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new mk0((vk0) obj, tLObject, 0));
                return;
            case 12:
                nu0 nu0Var = (nu0) obj;
                nu0Var.getClass();
                AndroidUtilities.runOnUIThread(new bf0(nu0Var, tL_error, tLObject, 8));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new bf0((yy0) obj, tL_error, tLObject, 14));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ky0(tLObject, (Utilities.Callback) obj, 0));
                return;
            case 15:
                d41 d41Var = (d41) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(d41Var.f25610b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ei0(19, d41Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ei0(21, (c51) obj, tLObject));
                return;
            case 17:
                l61 l61Var = (l61) obj;
                l61Var.getClass();
                AndroidUtilities.runOnUIThread(new bf0(l61Var, tL_error, tLObject, 17));
                return;
            default:
                int i12 = UndoView.f24398e0;
                AndroidUtilities.runOnUIThread(new ei0(24, (UndoView) obj, tLObject));
                return;
        }
    }
}
