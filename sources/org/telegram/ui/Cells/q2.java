package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class q2 {
    public long f30171a;
    public long f30172b;
    public boolean f30173c;
    public boolean d;
    public long f30174e;
    public int f30175f;
    public Integer f30176g;
    public int h;
    public int f30177i;
    public boolean f30178j;
    public boolean f30179k;
    public float f30180l;
    public boolean f30181m;
    public int f30182n;
    public boolean f30183o = false;
    public long f30184p;
    public final t2 f30185q;

    public q2(t2 t2Var) {
        this.f30185q = t2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f30183o;
        t2 t2Var = this.f30185q;
        if (!z10) {
            Integer num = this.f30176g;
            if (num != null && t2Var.f30499g3 != null) {
                float f10 = this.f30180l;
                if (f10 != 1.0f) {
                    this.f30180l = f10 + 0.08f;
                    t2Var.invalidate();
                    this.f30180l = Utilities.i(this.f30180l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f30180l;
                if (f11 != 0.0f) {
                    this.f30180l = f11 - 0.08f;
                    t2Var.invalidate();
                }
            }
            this.f30180l = Utilities.i(this.f30180l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f30184p > 100) {
            this.f30183o = false;
        }
        t2Var.invalidate();
    }
}
