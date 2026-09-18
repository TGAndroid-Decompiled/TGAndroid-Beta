package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends View {
    public a9 f23220a;
    public final e6 f23221b;
    public boolean f23222c;
    public boolean d;
    public final o20 e;
    public Drawable f23223f;
    public Drawable h;
    public boolean f23224n;
    public Paint f23225r;
    public Paint f23226s;
    public boolean v;
    public final e9 f23227w;

    public c9(e9 e9Var, Context context) {
        super(context);
        this.f23227w = e9Var;
        e6 e6Var = new e6(400L, AndroidUtilities.overshootInterpolator);
        this.f23221b = e6Var;
        this.e = new o20();
        e6Var.f23792a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f23227w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
