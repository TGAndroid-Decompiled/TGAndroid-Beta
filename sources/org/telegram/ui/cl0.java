package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class cl0 implements Utilities.Callback2 {
    public final int f37233a;
    public final PasskeysActivity f37234b;

    public cl0(PasskeysActivity passkeysActivity, int i9) {
        this.f37233a = i9;
        this.f37234b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i9 = this.f37233a;
        PasskeysActivity passkeysActivity = this.f37234b;
        switch (i9) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var = (org.telegram.ui.Components.z41) obj2;
                ArrayList arrayList2 = passkeysActivity.f35577b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i10 = R.raw.passkey;
                org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(2);
                l41Var.f30339l = string;
                l41Var.f30338k = i10;
                arrayList.add(l41Var);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    q50 q50Var = new q50(passkeysActivity, 15);
                    int i12 = el0.f37987a;
                    org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(el0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i11);
                    J.D = q50Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f30344q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.l41.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new zk0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.T(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
