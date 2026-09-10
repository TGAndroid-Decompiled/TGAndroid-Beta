package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class q8 implements org.telegram.ui.ActionBar.c2, rq {
    public final int f26335a;
    public final d9 f26336b;

    public q8(d9 d9Var, int i10) {
        this.f26335a = i10;
        this.f26336b = d9Var;
    }

    @Override
    public int K0(int i10) {
        return 0;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f26335a) {
            case 0:
                this.f26336b.finishFragment();
                return;
            default:
                this.f26336b.finishFragment();
                return;
        }
    }

    @Override
    public void t0(int i10, int i11, boolean z10) {
        d9 d9Var = this.f26336b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        z8 z8Var = d9Var.Y;
                        int i12 = z8Var.f29616f;
                        if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                            z8 a2 = z8Var.a();
                            d9Var.Y = a2;
                            d9Var.f22325a.b(a2, true);
                            d9Var.n0();
                        }
                        d9Var.Y.f29616f = i10;
                    }
                } else {
                    z8 z8Var2 = d9Var.Y;
                    int i13 = z8Var2.e;
                    if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                        z8 a10 = z8Var2.a();
                        d9Var.Y = a10;
                        d9Var.f22325a.b(a10, true);
                        d9Var.n0();
                    }
                    d9Var.Y.e = i10;
                }
            } else {
                z8 z8Var3 = d9Var.Y;
                int i14 = z8Var3.d;
                if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                    z8 a11 = z8Var3.a();
                    d9Var.Y = a11;
                    d9Var.f22325a.b(a11, true);
                    d9Var.n0();
                }
                d9Var.Y.d = i10;
            }
        } else {
            z8 z8Var4 = d9Var.Y;
            int i15 = z8Var4.f29615c;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                z8 a12 = z8Var4.a();
                d9Var.Y = a12;
                d9Var.f22325a.b(a12, true);
                d9Var.n0();
            }
            d9Var.Y.f29615c = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        d9Var.f22325a.invalidate();
    }

    @Override
    public void k(boolean z10) {
    }

    @Override
    public void x() {
    }
}
