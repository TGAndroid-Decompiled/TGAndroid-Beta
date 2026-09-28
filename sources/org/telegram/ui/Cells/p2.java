package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f20787a;
    public long f20788b;
    public boolean f20789c;
    public boolean d;
    public long e;
    public int f20790f;
    public Integer f20791g;
    public int h;
    public int f20792i;
    public boolean f20793j;
    public boolean f20794k;
    public float f20795l;
    public boolean f20796m;
    public int f20797n;
    public boolean f20798o = false;
    public long f20799p;
    public final s2 f20800q;

    public p2(s2 s2Var) {
        this.f20800q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20798o;
        s2 s2Var = this.f20800q;
        if (!z10) {
            Integer num = this.f20791g;
            if (num != null && s2Var.f20950f3 != null) {
                float f7 = this.f20795l;
                if (f7 != 1.0f) {
                    this.f20795l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f20795l = Utilities.clamp(this.f20795l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20795l;
                if (f10 != 0.0f) {
                    this.f20795l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f20795l = Utilities.clamp(this.f20795l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20799p > 100) {
            this.f20798o = false;
        }
        s2Var.invalidate();
    }
}
