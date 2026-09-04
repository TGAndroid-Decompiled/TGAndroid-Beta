package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f22405a;
    public long f22406b;
    public boolean f22407c;
    public boolean d;
    public long f22408e;
    public int f22409f;
    public Integer f22410g;
    public int h;
    public int f22411i;
    public boolean f22412j;
    public boolean f22413k;
    public float f22414l;
    public boolean f22415m;
    public int f22416n;
    public boolean f22417o = false;
    public long f22418p;
    public final r2 f22419q;

    public o2(r2 r2Var) {
        this.f22419q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22417o;
        r2 r2Var = this.f22419q;
        if (!z10) {
            Integer num = this.f22410g;
            if (num != null && r2Var.f22562f3 != null) {
                float f7 = this.f22414l;
                if (f7 != 1.0f) {
                    this.f22414l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f22414l = Utilities.clamp(this.f22414l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22414l;
                if (f10 != 0.0f) {
                    this.f22414l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f22414l = Utilities.clamp(this.f22414l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22418p > 100) {
            this.f22417o = false;
        }
        r2Var.invalidate();
    }
}
