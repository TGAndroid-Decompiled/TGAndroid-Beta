package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;

public final class ze extends nh.w {

    public boolean f35229s;
    public final ChatActivityEnterView v;

    public ze(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.f19008a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f19012f = true;
        this.f19009b = new d5.p();
        hh.f1 f1Var = new hh.f1(this, context, 3);
        this.f19010c = f1Var;
        f1Var.setOverScrollMode(2);
        f1Var.setClipToPadding(false);
        f1Var.setClipToOutline(true);
        f1Var.j(new ag.z2(this, 15));
        addView(f1Var);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ii, false));
        lg.d dVar = this.f19014r;
        if (dVar != null) {
            dVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.f35229s = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f35229s) {
            return;
        }
        this.f35229s = true;
        this.v.B1();
    }
}
