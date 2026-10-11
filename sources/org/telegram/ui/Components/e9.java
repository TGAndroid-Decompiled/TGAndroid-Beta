package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends View {
    public c9 f26017a;
    public final g6 f26018b;
    public boolean f26019c;
    public boolean d;
    public final g30 f26020e;
    public Drawable f26021f;
    public Drawable h;
    public boolean f26022n;
    public Paint f26023r;
    public Paint f26024s;
    public boolean v;
    public final g9 f26025w;

    public e9(g9 g9Var, Context context) {
        super(context);
        this.f26025w = g9Var;
        g6 g6Var = new g6(400L, AndroidUtilities.overshootInterpolator);
        this.f26018b = g6Var;
        this.f26020e = new g30();
        g6Var.f26663a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f26025w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
