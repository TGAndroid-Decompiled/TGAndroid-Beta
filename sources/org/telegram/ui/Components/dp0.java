package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dp0 extends m91 {
    public final ArrayList f27576a = new ArrayList();
    public final org.telegram.ui.jx f27577b;

    public dp0(org.telegram.ui.jx jxVar) {
        this.f27577b = jxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.jx jxVar = this.f27577b;
        jxVar.P(view, i10, jxVar.M0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.jx jxVar = this.f27577b;
        org.telegram.ui.cy cyVar = jxVar.L0;
        if (i10 == 1) {
            return jxVar.W;
        }
        if (i10 == 3) {
            return jxVar.f27940h0;
        }
        if (i10 == 4) {
            return jxVar.m0;
        }
        if (i10 == 5) {
            return jxVar.f27951t0;
        }
        if (i10 == 2) {
            co0 co0Var = new co0(jxVar.J0, cyVar);
            jxVar.I0 = co0Var;
            co0Var.b(jxVar.W0, jxVar.X0, false);
            jxVar.I0.f27218b.setClipToPadding(false);
            jxVar.I0.f27218b.j(new bp0(this, 0));
            jxVar.I0.f27218b.D0(new wa0(jxVar, 26));
            jxVar.I0.setUiCallback(jxVar);
            return jxVar.I0;
        } else if (i10 == 6) {
            return jxVar.f27949r0;
        } else {
            org.telegram.ui.h10 h10Var = new org.telegram.ui.h10(cyVar);
            h10Var.setChatPreviewDelegate(jxVar.R0);
            h10Var.setUiCallback(jxVar);
            h10Var.j(jxVar.W0, jxVar.X0, false);
            ch.b bVar = jxVar.Z0;
            if (bVar != null) {
                h10Var.setBlurredBackgroundDrawableFactory(bVar);
            }
            bi.r1 r1Var = h10Var.f39828b;
            r1Var.setClipToPadding(false);
            r1Var.j(new bp0(this, 1));
            r1Var.D0(new wa0(jxVar, 26));
            return h10Var;
        }
    }

    @Override
    public final int e() {
        return this.f27576a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f27576a;
        if (((cp0) arrayList.get(i10)).f27232a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((cp0) arrayList.get(i10)).f27232a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((cp0) arrayList.get(i10)).f27232a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((cp0) arrayList.get(i10)).f27232a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((cp0) arrayList.get(i10)).f27232a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((cp0) arrayList.get(i10)).f27232a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        ig.p0 p0Var = ig.r0.f14213k3[((cp0) arrayList.get(i10)).f27233b];
        String str = p0Var.f14200c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f14199b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f27576a;
        if (((cp0) arrayList.get(i10)).f27232a == 0) {
            return 1;
        }
        if (((cp0) arrayList.get(i10)).f27232a == 1) {
            return 3;
        }
        if (((cp0) arrayList.get(i10)).f27232a == 4) {
            return 4;
        }
        if (((cp0) arrayList.get(i10)).f27232a == 2) {
            return 2;
        }
        if (((cp0) arrayList.get(i10)).f27232a == 5) {
            return 5;
        }
        if (((cp0) arrayList.get(i10)).f27232a == 6) {
            return 6;
        }
        return ((cp0) arrayList.get(i10)).f27232a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f27576a;
        arrayList.clear();
        arrayList.add(new cp0(0));
        org.telegram.ui.jx jxVar = this.f27577b;
        if (jxVar.V0 == 0) {
            if (jxVar.f27950s0) {
                arrayList.add(new cp0(5));
            }
            arrayList.add(new cp0(1));
            arrayList.add(new cp0(4));
            arrayList.add(new cp0(6));
            if (!jxVar.Q0) {
                cp0 cp0Var = new cp0(3);
                cp0Var.f27233b = 0;
                arrayList.add(cp0Var);
                org.telegram.ui.tw twVar = jxVar.f40760d1.G3;
                if (twVar == null || !twVar.c()) {
                    arrayList.add(new cp0(2));
                }
                cp0 cp0Var2 = new cp0(3);
                cp0Var2.f27233b = 1;
                arrayList.add(cp0Var2);
                cp0 cp0Var3 = new cp0(3);
                cp0Var3.f27233b = 2;
                arrayList.add(cp0Var3);
                cp0 cp0Var4 = new cp0(3);
                cp0Var4.f27233b = 3;
                arrayList.add(cp0Var4);
                cp0 cp0Var5 = new cp0(3);
                cp0Var5.f27233b = 4;
                arrayList.add(cp0Var5);
            }
        }
    }
}
