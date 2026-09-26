package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class ll0 implements Utilities.Callback2 {
    public final int f35381a;
    public final PasskeysActivity f35382b;

    public ll0(PasskeysActivity passkeysActivity, int i10) {
        this.f35381a = i10;
        this.f35382b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f35381a;
        PasskeysActivity passkeysActivity = this.f35382b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var = (org.telegram.ui.Components.j61) obj2;
                ArrayList arrayList2 = passkeysActivity.f31181b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(2);
                v51Var.f29048l = string;
                v51Var.f29047k = i11;
                arrayList.add(v51Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    f60 f60Var = new f60(passkeysActivity, 15);
                    int i13 = nl0.f35921a;
                    org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(nl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = f60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.v51 c10 = org.telegram.ui.Components.v51.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f29053q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.v51.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new il0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
