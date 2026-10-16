package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f9 extends View {
    public d9 f24652a;
    public final g6 f24653b;
    public boolean f24654c;
    public boolean d;
    public final b30 e;
    public Drawable f24655f;
    public Drawable h;
    public boolean f24656n;
    public Paint f24657r;
    public Paint f24658s;
    public boolean v;
    public final h9 f24659w;

    public f9(h9 h9Var, Context context) {
        super(context);
        this.f24659w = h9Var;
        g6 g6Var = new g6(400L, AndroidUtilities.overshootInterpolator);
        this.f24653b = g6Var;
        this.e = new b30();
        g6Var.f24883a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f24659w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
