package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r61 extends d20 {
    public final lg.f G;
    public final s61 H;

    public r61(s61 s61Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.H = s61Var;
        lg.f fVar = this.f26172r;
        this.G = fVar;
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        fVar.addTextChangedListener(new eh.c(this, 14));
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
