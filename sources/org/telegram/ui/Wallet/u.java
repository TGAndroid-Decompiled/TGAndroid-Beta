package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.hf;
public final class u implements Utilities.Callback3 {
    public final l0 f35398a;
    public final o6 f35399b;
    public final SendMessagesHelper f35400c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction f35401e;
    public final String f35402f;
    public final k0 f35403g;
    public final long h;
    public final TLRPC.User f35404i;

    public u(l0 l0Var, o6 o6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, k0 k0Var, long j3, TLRPC.User user) {
        this.f35398a = l0Var;
        this.f35399b = o6Var;
        this.f35400c = sendMessagesHelper;
        this.d = messageObject;
        this.f35401e = wallettransaction;
        this.f35402f = str;
        this.f35403g = k0Var;
        this.h = j3;
        this.f35404i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        l0 l0Var = this.f35398a;
        int i10 = l0Var.f34994a;
        o6 o6Var = this.f35399b;
        SendMessagesHelper sendMessagesHelper = this.f35400c;
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
        TL_wallet.walletTransaction wallettransaction = this.f35401e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (l0.b(l0Var.r(), this.f35402f)) {
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
        k0 k0Var = this.f35403g;
        k0Var.h();
        k0Var.f();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f35404i);
        l0Var.P();
        l0.E("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new hf(l0Var, wallettransaction, sendMessagesHelper, messageObject, o6Var, 4));
    }
}
