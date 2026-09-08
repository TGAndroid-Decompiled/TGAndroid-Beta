package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xn0 extends a81 {
    public final ArrayList f32658a = new ArrayList();
    public final org.telegram.ui.ey f32659b;

    public xn0(org.telegram.ui.ey eyVar) {
        this.f32659b = eyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ey eyVar = this.f32659b;
        eyVar.O(view, i10, eyVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.ey eyVar = this.f32659b;
        org.telegram.ui.uy uyVar = eyVar.J0;
        if (i10 == 1) {
            return eyVar.U;
        }
        if (i10 == 3) {
            return eyVar.f32981f0;
        }
        if (i10 == 4) {
            return eyVar.f32986k0;
        }
        if (i10 == 5) {
            return eyVar.f32992r0;
        }
        if (i10 == 2) {
            vm0 vm0Var = new vm0(eyVar.H0, uyVar);
            eyVar.G0 = vm0Var;
            vm0Var.b(eyVar.U0, eyVar.V0, false);
            eyVar.G0.f31391b.setClipToPadding(false);
            eyVar.G0.f31391b.j(new vn0(this, 0));
            eyVar.G0.f31391b.C0(new cc0(eyVar, 23));
            eyVar.G0.setUiCallback(eyVar);
            return eyVar.G0;
        } else if (i10 == 6) {
            return eyVar.f32990p0;
        } else {
            org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(uyVar);
            x10Var.setChatPreviewDelegate(eyVar.P0);
            x10Var.setUiCallback(eyVar);
            x10Var.j(eyVar.U0, eyVar.V0, false);
            bh.b bVar = eyVar.W0;
            if (bVar != null) {
                x10Var.setBlurredBackgroundDrawableFactory(bVar);
            }
            bi.o0 o0Var = x10Var.f42564b;
            o0Var.setClipToPadding(false);
            o0Var.j(new vn0(this, 1));
            o0Var.C0(new cc0(eyVar, 23));
            return x10Var;
        }
    }

    @Override
    public final int e() {
        return this.f32658a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f32658a;
        if (((wn0) arrayList.get(i10)).f32327a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((wn0) arrayList.get(i10)).f32327a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((wn0) arrayList.get(i10)).f32327a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((wn0) arrayList.get(i10)).f32327a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((wn0) arrayList.get(i10)).f32327a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((wn0) arrayList.get(i10)).f32327a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        hg.q0 q0Var = hg.s0.f11263c3[((wn0) arrayList.get(i10)).f32328b];
        String str = q0Var.f11243c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f11242b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f32658a;
        if (((wn0) arrayList.get(i10)).f32327a == 0) {
            return 1;
        }
        if (((wn0) arrayList.get(i10)).f32327a == 1) {
            return 3;
        }
        if (((wn0) arrayList.get(i10)).f32327a == 4) {
            return 4;
        }
        if (((wn0) arrayList.get(i10)).f32327a == 2) {
            return 2;
        }
        if (((wn0) arrayList.get(i10)).f32327a == 5) {
            return 5;
        }
        if (((wn0) arrayList.get(i10)).f32327a == 6) {
            return 6;
        }
        return ((wn0) arrayList.get(i10)).f32327a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f32658a;
        arrayList.clear();
        arrayList.add(new wn0(0));
        org.telegram.ui.ey eyVar = this.f32659b;
        if (eyVar.T0 == 0) {
            if (eyVar.f32991q0) {
                arrayList.add(new wn0(5));
            }
            arrayList.add(new wn0(1));
            arrayList.add(new wn0(4));
            arrayList.add(new wn0(6));
            if (!eyVar.O0) {
                wn0 wn0Var = new wn0(3);
                wn0Var.f32328b = 0;
                arrayList.add(wn0Var);
                org.telegram.ui.ox oxVar = eyVar.f36232a1.F3;
                if (oxVar == null || !oxVar.c()) {
                    arrayList.add(new wn0(2));
                }
                wn0 wn0Var2 = new wn0(3);
                wn0Var2.f32328b = 1;
                arrayList.add(wn0Var2);
                wn0 wn0Var3 = new wn0(3);
                wn0Var3.f32328b = 2;
                arrayList.add(wn0Var3);
                wn0 wn0Var4 = new wn0(3);
                wn0Var4.f32328b = 3;
                arrayList.add(wn0Var4);
                wn0 wn0Var5 = new wn0(3);
                wn0Var5.f32328b = 4;
                arrayList.add(wn0Var5);
            }
        }
    }
}
