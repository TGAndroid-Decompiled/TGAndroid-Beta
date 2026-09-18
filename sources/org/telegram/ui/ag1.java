package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ag1 extends org.telegram.ui.Components.b81 {
    public final ArrayList f31858a;
    public final bg1 f31859b;

    public ag1(bg1 bg1Var) {
        this.f31859b = bg1Var;
        ArrayList arrayList = new ArrayList();
        this.f31858a = arrayList;
        arrayList.add(new xf1(0));
        xf1 xf1Var = new xf1(2);
        xf1Var.f39616b = 0;
        arrayList.add(xf1Var);
        xf1 xf1Var2 = new xf1(2);
        xf1Var2.f39616b = 1;
        arrayList.add(xf1Var2);
        xf1 xf1Var3 = new xf1(2);
        xf1Var3.f39616b = 2;
        arrayList.add(xf1Var3);
        xf1 xf1Var4 = new xf1(2);
        xf1Var4.f39616b = 3;
        arrayList.add(xf1Var4);
        xf1 xf1Var5 = new xf1(2);
        xf1Var5.f39616b = 4;
        arrayList.add(xf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        bg1 bg1Var = this.f31859b;
        bg1Var.L(view, i10, bg1Var.f32163c0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        bg1 bg1Var = this.f31859b;
        fg1 fg1Var = bg1Var.f32180u0;
        if (i10 == 1) {
            return bg1Var.U;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.o2) fg1Var).currentAccount;
            org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(i11, fg1Var);
            wm0Var.f29698b.j(new zf1(0));
            wm0Var.setUiCallback(bg1Var);
            return wm0Var;
        }
        z10 z10Var = new z10(fg1Var);
        z10Var.setChatPreviewDelegate(bg1Var.f32178s0);
        z10Var.setUiCallback(bg1Var);
        z10Var.f40076b.j(new zf1(1));
        return z10Var;
    }

    @Override
    public final int e() {
        return this.f31858a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f31858a;
        if (((xf1) arrayList.get(i10)).f39615a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((xf1) arrayList.get(i10)).f39615a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.f9915c3[((xf1) arrayList.get(i10)).f39616b];
        String str = q0Var.f9899c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9898b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f31858a;
        if (((xf1) arrayList.get(i10)).f39615a == 0) {
            return 1;
        }
        if (((xf1) arrayList.get(i10)).f39615a == 1) {
            return 2;
        }
        return ((xf1) arrayList.get(i10)).f39615a + i10;
    }
}
