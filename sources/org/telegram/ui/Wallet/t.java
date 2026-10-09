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
    public final k0 f35498a;
    public final m6 f35499b;
    public final SendMessagesHelper f35500c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction f35501e;
    public final String f35502f;
    public final j0 f35503g;
    public final long h;
    public final TLRPC.User f35504i;

    public t(k0 k0Var, m6 m6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, j0 j0Var, long j3, TLRPC.User user) {
        this.f35498a = k0Var;
        this.f35499b = m6Var;
        this.f35500c = sendMessagesHelper;
        this.d = messageObject;
        this.f35501e = wallettransaction;
        this.f35502f = str;
        this.f35503g = j0Var;
        this.h = j3;
        this.f35504i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        k0 k0Var = this.f35498a;
        int i10 = k0Var.f35117a;
        m6 m6Var = this.f35499b;
        SendMessagesHelper sendMessagesHelper = this.f35500c;
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
        TL_wallet.walletTransaction wallettransaction = this.f35501e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (k0.b(k0Var.r(), this.f35502f)) {
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
        j0 j0Var = this.f35503g;
        j0Var.h();
        j0Var.f();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f35504i);
        k0Var.P();
        k0.E("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new df(k0Var, wallettransaction, sendMessagesHelper, messageObject, m6Var, 4));
    }
}
