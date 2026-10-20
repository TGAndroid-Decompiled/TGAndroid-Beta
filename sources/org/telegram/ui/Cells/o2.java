package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f22699a;
    public long f22700b;
    public boolean f22701c;
    public boolean d;
    public long e;
    public int f22702f;
    public Integer f22703g;
    public int h;
    public int f22704i;
    public boolean f22705j;
    public boolean f22706k;
    public float f22707l;
    public boolean f22708m;
    public int f22709n;
    public boolean f22710o = false;
    public long f22711p;
    public final r2 f22712q;

    public o2(r2 r2Var) {
        this.f22712q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22710o;
        r2 r2Var = this.f22712q;
        if (!z10) {
            Integer num = this.f22703g;
            if (num != null && r2Var.f22833f3 != null) {
                float f7 = this.f22707l;
                if (f7 != 1.0f) {
                    this.f22707l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f22707l = Utilities.clamp(this.f22707l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22707l;
                if (f10 != 0.0f) {
                    this.f22707l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f22707l = Utilities.clamp(this.f22707l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22711p > 100) {
            this.f22710o = false;
        }
        r2Var.invalidate();
    }
}
