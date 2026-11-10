package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class ue extends hi.u {
    public boolean f38631s;
    public final ChatActivityEnterView f38632w;

    public ue(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f38632w = chatActivityEnterView;
        this.f14967a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f14971f = true;
        this.f14968b = new Object();
        bi.q1 q1Var = new bi.q1(4, context, this);
        this.f14969c = q1Var;
        q1Var.setOverScrollMode(2);
        q1Var.setClipToPadding(false);
        q1Var.setClipToOutline(true);
        q1Var.j(new ai.b(this, 14));
        addView(q1Var);
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.wj, false));
        fh.g gVar = this.f14973r;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f38631s = false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (!this.f38631s) {
            this.f38631s = true;
            this.f38632w.E1();
        }
    }
}
