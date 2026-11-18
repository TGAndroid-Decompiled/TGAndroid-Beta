package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class w8 extends View {
    public u8 f41615a;
    public final c6 f41616b;
    public boolean f41617c;
    public boolean d;
    public final p10 f41618e;
    public Drawable f41619f;
    public Drawable h;
    public boolean f41620n;
    public Paint f41621r;
    public Paint f41622s;
    public boolean f41623w;
    public final y8 f41624x;

    public w8(y8 y8Var, Context context) {
        super(context);
        this.f41624x = y8Var;
        c6 c6Var = new c6(400L, org.telegram.messenger.g0.H);
        this.f41616b = c6Var;
        this.f41618e = new p10();
        c6Var.f33890a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f41624x.Q, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
