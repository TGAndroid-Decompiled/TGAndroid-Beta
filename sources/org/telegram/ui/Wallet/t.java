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
    public final k0 f35460a;
    public final l6 f35461b;
    public final SendMessagesHelper f35462c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction f35463e;
    public final String f35464f;
    public final j0 f35465g;
    public final long h;
    public final TLRPC.User f35466i;

    public t(k0 k0Var, l6 l6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, j0 j0Var, long j3, TLRPC.User user) {
        this.f35460a = k0Var;
        this.f35461b = l6Var;
        this.f35462c = sendMessagesHelper;
        this.d = messageObject;
        this.f35463e = wallettransaction;
        this.f35464f = str;
        this.f35465g = j0Var;
        this.h = j3;
        this.f35466i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        k0 k0Var = this.f35460a;
        int i10 = k0Var.f35093a;
        l6 l6Var = this.f35461b;
        SendMessagesHelper sendMessagesHelper = this.f35462c;
        MessageObject messageObject = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            l6Var.run();
            sendMessagesHelper.completeSendingGramTransfer(messageObject, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            k0.i("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.f35463e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (k0.b(k0Var.r(), this.f35464f)) {
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
        j0 j0Var = this.f35465g;
        j0Var.h();
        j0Var.f();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f35466i);
        k0Var.P();
        k0.E("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new df(k0Var, wallettransaction, sendMessagesHelper, messageObject, l6Var, 4));
    }
}
