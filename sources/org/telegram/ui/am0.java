package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class am0 implements Utilities.Callback2 {
    public final int f34280a;
    public final PasskeysActivity f34281b;

    public am0(PasskeysActivity passkeysActivity, int i10) {
        this.f34280a = i10;
        this.f34281b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f34280a;
        PasskeysActivity passkeysActivity = this.f34281b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.z61 z61Var = (org.telegram.ui.Components.z61) obj2;
                ArrayList arrayList2 = passkeysActivity.f32184b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.l61 l61Var = new org.telegram.ui.Components.l61(2);
                l61Var.f26954l = string;
                l61Var.f26953k = i11;
                arrayList.add(l61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    t60 t60Var = new t60(passkeysActivity, 14);
                    int i13 = bm0.f34597a;
                    org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(bm0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = t60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.l61 c10 = org.telegram.ui.Components.l61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f26959q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.l61.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new yk0(passkeysActivity, 2)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
