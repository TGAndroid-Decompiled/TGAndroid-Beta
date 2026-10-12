package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f9 extends View {
    public d9 f24970a;
    public final g6 f24971b;
    public boolean f24972c;
    public boolean d;
    public final b30 e;
    public Drawable f24973f;
    public Drawable h;
    public boolean f24974n;
    public Paint f24975r;
    public Paint f24976s;
    public boolean v;
    public final h9 f24977w;

    public f9(h9 h9Var, Context context) {
        super(context);
        this.f24977w = h9Var;
        g6 g6Var = new g6(400L, AndroidUtilities.overshootInterpolator);
        this.f24971b = g6Var;
        this.e = new b30();
        g6Var.f25188a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f24977w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
