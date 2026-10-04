package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends View {
    public a9 f25266a;
    public final e6 f25267b;
    public boolean f25268c;
    public boolean d;
    public final s20 f25269e;
    public Drawable f25270f;
    public Drawable h;
    public boolean f25271n;
    public Paint f25272r;
    public Paint f25273s;
    public boolean v;
    public final e9 f25274w;

    public c9(e9 e9Var, Context context) {
        super(context);
        this.f25274w = e9Var;
        e6 e6Var = new e6(400L, AndroidUtilities.overshootInterpolator);
        this.f25267b = e6Var;
        this.f25269e = new s20();
        e6Var.f25932a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25274w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
