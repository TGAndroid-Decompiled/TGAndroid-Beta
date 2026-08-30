package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class zv0 extends f2.j0 {
    public final nr f31446r;
    public int f31447s;
    public float f31448t;

    public zv0(Context context) {
        super(context);
        this.f31446r = nr.f27346f;
        this.f31448t = 1.0f;
    }

    @Override
    public final void g(View view, f2.g1 g1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m9 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m9 > 0) {
            g1Var.b(-j10, -k10, m9, this.f31446r);
        }
        AndroidUtilities.runOnUIThread(new nq0(this, 8), Math.max(0, m9));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f31447s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f31448t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f31448t);
    }

    @Override
    public final void q(f2.g1 g1Var) {
        PointF a2 = a(this.f5723a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            f2.h1.b(a2);
            this.f5760k = a2;
            this.f5764o = (int) (a2.x * 10000.0f);
            this.f5765p = (int) (a2.y * 10000.0f);
            g1Var.b((int) (this.f5764o * 1.2f), (int) (this.f5765p * 1.2f), (int) (n(10000) * 1.2f), this.f31446r);
            return;
        }
        g1Var.d = this.f5723a;
        h();
    }
}
