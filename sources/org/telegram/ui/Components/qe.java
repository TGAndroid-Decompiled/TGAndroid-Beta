package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class qe extends xh.s {
    public boolean f29638s;
    public final ChatActivityEnterView f29639w;

    public qe(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f29639w = chatActivityEnterView;
        this.f54010a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f54013f = true;
        this.f54011b = new Object();
        org.telegram.ui.nb0 nb0Var = new org.telegram.ui.nb0(this, context, 7);
        this.f54012c = nb0Var;
        nb0Var.setOverScrollMode(2);
        nb0Var.setClipToPadding(false);
        nb0Var.setClipToOutline(true);
        nb0Var.j(new bu0(this, 28));
        addView(nb0Var);
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.wj, false));
        vg.f fVar = this.f54015r;
        if (fVar != null) {
            fVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f29638s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f29638s) {
            this.f29638s = true;
            this.f29639w.B1();
        }
    }
}
