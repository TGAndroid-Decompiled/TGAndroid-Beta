package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class v8 extends View {
    public t8 f40582a;
    public final c6 f40583b;
    public boolean f40584c;
    public boolean d;
    public final q10 f40585e;
    public Drawable f40586f;
    public Drawable h;
    public boolean f40587n;
    public Paint f40588r;
    public Paint f40589s;
    public boolean f40590w;
    public final x8 f40591x;

    public v8(x8 x8Var, Context context) {
        super(context);
        this.f40591x = x8Var;
        c6 c6Var = new c6(400L, org.telegram.messenger.g0.H);
        this.f40583b = c6Var;
        this.f40585e = new q10();
        c6Var.f33929a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f40591x.Q, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
