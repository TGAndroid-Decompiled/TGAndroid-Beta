package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

public final class cl0 implements Utilities.Callback2 {

    public final int f37112a;

    public final PasskeysActivity f37113b;

    public cl0(PasskeysActivity passkeysActivity, int i10) {
        this.f37112a = i10;
        this.f37113b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f37112a;
        PasskeysActivity passkeysActivity = this.f37113b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.f35580b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(2);
                n41Var.f30844l = string;
                n41Var.f30843k = i11;
                arrayList.add(n41Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i12);
                    u50 u50Var = new u50(passkeysActivity, 15);
                    int i13 = el0.f37785a;
                    org.telegram.ui.Components.n41 n41VarJ = org.telegram.ui.Components.n41.J(el0.class);
                    n41VarJ.G = passkey;
                    n41VarJ.D = u50Var;
                    arrayList.add(n41VarJ);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.n41 n41VarC = org.telegram.ui.Components.n41.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    n41VarC.f30849q = true;
                    arrayList.add(n41VarC);
                }
                arrayList.add(org.telegram.ui.Components.n41.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new zk0(passkeysActivity, 1)), true)));
                break;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
