package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class r2 {
    public long f31669a;
    public long f31670b;
    public boolean f31671c;
    public boolean d;
    public long f31672e;
    public int f31673f;
    public Integer f31674g;
    public int h;
    public int f31675i;
    public boolean f31676j;
    public boolean f31677k;
    public float f31678l;
    public boolean f31679m;
    public int f31680n;
    public boolean f31681o = false;
    public long f31682p;
    public final u2 f31683q;

    public r2(u2 u2Var) {
        this.f31683q = u2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f31681o;
        u2 u2Var = this.f31683q;
        if (!z10) {
            Integer num = this.f31674g;
            if (num != null && u2Var.f31925g3 != null) {
                float f10 = this.f31678l;
                if (f10 != 1.0f) {
                    this.f31678l = f10 + 0.08f;
                    u2Var.invalidate();
                    this.f31678l = Utilities.i(this.f31678l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f31678l;
                if (f11 != 0.0f) {
                    this.f31678l = f11 - 0.08f;
                    u2Var.invalidate();
                }
            }
            this.f31678l = Utilities.i(this.f31678l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f31682p > 100) {
            this.f31681o = false;
        }
        u2Var.invalidate();
    }
}
