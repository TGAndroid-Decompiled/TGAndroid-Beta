package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class s2 {
    public long f22983a;
    public long f22984b;
    public boolean f22985c;
    public boolean d;
    public long e;
    public int f22986f;
    public Integer f22987g;
    public int h;
    public int f22988i;
    public boolean f22989j;
    public boolean f22990k;
    public float f22991l;
    public boolean f22992m;
    public int f22993n;
    public boolean f22994o = false;
    public long f22995p;
    public final v2 f22996q;

    public s2(v2 v2Var) {
        this.f22996q = v2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22994o;
        v2 v2Var = this.f22996q;
        if (!z10) {
            Integer num = this.f22987g;
            if (num != null && v2Var.f23201f3 != null) {
                float f7 = this.f22991l;
                if (f7 != 1.0f) {
                    this.f22991l = f7 + 0.08f;
                    v2Var.invalidate();
                    this.f22991l = Utilities.i(this.f22991l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22991l;
                if (f10 != 0.0f) {
                    this.f22991l = f10 - 0.08f;
                    v2Var.invalidate();
                }
            }
            this.f22991l = Utilities.i(this.f22991l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22995p > 100) {
            this.f22994o = false;
        }
        v2Var.invalidate();
    }
}
