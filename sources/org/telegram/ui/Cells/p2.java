package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f20788a;
    public long f20789b;
    public boolean f20790c;
    public boolean d;
    public long e;
    public int f20791f;
    public Integer f20792g;
    public int h;
    public int f20793i;
    public boolean f20794j;
    public boolean f20795k;
    public float f20796l;
    public boolean f20797m;
    public int f20798n;
    public boolean f20799o = false;
    public long f20800p;
    public final s2 f20801q;

    public p2(s2 s2Var) {
        this.f20801q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20799o;
        s2 s2Var = this.f20801q;
        if (!z10) {
            Integer num = this.f20792g;
            if (num != null && s2Var.f20951f3 != null) {
                float f7 = this.f20796l;
                if (f7 != 1.0f) {
                    this.f20796l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f20796l = Utilities.clamp(this.f20796l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20796l;
                if (f10 != 0.0f) {
                    this.f20796l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f20796l = Utilities.clamp(this.f20796l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20800p > 100) {
            this.f20799o = false;
        }
        s2Var.invalidate();
    }
}
