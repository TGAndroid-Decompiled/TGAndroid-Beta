package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sn0 extends q71 {
    public final ArrayList f32693a = new ArrayList();
    public final org.telegram.ui.ox f32694b;

    public sn0(org.telegram.ui.ox oxVar) {
        this.f32694b = oxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ox oxVar = this.f32694b;
        oxVar.O(view, i10, oxVar.G0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.ox oxVar = this.f32694b;
        org.telegram.ui.fy fyVar = oxVar.F0;
        if (i10 == 1) {
            return oxVar.Q;
        }
        if (i10 == 3) {
            return oxVar.f32989b0;
        }
        if (i10 == 4) {
            return oxVar.f32994g0;
        }
        if (i10 == 5) {
            return oxVar.f33000n0;
        }
        if (i10 == 2) {
            tm0 tm0Var = new tm0(oxVar.D0, fyVar);
            oxVar.C0 = tm0Var;
            tm0Var.b(oxVar.Q0, oxVar.R0, false);
            oxVar.C0.f32978b.setClipToPadding(false);
            oxVar.C0.f32978b.j(new qn0(this, 0));
            oxVar.C0.f32978b.C0(new xb0(oxVar, 23));
            oxVar.C0.setUiCallback(oxVar);
            return oxVar.C0;
        } else if (i10 == 6) {
            return oxVar.f32999l0;
        } else {
            org.telegram.ui.h10 h10Var = new org.telegram.ui.h10(fyVar);
            h10Var.setChatPreviewDelegate(oxVar.L0);
            h10Var.setUiCallback(oxVar);
            h10Var.j(oxVar.Q0, oxVar.R0, false);
            lg.a aVar = oxVar.S0;
            if (aVar != null) {
                h10Var.setBlurredBackgroundDrawableFactory(aVar);
            }
            jh.e1 e1Var = h10Var.f38720b;
            e1Var.setClipToPadding(false);
            e1Var.j(new qn0(this, 1));
            e1Var.C0(new xb0(oxVar, 23));
            return h10Var;
        }
    }

    @Override
    public final int e() {
        return this.f32693a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f32693a;
        if (((rn0) arrayList.get(i10)).f32345a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((rn0) arrayList.get(i10)).f32345a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((rn0) arrayList.get(i10)).f32345a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((rn0) arrayList.get(i10)).f32345a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((rn0) arrayList.get(i10)).f32345a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((rn0) arrayList.get(i10)).f32345a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        rf.f0 f0Var = rf.h0.Y2[((rn0) arrayList.get(i10)).f32346b];
        String str = f0Var.f47222c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(f0Var.f47221b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f32693a;
        if (((rn0) arrayList.get(i10)).f32345a == 0) {
            return 1;
        }
        if (((rn0) arrayList.get(i10)).f32345a == 1) {
            return 3;
        }
        if (((rn0) arrayList.get(i10)).f32345a == 4) {
            return 4;
        }
        if (((rn0) arrayList.get(i10)).f32345a == 2) {
            return 2;
        }
        if (((rn0) arrayList.get(i10)).f32345a == 5) {
            return 5;
        }
        if (((rn0) arrayList.get(i10)).f32345a == 6) {
            return 6;
        }
        return ((rn0) arrayList.get(i10)).f32345a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f32693a;
        arrayList.clear();
        arrayList.add(new rn0(0));
        org.telegram.ui.ox oxVar = this.f32694b;
        if (oxVar.P0 == 0) {
            if (oxVar.m0) {
                arrayList.add(new rn0(5));
            }
            arrayList.add(new rn0(1));
            arrayList.add(new rn0(4));
            arrayList.add(new rn0(6));
            if (!oxVar.K0) {
                rn0 rn0Var = new rn0(3);
                rn0Var.f32346b = 0;
                arrayList.add(rn0Var);
                org.telegram.ui.ax axVar = oxVar.W0.B3;
                if (axVar == null || !axVar.c()) {
                    arrayList.add(new rn0(2));
                }
                rn0 rn0Var2 = new rn0(3);
                rn0Var2.f32346b = 1;
                arrayList.add(rn0Var2);
                rn0 rn0Var3 = new rn0(3);
                rn0Var3.f32346b = 2;
                arrayList.add(rn0Var3);
                rn0 rn0Var4 = new rn0(3);
                rn0Var4.f32346b = 3;
                arrayList.add(rn0Var4);
                rn0 rn0Var5 = new rn0(3);
                rn0Var5.f32346b = 4;
                arrayList.add(rn0Var5);
            }
        }
    }
}
