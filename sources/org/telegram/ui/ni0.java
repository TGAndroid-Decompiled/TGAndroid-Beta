package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
public final class ni0 implements org.telegram.messenger.v10 {
    public final int f48217a;
    public final PasskeysActivity f48218b;

    public ni0(PasskeysActivity passkeysActivity, int i7) {
        this.f48217a = i7;
        this.f48218b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f48217a;
        PasskeysActivity passkeysActivity = this.f48218b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.m41 m41Var = (org.telegram.ui.Components.m41) obj2;
                ArrayList arrayList2 = passkeysActivity.f41335b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = org.telegram.messenger.id.M0(2131747629, null);
                org.telegram.ui.Components.x31 x31Var = new org.telegram.ui.Components.x31(2);
                x31Var.f40156l = M0;
                x31Var.f40155k = 2131624113;
                arrayList.add(x31Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    j40 j40Var = new j40(passkeysActivity, 16);
                    int i11 = pi0.f48775b;
                    org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(pi0.class);
                    K.G = (TL_account.Passkey) arrayList2.get(i10);
                    K.D = j40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().f24946x7.f24469z.f13557b).f23464c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.x31 c10 = org.telegram.ui.Components.x31.c(-1, 2131231845, org.telegram.messenger.id.M0(2131747650, null));
                    c10.f40161q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131747635, null), new hf0(passkeysActivity, 4)), true)));
                return;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
