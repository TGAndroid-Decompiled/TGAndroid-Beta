package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f24812a;
    public long f24813b;
    public boolean f24814c;
    public boolean d;
    public long f24815e;
    public int f24816f;
    public Integer f24817g;
    public int h;
    public int f24818i;
    public boolean f24819j;
    public boolean f24820k;
    public float f24821l;
    public boolean f24822m;
    public int f24823n;
    public boolean f24824o = false;
    public long f24825p;
    public final r2 f24826q;

    public o2(r2 r2Var) {
        this.f24826q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f24824o;
        r2 r2Var = this.f24826q;
        if (!z10) {
            Integer num = this.f24817g;
            if (num != null && r2Var.f24960b3 != null) {
                float f10 = this.f24821l;
                if (f10 != 1.0f) {
                    this.f24821l = f10 + 0.08f;
                    r2Var.invalidate();
                    this.f24821l = Utilities.clamp(this.f24821l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f24821l;
                if (f11 != 0.0f) {
                    this.f24821l = f11 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f24821l = Utilities.clamp(this.f24821l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f24825p > 100) {
            this.f24824o = false;
        }
        r2Var.invalidate();
    }
}
