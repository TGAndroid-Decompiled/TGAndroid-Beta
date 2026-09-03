package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class gl extends UndoView {
    public final xn f37123c0;

    public gl(xn xnVar, Activity activity, xn xnVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, xnVar2, true, g6Var);
        this.f37123c0 = xnVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f37123c0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f10;
        int i11;
        dk dkVar = this.f37123c0.U1;
        if (dkVar != null && (((i11 = dkVar.Q) == 1 || i11 == 3) && dkVar.P)) {
            f10 = AndroidUtilities.dp(dkVar.getStyleHeight());
        } else {
            f10 = 0.0f;
        }
        setAdditionalTranslationY(f10);
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
