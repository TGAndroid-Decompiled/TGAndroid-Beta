package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class m2 {
    public long f24423a;
    public long f24424b;
    public boolean f24425c;
    public boolean d;
    public long e;
    public int f24426f;
    public Integer f24427g;
    public int h;
    public int f24428i;
    public boolean f24429j;
    public boolean f24430k;
    public float f24431l;
    public boolean f24432m;
    public int f24433n;
    public boolean f24434o = false;
    public long f24435p;
    public final p2 f24436q;

    public m2(p2 p2Var) {
        this.f24436q = p2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f24434o;
        p2 p2Var = this.f24436q;
        if (!z10) {
            Integer num = this.f24427g;
            if (num != null && p2Var.f24659f3 != null) {
                float f7 = this.f24431l;
                if (f7 != 1.0f) {
                    this.f24431l = f7 + 0.08f;
                    p2Var.invalidate();
                    this.f24431l = Utilities.clamp(this.f24431l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f24431l;
                if (f10 != 0.0f) {
                    this.f24431l = f10 - 0.08f;
                    p2Var.invalidate();
                }
            }
            this.f24431l = Utilities.clamp(this.f24431l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f24435p > 100) {
            this.f24434o = false;
        }
        p2Var.invalidate();
    }
}
