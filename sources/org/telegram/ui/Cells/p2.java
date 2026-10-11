package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f22617a;
    public long f22618b;
    public boolean f22619c;
    public boolean d;
    public long f22620e;
    public int f22621f;
    public Integer f22622g;
    public int h;
    public int f22623i;
    public boolean f22624j;
    public boolean f22625k;
    public float f22626l;
    public boolean f22627m;
    public int f22628n;
    public boolean f22629o = false;
    public long f22630p;
    public final s2 f22631q;

    public p2(s2 s2Var) {
        this.f22631q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22629o;
        s2 s2Var = this.f22631q;
        if (!z10) {
            Integer num = this.f22622g;
            if (num != null && s2Var.f22786f3 != null) {
                float f7 = this.f22626l;
                if (f7 != 1.0f) {
                    this.f22626l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f22626l = Utilities.clamp(this.f22626l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22626l;
                if (f10 != 0.0f) {
                    this.f22626l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f22626l = Utilities.clamp(this.f22626l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22630p > 100) {
            this.f22629o = false;
        }
        s2Var.invalidate();
    }
}
