package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
public final class pi0 implements org.telegram.messenger.r10 {
    public final int f50857a;
    public final PasskeysActivity f50858b;

    public pi0(PasskeysActivity passkeysActivity, int i7) {
        this.f50857a = i7;
        this.f50858b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f50857a;
        PasskeysActivity passkeysActivity = this.f50858b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.c51 c51Var = (org.telegram.ui.Components.c51) obj2;
                ArrayList arrayList2 = passkeysActivity.f43160b;
                passkeysActivity.addPasskeyRow = -1;
                String N0 = org.telegram.messenger.hd.N0(2131747435, null);
                org.telegram.ui.Components.o41 o41Var = new org.telegram.ui.Components.o41(2);
                o41Var.f38058m = N0;
                o41Var.f38056k = 2131624114;
                arrayList.add(o41Var);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    j40 j40Var = new j40(passkeysActivity, 16);
                    int i11 = ri0.f51619b;
                    org.telegram.ui.Components.o41 K = org.telegram.ui.Components.o41.K(ri0.class);
                    K.H = (TL_account.Passkey) arrayList2.get(i10);
                    K.E = j40Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().A7.E.f15495b).f24776c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.o41 c10 = org.telegram.ui.Components.o41.c(-1, 2131231846, org.telegram.messenger.hd.N0(2131747456, null));
                    c10.f38063r = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131747441, null), new hf0(passkeysActivity, 4)), true)));
                return;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
