package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class df extends sh.v {
    public boolean f26266s;
    public final ChatActivityEnterView v;

    public df(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f47771a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f47775f = true;
        this.f47772b = new Object();
        org.telegram.ui.c81 c81Var = new org.telegram.ui.c81(this, context, 2);
        this.f47773c = c81Var;
        c81Var.setOverScrollMode(2);
        c81Var.setClipToPadding(false);
        c81Var.setClipToOutline(true);
        c81Var.j(new nb0(this, 14));
        addView(c81Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ii, false));
        qg.b bVar = this.f47777r;
        if (bVar != null) {
            bVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.f26266s = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (!this.f26266s) {
            this.f26266s = true;
            this.v.C1();
        }
    }
}
