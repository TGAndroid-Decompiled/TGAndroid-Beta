package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e9 extends View {
    public c9 f27745a;
    public final h6 f27746b;
    public boolean f27747c;
    public boolean d;
    public final z20 e;
    public Drawable f27748f;
    public Drawable h;
    public boolean f27749n;
    public Paint f27750r;
    public Paint f27751s;
    public boolean v;
    public final g9 f27752w;

    public e9(g9 g9Var, Context context) {
        super(context);
        this.f27752w = g9Var;
        h6 h6Var = new h6(400L, AndroidUtilities.overshootInterpolator);
        this.f27746b = h6Var;
        this.e = new z20();
        h6Var.f28862a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f27752w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
