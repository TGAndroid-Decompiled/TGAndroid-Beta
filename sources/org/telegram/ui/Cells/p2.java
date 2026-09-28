package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f20786a;
    public long f20787b;
    public boolean f20788c;
    public boolean d;
    public long e;
    public int f20789f;
    public Integer f20790g;
    public int h;
    public int f20791i;
    public boolean f20792j;
    public boolean f20793k;
    public float f20794l;
    public boolean f20795m;
    public int f20796n;
    public boolean f20797o = false;
    public long f20798p;
    public final s2 f20799q;

    public p2(s2 s2Var) {
        this.f20799q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20797o;
        s2 s2Var = this.f20799q;
        if (!z10) {
            Integer num = this.f20790g;
            if (num != null && s2Var.f20949f3 != null) {
                float f7 = this.f20794l;
                if (f7 != 1.0f) {
                    this.f20794l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f20794l = Utilities.clamp(this.f20794l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20794l;
                if (f10 != 0.0f) {
                    this.f20794l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f20794l = Utilities.clamp(this.f20794l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20798p > 100) {
            this.f20797o = false;
        }
        s2Var.invalidate();
    }
}
