package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f21673a;
    public long f21674b;
    public boolean f21675c;
    public boolean d;
    public long e;
    public int f21676f;
    public Integer f21677g;
    public int h;
    public int f21678i;
    public boolean f21679j;
    public boolean f21680k;
    public float f21681l;
    public boolean f21682m;
    public int f21683n;
    public boolean f21684o = false;
    public long f21685p;
    public final s2 f21686q;

    public p2(s2 s2Var) {
        this.f21686q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f21684o;
        s2 s2Var = this.f21686q;
        if (!z10) {
            Integer num = this.f21677g;
            if (num != null && s2Var.f21831f3 != null) {
                float f7 = this.f21681l;
                if (f7 != 1.0f) {
                    this.f21681l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f21681l = Utilities.clamp(this.f21681l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f21681l;
                if (f10 != 0.0f) {
                    this.f21681l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f21681l = Utilities.clamp(this.f21681l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f21685p > 100) {
            this.f21684o = false;
        }
        s2Var.invalidate();
    }
}
