package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c9 extends View {
    public a9 f25155a;
    public final f6 f25156b;
    public boolean f25157c;
    public boolean d;
    public final x20 e;
    public Drawable f25158f;
    public Drawable h;
    public boolean f25159n;
    public Paint f25160r;
    public Paint f25161s;
    public boolean v;
    public final e9 f25162w;

    public c9(e9 e9Var, Context context) {
        super(context);
        this.f25162w = e9Var;
        f6 f6Var = new f6(400L, AndroidUtilities.overshootInterpolator);
        this.f25156b = f6Var;
        this.e = new x20();
        f6Var.f26091a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25162w.P, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
