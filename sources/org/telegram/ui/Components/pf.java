package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class pf extends fi.x {
    public boolean f28305s;
    public final ChatActivityEnterView v;

    public pf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f9650a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f9653f = true;
        this.f9651b = new Object();
        bi.o0 o0Var = new bi.o0(this, context, 2);
        this.f9652c = o0Var;
        o0Var.setOverScrollMode(2);
        o0Var.setClipToPadding(false);
        o0Var.setClipToOutline(true);
        o0Var.j(new ah.d0(this, 4));
        addView(o0Var);
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ii, false));
        dh.d dVar = this.f9655r;
        if (dVar != null) {
            dVar.v();
        }
        invalidate();
        setClipChildren(false);
        this.f28305s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f28305s) {
            this.f28305s = true;
            this.v.A1();
        }
    }
}
