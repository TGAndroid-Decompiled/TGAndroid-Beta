package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class hl0 implements Utilities.Callback2 {
    public final int f34912a;
    public final PasskeysActivity f34913b;

    public hl0(PasskeysActivity passkeysActivity, int i10) {
        this.f34912a = i10;
        this.f34913b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f34912a;
        PasskeysActivity passkeysActivity = this.f34913b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var = (org.telegram.ui.Components.w51) obj2;
                ArrayList arrayList2 = passkeysActivity.f31693b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(2);
                i51Var.f25565l = string;
                i51Var.f25564k = i11;
                arrayList.add(i51Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    e60 e60Var = new e60(passkeysActivity, 15);
                    int i13 = kl0.f35766a;
                    org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(kl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = e60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.i51 c3 = org.telegram.ui.Components.i51.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c3.f25570q = true;
                    arrayList.add(c3);
                }
                arrayList.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new el0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
