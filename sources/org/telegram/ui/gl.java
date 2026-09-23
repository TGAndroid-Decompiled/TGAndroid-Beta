package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class gl extends UndoView {
    public final xn f33585f0;

    public gl(xn xnVar, Activity activity, xn xnVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, xnVar2, true, d6Var);
        this.f33585f0 = xnVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f33585f0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        ek ekVar = this.f33585f0.X1;
        if (ekVar != null && (((i11 = ekVar.T) == 1 || i11 == 3) && ekVar.S)) {
            f7 = AndroidUtilities.dp(ekVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
