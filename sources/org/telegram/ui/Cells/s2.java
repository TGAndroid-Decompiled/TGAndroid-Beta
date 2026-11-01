package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class s2 {
    public long f22984a;
    public long f22985b;
    public boolean f22986c;
    public boolean d;
    public long e;
    public int f22987f;
    public Integer f22988g;
    public int h;
    public int f22989i;
    public boolean f22990j;
    public boolean f22991k;
    public float f22992l;
    public boolean f22993m;
    public int f22994n;
    public boolean f22995o = false;
    public long f22996p;
    public final v2 f22997q;

    public s2(v2 v2Var) {
        this.f22997q = v2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22995o;
        v2 v2Var = this.f22997q;
        if (!z10) {
            Integer num = this.f22988g;
            if (num != null && v2Var.f23202f3 != null) {
                float f7 = this.f22992l;
                if (f7 != 1.0f) {
                    this.f22992l = f7 + 0.08f;
                    v2Var.invalidate();
                    this.f22992l = Utilities.i(this.f22992l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22992l;
                if (f10 != 0.0f) {
                    this.f22992l = f10 - 0.08f;
                    v2Var.invalidate();
                }
            }
            this.f22992l = Utilities.i(this.f22992l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22996p > 100) {
            this.f22995o = false;
        }
        v2Var.invalidate();
    }
}
