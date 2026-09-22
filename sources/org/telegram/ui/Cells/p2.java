package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f20805a;
    public long f20806b;
    public boolean f20807c;
    public boolean d;
    public long e;
    public int f20808f;
    public Integer f20809g;
    public int h;
    public int f20810i;
    public boolean f20811j;
    public boolean f20812k;
    public float f20813l;
    public boolean f20814m;
    public int f20815n;
    public boolean f20816o = false;
    public long f20817p;
    public final s2 f20818q;

    public p2(s2 s2Var) {
        this.f20818q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20816o;
        s2 s2Var = this.f20818q;
        if (!z10) {
            Integer num = this.f20809g;
            if (num != null && s2Var.f20967f3 != null) {
                float f7 = this.f20813l;
                if (f7 != 1.0f) {
                    this.f20813l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f20813l = Utilities.clamp(this.f20813l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20813l;
                if (f10 != 0.0f) {
                    this.f20813l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f20813l = Utilities.clamp(this.f20813l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20817p > 100) {
            this.f20816o = false;
        }
        s2Var.invalidate();
    }
}
