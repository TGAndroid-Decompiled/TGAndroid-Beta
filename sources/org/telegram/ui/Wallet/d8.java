package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
public final class d8 implements Utilities.Callback {
    public final int f34111a;
    public final h8 f34112b;
    public final pf.c f34113c;

    public d8(h8 h8Var, pf.c cVar, int i10) {
        this.f34111a = i10;
        this.f34112b = h8Var;
        this.f34113c = cVar;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f34111a) {
            case 0:
                h8 h8Var = this.f34112b;
                h8Var.getClass();
                this.f34113c.b();
                if (!TextUtils.isEmpty(str)) {
                    xc.a0(h8Var).e0(str, false);
                    return;
                }
                return;
            case 1:
                this.f34113c.c(false);
                h8 h8Var2 = this.f34112b;
                org.telegram.ui.ActionBar.d5 parentLayout = h8Var2.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                        if ((n2Var instanceof r9) || (n2Var instanceof p8) || (n2Var instanceof z9)) {
                            ((ActionBarLayout) parentLayout).a0(n2Var, false);
                        }
                    }
                }
                if (str != null) {
                    xc.a0(h8Var2).e0(str, false);
                    return;
                }
                qc M = xc.a0(h8Var2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                M.f29596j = 5000;
                M.j();
                return;
            default:
                h8 h8Var3 = this.f34112b;
                h8Var3.getClass();
                this.f34113c.b();
                if (str != null) {
                    xc.a0(h8Var3).e0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.d5 parentLayout2 = h8Var3.getParentLayout();
                if (parentLayout2 == null) {
                    h8Var3.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj3;
                    if ((n2Var2 instanceof r9) || (n2Var2 instanceof p8) || (n2Var2 instanceof z9) || (n2Var2 instanceof h8)) {
                        ((ActionBarLayout) parentLayout2).a0(n2Var2, false);
                    }
                }
                h8Var3.finishFragment();
                return;
        }
    }
}
