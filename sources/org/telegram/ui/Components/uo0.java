package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uo0 extends v81 {
    public final ArrayList f31034a = new ArrayList();
    public final org.telegram.ui.lx f31035b;

    public uo0(org.telegram.ui.lx lxVar) {
        this.f31035b = lxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.lx lxVar = this.f31035b;
        lxVar.O(view, i10, lxVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.lx lxVar = this.f31035b;
        org.telegram.ui.cy cyVar = lxVar.J0;
        if (i10 == 1) {
            return lxVar.U;
        }
        if (i10 == 3) {
            return lxVar.f31353f0;
        }
        if (i10 == 4) {
            return lxVar.f31358k0;
        }
        if (i10 == 5) {
            return lxVar.f31364r0;
        }
        if (i10 == 2) {
            tn0 tn0Var = new tn0(lxVar.H0, cyVar);
            lxVar.G0 = tn0Var;
            tn0Var.b(lxVar.U0, lxVar.V0, false);
            lxVar.G0.f30629b.setClipToPadding(false);
            lxVar.G0.f30629b.j(new so0(this, 0));
            lxVar.G0.f30629b.C0(new rc0(lxVar, 23));
            lxVar.G0.setUiCallback(lxVar);
            return lxVar.G0;
        } else if (i10 == 6) {
            return lxVar.f31362p0;
        } else {
            org.telegram.ui.e10 e10Var = new org.telegram.ui.e10(cyVar);
            e10Var.setChatPreviewDelegate(lxVar.P0);
            e10Var.setUiCallback(lxVar);
            e10Var.j(lxVar.U0, lxVar.V0, false);
            bh.b bVar = lxVar.X0;
            if (bVar != null) {
                e10Var.setBlurredBackgroundDrawableFactory(bVar);
            }
            ai.u1 u1Var = e10Var.f36487b;
            u1Var.setClipToPadding(false);
            u1Var.j(new so0(this, 1));
            u1Var.C0(new rc0(lxVar, 23));
            return e10Var;
        }
    }

    @Override
    public final int e() {
        return this.f31034a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f31034a;
        if (((to0) arrayList.get(i10)).f30648a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((to0) arrayList.get(i10)).f30648a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((to0) arrayList.get(i10)).f30648a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((to0) arrayList.get(i10)).f30648a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((to0) arrayList.get(i10)).f30648a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((to0) arrayList.get(i10)).f30648a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        hg.o0 o0Var = hg.q0.f12015a3[((to0) arrayList.get(i10)).f30649b];
        String str = o0Var.f12003c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(o0Var.f12002b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f31034a;
        if (((to0) arrayList.get(i10)).f30648a == 0) {
            return 1;
        }
        if (((to0) arrayList.get(i10)).f30648a == 1) {
            return 3;
        }
        if (((to0) arrayList.get(i10)).f30648a == 4) {
            return 4;
        }
        if (((to0) arrayList.get(i10)).f30648a == 2) {
            return 2;
        }
        if (((to0) arrayList.get(i10)).f30648a == 5) {
            return 5;
        }
        if (((to0) arrayList.get(i10)).f30648a == 6) {
            return 6;
        }
        return ((to0) arrayList.get(i10)).f30648a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f31034a;
        arrayList.clear();
        arrayList.add(new to0(0));
        org.telegram.ui.lx lxVar = this.f31035b;
        if (lxVar.T0 == 0) {
            if (lxVar.f31363q0) {
                arrayList.add(new to0(5));
            }
            arrayList.add(new to0(1));
            arrayList.add(new to0(4));
            arrayList.add(new to0(6));
            if (!lxVar.O0) {
                to0 to0Var = new to0(3);
                to0Var.f30649b = 0;
                arrayList.add(to0Var);
                org.telegram.ui.ww wwVar = lxVar.f39032b1.G3;
                if (wwVar == null || !wwVar.c()) {
                    arrayList.add(new to0(2));
                }
                to0 to0Var2 = new to0(3);
                to0Var2.f30649b = 1;
                arrayList.add(to0Var2);
                to0 to0Var3 = new to0(3);
                to0Var3.f30649b = 2;
                arrayList.add(to0Var3);
                to0 to0Var4 = new to0(3);
                to0Var4.f30649b = 3;
                arrayList.add(to0Var4);
                to0 to0Var5 = new to0(3);
                to0Var5.f30649b = 4;
                arrayList.add(to0Var5);
            }
        }
    }
}
