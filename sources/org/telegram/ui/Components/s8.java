package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class s8 implements org.telegram.ui.ActionBar.a2, kq {
    public final int f30245a;
    public final f9 f30246b;

    public s8(f9 f9Var, int i10) {
        this.f30245a = i10;
        this.f30246b = f9Var;
    }

    @Override
    public void B0(int i10, int i11, boolean z10) {
        f9 f9Var = this.f30246b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        b9 b9Var = f9Var.Y;
                        int i12 = b9Var.f24630f;
                        if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                            b9 a2 = b9Var.a();
                            f9Var.Y = a2;
                            f9Var.f25991a.b(a2, true);
                            f9Var.n0();
                        }
                        f9Var.Y.f24630f = i10;
                    }
                } else {
                    b9 b9Var2 = f9Var.Y;
                    int i13 = b9Var2.f24629e;
                    if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                        b9 a10 = b9Var2.a();
                        f9Var.Y = a10;
                        f9Var.f25991a.b(a10, true);
                        f9Var.n0();
                    }
                    f9Var.Y.f24629e = i10;
                }
            } else {
                b9 b9Var3 = f9Var.Y;
                int i14 = b9Var3.d;
                if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                    b9 a11 = b9Var3.a();
                    f9Var.Y = a11;
                    f9Var.f25991a.b(a11, true);
                    f9Var.n0();
                }
                f9Var.Y.d = i10;
            }
        } else {
            b9 b9Var4 = f9Var.Y;
            int i15 = b9Var4.f24628c;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                b9 a12 = b9Var4.a();
                f9Var.Y = a12;
                f9Var.f25991a.b(a12, true);
                f9Var.n0();
            }
            f9Var.Y.f24628c = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        f9Var.f25991a.invalidate();
    }

    @Override
    public int M0(int i10) {
        return 0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30245a) {
            case 0:
                this.f30246b.finishFragment();
                return;
            default:
                this.f30246b.finishFragment();
                return;
        }
    }

    @Override
    public void k(boolean z10) {
    }

    @Override
    public void z() {
    }
}
