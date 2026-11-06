package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class q2 {
    public long f30095a;
    public long f30096b;
    public boolean f30097c;
    public boolean d;
    public long f30098e;
    public int f30099f;
    public Integer f30100g;
    public int h;
    public int f30101i;
    public boolean f30102j;
    public boolean f30103k;
    public float f30104l;
    public boolean f30105m;
    public int f30106n;
    public boolean f30107o = false;
    public long f30108p;
    public final t2 f30109q;

    public q2(t2 t2Var) {
        this.f30109q = t2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.a():boolean");
    }

    public final void b() {
        boolean z9 = this.f30107o;
        t2 t2Var = this.f30109q;
        if (!z9) {
            Integer num = this.f30100g;
            if (num != null && t2Var.f30414f3 != null) {
                float f10 = this.f30104l;
                if (f10 != 1.0f) {
                    this.f30104l = f10 + 0.08f;
                    t2Var.invalidate();
                    this.f30104l = Utilities.i(this.f30104l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f30104l;
                if (f11 != 0.0f) {
                    this.f30104l = f11 - 0.08f;
                    t2Var.invalidate();
                }
            }
            this.f30104l = Utilities.i(this.f30104l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f30108p > 100) {
            this.f30107o = false;
        }
        t2Var.invalidate();
    }
}
