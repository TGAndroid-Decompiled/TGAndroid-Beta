package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u8 extends View {
    public s8 f32952a;
    public final y5 f32953b;
    public boolean f32954c;
    public boolean d;
    public final z10 f32955e;
    public Drawable f32956f;
    public Drawable h;
    public boolean f32957n;
    public Paint f32958r;
    public Paint f32959s;
    public boolean v;
    public final w8 f32960w;

    public u8(w8 w8Var, Context context) {
        super(context);
        this.f32960w = w8Var;
        y5 y5Var = new y5(400L, AndroidUtilities.overshootInterpolator);
        this.f32953b = y5Var;
        this.f32955e = new z10();
        y5Var.f34852a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f32960w.L, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
