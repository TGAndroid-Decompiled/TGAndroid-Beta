package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class m8 extends View {
    public k8 f28402a;
    public final t5 f28403b;
    public boolean f28404c;
    public boolean d;
    public final u10 e;
    public Drawable f28405f;
    public Drawable h;
    public boolean f28406n;
    public Paint f28407r;
    public Paint f28408s;
    public boolean f28409w;
    public final o8 f28410x;

    public m8(o8 o8Var, Context context) {
        super(context);
        this.f28410x = o8Var;
        t5 t5Var = new t5(400L, org.telegram.messenger.i0.H);
        this.f28403b = t5Var;
        this.e = new u10();
        t5Var.f30528a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f28410x.P, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }
}
