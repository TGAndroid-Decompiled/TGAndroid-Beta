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
public final class v implements x10 {
    public final m0 f43210a;
    public final f7 f43211b;
    public final gz f43212c;
    public final ij d;
    public final TL_wallet.walletTransaction f43213e;
    public final String f43214f;
    public final l0 f43215g;
    public final long h;
    public final TLRPC.User f43216i;

    public v(m0 m0Var, f7 f7Var, gz gzVar, ij ijVar, TL_wallet.walletTransaction wallettransaction, String str, l0 l0Var, long j3, TLRPC.User user) {
        this.f43210a = m0Var;
        this.f43211b = f7Var;
        this.f43212c = gzVar;
        this.d = ijVar;
        this.f43213e = wallettransaction;
        this.f43214f = str;
        this.f43215g = l0Var;
        this.h = j3;
        this.f43216i = user;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        m0 m0Var = this.f43210a;
        int i7 = m0Var.f42762a;
        f7 f7Var = this.f43211b;
        gz gzVar = this.f43212c;
        ij ijVar = this.d;
        boolean z9 = false;
        if (sendtransfer == null) {
            f7Var.run();
            gzVar.k(ijVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            m0.j("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.f43213e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (m0.b(m0Var.t(), this.f43214f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z10 = wallettransaction.comment_encrypted;
        if (ijVar != null) {
            TLRPC.MessageAction messageAction = ijVar.f23262k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z10;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                ijVar.K1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ijVar.f23262k);
                gzVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                gzVar.getNotificationCenter().k(qs.m0, Long.valueOf(ij.B0(ijVar.f23262k)), org.telegram.messenger.k5.k(ijVar));
            }
        }
        if (sendtransfer.data_gasless != null) {
            z9 = true;
        }
        wallettransaction.gasless = z9;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        l0 l0Var = this.f43215g;
        l0Var.k();
        l0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = qp.s1(i7).q1(this.f43216i);
        m0Var.S();
        m0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new bi.t3(m0Var, wallettransaction, gzVar, ijVar, f7Var, 4));
    }
}
