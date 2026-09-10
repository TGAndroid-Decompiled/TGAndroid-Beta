package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a71 extends k20 {
    public final bi.t2 J;
    public final b71 K;

    public a71(b71 b71Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = b71Var;
        bi.t2 t2Var = this.f24572r;
        this.J = t2Var;
        t2Var.setImeOptions(268435459);
        t2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        t2Var.addTextChangedListener(new bi.u2(this, 14));
        t2Var.setOnEditorActionListener(new g1(this, 10));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.D(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
