package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class q2 {
    public long f31619a;
    public long f31620b;
    public boolean f31621c;
    public boolean d;
    public long f31622e;
    public int f31623f;
    public Integer f31624g;
    public int h;
    public int f31625i;
    public boolean f31626j;
    public boolean f31627k;
    public float f31628l;
    public boolean f31629m;
    public int f31630n;
    public boolean f31631o = false;
    public long f31632p;
    public final t2 f31633q;

    public q2(t2 t2Var) {
        this.f31633q = t2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.a():boolean");
    }

    public final void b() {
        boolean z10 = this.f31631o;
        t2 t2Var = this.f31633q;
        if (!z10) {
            Integer num = this.f31624g;
            if (num != null && t2Var.f31877g3 != null) {
                float f10 = this.f31628l;
                if (f10 != 1.0f) {
                    this.f31628l = f10 + 0.08f;
                    t2Var.invalidate();
                    this.f31628l = Utilities.i(this.f31628l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f31628l;
                if (f11 != 0.0f) {
                    this.f31628l = f11 - 0.08f;
                    t2Var.invalidate();
                }
            }
            this.f31628l = Utilities.i(this.f31628l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f31632p > 100) {
            this.f31631o = false;
        }
        t2Var.invalidate();
    }
}
