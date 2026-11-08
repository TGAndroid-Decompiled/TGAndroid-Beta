package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class r8 extends View {
    public p8 f37561a;
    public final w5 f37562b;
    public boolean f37563c;
    public boolean d;
    public final f10 f37564e;
    public Drawable f37565f;
    public Drawable h;
    public boolean f37566n;
    public Paint f37567r;
    public Paint f37568s;
    public boolean f37569w;
    public final t8 f37570x;

    public r8(t8 t8Var, Context context) {
        super(context);
        this.f37570x = t8Var;
        w5 w5Var = new w5(400L, org.telegram.messenger.g0.H);
        this.f37562b = w5Var;
        this.f37564e = new f10();
        w5Var.f39803a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f37570x.P, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
