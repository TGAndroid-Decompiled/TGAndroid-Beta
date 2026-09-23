package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f20513a;
    public long f20514b;
    public boolean f20515c;
    public boolean d;
    public long e;
    public int f20516f;
    public Integer f20517g;
    public int h;
    public int f20518i;
    public boolean f20519j;
    public boolean f20520k;
    public float f20521l;
    public boolean f20522m;
    public int f20523n;
    public boolean f20524o = false;
    public long f20525p;
    public final r2 f20526q;

    public o2(r2 r2Var) {
        this.f20526q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20524o;
        r2 r2Var = this.f20526q;
        if (!z10) {
            Integer num = this.f20517g;
            if (num != null && r2Var.f20661f3 != null) {
                float f7 = this.f20521l;
                if (f7 != 1.0f) {
                    this.f20521l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f20521l = Utilities.clamp(this.f20521l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20521l;
                if (f10 != 0.0f) {
                    this.f20521l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f20521l = Utilities.clamp(this.f20521l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20525p > 100) {
            this.f20524o = false;
        }
        r2Var.invalidate();
    }
}
