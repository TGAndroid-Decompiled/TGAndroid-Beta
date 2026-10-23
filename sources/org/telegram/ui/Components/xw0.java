package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class xw0 extends s4.c0 {
    public final bs f32723r;
    public int f32724s;
    public float f32725t;

    public xw0(Context context) {
        super(context);
        this.f32723r = bs.f25133f;
        this.f32725t = 1.0f;
    }

    @Override
    public final void g(View view, s4.w0 w0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            w0Var.b(-j10, -k10, m10, this.f32723r);
        }
        AndroidUtilities.runOnUIThread(new kr0(this, 9), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f32724s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f32725t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f32725t);
    }

    @Override
    public final void q(s4.w0 w0Var) {
        PointF a2 = a(this.f46484a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            s4.x0.b(a2);
            this.f46366k = a2;
            this.f46370o = (int) (a2.x * 10000.0f);
            this.f46371p = (int) (a2.y * 10000.0f);
            w0Var.b((int) (this.f46370o * 1.2f), (int) (this.f46371p * 1.2f), (int) (n(10000) * 1.2f), this.f32723r);
            return;
        }
        w0Var.d = this.f46484a;
        h();
    }
}
