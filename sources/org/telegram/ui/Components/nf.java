package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class nf extends gi.x {
    public boolean f28763s;
    public final ChatActivityEnterView v;

    public nf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f11534a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f11537f = true;
        this.f11535b = new Object();
        ai.u1 u1Var = new ai.u1(this, context, 3);
        this.f11536c = u1Var;
        u1Var.setOverScrollMode(2);
        u1Var.setClipToPadding(false);
        u1Var.setClipToOutline(true);
        u1Var.j(new ah.d0(this, 8));
        addView(u1Var);
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ii, false));
        dh.d dVar = this.f11539r;
        if (dVar != null) {
            dVar.v();
        }
        invalidate();
        setClipChildren(false);
        this.f28763s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f28763s) {
            this.f28763s = true;
            this.v.z1();
        }
    }
}
