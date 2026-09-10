package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends View {
    public z8 f21757a;
    public final d6 f21758b;
    public boolean f21759c;
    public boolean d;
    public final x20 e;
    public Drawable f21760f;
    public Drawable h;
    public boolean f21761n;
    public Paint f21762r;
    public Paint f21763s;
    public boolean v;
    public final d9 f21764w;

    public b9(d9 d9Var, Context context) {
        super(context);
        this.f21764w = d9Var;
        d6 d6Var = new d6(400L, AndroidUtilities.overshootInterpolator);
        this.f21758b = d6Var;
        this.e = new x20();
        d6Var.f22293a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f21764w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
