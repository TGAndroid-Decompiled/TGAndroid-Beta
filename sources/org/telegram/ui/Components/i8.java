package org.telegram.ui.Components;

import android.os.Build;
import org.telegram.messenger.NotificationCenter;

public final class i8 implements org.telegram.ui.ActionBar.a2, zp {

    public final int f29267a;

    public final v8 f29268b;

    public i8(v8 v8Var, int i10) {
        this.f29267a = i10;
        this.f29268b = v8Var;
    }

    @Override
    public int D0(int i10) {
        return 0;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29267a) {
            case 0:
                this.f29268b.finishFragment();
                break;
            default:
                this.f29268b.finishFragment();
                break;
        }
    }

    @Override
    public void n0(int i10, int i11, boolean z10) {
        v8 v8Var = this.f29268b;
        if (i11 == 0) {
            r8 r8Var = v8Var.U;
            int i12 = r8Var.f32101c;
            if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                r8 r8VarA = r8Var.a();
                v8Var.U = r8VarA;
                v8Var.f33295a.b(r8VarA, true);
                v8Var.n0();
            }
            v8Var.U.f32101c = i10;
        } else if (i11 == 1) {
            r8 r8Var2 = v8Var.U;
            int i13 = r8Var2.d;
            if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                r8 r8VarA2 = r8Var2.a();
                v8Var.U = r8VarA2;
                v8Var.f33295a.b(r8VarA2, true);
                v8Var.n0();
            }
            v8Var.U.d = i10;
        } else if (i11 == 2) {
            r8 r8Var3 = v8Var.U;
            int i14 = r8Var3.f32102e;
            if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                r8 r8VarA3 = r8Var3.a();
                v8Var.U = r8VarA3;
                v8Var.f33295a.b(r8VarA3, true);
                v8Var.n0();
            }
            v8Var.U.f32102e = i10;
        } else if (i11 == 3) {
            r8 r8Var4 = v8Var.U;
            int i15 = r8Var4.f32103f;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                r8 r8VarA4 = r8Var4.a();
                v8Var.U = r8VarA4;
                v8Var.f33295a.b(r8VarA4, true);
                v8Var.n0();
            }
            v8Var.U.f32103f = i10;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        v8Var.f33295a.invalidate();
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void n() {
    }
}
