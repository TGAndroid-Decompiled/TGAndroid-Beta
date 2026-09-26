package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends View {
    public a9 f23282a;
    public final e6 f23283b;
    public boolean f23284c;
    public boolean d;
    public final p20 e;
    public Drawable f23285f;
    public Drawable h;
    public boolean f23286n;
    public Paint f23287r;
    public Paint f23288s;
    public boolean v;
    public final e9 f23289w;

    public c9(e9 e9Var, Context context) {
        super(context);
        this.f23289w = e9Var;
        e6 e6Var = new e6(400L, AndroidUtilities.overshootInterpolator);
        this.f23283b = e6Var;
        this.e = new p20();
        e6Var.f23842a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f23289w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
