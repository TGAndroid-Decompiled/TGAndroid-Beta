package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class j8 implements org.telegram.ui.ActionBar.b2, bq {
    public final int f29667a;
    public final w8 f29668b;

    public j8(w8 w8Var, int i9) {
        this.f29667a = i9;
        this.f29668b = w8Var;
    }

    @Override
    public int H0(int i9) {
        return 0;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f29667a) {
            case 0:
                this.f29668b.finishFragment();
                return;
            default:
                this.f29668b.finishFragment();
                return;
        }
    }

    @Override
    public void n0(int i9, int i10, boolean z10) {
        w8 w8Var = this.f29668b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        s8 s8Var = w8Var.U;
                        int i11 = s8Var.f32395f;
                        if (i11 != i9 && (i11 == 0 || i9 == 0)) {
                            s8 a2 = s8Var.a();
                            w8Var.U = a2;
                            w8Var.f34138a.b(a2, true);
                            w8Var.m0();
                        }
                        w8Var.U.f32395f = i9;
                    }
                } else {
                    s8 s8Var2 = w8Var.U;
                    int i12 = s8Var2.f32394e;
                    if (i12 != i9 && (i12 == 0 || i9 == 0)) {
                        s8 a3 = s8Var2.a();
                        w8Var.U = a3;
                        w8Var.f34138a.b(a3, true);
                        w8Var.m0();
                    }
                    w8Var.U.f32394e = i9;
                }
            } else {
                s8 s8Var3 = w8Var.U;
                int i13 = s8Var3.d;
                if (i13 != i9 && (i13 == 0 || i9 == 0)) {
                    s8 a10 = s8Var3.a();
                    w8Var.U = a10;
                    w8Var.f34138a.b(a10, true);
                    w8Var.m0();
                }
                w8Var.U.d = i9;
            }
        } else {
            s8 s8Var4 = w8Var.U;
            int i14 = s8Var4.f32393c;
            if (i14 != i9 && (i14 == 0 || i9 == 0)) {
                s8 a11 = s8Var4.a();
                w8Var.U = a11;
                w8Var.f34138a.b(a11, true);
                w8Var.m0();
            }
            w8Var.U.f32393c = i9;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        w8Var.f34138a.invalidate();
    }

    @Override
    public void e(boolean z10) {
    }

    @Override
    public void k() {
    }
}
