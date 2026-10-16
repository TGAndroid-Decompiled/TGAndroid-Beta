package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class h7 implements Utilities.Callback {
    public final int f32982a;
    public final l7 f32983b;
    public final pf.c f32984c;

    public h7(l7 l7Var, pf.c cVar, int i10) {
        this.f32982a = i10;
        this.f32983b = l7Var;
        this.f32984c = cVar;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f32982a) {
            case 0:
                l7 l7Var = this.f32983b;
                l7Var.getClass();
                this.f32984c.b();
                if (!TextUtils.isEmpty(str)) {
                    zc.a0(l7Var).e0(str, false);
                    return;
                }
                return;
            case 1:
                this.f32984c.c(false);
                l7 l7Var2 = this.f32983b;
                org.telegram.ui.ActionBar.b5 parentLayout = l7Var2.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                        if ((m2Var instanceof s8) || (m2Var instanceof p7) || (m2Var instanceof z8)) {
                            ((ActionBarLayout) parentLayout).a0(m2Var, false);
                        }
                    }
                }
                if (str != null) {
                    zc.a0(l7Var2).e0(str, false);
                    return;
                }
                sc M = zc.a0(l7Var2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                M.f28805j = 5000;
                M.j();
                return;
            default:
                l7 l7Var3 = this.f32983b;
                l7Var3.getClass();
                this.f32984c.b();
                if (str != null) {
                    zc.a0(l7Var3).e0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.b5 parentLayout2 = l7Var3.getParentLayout();
                if (parentLayout2 == null) {
                    l7Var3.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj3;
                    if ((m2Var2 instanceof s8) || (m2Var2 instanceof p7) || (m2Var2 instanceof z8) || (m2Var2 instanceof l7)) {
                        ((ActionBarLayout) parentLayout2).a0(m2Var2, false);
                    }
                }
                l7Var3.finishFragment();
                return;
        }
    }
}
