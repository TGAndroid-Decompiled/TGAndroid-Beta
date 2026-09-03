package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class jl0 implements Utilities.Callback2 {
    public final int f38074a;
    public final PasskeysActivity f38075b;

    public jl0(PasskeysActivity passkeysActivity, int i10) {
        this.f38074a = i10;
        this.f38075b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f38074a;
        PasskeysActivity passkeysActivity = this.f38075b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var = (org.telegram.ui.Components.w51) obj2;
                ArrayList arrayList2 = passkeysActivity.f34218b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(2);
                h51Var.f27375l = string;
                h51Var.f27374k = i11;
                arrayList.add(h51Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    f60 f60Var = new f60(passkeysActivity, 15);
                    int i13 = ml0.f38997a;
                    org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(ml0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = f60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.h51 c3 = org.telegram.ui.Components.h51.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c3.f27380q = true;
                    arrayList.add(c3);
                }
                arrayList.add(org.telegram.ui.Components.h51.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new gl0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
