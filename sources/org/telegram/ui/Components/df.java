package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class df extends rh.v {
    public boolean f24263s;
    public final ChatActivityEnterView v;

    public df(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f43871a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f43874f = true;
        this.f43872b = new Object();
        org.telegram.ui.d81 d81Var = new org.telegram.ui.d81(this, context, 2);
        this.f43873c = d81Var;
        d81Var.setOverScrollMode(2);
        d81Var.setClipToPadding(false);
        d81Var.setClipToOutline(true);
        d81Var.j(new mb0(this, 14));
        addView(d81Var);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false));
        pg.b bVar = this.f43876r;
        if (bVar != null) {
            bVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.f24263s = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (!this.f24263s) {
            this.f24263s = true;
            this.v.C1();
        }
    }
}
