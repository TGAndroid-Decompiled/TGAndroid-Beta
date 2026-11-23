package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;
public final class q9 implements p10 {
    public final int f44971a;
    public final ea f44972b;

    public q9(ea eaVar, int i7) {
        this.f44971a = i7;
        this.f44972b = eaVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.f44971a) {
            case 0:
                String str = (String) obj2;
                ea.g0(this.f44972b, (TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                ea eaVar = this.f44972b;
                eaVar.getClass();
                if (wallettransaction != null) {
                    eaVar.f44232f0 = wallettransaction.fee;
                    eaVar.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                ea eaVar2 = this.f44972b;
                eaVar2.f44244r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    eaVar2.finishFragment();
                    return;
                }
                eaVar2.f44229e = walletuseraddress;
                if (walletuseraddress != null) {
                    eaVar2.h = walletuseraddress.address;
                }
                bi.i6 i6Var = eaVar2.f34213a;
                if (i6Var != null) {
                    i6Var.f35323g3.O(true);
                }
                eaVar2.C0();
                eaVar2.t0();
                h9 h9Var = eaVar2.f44251w;
                if (h9Var != null) {
                    h9Var.a(eaVar2.h, eaVar2.f44231f);
                    return;
                }
                return;
            case 3:
                ea eaVar3 = this.f44972b;
                eaVar3.f44234h0 = (String) obj;
                eaVar3.f44235i0 = ((Boolean) obj2).booleanValue();
                eaVar3.Q.setText(eaVar3.f44234h0);
                TextView textView = eaVar3.Q;
                if (TextUtils.isEmpty(eaVar3.f44234h0)) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                textView.setVisibility(i7);
                eaVar3.E0();
                return;
            default:
                ea eaVar4 = this.f44972b;
                eaVar4.f44234h0 = (String) obj;
                eaVar4.f44235i0 = ((Boolean) obj2).booleanValue();
                eaVar4.Q.setText(eaVar4.f44234h0);
                TextView textView2 = eaVar4.Q;
                if (TextUtils.isEmpty(eaVar4.f44234h0)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView2.setVisibility(i10);
                eaVar4.E0();
                return;
        }
    }
}
