package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class df extends rh.w {
    public boolean f24264s;
    public final ChatActivityEnterView v;

    public df(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f43819a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f43822f = true;
        this.f43820b = new Object();
        ph.e1 e1Var = new ph.e1(this, context, 1);
        this.f43821c = e1Var;
        e1Var.setOverScrollMode(2);
        e1Var.setClipToPadding(false);
        e1Var.setClipToOutline(true);
        e1Var.j(new lb0(this, 14));
        addView(e1Var);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false));
        pg.b bVar = this.f43824r;
        if (bVar != null) {
            bVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.f24264s = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (!this.f24264s) {
            this.f24264s = true;
            this.v.C1();
        }
    }
}
