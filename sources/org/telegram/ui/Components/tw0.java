package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class tw0 extends s4.c0 {
    public final bs f30747r;
    public int f30748s;
    public float f30749t;

    public tw0(Context context) {
        super(context);
        this.f30747r = bs.f25014f;
        this.f30749t = 1.0f;
    }

    @Override
    public final void g(View view, s4.w0 w0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            w0Var.b(-j10, -k10, m10, this.f30747r);
        }
        AndroidUtilities.runOnUIThread(new gr0(this, 8), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f30748s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f30749t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f30749t);
    }

    @Override
    public final void q(s4.w0 w0Var) {
        PointF a2 = a(this.f46051a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            s4.x0.b(a2);
            this.f45933k = a2;
            this.f45937o = (int) (a2.x * 10000.0f);
            this.f45938p = (int) (a2.y * 10000.0f);
            w0Var.b((int) (this.f45937o * 1.2f), (int) (this.f45938p * 1.2f), (int) (n(10000) * 1.2f), this.f30747r);
            return;
        }
        w0Var.d = this.f46051a;
        h();
    }
}
