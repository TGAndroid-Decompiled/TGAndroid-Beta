package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.df;
public final class t implements Utilities.Callback3 {
    public final k0 f35558a;
    public final n6 f35559b;
    public final SendMessagesHelper f35560c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction f35561e;
    public final String f35562f;
    public final j0 f35563g;
    public final long h;
    public final TLRPC.User f35564i;

    public t(k0 k0Var, n6 n6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, j0 j0Var, long j3, TLRPC.User user) {
        this.f35558a = k0Var;
        this.f35559b = n6Var;
        this.f35560c = sendMessagesHelper;
        this.d = messageObject;
        this.f35561e = wallettransaction;
        this.f35562f = str;
        this.f35563g = j0Var;
        this.h = j3;
        this.f35564i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        k0 k0Var = this.f35558a;
        int i10 = k0Var.f35155a;
        n6 n6Var = this.f35559b;
        SendMessagesHelper sendMessagesHelper = this.f35560c;
        MessageObject messageObject = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            n6Var.run();
            sendMessagesHelper.completeSendingGramTransfer(messageObject, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            k0.i("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.f35561e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (k0.b(k0Var.r(), this.f35562f)) {
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
        j0 j0Var = this.f35563g;
        j0Var.h();
        j0Var.f();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f35564i);
        k0Var.P();
        k0.E("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new df(k0Var, wallettransaction, sendMessagesHelper, messageObject, n6Var, 4));
    }
}
