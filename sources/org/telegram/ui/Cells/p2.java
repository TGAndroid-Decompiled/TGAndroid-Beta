package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f20790a;
    public long f20791b;
    public boolean f20792c;
    public boolean d;
    public long e;
    public int f20793f;
    public Integer f20794g;
    public int h;
    public int f20795i;
    public boolean f20796j;
    public boolean f20797k;
    public float f20798l;
    public boolean f20799m;
    public int f20800n;
    public boolean f20801o = false;
    public long f20802p;
    public final s2 f20803q;

    public p2(s2 s2Var) {
        this.f20803q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20801o;
        s2 s2Var = this.f20803q;
        if (!z10) {
            Integer num = this.f20794g;
            if (num != null && s2Var.f20952f3 != null) {
                float f7 = this.f20798l;
                if (f7 != 1.0f) {
                    this.f20798l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f20798l = Utilities.clamp(this.f20798l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20798l;
                if (f10 != 0.0f) {
                    this.f20798l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f20798l = Utilities.clamp(this.f20798l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20802p > 100) {
            this.f20801o = false;
        }
        s2Var.invalidate();
    }
}
