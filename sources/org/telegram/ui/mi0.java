package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
public final class mi0 implements org.telegram.messenger.s10 {
    public final int f49239a;
    public final PasskeysActivity f49240b;

    public mi0(PasskeysActivity passkeysActivity, int i7) {
        this.f49239a = i7;
        this.f49240b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f49239a;
        PasskeysActivity passkeysActivity = this.f49240b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.p41 p41Var = (org.telegram.ui.Components.p41) obj2;
                ArrayList arrayList2 = passkeysActivity.f42705b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = org.telegram.messenger.hd.M0(2131747629, null);
                org.telegram.ui.Components.b41 b41Var = new org.telegram.ui.Components.b41(2);
                b41Var.f33181l = M0;
                b41Var.f33180k = 2131624114;
                arrayList.add(b41Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    g40 g40Var = new g40(passkeysActivity, 16);
                    int i11 = oi0.f49976b;
                    org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(oi0.class);
                    K.G = (TL_account.Passkey) arrayList2.get(i10);
                    K.D = g40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().f25448y7.f25871z.f15881b).f24493c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.b41 c10 = org.telegram.ui.Components.b41.c(-1, 2131231845, org.telegram.messenger.hd.M0(2131747650, null));
                    c10.f33186q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131747635, null), new ef0(passkeysActivity, 4)), true)));
                return;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
