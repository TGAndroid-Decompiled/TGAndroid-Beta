package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ep0 extends h91 {
    public final ArrayList f26113a = new ArrayList();
    public final org.telegram.ui.cy f26114b;

    public ep0(org.telegram.ui.cy cyVar) {
        this.f26114b = cyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.cy cyVar = this.f26114b;
        cyVar.O(view, i10, cyVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.cy cyVar = this.f26114b;
        org.telegram.ui.sy syVar = cyVar.J0;
        if (i10 == 1) {
            return cyVar.U;
        }
        if (i10 == 3) {
            return cyVar.f26441f0;
        }
        if (i10 == 4) {
            return cyVar.f26446k0;
        }
        if (i10 == 5) {
            return cyVar.f26452r0;
        }
        if (i10 == 2) {
            do0 do0Var = new do0(cyVar.H0, syVar);
            cyVar.G0 = do0Var;
            do0Var.b(cyVar.U0, cyVar.V0, false);
            cyVar.G0.f25644b.setClipToPadding(false);
            cyVar.G0.f25644b.j(new cp0(this, 0));
            cyVar.G0.f25644b.C0(new cd0(cyVar, 23));
            cyVar.G0.setUiCallback(cyVar);
            return cyVar.G0;
        } else if (i10 == 6) {
            return cyVar.f26450p0;
        } else {
            org.telegram.ui.v10 v10Var = new org.telegram.ui.v10(syVar);
            v10Var.setChatPreviewDelegate(cyVar.P0);
            v10Var.setUiCallback(cyVar);
            v10Var.j(cyVar.U0, cyVar.V0, false);
            ah.c cVar = cyVar.X0;
            if (cVar != null) {
                v10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = v10Var.f42830b;
            w0Var.setClipToPadding(false);
            w0Var.j(new cp0(this, 1));
            w0Var.C0(new cd0(cyVar, 23));
            return v10Var;
        }
    }

    @Override
    public final int e() {
        return this.f26113a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f26113a;
        if (((dp0) arrayList.get(i10)).f25654a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((dp0) arrayList.get(i10)).f25654a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((dp0) arrayList.get(i10)).f25654a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((dp0) arrayList.get(i10)).f25654a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((dp0) arrayList.get(i10)).f25654a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((dp0) arrayList.get(i10)).f25654a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.p0 p0Var = gg.r0.f10778a3[((dp0) arrayList.get(i10)).f25655b];
        String str = p0Var.f10761c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10760b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f26113a;
        if (((dp0) arrayList.get(i10)).f25654a == 0) {
            return 1;
        }
        if (((dp0) arrayList.get(i10)).f25654a == 1) {
            return 3;
        }
        if (((dp0) arrayList.get(i10)).f25654a == 4) {
            return 4;
        }
        if (((dp0) arrayList.get(i10)).f25654a == 2) {
            return 2;
        }
        if (((dp0) arrayList.get(i10)).f25654a == 5) {
            return 5;
        }
        if (((dp0) arrayList.get(i10)).f25654a == 6) {
            return 6;
        }
        return ((dp0) arrayList.get(i10)).f25654a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f26113a;
        arrayList.clear();
        arrayList.add(new dp0(0));
        org.telegram.ui.cy cyVar = this.f26114b;
        if (cyVar.T0 == 0) {
            if (cyVar.f26451q0) {
                arrayList.add(new dp0(5));
            }
            arrayList.add(new dp0(1));
            arrayList.add(new dp0(4));
            arrayList.add(new dp0(6));
            if (!cyVar.O0) {
                dp0 dp0Var = new dp0(3);
                dp0Var.f25655b = 0;
                arrayList.add(dp0Var);
                org.telegram.ui.mx mxVar = cyVar.f36852b1.F3;
                if (mxVar == null || !mxVar.c()) {
                    arrayList.add(new dp0(2));
                }
                dp0 dp0Var2 = new dp0(3);
                dp0Var2.f25655b = 1;
                arrayList.add(dp0Var2);
                dp0 dp0Var3 = new dp0(3);
                dp0Var3.f25655b = 2;
                arrayList.add(dp0Var3);
                dp0 dp0Var4 = new dp0(3);
                dp0Var4.f25655b = 3;
                arrayList.add(dp0Var4);
                dp0 dp0Var5 = new dp0(3);
                dp0Var5.f25655b = 4;
                arrayList.add(dp0Var5);
            }
        }
    }
}
