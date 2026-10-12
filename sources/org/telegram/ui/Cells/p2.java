package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f22388a;
    public long f22389b;
    public boolean f22390c;
    public boolean d;
    public long f22391e;
    public int f22392f;
    public Integer f22393g;
    public int h;
    public int f22394i;
    public boolean f22395j;
    public boolean f22396k;
    public float f22397l;
    public boolean f22398m;
    public int f22399n;
    public boolean f22400o = false;
    public long f22401p;
    public final s2 f22402q;

    public p2(s2 s2Var) {
        this.f22402q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22400o;
        s2 s2Var = this.f22402q;
        if (!z10) {
            Integer num = this.f22393g;
            if (num != null && s2Var.f22557f3 != null) {
                float f7 = this.f22397l;
                if (f7 != 1.0f) {
                    this.f22397l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f22397l = Utilities.clamp(this.f22397l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22397l;
                if (f10 != 0.0f) {
                    this.f22397l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f22397l = Utilities.clamp(this.f22397l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22401p > 100) {
            this.f22400o = false;
        }
        s2Var.invalidate();
    }
}
