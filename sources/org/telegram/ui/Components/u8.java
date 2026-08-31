package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u8 extends View {
    public s8 f31588a;
    public final z5 f31589b;
    public boolean f31590c;
    public boolean d;
    public final q20 f31591e;
    public Drawable f31592f;
    public Drawable h;
    public boolean f31593n;
    public Paint f31594r;
    public Paint f31595s;
    public boolean v;
    public final w8 f31596w;

    public u8(w8 w8Var, Context context) {
        super(context);
        this.f31596w = w8Var;
        z5 z5Var = new z5(400L, AndroidUtilities.overshootInterpolator);
        this.f31589b = z5Var;
        this.f31591e = new q20();
        z5Var.f33723a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f31596w.M, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
