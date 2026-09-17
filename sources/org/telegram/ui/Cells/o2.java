package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f22433a;
    public long f22434b;
    public boolean f22435c;
    public boolean d;
    public long f22436e;
    public int f22437f;
    public Integer f22438g;
    public int h;
    public int f22439i;
    public boolean f22440j;
    public boolean f22441k;
    public float f22442l;
    public boolean f22443m;
    public int f22444n;
    public boolean f22445o = false;
    public long f22446p;
    public final r2 f22447q;

    public o2(r2 r2Var) {
        this.f22447q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22445o;
        r2 r2Var = this.f22447q;
        if (!z10) {
            Integer num = this.f22438g;
            if (num != null && r2Var.f22590f3 != null) {
                float f7 = this.f22442l;
                if (f7 != 1.0f) {
                    this.f22442l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f22442l = Utilities.clamp(this.f22442l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22442l;
                if (f10 != 0.0f) {
                    this.f22442l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f22442l = Utilities.clamp(this.f22442l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22446p > 100) {
            this.f22445o = false;
        }
        r2Var.invalidate();
    }
}
