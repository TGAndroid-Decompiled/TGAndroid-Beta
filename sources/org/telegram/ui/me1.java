package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class me1 extends org.telegram.ui.Components.v81 {
    public final ArrayList f39255a;
    public final ne1 f39256b;

    public me1(ne1 ne1Var) {
        this.f39256b = ne1Var;
        ArrayList arrayList = new ArrayList();
        this.f39255a = arrayList;
        arrayList.add(new je1(0));
        je1 je1Var = new je1(2);
        je1Var.f38234b = 0;
        arrayList.add(je1Var);
        je1 je1Var2 = new je1(2);
        je1Var2.f38234b = 1;
        arrayList.add(je1Var2);
        je1 je1Var3 = new je1(2);
        je1Var3.f38234b = 2;
        arrayList.add(je1Var3);
        je1 je1Var4 = new je1(2);
        je1Var4.f38234b = 3;
        arrayList.add(je1Var4);
        je1 je1Var5 = new je1(2);
        je1Var5.f38234b = 4;
        arrayList.add(je1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ne1 ne1Var = this.f39256b;
        ne1Var.K(view, i10, ne1Var.f39562b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        ne1 ne1Var = this.f39256b;
        re1 re1Var = ne1Var.f39579t0;
        if (i10 == 1) {
            return ne1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
            org.telegram.ui.Components.tn0 tn0Var = new org.telegram.ui.Components.tn0(i11, re1Var);
            tn0Var.f30631b.j(new le1(0));
            tn0Var.setUiCallback(ne1Var);
            return tn0Var;
        }
        e10 e10Var = new e10(re1Var);
        e10Var.setChatPreviewDelegate(ne1Var.f39577r0);
        e10Var.setUiCallback(ne1Var);
        e10Var.f36496b.j(new le1(1));
        return e10Var;
    }

    @Override
    public final int e() {
        return this.f39255a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f39255a;
        if (((je1) arrayList.get(i10)).f38233a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((je1) arrayList.get(i10)).f38233a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.o0 o0Var = hg.q0.f12017a3[((je1) arrayList.get(i10)).f38234b];
        String str = o0Var.f12005c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(o0Var.f12004b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f39255a;
        if (((je1) arrayList.get(i10)).f38233a == 0) {
            return 1;
        }
        if (((je1) arrayList.get(i10)).f38233a == 1) {
            return 2;
        }
        return ((je1) arrayList.get(i10)).f38233a + i10;
    }
}
