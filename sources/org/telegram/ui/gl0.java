package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class gl0 implements Utilities.Callback2 {
    public final int f37629a;
    public final PasskeysActivity f37630b;

    public gl0(PasskeysActivity passkeysActivity, int i10) {
        this.f37629a = i10;
        this.f37630b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f37629a;
        PasskeysActivity passkeysActivity = this.f37630b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.b71 b71Var = (org.telegram.ui.Components.b71) obj2;
                ArrayList arrayList2 = passkeysActivity.f33538b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(2);
                m61Var.f28559l = string;
                m61Var.f28558k = i11;
                arrayList.add(m61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    w50 w50Var = new w50(passkeysActivity, 15);
                    int i13 = hl0.f37875a;
                    org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(hl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = w50Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.m61 c10 = org.telegram.ui.Components.m61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f28564q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.m61.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new oj0(passkeysActivity, 3)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
