package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class ql0 implements Utilities.Callback2 {
    public final int f42746a;
    public final PasskeysActivity f42747b;

    public ql0(PasskeysActivity passkeysActivity, int i10) {
        this.f42746a = i10;
        this.f42747b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f42746a;
        PasskeysActivity passkeysActivity = this.f42747b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var = (org.telegram.ui.Components.k71) obj2;
                ArrayList arrayList2 = passkeysActivity.f35628b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(2);
                u61Var.f33249l = string;
                u61Var.f33248k = i11;
                arrayList.add(u61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    z50 z50Var = new z50(passkeysActivity, 17);
                    int i13 = rl0.f43083a;
                    org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(rl0.class);
                    K.G = (TL_account.Passkey) arrayList2.get(i12);
                    K.D = z50Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.u61 c10 = org.telegram.ui.Components.u61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f33254q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.u61.C(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new nj0(passkeysActivity, 3)), true)));
                return;
            default:
                PasskeysActivity.V(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
