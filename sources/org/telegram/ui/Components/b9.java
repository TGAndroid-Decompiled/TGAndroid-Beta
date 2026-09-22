package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends View {
    public z8 f22921a;
    public final d6 f22922b;
    public boolean f22923c;
    public boolean d;
    public final o20 e;
    public Drawable f22924f;
    public Drawable h;
    public boolean f22925n;
    public Paint f22926r;
    public Paint f22927s;
    public boolean v;
    public final d9 f22928w;

    public b9(d9 d9Var, Context context) {
        super(context);
        this.f22928w = d9Var;
        d6 d6Var = new d6(400L, AndroidUtilities.overshootInterpolator);
        this.f22922b = d6Var;
        this.e = new o20();
        d6Var.f23568a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22928w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
