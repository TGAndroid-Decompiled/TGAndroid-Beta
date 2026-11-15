package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
public class bu0 extends v4.c0 {
    public final er f33392r;
    public int f33393s;
    public float f33394t;

    public bu0(Context context) {
        super(context);
        this.f33392r = er.f34419f;
        this.f33394t = 1.0f;
    }

    @Override
    public final void g(View view, v4.z0 z0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            z0Var.b(-j3, -k10, m10, this.f33392r);
        }
        org.telegram.messenger.g0.i3(new ro0(this, 8), Math.max(0, m10));
    }

    @Override
    public final int k(int i7, View view) {
        return super.k(i7, view) - this.f33393s;
    }

    @Override
    public final int m(int i7) {
        return Math.round(Math.min(super.m(i7), 500) * this.f33394t);
    }

    @Override
    public final int n(int i7) {
        return Math.round(Math.min(super.n(i7), 150) * this.f33394t);
    }

    @Override
    public final void q(v4.z0 z0Var) {
        PointF a10 = a(this.f58480a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            v4.a1.b(a10);
            this.f58517k = a10;
            this.f58521o = (int) (a10.x * 10000.0f);
            this.f58522p = (int) (a10.y * 10000.0f);
            z0Var.b((int) (this.f58521o * 1.2f), (int) (this.f58522p * 1.2f), (int) (n(10000) * 1.2f), this.f33392r);
            return;
        }
        z0Var.d = this.f58480a;
        h();
    }
}
