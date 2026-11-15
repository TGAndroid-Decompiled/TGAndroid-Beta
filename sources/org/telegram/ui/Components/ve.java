package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class ve extends ki.w {
    public boolean f40385s;
    public final ChatActivityEnterView f40386w;

    public ve(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f40386w = chatActivityEnterView;
        this.f18607a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f18611f = true;
        this.f18608b = new Object();
        di.c1 c1Var = new di.c1(5, context, this);
        this.f18609c = c1Var;
        c1Var.setOverScrollMode(2);
        c1Var.setClipToPadding(false);
        c1Var.setClipToOutline(true);
        c1Var.j(new bi.z4(this, 20));
        addView(c1Var);
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.zj, false));
        fh.g gVar = this.f18613r;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.f40385s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (!this.f40385s) {
            this.f40385s = true;
            this.f40386w.W1();
        }
    }
}
