package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class n2 {
    public long f22770a;
    public long f22771b;
    public boolean f22772c;
    public boolean d;
    public long e;
    public int f22773f;
    public Integer f22774g;
    public int h;
    public int f22775i;
    public boolean f22776j;
    public boolean f22777k;
    public float f22778l;
    public boolean f22779m;
    public int f22780n;
    public boolean f22781o = false;
    public long f22782p;
    public final q2 f22783q;

    public n2(q2 q2Var) {
        this.f22783q = q2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22781o;
        q2 q2Var = this.f22783q;
        if (!z10) {
            Integer num = this.f22774g;
            if (num != null && q2Var.f22947f3 != null) {
                float f7 = this.f22778l;
                if (f7 != 1.0f) {
                    this.f22778l = f7 + 0.08f;
                    q2Var.invalidate();
                    this.f22778l = Utilities.clamp(this.f22778l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22778l;
                if (f10 != 0.0f) {
                    this.f22778l = f10 - 0.08f;
                    q2Var.invalidate();
                }
            }
            this.f22778l = Utilities.clamp(this.f22778l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22782p > 100) {
            this.f22781o = false;
        }
        q2Var.invalidate();
    }
}
