package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u8 extends View {
    public s8 f29129a;
    public final z5 f29130b;
    public boolean f29131c;
    public boolean d;
    public final q20 e;
    public Drawable f29132f;
    public Drawable h;
    public boolean f29133n;
    public Paint f29134r;
    public Paint f29135s;
    public boolean v;
    public final w8 f29136w;

    public u8(w8 w8Var, Context context) {
        super(context);
        this.f29136w = w8Var;
        z5 z5Var = new z5(400L, AndroidUtilities.overshootInterpolator);
        this.f29130b = z5Var;
        this.e = new q20();
        z5Var.f31251a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f29136w.M, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
