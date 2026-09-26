package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lo0 extends o81 {
    public final ArrayList f26138a = new ArrayList();
    public final org.telegram.ui.zx f26139b;

    public lo0(org.telegram.ui.zx zxVar) {
        this.f26139b = zxVar;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.zx zxVar = this.f26139b;
        zxVar.O(view, i10, zxVar.K0, true);
    }

    @Override
    public final View d(int i10) {
        org.telegram.ui.zx zxVar = this.f26139b;
        org.telegram.ui.qy qyVar = zxVar.J0;
        if (i10 == 1) {
            return zxVar.U;
        }
        if (i10 == 3) {
            return zxVar.f26467f0;
        }
        if (i10 == 4) {
            return zxVar.f26472k0;
        }
        if (i10 == 5) {
            return zxVar.f26478r0;
        }
        if (i10 == 2) {
            jn0 jn0Var = new jn0(zxVar.H0, qyVar);
            zxVar.G0 = jn0Var;
            jn0Var.b(zxVar.U0, zxVar.V0, false);
            zxVar.G0.f25474b.setClipToPadding(false);
            zxVar.G0.f25474b.j(new jo0(this, 0));
            zxVar.G0.f25474b.C0(new jc0(zxVar, 24));
            zxVar.G0.setUiCallback(zxVar);
            return zxVar.G0;
        } else if (i10 == 6) {
            return zxVar.f26476p0;
        } else {
            org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(qyVar);
            t10Var.setChatPreviewDelegate(zxVar.P0);
            t10Var.setUiCallback(zxVar);
            t10Var.j(zxVar.U0, zxVar.V0, false);
            ah.c cVar = zxVar.X0;
            if (cVar != null) {
                t10Var.setBlurredBackgroundDrawableFactory(cVar);
            }
            ai.w0 w0Var = t10Var.f37920b;
            w0Var.setClipToPadding(false);
            w0Var.j(new jo0(this, 1));
            w0Var.C0(new jc0(zxVar, 24));
            return t10Var;
        }
    }

    @Override
    public final int e() {
        return this.f26138a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f26138a;
        if (((ko0) arrayList.get(i10)).f25765a == 0) {
            return LocaleController.getString(R.string.SearchAllChatsShort);
        }
        if (((ko0) arrayList.get(i10)).f25765a == 1) {
            return LocaleController.getString(R.string.ChannelsTab);
        }
        if (((ko0) arrayList.get(i10)).f25765a == 4) {
            return LocaleController.getString(R.string.AppsTab);
        }
        if (((ko0) arrayList.get(i10)).f25765a == 6) {
            return LocaleController.getString(R.string.SearchPosts);
        }
        if (((ko0) arrayList.get(i10)).f25765a == 2) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        if (((ko0) arrayList.get(i10)).f25765a == 5) {
            return LocaleController.getString(R.string.PublicPostsTabs);
        }
        gg.q0 q0Var = gg.s0.f9896c3[((ko0) arrayList.get(i10)).f25766b];
        String str = q0Var.f9880c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9879b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f26138a;
        if (((ko0) arrayList.get(i10)).f25765a == 0) {
            return 1;
        }
        if (((ko0) arrayList.get(i10)).f25765a == 1) {
            return 3;
        }
        if (((ko0) arrayList.get(i10)).f25765a == 4) {
            return 4;
        }
        if (((ko0) arrayList.get(i10)).f25765a == 2) {
            return 2;
        }
        if (((ko0) arrayList.get(i10)).f25765a == 5) {
            return 5;
        }
        if (((ko0) arrayList.get(i10)).f25765a == 6) {
            return 6;
        }
        return ((ko0) arrayList.get(i10)).f25765a + i10;
    }

    public final void i() {
        ArrayList arrayList = this.f26138a;
        arrayList.clear();
        arrayList.add(new ko0(0));
        org.telegram.ui.zx zxVar = this.f26139b;
        if (zxVar.T0 == 0) {
            if (zxVar.f26477q0) {
                arrayList.add(new ko0(5));
            }
            arrayList.add(new ko0(1));
            arrayList.add(new ko0(4));
            arrayList.add(new ko0(6));
            if (!zxVar.O0) {
                ko0 ko0Var = new ko0(3);
                ko0Var.f25766b = 0;
                arrayList.add(ko0Var);
                org.telegram.ui.kx kxVar = zxVar.f40589b1.F3;
                if (kxVar == null || !kxVar.c()) {
                    arrayList.add(new ko0(2));
                }
                ko0 ko0Var2 = new ko0(3);
                ko0Var2.f25766b = 1;
                arrayList.add(ko0Var2);
                ko0 ko0Var3 = new ko0(3);
                ko0Var3.f25766b = 2;
                arrayList.add(ko0Var3);
                ko0 ko0Var4 = new ko0(3);
                ko0Var4.f25766b = 3;
                arrayList.add(ko0Var4);
                ko0 ko0Var5 = new ko0(3);
                ko0Var5.f25766b = 4;
                arrayList.add(ko0Var5);
            }
        }
    }
}
