package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a9 extends View {
    public y8 f24669a;
    public final d6 f24670b;
    public boolean f24671c;
    public boolean d;
    public final v20 e;
    public Drawable f24672f;
    public Drawable h;
    public boolean f24673n;
    public Paint f24674r;
    public Paint f24675s;
    public boolean v;
    public final c9 f24676w;

    public a9(c9 c9Var, Context context) {
        super(context);
        this.f24676w = c9Var;
        d6 d6Var = new d6(400L, AndroidUtilities.overshootInterpolator);
        this.f24670b = d6Var;
        this.e = new v20();
        d6Var.f25566a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f24676w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
