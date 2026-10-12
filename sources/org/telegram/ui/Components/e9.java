package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends View {
    public c9 f25627a;
    public final g6 f25628b;
    public boolean f25629c;
    public boolean d;
    public final i30 f25630e;
    public Drawable f25631f;
    public Drawable h;
    public boolean f25632n;
    public Paint f25633r;
    public Paint f25634s;
    public boolean v;
    public final g9 f25635w;

    public e9(g9 g9Var, Context context) {
        super(context);
        this.f25635w = g9Var;
        g6 g6Var = new g6(400L, AndroidUtilities.overshootInterpolator);
        this.f25628b = g6Var;
        this.f25630e = new i30();
        g6Var.f26301a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25635w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
