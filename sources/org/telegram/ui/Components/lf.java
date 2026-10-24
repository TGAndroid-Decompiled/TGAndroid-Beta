package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class lf extends gi.x {
    public boolean f28324s;
    public final ChatActivityEnterView v;

    public lf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f11559a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f11562f = true;
        this.f11560b = new Object();
        ai.u1 u1Var = new ai.u1(this, context, 3);
        this.f11561c = u1Var;
        u1Var.setOverScrollMode(2);
        u1Var.setClipToPadding(false);
        u1Var.setClipToOutline(true);
        u1Var.j(new ah.d0(this, 8));
        addView(u1Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ii, false));
        dh.d dVar = this.f11564r;
        if (dVar != null) {
            dVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f28324s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f28324s) {
            this.f28324s = true;
            this.v.z1();
        }
    }
}
