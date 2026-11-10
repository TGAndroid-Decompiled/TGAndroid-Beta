package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class q8 extends View {
    public o8 f37166a;
    public final v5 f37167b;
    public boolean f37168c;
    public boolean d;
    public final e10 f37169e;
    public Drawable f37170f;
    public Drawable h;
    public boolean f37171n;
    public Paint f37172r;
    public Paint f37173s;
    public boolean f37174w;
    public final s8 f37175x;

    public q8(s8 s8Var, Context context) {
        super(context);
        this.f37175x = s8Var;
        v5 v5Var = new v5(400L, org.telegram.messenger.g0.H);
        this.f37167b = v5Var;
        this.f37169e = new e10();
        v5Var.f38852a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f37175x.P, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
