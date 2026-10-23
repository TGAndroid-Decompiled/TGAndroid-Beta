package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zo0 extends d91 {
    public final ArrayList f33313a = new ArrayList();
    public final org.telegram.ui.nx f33314b;

    public zo0(org.telegram.ui.nx nxVar) {
        this.f33314b = nxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.nx nxVar = this.f33314b;
        nxVar.N(view, i10, nxVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.nx nxVar = this.f33314b;
        org.telegram.ui.ey eyVar = nxVar.J0;
        if (i10 == 1) {
            return nxVar.U;
        }
        if (i10 == 3) {
            return nxVar.f24803f0;
        }
        if (i10 == 4) {
            return nxVar.f24808k0;
        }
        if (i10 == 5) {
            return nxVar.f24814r0;
        }
        if (i10 == 2) {
            xn0 xn0Var = new xn0(nxVar.H0, eyVar);
            nxVar.G0 = xn0Var;
            xn0Var.b(nxVar.U0, nxVar.V0, false);
            nxVar.G0.f32607b.setClipToPadding(false);
            nxVar.G0.f32607b.j(new xo0(this, 0));
            nxVar.G0.f32607b.C0(new yb0(nxVar, 24));
            nxVar.G0.setUiCallback(nxVar);
            return nxVar.G0;
        } else if (i10 == 6) {
            return nxVar.f24812p0;
        } else {
            org.telegram.ui.i10 i10Var = new org.telegram.ui.i10(eyVar);
            i10Var.setChatPreviewDelegate(nxVar.P0);
            i10Var.setUiCallback(nxVar);
            i10Var.j(nxVar.U0, nxVar.V0, false);
            bh.b bVar = nxVar.X0;
            if (bVar != null) {
                i10Var.setBlurredBackgroundDrawableFactory(bVar);
            }
            ai.u1 u1Var = i10Var.f38012b;
            u1Var.setClipToPadding(false);
            u1Var.j(new xo0(this, 1));
            u1Var.C0(new yb0(nxVar, 24));
            return i10Var;
        }
    }

    @Override
    public final int e() {
        return this.f33313a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f33313a;
        if (((yo0) arrayList.get(i10)).f33007a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((yo0) arrayList.get(i10)).f33007a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((yo0) arrayList.get(i10)).f33007a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((yo0) arrayList.get(i10)).f33007a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((yo0) arrayList.get(i10)).f33007a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((yo0) arrayList.get(i10)).f33007a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        hg.o0 o0Var = hg.q0.f12042d3[((yo0) arrayList.get(i10)).f33008b];
        String str = o0Var.f12030c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(o0Var.f12029b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f33313a;
        if (((yo0) arrayList.get(i10)).f33007a == 0) {
            return 1;
        }
        if (((yo0) arrayList.get(i10)).f33007a == 1) {
            return 3;
        }
        if (((yo0) arrayList.get(i10)).f33007a == 4) {
            return 4;
        }
        if (((yo0) arrayList.get(i10)).f33007a == 2) {
            return 2;
        }
        if (((yo0) arrayList.get(i10)).f33007a == 5) {
            return 5;
        }
        if (((yo0) arrayList.get(i10)).f33007a == 6) {
            return 6;
        }
        return ((yo0) arrayList.get(i10)).f33007a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f33313a;
        arrayList.clear();
        arrayList.add(new yo0(0));
        org.telegram.ui.nx nxVar = this.f33314b;
        if (nxVar.T0 == 0) {
            if (nxVar.f24813q0) {
                arrayList.add(new yo0(5));
            }
            arrayList.add(new yo0(1));
            arrayList.add(new yo0(4));
            arrayList.add(new yo0(6));
            if (!nxVar.O0) {
                yo0 yo0Var = new yo0(3);
                yo0Var.f33008b = 0;
                arrayList.add(yo0Var);
                org.telegram.ui.yw ywVar = nxVar.f40002b1.G3;
                if (ywVar == null || !ywVar.c()) {
                    arrayList.add(new yo0(2));
                }
                yo0 yo0Var2 = new yo0(3);
                yo0Var2.f33008b = 1;
                arrayList.add(yo0Var2);
                yo0 yo0Var3 = new yo0(3);
                yo0Var3.f33008b = 2;
                arrayList.add(yo0Var3);
                yo0 yo0Var4 = new yo0(3);
                yo0Var4.f33008b = 3;
                arrayList.add(yo0Var4);
                yo0 yo0Var5 = new yo0(3);
                yo0Var5.f33008b = 4;
                arrayList.add(yo0Var5);
            }
        }
    }
}
