package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class pf extends ei.z {
    public boolean f29732s;
    public final ChatActivityEnterView v;

    public pf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f9495a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f9499f = true;
        this.f9496b = new Object();
        ai.w0 w0Var = new ai.w0(this, context, 2);
        this.f9497c = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setClipToPadding(false);
        w0Var.setClipToOutline(true);
        w0Var.j(new ai.r(this, 4));
        addView(w0Var);
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ii, false));
        ch.d dVar = this.f9501r;
        if (dVar != null) {
            dVar.k();
        }
        invalidate();
        setClipChildren(false);
        this.f29732s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f29732s) {
            this.f29732s = true;
            this.v.B1();
        }
    }
}
