package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cg1 extends org.telegram.ui.Components.l91 {
    public final ArrayList f36427a;
    public final dg1 f36428b;

    public cg1(dg1 dg1Var) {
        this.f36428b = dg1Var;
        ArrayList arrayList = new ArrayList();
        this.f36427a = arrayList;
        arrayList.add(new zf1(0));
        zf1 zf1Var = new zf1(2);
        zf1Var.f44843b = 0;
        arrayList.add(zf1Var);
        zf1 zf1Var2 = new zf1(2);
        zf1Var2.f44843b = 1;
        arrayList.add(zf1Var2);
        zf1 zf1Var3 = new zf1(2);
        zf1Var3.f44843b = 2;
        arrayList.add(zf1Var3);
        zf1 zf1Var4 = new zf1(2);
        zf1Var4.f44843b = 3;
        arrayList.add(zf1Var4);
        zf1 zf1Var5 = new zf1(2);
        zf1Var5.f44843b = 4;
        arrayList.add(zf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        dg1 dg1Var = this.f36428b;
        dg1Var.K(view, i10, dg1Var.f36809b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        dg1 dg1Var = this.f36428b;
        hg1 hg1Var = dg1Var.f36826t0;
        if (i10 == 1) {
            return dg1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.m2) hg1Var).currentAccount;
            org.telegram.ui.Components.ho0 ho0Var = new org.telegram.ui.Components.ho0(i11, hg1Var);
            ho0Var.f26840b.j(new bg1(0));
            ho0Var.setUiCallback(dg1Var);
            return ho0Var;
        }
        y10 y10Var = new y10(hg1Var);
        y10Var.setChatPreviewDelegate(dg1Var.f36824r0);
        y10Var.setUiCallback(dg1Var);
        y10Var.f44248b.j(new bg1(1));
        return y10Var;
    }

    @Override
    public final int e() {
        return this.f36427a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f36427a;
        if (((zf1) arrayList.get(i10)).f44842a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((zf1) arrayList.get(i10)).f44842a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.p0 p0Var = gg.r0.f10777a3[((zf1) arrayList.get(i10)).f44843b];
        String str = p0Var.f10760c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10759b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f36427a;
        if (((zf1) arrayList.get(i10)).f44842a == 0) {
            return 1;
        }
        if (((zf1) arrayList.get(i10)).f44842a == 1) {
            return 2;
        }
        return ((zf1) arrayList.get(i10)).f44842a + i10;
    }
}
