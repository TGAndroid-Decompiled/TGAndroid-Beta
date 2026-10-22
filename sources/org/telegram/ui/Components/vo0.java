package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vo0 extends w81 {
    public final ArrayList f31326a = new ArrayList();
    public final org.telegram.ui.lx f31327b;

    public vo0(org.telegram.ui.lx lxVar) {
        this.f31327b = lxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.lx lxVar = this.f31327b;
        lxVar.O(view, i10, lxVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.lx lxVar = this.f31327b;
        org.telegram.ui.cy cyVar = lxVar.J0;
        if (i10 == 1) {
            return lxVar.U;
        }
        if (i10 == 3) {
            return lxVar.f32186f0;
        }
        if (i10 == 4) {
            return lxVar.f32191k0;
        }
        if (i10 == 5) {
            return lxVar.f32197r0;
        }
        if (i10 == 2) {
            un0 un0Var = new un0(lxVar.H0, cyVar);
            lxVar.G0 = un0Var;
            un0Var.b(lxVar.U0, lxVar.V0, false);
            lxVar.G0.f30980b.setClipToPadding(false);
            lxVar.G0.f30980b.j(new to0(this, 0));
            lxVar.G0.f30980b.C0(new rc0(lxVar, 23));
            lxVar.G0.setUiCallback(lxVar);
            return lxVar.G0;
        } else if (i10 == 6) {
            return lxVar.f32195p0;
        } else {
            org.telegram.ui.e10 e10Var = new org.telegram.ui.e10(cyVar);
            e10Var.setChatPreviewDelegate(lxVar.P0);
            e10Var.setUiCallback(lxVar);
            e10Var.j(lxVar.U0, lxVar.V0, false);
            bh.b bVar = lxVar.X0;
            if (bVar != null) {
                e10Var.setBlurredBackgroundDrawableFactory(bVar);
            }
            ai.u1 u1Var = e10Var.f36497b;
            u1Var.setClipToPadding(false);
            u1Var.j(new to0(this, 1));
            u1Var.C0(new rc0(lxVar, 23));
            return e10Var;
        }
    }

    @Override
    public final int e() {
        return this.f31326a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f31326a;
        if (((uo0) arrayList.get(i10)).f30993a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((uo0) arrayList.get(i10)).f30993a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((uo0) arrayList.get(i10)).f30993a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((uo0) arrayList.get(i10)).f30993a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((uo0) arrayList.get(i10)).f30993a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((uo0) arrayList.get(i10)).f30993a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        hg.o0 o0Var = hg.q0.f12015a3[((uo0) arrayList.get(i10)).f30994b];
        String str = o0Var.f12003c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(o0Var.f12002b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f31326a;
        if (((uo0) arrayList.get(i10)).f30993a == 0) {
            return 1;
        }
        if (((uo0) arrayList.get(i10)).f30993a == 1) {
            return 3;
        }
        if (((uo0) arrayList.get(i10)).f30993a == 4) {
            return 4;
        }
        if (((uo0) arrayList.get(i10)).f30993a == 2) {
            return 2;
        }
        if (((uo0) arrayList.get(i10)).f30993a == 5) {
            return 5;
        }
        if (((uo0) arrayList.get(i10)).f30993a == 6) {
            return 6;
        }
        return ((uo0) arrayList.get(i10)).f30993a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f31326a;
        arrayList.clear();
        arrayList.add(new uo0(0));
        org.telegram.ui.lx lxVar = this.f31327b;
        if (lxVar.T0 == 0) {
            if (lxVar.f32196q0) {
                arrayList.add(new uo0(5));
            }
            arrayList.add(new uo0(1));
            arrayList.add(new uo0(4));
            arrayList.add(new uo0(6));
            if (!lxVar.O0) {
                uo0 uo0Var = new uo0(3);
                uo0Var.f30994b = 0;
                arrayList.add(uo0Var);
                org.telegram.ui.ww wwVar = lxVar.f39042b1.G3;
                if (wwVar == null || !wwVar.c()) {
                    arrayList.add(new uo0(2));
                }
                uo0 uo0Var2 = new uo0(3);
                uo0Var2.f30994b = 1;
                arrayList.add(uo0Var2);
                uo0 uo0Var3 = new uo0(3);
                uo0Var3.f30994b = 2;
                arrayList.add(uo0Var3);
                uo0 uo0Var4 = new uo0(3);
                uo0Var4.f30994b = 3;
                arrayList.add(uo0Var4);
                uo0 uo0Var5 = new uo0(3);
                uo0Var5.f30994b = 4;
                arrayList.add(uo0Var5);
            }
        }
    }
}
