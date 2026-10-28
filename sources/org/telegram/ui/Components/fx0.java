package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class fx0 extends s4.d0 {
    public final ds f28306r;
    public int f28307s;
    public float f28308t;

    public fx0(Context context) {
        super(context);
        this.f28306r = ds.f27530f;
        this.f28308t = 1.0f;
    }

    @Override
    public final void g(View view, s4.z0 z0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            z0Var.b(-j10, -k10, m10, this.f28306r);
        }
        AndroidUtilities.runOnUIThread(new np0(this, 13), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f28307s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f28308t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f28308t);
    }

    @Override
    public final void q(s4.z0 z0Var) {
        PointF a2 = a(this.f47715a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            s4.a1.b(a2);
            this.f47760k = a2;
            this.f47764o = (int) (a2.x * 10000.0f);
            this.f47765p = (int) (a2.y * 10000.0f);
            z0Var.b((int) (this.f47764o * 1.2f), (int) (this.f47765p * 1.2f), (int) (n(10000) * 1.2f), this.f28306r);
            return;
        }
        z0Var.d = this.f47715a;
        h();
    }
}
