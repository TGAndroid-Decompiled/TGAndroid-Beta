package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.kf;
public final class t implements Utilities.Callback3 {
    public final k0 f33442a;
    public final m6 f33443b;
    public final SendMessagesHelper f33444c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction e;
    public final String f33445f;
    public final j0 f33446g;
    public final long h;
    public final TLRPC.User f33447i;

    public t(k0 k0Var, m6 m6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, j0 j0Var, long j10, TLRPC.User user) {
        this.f33442a = k0Var;
        this.f33443b = m6Var;
        this.f33444c = sendMessagesHelper;
        this.d = messageObject;
        this.e = wallettransaction;
        this.f33445f = str;
        this.f33446g = j0Var;
        this.h = j10;
        this.f33447i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        k0 k0Var = this.f33442a;
        int i10 = k0Var.f33092a;
        m6 m6Var = this.f33443b;
        SendMessagesHelper sendMessagesHelper = this.f33444c;
        MessageObject messageObject = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            m6Var.run();
            sendMessagesHelper.completeSendingGramTransfer(messageObject, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            k0.i("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (k0.b(k0Var.r(), this.f33445f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        sendMessagesHelper.updateSendingGramTransferComment(messageObject, wallettransaction.comment, wallettransaction.comment_encrypted);
        if (sendtransfer.data_gasless != null) {
            z10 = true;
        }
        wallettransaction.gasless = z10;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        j0 j0Var = this.f33446g;
        j0Var.h();
        j0Var.f();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f33447i);
        k0Var.P();
        k0.E("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new kf(k0Var, wallettransaction, sendMessagesHelper, messageObject, m6Var, 4));
    }
}
