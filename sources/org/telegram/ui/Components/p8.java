package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class p8 extends View {
    public n8 f37076a;
    public final u5 f37077b;
    public boolean f37078c;
    public boolean d;
    public final b10 f37079e;
    public Drawable f37080f;
    public Drawable h;
    public boolean f37081n;
    public Paint f37082r;
    public Paint f37083s;
    public boolean f37084w;
    public final r8 f37085x;

    public p8(r8 r8Var, Context context) {
        super(context);
        this.f37085x = r8Var;
        u5 u5Var = new u5(400L, org.telegram.messenger.g0.H);
        this.f37077b = u5Var;
        this.f37079e = new b10();
        u5Var.f38643a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f37085x.Q, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
