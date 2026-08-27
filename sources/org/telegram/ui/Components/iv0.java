package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public class iv0 extends f2.l0 {

    public final er f29500r;

    public int f29501s;

    public float f29502t;

    public iv0(Context context) {
        super(context);
        this.f29500r = er.f28122f;
        this.f29502t = 1.0f;
    }

    @Override
    public final void g(View view, f2.j1 j1Var) {
        int iJ = j(o(), view);
        int iK = k(p(), view);
        int iM = m((int) Math.sqrt((iK * iK) + (iJ * iJ)));
        if (iM > 0) {
            j1Var.b(-iJ, -iK, iM, this.f29500r);
        }
        AndroidUtilities.runOnUIThread(new up0(this, 8), Math.max(0, iM));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f29501s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f29502t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f29502t);
    }

    @Override
    public final void q(f2.j1 j1Var) {
        PointF pointFA = a(this.f5731a);
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            j1Var.d = this.f5731a;
            h();
            return;
        }
        f2.k1.b(pointFA);
        this.f5751k = pointFA;
        this.f5755o = (int) (pointFA.x * 10000.0f);
        this.f5756p = (int) (pointFA.y * 10000.0f);
        j1Var.b((int) (this.f5755o * 1.2f), (int) (this.f5756p * 1.2f), (int) (n(10000) * 1.2f), this.f29500r);
    }
}
