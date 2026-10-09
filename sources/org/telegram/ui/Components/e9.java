package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends View {
    public c9 f25989a;
    public final g6 f25990b;
    public boolean f25991c;
    public boolean d;
    public final f30 f25992e;
    public Drawable f25993f;
    public Drawable h;
    public boolean f25994n;
    public Paint f25995r;
    public Paint f25996s;
    public boolean v;
    public final g9 f25997w;

    public e9(g9 g9Var, Context context) {
        super(context);
        this.f25997w = g9Var;
        g6 g6Var = new g6(400L, AndroidUtilities.overshootInterpolator);
        this.f25990b = g6Var;
        this.f25992e = new f30();
        g6Var.f26597a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25997w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
