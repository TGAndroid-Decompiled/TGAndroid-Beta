package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class ve extends hi.u {
    public boolean f38950s;
    public final ChatActivityEnterView f38951w;

    public ve(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f38951w = chatActivityEnterView;
        this.f14962a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f14966f = true;
        this.f14963b = new Object();
        bi.q1 q1Var = new bi.q1(4, context, this);
        this.f14964c = q1Var;
        q1Var.setOverScrollMode(2);
        q1Var.setClipToPadding(false);
        q1Var.setClipToOutline(true);
        q1Var.j(new ai.b(this, 14));
        addView(q1Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wj, false));
        fh.g gVar = this.f14968r;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f38950s = false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (!this.f38950s) {
            this.f38950s = true;
            this.f38951w.E1();
        }
    }
}
