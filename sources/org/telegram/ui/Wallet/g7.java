package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class g7 implements Utilities.Callback {
    public final int f33209a;
    public final k7 f33210b;
    public final pf.c f33211c;

    public g7(k7 k7Var, pf.c cVar, int i10) {
        this.f33209a = i10;
        this.f33210b = k7Var;
        this.f33211c = cVar;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f33209a) {
            case 0:
                k7 k7Var = this.f33210b;
                k7Var.getClass();
                this.f33211c.b();
                if (!TextUtils.isEmpty(str)) {
                    zc.a0(k7Var).e0(str, false);
                    return;
                }
                return;
            case 1:
                this.f33211c.c(false);
                k7 k7Var2 = this.f33210b;
                org.telegram.ui.ActionBar.b5 parentLayout = k7Var2.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                        if ((m2Var instanceof r8) || (m2Var instanceof o7) || (m2Var instanceof z8)) {
                            ((ActionBarLayout) parentLayout).a0(m2Var, false);
                        }
                    }
                }
                if (str != null) {
                    zc.a0(k7Var2).e0(str, false);
                    return;
                }
                sc M = zc.a0(k7Var2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                M.f29102j = 5000;
                M.j();
                return;
            default:
                k7 k7Var3 = this.f33210b;
                k7Var3.getClass();
                this.f33211c.b();
                if (str != null) {
                    zc.a0(k7Var3).e0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.b5 parentLayout2 = k7Var3.getParentLayout();
                if (parentLayout2 == null) {
                    k7Var3.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj3;
                    if ((m2Var2 instanceof r8) || (m2Var2 instanceof o7) || (m2Var2 instanceof z8) || (m2Var2 instanceof k7)) {
                        ((ActionBarLayout) parentLayout2).a0(m2Var2, false);
                    }
                }
                k7Var3.finishFragment();
                return;
        }
    }
}
