package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ko0 extends n81 {
    public final ArrayList f25847a = new ArrayList();
    public final org.telegram.ui.zx f25848b;

    public ko0(org.telegram.ui.zx zxVar) {
        this.f25848b = zxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.zx zxVar = this.f25848b;
        zxVar.O(view, i10, zxVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.zx zxVar = this.f25848b;
        org.telegram.ui.qy qyVar = zxVar.J0;
        if (i10 == 1) {
            return zxVar.U;
        }
        if (i10 == 3) {
            return zxVar.f26156f0;
        }
        if (i10 == 4) {
            return zxVar.f26161k0;
        }
        if (i10 == 5) {
            return zxVar.f26167r0;
        }
        if (i10 == 2) {
            in0 in0Var = new in0(zxVar.H0, qyVar);
            zxVar.G0 = in0Var;
            in0Var.b(zxVar.U0, zxVar.V0, false);
            zxVar.G0.f25121b.setClipToPadding(false);
            zxVar.G0.f25121b.j(new io0(this, 0));
            zxVar.G0.f25121b.C0(new ic0(zxVar, 24));
            zxVar.G0.setUiCallback(zxVar);
            return zxVar.G0;
        } else if (i10 == 6) {
            return zxVar.f26165p0;
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
            w0Var.j(new io0(this, 1));
            w0Var.C0(new ic0(zxVar, 24));
            return t10Var;
        }
    }

    @Override
    public final int e() {
        return this.f25847a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f25847a;
        if (((jo0) arrayList.get(i10)).f25459a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((jo0) arrayList.get(i10)).f25459a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((jo0) arrayList.get(i10)).f25459a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((jo0) arrayList.get(i10)).f25459a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((jo0) arrayList.get(i10)).f25459a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((jo0) arrayList.get(i10)).f25459a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.f9896c3[((jo0) arrayList.get(i10)).f25460b];
        String str = q0Var.f9880c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9879b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f25847a;
        if (((jo0) arrayList.get(i10)).f25459a == 0) {
            return 1;
        }
        if (((jo0) arrayList.get(i10)).f25459a == 1) {
            return 3;
        }
        if (((jo0) arrayList.get(i10)).f25459a == 4) {
            return 4;
        }
        if (((jo0) arrayList.get(i10)).f25459a == 2) {
            return 2;
        }
        if (((jo0) arrayList.get(i10)).f25459a == 5) {
            return 5;
        }
        if (((jo0) arrayList.get(i10)).f25459a == 6) {
            return 6;
        }
        return ((jo0) arrayList.get(i10)).f25459a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f25847a;
        arrayList.clear();
        arrayList.add(new jo0(0));
        org.telegram.ui.zx zxVar = this.f25848b;
        if (zxVar.T0 == 0) {
            if (zxVar.f26166q0) {
                arrayList.add(new jo0(5));
            }
            arrayList.add(new jo0(1));
            arrayList.add(new jo0(4));
            arrayList.add(new jo0(6));
            if (!zxVar.O0) {
                jo0 jo0Var = new jo0(3);
                jo0Var.f25460b = 0;
                arrayList.add(jo0Var);
                org.telegram.ui.kx kxVar = zxVar.f40591b1.F3;
                if (kxVar == null || !kxVar.c()) {
                    arrayList.add(new jo0(2));
                }
                jo0 jo0Var2 = new jo0(3);
                jo0Var2.f25460b = 1;
                arrayList.add(jo0Var2);
                jo0 jo0Var3 = new jo0(3);
                jo0Var3.f25460b = 2;
                arrayList.add(jo0Var3);
                jo0 jo0Var4 = new jo0(3);
                jo0Var4.f25460b = 3;
                arrayList.add(jo0Var4);
                jo0 jo0Var5 = new jo0(3);
                jo0Var5.f25460b = 4;
                arrayList.add(jo0Var5);
            }
        }
    }
}
