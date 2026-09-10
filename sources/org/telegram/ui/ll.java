package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class ll extends UndoView {
    public final eo f34736f0;

    public ll(eo eoVar, Activity activity, eo eoVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, eoVar2, true, f6Var);
        this.f34736f0 = eoVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f34736f0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        jk jkVar = this.f34736f0.X1;
        if (jkVar != null && (((i11 = jkVar.T) == 1 || i11 == 3) && jkVar.S)) {
            f7 = AndroidUtilities.dp(jkVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
