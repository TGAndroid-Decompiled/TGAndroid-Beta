package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ag1 extends org.telegram.ui.Components.f91 {
    public final ArrayList f35927a;
    public final bg1 f35928b;

    public ag1(bg1 bg1Var) {
        this.f35928b = bg1Var;
        ArrayList arrayList = new ArrayList();
        this.f35927a = arrayList;
        arrayList.add(new xf1(0));
        xf1 xf1Var = new xf1(2);
        xf1Var.f44027b = 0;
        arrayList.add(xf1Var);
        xf1 xf1Var2 = new xf1(2);
        xf1Var2.f44027b = 1;
        arrayList.add(xf1Var2);
        xf1 xf1Var3 = new xf1(2);
        xf1Var3.f44027b = 2;
        arrayList.add(xf1Var3);
        xf1 xf1Var4 = new xf1(2);
        xf1Var4.f44027b = 3;
        arrayList.add(xf1Var4);
        xf1 xf1Var5 = new xf1(2);
        xf1Var5.f44027b = 4;
        arrayList.add(xf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        bg1 bg1Var = this.f35928b;
        bg1Var.K(view, i10, bg1Var.f36314b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        bg1 bg1Var = this.f35928b;
        fg1 fg1Var = bg1Var.f36331t0;
        if (i10 == 1) {
            return bg1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            org.telegram.ui.Components.bo0 bo0Var = new org.telegram.ui.Components.bo0(i11, fg1Var);
            bo0Var.f25067b.j(new zf1(0));
            bo0Var.setUiCallback(bg1Var);
            return bo0Var;
        }
        w10 w10Var = new w10(fg1Var);
        w10Var.setChatPreviewDelegate(bg1Var.f36329r0);
        w10Var.setUiCallback(bg1Var);
        w10Var.f43044b.j(new zf1(1));
        return w10Var;
    }

    @Override
    public final int e() {
        return this.f35927a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f35927a;
        if (((xf1) arrayList.get(i10)).f44026a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((xf1) arrayList.get(i10)).f44026a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.p0 p0Var = gg.r0.f10779a3[((xf1) arrayList.get(i10)).f44027b];
        String str = p0Var.f10762c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10761b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f35927a;
        if (((xf1) arrayList.get(i10)).f44026a == 0) {
            return 1;
        }
        if (((xf1) arrayList.get(i10)).f44026a == 1) {
            return 2;
        }
        return ((xf1) arrayList.get(i10)).f44026a + i10;
    }
}
