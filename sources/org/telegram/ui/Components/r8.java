package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class r8 extends View {
    public p8 f37575a;
    public final w5 f37576b;
    public boolean f37577c;
    public boolean d;
    public final f10 f37578e;
    public Drawable f37579f;
    public Drawable h;
    public boolean f37580n;
    public Paint f37581r;
    public Paint f37582s;
    public boolean f37583w;
    public final t8 f37584x;

    public r8(t8 t8Var, Context context) {
        super(context);
        this.f37584x = t8Var;
        w5 w5Var = new w5(400L, org.telegram.messenger.g0.H);
        this.f37576b = w5Var;
        this.f37578e = new f10();
        w5Var.f39908a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f37584x.P, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
