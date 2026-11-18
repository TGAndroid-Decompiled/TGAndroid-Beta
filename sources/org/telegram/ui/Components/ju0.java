package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
public class ju0 extends v4.d0 {
    public final lr f36534r;
    public int f36535s;
    public float f36536t;

    public ju0(Context context) {
        super(context);
        this.f36534r = lr.f37208f;
        this.f36536t = 1.0f;
    }

    @Override
    public final void g(View view, v4.a1 a1Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            a1Var.b(-j3, -k10, m10, this.f36534r);
        }
        org.telegram.messenger.g0.h3(new ap0(this, 8), Math.max(0, m10));
    }

    @Override
    public final int k(int i7, View view) {
        return super.k(i7, view) - this.f36535s;
    }

    @Override
    public final int m(int i7) {
        return Math.round(Math.min(super.m(i7), 500) * this.f36536t);
    }

    @Override
    public final int n(int i7) {
        return Math.round(Math.min(super.n(i7), 150) * this.f36536t);
    }

    @Override
    public final void q(v4.a1 a1Var) {
        PointF a10 = a(this.f59066a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            v4.b1.b(a10);
            this.f59103k = a10;
            this.f59107o = (int) (a10.x * 10000.0f);
            this.f59108p = (int) (a10.y * 10000.0f);
            a1Var.b((int) (this.f59107o * 1.2f), (int) (this.f59108p * 1.2f), (int) (n(10000) * 1.2f), this.f36534r);
            return;
        }
        a1Var.d = this.f59066a;
        h();
    }
}
