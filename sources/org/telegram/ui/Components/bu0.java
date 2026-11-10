package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
public class bu0 extends v4.c0 {
    public final wq f32360r;
    public int f32361s;
    public float f32362t;

    public bu0(Context context) {
        super(context);
        this.f32360r = wq.f40046f;
        this.f32362t = 1.0f;
    }

    @Override
    public final void g(View view, v4.y0 y0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            y0Var.b(-j3, -k10, m10, this.f32360r);
        }
        org.telegram.messenger.g0.i3(new jr0(this, 5), Math.max(0, m10));
    }

    @Override
    public final int k(int i7, View view) {
        return super.k(i7, view) - this.f32361s;
    }

    @Override
    public final int m(int i7) {
        return Math.round(Math.min(super.m(i7), 500) * this.f32362t);
    }

    @Override
    public final int n(int i7) {
        return Math.round(Math.min(super.n(i7), 150) * this.f32362t);
    }

    @Override
    public final void q(v4.y0 y0Var) {
        PointF a10 = a(this.f57221a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            v4.z0.b(a10);
            this.f57037k = a10;
            this.f57041o = (int) (a10.x * 10000.0f);
            this.f57042p = (int) (a10.y * 10000.0f);
            y0Var.b((int) (this.f57041o * 1.2f), (int) (this.f57042p * 1.2f), (int) (n(10000) * 1.2f), this.f32360r);
            return;
        }
        y0Var.d = this.f57221a;
        h();
    }
}
