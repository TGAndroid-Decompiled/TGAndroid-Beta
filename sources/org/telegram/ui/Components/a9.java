package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a9 extends View {
    public y8 f22354a;
    public final c6 f22355b;
    public boolean f22356c;
    public boolean d;
    public final o20 e;
    public Drawable f22357f;
    public Drawable h;
    public boolean f22358n;
    public Paint f22359r;
    public Paint f22360s;
    public boolean v;
    public final c9 f22361w;

    public a9(c9 c9Var, Context context) {
        super(context);
        this.f22361w = c9Var;
        c6 c6Var = new c6(400L, AndroidUtilities.overshootInterpolator);
        this.f22355b = c6Var;
        this.e = new o20();
        c6Var.f22938a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22361w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
