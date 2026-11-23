package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
public class lu0 extends v4.d0 {
    public final kr f37226r;
    public int f37227s;
    public float f37228t;

    public lu0(Context context) {
        super(context);
        this.f37226r = kr.f36858f;
        this.f37228t = 1.0f;
    }

    @Override
    public final void g(View view, v4.a1 a1Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            a1Var.b(-j3, -k10, m10, this.f37226r);
        }
        org.telegram.messenger.g0.h3(new bp0(this, 8), Math.max(0, m10));
    }

    @Override
    public final int k(int i7, View view) {
        return super.k(i7, view) - this.f37227s;
    }

    @Override
    public final int m(int i7) {
        return Math.round(Math.min(super.m(i7), 500) * this.f37228t);
    }

    @Override
    public final int n(int i7) {
        return Math.round(Math.min(super.n(i7), 150) * this.f37228t);
    }

    @Override
    public final void q(v4.a1 a1Var) {
        PointF a10 = a(this.f59190a);
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            v4.b1.b(a10);
            this.f59227k = a10;
            this.f59231o = (int) (a10.x * 10000.0f);
            this.f59232p = (int) (a10.y * 10000.0f);
            a1Var.b((int) (this.f59231o * 1.2f), (int) (this.f59232p * 1.2f), (int) (n(10000) * 1.2f), this.f37226r);
            return;
        }
        a1Var.d = this.f59190a;
        h();
    }
}
