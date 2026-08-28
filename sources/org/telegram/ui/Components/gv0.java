package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class gv0 extends f2.n0 {
    public final gr f28879r;
    public int f28880s;
    public float f28881t;

    public gv0(Context context) {
        super(context);
        this.f28879r = gr.f28844f;
        this.f28881t = 1.0f;
    }

    @Override
    public final void g(View view, f2.l1 l1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            l1Var.b(-j10, -k10, m10, this.f28879r);
        }
        AndroidUtilities.runOnUIThread(new tp0(this, 8), Math.max(0, m10));
    }

    @Override
    public final int k(int i9, View view) {
        return super.k(i9, view) - this.f28880s;
    }

    @Override
    public final int m(int i9) {
        return Math.round(Math.min(super.m(i9), 500) * this.f28881t);
    }

    @Override
    public final int n(int i9) {
        return Math.round(Math.min(super.n(i9), 150) * this.f28881t);
    }

    @Override
    public final void q(f2.l1 l1Var) {
        PointF a2 = a(this.f5443a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            f2.m1.b(a2);
            this.f5463k = a2;
            this.f5467o = (int) (a2.x * 10000.0f);
            this.f5468p = (int) (a2.y * 10000.0f);
            l1Var.b((int) (this.f5467o * 1.2f), (int) (this.f5468p * 1.2f), (int) (n(10000) * 1.2f), this.f28879r);
            return;
        }
        l1Var.d = this.f5443a;
        h();
    }
}
