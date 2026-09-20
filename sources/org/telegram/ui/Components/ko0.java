package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ko0 extends o81 {
    public final ArrayList f25842a = new ArrayList();
    public final org.telegram.ui.ey f25843b;

    public ko0(org.telegram.ui.ey eyVar) {
        this.f25843b = eyVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ey eyVar = this.f25843b;
        eyVar.P(view, i10, eyVar.L0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.ey eyVar = this.f25843b;
        org.telegram.ui.uy uyVar = eyVar.K0;
        if (i10 == 1) {
            return eyVar.V;
        }
        if (i10 == 3) {
            return eyVar.f26200g0;
        }
        if (i10 == 4) {
            return eyVar.f26205l0;
        }
        if (i10 == 5) {
            return eyVar.f26211s0;
        }
        if (i10 == 2) {
            in0 in0Var = new in0(eyVar.I0, uyVar);
            eyVar.H0 = in0Var;
            in0Var.b(eyVar.V0, eyVar.W0, false);
            eyVar.H0.f25087b.setClipToPadding(false);
            eyVar.H0.f25087b.j(new io0(this, 0));
            eyVar.H0.f25087b.D0(new jc0(eyVar, 23));
            eyVar.H0.setUiCallback(eyVar);
            return eyVar.H0;
        } else if (i10 == 6) {
            return eyVar.f26209q0;
        } else {
            org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(uyVar);
            x10Var.setChatPreviewDelegate(eyVar.Q0);
            x10Var.setUiCallback(eyVar);
            x10Var.j(eyVar.V0, eyVar.W0, false);
            ah.c cVar = eyVar.Y0;
            if (cVar != null) {
                x10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = x10Var.f39294b;
            w0Var.setClipToPadding(false);
            w0Var.j(new io0(this, 1));
            w0Var.D0(new jc0(eyVar, 23));
            return x10Var;
        }
    }

    @Override
    public final int e() {
        return this.f25842a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f25842a;
        if (((jo0) arrayList.get(i10)).f25416a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((jo0) arrayList.get(i10)).f25416a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((jo0) arrayList.get(i10)).f25416a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((jo0) arrayList.get(i10)).f25416a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((jo0) arrayList.get(i10)).f25416a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((jo0) arrayList.get(i10)).f25416a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.f9915c3[((jo0) arrayList.get(i10)).f25417b];
        String str = q0Var.f9899c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9898b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f25842a;
        if (((jo0) arrayList.get(i10)).f25416a == 0) {
            return 1;
        }
        if (((jo0) arrayList.get(i10)).f25416a == 1) {
            return 3;
        }
        if (((jo0) arrayList.get(i10)).f25416a == 4) {
            return 4;
        }
        if (((jo0) arrayList.get(i10)).f25416a == 2) {
            return 2;
        }
        if (((jo0) arrayList.get(i10)).f25416a == 5) {
            return 5;
        }
        if (((jo0) arrayList.get(i10)).f25416a == 6) {
            return 6;
        }
        return ((jo0) arrayList.get(i10)).f25416a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f25842a;
        arrayList.clear();
        arrayList.add(new jo0(0));
        org.telegram.ui.ey eyVar = this.f25843b;
        if (eyVar.U0 == 0) {
            if (eyVar.f26210r0) {
                arrayList.add(new jo0(5));
            }
            arrayList.add(new jo0(1));
            arrayList.add(new jo0(4));
            arrayList.add(new jo0(6));
            if (!eyVar.P0) {
                jo0 jo0Var = new jo0(3);
                jo0Var.f25417b = 0;
                arrayList.add(jo0Var);
                org.telegram.ui.ox oxVar = eyVar.f33418c1.F3;
                if (oxVar == null || !oxVar.c()) {
                    arrayList.add(new jo0(2));
                }
                jo0 jo0Var2 = new jo0(3);
                jo0Var2.f25417b = 1;
                arrayList.add(jo0Var2);
                jo0 jo0Var3 = new jo0(3);
                jo0Var3.f25417b = 2;
                arrayList.add(jo0Var3);
                jo0 jo0Var4 = new jo0(3);
                jo0Var4.f25417b = 3;
                arrayList.add(jo0Var4);
                jo0 jo0Var5 = new jo0(3);
                jo0Var5.f25417b = 4;
                arrayList.add(jo0Var5);
            }
        }
    }
}
