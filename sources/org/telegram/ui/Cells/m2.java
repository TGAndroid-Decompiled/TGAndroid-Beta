package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class m2 {
    public long f24421a;
    public long f24422b;
    public boolean f24423c;
    public boolean d;
    public long e;
    public int f24424f;
    public Integer f24425g;
    public int h;
    public int f24426i;
    public boolean f24427j;
    public boolean f24428k;
    public float f24429l;
    public boolean f24430m;
    public int f24431n;
    public boolean f24432o = false;
    public long f24433p;
    public final p2 f24434q;

    public m2(p2 p2Var) {
        this.f24434q = p2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f24432o;
        p2 p2Var = this.f24434q;
        if (!z10) {
            Integer num = this.f24425g;
            if (num != null && p2Var.f24657f3 != null) {
                float f7 = this.f24429l;
                if (f7 != 1.0f) {
                    this.f24429l = f7 + 0.08f;
                    p2Var.invalidate();
                    this.f24429l = Utilities.clamp(this.f24429l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f24429l;
                if (f10 != 0.0f) {
                    this.f24429l = f10 - 0.08f;
                    p2Var.invalidate();
                }
            }
            this.f24429l = Utilities.clamp(this.f24429l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f24433p > 100) {
            this.f24432o = false;
        }
        p2Var.invalidate();
    }
}
