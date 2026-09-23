package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class yv0 extends s4.d0 {
    public final rr f30462r;
    public int f30463s;
    public float f30464t;

    public yv0(Context context) {
        super(context);
        this.f30462r = rr.f27701f;
        this.f30464t = 1.0f;
    }

    @Override
    public final void g(View view, s4.x0 x0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            x0Var.b(-j3, -k10, m10, this.f30462r);
        }
        AndroidUtilities.runOnUIThread(new jq0(this, 8), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f30463s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f30464t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f30464t);
    }

    @Override
    public final void q(s4.x0 x0Var) {
        PointF a2 = a(this.f42777a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            s4.y0.b(a2);
            this.f42650k = a2;
            this.f42654o = (int) (a2.x * 10000.0f);
            this.f42655p = (int) (a2.y * 10000.0f);
            x0Var.b((int) (this.f42654o * 1.2f), (int) (this.f42655p * 1.2f), (int) (n(10000) * 1.2f), this.f30462r);
            return;
        }
        x0Var.d = this.f42777a;
        h();
    }
}
