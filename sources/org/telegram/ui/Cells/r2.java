package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class r2 {
    public long f31750a;
    public long f31751b;
    public boolean f31752c;
    public boolean d;
    public long f31753e;
    public int f31754f;
    public Integer f31755g;
    public int h;
    public int f31756i;
    public boolean f31757j;
    public boolean f31758k;
    public float f31759l;
    public boolean f31760m;
    public int f31761n;
    public boolean f31762o = false;
    public long f31763p;
    public final u2 f31764q;

    public r2(u2 u2Var) {
        this.f31764q = u2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f31762o;
        u2 u2Var = this.f31764q;
        if (!z10) {
            Integer num = this.f31755g;
            if (num != null && u2Var.f32006g3 != null) {
                float f10 = this.f31759l;
                if (f10 != 1.0f) {
                    this.f31759l = f10 + 0.08f;
                    u2Var.invalidate();
                    this.f31759l = Utilities.i(this.f31759l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f31759l;
                if (f11 != 0.0f) {
                    this.f31759l = f11 - 0.08f;
                    u2Var.invalidate();
                }
            }
            this.f31759l = Utilities.i(this.f31759l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f31763p > 100) {
            this.f31762o = false;
        }
        u2Var.invalidate();
    }
}
