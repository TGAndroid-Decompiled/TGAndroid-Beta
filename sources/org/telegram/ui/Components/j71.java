package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j71 extends k20 {
    public final ei.e2 J;
    public final k71 K;

    public j71(k71 k71Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = k71Var;
        ei.e2 e2Var = this.f27686r;
        this.J = e2Var;
        e2Var.setImeOptions(268435459);
        e2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        e2Var.addTextChangedListener(new ai.u(this, 15));
        e2Var.setOnEditorActionListener(new e1(this, 11));
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
