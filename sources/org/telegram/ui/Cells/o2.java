package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f19614a;
    public long f19615b;
    public boolean f19616c;
    public boolean d;
    public long e;
    public int f19617f;
    public Integer f19618g;
    public int h;
    public int f19619i;
    public boolean f19620j;
    public boolean f19621k;
    public float f19622l;
    public boolean f19623m;
    public int f19624n;
    public boolean f19625o = false;
    public long f19626p;
    public final r2 f19627q;

    public o2(r2 r2Var) {
        this.f19627q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f19625o;
        r2 r2Var = this.f19627q;
        if (!z10) {
            Integer num = this.f19618g;
            if (num != null && r2Var.f19781f3 != null) {
                float f7 = this.f19622l;
                if (f7 != 1.0f) {
                    this.f19622l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f19622l = Utilities.clamp(this.f19622l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f19622l;
                if (f10 != 0.0f) {
                    this.f19622l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f19622l = Utilities.clamp(this.f19622l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f19626p > 100) {
            this.f19625o = false;
        }
        r2Var.invalidate();
    }
}
