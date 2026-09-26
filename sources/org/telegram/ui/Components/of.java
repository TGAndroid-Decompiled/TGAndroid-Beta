package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class of extends ei.y {
    public boolean f27040s;
    public final ChatActivityEnterView v;

    public of(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f8720a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f8723f = true;
        this.f8721b = new Object();
        ai.w0 w0Var = new ai.w0(this, context, 2);
        this.f8722c = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setClipToPadding(false);
        w0Var.setClipToOutline(true);
        w0Var.j(new ai.r(this, 3));
        addView(w0Var);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ii, false));
        ch.d dVar = this.f8725r;
        if (dVar != null) {
            dVar.v();
        }
        invalidate();
        setClipChildren(false);
        this.f27040s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f27040s) {
            this.f27040s = true;
            this.v.C1();
        }
    }
}
