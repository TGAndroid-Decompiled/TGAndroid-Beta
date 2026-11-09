package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class b51 extends s00 {
    public final ah.i J;
    public final c51 K;

    public b51(c51 c51Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.K = c51Var;
        ah.i iVar = this.f37857r;
        this.J = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.id.M0(2131743339, null));
        iVar.addTextChangedListener(new ah.j(this, 26));
        iVar.setOnEditorActionListener(new t0(this, 11));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.J0(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
