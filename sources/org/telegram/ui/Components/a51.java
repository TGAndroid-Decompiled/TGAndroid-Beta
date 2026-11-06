package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class a51 extends r00 {
    public final ah.i J;
    public final b51 K;

    public a51(b51 b51Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = b51Var;
        ah.i iVar = this.f37441r;
        this.J = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.hd.M0(2131743340, null));
        iVar.addTextChangedListener(new ah.j(this, 26));
        iVar.setOnEditorActionListener(new t0(this, 11));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.J0(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
