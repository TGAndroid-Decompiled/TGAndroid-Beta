package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a2 implements RequestDelegate {
    public final int f26621a;
    public final Object f26622b;

    public a2(Object obj, int i10) {
        this.f26621a = i10;
        this.f26622b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f26621a;
        Object obj = this.f26622b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                aa aaVar = (aa) obj;
                aaVar.getClass();
                AndroidUtilities.runOnUIThread(new z2(1, aaVar, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new z2(28, (fr) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new z2(29, (ks) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gt(5, (ww) obj, tLObject));
                return;
            case 5:
                jy jyVar = (jy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new gt(10, jyVar, tLObject));
                    return;
                }
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gt(18, (n60) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new g((x60) obj, tL_error, tLObject, 14));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new g((vb0) obj, tL_error, tLObject, 17));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new gt(27, (ug0) obj, tLObject));
                return;
            case 10:
                fj0 fj0Var = (fj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    fj0Var.post(new rm(fj0Var, i11, tL_messages_messageReactionsList, 8));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gj0((pj0) obj, tLObject, 0));
                return;
            case 12:
                at0 at0Var = (at0) obj;
                at0Var.getClass();
                AndroidUtilities.runOnUIThread(new g(at0Var, tL_error, tLObject, 26));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new yw0((nx0) obj, tL_error, tLObject, 2));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new jh.b7(tLObject, (Utilities.Callback) obj, 1));
                return;
            case 15:
                m21 m21Var = (m21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(m21Var.f30552b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ii0(17, m21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ii0(19, (k31) obj, tLObject));
                return;
            case 17:
                r41 r41Var = (r41) obj;
                r41Var.getClass();
                AndroidUtilities.runOnUIThread(new yw0(r41Var, tL_error, tLObject, 5));
                return;
            default:
                int i12 = UndoView.f26586a0;
                AndroidUtilities.runOnUIThread(new ii0(23, (UndoView) obj, tLObject));
                return;
        }
    }
}
