package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends View {
    public c9 f25965a;
    public final g6 f25966b;
    public boolean f25967c;
    public boolean d;
    public final g30 f25968e;
    public Drawable f25969f;
    public Drawable h;
    public boolean f25970n;
    public Paint f25971r;
    public Paint f25972s;
    public boolean v;
    public final g9 f25973w;

    public e9(g9 g9Var, Context context) {
        super(context);
        this.f25973w = g9Var;
        g6 g6Var = new g6(400L, AndroidUtilities.overshootInterpolator);
        this.f25966b = g6Var;
        this.f25968e = new g30();
        g6Var.f26614a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25973w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
