package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends View {
    public a9 f25113a;
    public final f6 f25114b;
    public boolean f25115c;
    public boolean d;
    public final x20 e;
    public Drawable f25116f;
    public Drawable h;
    public boolean f25117n;
    public Paint f25118r;
    public Paint f25119s;
    public boolean v;
    public final e9 f25120w;

    public c9(e9 e9Var, Context context) {
        super(context);
        this.f25120w = e9Var;
        f6 f6Var = new f6(400L, AndroidUtilities.overshootInterpolator);
        this.f25114b = f6Var;
        this.e = new x20();
        f6Var.f26106a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25120w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
