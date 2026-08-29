package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class o8 implements org.telegram.ui.ActionBar.b2, fq {
    public final int f31280a;
    public final b9 f31281b;

    public o8(b9 b9Var, int i10) {
        this.f31280a = i10;
        this.f31281b = b9Var;
    }

    @Override
    public int G0(int i10) {
        return 0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f31280a) {
            case 0:
                this.f31281b.finishFragment();
                return;
            default:
                this.f31281b.finishFragment();
                return;
        }
    }

    @Override
    public void s0(int i10, int i11, boolean z10) {
        b9 b9Var = this.f31281b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        x8 x8Var = b9Var.U;
                        int i12 = x8Var.f34652f;
                        if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                            x8 a2 = x8Var.a();
                            b9Var.U = a2;
                            b9Var.f27003a.b(a2, true);
                            b9Var.n0();
                        }
                        b9Var.U.f34652f = i10;
                    }
                } else {
                    x8 x8Var2 = b9Var.U;
                    int i13 = x8Var2.f34651e;
                    if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                        x8 a10 = x8Var2.a();
                        b9Var.U = a10;
                        b9Var.f27003a.b(a10, true);
                        b9Var.n0();
                    }
                    b9Var.U.f34651e = i10;
                }
            } else {
                x8 x8Var3 = b9Var.U;
                int i14 = x8Var3.d;
                if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                    x8 a11 = x8Var3.a();
                    b9Var.U = a11;
                    b9Var.f27003a.b(a11, true);
                    b9Var.n0();
                }
                b9Var.U.d = i10;
            }
        } else {
            x8 x8Var4 = b9Var.U;
            int i15 = x8Var4.f34650c;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                x8 a12 = x8Var4.a();
                b9Var.U = a12;
                b9Var.f27003a.b(a12, true);
                b9Var.n0();
            }
            b9Var.U.f34650c = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        b9Var.f27003a.invalidate();
    }

    @Override
    public void i(boolean z10) {
    }

    @Override
    public void q() {
    }
}
