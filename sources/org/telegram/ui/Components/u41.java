package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class u41 extends n00 {
    public final bh.g K;
    public final v41 L;

    public u41(v41 v41Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.L = v41Var;
        bh.g gVar = this.f36302r;
        this.K = gVar;
        gVar.setImeOptions(268435459);
        gVar.setHint(org.telegram.messenger.bd.M0(2131743349, null));
        gVar.addTextChangedListener(new bh.h(this, 26));
        gVar.setOnEditorActionListener(new s0(this, 11));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.J0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
