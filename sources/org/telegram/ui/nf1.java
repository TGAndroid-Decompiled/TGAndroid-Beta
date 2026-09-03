package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nf1 extends org.telegram.ui.Components.c81 {
    public final ArrayList f36506a;
    public final of1 f36507b;

    public nf1(of1 of1Var) {
        this.f36507b = of1Var;
        ArrayList arrayList = new ArrayList();
        this.f36506a = arrayList;
        arrayList.add(new kf1(0));
        kf1 kf1Var = new kf1(2);
        kf1Var.f35531b = 0;
        arrayList.add(kf1Var);
        kf1 kf1Var2 = new kf1(2);
        kf1Var2.f35531b = 1;
        arrayList.add(kf1Var2);
        kf1 kf1Var3 = new kf1(2);
        kf1Var3.f35531b = 2;
        arrayList.add(kf1Var3);
        kf1 kf1Var4 = new kf1(2);
        kf1Var4.f35531b = 3;
        arrayList.add(kf1Var4);
        kf1 kf1Var5 = new kf1(2);
        kf1Var5.f35531b = 4;
        arrayList.add(kf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        of1 of1Var = this.f36507b;
        of1Var.K(view, i10, of1Var.V, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        of1 of1Var = this.f36507b;
        sf1 sf1Var = of1Var.f36792q0;
        if (i10 == 1) {
            return of1Var.Q;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            org.telegram.ui.Components.cn0 cn0Var = new org.telegram.ui.Components.cn0(i11, sf1Var);
            cn0Var.f23974b.j(new mf1(0));
            cn0Var.setUiCallback(of1Var);
            return cn0Var;
        }
        u10 u10Var = new u10(sf1Var);
        u10Var.setChatPreviewDelegate(of1Var.f36790o0);
        u10Var.setUiCallback(of1Var);
        u10Var.f38640b.j(new mf1(1));
        return u10Var;
    }

    @Override
    public final int e() {
        return this.f36506a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f36506a;
        if (((kf1) arrayList.get(i10)).f35530a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((kf1) arrayList.get(i10)).f35530a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        tf.e0 e0Var = tf.g0.Z2[((kf1) arrayList.get(i10)).f35531b];
        String str = e0Var.f44767c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(e0Var.f44766b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f36506a;
        if (((kf1) arrayList.get(i10)).f35530a == 0) {
            return 1;
        }
        if (((kf1) arrayList.get(i10)).f35530a == 1) {
            return 2;
        }
        return ((kf1) arrayList.get(i10)).f35530a + i10;
    }
}
