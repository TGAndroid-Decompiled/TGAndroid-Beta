package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class w8 extends View {
    public u8 f41691a;
    public final d6 f41692b;
    public boolean f41693c;
    public boolean d;
    public final s10 f41694e;
    public Drawable f41695f;
    public Drawable h;
    public boolean f41696n;
    public Paint f41697r;
    public Paint f41698s;
    public boolean f41699w;
    public final y8 f41700x;

    public w8(y8 y8Var, Context context) {
        super(context);
        this.f41700x = y8Var;
        d6 d6Var = new d6(400L, org.telegram.messenger.g0.H);
        this.f41692b = d6Var;
        this.f41694e = new s10();
        d6Var.f34384a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f41700x.Q, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
