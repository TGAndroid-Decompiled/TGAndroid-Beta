package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ag1 extends org.telegram.ui.Components.o81 {
    public final ArrayList f32054a;
    public final bg1 f32055b;

    public ag1(bg1 bg1Var) {
        this.f32055b = bg1Var;
        ArrayList arrayList = new ArrayList();
        this.f32054a = arrayList;
        arrayList.add(new xf1(0));
        xf1 xf1Var = new xf1(2);
        xf1Var.f39557b = 0;
        arrayList.add(xf1Var);
        xf1 xf1Var2 = new xf1(2);
        xf1Var2.f39557b = 1;
        arrayList.add(xf1Var2);
        xf1 xf1Var3 = new xf1(2);
        xf1Var3.f39557b = 2;
        arrayList.add(xf1Var3);
        xf1 xf1Var4 = new xf1(2);
        xf1Var4.f39557b = 3;
        arrayList.add(xf1Var4);
        xf1 xf1Var5 = new xf1(2);
        xf1Var5.f39557b = 4;
        arrayList.add(xf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        bg1 bg1Var = this.f32055b;
        bg1Var.L(view, i10, bg1Var.f32442c0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        bg1 bg1Var = this.f32055b;
        fg1 fg1Var = bg1Var.f32459u0;
        if (i10 == 1) {
            return bg1Var.U;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(i11, fg1Var);
            in0Var.f25087b.j(new zf1(0));
            in0Var.setUiCallback(bg1Var);
            return in0Var;
        }
        x10 x10Var = new x10(fg1Var);
        x10Var.setChatPreviewDelegate(bg1Var.f32457s0);
        x10Var.setUiCallback(bg1Var);
        x10Var.f39294b.j(new zf1(1));
        return x10Var;
    }

    @Override
    public final int e() {
        return this.f32054a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f32054a;
        if (((xf1) arrayList.get(i10)).f39556a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((xf1) arrayList.get(i10)).f39556a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.f9915c3[((xf1) arrayList.get(i10)).f39557b];
        String str = q0Var.f9899c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9898b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f32054a;
        if (((xf1) arrayList.get(i10)).f39556a == 0) {
            return 1;
        }
        if (((xf1) arrayList.get(i10)).f39556a == 1) {
            return 2;
        }
        return ((xf1) arrayList.get(i10)).f39556a + i10;
    }
}
