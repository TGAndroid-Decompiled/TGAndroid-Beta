package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends View {
    public a9 f25149a;
    public final f6 f25150b;
    public boolean f25151c;
    public boolean d;
    public final x20 e;
    public Drawable f25152f;
    public Drawable h;
    public boolean f25153n;
    public Paint f25154r;
    public Paint f25155s;
    public boolean v;
    public final e9 f25156w;

    public c9(e9 e9Var, Context context) {
        super(context);
        this.f25156w = e9Var;
        f6 f6Var = new f6(400L, AndroidUtilities.overshootInterpolator);
        this.f25150b = f6Var;
        this.e = new x20();
        f6Var.f26087a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25156w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
