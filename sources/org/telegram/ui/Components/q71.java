package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q71 extends i20 {
    public final ei.e2 J;
    public final r71 K;

    public q71(r71 r71Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.K = r71Var;
        ei.e2 e2Var = this.f27258r;
        this.J = e2Var;
        e2Var.setImeOptions(268435459);
        e2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        e2Var.addTextChangedListener(new ai.u(this, 15));
        e2Var.setOnEditorActionListener(new c1(this, 11));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.D(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
