package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends View {
    public a9 f25262a;
    public final f6 f25263b;
    public boolean f25264c;
    public boolean d;
    public final x20 e;
    public Drawable f25265f;
    public Drawable h;
    public boolean f25266n;
    public Paint f25267r;
    public Paint f25268s;
    public boolean v;
    public final e9 f25269w;

    public c9(e9 e9Var, Context context) {
        super(context);
        this.f25269w = e9Var;
        f6 f6Var = new f6(400L, AndroidUtilities.overshootInterpolator);
        this.f25263b = f6Var;
        this.e = new x20();
        f6Var.f26178a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25269w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
