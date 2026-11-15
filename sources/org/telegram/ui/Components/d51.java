package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class d51 extends v00 {
    public final ah.i K;
    public final e51 L;

    public d51(e51 e51Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.L = e51Var;
        ah.i iVar = this.f40202r;
        this.K = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.hd.M0(2131743339, null));
        iVar.addTextChangedListener(new ah.j(this, 28));
        iVar.setOnEditorActionListener(new q0(this, 11));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.J0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
