package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends View {
    public c9 f25925a;
    public final g6 f25926b;
    public boolean f25927c;
    public boolean d;
    public final g30 f25928e;
    public Drawable f25929f;
    public Drawable h;
    public boolean f25930n;
    public Paint f25931r;
    public Paint f25932s;
    public boolean v;
    public final g9 f25933w;

    public e9(g9 g9Var, Context context) {
        super(context);
        this.f25933w = g9Var;
        g6 g6Var = new g6(400L, AndroidUtilities.overshootInterpolator);
        this.f25926b = g6Var;
        this.f25928e = new g30();
        g6Var.f26611a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25933w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
