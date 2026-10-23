package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class n2 {
    public long f22769a;
    public long f22770b;
    public boolean f22771c;
    public boolean d;
    public long e;
    public int f22772f;
    public Integer f22773g;
    public int h;
    public int f22774i;
    public boolean f22775j;
    public boolean f22776k;
    public float f22777l;
    public boolean f22778m;
    public int f22779n;
    public boolean f22780o = false;
    public long f22781p;
    public final q2 f22782q;

    public n2(q2 q2Var) {
        this.f22782q = q2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22780o;
        q2 q2Var = this.f22782q;
        if (!z10) {
            Integer num = this.f22773g;
            if (num != null && q2Var.f22946f3 != null) {
                float f7 = this.f22777l;
                if (f7 != 1.0f) {
                    this.f22777l = f7 + 0.08f;
                    q2Var.invalidate();
                    this.f22777l = Utilities.clamp(this.f22777l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22777l;
                if (f10 != 0.0f) {
                    this.f22777l = f10 - 0.08f;
                    q2Var.invalidate();
                }
            }
            this.f22777l = Utilities.clamp(this.f22777l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22781p > 100) {
            this.f22780o = false;
        }
        q2Var.invalidate();
    }
}
