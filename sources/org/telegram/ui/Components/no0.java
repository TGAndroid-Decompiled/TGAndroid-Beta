package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class no0 extends p81 {
    public final ArrayList f26760a = new ArrayList();
    public final org.telegram.ui.zx f26761b;

    public no0(org.telegram.ui.zx zxVar) {
        this.f26761b = zxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.zx zxVar = this.f26761b;
        zxVar.O(view, i10, zxVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.zx zxVar = this.f26761b;
        org.telegram.ui.qy qyVar = zxVar.J0;
        if (i10 == 1) {
            return zxVar.U;
        }
        if (i10 == 3) {
            return zxVar.f27140f0;
        }
        if (i10 == 4) {
            return zxVar.f27145k0;
        }
        if (i10 == 5) {
            return zxVar.f27151r0;
        }
        if (i10 == 2) {
            ln0 ln0Var = new ln0(zxVar.H0, qyVar);
            zxVar.G0 = ln0Var;
            ln0Var.b(zxVar.U0, zxVar.V0, false);
            zxVar.G0.f26060b.setClipToPadding(false);
            zxVar.G0.f26060b.j(new lo0(this, 0));
            zxVar.G0.f26060b.D0(new lc0(zxVar, 24));
            zxVar.G0.setUiCallback(zxVar);
            return zxVar.G0;
        } else if (i10 == 6) {
            return zxVar.f27149p0;
        } else {
            org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(qyVar);
            t10Var.setChatPreviewDelegate(zxVar.P0);
            t10Var.setUiCallback(zxVar);
            t10Var.j(zxVar.U0, zxVar.V0, false);
            ah.c cVar = zxVar.X0;
            if (cVar != null) {
                t10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = t10Var.f38029b;
            w0Var.setClipToPadding(false);
            w0Var.j(new lo0(this, 1));
            w0Var.D0(new lc0(zxVar, 24));
            return t10Var;
        }
    }

    @Override
    public final int e() {
        return this.f26760a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f26760a;
        if (((mo0) arrayList.get(i10)).f26344a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((mo0) arrayList.get(i10)).f26344a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((mo0) arrayList.get(i10)).f26344a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((mo0) arrayList.get(i10)).f26344a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((mo0) arrayList.get(i10)).f26344a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((mo0) arrayList.get(i10)).f26344a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.j3[((mo0) arrayList.get(i10)).f26345b];
        String str = q0Var.f9892c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9891b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f26760a;
        if (((mo0) arrayList.get(i10)).f26344a == 0) {
            return 1;
        }
        if (((mo0) arrayList.get(i10)).f26344a == 1) {
            return 3;
        }
        if (((mo0) arrayList.get(i10)).f26344a == 4) {
            return 4;
        }
        if (((mo0) arrayList.get(i10)).f26344a == 2) {
            return 2;
        }
        if (((mo0) arrayList.get(i10)).f26344a == 5) {
            return 5;
        }
        if (((mo0) arrayList.get(i10)).f26344a == 6) {
            return 6;
        }
        return ((mo0) arrayList.get(i10)).f26344a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f26760a;
        arrayList.clear();
        arrayList.add(new mo0(0));
        org.telegram.ui.zx zxVar = this.f26761b;
        if (zxVar.T0 == 0) {
            if (zxVar.f27150q0) {
                arrayList.add(new mo0(5));
            }
            arrayList.add(new mo0(1));
            arrayList.add(new mo0(4));
            arrayList.add(new mo0(6));
            if (!zxVar.O0) {
                mo0 mo0Var = new mo0(3);
                mo0Var.f26345b = 0;
                arrayList.add(mo0Var);
                org.telegram.ui.kx kxVar = zxVar.f40689b1.F3;
                if (kxVar == null || !kxVar.c()) {
                    arrayList.add(new mo0(2));
                }
                mo0 mo0Var2 = new mo0(3);
                mo0Var2.f26345b = 1;
                arrayList.add(mo0Var2);
                mo0 mo0Var3 = new mo0(3);
                mo0Var3.f26345b = 2;
                arrayList.add(mo0Var3);
                mo0 mo0Var4 = new mo0(3);
                mo0Var4.f26345b = 3;
                arrayList.add(mo0Var4);
                mo0 mo0Var5 = new mo0(3);
                mo0Var5.f26345b = 4;
                arrayList.add(mo0Var5);
            }
        }
    }
}
