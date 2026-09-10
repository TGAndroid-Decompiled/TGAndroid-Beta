package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class go0 extends n81 {
    public final ArrayList f23394a = new ArrayList();
    public final org.telegram.ui.gy f23395b;

    public go0(org.telegram.ui.gy gyVar) {
        this.f23395b = gyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.gy gyVar = this.f23395b;
        gyVar.O(view, i10, gyVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.gy gyVar = this.f23395b;
        org.telegram.ui.wy wyVar = gyVar.J0;
        if (i10 == 1) {
            return gyVar.U;
        }
        if (i10 == 3) {
            return gyVar.f23717f0;
        }
        if (i10 == 4) {
            return gyVar.f23722k0;
        }
        if (i10 == 5) {
            return gyVar.f23728r0;
        }
        if (i10 == 2) {
            fn0 fn0Var = new fn0(gyVar.H0, wyVar);
            gyVar.G0 = fn0Var;
            fn0Var.b(gyVar.U0, gyVar.V0, false);
            gyVar.G0.f23040b.setClipToPadding(false);
            gyVar.G0.f23040b.j(new eo0(this, 0));
            gyVar.G0.f23040b.C0(new kc0(gyVar, 23));
            gyVar.G0.setUiCallback(gyVar);
            return gyVar.G0;
        } else if (i10 == 6) {
            return gyVar.f23726p0;
        } else {
            org.telegram.ui.z10 z10Var = new org.telegram.ui.z10(wyVar);
            z10Var.setChatPreviewDelegate(gyVar.P0);
            z10Var.setUiCallback(gyVar);
            z10Var.j(gyVar.U0, gyVar.V0, false);
            zg.a aVar = gyVar.W0;
            if (aVar != null) {
                z10Var.setBlurredBackgroundDrawableFactory(aVar);
            }
            bi.y1 y1Var = z10Var.f39162b;
            y1Var.setClipToPadding(false);
            y1Var.j(new eo0(this, 1));
            y1Var.C0(new kc0(gyVar, 23));
            return z10Var;
        }
    }

    @Override
    public final int e() {
        return this.f23394a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f23394a;
        if (((fo0) arrayList.get(i10)).f23049a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((fo0) arrayList.get(i10)).f23049a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((fo0) arrayList.get(i10)).f23049a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((fo0) arrayList.get(i10)).f23049a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((fo0) arrayList.get(i10)).f23049a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((fo0) arrayList.get(i10)).f23049a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        fg.q0 q0Var = fg.s0.f8199c3[((fo0) arrayList.get(i10)).f23050b];
        String str = q0Var.f8182c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f8181b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f23394a;
        if (((fo0) arrayList.get(i10)).f23049a == 0) {
            return 1;
        }
        if (((fo0) arrayList.get(i10)).f23049a == 1) {
            return 3;
        }
        if (((fo0) arrayList.get(i10)).f23049a == 4) {
            return 4;
        }
        if (((fo0) arrayList.get(i10)).f23049a == 2) {
            return 2;
        }
        if (((fo0) arrayList.get(i10)).f23049a == 5) {
            return 5;
        }
        if (((fo0) arrayList.get(i10)).f23049a == 6) {
            return 6;
        }
        return ((fo0) arrayList.get(i10)).f23049a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f23394a;
        arrayList.clear();
        arrayList.add(new fo0(0));
        org.telegram.ui.gy gyVar = this.f23395b;
        if (gyVar.T0 == 0) {
            if (gyVar.f23727q0) {
                arrayList.add(new fo0(5));
            }
            arrayList.add(new fo0(1));
            arrayList.add(new fo0(4));
            arrayList.add(new fo0(6));
            if (!gyVar.O0) {
                fo0 fo0Var = new fo0(3);
                fo0Var.f23050b = 0;
                arrayList.add(fo0Var);
                org.telegram.ui.qx qxVar = gyVar.f33212a1.F3;
                if (qxVar == null || !qxVar.c()) {
                    arrayList.add(new fo0(2));
                }
                fo0 fo0Var2 = new fo0(3);
                fo0Var2.f23050b = 1;
                arrayList.add(fo0Var2);
                fo0 fo0Var3 = new fo0(3);
                fo0Var3.f23050b = 2;
                arrayList.add(fo0Var3);
                fo0 fo0Var4 = new fo0(3);
                fo0Var4.f23050b = 3;
                arrayList.add(fo0Var4);
                fo0 fo0Var5 = new fo0(3);
                fo0Var5.f23050b = 4;
                arrayList.add(fo0Var5);
            }
        }
    }
}
