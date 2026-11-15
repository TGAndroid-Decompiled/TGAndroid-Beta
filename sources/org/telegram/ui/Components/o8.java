package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class o8 extends View {
    public m8 f37853a;
    public final u5 f37854b;
    public boolean f37855c;
    public boolean d;
    public final i10 f37856e;
    public Drawable f37857f;
    public Drawable h;
    public boolean f37858n;
    public Paint f37859r;
    public Paint f37860s;
    public boolean f37861w;
    public final q8 f37862x;

    public o8(q8 q8Var, Context context) {
        super(context);
        this.f37862x = q8Var;
        u5 u5Var = new u5(400L, org.telegram.messenger.g0.H);
        this.f37854b = u5Var;
        this.f37856e = new i10();
        u5Var.f39898a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f37862x.Q, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
