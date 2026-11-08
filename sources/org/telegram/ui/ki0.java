package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
public final class ki0 implements org.telegram.messenger.v10 {
    public final int f47202a;
    public final PasskeysActivity f47203b;

    public ki0(PasskeysActivity passkeysActivity, int i7) {
        this.f47202a = i7;
        this.f47203b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f47202a;
        PasskeysActivity passkeysActivity = this.f47203b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) obj2;
                ArrayList arrayList2 = passkeysActivity.f41337b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = org.telegram.messenger.id.M0(2131747630, null);
                org.telegram.ui.Components.x31 x31Var = new org.telegram.ui.Components.x31(2);
                x31Var.f40180l = M0;
                x31Var.f40179k = 2131624113;
                arrayList.add(x31Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    g40 g40Var = new g40(passkeysActivity, 16);
                    int i11 = mi0.f47813b;
                    org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(mi0.class);
                    K.G = (TL_account.Passkey) arrayList2.get(i10);
                    K.D = g40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().f24942x7.f24465z.f13555b).f23460c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.x31 c10 = org.telegram.ui.Components.x31.c(-1, 2131231845, org.telegram.messenger.id.M0(2131747651, null));
                    c10.f40185q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131747636, null), new ef0(passkeysActivity, 4)), true)));
                return;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
