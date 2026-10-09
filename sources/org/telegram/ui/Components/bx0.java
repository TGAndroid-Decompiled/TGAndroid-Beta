package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class bx0 extends s4.e0 {
    public final hs f25179r;
    public int f25180s;
    public float f25181t;

    public bx0(Context context) {
        super(context);
        this.f25179r = hs.f27118f;
        this.f25181t = 1.0f;
    }

    @Override
    public final void g(View view, s4.y0 y0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            y0Var.b(-j3, -k10, m10, this.f25179r);
        }
        AndroidUtilities.runOnUIThread(new or0(this, 8), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f25180s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f25181t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f25181t);
    }

    @Override
    public final void q(s4.y0 y0Var) {
        PointF a2 = a(this.f47827a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            s4.z0.b(a2);
            this.f47682k = a2;
            this.f47686o = (int) (a2.x * 10000.0f);
            this.f47687p = (int) (a2.y * 10000.0f);
            y0Var.b((int) (this.f47686o * 1.2f), (int) (this.f47687p * 1.2f), (int) (n(10000) * 1.2f), this.f25179r);
            return;
        }
        y0Var.d = this.f47827a;
        h();
    }
}
