package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class kl extends UndoView {
    public final zn f39358f0;

    public kl(zn znVar, Activity activity, zn znVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, znVar2, true, e6Var);
        this.f39358f0 = znVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f39358f0.X7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        ik ikVar = this.f39358f0.X1;
        if (ikVar != null && (((i11 = ikVar.U) == 1 || i11 == 3) && ikVar.T)) {
            f7 = AndroidUtilities.dp(ikVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
