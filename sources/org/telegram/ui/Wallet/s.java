package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.kf;
public final class s implements Utilities.Callback3 {
    public final j0 f33668a;
    public final l6 f33669b;
    public final SendMessagesHelper f33670c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction e;
    public final String f33671f;
    public final i0 f33672g;
    public final long h;
    public final TLRPC.User f33673i;

    public s(j0 j0Var, l6 l6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, i0 i0Var, long j10, TLRPC.User user) {
        this.f33668a = j0Var;
        this.f33669b = l6Var;
        this.f33670c = sendMessagesHelper;
        this.d = messageObject;
        this.e = wallettransaction;
        this.f33671f = str;
        this.f33672g = i0Var;
        this.h = j10;
        this.f33673i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        j0 j0Var = this.f33668a;
        int i10 = j0Var.f33319a;
        l6 l6Var = this.f33669b;
        SendMessagesHelper sendMessagesHelper = this.f33670c;
        MessageObject messageObject = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            l6Var.run();
            sendMessagesHelper.completeSendingGramTransfer(messageObject, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            j0.i("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (j0.b(j0Var.r(), this.f33671f)) {
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
        i0 i0Var = this.f33672g;
        i0Var.h();
        i0Var.f();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f33673i);
        j0Var.P();
        j0.E("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new kf(j0Var, wallettransaction, sendMessagesHelper, messageObject, l6Var, 4));
    }
}
