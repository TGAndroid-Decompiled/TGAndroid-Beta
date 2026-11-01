package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.kj;
import org.telegram.messenger.m20;
import org.telegram.messenger.rz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.af;
public final class t implements m20 {
    public final k0 f35221a;
    public final k7 f35222b;
    public final rz f35223c;
    public final kj d;
    public final TL_wallet.walletTransaction e;
    public final String f35224f;
    public final j0 f35225g;
    public final long h;
    public final TLRPC.User f35226i;

    public t(k0 k0Var, k7 k7Var, rz rzVar, kj kjVar, TL_wallet.walletTransaction wallettransaction, String str, j0 j0Var, long j10, TLRPC.User user) {
        this.f35221a = k0Var;
        this.f35222b = k7Var;
        this.f35223c = rzVar;
        this.d = kjVar;
        this.e = wallettransaction;
        this.f35224f = str;
        this.f35225g = j0Var;
        this.h = j10;
        this.f35226i = user;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        k0 k0Var = this.f35221a;
        int i10 = k0Var.f34781a;
        k7 k7Var = this.f35222b;
        rz rzVar = this.f35223c;
        kj kjVar = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            k7Var.run();
            rzVar.k(kjVar, null, false);
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
        if (k0.b(k0Var.t(), this.f35224f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z11 = wallettransaction.comment_encrypted;
        if (kjVar != null) {
            TLRPC.MessageAction messageAction = kjVar.f16690k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z11;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                kjVar.K1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(kjVar.f16690k);
                rzVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                rzVar.getNotificationCenter().k(at.m0, Long.valueOf(kj.B0(kjVar.f16690k)), org.telegram.messenger.m5.j(kjVar));
            }
        }
        if (sendtransfer.data_gasless != null) {
            z10 = true;
        }
        wallettransaction.gasless = z10;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        j0 j0Var = this.f35225g;
        j0Var.k();
        j0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = wp.r1(i10).p1(this.f35226i);
        k0Var.S();
        k0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i10).sendRequestTyped(sendtransfer, new a3.b(1), new af(k0Var, wallettransaction, rzVar, kjVar, k7Var, 3));
    }
}
