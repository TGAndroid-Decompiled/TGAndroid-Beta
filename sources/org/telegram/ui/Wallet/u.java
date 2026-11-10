package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class u implements x10 {
    public final l0 f43195a;
    public final h7 f43196b;
    public final gz f43197c;
    public final ij d;
    public final TL_wallet.walletTransaction f43198e;
    public final String f43199f;
    public final k0 f43200g;
    public final long h;
    public final TLRPC.User f43201i;

    public u(l0 l0Var, h7 h7Var, gz gzVar, ij ijVar, TL_wallet.walletTransaction wallettransaction, String str, k0 k0Var, long j3, TLRPC.User user) {
        this.f43195a = l0Var;
        this.f43196b = h7Var;
        this.f43197c = gzVar;
        this.d = ijVar;
        this.f43198e = wallettransaction;
        this.f43199f = str;
        this.f43200g = k0Var;
        this.h = j3;
        this.f43201i = user;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        l0 l0Var = this.f43195a;
        int i7 = l0Var.f42749a;
        h7 h7Var = this.f43196b;
        gz gzVar = this.f43197c;
        ij ijVar = this.d;
        boolean z9 = false;
        if (sendtransfer == null) {
            h7Var.run();
            gzVar.k(ijVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            l0.j("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.f43198e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (l0.b(l0Var.t(), this.f43199f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z10 = wallettransaction.comment_encrypted;
        if (ijVar != null) {
            TLRPC.MessageAction messageAction = ijVar.f23266k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z10;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                ijVar.K1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ijVar.f23266k);
                gzVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                gzVar.getNotificationCenter().k(qs.m0, Long.valueOf(ij.B0(ijVar.f23266k)), org.telegram.messenger.k5.k(ijVar));
            }
        }
        if (sendtransfer.data_gasless != null) {
            z9 = true;
        }
        wallettransaction.gasless = z9;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        k0 k0Var = this.f43200g;
        k0Var.k();
        k0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = qp.s1(i7).q1(this.f43201i);
        l0Var.S();
        l0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new bi.t3(l0Var, wallettransaction, gzVar, ijVar, h7Var, 4));
    }
}
