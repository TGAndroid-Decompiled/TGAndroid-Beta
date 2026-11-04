package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.p10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t implements p10 {
    public final k0 f43177a;
    public final e7 f43178b;
    public final yy f43179c;
    public final zi d;
    public final TL_wallet.walletTransaction f43180e;
    public final String f43181f;
    public final j0 f43182g;
    public final long h;
    public final TLRPC.User f43183i;

    public t(k0 k0Var, e7 e7Var, yy yyVar, zi ziVar, TL_wallet.walletTransaction wallettransaction, String str, j0 j0Var, long j10, TLRPC.User user) {
        this.f43177a = k0Var;
        this.f43178b = e7Var;
        this.f43179c = yyVar;
        this.d = ziVar;
        this.f43180e = wallettransaction;
        this.f43181f = str;
        this.f43182g = j0Var;
        this.h = j10;
        this.f43183i = user;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        k0 k0Var = this.f43177a;
        int i3 = k0Var.f42718a;
        e7 e7Var = this.f43178b;
        yy yyVar = this.f43179c;
        zi ziVar = this.d;
        boolean z10 = false;
        if (sendtransfer == null) {
            e7Var.run();
            yyVar.k(ziVar, null, false);
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            k0.j("failed sending: ".concat(str2));
            return;
        }
        TL_wallet.walletTransaction wallettransaction = this.f43180e;
        if (str != null) {
            wallettransaction.comment = str;
            wallettransaction.comment_encrypted = true;
        }
        if (k0.b(k0Var.t(), this.f43181f)) {
            sendtransfer.data_gasless = null;
        }
        wallettransaction.comment_encrypted_preparing = false;
        String str3 = wallettransaction.comment;
        boolean z11 = wallettransaction.comment_encrypted;
        if (ziVar != null) {
            TLRPC.MessageAction messageAction = ziVar.f26868k.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
                tL_messageActionGramTransfer.comment = str3;
                tL_messageActionGramTransfer.comment_encrypted = z11;
                tL_messageActionGramTransfer.comment_encrypted_preparing = false;
                ziVar.K1 = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ziVar.f26868k);
                yyVar.getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                yyVar.getNotificationCenter().k(hs.m0, Long.valueOf(zi.B0(ziVar.f26868k)), org.telegram.messenger.k5.k(ziVar));
            }
        }
        if (sendtransfer.data_gasless != null) {
            z10 = true;
        }
        wallettransaction.gasless = z10;
        wallettransaction.gaslessMessageBodyHash = sendtransfer.gaslessMessageBodyHash;
        wallettransaction.normalMessageBodyHash = sendtransfer.normalMessageBodyHash;
        j0 j0Var = this.f43182g;
        j0Var.k();
        j0Var.i();
        sendtransfer.random_id = this.h;
        sendtransfer.user_id = hp.s1(i3).q1(this.f43183i);
        k0Var.S();
        k0.H("prepared sendTransfer, sending");
        ConnectionsManager.getInstance(i3).sendRequestTyped(sendtransfer, new c3.b(1), new ci.g3(k0Var, wallettransaction, yyVar, ziVar, e7Var, 4));
    }
}
