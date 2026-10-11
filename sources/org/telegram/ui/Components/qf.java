package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class qf extends ei.y {
    public boolean f30236s;
    public final ChatActivityEnterView v;

    public qf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f9492a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f9496f = true;
        this.f9493b = new Object();
        ai.w0 w0Var = new ai.w0(this, context, 2);
        this.f9494c = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setClipToPadding(false);
        w0Var.setClipToOutline(true);
        w0Var.j(new ai.r(this, 3));
        addView(w0Var);
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ii, false));
        ch.d dVar = this.f9498r;
        if (dVar != null) {
            dVar.v();
        }
        invalidate();
        setClipChildren(false);
        this.f30236s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f30236s) {
            this.f30236s = true;
            this.v.A1();
        }
    }
}
