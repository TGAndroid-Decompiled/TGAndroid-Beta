package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class u implements Utilities.Callback3 {
    public final l0 f37362a;
    public final w6 f37363b;
    public final SendMessagesHelper f37364c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction e;
    public final String f37365f;
    public final k0 f37366g;
    public final long h;
    public final TLRPC.User f37367i;

    public u(l0 l0Var, w6 w6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, k0 k0Var, long j10, TLRPC.User user) {
        this.f37362a = l0Var;
        this.f37363b = w6Var;
        this.f37364c = sendMessagesHelper;
        this.d = messageObject;
        this.e = wallettransaction;
        this.f37365f = str;
        this.f37366g = k0Var;
        this.h = j10;
        this.f37367i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        l0 l0Var = this.f37362a;
        int i10 = l0Var.f36834a;
        w6 w6Var = this.f37363b;
        SendMessagesHelper sendMessagesHelper = this.f37364c;
        MessageObject messageObject = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            w6Var.run();
            sendMessagesHelper.completeSendingGramTransfer(messageObject, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            l0.j("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (l0.b(l0Var.t(), this.f37365f)) {
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
        k0 k0Var = this.f37366g;
        k0Var.k();
        k0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f37367i);
        l0Var.S();
        l0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new bi.t3(l0Var, wallettransaction, sendMessagesHelper, messageObject, w6Var, 5));
    }
}
