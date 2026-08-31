package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f23273a;
    public long f23274b;
    public boolean f23275c;
    public boolean d;
    public long f23276e;
    public int f23277f;
    public Integer f23278g;
    public int h;
    public int f23279i;
    public boolean f23280j;
    public boolean f23281k;
    public float f23282l;
    public boolean f23283m;
    public int f23284n;
    public boolean f23285o = false;
    public long f23286p;
    public final r2 f23287q;

    public o2(r2 r2Var) {
        this.f23287q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z4 = this.f23285o;
        r2 r2Var = this.f23287q;
        if (!z4) {
            Integer num = this.f23278g;
            if (num != null && r2Var.c3 != null) {
                float f10 = this.f23282l;
                if (f10 != 1.0f) {
                    this.f23282l = f10 + 0.08f;
                    r2Var.invalidate();
                    this.f23282l = Utilities.clamp(this.f23282l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f23282l;
                if (f11 != 0.0f) {
                    this.f23282l = f11 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f23282l = Utilities.clamp(this.f23282l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f23286p > 100) {
            this.f23285o = false;
        }
        r2Var.invalidate();
    }
}
