package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f20525a;
    public long f20526b;
    public boolean f20527c;
    public boolean d;
    public long e;
    public int f20528f;
    public Integer f20529g;
    public int h;
    public int f20530i;
    public boolean f20531j;
    public boolean f20532k;
    public float f20533l;
    public boolean f20534m;
    public int f20535n;
    public boolean f20536o = false;
    public long f20537p;
    public final r2 f20538q;

    public o2(r2 r2Var) {
        this.f20538q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20536o;
        r2 r2Var = this.f20538q;
        if (!z10) {
            Integer num = this.f20529g;
            if (num != null && r2Var.f20685f3 != null) {
                float f7 = this.f20533l;
                if (f7 != 1.0f) {
                    this.f20533l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f20533l = Utilities.clamp(this.f20533l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20533l;
                if (f10 != 0.0f) {
                    this.f20533l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f20533l = Utilities.clamp(this.f20533l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20537p > 100) {
            this.f20536o = false;
        }
        r2Var.invalidate();
    }
}
