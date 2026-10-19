package org.telegram.ui.Wallet;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t implements Utilities.Callback3 {
    public final m0 f34885a;
    public final w6 f34886b;
    public final SendMessagesHelper f34887c;
    public final MessageObject d;
    public final TL_wallet.walletTransaction e;
    public final String f34888f;
    public final l0 f34889g;
    public final long h;
    public final TLRPC.User f34890i;

    public t(m0 m0Var, w6 w6Var, SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TL_wallet.walletTransaction wallettransaction, String str, l0 l0Var, long j10, TLRPC.User user) {
        this.f34885a = m0Var;
        this.f34886b = w6Var;
        this.f34887c = sendMessagesHelper;
        this.d = messageObject;
        this.e = wallettransaction;
        this.f34888f = str;
        this.f34889g = l0Var;
        this.h = j10;
        this.f34890i = user;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        m0 m0Var = this.f34885a;
        int i10 = m0Var.f34468a;
        w6 w6Var = this.f34886b;
        SendMessagesHelper sendMessagesHelper = this.f34887c;
        MessageObject messageObject = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            w6Var.run();
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
        if (m0.a(m0Var.s(), this.f34888f)) {
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
        l0 l0Var = this.f34889g;
        l0Var.j();
        l0Var.h();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = MessagesController.getInstance(i10).getInputUser(this.f34890i);
        m0Var.Q();
        m0.F("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new Object(), new ai.x3(m0Var, wallettransaction, sendMessagesHelper, messageObject, w6Var, 5));
    }
}
