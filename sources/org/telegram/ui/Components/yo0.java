package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yo0 extends d91 {
    public final ArrayList f31343a = new ArrayList();
    public final org.telegram.ui.iy f31344b;

    public yo0(org.telegram.ui.iy iyVar) {
        this.f31344b = iyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.iy iyVar = this.f31344b;
        iyVar.O(view, i10, iyVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.iy iyVar = this.f31344b;
        org.telegram.ui.yy yyVar = iyVar.J0;
        if (i10 == 1) {
            return iyVar.U;
        }
        if (i10 == 3) {
            return iyVar.f31622f0;
        }
        if (i10 == 4) {
            return iyVar.f31627k0;
        }
        if (i10 == 5) {
            return iyVar.f31633r0;
        }
        if (i10 == 2) {
            xn0 xn0Var = new xn0(iyVar.H0, yyVar);
            iyVar.G0 = xn0Var;
            xn0Var.b(iyVar.U0, iyVar.V0, false);
            iyVar.G0.f30966b.setClipToPadding(false);
            iyVar.G0.f30966b.j(new wo0(this, 0));
            iyVar.G0.f30966b.C0(new yc0(iyVar, 24));
            iyVar.G0.setUiCallback(iyVar);
            return iyVar.G0;
        } else if (i10 == 6) {
            return iyVar.f31631p0;
        } else {
            org.telegram.ui.b20 b20Var = new org.telegram.ui.b20(yyVar);
            b20Var.setChatPreviewDelegate(iyVar.P0);
            b20Var.setUiCallback(iyVar);
            b20Var.j(iyVar.U0, iyVar.V0, false);
            bh.b bVar = iyVar.X0;
            if (bVar != null) {
                b20Var.setBlurredBackgroundDrawableFactory(bVar);
            }
            bi.o0 o0Var = b20Var.f34163b;
            o0Var.setClipToPadding(false);
            o0Var.j(new wo0(this, 1));
            o0Var.C0(new yc0(iyVar, 24));
            return b20Var;
        }
    }

    @Override
    public final int e() {
        return this.f31343a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f31343a;
        if (((xo0) arrayList.get(i10)).f30979a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((xo0) arrayList.get(i10)).f30979a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((xo0) arrayList.get(i10)).f30979a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((xo0) arrayList.get(i10)).f30979a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((xo0) arrayList.get(i10)).f30979a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((xo0) arrayList.get(i10)).f30979a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        hg.p0 p0Var = hg.r0.f10718a3[((xo0) arrayList.get(i10)).f30980b];
        String str = p0Var.f10705c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10704b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f31343a;
        if (((xo0) arrayList.get(i10)).f30979a == 0) {
            return 1;
        }
        if (((xo0) arrayList.get(i10)).f30979a == 1) {
            return 3;
        }
        if (((xo0) arrayList.get(i10)).f30979a == 4) {
            return 4;
        }
        if (((xo0) arrayList.get(i10)).f30979a == 2) {
            return 2;
        }
        if (((xo0) arrayList.get(i10)).f30979a == 5) {
            return 5;
        }
        if (((xo0) arrayList.get(i10)).f30979a == 6) {
            return 6;
        }
        return ((xo0) arrayList.get(i10)).f30979a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f31343a;
        arrayList.clear();
        arrayList.add(new xo0(0));
        org.telegram.ui.iy iyVar = this.f31344b;
        if (iyVar.T0 == 0) {
            if (iyVar.f31632q0) {
                arrayList.add(new xo0(5));
            }
            arrayList.add(new xo0(1));
            arrayList.add(new xo0(4));
            arrayList.add(new xo0(6));
            if (!iyVar.O0) {
                xo0 xo0Var = new xo0(3);
                xo0Var.f30980b = 0;
                arrayList.add(xo0Var);
                org.telegram.ui.sx sxVar = iyVar.f36888b1.G3;
                if (sxVar == null || !sxVar.c()) {
                    arrayList.add(new xo0(2));
                }
                xo0 xo0Var2 = new xo0(3);
                xo0Var2.f30980b = 1;
                arrayList.add(xo0Var2);
                xo0 xo0Var3 = new xo0(3);
                xo0Var3.f30980b = 2;
                arrayList.add(xo0Var3);
                xo0 xo0Var4 = new xo0(3);
                xo0Var4.f30980b = 3;
                arrayList.add(xo0Var4);
                xo0 xo0Var5 = new xo0(3);
                xo0Var5.f30980b = 4;
                arrayList.add(xo0Var5);
            }
        }
    }
}
