package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class z8 implements x10 {
    public final int f45399a;
    public final d9 f45400b;
    public final vf.b f45401c;

    public z8(d9 d9Var, vf.b bVar, int i7) {
        this.f45399a = i7;
        this.f45400b = d9Var;
        this.f45401c = bVar;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f45399a;
        vf.b bVar = this.f45401c;
        d9 d9Var = this.f45400b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                d9Var.getClass();
                bVar.b();
                if (str != null) {
                    lc.b0(d9Var).f0(str, false);
                    return;
                }
                org.telegram.ui.ActionBar.r4 parentLayout = d9Var.getParentLayout();
                if (parentLayout == null) {
                    d9Var.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                    if ((g2Var instanceof na) || (g2Var instanceof l9) || (g2Var instanceof va) || (g2Var instanceof d9)) {
                        ((ActionBarLayout) parentLayout).d0(g2Var, false);
                    }
                }
                d9Var.finishFragment();
                return;
            default:
                bVar.c(false);
                org.telegram.ui.ActionBar.r4 parentLayout2 = d9Var.getParentLayout();
                if (parentLayout2 != null) {
                    ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj3;
                        if ((g2Var2 instanceof na) || (g2Var2 instanceof l9) || (g2Var2 instanceof va)) {
                            ((ActionBarLayout) parentLayout2).d0(g2Var2, false);
                        }
                    }
                }
                if (str != null) {
                    lc.b0(d9Var).f0(str, false);
                    return;
                }
                gc I = lc.b0(d9Var).I(2131623990, gd.N0(2131742947, null), gd.N0(2131742945, null));
                I.f35508j = 5000;
                I.j();
                return;
        }
    }
}
