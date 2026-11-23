package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class p51 extends c10 {
    public final ah.i K;
    public final q51 L;

    public p51(q51 q51Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.L = q51Var;
        ah.i iVar = this.f33883r;
        this.K = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.gd.N0(2131743089, null));
        iVar.addTextChangedListener(new ah.j(this, 29));
        iVar.setOnEditorActionListener(new g(this, 12));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.K0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
