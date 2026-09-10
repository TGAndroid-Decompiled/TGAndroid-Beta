package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dg1 extends org.telegram.ui.Components.n81 {
    public final ArrayList f31905a;
    public final eg1 f31906b;

    public dg1(eg1 eg1Var) {
        this.f31906b = eg1Var;
        ArrayList arrayList = new ArrayList();
        this.f31905a = arrayList;
        arrayList.add(new ag1(0));
        ag1 ag1Var = new ag1(2);
        ag1Var.f31004b = 0;
        arrayList.add(ag1Var);
        ag1 ag1Var2 = new ag1(2);
        ag1Var2.f31004b = 1;
        arrayList.add(ag1Var2);
        ag1 ag1Var3 = new ag1(2);
        ag1Var3.f31004b = 2;
        arrayList.add(ag1Var3);
        ag1 ag1Var4 = new ag1(2);
        ag1Var4.f31004b = 3;
        arrayList.add(ag1Var4);
        ag1 ag1Var5 = new ag1(2);
        ag1Var5.f31004b = 4;
        arrayList.add(ag1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        eg1 eg1Var = this.f31906b;
        eg1Var.K(view, i10, eg1Var.f32188b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        eg1 eg1Var = this.f31906b;
        ig1 ig1Var = eg1Var.f32205t0;
        if (i10 == 1) {
            return eg1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
            org.telegram.ui.Components.fn0 fn0Var = new org.telegram.ui.Components.fn0(i11, ig1Var);
            fn0Var.f23040b.j(new cg1(0));
            fn0Var.setUiCallback(eg1Var);
            return fn0Var;
        }
        z10 z10Var = new z10(ig1Var);
        z10Var.setChatPreviewDelegate(eg1Var.f32203r0);
        z10Var.setUiCallback(eg1Var);
        z10Var.f39162b.j(new cg1(1));
        return z10Var;
    }

    @Override
    public final int e() {
        return this.f31905a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f31905a;
        if (((ag1) arrayList.get(i10)).f31003a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((ag1) arrayList.get(i10)).f31003a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        fg.q0 q0Var = fg.s0.f8199c3[((ag1) arrayList.get(i10)).f31004b];
        String str = q0Var.f8182c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f8181b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f31905a;
        if (((ag1) arrayList.get(i10)).f31003a == 0) {
            return 1;
        }
        if (((ag1) arrayList.get(i10)).f31003a == 1) {
            return 2;
        }
        return ((ag1) arrayList.get(i10)).f31003a + i10;
    }
}
