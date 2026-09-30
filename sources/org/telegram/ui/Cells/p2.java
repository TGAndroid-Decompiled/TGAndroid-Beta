package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f20803a;
    public long f20804b;
    public boolean f20805c;
    public boolean d;
    public long e;
    public int f20806f;
    public Integer f20807g;
    public int h;
    public int f20808i;
    public boolean f20809j;
    public boolean f20810k;
    public float f20811l;
    public boolean f20812m;
    public int f20813n;
    public boolean f20814o = false;
    public long f20815p;
    public final s2 f20816q;

    public p2(s2 s2Var) {
        this.f20816q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20814o;
        s2 s2Var = this.f20816q;
        if (!z10) {
            Integer num = this.f20807g;
            if (num != null && s2Var.f20968f3 != null) {
                float f7 = this.f20811l;
                if (f7 != 1.0f) {
                    this.f20811l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f20811l = Utilities.clamp(this.f20811l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20811l;
                if (f10 != 0.0f) {
                    this.f20811l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f20811l = Utilities.clamp(this.f20811l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20815p > 100) {
            this.f20814o = false;
        }
        s2Var.invalidate();
    }
}
