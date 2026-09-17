package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a9 extends View {
    public y8 f22351a;
    public final c6 f22352b;
    public boolean f22353c;
    public boolean d;
    public final o20 e;
    public Drawable f22354f;
    public Drawable h;
    public boolean f22355n;
    public Paint f22356r;
    public Paint f22357s;
    public boolean v;
    public final c9 f22358w;

    public a9(c9 c9Var, Context context) {
        super(context);
        this.f22358w = c9Var;
        c6 c6Var = new c6(400L, AndroidUtilities.overshootInterpolator);
        this.f22352b = c6Var;
        this.e = new o20();
        c6Var.f22935a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22358w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
