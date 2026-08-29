package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e61 extends x10 {
    public final ig.f F;
    public final f61 G;

    public e61(f61 f61Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = f61Var;
        ig.f fVar = this.f34546r;
        this.F = fVar;
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        fVar.addTextChangedListener(new bh.c(this, 15));
        fVar.setOnEditorActionListener(new f1(this, 10));
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
