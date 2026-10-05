package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class ql0 implements Utilities.Callback2 {
    public final int f39815a;
    public final PasskeysActivity f39816b;

    public ql0(PasskeysActivity passkeysActivity, int i10) {
        this.f39815a = i10;
        this.f39816b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f39815a;
        PasskeysActivity passkeysActivity = this.f39816b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.w61 w61Var = (org.telegram.ui.Components.w61) obj2;
                ArrayList arrayList2 = passkeysActivity.f33871b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(2);
                h61Var.f27093l = string;
                h61Var.f27092k = i11;
                arrayList.add(h61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    j60 j60Var = new j60(passkeysActivity, 15);
                    int i13 = rl0.f40141a;
                    org.telegram.ui.Components.h61 K = org.telegram.ui.Components.h61.K(rl0.class);
                    K.G = (TL_account.Passkey) arrayList2.get(i12);
                    K.D = j60Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.h61 c10 = org.telegram.ui.Components.h61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f27098q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.h61.C(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new nl0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.S(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
