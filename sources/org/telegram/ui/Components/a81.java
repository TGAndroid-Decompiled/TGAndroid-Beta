package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a81 extends m20 {
    public final fi.c2 J;
    public final b81 K;

    public a81(b81 b81Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.K = b81Var;
        fi.c2 c2Var = this.f30365r;
        this.J = c2Var;
        c2Var.setImeOptions(268435459);
        c2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        c2Var.addTextChangedListener(new bi.u(this, 15));
        c2Var.setOnEditorActionListener(new d1(this, 11));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.D(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
