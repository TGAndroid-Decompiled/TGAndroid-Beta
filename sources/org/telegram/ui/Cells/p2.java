package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f22653a;
    public long f22654b;
    public boolean f22655c;
    public boolean d;
    public long f22656e;
    public int f22657f;
    public Integer f22658g;
    public int h;
    public int f22659i;
    public boolean f22660j;
    public boolean f22661k;
    public float f22662l;
    public boolean f22663m;
    public int f22664n;
    public boolean f22665o = false;
    public long f22666p;
    public final s2 f22667q;

    public p2(s2 s2Var) {
        this.f22667q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22665o;
        s2 s2Var = this.f22667q;
        if (!z10) {
            Integer num = this.f22658g;
            if (num != null && s2Var.f22822f3 != null) {
                float f7 = this.f22662l;
                if (f7 != 1.0f) {
                    this.f22662l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f22662l = Utilities.clamp(this.f22662l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22662l;
                if (f10 != 0.0f) {
                    this.f22662l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f22662l = Utilities.clamp(this.f22662l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22666p > 100) {
            this.f22665o = false;
        }
        s2Var.invalidate();
    }
}
