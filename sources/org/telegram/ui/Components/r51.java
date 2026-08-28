package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r51 extends m10 {
    public final fg.g F;
    public final s51 G;

    public r51(s51 s51Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.G = s51Var;
        fg.g gVar = this.f30664r;
        this.F = gVar;
        gVar.setImeOptions(268435459);
        gVar.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        gVar.addTextChangedListener(new bh.f(this, 15));
        gVar.setOnEditorActionListener(new c1(this, 10));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.G.D(motionEvent, this.F);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
