package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cp0 extends f91 {
    public final ArrayList f25458a = new ArrayList();
    public final org.telegram.ui.dy f25459b;

    public cp0(org.telegram.ui.dy dyVar) {
        this.f25459b = dyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.dy dyVar = this.f25459b;
        dyVar.O(view, i10, dyVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.dy dyVar = this.f25459b;
        org.telegram.ui.ty tyVar = dyVar.J0;
        if (i10 == 1) {
            return dyVar.U;
        }
        if (i10 == 3) {
            return dyVar.f25770f0;
        }
        if (i10 == 4) {
            return dyVar.f25775k0;
        }
        if (i10 == 5) {
            return dyVar.f25781r0;
        }
        if (i10 == 2) {
            bo0 bo0Var = new bo0(dyVar.H0, tyVar);
            dyVar.G0 = bo0Var;
            bo0Var.b(dyVar.U0, dyVar.V0, false);
            dyVar.G0.f25067b.setClipToPadding(false);
            dyVar.G0.f25067b.j(new ap0(this, 0));
            dyVar.G0.f25067b.C0(new bd0(dyVar, 23));
            dyVar.G0.setUiCallback(dyVar);
            return dyVar.G0;
        } else if (i10 == 6) {
            return dyVar.f25779p0;
        } else {
            org.telegram.ui.w10 w10Var = new org.telegram.ui.w10(tyVar);
            w10Var.setChatPreviewDelegate(dyVar.P0);
            w10Var.setUiCallback(dyVar);
            w10Var.j(dyVar.U0, dyVar.V0, false);
            ah.c cVar = dyVar.X0;
            if (cVar != null) {
                w10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = w10Var.f43042b;
            w0Var.setClipToPadding(false);
            w0Var.j(new ap0(this, 1));
            w0Var.C0(new bd0(dyVar, 23));
            return w10Var;
        }
    }

    @Override
    public final int e() {
        return this.f25458a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f25458a;
        if (((bp0) arrayList.get(i10)).f25080a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((bp0) arrayList.get(i10)).f25080a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((bp0) arrayList.get(i10)).f25080a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((bp0) arrayList.get(i10)).f25080a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((bp0) arrayList.get(i10)).f25080a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((bp0) arrayList.get(i10)).f25080a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.p0 p0Var = gg.r0.f10779a3[((bp0) arrayList.get(i10)).f25081b];
        String str = p0Var.f10762c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10761b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f25458a;
        if (((bp0) arrayList.get(i10)).f25080a == 0) {
            return 1;
        }
        if (((bp0) arrayList.get(i10)).f25080a == 1) {
            return 3;
        }
        if (((bp0) arrayList.get(i10)).f25080a == 4) {
            return 4;
        }
        if (((bp0) arrayList.get(i10)).f25080a == 2) {
            return 2;
        }
        if (((bp0) arrayList.get(i10)).f25080a == 5) {
            return 5;
        }
        if (((bp0) arrayList.get(i10)).f25080a == 6) {
            return 6;
        }
        return ((bp0) arrayList.get(i10)).f25080a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f25458a;
        arrayList.clear();
        arrayList.add(new bp0(0));
        org.telegram.ui.dy dyVar = this.f25459b;
        if (dyVar.T0 == 0) {
            if (dyVar.f25780q0) {
                arrayList.add(new bp0(5));
            }
            arrayList.add(new bp0(1));
            arrayList.add(new bp0(4));
            arrayList.add(new bp0(6));
            if (!dyVar.O0) {
                bp0 bp0Var = new bp0(3);
                bp0Var.f25081b = 0;
                arrayList.add(bp0Var);
                org.telegram.ui.nx nxVar = dyVar.f37107b1.F3;
                if (nxVar == null || !nxVar.c()) {
                    arrayList.add(new bp0(2));
                }
                bp0 bp0Var2 = new bp0(3);
                bp0Var2.f25081b = 1;
                arrayList.add(bp0Var2);
                bp0 bp0Var3 = new bp0(3);
                bp0Var3.f25081b = 2;
                arrayList.add(bp0Var3);
                bp0 bp0Var4 = new bp0(3);
                bp0Var4.f25081b = 3;
                arrayList.add(bp0Var4);
                bp0 bp0Var5 = new bp0(3);
                bp0Var5.f25081b = 4;
                arrayList.add(bp0Var5);
            }
        }
    }
}
