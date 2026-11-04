package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class te extends ii.w {
    public boolean f38397s;
    public final ChatActivityEnterView f38398w;

    public te(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f38398w = chatActivityEnterView;
        this.f15277a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f15281f = true;
        this.f15278b = new Object();
        ci.j1 j1Var = new ci.j1(4, context, this);
        this.f15279c = j1Var;
        j1Var.setOverScrollMode(2);
        j1Var.setClipToPadding(false);
        j1Var.setClipToOutline(true);
        j1Var.j(new ai.j5(this, 17));
        addView(j1Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wj, false));
        gh.g gVar = this.f15283r;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f38397s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (!this.f38397s) {
            this.f38397s = true;
            this.f38398w.D1();
        }
    }
}
