package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class il extends UndoView {
    public final zn f34996c0;

    public il(zn znVar, Activity activity, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, znVar2, true, f6Var);
        this.f34996c0 = znVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f34996c0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f10;
        int i11;
        fk fkVar = this.f34996c0.U1;
        if (fkVar != null && (((i11 = fkVar.Q) == 1 || i11 == 3) && fkVar.P)) {
            f10 = AndroidUtilities.dp(fkVar.getStyleHeight());
        } else {
            f10 = 0.0f;
        }
        setAdditionalTranslationY(f10);
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
