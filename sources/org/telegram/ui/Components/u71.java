package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u71 extends t20 {
    public final ci.g2 J;
    public final v71 K;

    public u71(v71 v71Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = v71Var;
        ci.g2 g2Var = this.f30964r;
        this.J = g2Var;
        g2Var.setImeOptions(268435459);
        g2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        g2Var.addTextChangedListener(new ci.h2(this, 14));
        g2Var.setOnEditorActionListener(new e1(this, 11));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.F(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
