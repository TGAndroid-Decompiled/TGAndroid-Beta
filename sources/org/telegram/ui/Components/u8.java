package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class u8 implements org.telegram.ui.ActionBar.z1, yq {
    public final int f29605a;
    public final h9 f29606b;

    public u8(h9 h9Var, int i10) {
        this.f29605a = i10;
        this.f29606b = h9Var;
    }

    @Override
    public int L0(int i10) {
        return 0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29605a) {
            case 0:
                this.f29606b.finishFragment();
                return;
            default:
                this.f29606b.finishFragment();
                return;
        }
    }

    @Override
    public void t0(int i10, int i11, boolean z10) {
        h9 h9Var = this.f29606b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        d9 d9Var = h9Var.Y;
                        int i12 = d9Var.f24323f;
                        if (i12 != i10 && (i12 == 0 || i10 == 0)) {
                            d9 a2 = d9Var.a();
                            h9Var.Y = a2;
                            h9Var.f25564a.b(a2, true);
                            h9Var.n0();
                        }
                        h9Var.Y.f24323f = i10;
                    }
                } else {
                    d9 d9Var2 = h9Var.Y;
                    int i13 = d9Var2.e;
                    if (i13 != i10 && (i13 == 0 || i10 == 0)) {
                        d9 a10 = d9Var2.a();
                        h9Var.Y = a10;
                        h9Var.f25564a.b(a10, true);
                        h9Var.n0();
                    }
                    h9Var.Y.e = i10;
                }
            } else {
                d9 d9Var3 = h9Var.Y;
                int i14 = d9Var3.d;
                if (i14 != i10 && (i14 == 0 || i10 == 0)) {
                    d9 a11 = d9Var3.a();
                    h9Var.Y = a11;
                    h9Var.f25564a.b(a11, true);
                    h9Var.n0();
                }
                h9Var.Y.d = i10;
            }
        } else {
            d9 d9Var4 = h9Var.Y;
            int i15 = d9Var4.f24322c;
            if (i15 != i10 && (i15 == 0 || i10 == 0)) {
                d9 a12 = d9Var4.a();
                h9Var.Y = a12;
                h9Var.f25564a.b(a12, true);
                h9Var.n0();
            }
            h9Var.Y.f24322c = i10;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        h9Var.f25564a.invalidate();
    }

    @Override
    public void k(boolean z10) {
    }

    @Override
    public void y() {
    }
}
