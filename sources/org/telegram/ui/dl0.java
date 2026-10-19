package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class dl0 implements Utilities.Callback2 {
    public final int f36405a;
    public final PasskeysActivity f36406b;

    public dl0(PasskeysActivity passkeysActivity, int i10) {
        this.f36405a = i10;
        this.f36406b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f36405a;
        PasskeysActivity passkeysActivity = this.f36406b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.t61 t61Var = (org.telegram.ui.Components.t61) obj2;
                ArrayList arrayList2 = passkeysActivity.f33230b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(2);
                g61Var.f26497l = string;
                g61Var.f26496k = i11;
                arrayList.add(g61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    s50 s50Var = new s50(passkeysActivity, 15);
                    int i13 = el0.f36679a;
                    org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(el0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = s50Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.g61 c10 = org.telegram.ui.Components.g61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f26502q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.g61.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new ck0(passkeysActivity, 2)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
