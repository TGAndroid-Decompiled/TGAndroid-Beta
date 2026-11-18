package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.s10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ne;
public final class a0 implements s10 {
    public final u0 f43905a;
    public final v7 f43906b;
    public final zy f43907c;
    public final fj d;
    public final TL_wallet.walletTransaction f43908e;
    public final String f43909f;
    public final t0 f43910g;
    public final long h;
    public final TLRPC.User f43911i;

    public a0(u0 u0Var, v7 v7Var, zy zyVar, fj fjVar, TL_wallet.walletTransaction wallettransaction, String str, t0 t0Var, long j3, TLRPC.User user) {
        this.f43905a = u0Var;
        this.f43906b = v7Var;
        this.f43907c = zyVar;
        this.d = fjVar;
        this.f43908e = wallettransaction;
        this.f43909f = str;
        this.f43910g = t0Var;
        this.h = j3;
        this.f43911i = user;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        u0 u0Var = this.f43905a;
        int i7 = u0Var.f45083a;
        v7 v7Var = this.f43906b;
        zy zyVar = this.f43907c;
        fj fjVar = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            v7Var.run();
            zyVar.k(fjVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            u0.n("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.f43908e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (u0.c(u0Var.y(), this.f43909f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z11 = wallettransaction.comment_encrypted;
        if (fjVar != null) {
            TLRPC.MessageAction messageAction = fjVar.f23968k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z11;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                fjVar.M1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(fjVar.f23968k);
                zyVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                zyVar.getNotificationCenter().k(ks.m0, Long.valueOf(fj.B0(fjVar.f23968k)), org.telegram.messenger.f3.i(fjVar));
            }
        }
        if (sendtransfer.data_gasless != null) {
            z10 = true;
        }
        wallettransaction.gasless = z10;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        t0 t0Var = this.f43910g;
        t0Var.k();
        t0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = mp.u1(i7).s1(this.f43911i);
        u0Var.a0();
        u0.P("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new ne(u0Var, wallettransaction, zyVar, fjVar, v7Var, 4));
    }
}
