package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class dx0 extends s4.e0 {
    public final is f25747r;
    public int f25748s;
    public float f25749t;

    public dx0(Context context) {
        super(context);
        this.f25747r = is.f27451f;
        this.f25749t = 1.0f;
    }

    @Override
    public final void g(View view, s4.y0 y0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            y0Var.b(-j3, -k10, m10, this.f25747r);
        }
        AndroidUtilities.runOnUIThread(new qr0(this, 8), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f25748s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f25749t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f25749t);
    }

    @Override
    public final void q(s4.y0 y0Var) {
        PointF a2 = a(this.f47917a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            s4.z0.b(a2);
            this.f47772k = a2;
            this.f47776o = (int) (a2.x * 10000.0f);
            this.f47777p = (int) (a2.y * 10000.0f);
            y0Var.b((int) (this.f47776o * 1.2f), (int) (this.f47777p * 1.2f), (int) (n(10000) * 1.2f), this.f25747r);
            return;
        }
        y0Var.d = this.f47917a;
        h();
    }
}
