package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class jw0 extends s4.d0 {
    public final rr f25557r;
    public int f25558s;
    public float f25559t;

    public jw0(Context context) {
        super(context);
        this.f25557r = rr.f28022f;
        this.f25559t = 1.0f;
    }

    @Override
    public final void g(View view, s4.x0 x0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            x0Var.b(-j3, -k10, m10, this.f25557r);
        }
        AndroidUtilities.runOnUIThread(new wq0(this, 9), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f25558s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f25559t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f25559t);
    }

    @Override
    public final void q(s4.x0 x0Var) {
        PointF a2 = a(this.f43096a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            s4.y0.b(a2);
            this.f42969k = a2;
            this.f42973o = (int) (a2.x * 10000.0f);
            this.f42974p = (int) (a2.y * 10000.0f);
            x0Var.b((int) (this.f42973o * 1.2f), (int) (this.f42974p * 1.2f), (int) (n(10000) * 1.2f), this.f25557r);
            return;
        }
        x0Var.d = this.f43096a;
        h();
    }
}
