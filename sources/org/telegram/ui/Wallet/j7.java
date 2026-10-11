package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.sc;
public final class j7 implements Utilities.Callback {
    public final int f35151a;
    public final n7 f35152b;
    public final of.e f35153c;

    public j7(n7 n7Var, of.e eVar, int i10) {
        this.f35151a = i10;
        this.f35152b = n7Var;
        this.f35153c = eVar;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f35151a) {
            case 0:
                n7 n7Var = this.f35152b;
                n7Var.getClass();
                this.f35153c.b();
                if (!TextUtils.isEmpty(str)) {
                    ad.a0(n7Var).e0(str, false);
                    return;
                }
                return;
            case 1:
                this.f35153c.c(false);
                n7 n7Var2 = this.f35152b;
                org.telegram.ui.ActionBar.b5 parentLayout = n7Var2.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                        if ((m2Var instanceof u8) || (m2Var instanceof r7) || (m2Var instanceof b9)) {
                            ((ActionBarLayout) parentLayout).a0(m2Var, false);
                        }
                    }
                }
                if (str != null) {
                    ad.a0(n7Var2).e0(str, false);
                    return;
                }
                sc M = ad.a0(n7Var2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                M.f30833j = 5000;
                M.j();
                return;
            default:
                n7 n7Var3 = this.f35152b;
                n7Var3.getClass();
                this.f35153c.b();
                if (str != null) {
                    ad.a0(n7Var3).e0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.b5 parentLayout2 = n7Var3.getParentLayout();
                if (parentLayout2 == null) {
                    n7Var3.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj3;
                    if ((m2Var2 instanceof u8) || (m2Var2 instanceof r7) || (m2Var2 instanceof b9) || (m2Var2 instanceof n7)) {
                        ((ActionBarLayout) parentLayout2).a0(m2Var2, false);
                    }
                }
                n7Var3.finishFragment();
                return;
        }
    }
}
