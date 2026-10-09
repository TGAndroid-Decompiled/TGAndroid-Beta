package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f22625a;
    public long f22626b;
    public boolean f22627c;
    public boolean d;
    public long f22628e;
    public int f22629f;
    public Integer f22630g;
    public int h;
    public int f22631i;
    public boolean f22632j;
    public boolean f22633k;
    public float f22634l;
    public boolean f22635m;
    public int f22636n;
    public boolean f22637o = false;
    public long f22638p;
    public final s2 f22639q;

    public p2(s2 s2Var) {
        this.f22639q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22637o;
        s2 s2Var = this.f22639q;
        if (!z10) {
            Integer num = this.f22630g;
            if (num != null && s2Var.f22794f3 != null) {
                float f7 = this.f22634l;
                if (f7 != 1.0f) {
                    this.f22634l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f22634l = Utilities.clamp(this.f22634l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22634l;
                if (f10 != 0.0f) {
                    this.f22634l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f22634l = Utilities.clamp(this.f22634l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22638p > 100) {
            this.f22637o = false;
        }
        s2Var.invalidate();
    }
}
