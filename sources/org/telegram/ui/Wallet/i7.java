package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;
public final class i7 implements Utilities.Callback {
    public final int f35087a;
    public final m7 f35088b;
    public final of.e f35089c;

    public i7(m7 m7Var, of.e eVar, int i10) {
        this.f35087a = i10;
        this.f35088b = m7Var;
        this.f35089c = eVar;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f35087a) {
            case 0:
                m7 m7Var = this.f35088b;
                m7Var.getClass();
                this.f35089c.b();
                if (!TextUtils.isEmpty(str)) {
                    ad.a0(m7Var).e0(str, false);
                    return;
                }
                return;
            case 1:
                this.f35089c.c(false);
                m7 m7Var2 = this.f35088b;
                org.telegram.ui.ActionBar.d5 parentLayout = m7Var2.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                        if ((n2Var instanceof t8) || (n2Var instanceof q7) || (n2Var instanceof a9)) {
                            ((ActionBarLayout) parentLayout).a0(n2Var, false);
                        }
                    }
                }
                if (str != null) {
                    ad.a0(m7Var2).e0(str, false);
                    return;
                }
                tc M = ad.a0(m7Var2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                M.f31096j = 5000;
                M.j();
                return;
            default:
                m7 m7Var3 = this.f35088b;
                m7Var3.getClass();
                this.f35089c.b();
                if (str != null) {
                    ad.a0(m7Var3).e0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.d5 parentLayout2 = m7Var3.getParentLayout();
                if (parentLayout2 == null) {
                    m7Var3.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj3;
                    if ((n2Var2 instanceof t8) || (n2Var2 instanceof q7) || (n2Var2 instanceof a9) || (n2Var2 instanceof m7)) {
                        ((ActionBarLayout) parentLayout2).a0(n2Var2, false);
                    }
                }
                m7Var3.finishFragment();
                return;
        }
    }
}
