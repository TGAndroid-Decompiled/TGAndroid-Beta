package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ip0 extends l91 {
    public final ArrayList f27252a = new ArrayList();
    public final org.telegram.ui.fy f27253b;

    public ip0(org.telegram.ui.fy fyVar) {
        this.f27253b = fyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.fy fyVar = this.f27253b;
        fyVar.O(view, i10, fyVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.fy fyVar = this.f27253b;
        org.telegram.ui.vy vyVar = fyVar.J0;
        if (i10 == 1) {
            return fyVar.U;
        }
        if (i10 == 3) {
            return fyVar.f27602f0;
        }
        if (i10 == 4) {
            return fyVar.f27607k0;
        }
        if (i10 == 5) {
            return fyVar.f27613r0;
        }
        if (i10 == 2) {
            ho0 ho0Var = new ho0(fyVar.H0, vyVar);
            fyVar.G0 = ho0Var;
            ho0Var.b(fyVar.U0, fyVar.V0, false);
            fyVar.G0.f26840b.setClipToPadding(false);
            fyVar.G0.f26840b.j(new gp0(this, 0));
            fyVar.G0.f26840b.C0(new cd0(fyVar, 24));
            fyVar.G0.setUiCallback(fyVar);
            return fyVar.G0;
        } else if (i10 == 6) {
            return fyVar.f27611p0;
        } else {
            org.telegram.ui.y10 y10Var = new org.telegram.ui.y10(vyVar);
            y10Var.setChatPreviewDelegate(fyVar.P0);
            y10Var.setUiCallback(fyVar);
            y10Var.j(fyVar.U0, fyVar.V0, false);
            ah.c cVar = fyVar.X0;
            if (cVar != null) {
                y10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = y10Var.f44248b;
            w0Var.setClipToPadding(false);
            w0Var.j(new gp0(this, 1));
            w0Var.C0(new cd0(fyVar, 24));
            return y10Var;
        }
    }

    @Override
    public final int e() {
        return this.f27252a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f27252a;
        if (((hp0) arrayList.get(i10)).f26863a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((hp0) arrayList.get(i10)).f26863a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((hp0) arrayList.get(i10)).f26863a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((hp0) arrayList.get(i10)).f26863a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((hp0) arrayList.get(i10)).f26863a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((hp0) arrayList.get(i10)).f26863a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.p0 p0Var = gg.r0.f10777a3[((hp0) arrayList.get(i10)).f26864b];
        String str = p0Var.f10760c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10759b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f27252a;
        if (((hp0) arrayList.get(i10)).f26863a == 0) {
            return 1;
        }
        if (((hp0) arrayList.get(i10)).f26863a == 1) {
            return 3;
        }
        if (((hp0) arrayList.get(i10)).f26863a == 4) {
            return 4;
        }
        if (((hp0) arrayList.get(i10)).f26863a == 2) {
            return 2;
        }
        if (((hp0) arrayList.get(i10)).f26863a == 5) {
            return 5;
        }
        if (((hp0) arrayList.get(i10)).f26863a == 6) {
            return 6;
        }
        return ((hp0) arrayList.get(i10)).f26863a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f27252a;
        arrayList.clear();
        arrayList.add(new hp0(0));
        org.telegram.ui.fy fyVar = this.f27253b;
        if (fyVar.T0 == 0) {
            if (fyVar.f27612q0) {
                arrayList.add(new hp0(5));
            }
            arrayList.add(new hp0(1));
            arrayList.add(new hp0(4));
            arrayList.add(new hp0(6));
            if (!fyVar.O0) {
                hp0 hp0Var = new hp0(3);
                hp0Var.f26864b = 0;
                arrayList.add(hp0Var);
                org.telegram.ui.px pxVar = fyVar.f37870b1.F3;
                if (pxVar == null || !pxVar.c()) {
                    arrayList.add(new hp0(2));
                }
                hp0 hp0Var2 = new hp0(3);
                hp0Var2.f26864b = 1;
                arrayList.add(hp0Var2);
                hp0 hp0Var3 = new hp0(3);
                hp0Var3.f26864b = 2;
                arrayList.add(hp0Var3);
                hp0 hp0Var4 = new hp0(3);
                hp0Var4.f26864b = 3;
                arrayList.add(hp0Var4);
                hp0 hp0Var5 = new hp0(3);
                hp0Var5.f26864b = 4;
                arrayList.add(hp0Var5);
            }
        }
    }
}
