package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f22702a;
    public long f22703b;
    public boolean f22704c;
    public boolean d;
    public long e;
    public int f22705f;
    public Integer f22706g;
    public int h;
    public int f22707i;
    public boolean f22708j;
    public boolean f22709k;
    public float f22710l;
    public boolean f22711m;
    public int f22712n;
    public boolean f22713o = false;
    public long f22714p;
    public final r2 f22715q;

    public o2(r2 r2Var) {
        this.f22715q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22713o;
        r2 r2Var = this.f22715q;
        if (!z10) {
            Integer num = this.f22706g;
            if (num != null && r2Var.f22836f3 != null) {
                float f7 = this.f22710l;
                if (f7 != 1.0f) {
                    this.f22710l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f22710l = Utilities.clamp(this.f22710l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22710l;
                if (f10 != 0.0f) {
                    this.f22710l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f22710l = Utilities.clamp(this.f22710l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22714p > 100) {
            this.f22713o = false;
        }
        r2Var.invalidate();
    }
}
