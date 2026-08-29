package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class qv0 extends f2.k0 {
    public final jr f32114r;
    public int f32115s;
    public float f32116t;

    public qv0(Context context) {
        super(context);
        this.f32114r = jr.f29800f;
        this.f32116t = 1.0f;
    }

    @Override
    public final void g(View view, f2.i1 i1Var) {
        int j10 = j(o(), view);
        int k9 = k(p(), view);
        int m10 = m((int) Math.sqrt((k9 * k9) + (j10 * j10)));
        if (m10 > 0) {
            i1Var.b(-j10, -k9, m10, this.f32114r);
        }
        AndroidUtilities.runOnUIThread(new fq0(this, 8), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f32115s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f32116t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f32116t);
    }

    @Override
    public final void q(f2.i1 i1Var) {
        PointF a2 = a(this.f6373a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            f2.j1.b(a2);
            this.f6386k = a2;
            this.f6390o = (int) (a2.x * 10000.0f);
            this.f6391p = (int) (a2.y * 10000.0f);
            i1Var.b((int) (this.f6390o * 1.2f), (int) (this.f6391p * 1.2f), (int) (n(10000) * 1.2f), this.f32114r);
            return;
        }
        i1Var.d = this.f6373a;
        h();
    }
}
