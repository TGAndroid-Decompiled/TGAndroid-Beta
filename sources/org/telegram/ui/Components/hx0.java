package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class hx0 extends s4.e0 {
    public final js f26984r;
    public int f26985s;
    public float f26986t;

    public hx0(Context context) {
        super(context);
        this.f26984r = js.f27627f;
        this.f26986t = 1.0f;
    }

    @Override
    public final void g(View view, s4.y0 y0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            y0Var.b(-j3, -k10, m10, this.f26984r);
        }
        AndroidUtilities.runOnUIThread(new ur0(this, 9), Math.max(0, m10));
    }

    @Override
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.f26985s;
    }

    @Override
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.f26986t);
    }

    @Override
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), 150) * this.f26986t);
    }

    @Override
    public final void q(s4.y0 y0Var) {
        PointF a2 = a(this.f48058a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            s4.z0.b(a2);
            this.f47913k = a2;
            this.f47917o = (int) (a2.x * 10000.0f);
            this.f47918p = (int) (a2.y * 10000.0f);
            y0Var.b((int) (this.f47917o * 1.2f), (int) (this.f47918p * 1.2f), (int) (n(10000) * 1.2f), this.f26984r);
            return;
        }
        y0Var.d = this.f48058a;
        h();
    }
}
