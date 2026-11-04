package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
public class zt0 extends u4.c0 {
    public final xq f41109r;
    public int f41110s;
    public float f41111t;

    public zt0(Context context) {
        super(context);
        this.f41109r = xq.f40452f;
        this.f41111t = 1.0f;
    }

    @Override
    public final void g(View view, u4.y0 y0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            y0Var.b(-j10, -k10, m10, this.f41109r);
        }
        org.telegram.messenger.g0.i3(new sp0(this, 7), Math.max(0, m10));
    }

    @Override
    public final int k(int i3, View view) {
        return super.k(i3, view) - this.f41110s;
    }

    @Override
    public final int m(int i3) {
        return Math.round(Math.min(super.m(i3), 500) * this.f41111t);
    }

    @Override
    public final int n(int i3) {
        return Math.round(Math.min(super.n(i3), 150) * this.f41111t);
    }

    @Override
    public final void q(u4.y0 y0Var) {
        PointF a10 = a(this.f55704a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            u4.z0.b(a10);
            this.f55526k = a10;
            this.f55530o = (int) (a10.x * 10000.0f);
            this.f55531p = (int) (a10.y * 10000.0f);
            y0Var.b((int) (this.f55530o * 1.2f), (int) (this.f55531p * 1.2f), (int) (n(10000) * 1.2f), this.f41109r);
            return;
        }
        y0Var.d = this.f55704a;
        h();
    }
}
