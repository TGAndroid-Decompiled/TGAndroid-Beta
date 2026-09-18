package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class o2 {
    public long f20547a;
    public long f20548b;
    public boolean f20549c;
    public boolean d;
    public long e;
    public int f20550f;
    public Integer f20551g;
    public int h;
    public int f20552i;
    public boolean f20553j;
    public boolean f20554k;
    public float f20555l;
    public boolean f20556m;
    public int f20557n;
    public boolean f20558o = false;
    public long f20559p;
    public final r2 f20560q;

    public o2(r2 r2Var) {
        this.f20560q = r2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f20558o;
        r2 r2Var = this.f20560q;
        if (!z10) {
            Integer num = this.f20551g;
            if (num != null && r2Var.f20698f3 != null) {
                float f7 = this.f20555l;
                if (f7 != 1.0f) {
                    this.f20555l = f7 + 0.08f;
                    r2Var.invalidate();
                    this.f20555l = Utilities.clamp(this.f20555l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f10 = this.f20555l;
                if (f10 != 0.0f) {
                    this.f20555l = f10 - 0.08f;
                    r2Var.invalidate();
                }
            }
            this.f20555l = Utilities.clamp(this.f20555l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f20559p > 100) {
            this.f20558o = false;
        }
        r2Var.invalidate();
    }
}
