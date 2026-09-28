package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mo0 extends p81 {
    public final ArrayList f26475a = new ArrayList();
    public final org.telegram.ui.zx f26476b;

    public mo0(org.telegram.ui.zx zxVar) {
        this.f26476b = zxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.zx zxVar = this.f26476b;
        zxVar.O(view, i10, zxVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.zx zxVar = this.f26476b;
        org.telegram.ui.qy qyVar = zxVar.J0;
        if (i10 == 1) {
            return zxVar.U;
        }
        if (i10 == 3) {
            return zxVar.f26824f0;
        }
        if (i10 == 4) {
            return zxVar.f26829k0;
        }
        if (i10 == 5) {
            return zxVar.f26835r0;
        }
        if (i10 == 2) {
            kn0 kn0Var = new kn0(zxVar.H0, qyVar);
            zxVar.G0 = kn0Var;
            kn0Var.b(zxVar.U0, zxVar.V0, false);
            zxVar.G0.f25769b.setClipToPadding(false);
            zxVar.G0.f25769b.j(new ko0(this, 0));
            zxVar.G0.f25769b.C0(new kc0(zxVar, 24));
            zxVar.G0.setUiCallback(zxVar);
            return zxVar.G0;
        } else if (i10 == 6) {
            return zxVar.f26833p0;
        } else {
            org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(qyVar);
            t10Var.setChatPreviewDelegate(zxVar.P0);
            t10Var.setUiCallback(zxVar);
            t10Var.j(zxVar.U0, zxVar.V0, false);
            ah.c cVar = zxVar.X0;
            if (cVar != null) {
                t10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = t10Var.f37922b;
            w0Var.setClipToPadding(false);
            w0Var.j(new ko0(this, 1));
            w0Var.C0(new kc0(zxVar, 24));
            return t10Var;
        }
    }

    @Override
    public final int e() {
        return this.f26475a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f26475a;
        if (((lo0) arrayList.get(i10)).f26055a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((lo0) arrayList.get(i10)).f26055a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((lo0) arrayList.get(i10)).f26055a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((lo0) arrayList.get(i10)).f26055a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((lo0) arrayList.get(i10)).f26055a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((lo0) arrayList.get(i10)).f26055a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.f9896c3[((lo0) arrayList.get(i10)).f26056b];
        String str = q0Var.f9880c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9879b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f26475a;
        if (((lo0) arrayList.get(i10)).f26055a == 0) {
            return 1;
        }
        if (((lo0) arrayList.get(i10)).f26055a == 1) {
            return 3;
        }
        if (((lo0) arrayList.get(i10)).f26055a == 4) {
            return 4;
        }
        if (((lo0) arrayList.get(i10)).f26055a == 2) {
            return 2;
        }
        if (((lo0) arrayList.get(i10)).f26055a == 5) {
            return 5;
        }
        if (((lo0) arrayList.get(i10)).f26055a == 6) {
            return 6;
        }
        return ((lo0) arrayList.get(i10)).f26055a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f26475a;
        arrayList.clear();
        arrayList.add(new lo0(0));
        org.telegram.ui.zx zxVar = this.f26476b;
        if (zxVar.T0 == 0) {
            if (zxVar.f26834q0) {
                arrayList.add(new lo0(5));
            }
            arrayList.add(new lo0(1));
            arrayList.add(new lo0(4));
            arrayList.add(new lo0(6));
            if (!zxVar.O0) {
                lo0 lo0Var = new lo0(3);
                lo0Var.f26056b = 0;
                arrayList.add(lo0Var);
                org.telegram.ui.kx kxVar = zxVar.f40591b1.F3;
                if (kxVar == null || !kxVar.c()) {
                    arrayList.add(new lo0(2));
                }
                lo0 lo0Var2 = new lo0(3);
                lo0Var2.f26056b = 1;
                arrayList.add(lo0Var2);
                lo0 lo0Var3 = new lo0(3);
                lo0Var3.f26056b = 2;
                arrayList.add(lo0Var3);
                lo0 lo0Var4 = new lo0(3);
                lo0Var4.f26056b = 3;
                arrayList.add(lo0Var4);
                lo0 lo0Var5 = new lo0(3);
                lo0Var5.f26056b = 4;
                arrayList.add(lo0Var5);
            }
        }
    }
}
