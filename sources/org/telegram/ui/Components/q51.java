package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class q51 extends e10 {
    public final ah.i K;
    public final r51 L;

    public q51(r51 r51Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.L = r51Var;
        ah.i iVar = this.f34642r;
        this.K = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.hd.N0(2131743094, null));
        iVar.addTextChangedListener(new ah.j(this, 29));
        iVar.setOnEditorActionListener(new h(this, 12));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.K0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
