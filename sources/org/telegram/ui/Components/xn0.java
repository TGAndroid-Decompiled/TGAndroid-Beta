package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xn0 extends z71 {
    public final ArrayList f30026a = new ArrayList();
    public final org.telegram.ui.ay f30027b;

    public xn0(org.telegram.ui.ay ayVar) {
        this.f30027b = ayVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ay ayVar = this.f30027b;
        ayVar.O(view, i10, ayVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.ay ayVar = this.f30027b;
        org.telegram.ui.ry ryVar = ayVar.J0;
        if (i10 == 1) {
            return ayVar.U;
        }
        if (i10 == 3) {
            return ayVar.f30339f0;
        }
        if (i10 == 4) {
            return ayVar.f30344k0;
        }
        if (i10 == 5) {
            return ayVar.f30350r0;
        }
        if (i10 == 2) {
            wm0 wm0Var = new wm0(ayVar.H0, ryVar);
            ayVar.G0 = wm0Var;
            wm0Var.b(ayVar.U0, ayVar.V0, false);
            ayVar.G0.f29748b.setClipToPadding(false);
            ayVar.G0.f29748b.j(new vn0(this, 0));
            ayVar.G0.f29748b.C0(new ac0(ayVar, 23));
            ayVar.G0.setUiCallback(ayVar);
            return ayVar.G0;
        } else if (i10 == 6) {
            return ayVar.f30348p0;
        } else {
            org.telegram.ui.u10 u10Var = new org.telegram.ui.u10(ryVar);
            u10Var.setChatPreviewDelegate(ayVar.P0);
            u10Var.setUiCallback(ayVar);
            u10Var.j(ayVar.U0, ayVar.V0, false);
            ah.c cVar = ayVar.X0;
            if (cVar != null) {
                u10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = u10Var.f37846b;
            w0Var.setClipToPadding(false);
            w0Var.j(new vn0(this, 1));
            w0Var.C0(new ac0(ayVar, 23));
            return u10Var;
        }
    }

    @Override
    public final int e() {
        return this.f30026a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f30026a;
        if (((wn0) arrayList.get(i10)).f29761a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((wn0) arrayList.get(i10)).f29761a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((wn0) arrayList.get(i10)).f29761a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((wn0) arrayList.get(i10)).f29761a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((wn0) arrayList.get(i10)).f29761a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((wn0) arrayList.get(i10)).f29761a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.f9897c3[((wn0) arrayList.get(i10)).f29762b];
        String str = q0Var.f9881c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9880b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f30026a;
        if (((wn0) arrayList.get(i10)).f29761a == 0) {
            return 1;
        }
        if (((wn0) arrayList.get(i10)).f29761a == 1) {
            return 3;
        }
        if (((wn0) arrayList.get(i10)).f29761a == 4) {
            return 4;
        }
        if (((wn0) arrayList.get(i10)).f29761a == 2) {
            return 2;
        }
        if (((wn0) arrayList.get(i10)).f29761a == 5) {
            return 5;
        }
        if (((wn0) arrayList.get(i10)).f29761a == 6) {
            return 6;
        }
        return ((wn0) arrayList.get(i10)).f29761a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f30026a;
        arrayList.clear();
        arrayList.add(new wn0(0));
        org.telegram.ui.ay ayVar = this.f30027b;
        if (ayVar.T0 == 0) {
            if (ayVar.f30349q0) {
                arrayList.add(new wn0(5));
            }
            arrayList.add(new wn0(1));
            arrayList.add(new wn0(4));
            arrayList.add(new wn0(6));
            if (!ayVar.O0) {
                wn0 wn0Var = new wn0(3);
                wn0Var.f29762b = 0;
                arrayList.add(wn0Var);
                org.telegram.ui.lx lxVar = ayVar.f31897b1.F3;
                if (lxVar == null || !lxVar.c()) {
                    arrayList.add(new wn0(2));
                }
                wn0 wn0Var2 = new wn0(3);
                wn0Var2.f29762b = 1;
                arrayList.add(wn0Var2);
                wn0 wn0Var3 = new wn0(3);
                wn0Var3.f29762b = 2;
                arrayList.add(wn0Var3);
                wn0 wn0Var4 = new wn0(3);
                wn0Var4.f29762b = 3;
                arrayList.add(wn0Var4);
                wn0 wn0Var5 = new wn0(3);
                wn0Var5.f29762b = 4;
                arrayList.add(wn0Var5);
            }
        }
    }
}
