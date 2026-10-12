package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yo0 extends c91 {
    public final ArrayList f31666a = new ArrayList();
    public final org.telegram.ui.iy f31667b;

    public yo0(org.telegram.ui.iy iyVar) {
        this.f31667b = iyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.iy iyVar = this.f31667b;
        iyVar.O(view, i10, iyVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.iy iyVar = this.f31667b;
        org.telegram.ui.yy yyVar = iyVar.J0;
        if (i10 == 1) {
            return iyVar.U;
        }
        if (i10 == 3) {
            return iyVar.f31919f0;
        }
        if (i10 == 4) {
            return iyVar.f31924k0;
        }
        if (i10 == 5) {
            return iyVar.f31930r0;
        }
        if (i10 == 2) {
            yn0 yn0Var = new yn0(iyVar.H0, yyVar);
            iyVar.G0 = yn0Var;
            yn0Var.b(iyVar.U0, iyVar.V0, false);
            iyVar.G0.f31654b.setClipToPadding(false);
            iyVar.G0.f31654b.j(new wo0(this, 0));
            iyVar.G0.f31654b.C0(new yc0(iyVar, 24));
            iyVar.G0.setUiCallback(iyVar);
            return iyVar.G0;
        } else if (i10 == 6) {
            return iyVar.f31928p0;
        } else {
            org.telegram.ui.c20 c20Var = new org.telegram.ui.c20(yyVar);
            c20Var.setChatPreviewDelegate(iyVar.P0);
            c20Var.setUiCallback(iyVar);
            c20Var.j(iyVar.U0, iyVar.V0, false);
            bh.b bVar = iyVar.X0;
            if (bVar != null) {
                c20Var.setBlurredBackgroundDrawableFactory(bVar);
            }
            bi.o0 o0Var = c20Var.f34681b;
            o0Var.setClipToPadding(false);
            o0Var.j(new wo0(this, 1));
            o0Var.C0(new yc0(iyVar, 24));
            return c20Var;
        }
    }

    @Override
    public final int e() {
        return this.f31666a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f31666a;
        if (((xo0) arrayList.get(i10)).f31293a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((xo0) arrayList.get(i10)).f31293a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((xo0) arrayList.get(i10)).f31293a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((xo0) arrayList.get(i10)).f31293a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((xo0) arrayList.get(i10)).f31293a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((xo0) arrayList.get(i10)).f31293a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        hg.p0 p0Var = hg.r0.f10714a3[((xo0) arrayList.get(i10)).f31294b];
        String str = p0Var.f10701c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10700b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f31666a;
        if (((xo0) arrayList.get(i10)).f31293a == 0) {
            return 1;
        }
        if (((xo0) arrayList.get(i10)).f31293a == 1) {
            return 3;
        }
        if (((xo0) arrayList.get(i10)).f31293a == 4) {
            return 4;
        }
        if (((xo0) arrayList.get(i10)).f31293a == 2) {
            return 2;
        }
        if (((xo0) arrayList.get(i10)).f31293a == 5) {
            return 5;
        }
        if (((xo0) arrayList.get(i10)).f31293a == 6) {
            return 6;
        }
        return ((xo0) arrayList.get(i10)).f31293a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f31666a;
        arrayList.clear();
        arrayList.add(new xo0(0));
        org.telegram.ui.iy iyVar = this.f31667b;
        if (iyVar.T0 == 0) {
            if (iyVar.f31929q0) {
                arrayList.add(new xo0(5));
            }
            arrayList.add(new xo0(1));
            arrayList.add(new xo0(4));
            arrayList.add(new xo0(6));
            if (!iyVar.O0) {
                xo0 xo0Var = new xo0(3);
                xo0Var.f31294b = 0;
                arrayList.add(xo0Var);
                org.telegram.ui.sx sxVar = iyVar.f37215b1.F3;
                if (sxVar == null || !sxVar.c()) {
                    arrayList.add(new xo0(2));
                }
                xo0 xo0Var2 = new xo0(3);
                xo0Var2.f31294b = 1;
                arrayList.add(xo0Var2);
                xo0 xo0Var3 = new xo0(3);
                xo0Var3.f31294b = 2;
                arrayList.add(xo0Var3);
                xo0 xo0Var4 = new xo0(3);
                xo0Var4.f31294b = 3;
                arrayList.add(xo0Var4);
                xo0 xo0Var5 = new xo0(3);
                xo0Var5.f31294b = 4;
                arrayList.add(xo0Var5);
            }
        }
    }
}
