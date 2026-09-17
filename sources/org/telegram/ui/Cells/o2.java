package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f22406a;
    public long f22407b;
    public boolean f22408c;
    public boolean d;
    public long f22409e;
    public int f22410f;
    public Integer f22411g;
    public int h;
    public int f22412i;
    public boolean f22413j;
    public boolean f22414k;
    public float f22415l;
    public boolean f22416m;
    public int f22417n;
    public boolean f22418o = false;
    public long f22419p;
    public final r2 f22420q;

    public o2(r2 r2Var) {
        this.f22420q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22418o;
        r2 r2Var = this.f22420q;
        if (!z10) {
            Integer num = this.f22411g;
            if (num != null && r2Var.f22563f3 != null) {
                float f7 = this.f22415l;
                if (f7 != 1.0f) {
                    this.f22415l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f22415l = Utilities.clamp(this.f22415l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22415l;
                if (f10 != 0.0f) {
                    this.f22415l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f22415l = Utilities.clamp(this.f22415l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22419p > 100) {
            this.f22418o = false;
        }
        r2Var.invalidate();
    }
}
