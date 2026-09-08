package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f22432a;
    public long f22433b;
    public boolean f22434c;
    public boolean d;
    public long f22435e;
    public int f22436f;
    public Integer f22437g;
    public int h;
    public int f22438i;
    public boolean f22439j;
    public boolean f22440k;
    public float f22441l;
    public boolean f22442m;
    public int f22443n;
    public boolean f22444o = false;
    public long f22445p;
    public final r2 f22446q;

    public o2(r2 r2Var) {
        this.f22446q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22444o;
        r2 r2Var = this.f22446q;
        if (!z10) {
            Integer num = this.f22437g;
            if (num != null && r2Var.f22589f3 != null) {
                float f7 = this.f22441l;
                if (f7 != 1.0f) {
                    this.f22441l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f22441l = Utilities.clamp(this.f22441l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22441l;
                if (f10 != 0.0f) {
                    this.f22441l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f22441l = Utilities.clamp(this.f22441l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22445p > 100) {
            this.f22444o = false;
        }
        r2Var.invalidate();
    }
}
