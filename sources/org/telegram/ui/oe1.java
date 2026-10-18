package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oe1 extends org.telegram.ui.Components.u81 {
    public final ArrayList f39772a;
    public final pe1 f39773b;

    public oe1(pe1 pe1Var) {
        this.f39773b = pe1Var;
        ArrayList arrayList = new ArrayList();
        this.f39772a = arrayList;
        arrayList.add(new le1(0));
        le1 le1Var = new le1(2);
        le1Var.f38808b = 0;
        arrayList.add(le1Var);
        le1 le1Var2 = new le1(2);
        le1Var2.f38808b = 1;
        arrayList.add(le1Var2);
        le1 le1Var3 = new le1(2);
        le1Var3.f38808b = 2;
        arrayList.add(le1Var3);
        le1 le1Var4 = new le1(2);
        le1Var4.f38808b = 3;
        arrayList.add(le1Var4);
        le1 le1Var5 = new le1(2);
        le1Var5.f38808b = 4;
        arrayList.add(le1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        pe1 pe1Var = this.f39773b;
        pe1Var.K(view, i10, pe1Var.f40083b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        pe1 pe1Var = this.f39773b;
        te1 te1Var = pe1Var.f40100t0;
        if (i10 == 1) {
            return pe1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
            org.telegram.ui.Components.tn0 tn0Var = new org.telegram.ui.Components.tn0(i11, te1Var);
            tn0Var.f30669b.j(new ne1(0));
            tn0Var.setUiCallback(pe1Var);
            return tn0Var;
        }
        g10 g10Var = new g10(te1Var);
        g10Var.setChatPreviewDelegate(pe1Var.f40098r0);
        g10Var.setUiCallback(pe1Var);
        g10Var.f37018b.j(new ne1(1));
        return g10Var;
    }

    @Override
    public final int e() {
        return this.f39772a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f39772a;
        if (((le1) arrayList.get(i10)).f38807a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((le1) arrayList.get(i10)).f38807a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.o0 o0Var = hg.q0.f12016a3[((le1) arrayList.get(i10)).f38808b];
        String str = o0Var.f12004c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(o0Var.f12003b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f39772a;
        if (((le1) arrayList.get(i10)).f38807a == 0) {
            return 1;
        }
        if (((le1) arrayList.get(i10)).f38807a == 1) {
            return 2;
        }
        return ((le1) arrayList.get(i10)).f38807a + i10;
    }
}
