package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class m2 {
    public long f24419a;
    public long f24420b;
    public boolean f24421c;
    public boolean d;
    public long e;
    public int f24422f;
    public Integer f24423g;
    public int h;
    public int f24424i;
    public boolean f24425j;
    public boolean f24426k;
    public float f24427l;
    public boolean f24428m;
    public int f24429n;
    public boolean f24430o = false;
    public long f24431p;
    public final p2 f24432q;

    public m2(p2 p2Var) {
        this.f24432q = p2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f24430o;
        p2 p2Var = this.f24432q;
        if (!z10) {
            Integer num = this.f24423g;
            if (num != null && p2Var.f24655f3 != null) {
                float f7 = this.f24427l;
                if (f7 != 1.0f) {
                    this.f24427l = f7 + 0.08f;
                    p2Var.invalidate();
                    this.f24427l = Utilities.clamp(this.f24427l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f24427l;
                if (f10 != 0.0f) {
                    this.f24427l = f10 - 0.08f;
                    p2Var.invalidate();
                }
            }
            this.f24427l = Utilities.clamp(this.f24427l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f24431p > 100) {
            this.f24430o = false;
        }
        p2Var.invalidate();
    }
}
