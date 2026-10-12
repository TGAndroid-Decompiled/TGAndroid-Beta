package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class s8 implements org.telegram.ui.ActionBar.z1, dr {
    public final int f30438a;
    public final g9 f30439b;

    public s8(g9 g9Var, int i10) {
        this.f30438a = i10;
        this.f30439b = g9Var;
    }

    @Override
    public int H0(int i10) {
        return 0;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30438a) {
            case 0:
                this.f30439b.finishFragment();
                return;
            default:
                this.f30439b.finishFragment();
                return;
        }
    }

    @Override
    public void t0(int i10, int i11, boolean z10) {
        g9 g9Var = this.f30439b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        c9 c9Var = g9Var.Y;
                        int i12 = c9Var.f24863f;
                        if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                            c9 a2 = c9Var.a();
                            g9Var.Y = a2;
                            g9Var.f26350a.b(a2, true);
                            g9Var.n0();
                        }
                        g9Var.Y.f24863f = i10;
                    }
                } else {
                    c9 c9Var2 = g9Var.Y;
                    int i13 = c9Var2.f24862e;
                    if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                        c9 a10 = c9Var2.a();
                        g9Var.Y = a10;
                        g9Var.f26350a.b(a10, true);
                        g9Var.n0();
                    }
                    g9Var.Y.f24862e = i10;
                }
            } else {
                c9 c9Var3 = g9Var.Y;
                int i14 = c9Var3.d;
                if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                    c9 a11 = c9Var3.a();
                    g9Var.Y = a11;
                    g9Var.f26350a.b(a11, true);
                    g9Var.n0();
                }
                g9Var.Y.d = i10;
            }
        } else {
            c9 c9Var4 = g9Var.Y;
            int i15 = c9Var4.f24861c;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                c9 a12 = c9Var4.a();
                g9Var.Y = a12;
                g9Var.f26350a.b(a12, true);
                g9Var.n0();
            }
            g9Var.Y.f24861c = i10;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        g9Var.f26350a.invalidate();
    }

    @Override
    public void l(boolean z10) {
    }

    @Override
    public void y() {
    }
}
