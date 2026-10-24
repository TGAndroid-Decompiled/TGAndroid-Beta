package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yo0 extends d91 {
    public final ArrayList f33016a = new ArrayList();
    public final org.telegram.ui.nx f33017b;

    public yo0(org.telegram.ui.nx nxVar) {
        this.f33017b = nxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.nx nxVar = this.f33017b;
        nxVar.N(view, i10, nxVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.nx nxVar = this.f33017b;
        org.telegram.ui.ey eyVar = nxVar.J0;
        if (i10 == 1) {
            return nxVar.U;
        }
        if (i10 == 3) {
            return nxVar.f33307f0;
        }
        if (i10 == 4) {
            return nxVar.f33312k0;
        }
        if (i10 == 5) {
            return nxVar.f33318r0;
        }
        if (i10 == 2) {
            wn0 wn0Var = new wn0(nxVar.H0, eyVar);
            nxVar.G0 = wn0Var;
            wn0Var.b(nxVar.U0, nxVar.V0, false);
            nxVar.G0.f32303b.setClipToPadding(false);
            nxVar.G0.f32303b.j(new wo0(this, 0));
            nxVar.G0.f32303b.C0(new wb0(nxVar, 24));
            nxVar.G0.setUiCallback(nxVar);
            return nxVar.G0;
        } else if (i10 == 6) {
            return nxVar.f33316p0;
        } else {
            org.telegram.ui.i10 i10Var = new org.telegram.ui.i10(eyVar);
            i10Var.setChatPreviewDelegate(nxVar.P0);
            i10Var.setUiCallback(nxVar);
            i10Var.j(nxVar.U0, nxVar.V0, false);
            bh.b bVar = nxVar.X0;
            if (bVar != null) {
                i10Var.setBlurredBackgroundDrawableFactory(bVar);
            }
            ai.u1 u1Var = i10Var.f38095b;
            u1Var.setClipToPadding(false);
            u1Var.j(new wo0(this, 1));
            u1Var.C0(new wb0(nxVar, 24));
            return i10Var;
        }
    }

    @Override
    public final int e() {
        return this.f33016a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f33016a;
        if (((xo0) arrayList.get(i10)).f32677a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((xo0) arrayList.get(i10)).f32677a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((xo0) arrayList.get(i10)).f32677a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((xo0) arrayList.get(i10)).f32677a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((xo0) arrayList.get(i10)).f32677a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((xo0) arrayList.get(i10)).f32677a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        hg.o0 o0Var = hg.q0.f12042d3[((xo0) arrayList.get(i10)).f32678b];
        String str = o0Var.f12030c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(o0Var.f12029b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f33016a;
        if (((xo0) arrayList.get(i10)).f32677a == 0) {
            return 1;
        }
        if (((xo0) arrayList.get(i10)).f32677a == 1) {
            return 3;
        }
        if (((xo0) arrayList.get(i10)).f32677a == 4) {
            return 4;
        }
        if (((xo0) arrayList.get(i10)).f32677a == 2) {
            return 2;
        }
        if (((xo0) arrayList.get(i10)).f32677a == 5) {
            return 5;
        }
        if (((xo0) arrayList.get(i10)).f32677a == 6) {
            return 6;
        }
        return ((xo0) arrayList.get(i10)).f32677a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f33016a;
        arrayList.clear();
        arrayList.add(new xo0(0));
        org.telegram.ui.nx nxVar = this.f33017b;
        if (nxVar.T0 == 0) {
            if (nxVar.f33317q0) {
                arrayList.add(new xo0(5));
            }
            arrayList.add(new xo0(1));
            arrayList.add(new xo0(4));
            arrayList.add(new xo0(6));
            if (!nxVar.O0) {
                xo0 xo0Var = new xo0(3);
                xo0Var.f32678b = 0;
                arrayList.add(xo0Var);
                org.telegram.ui.yw ywVar = nxVar.f40006b1.G3;
                if (ywVar == null || !ywVar.c()) {
                    arrayList.add(new xo0(2));
                }
                xo0 xo0Var2 = new xo0(3);
                xo0Var2.f32678b = 1;
                arrayList.add(xo0Var2);
                xo0 xo0Var3 = new xo0(3);
                xo0Var3.f32678b = 2;
                arrayList.add(xo0Var3);
                xo0 xo0Var4 = new xo0(3);
                xo0Var4.f32678b = 3;
                arrayList.add(xo0Var4);
                xo0 xo0Var5 = new xo0(3);
                xo0Var5.f32678b = 4;
                arrayList.add(xo0Var5);
            }
        }
    }
}
