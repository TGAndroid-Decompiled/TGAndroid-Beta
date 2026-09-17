package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d9 extends View {
    public b9 f25295a;
    public final e6 f25296b;
    public boolean f25297c;
    public boolean d;
    public final o20 f25298e;
    public Drawable f25299f;
    public Drawable h;
    public boolean f25300n;
    public Paint f25301r;
    public Paint f25302s;
    public boolean v;
    public final f9 f25303w;

    public d9(f9 f9Var, Context context) {
        super(context);
        this.f25303w = f9Var;
        e6 e6Var = new e6(400L, AndroidUtilities.overshootInterpolator);
        this.f25296b = e6Var;
        this.f25298e = new o20();
        e6Var.f25564a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25303w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
