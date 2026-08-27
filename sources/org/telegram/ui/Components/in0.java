package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class in0 extends g71 {

    public final ArrayList f29449a = new ArrayList();

    public final org.telegram.ui.px f29450b;

    public in0(org.telegram.ui.px pxVar) {
        this.f29450b = pxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.px pxVar = this.f29450b;
        pxVar.O(view, i10, pxVar.G0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.px pxVar = this.f29450b;
        org.telegram.ui.gy gyVar = pxVar.F0;
        if (i10 == 1) {
            return pxVar.Q;
        }
        if (i10 == 3) {
            return pxVar.f29743b0;
        }
        if (i10 == 4) {
            return pxVar.f29748g0;
        }
        if (i10 == 5) {
            return pxVar.f29754n0;
        }
        if (i10 == 2) {
            jm0 jm0Var = new jm0(pxVar.D0, gyVar);
            pxVar.C0 = jm0Var;
            jm0Var.b(pxVar.Q0, pxVar.R0, false);
            pxVar.C0.f29728b.setClipToPadding(false);
            pxVar.C0.f29728b.j(new gn0(this, 0));
            pxVar.C0.f29728b.C0(new mb0(pxVar, 23));
            pxVar.C0.setUiCallback(pxVar);
            return pxVar.C0;
        }
        if (i10 == 6) {
            return pxVar.f29753l0;
        }
        org.telegram.ui.i10 i10Var = new org.telegram.ui.i10(gyVar);
        i10Var.setChatPreviewDelegate(pxVar.L0);
        i10Var.setUiCallback(pxVar);
        i10Var.j(pxVar.Q0, pxVar.R0, false);
        jg.a aVar = pxVar.S0;
        if (aVar != null) {
            i10Var.setBlurredBackgroundDrawableFactory(aVar);
        }
        hh.f1 f1Var = i10Var.f38936b;
        f1Var.setClipToPadding(false);
        f1Var.j(new gn0(this, 1));
        f1Var.C0(new mb0(pxVar, 23));
        return i10Var;
    }

    @Override
    public final int e() {
        return this.f29449a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f29449a;
        if (((hn0) arrayList.get(i10)).f29060a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((hn0) arrayList.get(i10)).f29060a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((hn0) arrayList.get(i10)).f29060a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((hn0) arrayList.get(i10)).f29060a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((hn0) arrayList.get(i10)).f29060a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((hn0) arrayList.get(i10)).f29060a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        pf.e0 e0Var = pf.g0.Y2[((hn0) arrayList.get(i10)).f29061b];
        String str = e0Var.f45781c;
        return str != null ? str : LocaleController.getString(e0Var.f45780b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f29449a;
        if (((hn0) arrayList.get(i10)).f29060a == 0) {
            return 1;
        }
        if (((hn0) arrayList.get(i10)).f29060a == 1) {
            return 3;
        }
        if (((hn0) arrayList.get(i10)).f29060a == 4) {
            return 4;
        }
        if (((hn0) arrayList.get(i10)).f29060a == 2) {
            return 2;
        }
        if (((hn0) arrayList.get(i10)).f29060a == 5) {
            return 5;
        }
        if (((hn0) arrayList.get(i10)).f29060a == 6) {
            return 6;
        }
        return ((hn0) arrayList.get(i10)).f29060a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f29449a;
        arrayList.clear();
        arrayList.add(new hn0(0));
        org.telegram.ui.px pxVar = this.f29450b;
        if (pxVar.P0 != 0) {
            return;
        }
        if (pxVar.m0) {
            arrayList.add(new hn0(5));
        }
        arrayList.add(new hn0(1));
        arrayList.add(new hn0(4));
        arrayList.add(new hn0(6));
        if (pxVar.K0) {
            return;
        }
        hn0 hn0Var = new hn0(3);
        hn0Var.f29061b = 0;
        arrayList.add(hn0Var);
        org.telegram.ui.bx bxVar = pxVar.W0.B3;
        if (bxVar == null || !bxVar.c()) {
            arrayList.add(new hn0(2));
        }
        hn0 hn0Var2 = new hn0(3);
        hn0Var2.f29061b = 1;
        arrayList.add(hn0Var2);
        hn0 hn0Var3 = new hn0(3);
        hn0Var3.f29061b = 2;
        arrayList.add(hn0Var3);
        hn0 hn0Var4 = new hn0(3);
        hn0Var4.f29061b = 3;
        arrayList.add(hn0Var4);
        hn0 hn0Var5 = new hn0(3);
        hn0Var5.f29061b = 4;
        arrayList.add(hn0Var5);
    }
}
