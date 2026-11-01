package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
public class ev0 extends s4.b0 {
    public final gr f25941r;
    public int f25942s;
    public float f25943t;

    public ev0(Context context) {
        super(context);
        this.f25941r = gr.f26523f;
        this.f25943t = 1.0f;
    }

    @Override
    public final void g(View view, s4.x0 x0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            x0Var.b(-j10, -k10, m10, this.f25941r);
        }
        org.telegram.messenger.i0.h3(new vo0(this, 10), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f25942s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f25943t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f25943t);
    }

    @Override
    public final void q(s4.x0 x0Var) {
        PointF a2 = a(this.f48056a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            s4.y0.b(a2);
            this.f47896k = a2;
            this.f47900o = (int) (a2.x * 10000.0f);
            this.f47901p = (int) (a2.y * 10000.0f);
            x0Var.b((int) (this.f47900o * 1.2f), (int) (this.f47901p * 1.2f), (int) (n(10000) * 1.2f), this.f25941r);
            return;
        }
        x0Var.d = this.f48056a;
        h();
    }
}
