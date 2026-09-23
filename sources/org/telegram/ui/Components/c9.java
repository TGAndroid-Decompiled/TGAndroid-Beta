package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends View {
    public a9 f22982a;
    public final e6 f22983b;
    public boolean f22984c;
    public boolean d;
    public final p20 e;
    public Drawable f22985f;
    public Drawable h;
    public boolean f22986n;
    public Paint f22987r;
    public Paint f22988s;
    public boolean v;
    public final e9 f22989w;

    public c9(e9 e9Var, Context context) {
        super(context);
        this.f22989w = e9Var;
        e6 e6Var = new e6(400L, AndroidUtilities.overshootInterpolator);
        this.f22983b = e6Var;
        this.e = new p20();
        e6Var.f23573a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22989w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
