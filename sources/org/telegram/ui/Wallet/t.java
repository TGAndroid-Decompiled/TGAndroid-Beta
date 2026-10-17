package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t implements Utilities.Callback3 {
    public final m0 f34882a;
    public final z6 f34883b;
    public final SendMessagesHelper f34884c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction e;
    public final String f34885f;
    public final l0 f34886g;
    public final long h;
    public final TLRPC.User f34887i;

    public t(m0 m0Var, z6 z6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, l0 l0Var, long j10, TLRPC.User user) {
        this.f34882a = m0Var;
        this.f34883b = z6Var;
        this.f34884c = sendMessagesHelper;
        this.d = messageObject;
        this.e = wallettransaction;
        this.f34885f = str;
        this.f34886g = l0Var;
        this.h = j10;
        this.f34887i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        m0 m0Var = this.f34882a;
        int i10 = m0Var.f34551a;
        z6 z6Var = this.f34883b;
        SendMessagesHelper sendMessagesHelper = this.f34884c;
        MessageObject messageObject = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            z6Var.run();
            sendMessagesHelper.completeSendingGramTransfer(messageObject, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            m0.i("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (m0.a(m0Var.s(), this.f34885f)) {
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
        l0 l0Var = this.f34886g;
        l0Var.j();
        l0Var.h();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f34887i);
        m0Var.Q();
        m0.F("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new ai.t3(m0Var, wallettransaction, sendMessagesHelper, messageObject, z6Var, 5));
    }
}
