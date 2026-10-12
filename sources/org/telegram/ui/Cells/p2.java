package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f22389a;
    public long f22390b;
    public boolean f22391c;
    public boolean d;
    public long f22392e;
    public int f22393f;
    public Integer f22394g;
    public int h;
    public int f22395i;
    public boolean f22396j;
    public boolean f22397k;
    public float f22398l;
    public boolean f22399m;
    public int f22400n;
    public boolean f22401o = false;
    public long f22402p;
    public final s2 f22403q;

    public p2(s2 s2Var) {
        this.f22403q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22401o;
        s2 s2Var = this.f22403q;
        if (!z10) {
            Integer num = this.f22394g;
            if (num != null && s2Var.f22558f3 != null) {
                float f7 = this.f22398l;
                if (f7 != 1.0f) {
                    this.f22398l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f22398l = Utilities.clamp(this.f22398l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22398l;
                if (f10 != 0.0f) {
                    this.f22398l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f22398l = Utilities.clamp(this.f22398l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22402p > 100) {
            this.f22401o = false;
        }
        s2Var.invalidate();
    }
}
