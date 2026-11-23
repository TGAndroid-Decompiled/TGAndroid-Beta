package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ne;
public final class a0 implements t10 {
    public final u0 f43950a;
    public final v7 f43951b;
    public final az f43952c;
    public final gj d;
    public final TL_wallet.walletTransaction f43953e;
    public final String f43954f;
    public final t0 f43955g;
    public final long h;
    public final TLRPC.User f43956i;

    public a0(u0 u0Var, v7 v7Var, az azVar, gj gjVar, TL_wallet.walletTransaction wallettransaction, String str, t0 t0Var, long j3, TLRPC.User user) {
        this.f43950a = u0Var;
        this.f43951b = v7Var;
        this.f43952c = azVar;
        this.d = gjVar;
        this.f43953e = wallettransaction;
        this.f43954f = str;
        this.f43955g = t0Var;
        this.h = j3;
        this.f43956i = user;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        u0 u0Var = this.f43950a;
        int i7 = u0Var.f45127a;
        v7 v7Var = this.f43951b;
        az azVar = this.f43952c;
        gj gjVar = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            v7Var.run();
            azVar.k(gjVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            u0.n("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.f43953e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (u0.c(u0Var.y(), this.f43954f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z11 = wallettransaction.comment_encrypted;
        if (gjVar != null) {
            TLRPC.MessageAction messageAction = gjVar.f24213k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z11;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                gjVar.M1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(gjVar.f24213k);
                azVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                azVar.getNotificationCenter().k(ls.m0, Long.valueOf(gj.B0(gjVar.f24213k)), org.telegram.messenger.f3.i(gjVar));
            }
        }
        if (sendtransfer.data_gasless != null) {
            z10 = true;
        }
        wallettransaction.gasless = z10;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        t0 t0Var = this.f43955g;
        t0Var.k();
        t0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = np.u1(i7).s1(this.f43956i);
        u0Var.a0();
        u0.P("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new ne(u0Var, wallettransaction, azVar, gjVar, v7Var, 4));
    }
}
