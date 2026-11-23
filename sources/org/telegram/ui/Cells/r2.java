package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class r2 {
    public long f31700a;
    public long f31701b;
    public boolean f31702c;
    public boolean d;
    public long f31703e;
    public int f31704f;
    public Integer f31705g;
    public int h;
    public int f31706i;
    public boolean f31707j;
    public boolean f31708k;
    public float f31709l;
    public boolean f31710m;
    public int f31711n;
    public boolean f31712o = false;
    public long f31713p;
    public final u2 f31714q;

    public r2(u2 u2Var) {
        this.f31714q = u2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f31712o;
        u2 u2Var = this.f31714q;
        if (!z10) {
            Integer num = this.f31705g;
            if (num != null && u2Var.f31956g3 != null) {
                float f10 = this.f31709l;
                if (f10 != 1.0f) {
                    this.f31709l = f10 + 0.08f;
                    u2Var.invalidate();
                    this.f31709l = Utilities.i(this.f31709l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f31709l;
                if (f11 != 0.0f) {
                    this.f31709l = f11 - 0.08f;
                    u2Var.invalidate();
                }
            }
            this.f31709l = Utilities.i(this.f31709l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f31713p > 100) {
            this.f31712o = false;
        }
        u2Var.invalidate();
    }
}
