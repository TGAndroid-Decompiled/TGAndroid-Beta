package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class u implements u10 {
    public final l0 f44530a;
    public final g7 f44531b;
    public final ez f44532c;
    public final gj d;
    public final TL_wallet.walletTransaction f44533e;
    public final String f44534f;
    public final k0 f44535g;
    public final long h;
    public final TLRPC.User f44536i;

    public u(l0 l0Var, g7 g7Var, ez ezVar, gj gjVar, TL_wallet.walletTransaction wallettransaction, String str, k0 k0Var, long j3, TLRPC.User user) {
        this.f44530a = l0Var;
        this.f44531b = g7Var;
        this.f44532c = ezVar;
        this.d = gjVar;
        this.f44533e = wallettransaction;
        this.f44534f = str;
        this.f44535g = k0Var;
        this.h = j3;
        this.f44536i = user;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        l0 l0Var = this.f44530a;
        int i7 = l0Var.f44078a;
        g7 g7Var = this.f44531b;
        ez ezVar = this.f44532c;
        gj gjVar = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            g7Var.run();
            ezVar.k(gjVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            l0.j("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.f44533e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (l0.b(l0Var.t(), this.f44534f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z11 = wallettransaction.comment_encrypted;
        if (gjVar != null) {
            TLRPC.MessageAction messageAction = gjVar.f23819k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z11;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                gjVar.M1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(gjVar.f23819k);
                ezVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                ezVar.getNotificationCenter().k(ns.m0, Long.valueOf(gj.B0(gjVar.f23819k)), org.telegram.messenger.k5.j(gjVar));
            }
        }
        if (sendtransfer.data_gasless != null) {
            z10 = true;
        }
        wallettransaction.gasless = z10;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        k0 k0Var = this.f44535g;
        k0Var.k();
        k0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = np.s1(i7).q1(this.f44536i);
        l0Var.S();
        l0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new di.z2(l0Var, wallettransaction, ezVar, gjVar, g7Var, 4));
    }
}
