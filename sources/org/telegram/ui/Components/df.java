package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class df extends sh.v {
    public boolean f26263s;
    public final ChatActivityEnterView v;

    public df(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f47735a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f47739f = true;
        this.f47736b = new Object();
        qh.e1 e1Var = new qh.e1(this, context, 1);
        this.f47737c = e1Var;
        e1Var.setOverScrollMode(2);
        e1Var.setClipToPadding(false);
        e1Var.setClipToOutline(true);
        e1Var.j(new nb0(this, 14));
        addView(e1Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ii, false));
        qg.b bVar = this.f47741r;
        if (bVar != null) {
            bVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.f26263s = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (!this.f26263s) {
            this.f26263s = true;
            this.v.C1();
        }
    }
}
