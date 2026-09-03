package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p61 extends d20 {
    public final kg.f G;
    public final q61 H;

    public p61(q61 q61Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = q61Var;
        kg.f fVar = this.f24117r;
        this.G = fVar;
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        fVar.addTextChangedListener(new dh.c(this, 14));
        fVar.setOnEditorActionListener(new d1(this, 10));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.H.D(motionEvent, this.G);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
