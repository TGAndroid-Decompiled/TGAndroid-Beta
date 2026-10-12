package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class ol extends UndoView {
    public final eo f40741f0;

    public ol(eo eoVar, Activity activity, eo eoVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, eoVar2, true, c6Var);
        this.f40741f0 = eoVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f40741f0.X7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        mk mkVar = this.f40741f0.X1;
        if (mkVar != null && (((i11 = mkVar.U) == 1 || i11 == 3) && mkVar.T)) {
            f7 = AndroidUtilities.dp(mkVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
