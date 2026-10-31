package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.messenger.l20;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.af;
public final class t implements l20 {
    public final k0 f35214a;
    public final k7 f35215b;
    public final qz f35216c;
    public final jj d;
    public final TL_wallet.walletTransaction e;
    public final String f35217f;
    public final j0 f35218g;
    public final long h;
    public final TLRPC.User f35219i;

    public t(k0 k0Var, k7 k7Var, qz qzVar, jj jjVar, TL_wallet.walletTransaction wallettransaction, String str, j0 j0Var, long j10, TLRPC.User user) {
        this.f35214a = k0Var;
        this.f35215b = k7Var;
        this.f35216c = qzVar;
        this.d = jjVar;
        this.e = wallettransaction;
        this.f35217f = str;
        this.f35218g = j0Var;
        this.h = j10;
        this.f35219i = user;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        k0 k0Var = this.f35214a;
        int i10 = k0Var.f34776a;
        k7 k7Var = this.f35215b;
        qz qzVar = this.f35216c;
        jj jjVar = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            k7Var.run();
            qzVar.k(jjVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            k0.j("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (k0.b(k0Var.t(), this.f35217f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z11 = wallettransaction.comment_encrypted;
        if (jjVar != null) {
            TLRPC.MessageAction messageAction = jjVar.f16337k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z11;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                jjVar.K1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(jjVar.f16337k);
                qzVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                qzVar.getNotificationCenter().k(zs.m0, Long.valueOf(jj.B0(jjVar.f16337k)), org.telegram.messenger.m5.j(jjVar));
            }
        }
        if (sendtransfer.data_gasless != null) {
            z10 = true;
        }
        wallettransaction.gasless = z10;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        j0 j0Var = this.f35218g;
        j0Var.k();
        j0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = vp.r1(i10).p1(this.f35219i);
        k0Var.S();
        k0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new a3.b(1), new af(k0Var, wallettransaction, qzVar, jjVar, k7Var, 3));
    }
}
