package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class df extends mh.y {
    public boolean f27731s;
    public final ChatActivityEnterView v;

    public df(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f18204a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f18208f = true;
        this.f18205b = new Object();
        gh.f1 f1Var = new gh.f1(this, context, 3);
        this.f18206c = f1Var;
        f1Var.setOverScrollMode(2);
        f1Var.setClipToPadding(false);
        f1Var.setClipToOutline(true);
        f1Var.j(new bg.o2(this, 14));
        addView(f1Var);
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ii, false));
        kg.d dVar = this.f18210r;
        if (dVar != null) {
            dVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.f27731s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (!this.f27731s) {
            this.f27731s = true;
            this.v.C1();
        }
    }
}
