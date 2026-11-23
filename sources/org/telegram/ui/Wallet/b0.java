package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.r10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ne;
public final class b0 implements r10 {
    public final v0 f44076a;
    public final w7 f44077b;
    public final zy f44078c;
    public final fj d;
    public final TL_wallet.walletTransaction f44079e;
    public final String f44080f;
    public final u0 f44081g;
    public final long h;
    public final TLRPC.User f44082i;

    public b0(v0 v0Var, w7 w7Var, zy zyVar, fj fjVar, TL_wallet.walletTransaction wallettransaction, String str, u0 u0Var, long j3, TLRPC.User user) {
        this.f44076a = v0Var;
        this.f44077b = w7Var;
        this.f44078c = zyVar;
        this.d = fjVar;
        this.f44079e = wallettransaction;
        this.f44080f = str;
        this.f44081g = u0Var;
        this.h = j3;
        this.f44082i = user;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        v0 v0Var = this.f44076a;
        int i7 = v0Var.f45255a;
        w7 w7Var = this.f44077b;
        zy zyVar = this.f44078c;
        fj fjVar = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            w7Var.run();
            zyVar.k(fjVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            v0.n("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.f44079e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (v0.c(v0Var.y(), this.f44080f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z11 = wallettransaction.comment_encrypted;
        if (fjVar != null) {
            TLRPC.MessageAction messageAction = fjVar.f24073k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z11;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                fjVar.M1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(fjVar.f24073k);
                zyVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                zyVar.getNotificationCenter().k(ks.m0, Long.valueOf(fj.B0(fjVar.f24073k)), org.telegram.messenger.f3.i(fjVar));
            }
        }
        if (sendtransfer.data_gasless != null) {
            z10 = true;
        }
        wallettransaction.gasless = z10;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        u0 u0Var = this.f44081g;
        u0Var.k();
        u0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = mp.u1(i7).s1(this.f44082i);
        v0Var.a0();
        v0.P("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i7).sendRequestTyped(sendtransfer, new d3.b(1), new ne(v0Var, wallettransaction, zyVar, fjVar, w7Var, 4));
    }
}
