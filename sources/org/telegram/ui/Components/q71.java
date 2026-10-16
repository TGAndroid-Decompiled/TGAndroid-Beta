package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q71 extends o20 {
    public final di.g2 J;
    public final r71 K;

    public q71(r71 r71Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.K = r71Var;
        di.g2 g2Var = this.f27510r;
        this.J = g2Var;
        g2Var.setImeOptions(268435459);
        g2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        g2Var.addTextChangedListener(new di.h2(this, 14));
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
