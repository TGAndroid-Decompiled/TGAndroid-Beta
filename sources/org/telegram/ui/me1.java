package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class me1 extends org.telegram.ui.Components.w81 {
    public final ArrayList f39231a;
    public final ne1 f39232b;

    public me1(ne1 ne1Var) {
        this.f39232b = ne1Var;
        ArrayList arrayList = new ArrayList();
        this.f39231a = arrayList;
        arrayList.add(new je1(0));
        je1 je1Var = new je1(2);
        je1Var.f38247b = 0;
        arrayList.add(je1Var);
        je1 je1Var2 = new je1(2);
        je1Var2.f38247b = 1;
        arrayList.add(je1Var2);
        je1 je1Var3 = new je1(2);
        je1Var3.f38247b = 2;
        arrayList.add(je1Var3);
        je1 je1Var4 = new je1(2);
        je1Var4.f38247b = 3;
        arrayList.add(je1Var4);
        je1 je1Var5 = new je1(2);
        je1Var5.f38247b = 4;
        arrayList.add(je1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ne1 ne1Var = this.f39232b;
        ne1Var.K(view, i10, ne1Var.f39568b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        ne1 ne1Var = this.f39232b;
        re1 re1Var = ne1Var.f39585t0;
        if (i10 == 1) {
            return ne1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
            org.telegram.ui.Components.un0 un0Var = new org.telegram.ui.Components.un0(i11, re1Var);
            un0Var.f30981b.j(new le1(0));
            un0Var.setUiCallback(ne1Var);
            return un0Var;
        }
        e10 e10Var = new e10(re1Var);
        e10Var.setChatPreviewDelegate(ne1Var.f39583r0);
        e10Var.setUiCallback(ne1Var);
        e10Var.f36498b.j(new le1(1));
        return e10Var;
    }

    @Override
    public final int e() {
        return this.f39231a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f39231a;
        if (((je1) arrayList.get(i10)).f38246a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((je1) arrayList.get(i10)).f38246a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.o0 o0Var = hg.q0.f12015a3[((je1) arrayList.get(i10)).f38247b];
        String str = o0Var.f12003c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(o0Var.f12002b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f39231a;
        if (((je1) arrayList.get(i10)).f38246a == 0) {
            return 1;
        }
        if (((je1) arrayList.get(i10)).f38246a == 1) {
            return 2;
        }
        return ((je1) arrayList.get(i10)).f38246a + i10;
    }
}
