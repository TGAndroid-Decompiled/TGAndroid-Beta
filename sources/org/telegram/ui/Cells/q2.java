package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class q2 {
    public long f30103a;
    public long f30104b;
    public boolean f30105c;
    public boolean d;
    public long f30106e;
    public int f30107f;
    public Integer f30108g;
    public int h;
    public int f30109i;
    public boolean f30110j;
    public boolean f30111k;
    public float f30112l;
    public boolean f30113m;
    public int f30114n;
    public boolean f30115o = false;
    public long f30116p;
    public final t2 f30117q;

    public q2(t2 t2Var) {
        this.f30117q = t2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.a():boolean");
    }

    public final void b() {
        boolean z9 = this.f30115o;
        t2 t2Var = this.f30117q;
        if (!z9) {
            Integer num = this.f30108g;
            if (num != null && t2Var.f30422f3 != null) {
                float f10 = this.f30112l;
                if (f10 != 1.0f) {
                    this.f30112l = f10 + 0.08f;
                    t2Var.invalidate();
                    this.f30112l = Utilities.i(this.f30112l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f30112l;
                if (f11 != 0.0f) {
                    this.f30112l = f11 - 0.08f;
                    t2Var.invalidate();
                }
            }
            this.f30112l = Utilities.i(this.f30112l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f30116p > 100) {
            this.f30115o = false;
        }
        t2Var.invalidate();
    }
}
