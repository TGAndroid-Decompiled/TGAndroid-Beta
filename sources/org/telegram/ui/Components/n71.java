package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n71 extends f20 {
    public final ci.h2 J;
    public final o71 K;

    public n71(o71 o71Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = o71Var;
        ci.h2 h2Var = this.f26295r;
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
        this.K.C(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
