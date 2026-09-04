package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class of extends fi.y {
    public boolean f29042s;
    public final ChatActivityEnterView v;

    public of(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f10098a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f10102f = true;
        this.f10099b = new Object();
        bi.o0 o0Var = new bi.o0(this, context, 2);
        this.f10100c = o0Var;
        o0Var.setOverScrollMode(2);
        o0Var.setClipToPadding(false);
        o0Var.setClipToOutline(true);
        o0Var.j(new ah.e0(this, 5));
        addView(o0Var);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false));
        dh.d dVar = this.f10104r;
        if (dVar != null) {
            dVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.f29042s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f29042s) {
            this.f29042s = true;
            this.v.C1();
        }
    }
}
