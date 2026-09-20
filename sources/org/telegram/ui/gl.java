package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class gl extends UndoView {
    public final zn f33929f0;

    public gl(zn znVar, Activity activity, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, znVar2, true, f6Var);
        this.f33929f0 = znVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f33929f0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        gk gkVar = this.f33929f0.X1;
        if (gkVar != null && (((i11 = gkVar.T) == 1 || i11 == 3) && gkVar.S)) {
            f7 = AndroidUtilities.dp(gkVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
