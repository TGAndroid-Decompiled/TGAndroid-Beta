package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class q8 implements org.telegram.ui.ActionBar.a2, lq {
    public final int f27482a;
    public final e9 f27483b;

    public q8(e9 e9Var, int i10) {
        this.f27482a = i10;
        this.f27483b = e9Var;
    }

    @Override
    public int K0(int i10) {
        return 0;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f27482a) {
            case 0:
                this.f27483b.finishFragment();
                return;
            default:
                this.f27483b.finishFragment();
                return;
        }
    }

    @Override
    public void x0(int i10, int i11, boolean z10) {
        e9 e9Var = this.f27483b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        a9 a9Var = e9Var.Y;
                        int i12 = a9Var.f22567f;
                        if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                            a9 a2 = a9Var.a();
                            e9Var.Y = a2;
                            e9Var.f23811a.b(a2, true);
                            e9Var.n0();
                        }
                        e9Var.Y.f22567f = i10;
                    }
                } else {
                    a9 a9Var2 = e9Var.Y;
                    int i13 = a9Var2.e;
                    if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                        a9 a10 = a9Var2.a();
                        e9Var.Y = a10;
                        e9Var.f23811a.b(a10, true);
                        e9Var.n0();
                    }
                    e9Var.Y.e = i10;
                }
            } else {
                a9 a9Var3 = e9Var.Y;
                int i14 = a9Var3.d;
                if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                    a9 a11 = a9Var3.a();
                    e9Var.Y = a11;
                    e9Var.f23811a.b(a11, true);
                    e9Var.n0();
                }
                e9Var.Y.d = i10;
            }
        } else {
            a9 a9Var4 = e9Var.Y;
            int i15 = a9Var4.f22566c;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                a9 a12 = a9Var4.a();
                e9Var.Y = a12;
                e9Var.f23811a.b(a12, true);
                e9Var.n0();
            }
            e9Var.Y.f22566c = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        e9Var.f23811a.invalidate();
    }

    @Override
    public void l(boolean z10) {
    }

    @Override
    public void y() {
    }
}
