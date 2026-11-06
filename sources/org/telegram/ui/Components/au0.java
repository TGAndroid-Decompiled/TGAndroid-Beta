package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
public class au0 extends v4.c0 {
    public final xq f31907r;
    public int f31908s;
    public float f31909t;

    public au0(Context context) {
        super(context);
        this.f31907r = xq.f40345f;
        this.f31909t = 1.0f;
    }

    @Override
    public final void g(View view, v4.y0 y0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            y0Var.b(-j3, -k10, m10, this.f31907r);
        }
        org.telegram.messenger.g0.i3(new ir0(this, 5), Math.max(0, m10));
    }

    @Override
    public final int k(int i7, View view) {
        return super.k(i7, view) - this.f31908s;
    }

    @Override
    public final int m(int i7) {
        return Math.round(Math.min(super.m(i7), 500) * this.f31909t);
    }

    @Override
    public final int n(int i7) {
        return Math.round(Math.min(super.n(i7), 150) * this.f31909t);
    }

    @Override
    public final void q(v4.y0 y0Var) {
        PointF a10 = a(this.f57120a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            v4.z0.b(a10);
            this.f56936k = a10;
            this.f56940o = (int) (a10.x * 10000.0f);
            this.f56941p = (int) (a10.y * 10000.0f);
            y0Var.b((int) (this.f56940o * 1.2f), (int) (this.f56941p * 1.2f), (int) (n(10000) * 1.2f), this.f31907r);
            return;
        }
        y0Var.d = this.f57120a;
        h();
    }
}
