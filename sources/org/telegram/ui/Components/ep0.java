package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ep0 extends n91 {
    public final ArrayList f27901a = new ArrayList();
    public final org.telegram.ui.mx f27902b;

    public ep0(org.telegram.ui.mx mxVar) {
        this.f27902b = mxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.mx mxVar = this.f27902b;
        mxVar.P(view, i10, mxVar.M0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.mx mxVar = this.f27902b;
        org.telegram.ui.ey eyVar = mxVar.L0;
        if (i10 == 1) {
            return mxVar.W;
        }
        if (i10 == 3) {
            return mxVar.f28248h0;
        }
        if (i10 == 4) {
            return mxVar.m0;
        }
        if (i10 == 5) {
            return mxVar.f28259t0;
        }
        if (i10 == 2) {
            do0 do0Var = new do0(mxVar.J0, eyVar);
            mxVar.I0 = do0Var;
            do0Var.b(mxVar.W0, mxVar.X0, false);
            mxVar.I0.f27501b.setClipToPadding(false);
            mxVar.I0.f27501b.j(new cp0(this, 0));
            mxVar.I0.f27501b.D0(new xa0(mxVar, 26));
            mxVar.I0.setUiCallback(mxVar);
            return mxVar.I0;
        } else if (i10 == 6) {
            return mxVar.f28257r0;
        } else {
            org.telegram.ui.j10 j10Var = new org.telegram.ui.j10(eyVar);
            j10Var.setChatPreviewDelegate(mxVar.R0);
            j10Var.setUiCallback(mxVar);
            j10Var.j(mxVar.W0, mxVar.X0, false);
            ch.b bVar = mxVar.Z0;
            if (bVar != null) {
                j10Var.setBlurredBackgroundDrawableFactory(bVar);
            }
            bi.r1 r1Var = j10Var.f40322b;
            r1Var.setClipToPadding(false);
            r1Var.j(new cp0(this, 1));
            r1Var.D0(new xa0(mxVar, 26));
            return j10Var;
        }
    }

    @Override
    public final int e() {
        return this.f27901a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f27901a;
        if (((dp0) arrayList.get(i10)).f27515a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((dp0) arrayList.get(i10)).f27515a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((dp0) arrayList.get(i10)).f27515a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((dp0) arrayList.get(i10)).f27515a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((dp0) arrayList.get(i10)).f27515a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((dp0) arrayList.get(i10)).f27515a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        ig.p0 p0Var = ig.r0.f14212k3[((dp0) arrayList.get(i10)).f27516b];
        String str = p0Var.f14199c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f14198b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f27901a;
        if (((dp0) arrayList.get(i10)).f27515a == 0) {
            return 1;
        }
        if (((dp0) arrayList.get(i10)).f27515a == 1) {
            return 3;
        }
        if (((dp0) arrayList.get(i10)).f27515a == 4) {
            return 4;
        }
        if (((dp0) arrayList.get(i10)).f27515a == 2) {
            return 2;
        }
        if (((dp0) arrayList.get(i10)).f27515a == 5) {
            return 5;
        }
        if (((dp0) arrayList.get(i10)).f27515a == 6) {
            return 6;
        }
        return ((dp0) arrayList.get(i10)).f27515a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f27901a;
        arrayList.clear();
        arrayList.add(new dp0(0));
        org.telegram.ui.mx mxVar = this.f27902b;
        if (mxVar.V0 == 0) {
            if (mxVar.f28258s0) {
                arrayList.add(new dp0(5));
            }
            arrayList.add(new dp0(1));
            arrayList.add(new dp0(4));
            arrayList.add(new dp0(6));
            if (!mxVar.Q0) {
                dp0 dp0Var = new dp0(3);
                dp0Var.f27516b = 0;
                arrayList.add(dp0Var);
                org.telegram.ui.vw vwVar = mxVar.f41580d1.G3;
                if (vwVar == null || !vwVar.c()) {
                    arrayList.add(new dp0(2));
                }
                dp0 dp0Var2 = new dp0(3);
                dp0Var2.f27516b = 1;
                arrayList.add(dp0Var2);
                dp0 dp0Var3 = new dp0(3);
                dp0Var3.f27516b = 2;
                arrayList.add(dp0Var3);
                dp0 dp0Var4 = new dp0(3);
                dp0Var4.f27516b = 3;
                arrayList.add(dp0Var4);
                dp0 dp0Var5 = new dp0(3);
                dp0Var5.f27516b = 4;
                arrayList.add(dp0Var5);
            }
        }
    }
}
