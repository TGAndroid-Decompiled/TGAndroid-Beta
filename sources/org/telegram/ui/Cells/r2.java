package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class r2 {
    public long f31666a;
    public long f31667b;
    public boolean f31668c;
    public boolean d;
    public long f31669e;
    public int f31670f;
    public Integer f31671g;
    public int h;
    public int f31672i;
    public boolean f31673j;
    public boolean f31674k;
    public float f31675l;
    public boolean f31676m;
    public int f31677n;
    public boolean f31678o = false;
    public long f31679p;
    public final u2 f31680q;

    public r2(u2 u2Var) {
        this.f31680q = u2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f31678o;
        u2 u2Var = this.f31680q;
        if (!z10) {
            Integer num = this.f31671g;
            if (num != null && u2Var.f31922g3 != null) {
                float f10 = this.f31675l;
                if (f10 != 1.0f) {
                    this.f31675l = f10 + 0.08f;
                    u2Var.invalidate();
                    this.f31675l = Utilities.i(this.f31675l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f31675l;
                if (f11 != 0.0f) {
                    this.f31675l = f11 - 0.08f;
                    u2Var.invalidate();
                }
            }
            this.f31675l = Utilities.i(this.f31675l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f31679p > 100) {
            this.f31678o = false;
        }
        u2Var.invalidate();
    }
}
