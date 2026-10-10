package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t71 extends t20 {
    public final ci.g2 J;
    public final u71 K;

    public t71(u71 u71Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = u71Var;
        ci.g2 g2Var = this.f30958r;
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
