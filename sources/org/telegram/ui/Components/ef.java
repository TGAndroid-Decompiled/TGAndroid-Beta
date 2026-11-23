package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class ef extends ki.u {
    public boolean f34779s;
    public final ChatActivityEnterView f34780w;

    public ef(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f34780w = chatActivityEnterView;
        this.f18991a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f18995f = true;
        this.f18992b = new Object();
        di.b1 b1Var = new di.b1(5, context, this);
        this.f18993c = b1Var;
        b1Var.setOverScrollMode(2);
        b1Var.setClipToPadding(false);
        b1Var.setClipToOutline(true);
        b1Var.j(new bi.u1(this, 21));
        addView(b1Var);
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zj, false));
        fh.g gVar = this.f18997r;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f34779s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (!this.f34779s) {
            this.f34779s = true;
            this.f34780w.j2();
        }
    }
}
