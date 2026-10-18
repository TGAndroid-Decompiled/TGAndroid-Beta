package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class fl0 implements Utilities.Callback2 {
    public final int f36936a;
    public final PasskeysActivity f36937b;

    public fl0(PasskeysActivity passkeysActivity, int i10) {
        this.f36936a = i10;
        this.f36937b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f36936a;
        PasskeysActivity passkeysActivity = this.f36937b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.s61 s61Var = (org.telegram.ui.Components.s61) obj2;
                ArrayList arrayList2 = passkeysActivity.f33224b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.f61 f61Var = new org.telegram.ui.Components.f61(2);
                f61Var.f26140l = string;
                f61Var.f26139k = i11;
                arrayList.add(f61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    y50 y50Var = new y50(passkeysActivity, 14);
                    int i13 = gl0.f37202a;
                    org.telegram.ui.Components.f61 J = org.telegram.ui.Components.f61.J(gl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = y50Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.f61 c10 = org.telegram.ui.Components.f61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f26145q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.f61.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new ek0(passkeysActivity, 2)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
