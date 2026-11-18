package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
public final class pi0 implements org.telegram.messenger.q10 {
    public final int f50840a;
    public final PasskeysActivity f50841b;

    public pi0(PasskeysActivity passkeysActivity, int i7) {
        this.f50840a = i7;
        this.f50841b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f50840a;
        PasskeysActivity passkeysActivity = this.f50841b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var = (org.telegram.ui.Components.z41) obj2;
                ArrayList arrayList2 = passkeysActivity.f43150b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = org.telegram.messenger.gd.M0(2131747436, null);
                org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(2);
                l41Var.f37018m = M0;
                l41Var.f37016k = 2131624114;
                arrayList.add(l41Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    j40 j40Var = new j40(passkeysActivity, 16);
                    int i11 = ri0.f51608b;
                    org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(ri0.class);
                    K.H = (TL_account.Passkey) arrayList2.get(i10);
                    K.E = j40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().A7.E.f15536b).f24764c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(-1, 2131231846, org.telegram.messenger.gd.M0(2131747457, null));
                    c10.f37023r = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131747442, null), new if0(passkeysActivity, 4)), true)));
                return;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
