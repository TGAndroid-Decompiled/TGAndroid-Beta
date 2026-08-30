package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f21493a;
    public long f21494b;
    public boolean f21495c;
    public boolean d;
    public long e;
    public int f21496f;
    public Integer f21497g;
    public int h;
    public int f21498i;
    public boolean f21499j;
    public boolean f21500k;
    public float f21501l;
    public boolean f21502m;
    public int f21503n;
    public boolean f21504o = false;
    public long f21505p;
    public final r2 f21506q;

    public o2(r2 r2Var) {
        this.f21506q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z4 = this.f21504o;
        r2 r2Var = this.f21506q;
        if (!z4) {
            Integer num = this.f21497g;
            if (num != null && r2Var.c3 != null) {
                float f10 = this.f21501l;
                if (f10 != 1.0f) {
                    this.f21501l = f10 + 0.08f;
                    r2Var.invalidate();
                    this.f21501l = Utilities.clamp(this.f21501l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f21501l;
                if (f11 != 0.0f) {
                    this.f21501l = f11 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f21501l = Utilities.clamp(this.f21501l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f21505p > 100) {
            this.f21504o = false;
        }
        r2Var.invalidate();
    }
}
