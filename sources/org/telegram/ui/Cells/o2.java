package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f22695a;
    public long f22696b;
    public boolean f22697c;
    public boolean d;
    public long e;
    public int f22698f;
    public Integer f22699g;
    public int h;
    public int f22700i;
    public boolean f22701j;
    public boolean f22702k;
    public float f22703l;
    public boolean f22704m;
    public int f22705n;
    public boolean f22706o = false;
    public long f22707p;
    public final r2 f22708q;

    public o2(r2 r2Var) {
        this.f22708q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22706o;
        r2 r2Var = this.f22708q;
        if (!z10) {
            Integer num = this.f22699g;
            if (num != null && r2Var.f22829f3 != null) {
                float f7 = this.f22703l;
                if (f7 != 1.0f) {
                    this.f22703l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f22703l = Utilities.clamp(this.f22703l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22703l;
                if (f10 != 0.0f) {
                    this.f22703l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f22703l = Utilities.clamp(this.f22703l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22707p > 100) {
            this.f22706o = false;
        }
        r2Var.invalidate();
    }
}
