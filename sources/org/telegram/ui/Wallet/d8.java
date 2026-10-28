package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
public final class d8 implements Utilities.Callback {
    public final int f36494a;
    public final h8 f36495b;
    public final qf.c f36496c;

    public d8(h8 h8Var, qf.c cVar, int i10) {
        this.f36494a = i10;
        this.f36495b = h8Var;
        this.f36496c = cVar;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f36494a) {
            case 0:
                h8 h8Var = this.f36495b;
                h8Var.getClass();
                this.f36496c.b();
                if (!TextUtils.isEmpty(str)) {
                    wc.b0(h8Var).f0(str, false);
                    return;
                }
                return;
            case 1:
                this.f36496c.c(false);
                h8 h8Var2 = this.f36495b;
                org.telegram.ui.ActionBar.j5 parentLayout = h8Var2.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj2;
                        if ((r2Var instanceof r9) || (r2Var instanceof p8) || (r2Var instanceof z9)) {
                            ((ActionBarLayout) parentLayout).c0(r2Var, false);
                        }
                    }
                }
                if (str != null) {
                    wc.b0(h8Var2).f0(str, false);
                    return;
                }
                qc M = wc.b0(h8Var2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                M.f31861j = 5000;
                M.j();
                return;
            default:
                h8 h8Var3 = this.f36495b;
                h8Var3.getClass();
                this.f36496c.b();
                if (str != null) {
                    wc.b0(h8Var3).f0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.j5 parentLayout2 = h8Var3.getParentLayout();
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
                    org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj3;
                    if ((r2Var2 instanceof r9) || (r2Var2 instanceof p8) || (r2Var2 instanceof z9) || (r2Var2 instanceof h8)) {
                        ((ActionBarLayout) parentLayout2).c0(r2Var2, false);
                    }
                }
                h8Var3.finishFragment();
                return;
        }
    }
}
