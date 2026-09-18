package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yn0 extends b81 {
    public final ArrayList f30294a = new ArrayList();
    public final org.telegram.ui.gy f30295b;

    public yn0(org.telegram.ui.gy gyVar) {
        this.f30295b = gyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.gy gyVar = this.f30295b;
        gyVar.P(view, i10, gyVar.L0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.gy gyVar = this.f30295b;
        org.telegram.ui.wy wyVar = gyVar.K0;
        if (i10 == 1) {
            return gyVar.V;
        }
        if (i10 == 3) {
            return gyVar.f30555g0;
        }
        if (i10 == 4) {
            return gyVar.f30560l0;
        }
        if (i10 == 5) {
            return gyVar.f30566s0;
        }
        if (i10 == 2) {
            wm0 wm0Var = new wm0(gyVar.I0, wyVar);
            gyVar.H0 = wm0Var;
            wm0Var.b(gyVar.V0, gyVar.W0, false);
            gyVar.H0.f29698b.setClipToPadding(false);
            gyVar.H0.f29698b.j(new wn0(this, 0));
            gyVar.H0.f29698b.D0(new bc0(gyVar, 23));
            gyVar.H0.setUiCallback(gyVar);
            return gyVar.H0;
        } else if (i10 == 6) {
            return gyVar.f30564q0;
        } else {
            org.telegram.ui.z10 z10Var = new org.telegram.ui.z10(wyVar);
            z10Var.setChatPreviewDelegate(gyVar.Q0);
            z10Var.setUiCallback(gyVar);
            z10Var.j(gyVar.V0, gyVar.W0, false);
            ah.c cVar = gyVar.Y0;
            if (cVar != null) {
                z10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = z10Var.f40076b;
            w0Var.setClipToPadding(false);
            w0Var.j(new wn0(this, 1));
            w0Var.D0(new bc0(gyVar, 23));
            return z10Var;
        }
    }

    @Override
    public final int e() {
        return this.f30294a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f30294a;
        if (((xn0) arrayList.get(i10)).f29953a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((xn0) arrayList.get(i10)).f29953a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((xn0) arrayList.get(i10)).f29953a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((xn0) arrayList.get(i10)).f29953a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((xn0) arrayList.get(i10)).f29953a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((xn0) arrayList.get(i10)).f29953a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.f9915c3[((xn0) arrayList.get(i10)).f29954b];
        String str = q0Var.f9899c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9898b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f30294a;
        if (((xn0) arrayList.get(i10)).f29953a == 0) {
            return 1;
        }
        if (((xn0) arrayList.get(i10)).f29953a == 1) {
            return 3;
        }
        if (((xn0) arrayList.get(i10)).f29953a == 4) {
            return 4;
        }
        if (((xn0) arrayList.get(i10)).f29953a == 2) {
            return 2;
        }
        if (((xn0) arrayList.get(i10)).f29953a == 5) {
            return 5;
        }
        if (((xn0) arrayList.get(i10)).f29953a == 6) {
            return 6;
        }
        return ((xn0) arrayList.get(i10)).f29953a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f30294a;
        arrayList.clear();
        arrayList.add(new xn0(0));
        org.telegram.ui.gy gyVar = this.f30295b;
        if (gyVar.U0 == 0) {
            if (gyVar.f30565r0) {
                arrayList.add(new xn0(5));
            }
            arrayList.add(new xn0(1));
            arrayList.add(new xn0(4));
            arrayList.add(new xn0(6));
            if (!gyVar.P0) {
                xn0 xn0Var = new xn0(3);
                xn0Var.f29954b = 0;
                arrayList.add(xn0Var);
                org.telegram.ui.qx qxVar = gyVar.f34068c1.F3;
                if (qxVar == null || !qxVar.c()) {
                    arrayList.add(new xn0(2));
                }
                xn0 xn0Var2 = new xn0(3);
                xn0Var2.f29954b = 1;
                arrayList.add(xn0Var2);
                xn0 xn0Var3 = new xn0(3);
                xn0Var3.f29954b = 2;
                arrayList.add(xn0Var3);
                xn0 xn0Var4 = new xn0(3);
                xn0Var4.f29954b = 3;
                arrayList.add(xn0Var4);
                xn0 xn0Var5 = new xn0(3);
                xn0Var5.f29954b = 4;
                arrayList.add(xn0Var5);
            }
        }
    }
}
