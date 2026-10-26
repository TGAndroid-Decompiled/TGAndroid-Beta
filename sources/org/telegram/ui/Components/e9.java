package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends View {
    public c9 f27761a;
    public final h6 f27762b;
    public boolean f27763c;
    public boolean d;
    public final z20 e;
    public Drawable f27764f;
    public Drawable h;
    public boolean f27765n;
    public Paint f27766r;
    public Paint f27767s;
    public boolean v;
    public final g9 f27768w;

    public e9(g9 g9Var, Context context) {
        super(context);
        this.f27768w = g9Var;
        h6 h6Var = new h6(400L, AndroidUtilities.overshootInterpolator);
        this.f27762b = h6Var;
        this.e = new z20();
        h6Var.f28809a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f27768w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
