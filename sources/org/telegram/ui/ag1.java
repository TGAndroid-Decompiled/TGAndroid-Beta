package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ag1 extends org.telegram.ui.Components.q81 {
    public final ArrayList f32075a;
    public final bg1 f32076b;

    public ag1(bg1 bg1Var) {
        this.f32076b = bg1Var;
        ArrayList arrayList = new ArrayList();
        this.f32075a = arrayList;
        arrayList.add(new xf1(0));
        xf1 xf1Var = new xf1(2);
        xf1Var.f39581b = 0;
        arrayList.add(xf1Var);
        xf1 xf1Var2 = new xf1(2);
        xf1Var2.f39581b = 1;
        arrayList.add(xf1Var2);
        xf1 xf1Var3 = new xf1(2);
        xf1Var3.f39581b = 2;
        arrayList.add(xf1Var3);
        xf1 xf1Var4 = new xf1(2);
        xf1Var4.f39581b = 3;
        arrayList.add(xf1Var4);
        xf1 xf1Var5 = new xf1(2);
        xf1Var5.f39581b = 4;
        arrayList.add(xf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        bg1 bg1Var = this.f32076b;
        bg1Var.L(view, i10, bg1Var.f32460c0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        bg1 bg1Var = this.f32076b;
        fg1 fg1Var = bg1Var.f32477u0;
        if (i10 == 1) {
            return bg1Var.U;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            org.telegram.ui.Components.kn0 kn0Var = new org.telegram.ui.Components.kn0(i11, fg1Var);
            kn0Var.f25766b.j(new zf1(0));
            kn0Var.setUiCallback(bg1Var);
            return kn0Var;
        }
        x10 x10Var = new x10(fg1Var);
        x10Var.setChatPreviewDelegate(bg1Var.f32475s0);
        x10Var.setUiCallback(bg1Var);
        x10Var.f39318b.j(new zf1(1));
        return x10Var;
    }

    @Override
    public final int e() {
        return this.f32075a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f32075a;
        if (((xf1) arrayList.get(i10)).f39580a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((xf1) arrayList.get(i10)).f39580a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.f9915c3[((xf1) arrayList.get(i10)).f39581b];
        String str = q0Var.f9899c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9898b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f32075a;
        if (((xf1) arrayList.get(i10)).f39580a == 0) {
            return 1;
        }
        if (((xf1) arrayList.get(i10)).f39580a == 1) {
            return 2;
        }
        return ((xf1) arrayList.get(i10)).f39580a + i10;
    }
}
