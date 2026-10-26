package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class t8 implements org.telegram.ui.ActionBar.b2, xq {
    public final int f32904a;
    public final g9 f32905b;

    public t8(g9 g9Var, int i10) {
        this.f32904a = i10;
        this.f32905b = g9Var;
    }

    @Override
    public int M0(int i10) {
        return 0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f32904a) {
            case 0:
                this.f32905b.finishFragment();
                return;
            default:
                this.f32905b.finishFragment();
                return;
        }
    }

    @Override
    public void x0(int i10, int i11, boolean z10) {
        g9 g9Var = this.f32905b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        c9 c9Var = g9Var.Y;
                        int i12 = c9Var.f27096f;
                        if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                            c9 a2 = c9Var.a();
                            g9Var.Y = a2;
                            g9Var.f28489a.b(a2, true);
                            g9Var.o0();
                        }
                        g9Var.Y.f27096f = i10;
                    }
                } else {
                    c9 c9Var2 = g9Var.Y;
                    int i13 = c9Var2.e;
                    if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                        c9 a10 = c9Var2.a();
                        g9Var.Y = a10;
                        g9Var.f28489a.b(a10, true);
                        g9Var.o0();
                    }
                    g9Var.Y.e = i10;
                }
            } else {
                c9 c9Var3 = g9Var.Y;
                int i14 = c9Var3.d;
                if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                    c9 a11 = c9Var3.a();
                    g9Var.Y = a11;
                    g9Var.f28489a.b(a11, true);
                    g9Var.o0();
                }
                g9Var.Y.d = i10;
            }
        } else {
            c9 c9Var4 = g9Var.Y;
            int i15 = c9Var4.f27095c;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                c9 a12 = c9Var4.a();
                g9Var.Y = a12;
                g9Var.f28489a.b(a12, true);
                g9Var.o0();
            }
            g9Var.Y.f27095c = i10;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        g9Var.f28489a.invalidate();
    }

    @Override
    public void w() {
    }

    @Override
    public void k(boolean z10) {
    }
}
