package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class n51 extends c10 {
    public final ah.i K;
    public final o51 L;

    public n51(o51 o51Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.L = o51Var;
        ah.i iVar = this.f33845r;
        this.K = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.gd.M0(2131743102, null));
        iVar.addTextChangedListener(new ah.j(this, 29));
        iVar.setOnEditorActionListener(new g(this, 12));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.K0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
