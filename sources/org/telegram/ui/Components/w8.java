package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class w8 extends View {
    public u8 f41664a;
    public final d6 f41665b;
    public boolean f41666c;
    public boolean d;
    public final s10 f41667e;
    public Drawable f41668f;
    public Drawable h;
    public boolean f41669n;
    public Paint f41670r;
    public Paint f41671s;
    public boolean f41672w;
    public final y8 f41673x;

    public w8(y8 y8Var, Context context) {
        super(context);
        this.f41673x = y8Var;
        d6 d6Var = new d6(400L, org.telegram.messenger.g0.H);
        this.f41665b = d6Var;
        this.f41667e = new s10();
        d6Var.f34347a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f41673x.Q, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
