package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f22631a;
    public long f22632b;
    public boolean f22633c;
    public boolean d;
    public long f22634e;
    public int f22635f;
    public Integer f22636g;
    public int h;
    public int f22637i;
    public boolean f22638j;
    public boolean f22639k;
    public float f22640l;
    public boolean f22641m;
    public int f22642n;
    public boolean f22643o = false;
    public long f22644p;
    public final s2 f22645q;

    public p2(s2 s2Var) {
        this.f22645q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22643o;
        s2 s2Var = this.f22645q;
        if (!z10) {
            Integer num = this.f22636g;
            if (num != null && s2Var.f22805f3 != null) {
                float f7 = this.f22640l;
                if (f7 != 1.0f) {
                    this.f22640l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f22640l = Utilities.clamp(this.f22640l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22640l;
                if (f10 != 0.0f) {
                    this.f22640l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f22640l = Utilities.clamp(this.f22640l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22644p > 100) {
            this.f22643o = false;
        }
        s2Var.invalidate();
    }
}
