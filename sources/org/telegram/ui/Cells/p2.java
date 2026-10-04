package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f22628a;
    public long f22629b;
    public boolean f22630c;
    public boolean d;
    public long f22631e;
    public int f22632f;
    public Integer f22633g;
    public int h;
    public int f22634i;
    public boolean f22635j;
    public boolean f22636k;
    public float f22637l;
    public boolean f22638m;
    public int f22639n;
    public boolean f22640o = false;
    public long f22641p;
    public final s2 f22642q;

    public p2(s2 s2Var) {
        this.f22642q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22640o;
        s2 s2Var = this.f22642q;
        if (!z10) {
            Integer num = this.f22633g;
            if (num != null && s2Var.f22802f3 != null) {
                float f7 = this.f22637l;
                if (f7 != 1.0f) {
                    this.f22637l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f22637l = Utilities.clamp(this.f22637l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22637l;
                if (f10 != 0.0f) {
                    this.f22637l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f22637l = Utilities.clamp(this.f22637l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22641p > 100) {
            this.f22640o = false;
        }
        s2Var.invalidate();
    }
}
