package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class gf extends ph.v {
    public boolean f28877s;
    public final ChatActivityEnterView v;

    public gf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f46110a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f46114f = true;
        this.f46111b = new Object();
        org.telegram.ui.i71 i71Var = new org.telegram.ui.i71(this, context, 1);
        this.f46112c = i71Var;
        i71Var.setOverScrollMode(2);
        i71Var.setClipToPadding(false);
        i71Var.setClipToOutline(true);
        i71Var.j(new h00(this, 14));
        addView(i71Var);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ii, false));
        ng.d dVar = this.f46116r;
        if (dVar != null) {
            dVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.f28877s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f28877s) {
            this.f28877s = true;
            this.v.C1();
        }
    }
}
