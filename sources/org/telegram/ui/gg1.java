package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gg1 extends org.telegram.ui.Components.c91 {
    public final ArrayList f36395a;
    public final hg1 f36396b;

    public gg1(hg1 hg1Var) {
        this.f36396b = hg1Var;
        ArrayList arrayList = new ArrayList();
        this.f36395a = arrayList;
        arrayList.add(new dg1(0));
        dg1 dg1Var = new dg1(2);
        dg1Var.f35257b = 0;
        arrayList.add(dg1Var);
        dg1 dg1Var2 = new dg1(2);
        dg1Var2.f35257b = 1;
        arrayList.add(dg1Var2);
        dg1 dg1Var3 = new dg1(2);
        dg1Var3.f35257b = 2;
        arrayList.add(dg1Var3);
        dg1 dg1Var4 = new dg1(2);
        dg1Var4.f35257b = 3;
        arrayList.add(dg1Var4);
        dg1 dg1Var5 = new dg1(2);
        dg1Var5.f35257b = 4;
        arrayList.add(dg1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        hg1 hg1Var = this.f36396b;
        hg1Var.K(view, i10, hg1Var.f36797b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        hg1 hg1Var = this.f36396b;
        lg1 lg1Var = hg1Var.f36814t0;
        if (i10 == 1) {
            return hg1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
            org.telegram.ui.Components.yn0 yn0Var = new org.telegram.ui.Components.yn0(i11, lg1Var);
            yn0Var.f31654b.j(new fg1(0));
            yn0Var.setUiCallback(hg1Var);
            return yn0Var;
        }
        c20 c20Var = new c20(lg1Var);
        c20Var.setChatPreviewDelegate(hg1Var.f36812r0);
        c20Var.setUiCallback(hg1Var);
        c20Var.f34681b.j(new fg1(1));
        return c20Var;
    }

    @Override
    public final int e() {
        return this.f36395a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f36395a;
        if (((dg1) arrayList.get(i10)).f35256a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((dg1) arrayList.get(i10)).f35256a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.p0 p0Var = hg.r0.f10714a3[((dg1) arrayList.get(i10)).f35257b];
        String str = p0Var.f10701c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10700b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f36395a;
        if (((dg1) arrayList.get(i10)).f35256a == 0) {
            return 1;
        }
        if (((dg1) arrayList.get(i10)).f35256a == 1) {
            return 2;
        }
        return ((dg1) arrayList.get(i10)).f35256a + i10;
    }
}
