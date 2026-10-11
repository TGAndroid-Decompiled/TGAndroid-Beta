package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.cf;
public final class u implements Utilities.Callback3 {
    public final l0 f35588a;
    public final o6 f35589b;
    public final SendMessagesHelper f35590c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction f35591e;
    public final String f35592f;
    public final k0 f35593g;
    public final long h;
    public final TLRPC.User f35594i;

    public u(l0 l0Var, o6 o6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, k0 k0Var, long j3, TLRPC.User user) {
        this.f35588a = l0Var;
        this.f35589b = o6Var;
        this.f35590c = sendMessagesHelper;
        this.d = messageObject;
        this.f35591e = wallettransaction;
        this.f35592f = str;
        this.f35593g = k0Var;
        this.h = j3;
        this.f35594i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        l0 l0Var = this.f35588a;
        int i10 = l0Var.f35185a;
        o6 o6Var = this.f35589b;
        SendMessagesHelper sendMessagesHelper = this.f35590c;
        MessageObject messageObject = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            o6Var.run();
            sendMessagesHelper.completeSendingGramTransfer(messageObject, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            l0.i("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.f35591e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (l0.b(l0Var.r(), this.f35592f)) {
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
        k0 k0Var = this.f35593g;
        k0Var.h();
        k0Var.f();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f35594i);
        l0Var.P();
        l0.E("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new cf(l0Var, wallettransaction, sendMessagesHelper, messageObject, o6Var, 4));
    }
}
