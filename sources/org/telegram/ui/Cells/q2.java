package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class q2 {
    public long f30094a;
    public long f30095b;
    public boolean f30096c;
    public boolean d;
    public long f30097e;
    public int f30098f;
    public Integer f30099g;
    public int h;
    public int f30100i;
    public boolean f30101j;
    public boolean f30102k;
    public float f30103l;
    public boolean f30104m;
    public int f30105n;
    public boolean f30106o = false;
    public long f30107p;
    public final t2 f30108q;

    public q2(t2 t2Var) {
        this.f30108q = t2Var;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.a():boolean");
    }

    public final void b() {
        boolean z9 = this.f30106o;
        t2 t2Var = this.f30108q;
        if (!z9) {
            Integer num = this.f30099g;
            if (num != null && t2Var.f30413f3 != null) {
                float f10 = this.f30103l;
                if (f10 != 1.0f) {
                    this.f30103l = f10 + 0.08f;
                    t2Var.invalidate();
                    this.f30103l = Utilities.i(this.f30103l, 1.0f, 0.0f);
                    return;
                }
            }
            if (num == null) {
                float f11 = this.f30103l;
                if (f11 != 0.0f) {
                    this.f30103l = f11 - 0.08f;
                    t2Var.invalidate();
                }
            }
            this.f30103l = Utilities.i(this.f30103l, 1.0f, 0.0f);
            return;
        }
        if (System.currentTimeMillis() - this.f30107p > 100) {
            this.f30106o = false;
        }
        t2Var.invalidate();
    }
}
