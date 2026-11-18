package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class ef extends ki.v {
    public boolean f34688s;
    public final ChatActivityEnterView f34689w;

    public ef(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f34689w = chatActivityEnterView;
        this.f18978a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f18982f = true;
        this.f18979b = new Object();
        di.b1 b1Var = new di.b1(5, context, this);
        this.f18980c = b1Var;
        b1Var.setOverScrollMode(2);
        b1Var.setClipToPadding(false);
        b1Var.setClipToOutline(true);
        b1Var.j(new bi.q1(this, 21));
        addView(b1Var);
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.zj, false));
        fh.g gVar = this.f18984r;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f34688s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (!this.f34688s) {
            this.f34688s = true;
            this.f34689w.f2();
        }
    }
}
