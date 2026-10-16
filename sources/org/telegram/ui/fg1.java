package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fg1 extends org.telegram.ui.Components.d91 {
    public final ArrayList f35530a;
    public final gg1 f35531b;

    public fg1(gg1 gg1Var) {
        this.f35531b = gg1Var;
        ArrayList arrayList = new ArrayList();
        this.f35530a = arrayList;
        arrayList.add(new cg1(0));
        cg1 cg1Var = new cg1(2);
        cg1Var.f34662b = 0;
        arrayList.add(cg1Var);
        cg1 cg1Var2 = new cg1(2);
        cg1Var2.f34662b = 1;
        arrayList.add(cg1Var2);
        cg1 cg1Var3 = new cg1(2);
        cg1Var3.f34662b = 2;
        arrayList.add(cg1Var3);
        cg1 cg1Var4 = new cg1(2);
        cg1Var4.f34662b = 3;
        arrayList.add(cg1Var4);
        cg1 cg1Var5 = new cg1(2);
        cg1Var5.f34662b = 4;
        arrayList.add(cg1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        gg1 gg1Var = this.f35531b;
        gg1Var.K(view, i10, gg1Var.f36197b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        gg1 gg1Var = this.f35531b;
        kg1 kg1Var = gg1Var.f36214t0;
        if (i10 == 1) {
            return gg1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
            org.telegram.ui.Components.xn0 xn0Var = new org.telegram.ui.Components.xn0(i11, kg1Var);
            xn0Var.f30966b.j(new eg1(0));
            xn0Var.setUiCallback(gg1Var);
            return xn0Var;
        }
        b20 b20Var = new b20(kg1Var);
        b20Var.setChatPreviewDelegate(gg1Var.f36212r0);
        b20Var.setUiCallback(gg1Var);
        b20Var.f34163b.j(new eg1(1));
        return b20Var;
    }

    @Override
    public final int e() {
        return this.f35530a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f35530a;
        if (((cg1) arrayList.get(i10)).f34661a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((cg1) arrayList.get(i10)).f34661a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.p0 p0Var = hg.r0.f10718a3[((cg1) arrayList.get(i10)).f34662b];
        String str = p0Var.f10705c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10704b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f35530a;
        if (((cg1) arrayList.get(i10)).f34661a == 0) {
            return 1;
        }
        if (((cg1) arrayList.get(i10)).f34661a == 1) {
            return 2;
        }
        return ((cg1) arrayList.get(i10)).f34661a + i10;
    }
}
