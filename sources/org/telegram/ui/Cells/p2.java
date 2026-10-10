package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class p2 {
    public long f22629a;
    public long f22630b;
    public boolean f22631c;
    public boolean d;
    public long f22632e;
    public int f22633f;
    public Integer f22634g;
    public int h;
    public int f22635i;
    public boolean f22636j;
    public boolean f22637k;
    public float f22638l;
    public boolean f22639m;
    public int f22640n;
    public boolean f22641o = false;
    public long f22642p;
    public final s2 f22643q;

    public p2(s2 s2Var) {
        this.f22643q = s2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f22641o;
        s2 s2Var = this.f22643q;
        if (!z10) {
            Integer num = this.f22634g;
            if (num != null && s2Var.f22798f3 != null) {
                float f7 = this.f22638l;
                if (f7 != 1.0f) {
                    this.f22638l = f7 + 0.08f;
                    s2Var.invalidate();
                    this.f22638l = Utilities.clamp(this.f22638l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f22638l;
                if (f10 != 0.0f) {
                    this.f22638l = f10 - 0.08f;
                    s2Var.invalidate();
                }
            }
            this.f22638l = Utilities.clamp(this.f22638l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f22642p > 100) {
            this.f22641o = false;
        }
        s2Var.invalidate();
    }
}
