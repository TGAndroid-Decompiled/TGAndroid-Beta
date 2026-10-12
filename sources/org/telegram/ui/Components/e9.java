package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends View {
    public c9 f25632a;
    public final g6 f25633b;
    public boolean f25634c;
    public boolean d;
    public final i30 f25635e;
    public Drawable f25636f;
    public Drawable h;
    public boolean f25637n;
    public Paint f25638r;
    public Paint f25639s;
    public boolean v;
    public final g9 f25640w;

    public e9(g9 g9Var, Context context) {
        super(context);
        this.f25640w = g9Var;
        g6 g6Var = new g6(400L, AndroidUtilities.overshootInterpolator);
        this.f25633b = g6Var;
        this.f25635e = new i30();
        g6Var.f26299a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25640w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
