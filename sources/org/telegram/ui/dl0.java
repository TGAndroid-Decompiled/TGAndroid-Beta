package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class dl0 implements Utilities.Callback2 {
    public final int f36415a;
    public final PasskeysActivity f36416b;

    public dl0(PasskeysActivity passkeysActivity, int i10) {
        this.f36415a = i10;
        this.f36416b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f36415a;
        PasskeysActivity passkeysActivity = this.f36416b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj2;
                ArrayList arrayList2 = passkeysActivity.f33240b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(2);
                h61Var.f26785l = string;
                h61Var.f26784k = i11;
                arrayList.add(h61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    s50 s50Var = new s50(passkeysActivity, 15);
                    int i13 = el0.f36689a;
                    org.telegram.ui.Components.h61 J = org.telegram.ui.Components.h61.J(el0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = s50Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.h61 c10 = org.telegram.ui.Components.h61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f26790q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.h61.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new ck0(passkeysActivity, 2)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
