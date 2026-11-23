package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
public final class ni0 implements org.telegram.messenger.p10 {
    public final int f50319a;
    public final PasskeysActivity f50320b;

    public ni0(PasskeysActivity passkeysActivity, int i7) {
        this.f50319a = i7;
        this.f50320b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f50319a;
        PasskeysActivity passkeysActivity = this.f50320b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) obj2;
                ArrayList arrayList2 = passkeysActivity.f43270b;
                passkeysActivity.addPasskeyRow = -1;
                String N0 = org.telegram.messenger.gd.N0(2131747435, null);
                org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(2);
                n41Var.f37655m = N0;
                n41Var.f37653k = 2131624114;
                arrayList.add(n41Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    i40 i40Var = new i40(passkeysActivity, 16);
                    int i11 = pi0.f51030b;
                    org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(pi0.class);
                    K.H = (TL_account.Passkey) arrayList2.get(i10);
                    K.E = i40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().A7.E.f15482b).f24899c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.n41 c10 = org.telegram.ui.Components.n41.c(-1, 2131231849, org.telegram.messenger.gd.N0(2131747456, null));
                    c10.f37660r = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131747441, null), new gf0(passkeysActivity, 4)), true)));
                return;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
