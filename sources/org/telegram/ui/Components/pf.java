package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class pf extends di.b0 {
    public boolean f26112s;
    public final ChatActivityEnterView v;

    public pf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f6530a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f6533f = true;
        this.f6531b = new Object();
        bi.y1 y1Var = new bi.y1(this, context, 1);
        this.f6532c = y1Var;
        y1Var.setOverScrollMode(2);
        y1Var.setClipToPadding(false);
        y1Var.setClipToOutline(true);
        y1Var.j(new bi.a2(this, 2));
        addView(y1Var);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false));
        bh.d dVar = this.f6535r;
        if (dVar != null) {
            dVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.f26112s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f26112s) {
            this.f26112s = true;
            this.v.C1();
        }
    }
}
