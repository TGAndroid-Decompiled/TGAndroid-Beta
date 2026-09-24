package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f20772a;
    public long f20773b;
    public boolean f20774c;
    public boolean d;
    public long e;
    public int f20775f;
    public Integer f20776g;
    public int h;
    public int f20777i;
    public boolean f20778j;
    public boolean f20779k;
    public float f20780l;
    public boolean f20781m;
    public int f20782n;
    public boolean f20783o = false;
    public long f20784p;
    public final s2 f20785q;

    public p2(s2 s2Var) {
        this.f20785q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20783o;
        s2 s2Var = this.f20785q;
        if (!z10) {
            Integer num = this.f20776g;
            if (num != null && s2Var.f20935f3 != null) {
                float f7 = this.f20780l;
                if (f7 != 1.0f) {
                    this.f20780l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f20780l = Utilities.clamp(this.f20780l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20780l;
                if (f10 != 0.0f) {
                    this.f20780l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f20780l = Utilities.clamp(this.f20780l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20784p > 100) {
            this.f20783o = false;
        }
        s2Var.invalidate();
    }
}
