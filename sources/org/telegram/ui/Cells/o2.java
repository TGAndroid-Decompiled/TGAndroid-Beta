package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f20536a;
    public long f20537b;
    public boolean f20538c;
    public boolean d;
    public long e;
    public int f20539f;
    public Integer f20540g;
    public int h;
    public int f20541i;
    public boolean f20542j;
    public boolean f20543k;
    public float f20544l;
    public boolean f20545m;
    public int f20546n;
    public boolean f20547o = false;
    public long f20548p;
    public final r2 f20549q;

    public o2(r2 r2Var) {
        this.f20549q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20547o;
        r2 r2Var = this.f20549q;
        if (!z10) {
            Integer num = this.f20540g;
            if (num != null && r2Var.f20687f3 != null) {
                float f7 = this.f20544l;
                if (f7 != 1.0f) {
                    this.f20544l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f20544l = Utilities.clamp(this.f20544l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20544l;
                if (f10 != 0.0f) {
                    this.f20544l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f20544l = Utilities.clamp(this.f20544l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20548p > 100) {
            this.f20547o = false;
        }
        r2Var.invalidate();
    }
}
