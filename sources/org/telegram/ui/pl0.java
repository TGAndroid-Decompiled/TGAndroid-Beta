package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class pl0 implements Utilities.Callback2 {
    public final int f36504a;
    public final PasskeysActivity f36505b;

    public pl0(PasskeysActivity passkeysActivity, int i10) {
        this.f36504a = i10;
        this.f36505b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f36504a;
        PasskeysActivity passkeysActivity = this.f36505b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) obj2;
                ArrayList arrayList2 = passkeysActivity.f31183b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(2);
                x51Var.f30302l = string;
                x51Var.f30301k = i11;
                arrayList.add(x51Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    i60 i60Var = new i60(passkeysActivity, 15);
                    int i13 = ql0.f36772a;
                    org.telegram.ui.Components.x51 J = org.telegram.ui.Components.x51.J(ql0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = i60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.x51 c10 = org.telegram.ui.Components.x51.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f30307q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.x51.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new ml0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
