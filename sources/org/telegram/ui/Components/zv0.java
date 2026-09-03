package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class zv0 extends f2.k0 {
    public final pr f34027r;
    public int f34028s;
    public float f34029t;

    public zv0(Context context) {
        super(context);
        this.f34027r = pr.f30168f;
        this.f34029t = 1.0f;
    }

    @Override
    public final void g(View view, f2.h1 h1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m9 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m9 > 0) {
            h1Var.b(-j10, -k10, m9, this.f34027r);
        }
        AndroidUtilities.runOnUIThread(new nq0(this, 8), Math.max(0, m9));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f34028s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f34029t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f34029t);
    }

    @Override
    public final void q(f2.h1 h1Var) {
        PointF a2 = a(this.f5805a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            f2.i1.b(a2);
            this.f5846k = a2;
            this.f5850o = (int) (a2.x * 10000.0f);
            this.f5851p = (int) (a2.y * 10000.0f);
            h1Var.b((int) (this.f5850o * 1.2f), (int) (this.f5851p * 1.2f), (int) (n(10000) * 1.2f), this.f34027r);
            return;
        }
        h1Var.d = this.f5805a;
        h();
    }
}
