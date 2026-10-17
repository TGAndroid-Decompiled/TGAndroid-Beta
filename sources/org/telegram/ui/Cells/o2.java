package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f22698a;
    public long f22699b;
    public boolean f22700c;
    public boolean d;
    public long e;
    public int f22701f;
    public Integer f22702g;
    public int h;
    public int f22703i;
    public boolean f22704j;
    public boolean f22705k;
    public float f22706l;
    public boolean f22707m;
    public int f22708n;
    public boolean f22709o = false;
    public long f22710p;
    public final r2 f22711q;

    public o2(r2 r2Var) {
        this.f22711q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22709o;
        r2 r2Var = this.f22711q;
        if (!z10) {
            Integer num = this.f22702g;
            if (num != null && r2Var.f22832f3 != null) {
                float f7 = this.f22706l;
                if (f7 != 1.0f) {
                    this.f22706l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f22706l = Utilities.clamp(this.f22706l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22706l;
                if (f10 != 0.0f) {
                    this.f22706l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f22706l = Utilities.clamp(this.f22706l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22710p > 100) {
            this.f22709o = false;
        }
        r2Var.invalidate();
    }
}
