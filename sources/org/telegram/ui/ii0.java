package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
public final class ii0 implements org.telegram.messenger.n10 {
    public final int f46271a;
    public final PasskeysActivity f46272b;

    public ii0(PasskeysActivity passkeysActivity, int i3) {
        this.f46271a = i3;
        this.f46272b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3 = this.f46271a;
        PasskeysActivity passkeysActivity = this.f46272b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var = (org.telegram.ui.Components.f41) obj2;
                ArrayList arrayList2 = passkeysActivity.f41366b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = org.telegram.messenger.bd.M0(2131747637, null);
                org.telegram.ui.Components.r31 r31Var = new org.telegram.ui.Components.r31(2);
                r31Var.f37627l = M0;
                r31Var.f37626k = 2131624113;
                arrayList.add(r31Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    b40 b40Var = new b40(passkeysActivity, 16);
                    int i11 = ji0.f46627b;
                    org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(ji0.class);
                    K.G = (TL_account.Passkey) arrayList2.get(i10);
                    K.D = b40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().f23167x7.f24680z.f13798b).f23620c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.r31 c2 = org.telegram.ui.Components.r31.c(-1, 2131231845, org.telegram.messenger.bd.M0(2131747658, null));
                    c2.f37632q = true;
                    arrayList.add(c2);
                }
                arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131747643, null), new sg0(passkeysActivity, 3)), true)));
                return;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
