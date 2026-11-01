package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
public final class qj0 implements org.telegram.messenger.k20 {
    public final int f40801a;
    public final PasskeysActivity f40802b;

    public qj0(PasskeysActivity passkeysActivity, int i10) {
        this.f40801a = i10;
        this.f40802b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f40801a;
        PasskeysActivity passkeysActivity = this.f40802b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) obj2;
                ArrayList arrayList2 = passkeysActivity.f33435b;
                passkeysActivity.addPasskeyRow = -1;
                String L0 = org.telegram.messenger.dd.L0(2131747645, null);
                org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(2);
                b51Var.f24643l = L0;
                b51Var.f24642k = 2131624111;
                arrayList.add(b51Var);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    e50 e50Var = new e50(passkeysActivity, 16);
                    int i12 = sj0.f41381b;
                    org.telegram.ui.Components.b51 K = org.telegram.ui.Components.b51.K(sj0.class);
                    K.G = (TL_account.Passkey) arrayList2.get(i11);
                    K.D = e50Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.l0) passkeysActivity.getMessagesController().f19300y7.f18051z.f10701a).f16855c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.b51 c10 = org.telegram.ui.Components.b51.c(-1, 2131231844, org.telegram.messenger.dd.L0(2131747666, null));
                    c10.f24648q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131747651, null), new kg0(passkeysActivity, 4)), true)));
                return;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
