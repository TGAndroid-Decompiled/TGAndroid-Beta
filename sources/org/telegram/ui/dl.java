package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class dl extends UndoView {
    public final sn f36216f0;

    public dl(sn snVar, Activity activity, sn snVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, snVar2, true, d6Var);
        this.f36216f0 = snVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f36216f0.X7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        bk bkVar = this.f36216f0.X1;
        if (bkVar != null && (((i11 = bkVar.U) == 1 || i11 == 3) && bkVar.T)) {
            f7 = AndroidUtilities.dp(bkVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
