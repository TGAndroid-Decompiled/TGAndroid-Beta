package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qe1 extends org.telegram.ui.Components.e71 {
    public final ArrayList f41782a;
    public final re1 f41783b;

    public qe1(re1 re1Var) {
        this.f41783b = re1Var;
        ArrayList arrayList = new ArrayList();
        this.f41782a = arrayList;
        arrayList.add(new ne1(0));
        ne1 ne1Var = new ne1(2);
        ne1Var.f40710b = 0;
        arrayList.add(ne1Var);
        ne1 ne1Var2 = new ne1(2);
        ne1Var2.f40710b = 1;
        arrayList.add(ne1Var2);
        ne1 ne1Var3 = new ne1(2);
        ne1Var3.f40710b = 2;
        arrayList.add(ne1Var3);
        ne1 ne1Var4 = new ne1(2);
        ne1Var4.f40710b = 3;
        arrayList.add(ne1Var4);
        ne1 ne1Var5 = new ne1(2);
        ne1Var5.f40710b = 4;
        arrayList.add(ne1Var5);
    }

    @Override
    public final void b(View view, int i9, int i10) {
        re1 re1Var = this.f41783b;
        re1Var.K(view, i9, re1Var.U, true);
    }

    @Override
    public final View d(int i9) {
        int i10;
        re1 re1Var = this.f41783b;
        we1 we1Var = re1Var.f42407p0;
        if (i9 == 1) {
            return re1Var.P;
        }
        if (i9 == 2) {
            i10 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
            org.telegram.ui.Components.gm0 gm0Var = new org.telegram.ui.Components.gm0(i10, we1Var);
            gm0Var.f28809b.j(new pe1(0));
            gm0Var.setUiCallback(re1Var);
            return gm0Var;
        }
        f10 f10Var = new f10(we1Var);
        f10Var.setChatPreviewDelegate(re1Var.f42405n0);
        f10Var.setUiCallback(re1Var);
        f10Var.f38087b.j(new pe1(1));
        return f10Var;
    }

    @Override
    public final int e() {
        return this.f41782a.size();
    }

    @Override
    public final CharSequence g(int i9) {
        ArrayList arrayList = this.f41782a;
        if (((ne1) arrayList.get(i9)).f40709a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((ne1) arrayList.get(i9)).f40709a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        of.m0 m0Var = of.o0.Y2[((ne1) arrayList.get(i9)).f40710b];
        String str = m0Var.f19420c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(m0Var.f19419b);
    }

    @Override
    public final int h(int i9) {
        ArrayList arrayList = this.f41782a;
        if (((ne1) arrayList.get(i9)).f40709a == 0) {
            return 1;
        }
        if (((ne1) arrayList.get(i9)).f40709a == 1) {
            return 2;
        }
        return ((ne1) arrayList.get(i9)).f40709a + i9;
    }
}
