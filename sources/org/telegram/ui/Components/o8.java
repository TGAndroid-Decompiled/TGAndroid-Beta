package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class o8 implements org.telegram.ui.ActionBar.a2, lq {
    public final int f26721a;
    public final c9 f26722b;

    public o8(c9 c9Var, int i10) {
        this.f26721a = i10;
        this.f26722b = c9Var;
    }

    @Override
    public int K0(int i10) {
        return 0;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26721a) {
            case 0:
                this.f26722b.finishFragment();
                return;
            default:
                this.f26722b.finishFragment();
                return;
        }
    }

    @Override
    public void x0(int i10, int i11, boolean z10) {
        c9 c9Var = this.f26722b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        y8 y8Var = c9Var.Y;
                        int i12 = y8Var.f30173f;
                        if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                            y8 a2 = y8Var.a();
                            c9Var.Y = a2;
                            c9Var.f22979a.b(a2, true);
                            c9Var.n0();
                        }
                        c9Var.Y.f30173f = i10;
                    }
                } else {
                    y8 y8Var2 = c9Var.Y;
                    int i13 = y8Var2.e;
                    if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                        y8 a10 = y8Var2.a();
                        c9Var.Y = a10;
                        c9Var.f22979a.b(a10, true);
                        c9Var.n0();
                    }
                    c9Var.Y.e = i10;
                }
            } else {
                y8 y8Var3 = c9Var.Y;
                int i14 = y8Var3.d;
                if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                    y8 a11 = y8Var3.a();
                    c9Var.Y = a11;
                    c9Var.f22979a.b(a11, true);
                    c9Var.n0();
                }
                c9Var.Y.d = i10;
            }
        } else {
            y8 y8Var4 = c9Var.Y;
            int i15 = y8Var4.f30172c;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                y8 a12 = y8Var4.a();
                c9Var.Y = a12;
                c9Var.f22979a.b(a12, true);
                c9Var.n0();
            }
            c9Var.Y.f30172c = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        c9Var.f22979a.invalidate();
    }

    @Override
    public void l(boolean z10) {
    }

    @Override
    public void y() {
    }
}
