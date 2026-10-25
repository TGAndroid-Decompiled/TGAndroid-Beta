package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class nf extends hi.e0 {
    public boolean f30968s;
    public final ChatActivityEnterView v;

    public nf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f12947a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f12950f = true;
        this.f12948b = new Object();
        bi.r1 r1Var = new bi.r1(this, context, 3);
        this.f12949c = r1Var;
        r1Var.setOverScrollMode(2);
        r1Var.setClipToPadding(false);
        r1Var.setClipToOutline(true);
        r1Var.j(new ai.b(this, 12));
        addView(r1Var);
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ii, false));
        eh.d dVar = this.f12952r;
        if (dVar != null) {
            dVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f30968s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f30968s) {
            this.f30968s = true;
            this.v.z1();
        }
    }
}
