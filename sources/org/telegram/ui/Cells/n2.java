package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class n2 {
    public long f21403a;
    public long f21404b;
    public boolean f21405c;
    public boolean d;
    public long e;
    public int f21406f;
    public Integer f21407g;
    public int h;
    public int f21408i;
    public boolean f21409j;
    public boolean f21410k;
    public float f21411l;
    public boolean f21412m;
    public int f21413n;
    public boolean f21414o = false;
    public long f21415p;
    public final q2 f21416q;

    public n2(q2 q2Var) {
        this.f21416q = q2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n2.a():boolean");
    }

    public final void b() {
        boolean z4 = this.f21414o;
        q2 q2Var = this.f21416q;
        if (!z4) {
            Integer num = this.f21407g;
            if (num != null && q2Var.c3 != null) {
                float f10 = this.f21411l;
                if (f10 != 1.0f) {
                    this.f21411l = f10 + 0.08f;
                    q2Var.invalidate();
                    this.f21411l = Utilities.clamp(this.f21411l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f21411l;
                if (f11 != 0.0f) {
                    this.f21411l = f11 - 0.08f;
                    q2Var.invalidate();
                }
            }
            this.f21411l = Utilities.clamp(this.f21411l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f21415p > 100) {
            this.f21414o = false;
        }
        q2Var.invalidate();
    }
}
