package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class m2 {
    public long f24671a;
    public long f24672b;
    public boolean f24673c;
    public boolean d;
    public long f24674e;
    public int f24675f;
    public Integer f24676g;
    public int h;
    public int f24677i;
    public boolean f24678j;
    public boolean f24679k;
    public float f24680l;
    public boolean f24681m;
    public int f24682n;
    public boolean f24683o = false;
    public long f24684p;
    public final p2 f24685q;

    public m2(p2 p2Var) {
        this.f24685q = p2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f24683o;
        p2 p2Var = this.f24685q;
        if (!z10) {
            Integer num = this.f24676g;
            if (num != null && p2Var.f24835b3 != null) {
                float f9 = this.f24680l;
                if (f9 != 1.0f) {
                    this.f24680l = f9 + 0.08f;
                    p2Var.invalidate();
                    this.f24680l = Utilities.clamp(this.f24680l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f24680l;
                if (f10 != 0.0f) {
                    this.f24680l = f10 - 0.08f;
                    p2Var.invalidate();
                }
            }
            this.f24680l = Utilities.clamp(this.f24680l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f24684p > 100) {
            this.f24683o = false;
        }
        p2Var.invalidate();
    }
}
