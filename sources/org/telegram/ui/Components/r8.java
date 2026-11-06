package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class r8 extends View {
    public p8 f37540a;
    public final w5 f37541b;
    public boolean f37542c;
    public boolean d;
    public final e10 f37543e;
    public Drawable f37544f;
    public Drawable h;
    public boolean f37545n;
    public Paint f37546r;
    public Paint f37547s;
    public boolean f37548w;
    public final t8 f37549x;

    public r8(t8 t8Var, Context context) {
        super(context);
        this.f37549x = t8Var;
        w5 w5Var = new w5(400L, org.telegram.messenger.g0.H);
        this.f37541b = w5Var;
        this.f37543e = new e10();
        w5Var.f39853a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f37549x.P, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
