package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f22624a;
    public long f22625b;
    public boolean f22626c;
    public boolean d;
    public long f22627e;
    public int f22628f;
    public Integer f22629g;
    public int h;
    public int f22630i;
    public boolean f22631j;
    public boolean f22632k;
    public float f22633l;
    public boolean f22634m;
    public int f22635n;
    public boolean f22636o = false;
    public long f22637p;
    public final s2 f22638q;

    public p2(s2 s2Var) {
        this.f22638q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22636o;
        s2 s2Var = this.f22638q;
        if (!z10) {
            Integer num = this.f22629g;
            if (num != null && s2Var.f22798f3 != null) {
                float f7 = this.f22633l;
                if (f7 != 1.0f) {
                    this.f22633l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f22633l = Utilities.clamp(this.f22633l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22633l;
                if (f10 != 0.0f) {
                    this.f22633l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f22633l = Utilities.clamp(this.f22633l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22637p > 100) {
            this.f22636o = false;
        }
        s2Var.invalidate();
    }
}
