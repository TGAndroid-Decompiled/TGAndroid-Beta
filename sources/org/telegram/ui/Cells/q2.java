package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class q2 {
    public long f31247a;
    public long f31248b;
    public boolean f31249c;
    public boolean d;
    public long f31250e;
    public int f31251f;
    public Integer f31252g;
    public int h;
    public int f31253i;
    public boolean f31254j;
    public boolean f31255k;
    public float f31256l;
    public boolean f31257m;
    public int f31258n;
    public boolean f31259o = false;
    public long f31260p;
    public final t2 f31261q;

    public q2(t2 t2Var) {
        this.f31261q = t2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f31259o;
        t2 t2Var = this.f31261q;
        if (!z10) {
            Integer num = this.f31252g;
            if (num != null && t2Var.f31575g3 != null) {
                float f10 = this.f31256l;
                if (f10 != 1.0f) {
                    this.f31256l = f10 + 0.08f;
                    t2Var.invalidate();
                    this.f31256l = Utilities.i(this.f31256l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f31256l;
                if (f11 != 0.0f) {
                    this.f31256l = f11 - 0.08f;
                    t2Var.invalidate();
                }
            }
            this.f31256l = Utilities.i(this.f31256l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f31260p > 100) {
            this.f31259o = false;
        }
        t2Var.invalidate();
    }
}
