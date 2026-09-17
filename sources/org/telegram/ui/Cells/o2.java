package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f20546a;
    public long f20547b;
    public boolean f20548c;
    public boolean d;
    public long e;
    public int f20549f;
    public Integer f20550g;
    public int h;
    public int f20551i;
    public boolean f20552j;
    public boolean f20553k;
    public float f20554l;
    public boolean f20555m;
    public int f20556n;
    public boolean f20557o = false;
    public long f20558p;
    public final r2 f20559q;

    public o2(r2 r2Var) {
        this.f20559q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20557o;
        r2 r2Var = this.f20559q;
        if (!z10) {
            Integer num = this.f20550g;
            if (num != null && r2Var.f20697f3 != null) {
                float f7 = this.f20554l;
                if (f7 != 1.0f) {
                    this.f20554l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f20554l = Utilities.clamp(this.f20554l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20554l;
                if (f10 != 0.0f) {
                    this.f20554l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f20554l = Utilities.clamp(this.f20554l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20558p > 100) {
            this.f20557o = false;
        }
        r2Var.invalidate();
    }
}
