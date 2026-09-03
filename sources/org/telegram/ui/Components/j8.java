package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class j8 implements org.telegram.ui.ActionBar.c2, iq {
    public final int f25897a;
    public final w8 f25898b;

    public j8(w8 w8Var, int i10) {
        this.f25897a = i10;
        this.f25898b = w8Var;
    }

    @Override
    public int H0(int i10) {
        return 0;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f25897a) {
            case 0:
                this.f25898b.finishFragment();
                return;
            default:
                this.f25898b.finishFragment();
                return;
        }
    }

    @Override
    public void r0(int i10, int i11, boolean z4) {
        w8 w8Var = this.f25898b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        s8 s8Var = w8Var.V;
                        int i12 = s8Var.f28693f;
                        if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                            s8 a2 = s8Var.a();
                            w8Var.V = a2;
                            w8Var.f30173a.b(a2, true);
                            w8Var.n0();
                        }
                        w8Var.V.f28693f = i10;
                    }
                } else {
                    s8 s8Var2 = w8Var.V;
                    int i13 = s8Var2.e;
                    if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                        s8 a10 = s8Var2.a();
                        w8Var.V = a10;
                        w8Var.f30173a.b(a10, true);
                        w8Var.n0();
                    }
                    w8Var.V.e = i10;
                }
            } else {
                s8 s8Var3 = w8Var.V;
                int i14 = s8Var3.d;
                if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                    s8 a11 = s8Var3.a();
                    w8Var.V = a11;
                    w8Var.f30173a.b(a11, true);
                    w8Var.n0();
                }
                w8Var.V.d = i10;
            }
        } else {
            s8 s8Var4 = w8Var.V;
            int i15 = s8Var4.f28692c;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                s8 a12 = s8Var4.a();
                w8Var.V = a12;
                w8Var.f30173a.b(a12, true);
                w8Var.n0();
            }
            w8Var.V.f28692c = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        w8Var.f30173a.invalidate();
    }

    @Override
    public void k(boolean z4) {
    }

    @Override
    public void z() {
    }
}
