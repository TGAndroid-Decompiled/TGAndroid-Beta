package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class q2 {
    public long f30114a;
    public long f30115b;
    public boolean f30116c;
    public boolean d;
    public long f30117e;
    public int f30118f;
    public Integer f30119g;
    public int h;
    public int f30120i;
    public boolean f30121j;
    public boolean f30122k;
    public float f30123l;
    public boolean f30124m;
    public int f30125n;
    public boolean f30126o = false;
    public long f30127p;
    public final t2 f30128q;

    public q2(t2 t2Var) {
        this.f30128q = t2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.a():boolean");
    }

    public final void b() {
        boolean z9 = this.f30126o;
        t2 t2Var = this.f30128q;
        if (!z9) {
            Integer num = this.f30119g;
            if (num != null && t2Var.f30433f3 != null) {
                float f10 = this.f30123l;
                if (f10 != 1.0f) {
                    this.f30123l = f10 + 0.08f;
                    t2Var.invalidate();
                    this.f30123l = Utilities.i(this.f30123l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f30123l;
                if (f11 != 0.0f) {
                    this.f30123l = f11 - 0.08f;
                    t2Var.invalidate();
                }
            }
            this.f30123l = Utilities.i(this.f30123l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f30127p > 100) {
            this.f30126o = false;
        }
        t2Var.invalidate();
    }
}
