package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class ff extends ki.u {
    public boolean f35115s;
    public final ChatActivityEnterView f35116w;

    public ff(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f35116w = chatActivityEnterView;
        this.f19059a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f19063f = true;
        this.f19060b = new Object();
        di.b1 b1Var = new di.b1(5, context, this);
        this.f19061c = b1Var;
        b1Var.setOverScrollMode(2);
        b1Var.setClipToPadding(false);
        b1Var.setClipToOutline(true);
        b1Var.j(new bi.v1(this, 21));
        addView(b1Var);
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.zj, false));
        fh.g gVar = this.f19065r;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f35115s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (!this.f35115s) {
            this.f35115s = true;
            this.f35116w.l2();
        }
    }
}
