package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends View {
    public a9 f25265a;
    public final e6 f25266b;
    public boolean f25267c;
    public boolean d;
    public final s20 f25268e;
    public Drawable f25269f;
    public Drawable h;
    public boolean f25270n;
    public Paint f25271r;
    public Paint f25272s;
    public boolean v;
    public final e9 f25273w;

    public c9(e9 e9Var, Context context) {
        super(context);
        this.f25273w = e9Var;
        e6 e6Var = new e6(400L, AndroidUtilities.overshootInterpolator);
        this.f25266b = e6Var;
        this.f25268e = new s20();
        e6Var.f25931a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25273w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
