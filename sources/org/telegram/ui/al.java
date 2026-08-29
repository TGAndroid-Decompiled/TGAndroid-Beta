package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class al extends UndoView {
    public final tn f36566b0;

    public al(tn tnVar, Activity activity, tn tnVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, tnVar2, true, c6Var);
        this.f36566b0 = tnVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f36566b0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f9;
        int i11;
        yj yjVar = this.f36566b0.T1;
        if (yjVar != null && (((i11 = yjVar.P) == 1 || i11 == 3) && yjVar.O)) {
            f9 = AndroidUtilities.dp(yjVar.getStyleHeight());
        } else {
            f9 = 0.0f;
        }
        setAdditionalTranslationY(f9);
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
