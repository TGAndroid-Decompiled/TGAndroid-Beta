package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t implements Utilities.Callback3 {
    public final l0 f35193a;
    public final w6 f35194b;
    public final SendMessagesHelper f35195c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction e;
    public final String f35196f;
    public final k0 f35197g;
    public final long h;
    public final TLRPC.User f35198i;

    public t(l0 l0Var, w6 w6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, k0 k0Var, long j10, TLRPC.User user) {
        this.f35193a = l0Var;
        this.f35194b = w6Var;
        this.f35195c = sendMessagesHelper;
        this.d = messageObject;
        this.e = wallettransaction;
        this.f35196f = str;
        this.f35197g = k0Var;
        this.h = j10;
        this.f35198i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        l0 l0Var = this.f35193a;
        int i10 = l0Var.f34743a;
        w6 w6Var = this.f35194b;
        SendMessagesHelper sendMessagesHelper = this.f35195c;
        MessageObject messageObject = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            w6Var.run();
            sendMessagesHelper.completeSendingGramTransfer(messageObject, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            l0.i("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (l0.a(l0Var.s(), this.f35196f)) {
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
        k0 k0Var = this.f35197g;
        k0Var.k();
        k0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f35198i);
        l0Var.Q();
        l0.F("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new ai.x3(l0Var, wallettransaction, sendMessagesHelper, messageObject, w6Var, 5));
    }
}
