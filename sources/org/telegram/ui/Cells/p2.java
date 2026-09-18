package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f20750a;
    public long f20751b;
    public boolean f20752c;
    public boolean d;
    public long e;
    public int f20753f;
    public Integer f20754g;
    public int h;
    public int f20755i;
    public boolean f20756j;
    public boolean f20757k;
    public float f20758l;
    public boolean f20759m;
    public int f20760n;
    public boolean f20761o = false;
    public long f20762p;
    public final s2 f20763q;

    public p2(s2 s2Var) {
        this.f20763q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20761o;
        s2 s2Var = this.f20763q;
        if (!z10) {
            Integer num = this.f20754g;
            if (num != null && s2Var.f20913f3 != null) {
                float f7 = this.f20758l;
                if (f7 != 1.0f) {
                    this.f20758l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f20758l = Utilities.clamp(this.f20758l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20758l;
                if (f10 != 0.0f) {
                    this.f20758l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f20758l = Utilities.clamp(this.f20758l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20762p > 100) {
            this.f20761o = false;
        }
        s2Var.invalidate();
    }
}
