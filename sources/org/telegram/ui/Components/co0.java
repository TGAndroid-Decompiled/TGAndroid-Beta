package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class co0 extends d81 {
    public final ArrayList f26017a = new ArrayList();
    public final org.telegram.ui.yx f26018b;

    public co0(org.telegram.ui.yx yxVar) {
        this.f26018b = yxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.yx yxVar = this.f26018b;
        yxVar.O(view, i10, yxVar.H0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.yx yxVar = this.f26018b;
        org.telegram.ui.py pyVar = yxVar.G0;
        if (i10 == 1) {
            return yxVar.R;
        }
        if (i10 == 3) {
            return yxVar.f26322c0;
        }
        if (i10 == 4) {
            return yxVar.f26327h0;
        }
        if (i10 == 5) {
            return yxVar.f26333o0;
        }
        if (i10 == 2) {
            dn0 dn0Var = new dn0(yxVar.E0, pyVar);
            yxVar.D0 = dn0Var;
            dn0Var.b(yxVar.R0, yxVar.S0, false);
            yxVar.D0.f26310b.setClipToPadding(false);
            yxVar.D0.f26310b.j(new ao0(this, 0));
            yxVar.D0.f26310b.C0(new ec0(yxVar, 23));
            yxVar.D0.setUiCallback(yxVar);
            return yxVar.D0;
        } else if (i10 == 6) {
            return yxVar.m0;
        } else {
            org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(pyVar);
            t10Var.setChatPreviewDelegate(yxVar.M0);
            t10Var.setUiCallback(yxVar);
            t10Var.j(yxVar.R0, yxVar.S0, false);
            og.a aVar = yxVar.T0;
            if (aVar != null) {
                t10Var.setBlurredBackgroundDrawableFactory(aVar);
            }
            mh.d1 d1Var = t10Var.f41357b;
            d1Var.setClipToPadding(false);
            d1Var.j(new ao0(this, 1));
            d1Var.C0(new ec0(yxVar, 23));
            return t10Var;
        }
    }

    @Override
    public final int e() {
        return this.f26017a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f26017a;
        if (((bo0) arrayList.get(i10)).f25670a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((bo0) arrayList.get(i10)).f25670a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((bo0) arrayList.get(i10)).f25670a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((bo0) arrayList.get(i10)).f25670a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((bo0) arrayList.get(i10)).f25670a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((bo0) arrayList.get(i10)).f25670a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        uf.e0 e0Var = uf.g0.Z2[((bo0) arrayList.get(i10)).f25671b];
        String str = e0Var.f48584c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(e0Var.f48583b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f26017a;
        if (((bo0) arrayList.get(i10)).f25670a == 0) {
            return 1;
        }
        if (((bo0) arrayList.get(i10)).f25670a == 1) {
            return 3;
        }
        if (((bo0) arrayList.get(i10)).f25670a == 4) {
            return 4;
        }
        if (((bo0) arrayList.get(i10)).f25670a == 2) {
            return 2;
        }
        if (((bo0) arrayList.get(i10)).f25670a == 5) {
            return 5;
        }
        if (((bo0) arrayList.get(i10)).f25670a == 6) {
            return 6;
        }
        return ((bo0) arrayList.get(i10)).f25670a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f26017a;
        arrayList.clear();
        arrayList.add(new bo0(0));
        org.telegram.ui.yx yxVar = this.f26018b;
        if (yxVar.Q0 == 0) {
            if (yxVar.f26332n0) {
                arrayList.add(new bo0(5));
            }
            arrayList.add(new bo0(1));
            arrayList.add(new bo0(4));
            arrayList.add(new bo0(6));
            if (!yxVar.L0) {
                bo0 bo0Var = new bo0(3);
                bo0Var.f25671b = 0;
                arrayList.add(bo0Var);
                org.telegram.ui.kx kxVar = yxVar.X0.C3;
                if (kxVar == null || !kxVar.c()) {
                    arrayList.add(new bo0(2));
                }
                bo0 bo0Var2 = new bo0(3);
                bo0Var2.f25671b = 1;
                arrayList.add(bo0Var2);
                bo0 bo0Var3 = new bo0(3);
                bo0Var3.f25671b = 2;
                arrayList.add(bo0Var3);
                bo0 bo0Var4 = new bo0(3);
                bo0Var4.f25671b = 3;
                arrayList.add(bo0Var4);
                bo0 bo0Var5 = new bo0(3);
                bo0Var5.f25671b = 4;
                arrayList.add(bo0Var5);
            }
        }
    }
}
