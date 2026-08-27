package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class w1 implements RequestDelegate {

    public final int f34088a;

    public final Object f34089b;

    public w1(Object obj, int i10) {
        this.f34088a = i10;
        this.f34089b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f34088a;
        int i11 = 8;
        int i12 = 22;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.f34089b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                }
                break;
            case 1:
                t9 t9Var = (t9) obj;
                t9Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.yq(4, t9Var, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new xq(i13, (ar) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new xq(2, (es) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new xq(i11, (pw) obj, tLObject));
                break;
            case 5:
                cy cyVar = (cy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new xq(13, cyVar, tLObject));
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new xq(21, (f60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((p60) obj, tL_error, tLObject, 19));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((kb0) obj, tL_error, tLObject, i12));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new lg0(i14, (mg0) obj, tLObject));
                break;
            case 10:
                wi0 wi0Var = (wi0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i15 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    wi0Var.post(new km(wi0Var, i15, tL_messages_messageReactionsList, i11));
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new xi0((gj0) obj, tLObject, i14));
                break;
            case 12:
                rs0 rs0Var = (rs0) obj;
                rs0Var.getClass();
                AndroidUtilities.runOnUIThread(new gs0(rs0Var, tL_error, tLObject, i13));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new gs0((ex0) obj, tL_error, tLObject, 7));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new hh.d7(tLObject, (Utilities.Callback) obj, i13));
                break;
            case 15:
                d21 d21Var = (d21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(d21Var.f27625b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new lg0(20, d21Var, updates), 1000L);
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new lg0(i12, (b31) obj, tLObject));
                break;
            case 17:
                i41 i41Var = (i41) obj;
                i41Var.getClass();
                AndroidUtilities.runOnUIThread(new gs0(i41Var, tL_error, tLObject, 10));
                break;
            default:
                int i16 = UndoView.f26571a0;
                AndroidUtilities.runOnUIThread(new lg0(26, (UndoView) obj, tLObject));
                break;
        }
    }
}
