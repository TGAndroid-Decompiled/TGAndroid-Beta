package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class ql0 implements Utilities.Callback2 {
    public final int f39749a;
    public final PasskeysActivity f39750b;

    public ql0(PasskeysActivity passkeysActivity, int i10) {
        this.f39749a = i10;
        this.f39750b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f39749a;
        PasskeysActivity passkeysActivity = this.f39750b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj2;
                ArrayList arrayList2 = passkeysActivity.f33852b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(2);
                g61Var.f26669l = string;
                g61Var.f26668k = i11;
                arrayList.add(g61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    j60 j60Var = new j60(passkeysActivity, 15);
                    int i13 = rl0.f40161a;
                    org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(rl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = j60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.g61 c10 = org.telegram.ui.Components.g61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f26674q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.g61.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new nl0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.S(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
