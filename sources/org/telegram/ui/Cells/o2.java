package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f22703a;
    public long f22704b;
    public boolean f22705c;
    public boolean d;
    public long e;
    public int f22706f;
    public Integer f22707g;
    public int h;
    public int f22708i;
    public boolean f22709j;
    public boolean f22710k;
    public float f22711l;
    public boolean f22712m;
    public int f22713n;
    public boolean f22714o = false;
    public long f22715p;
    public final r2 f22716q;

    public o2(r2 r2Var) {
        this.f22716q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22714o;
        r2 r2Var = this.f22716q;
        if (!z10) {
            Integer num = this.f22707g;
            if (num != null && r2Var.f22837f3 != null) {
                float f7 = this.f22711l;
                if (f7 != 1.0f) {
                    this.f22711l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f22711l = Utilities.clamp(this.f22711l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22711l;
                if (f10 != 0.0f) {
                    this.f22711l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f22711l = Utilities.clamp(this.f22711l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22715p > 100) {
            this.f22714o = false;
        }
        r2Var.invalidate();
    }
}
