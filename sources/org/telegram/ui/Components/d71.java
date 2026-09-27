package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d71 extends e20 {
    public final ci.h2 J;
    public final e71 K;

    public d71(e71 e71Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = e71Var;
        ci.h2 h2Var = this.f23850r;
        this.J = h2Var;
        h2Var.setImeOptions(268435459);
        h2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        h2Var.addTextChangedListener(new ci.i2(this, 14));
        h2Var.setOnEditorActionListener(new e1(this, 10));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.E(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
