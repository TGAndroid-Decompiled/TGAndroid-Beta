package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends View {
    public z8 f22928a;
    public final d6 f22929b;
    public boolean f22930c;
    public boolean d;
    public final o20 e;
    public Drawable f22931f;
    public Drawable h;
    public boolean f22932n;
    public Paint f22933r;
    public Paint f22934s;
    public boolean v;
    public final d9 f22935w;

    public b9(d9 d9Var, Context context) {
        super(context);
        this.f22935w = d9Var;
        d6 d6Var = new d6(400L, AndroidUtilities.overshootInterpolator);
        this.f22929b = d6Var;
        this.e = new o20();
        d6Var.f23499a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22935w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
