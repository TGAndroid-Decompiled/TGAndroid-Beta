package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dp0 extends g91 {
    public final ArrayList f25779a = new ArrayList();
    public final org.telegram.ui.dy f25780b;

    public dp0(org.telegram.ui.dy dyVar) {
        this.f25780b = dyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.dy dyVar = this.f25780b;
        dyVar.O(view, i10, dyVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.dy dyVar = this.f25780b;
        org.telegram.ui.ty tyVar = dyVar.J0;
        if (i10 == 1) {
            return dyVar.U;
        }
        if (i10 == 3) {
            return dyVar.f26131f0;
        }
        if (i10 == 4) {
            return dyVar.f26136k0;
        }
        if (i10 == 5) {
            return dyVar.f26142r0;
        }
        if (i10 == 2) {
            co0 co0Var = new co0(dyVar.H0, tyVar);
            dyVar.G0 = co0Var;
            co0Var.b(dyVar.U0, dyVar.V0, false);
            dyVar.G0.f25342b.setClipToPadding(false);
            dyVar.G0.f25342b.j(new bp0(this, 0));
            dyVar.G0.f25342b.C0(new cd0(dyVar, 23));
            dyVar.G0.setUiCallback(dyVar);
            return dyVar.G0;
        } else if (i10 == 6) {
            return dyVar.f26140p0;
        } else {
            org.telegram.ui.w10 w10Var = new org.telegram.ui.w10(tyVar);
            w10Var.setChatPreviewDelegate(dyVar.P0);
            w10Var.setUiCallback(dyVar);
            w10Var.j(dyVar.U0, dyVar.V0, false);
            ah.c cVar = dyVar.X0;
            if (cVar != null) {
                w10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = w10Var.f43088b;
            w0Var.setClipToPadding(false);
            w0Var.j(new bp0(this, 1));
            w0Var.C0(new cd0(dyVar, 23));
            return w10Var;
        }
    }

    @Override
    public final int e() {
        return this.f25779a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f25779a;
        if (((cp0) arrayList.get(i10)).f25357a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((cp0) arrayList.get(i10)).f25357a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((cp0) arrayList.get(i10)).f25357a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((cp0) arrayList.get(i10)).f25357a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((cp0) arrayList.get(i10)).f25357a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((cp0) arrayList.get(i10)).f25357a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.p0 p0Var = gg.r0.f10779a3[((cp0) arrayList.get(i10)).f25358b];
        String str = p0Var.f10762c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10761b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f25779a;
        if (((cp0) arrayList.get(i10)).f25357a == 0) {
            return 1;
        }
        if (((cp0) arrayList.get(i10)).f25357a == 1) {
            return 3;
        }
        if (((cp0) arrayList.get(i10)).f25357a == 4) {
            return 4;
        }
        if (((cp0) arrayList.get(i10)).f25357a == 2) {
            return 2;
        }
        if (((cp0) arrayList.get(i10)).f25357a == 5) {
            return 5;
        }
        if (((cp0) arrayList.get(i10)).f25357a == 6) {
            return 6;
        }
        return ((cp0) arrayList.get(i10)).f25357a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f25779a;
        arrayList.clear();
        arrayList.add(new cp0(0));
        org.telegram.ui.dy dyVar = this.f25780b;
        if (dyVar.T0 == 0) {
            if (dyVar.f26141q0) {
                arrayList.add(new cp0(5));
            }
            arrayList.add(new cp0(1));
            arrayList.add(new cp0(4));
            arrayList.add(new cp0(6));
            if (!dyVar.O0) {
                cp0 cp0Var = new cp0(3);
                cp0Var.f25358b = 0;
                arrayList.add(cp0Var);
                org.telegram.ui.nx nxVar = dyVar.f37153b1.F3;
                if (nxVar == null || !nxVar.c()) {
                    arrayList.add(new cp0(2));
                }
                cp0 cp0Var2 = new cp0(3);
                cp0Var2.f25358b = 1;
                arrayList.add(cp0Var2);
                cp0 cp0Var3 = new cp0(3);
                cp0Var3.f25358b = 2;
                arrayList.add(cp0Var3);
                cp0 cp0Var4 = new cp0(3);
                cp0Var4.f25358b = 3;
                arrayList.add(cp0Var4);
                cp0 cp0Var5 = new cp0(3);
                cp0Var5.f25358b = 4;
                arrayList.add(cp0Var5);
            }
        }
    }
}
