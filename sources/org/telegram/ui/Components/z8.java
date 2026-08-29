package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends View {
    public x8 f35269a;
    public final d6 f35270b;
    public boolean f35271c;
    public boolean d;
    public final k20 f35272e;
    public Drawable f35273f;
    public Drawable h;
    public boolean f35274n;
    public Paint f35275r;
    public Paint f35276s;
    public boolean v;
    public final b9 f35277w;

    public z8(b9 b9Var, Context context) {
        super(context);
        this.f35277w = b9Var;
        d6 d6Var = new d6(400L, AndroidUtilities.overshootInterpolator);
        this.f35270b = d6Var;
        this.f35272e = new k20();
        d6Var.f27664a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f35277w.L, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
