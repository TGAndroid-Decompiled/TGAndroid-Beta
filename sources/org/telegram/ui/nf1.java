package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nf1 extends org.telegram.ui.Components.d81 {
    public final ArrayList f39339a;
    public final of1 f39340b;

    public nf1(of1 of1Var) {
        this.f39340b = of1Var;
        ArrayList arrayList = new ArrayList();
        this.f39339a = arrayList;
        arrayList.add(new kf1(0));
        kf1 kf1Var = new kf1(2);
        kf1Var.f38301b = 0;
        arrayList.add(kf1Var);
        kf1 kf1Var2 = new kf1(2);
        kf1Var2.f38301b = 1;
        arrayList.add(kf1Var2);
        kf1 kf1Var3 = new kf1(2);
        kf1Var3.f38301b = 2;
        arrayList.add(kf1Var3);
        kf1 kf1Var4 = new kf1(2);
        kf1Var4.f38301b = 3;
        arrayList.add(kf1Var4);
        kf1 kf1Var5 = new kf1(2);
        kf1Var5.f38301b = 4;
        arrayList.add(kf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        of1 of1Var = this.f39340b;
        of1Var.K(view, i10, of1Var.V, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        of1 of1Var = this.f39340b;
        sf1 sf1Var = of1Var.f39706q0;
        if (i10 == 1) {
            return of1Var.Q;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            org.telegram.ui.Components.dn0 dn0Var = new org.telegram.ui.Components.dn0(i11, sf1Var);
            dn0Var.f26310b.j(new mf1(0));
            dn0Var.setUiCallback(of1Var);
            return dn0Var;
        }
        t10 t10Var = new t10(sf1Var);
        t10Var.setChatPreviewDelegate(of1Var.f39704o0);
        t10Var.setUiCallback(of1Var);
        t10Var.f41357b.j(new mf1(1));
        return t10Var;
    }

    @Override
    public final int e() {
        return this.f39339a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f39339a;
        if (((kf1) arrayList.get(i10)).f38300a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((kf1) arrayList.get(i10)).f38300a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        uf.e0 e0Var = uf.g0.Z2[((kf1) arrayList.get(i10)).f38301b];
        String str = e0Var.f48584c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(e0Var.f48583b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f39339a;
        if (((kf1) arrayList.get(i10)).f38300a == 0) {
            return 1;
        }
        if (((kf1) arrayList.get(i10)).f38300a == 1) {
            return 2;
        }
        return ((kf1) arrayList.get(i10)).f38300a + i10;
    }
}
