package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f22623a;
    public long f22624b;
    public boolean f22625c;
    public boolean d;
    public long f22626e;
    public int f22627f;
    public Integer f22628g;
    public int h;
    public int f22629i;
    public boolean f22630j;
    public boolean f22631k;
    public float f22632l;
    public boolean f22633m;
    public int f22634n;
    public boolean f22635o = false;
    public long f22636p;
    public final s2 f22637q;

    public p2(s2 s2Var) {
        this.f22637q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22635o;
        s2 s2Var = this.f22637q;
        if (!z10) {
            Integer num = this.f22628g;
            if (num != null && s2Var.f22797f3 != null) {
                float f7 = this.f22632l;
                if (f7 != 1.0f) {
                    this.f22632l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f22632l = Utilities.clamp(this.f22632l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22632l;
                if (f10 != 0.0f) {
                    this.f22632l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f22632l = Utilities.clamp(this.f22632l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22636p > 100) {
            this.f22635o = false;
        }
        s2Var.invalidate();
    }
}
