package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
public final class p8 implements q20 {
    public final int f35042a;
    public final t8 f35043b;
    public final gf.e f35044c;

    public p8(t8 t8Var, gf.e eVar, int i10) {
        this.f35042a = i10;
        this.f35043b = t8Var;
        this.f35044c = eVar;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f35042a;
        gf.e eVar = this.f35044c;
        t8 t8Var = this.f35043b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                t8Var.getClass();
                eVar.b();
                if (!TextUtils.isEmpty(str)) {
                    cc.a0(t8Var).e0(str, false);
                    return;
                }
                return;
            case 1:
                eVar.c(false);
                org.telegram.ui.ActionBar.z4 parentLayout = t8Var.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                        if ((k2Var instanceof ba) || (k2Var instanceof a9) || (k2Var instanceof ja)) {
                            ((ActionBarLayout) parentLayout).c0(k2Var, false);
                        }
                    }
                }
                if (str != null) {
                    cc.a0(t8Var).e0(str, false);
                    return;
                }
                wb I = cc.a0(t8Var).I(2131623989, cd.L0(2131743217, null), cd.L0(2131743215, null));
                I.f32135j = 5000;
                I.j();
                return;
            default:
                t8Var.getClass();
                eVar.b();
                if (str != null) {
                    cc.a0(t8Var).e0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.z4 parentLayout2 = t8Var.getParentLayout();
                if (parentLayout2 == null) {
                    t8Var.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj3;
                    if ((k2Var2 instanceof ba) || (k2Var2 instanceof a9) || (k2Var2 instanceof ja) || (k2Var2 instanceof t8)) {
                        ((ActionBarLayout) parentLayout2).c0(k2Var2, false);
                    }
                }
                t8Var.finishFragment();
                return;
        }
    }
}
