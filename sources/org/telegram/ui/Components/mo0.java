package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mo0 extends q81 {
    public final ArrayList f26492a = new ArrayList();
    public final org.telegram.ui.ey f26493b;

    public mo0(org.telegram.ui.ey eyVar) {
        this.f26493b = eyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ey eyVar = this.f26493b;
        eyVar.P(view, i10, eyVar.L0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.ey eyVar = this.f26493b;
        org.telegram.ui.uy uyVar = eyVar.K0;
        if (i10 == 1) {
            return eyVar.V;
        }
        if (i10 == 3) {
            return eyVar.f26842g0;
        }
        if (i10 == 4) {
            return eyVar.f26847l0;
        }
        if (i10 == 5) {
            return eyVar.f26853s0;
        }
        if (i10 == 2) {
            kn0 kn0Var = new kn0(eyVar.I0, uyVar);
            eyVar.H0 = kn0Var;
            kn0Var.b(eyVar.V0, eyVar.W0, false);
            eyVar.H0.f25766b.setClipToPadding(false);
            eyVar.H0.f25766b.j(new ko0(this, 0));
            eyVar.H0.f25766b.D0(new jc0(eyVar, 24));
            eyVar.H0.setUiCallback(eyVar);
            return eyVar.H0;
        } else if (i10 == 6) {
            return eyVar.f26851q0;
        } else {
            org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(uyVar);
            x10Var.setChatPreviewDelegate(eyVar.Q0);
            x10Var.setUiCallback(eyVar);
            x10Var.j(eyVar.V0, eyVar.W0, false);
            ah.c cVar = eyVar.Y0;
            if (cVar != null) {
                x10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = x10Var.f39318b;
            w0Var.setClipToPadding(false);
            w0Var.j(new ko0(this, 1));
            w0Var.D0(new jc0(eyVar, 24));
            return x10Var;
        }
    }

    @Override
    public final int e() {
        return this.f26492a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f26492a;
        if (((lo0) arrayList.get(i10)).f26153a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((lo0) arrayList.get(i10)).f26153a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((lo0) arrayList.get(i10)).f26153a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((lo0) arrayList.get(i10)).f26153a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((lo0) arrayList.get(i10)).f26153a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((lo0) arrayList.get(i10)).f26153a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.f9915c3[((lo0) arrayList.get(i10)).f26154b];
        String str = q0Var.f9899c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9898b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f26492a;
        if (((lo0) arrayList.get(i10)).f26153a == 0) {
            return 1;
        }
        if (((lo0) arrayList.get(i10)).f26153a == 1) {
            return 3;
        }
        if (((lo0) arrayList.get(i10)).f26153a == 4) {
            return 4;
        }
        if (((lo0) arrayList.get(i10)).f26153a == 2) {
            return 2;
        }
        if (((lo0) arrayList.get(i10)).f26153a == 5) {
            return 5;
        }
        if (((lo0) arrayList.get(i10)).f26153a == 6) {
            return 6;
        }
        return ((lo0) arrayList.get(i10)).f26153a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f26492a;
        arrayList.clear();
        arrayList.add(new lo0(0));
        org.telegram.ui.ey eyVar = this.f26493b;
        if (eyVar.U0 == 0) {
            if (eyVar.f26852r0) {
                arrayList.add(new lo0(5));
            }
            arrayList.add(new lo0(1));
            arrayList.add(new lo0(4));
            arrayList.add(new lo0(6));
            if (!eyVar.P0) {
                lo0 lo0Var = new lo0(3);
                lo0Var.f26154b = 0;
                arrayList.add(lo0Var);
                org.telegram.ui.ox oxVar = eyVar.f33443c1.F3;
                if (oxVar == null || !oxVar.c()) {
                    arrayList.add(new lo0(2));
                }
                lo0 lo0Var2 = new lo0(3);
                lo0Var2.f26154b = 1;
                arrayList.add(lo0Var2);
                lo0 lo0Var3 = new lo0(3);
                lo0Var3.f26154b = 2;
                arrayList.add(lo0Var3);
                lo0 lo0Var4 = new lo0(3);
                lo0Var4.f26154b = 3;
                arrayList.add(lo0Var4);
                lo0 lo0Var5 = new lo0(3);
                lo0Var5.f26154b = 4;
                arrayList.add(lo0Var5);
            }
        }
    }
}
