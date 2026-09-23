package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class ml0 implements Utilities.Callback2 {
    public final int f35352a;
    public final PasskeysActivity f35353b;

    public ml0(PasskeysActivity passkeysActivity, int i10) {
        this.f35352a = i10;
        this.f35353b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f35352a;
        PasskeysActivity passkeysActivity = this.f35353b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj2;
                ArrayList arrayList2 = passkeysActivity.f30866b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(2);
                h51Var.f24507l = string;
                h51Var.f24506k = i11;
                arrayList.add(h51Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    h60 h60Var = new h60(passkeysActivity, 15);
                    int i13 = ol0.f35906a;
                    org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(ol0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = h60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.h51 c10 = org.telegram.ui.Components.h51.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f24512q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.h51.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new jl0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
