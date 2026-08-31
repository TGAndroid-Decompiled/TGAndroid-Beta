package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hf1 extends org.telegram.ui.Components.e81 {
    public final ArrayList f37487a;
    public final if1 f37488b;

    public hf1(if1 if1Var) {
        this.f37488b = if1Var;
        ArrayList arrayList = new ArrayList();
        this.f37487a = arrayList;
        arrayList.add(new ef1(0));
        ef1 ef1Var = new ef1(2);
        ef1Var.f36585b = 0;
        arrayList.add(ef1Var);
        ef1 ef1Var2 = new ef1(2);
        ef1Var2.f36585b = 1;
        arrayList.add(ef1Var2);
        ef1 ef1Var3 = new ef1(2);
        ef1Var3.f36585b = 2;
        arrayList.add(ef1Var3);
        ef1 ef1Var4 = new ef1(2);
        ef1Var4.f36585b = 3;
        arrayList.add(ef1Var4);
        ef1 ef1Var5 = new ef1(2);
        ef1Var5.f36585b = 4;
        arrayList.add(ef1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        if1 if1Var = this.f37488b;
        if1Var.K(view, i10, if1Var.V, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        if1 if1Var = this.f37488b;
        mf1 mf1Var = if1Var.f37849q0;
        if (i10 == 1) {
            return if1Var.Q;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
            org.telegram.ui.Components.en0 en0Var = new org.telegram.ui.Components.en0(i11, mf1Var);
            en0Var.f26584b.j(new gf1(0));
            en0Var.setUiCallback(if1Var);
            return en0Var;
        }
        t10 t10Var = new t10(mf1Var);
        t10Var.setChatPreviewDelegate(if1Var.f37847o0);
        t10Var.setUiCallback(if1Var);
        t10Var.f41427b.j(new gf1(1));
        return t10Var;
    }

    @Override
    public final int e() {
        return this.f37487a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f37487a;
        if (((ef1) arrayList.get(i10)).f36584a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((ef1) arrayList.get(i10)).f36584a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        uf.e0 e0Var = uf.g0.Z2[((ef1) arrayList.get(i10)).f36585b];
        String str = e0Var.f48548c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(e0Var.f48547b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f37487a;
        if (((ef1) arrayList.get(i10)).f36584a == 0) {
            return 1;
        }
        if (((ef1) arrayList.get(i10)).f36584a == 1) {
            return 2;
        }
        return ((ef1) arrayList.get(i10)).f36584a + i10;
    }
}
