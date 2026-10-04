package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class po0 extends x81 {
    public final ArrayList f29684a = new ArrayList();
    public final org.telegram.ui.dy f29685b;

    public po0(org.telegram.ui.dy dyVar) {
        this.f29685b = dyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.dy dyVar = this.f29685b;
        dyVar.Q(view, i10, dyVar.M0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.dy dyVar = this.f29685b;
        org.telegram.ui.uy uyVar = dyVar.L0;
        if (i10 == 1) {
            return dyVar.W;
        }
        if (i10 == 3) {
            return dyVar.f30129h0;
        }
        if (i10 == 4) {
            return dyVar.m0;
        }
        if (i10 == 5) {
            return dyVar.f30140t0;
        }
        if (i10 == 2) {
            on0 on0Var = new on0(dyVar.J0, uyVar);
            dyVar.I0 = on0Var;
            on0Var.b(dyVar.W0, dyVar.X0, false);
            dyVar.I0.f29413b.setClipToPadding(false);
            dyVar.I0.f29413b.j(new no0(this, 0));
            dyVar.I0.f29413b.D0(new lc0(dyVar, 24));
            dyVar.I0.setUiCallback(dyVar);
            return dyVar.I0;
        } else if (i10 == 6) {
            return dyVar.f30138r0;
        } else {
            org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(uyVar);
            x10Var.setChatPreviewDelegate(dyVar.R0);
            x10Var.setUiCallback(dyVar);
            x10Var.j(dyVar.W0, dyVar.X0, false);
            ah.c cVar = dyVar.Z0;
            if (cVar != null) {
                x10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = x10Var.f42690b;
            w0Var.setClipToPadding(false);
            w0Var.j(new no0(this, 1));
            w0Var.D0(new lc0(dyVar, 24));
            return x10Var;
        }
    }

    @Override
    public final int e() {
        return this.f29684a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f29684a;
        if (((oo0) arrayList.get(i10)).f29426a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((oo0) arrayList.get(i10)).f29426a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((oo0) arrayList.get(i10)).f29426a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((oo0) arrayList.get(i10)).f29426a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((oo0) arrayList.get(i10)).f29426a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((oo0) arrayList.get(i10)).f29426a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.j3[((oo0) arrayList.get(i10)).f29427b];
        String str = q0Var.f10757c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f10756b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f29684a;
        if (((oo0) arrayList.get(i10)).f29426a == 0) {
            return 1;
        }
        if (((oo0) arrayList.get(i10)).f29426a == 1) {
            return 3;
        }
        if (((oo0) arrayList.get(i10)).f29426a == 4) {
            return 4;
        }
        if (((oo0) arrayList.get(i10)).f29426a == 2) {
            return 2;
        }
        if (((oo0) arrayList.get(i10)).f29426a == 5) {
            return 5;
        }
        if (((oo0) arrayList.get(i10)).f29426a == 6) {
            return 6;
        }
        return ((oo0) arrayList.get(i10)).f29426a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f29684a;
        arrayList.clear();
        arrayList.add(new oo0(0));
        org.telegram.ui.dy dyVar = this.f29685b;
        if (dyVar.V0 == 0) {
            if (dyVar.f30139s0) {
                arrayList.add(new oo0(5));
            }
            arrayList.add(new oo0(1));
            arrayList.add(new oo0(4));
            arrayList.add(new oo0(6));
            if (!dyVar.Q0) {
                oo0 oo0Var = new oo0(3);
                oo0Var.f29427b = 0;
                arrayList.add(oo0Var);
                org.telegram.ui.mx mxVar = dyVar.f35864d1.F3;
                if (mxVar == null || !mxVar.c()) {
                    arrayList.add(new oo0(2));
                }
                oo0 oo0Var2 = new oo0(3);
                oo0Var2.f29427b = 1;
                arrayList.add(oo0Var2);
                oo0 oo0Var3 = new oo0(3);
                oo0Var3.f29427b = 2;
                arrayList.add(oo0Var3);
                oo0 oo0Var4 = new oo0(3);
                oo0Var4.f29427b = 3;
                arrayList.add(oo0Var4);
                oo0 oo0Var5 = new oo0(3);
                oo0Var5.f29427b = 4;
                arrayList.add(oo0Var5);
            }
        }
    }
}
