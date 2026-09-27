package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lo0 extends p81 {
    public final ArrayList f26106a = new ArrayList();
    public final org.telegram.ui.ay f26107b;

    public lo0(org.telegram.ui.ay ayVar) {
        this.f26107b = ayVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ay ayVar = this.f26107b;
        ayVar.P(view, i10, ayVar.L0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.ay ayVar = this.f26107b;
        org.telegram.ui.ty tyVar = ayVar.K0;
        if (i10 == 1) {
            return ayVar.V;
        }
        if (i10 == 3) {
            return ayVar.f26500g0;
        }
        if (i10 == 4) {
            return ayVar.f26505l0;
        }
        if (i10 == 5) {
            return ayVar.f26511s0;
        }
        if (i10 == 2) {
            kn0 kn0Var = new kn0(ayVar.I0, tyVar);
            ayVar.H0 = kn0Var;
            kn0Var.b(ayVar.V0, ayVar.W0, false);
            ayVar.H0.f25798b.setClipToPadding(false);
            ayVar.H0.f25798b.j(new jo0(this, 0));
            ayVar.H0.f25798b.D0(new jc0(ayVar, 24));
            ayVar.H0.setUiCallback(ayVar);
            return ayVar.H0;
        } else if (i10 == 6) {
            return ayVar.f26509q0;
        } else {
            org.telegram.ui.w10 w10Var = new org.telegram.ui.w10(tyVar);
            w10Var.setChatPreviewDelegate(ayVar.Q0);
            w10Var.setUiCallback(ayVar);
            w10Var.j(ayVar.V0, ayVar.W0, false);
            ah.c cVar = ayVar.Y0;
            if (cVar != null) {
                w10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = w10Var.f38757b;
            w0Var.setClipToPadding(false);
            w0Var.j(new jo0(this, 1));
            w0Var.D0(new jc0(ayVar, 24));
            return w10Var;
        }
    }

    @Override
    public final int e() {
        return this.f26106a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f26106a;
        if (((ko0) arrayList.get(i10)).f25807a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((ko0) arrayList.get(i10)).f25807a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((ko0) arrayList.get(i10)).f25807a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((ko0) arrayList.get(i10)).f25807a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((ko0) arrayList.get(i10)).f25807a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((ko0) arrayList.get(i10)).f25807a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.f9902c3[((ko0) arrayList.get(i10)).f25808b];
        String str = q0Var.f9886c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9885b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f26106a;
        if (((ko0) arrayList.get(i10)).f25807a == 0) {
            return 1;
        }
        if (((ko0) arrayList.get(i10)).f25807a == 1) {
            return 3;
        }
        if (((ko0) arrayList.get(i10)).f25807a == 4) {
            return 4;
        }
        if (((ko0) arrayList.get(i10)).f25807a == 2) {
            return 2;
        }
        if (((ko0) arrayList.get(i10)).f25807a == 5) {
            return 5;
        }
        if (((ko0) arrayList.get(i10)).f25807a == 6) {
            return 6;
        }
        return ((ko0) arrayList.get(i10)).f25807a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f26106a;
        arrayList.clear();
        arrayList.add(new ko0(0));
        org.telegram.ui.ay ayVar = this.f26107b;
        if (ayVar.U0 == 0) {
            if (ayVar.f26510r0) {
                arrayList.add(new ko0(5));
            }
            arrayList.add(new ko0(1));
            arrayList.add(new ko0(4));
            arrayList.add(new ko0(6));
            if (!ayVar.P0) {
                ko0 ko0Var = new ko0(3);
                ko0Var.f25808b = 0;
                arrayList.add(ko0Var);
                org.telegram.ui.kx kxVar = ayVar.f32173c1.F3;
                if (kxVar == null || !kxVar.c()) {
                    arrayList.add(new ko0(2));
                }
                ko0 ko0Var2 = new ko0(3);
                ko0Var2.f25808b = 1;
                arrayList.add(ko0Var2);
                ko0 ko0Var3 = new ko0(3);
                ko0Var3.f25808b = 2;
                arrayList.add(ko0Var3);
                ko0 ko0Var4 = new ko0(3);
                ko0Var4.f25808b = 3;
                arrayList.add(ko0Var4);
                ko0 ko0Var5 = new ko0(3);
                ko0Var5.f25808b = 4;
                arrayList.add(ko0Var5);
            }
        }
    }
}
