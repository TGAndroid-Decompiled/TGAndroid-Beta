package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f21370a;
    public long f21371b;
    public boolean f21372c;
    public boolean d;
    public long e;
    public int f21373f;
    public Integer f21374g;
    public int h;
    public int f21375i;
    public boolean f21376j;
    public boolean f21377k;
    public float f21378l;
    public boolean f21379m;
    public int f21380n;
    public boolean f21381o = false;
    public long f21382p;
    public final s2 f21383q;

    public p2(s2 s2Var) {
        this.f21383q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f21381o;
        s2 s2Var = this.f21383q;
        if (!z10) {
            Integer num = this.f21374g;
            if (num != null && s2Var.f21528f3 != null) {
                float f7 = this.f21378l;
                if (f7 != 1.0f) {
                    this.f21378l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f21378l = Utilities.clamp(this.f21378l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f21378l;
                if (f10 != 0.0f) {
                    this.f21378l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f21378l = Utilities.clamp(this.f21378l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f21382p > 100) {
            this.f21381o = false;
        }
        s2Var.invalidate();
    }
}
