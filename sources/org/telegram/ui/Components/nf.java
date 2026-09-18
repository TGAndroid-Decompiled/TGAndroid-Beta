package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class nf extends ei.y {
    public boolean f26677s;
    public final ChatActivityEnterView v;

    public nf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f8737a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f8740f = true;
        this.f8738b = new Object();
        ai.w0 w0Var = new ai.w0(this, context, 2);
        this.f8739c = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setClipToPadding(false);
        w0Var.setClipToOutline(true);
        w0Var.j(new ai.r(this, 4));
        addView(w0Var);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false));
        ch.d dVar = this.f8742r;
        if (dVar != null) {
            dVar.v();
        }
        invalidate();
        setClipChildren(false);
        this.f26677s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f26677s) {
            this.f26677s = true;
            this.v.B1();
        }
    }
}
