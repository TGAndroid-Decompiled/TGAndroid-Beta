package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class t51 extends p10 {
    public final gg.g F;
    public final u51 G;

    public t51(u51 u51Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = u51Var;
        gg.g gVar = this.f31468r;
        this.F = gVar;
        gVar.setImeOptions(268435459);
        gVar.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        gVar.addTextChangedListener(new ch.e(this, 15));
        gVar.setOnEditorActionListener(new c1(this, 10));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.G.E(motionEvent, this.F);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
