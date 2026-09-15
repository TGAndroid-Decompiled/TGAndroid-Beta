package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a9 extends View {
    public y8 f22335a;
    public final c6 f22336b;
    public boolean f22337c;
    public boolean d;
    public final o20 e;
    public Drawable f22338f;
    public Drawable h;
    public boolean f22339n;
    public Paint f22340r;
    public Paint f22341s;
    public boolean v;
    public final c9 f22342w;

    public a9(c9 c9Var, Context context) {
        super(context);
        this.f22342w = c9Var;
        c6 c6Var = new c6(400L, AndroidUtilities.overshootInterpolator);
        this.f22336b = c6Var;
        this.e = new o20();
        c6Var.f22951a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22342w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
