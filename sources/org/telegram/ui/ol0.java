package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class ol0 implements Utilities.Callback2 {
    public final int f42245a;
    public final PasskeysActivity f42246b;

    public ol0(PasskeysActivity passkeysActivity, int i10) {
        this.f42245a = i10;
        this.f42246b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f42245a;
        PasskeysActivity passkeysActivity = this.f42246b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var = (org.telegram.ui.Components.j71) obj2;
                ArrayList arrayList2 = passkeysActivity.f35604b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(2);
                t61Var.f32875l = string;
                t61Var.f32874k = i11;
                arrayList.add(t61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    x50 x50Var = new x50(passkeysActivity, 17);
                    int i13 = pl0.f42572a;
                    org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(pl0.class);
                    K.G = (TL_account.Passkey) arrayList2.get(i12);
                    K.D = x50Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.t61 c10 = org.telegram.ui.Components.t61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f32880q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.t61.C(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new lj0(passkeysActivity, 3)), true)));
                return;
            default:
                PasskeysActivity.V(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
