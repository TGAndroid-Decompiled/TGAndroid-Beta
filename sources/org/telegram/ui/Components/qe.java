package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class qe extends xh.s {
    public boolean f29719s;
    public final ChatActivityEnterView f29720w;

    public qe(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f29720w = chatActivityEnterView;
        this.f54028a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f54031f = true;
        this.f54029b = new Object();
        org.telegram.ui.mb0 mb0Var = new org.telegram.ui.mb0(this, context, 7);
        this.f54030c = mb0Var;
        mb0Var.setOverScrollMode(2);
        mb0Var.setClipToPadding(false);
        mb0Var.setClipToOutline(true);
        mb0Var.j(new cu0(this, 28));
        addView(mb0Var);
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.wj, false));
        vg.f fVar = this.f54033r;
        if (fVar != null) {
            fVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f29719s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f29719s) {
            this.f29719s = true;
            this.f29720w.B1();
        }
    }
}
