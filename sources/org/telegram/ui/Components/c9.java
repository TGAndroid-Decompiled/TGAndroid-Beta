package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends View {
    public a9 f25115a;
    public final f6 f25116b;
    public boolean f25117c;
    public boolean d;
    public final x20 e;
    public Drawable f25118f;
    public Drawable h;
    public boolean f25119n;
    public Paint f25120r;
    public Paint f25121s;
    public boolean v;
    public final e9 f25122w;

    public c9(e9 e9Var, Context context) {
        super(context);
        this.f25122w = e9Var;
        f6 f6Var = new f6(400L, AndroidUtilities.overshootInterpolator);
        this.f25116b = f6Var;
        this.e = new x20();
        f6Var.f26108a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25122w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
