package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class do0 extends e81 {
    public final ArrayList f26302a = new ArrayList();
    public final org.telegram.ui.yx f26303b;

    public do0(org.telegram.ui.yx yxVar) {
        this.f26303b = yxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.yx yxVar = this.f26303b;
        yxVar.O(view, i10, yxVar.H0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.yx yxVar = this.f26303b;
        org.telegram.ui.py pyVar = yxVar.G0;
        if (i10 == 1) {
            return yxVar.R;
        }
        if (i10 == 3) {
            return yxVar.f26599c0;
        }
        if (i10 == 4) {
            return yxVar.f26604h0;
        }
        if (i10 == 5) {
            return yxVar.f26610o0;
        }
        if (i10 == 2) {
            en0 en0Var = new en0(yxVar.E0, pyVar);
            yxVar.D0 = en0Var;
            en0Var.b(yxVar.R0, yxVar.S0, false);
            yxVar.D0.f26584b.setClipToPadding(false);
            yxVar.D0.f26584b.j(new bo0(this, 0));
            yxVar.D0.f26584b.C0(new ec0(yxVar, 23));
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
            mh.d1 d1Var = t10Var.f41427b;
            d1Var.setClipToPadding(false);
            d1Var.j(new bo0(this, 1));
            d1Var.C0(new ec0(yxVar, 23));
            return t10Var;
        }
    }

    @Override
    public final int e() {
        return this.f26302a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f26302a;
        if (((co0) arrayList.get(i10)).f26062a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((co0) arrayList.get(i10)).f26062a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((co0) arrayList.get(i10)).f26062a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((co0) arrayList.get(i10)).f26062a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((co0) arrayList.get(i10)).f26062a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((co0) arrayList.get(i10)).f26062a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        uf.e0 e0Var = uf.g0.Z2[((co0) arrayList.get(i10)).f26063b];
        String str = e0Var.f48548c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(e0Var.f48547b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f26302a;
        if (((co0) arrayList.get(i10)).f26062a == 0) {
            return 1;
        }
        if (((co0) arrayList.get(i10)).f26062a == 1) {
            return 3;
        }
        if (((co0) arrayList.get(i10)).f26062a == 4) {
            return 4;
        }
        if (((co0) arrayList.get(i10)).f26062a == 2) {
            return 2;
        }
        if (((co0) arrayList.get(i10)).f26062a == 5) {
            return 5;
        }
        if (((co0) arrayList.get(i10)).f26062a == 6) {
            return 6;
        }
        return ((co0) arrayList.get(i10)).f26062a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f26302a;
        arrayList.clear();
        arrayList.add(new co0(0));
        org.telegram.ui.yx yxVar = this.f26303b;
        if (yxVar.Q0 == 0) {
            if (yxVar.f26609n0) {
                arrayList.add(new co0(5));
            }
            arrayList.add(new co0(1));
            arrayList.add(new co0(4));
            arrayList.add(new co0(6));
            if (!yxVar.L0) {
                co0 co0Var = new co0(3);
                co0Var.f26063b = 0;
                arrayList.add(co0Var);
                org.telegram.ui.kx kxVar = yxVar.X0.C3;
                if (kxVar == null || !kxVar.c()) {
                    arrayList.add(new co0(2));
                }
                co0 co0Var2 = new co0(3);
                co0Var2.f26063b = 1;
                arrayList.add(co0Var2);
                co0 co0Var3 = new co0(3);
                co0Var3.f26063b = 2;
                arrayList.add(co0Var3);
                co0 co0Var4 = new co0(3);
                co0Var4.f26063b = 3;
                arrayList.add(co0Var4);
                co0 co0Var5 = new co0(3);
                co0Var5.f26063b = 4;
                arrayList.add(co0Var5);
            }
        }
    }
}
