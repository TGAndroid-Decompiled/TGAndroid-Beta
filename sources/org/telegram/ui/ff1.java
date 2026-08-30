package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ff1 extends org.telegram.ui.Components.c81 {
    public final ArrayList f34246a;
    public final gf1 f34247b;

    public ff1(gf1 gf1Var) {
        this.f34247b = gf1Var;
        ArrayList arrayList = new ArrayList();
        this.f34246a = arrayList;
        arrayList.add(new cf1(0));
        cf1 cf1Var = new cf1(2);
        cf1Var.f33364b = 0;
        arrayList.add(cf1Var);
        cf1 cf1Var2 = new cf1(2);
        cf1Var2.f33364b = 1;
        arrayList.add(cf1Var2);
        cf1 cf1Var3 = new cf1(2);
        cf1Var3.f33364b = 2;
        arrayList.add(cf1Var3);
        cf1 cf1Var4 = new cf1(2);
        cf1Var4.f33364b = 3;
        arrayList.add(cf1Var4);
        cf1 cf1Var5 = new cf1(2);
        cf1Var5.f33364b = 4;
        arrayList.add(cf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        gf1 gf1Var = this.f34247b;
        gf1Var.K(view, i10, gf1Var.V, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        gf1 gf1Var = this.f34247b;
        kf1 kf1Var = gf1Var.f34610q0;
        if (i10 == 1) {
            return gf1Var.Q;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
            org.telegram.ui.Components.dn0 dn0Var = new org.telegram.ui.Components.dn0(i11, kf1Var);
            dn0Var.f24308b.j(new ef1(0));
            dn0Var.setUiCallback(gf1Var);
            return dn0Var;
        }
        t10 t10Var = new t10(kf1Var);
        t10Var.setChatPreviewDelegate(gf1Var.f34608o0);
        t10Var.setUiCallback(gf1Var);
        t10Var.f38474b.j(new ef1(1));
        return t10Var;
    }

    @Override
    public final int e() {
        return this.f34246a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f34246a;
        if (((cf1) arrayList.get(i10)).f33363a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((cf1) arrayList.get(i10)).f33363a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        tf.e0 e0Var = tf.g0.Z2[((cf1) arrayList.get(i10)).f33364b];
        String str = e0Var.f44705c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(e0Var.f44704b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f34246a;
        if (((cf1) arrayList.get(i10)).f33363a == 0) {
            return 1;
        }
        if (((cf1) arrayList.get(i10)).f33363a == 1) {
            return 2;
        }
        return ((cf1) arrayList.get(i10)).f33363a + i10;
    }
}
