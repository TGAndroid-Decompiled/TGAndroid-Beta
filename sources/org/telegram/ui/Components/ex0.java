package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class ex0 extends s4.d0 {
    public final ds f28002r;
    public int f28003s;
    public float f28004t;

    public ex0(Context context) {
        super(context);
        this.f28002r = ds.f27584f;
        this.f28004t = 1.0f;
    }

    @Override
    public final void g(View view, s4.z0 z0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            z0Var.b(-j10, -k10, m10, this.f28002r);
        }
        AndroidUtilities.runOnUIThread(new mp0(this, 13), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f28003s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f28004t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f28004t);
    }

    @Override
    public final void q(s4.z0 z0Var) {
        PointF a2 = a(this.f47677a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            s4.a1.b(a2);
            this.f47722k = a2;
            this.f47726o = (int) (a2.x * 10000.0f);
            this.f47727p = (int) (a2.y * 10000.0f);
            z0Var.b((int) (this.f47726o * 1.2f), (int) (this.f47727p * 1.2f), (int) (n(10000) * 1.2f), this.f28002r);
            return;
        }
        z0Var.d = this.f47677a;
        h();
    }
}
