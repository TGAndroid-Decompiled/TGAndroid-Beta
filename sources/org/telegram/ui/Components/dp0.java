package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dp0 extends g91 {
    public final ArrayList f25857a = new ArrayList();
    public final org.telegram.ui.cy f25858b;

    public dp0(org.telegram.ui.cy cyVar) {
        this.f25858b = cyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.cy cyVar = this.f25858b;
        cyVar.O(view, i10, cyVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.cy cyVar = this.f25858b;
        org.telegram.ui.sy syVar = cyVar.J0;
        if (i10 == 1) {
            return cyVar.U;
        }
        if (i10 == 3) {
            return cyVar.f26169f0;
        }
        if (i10 == 4) {
            return cyVar.f26174k0;
        }
        if (i10 == 5) {
            return cyVar.f26180r0;
        }
        if (i10 == 2) {
            co0 co0Var = new co0(cyVar.H0, syVar);
            cyVar.G0 = co0Var;
            co0Var.b(cyVar.U0, cyVar.V0, false);
            cyVar.G0.f25404b.setClipToPadding(false);
            cyVar.G0.f25404b.j(new bp0(this, 0));
            cyVar.G0.f25404b.C0(new yc0(cyVar, 24));
            cyVar.G0.setUiCallback(cyVar);
            return cyVar.G0;
        } else if (i10 == 6) {
            return cyVar.f26178p0;
        } else {
            org.telegram.ui.v10 v10Var = new org.telegram.ui.v10(syVar);
            v10Var.setChatPreviewDelegate(cyVar.P0);
            v10Var.setUiCallback(cyVar);
            v10Var.j(cyVar.U0, cyVar.V0, false);
            ah.c cVar = cyVar.X0;
            if (cVar != null) {
                v10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = v10Var.f42864b;
            w0Var.setClipToPadding(false);
            w0Var.j(new bp0(this, 1));
            w0Var.C0(new yc0(cyVar, 24));
            return v10Var;
        }
    }

    @Override
    public final int e() {
        return this.f25857a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f25857a;
        if (((cp0) arrayList.get(i10)).f25419a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((cp0) arrayList.get(i10)).f25419a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((cp0) arrayList.get(i10)).f25419a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((cp0) arrayList.get(i10)).f25419a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((cp0) arrayList.get(i10)).f25419a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((cp0) arrayList.get(i10)).f25419a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.p0 p0Var = gg.r0.f10778a3[((cp0) arrayList.get(i10)).f25420b];
        String str = p0Var.f10761c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10760b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f25857a;
        if (((cp0) arrayList.get(i10)).f25419a == 0) {
            return 1;
        }
        if (((cp0) arrayList.get(i10)).f25419a == 1) {
            return 3;
        }
        if (((cp0) arrayList.get(i10)).f25419a == 4) {
            return 4;
        }
        if (((cp0) arrayList.get(i10)).f25419a == 2) {
            return 2;
        }
        if (((cp0) arrayList.get(i10)).f25419a == 5) {
            return 5;
        }
        if (((cp0) arrayList.get(i10)).f25419a == 6) {
            return 6;
        }
        return ((cp0) arrayList.get(i10)).f25419a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f25857a;
        arrayList.clear();
        arrayList.add(new cp0(0));
        org.telegram.ui.cy cyVar = this.f25858b;
        if (cyVar.T0 == 0) {
            if (cyVar.f26179q0) {
                arrayList.add(new cp0(5));
            }
            arrayList.add(new cp0(1));
            arrayList.add(new cp0(4));
            arrayList.add(new cp0(6));
            if (!cyVar.O0) {
                cp0 cp0Var = new cp0(3);
                cp0Var.f25420b = 0;
                arrayList.add(cp0Var);
                org.telegram.ui.mx mxVar = cyVar.f36886b1.F3;
                if (mxVar == null || !mxVar.c()) {
                    arrayList.add(new cp0(2));
                }
                cp0 cp0Var2 = new cp0(3);
                cp0Var2.f25420b = 1;
                arrayList.add(cp0Var2);
                cp0 cp0Var3 = new cp0(3);
                cp0Var3.f25420b = 2;
                arrayList.add(cp0Var3);
                cp0 cp0Var4 = new cp0(3);
                cp0Var4.f25420b = 3;
                arrayList.add(cp0Var4);
                cp0 cp0Var5 = new cp0(3);
                cp0Var5.f25420b = 4;
                arrayList.add(cp0Var5);
            }
        }
    }
}
