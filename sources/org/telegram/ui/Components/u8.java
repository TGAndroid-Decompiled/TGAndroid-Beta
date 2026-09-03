package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u8 extends View {
    public s8 f31546a;
    public final z5 f31547b;
    public boolean f31548c;
    public boolean d;
    public final q20 f31549e;
    public Drawable f31550f;
    public Drawable h;
    public boolean f31551n;
    public Paint f31552r;
    public Paint f31553s;
    public boolean v;
    public final w8 f31554w;

    public u8(w8 w8Var, Context context) {
        super(context);
        this.f31554w = w8Var;
        z5 z5Var = new z5(400L, AndroidUtilities.overshootInterpolator);
        this.f31547b = z5Var;
        this.f31549e = new q20();
        z5Var.f33761a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f31554w.M, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
