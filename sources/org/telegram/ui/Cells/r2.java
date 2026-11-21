package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class r2 {
    public long f31697a;
    public long f31698b;
    public boolean f31699c;
    public boolean d;
    public long f31700e;
    public int f31701f;
    public Integer f31702g;
    public int h;
    public int f31703i;
    public boolean f31704j;
    public boolean f31705k;
    public float f31706l;
    public boolean f31707m;
    public int f31708n;
    public boolean f31709o = false;
    public long f31710p;
    public final u2 f31711q;

    public r2(u2 u2Var) {
        this.f31711q = u2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f31709o;
        u2 u2Var = this.f31711q;
        if (!z10) {
            Integer num = this.f31702g;
            if (num != null && u2Var.f31953g3 != null) {
                float f10 = this.f31706l;
                if (f10 != 1.0f) {
                    this.f31706l = f10 + 0.08f;
                    u2Var.invalidate();
                    this.f31706l = Utilities.i(this.f31706l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f31706l;
                if (f11 != 0.0f) {
                    this.f31706l = f11 - 0.08f;
                    u2Var.invalidate();
                }
            }
            this.f31706l = Utilities.i(this.f31706l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f31710p > 100) {
            this.f31709o = false;
        }
        u2Var.invalidate();
    }
}
