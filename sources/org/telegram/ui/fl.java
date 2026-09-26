package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class fl extends UndoView {
    public final wn f33694f0;

    public fl(wn wnVar, Activity activity, wn wnVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, wnVar2, true, d6Var);
        this.f33694f0 = wnVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f33694f0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        ek ekVar = this.f33694f0.X1;
        if (ekVar != null && (((i11 = ekVar.T) == 1 || i11 == 3) && ekVar.S)) {
            f7 = AndroidUtilities.dp(ekVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
