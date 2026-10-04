package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class fl extends UndoView {
    public final yn f36341f0;

    public fl(yn ynVar, Activity activity, yn ynVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, ynVar2, true, d6Var);
        this.f36341f0 = ynVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f36341f0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        ek ekVar = this.f36341f0.V1;
        if (ekVar != null && (((i11 = ekVar.T) == 1 || i11 == 3) && ekVar.S)) {
            f7 = AndroidUtilities.dp(ekVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
