package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class r8 extends View {
    public p8 f37580a;
    public final w5 f37581b;
    public boolean f37582c;
    public boolean d;
    public final e10 f37583e;
    public Drawable f37584f;
    public Drawable h;
    public boolean f37585n;
    public Paint f37586r;
    public Paint f37587s;
    public boolean f37588w;
    public final t8 f37589x;

    public r8(t8 t8Var, Context context) {
        super(context);
        this.f37589x = t8Var;
        w5 w5Var = new w5(400L, org.telegram.messenger.g0.H);
        this.f37581b = w5Var;
        this.f37583e = new e10();
        w5Var.f39855a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f37589x.P, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
