package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
public final class mi0 implements org.telegram.messenger.v10 {
    public final int f47886a;
    public final PasskeysActivity f47887b;

    public mi0(PasskeysActivity passkeysActivity, int i7) {
        this.f47886a = i7;
        this.f47887b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f47886a;
        PasskeysActivity passkeysActivity = this.f47887b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.m41 m41Var = (org.telegram.ui.Components.m41) obj2;
                ArrayList arrayList2 = passkeysActivity.f41344b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = org.telegram.messenger.id.M0(2131747629, null);
                org.telegram.ui.Components.y31 y31Var = new org.telegram.ui.Components.y31(2);
                y31Var.f40568l = M0;
                y31Var.f40567k = 2131624113;
                arrayList.add(y31Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    i40 i40Var = new i40(passkeysActivity, 16);
                    int i11 = oi0.f48454b;
                    org.telegram.ui.Components.y31 K = org.telegram.ui.Components.y31.K(oi0.class);
                    K.G = (TL_account.Passkey) arrayList2.get(i10);
                    K.D = i40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().f24942x7.f24465z.f13555b).f23460c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.y31 c10 = org.telegram.ui.Components.y31.c(-1, 2131231845, org.telegram.messenger.id.M0(2131747650, null));
                    c10.f40573q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131747635, null), new gf0(passkeysActivity, 4)), true)));
                return;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
