package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
public final class lf extends ei.y {
    public boolean f25914s;
    public final ChatActivityEnterView v;

    public lf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f8735a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f8738f = true;
        this.f8736b = new Object();
        ai.w0 w0Var = new ai.w0(this, context, 2);
        this.f8737c = w0Var;
        w0Var.setOverScrollMode(2);
        w0Var.setClipToPadding(false);
        w0Var.setClipToOutline(true);
        w0Var.j(new ai.r(this, 4));
        addView(w0Var);
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ii, false));
        ch.d dVar = this.f8740r;
        if (dVar != null) {
            dVar.v();
        }
        invalidate();
        setClipChildren(false);
        this.f25914s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f25914s) {
            this.f25914s = true;
            this.v.D1();
        }
    }
}
