package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class r8 extends View {
    public p8 f37637a;
    public final w5 f37638b;
    public boolean f37639c;
    public boolean d;
    public final e10 f37640e;
    public Drawable f37641f;
    public Drawable h;
    public boolean f37642n;
    public Paint f37643r;
    public Paint f37644s;
    public boolean f37645w;
    public final t8 f37646x;

    public r8(t8 t8Var, Context context) {
        super(context);
        this.f37646x = t8Var;
        w5 w5Var = new w5(400L, org.telegram.messenger.g0.H);
        this.f37638b = w5Var;
        this.f37640e = new e10();
        w5Var.f39847a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f37646x.P, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
