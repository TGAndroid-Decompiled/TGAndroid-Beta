package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class q2 {
    public long f30099a;
    public long f30100b;
    public boolean f30101c;
    public boolean d;
    public long f30102e;
    public int f30103f;
    public Integer f30104g;
    public int h;
    public int f30105i;
    public boolean f30106j;
    public boolean f30107k;
    public float f30108l;
    public boolean f30109m;
    public int f30110n;
    public boolean f30111o = false;
    public long f30112p;
    public final t2 f30113q;

    public q2(t2 t2Var) {
        this.f30113q = t2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.a():boolean");
    }

    public final void b() {
        boolean z9 = this.f30111o;
        t2 t2Var = this.f30113q;
        if (!z9) {
            Integer num = this.f30104g;
            if (num != null && t2Var.f30418f3 != null) {
                float f10 = this.f30108l;
                if (f10 != 1.0f) {
                    this.f30108l = f10 + 0.08f;
                    t2Var.invalidate();
                    this.f30108l = Utilities.i(this.f30108l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f30108l;
                if (f11 != 0.0f) {
                    this.f30108l = f11 - 0.08f;
                    t2Var.invalidate();
                }
            }
            this.f30108l = Utilities.i(this.f30108l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f30112p > 100) {
            this.f30111o = false;
        }
        t2Var.invalidate();
    }
}
