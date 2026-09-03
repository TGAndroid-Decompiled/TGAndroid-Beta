package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f23275a;
    public long f23276b;
    public boolean f23277c;
    public boolean d;
    public long f23278e;
    public int f23279f;
    public Integer f23280g;
    public int h;
    public int f23281i;
    public boolean f23282j;
    public boolean f23283k;
    public float f23284l;
    public boolean f23285m;
    public int f23286n;
    public boolean f23287o = false;
    public long f23288p;
    public final r2 f23289q;

    public o2(r2 r2Var) {
        this.f23289q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z4 = this.f23287o;
        r2 r2Var = this.f23289q;
        if (!z4) {
            Integer num = this.f23280g;
            if (num != null && r2Var.c3 != null) {
                float f10 = this.f23284l;
                if (f10 != 1.0f) {
                    this.f23284l = f10 + 0.08f;
                    r2Var.invalidate();
                    this.f23284l = Utilities.clamp(this.f23284l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f23284l;
                if (f11 != 0.0f) {
                    this.f23284l = f11 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f23284l = Utilities.clamp(this.f23284l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f23288p > 100) {
            this.f23287o = false;
        }
        r2Var.invalidate();
    }
}
