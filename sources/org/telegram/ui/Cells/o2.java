package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f22696a;
    public long f22697b;
    public boolean f22698c;
    public boolean d;
    public long e;
    public int f22699f;
    public Integer f22700g;
    public int h;
    public int f22701i;
    public boolean f22702j;
    public boolean f22703k;
    public float f22704l;
    public boolean f22705m;
    public int f22706n;
    public boolean f22707o = false;
    public long f22708p;
    public final r2 f22709q;

    public o2(r2 r2Var) {
        this.f22709q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22707o;
        r2 r2Var = this.f22709q;
        if (!z10) {
            Integer num = this.f22700g;
            if (num != null && r2Var.f22830f3 != null) {
                float f7 = this.f22704l;
                if (f7 != 1.0f) {
                    this.f22704l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f22704l = Utilities.clamp(this.f22704l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22704l;
                if (f10 != 0.0f) {
                    this.f22704l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f22704l = Utilities.clamp(this.f22704l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22708p > 100) {
            this.f22707o = false;
        }
        r2Var.invalidate();
    }
}
