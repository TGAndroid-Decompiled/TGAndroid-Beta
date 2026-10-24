package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class cl extends UndoView {
    public final sn f36367j0;

    public cl(sn snVar, Activity activity, sn snVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, snVar2, true, g6Var);
        this.f36367j0 = snVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f36367j0.X7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        ak akVar = this.f36367j0.f41559j2;
        if (akVar != null && (((i11 = akVar.U) == 1 || i11 == 3) && akVar.T)) {
            f7 = AndroidUtilities.dp(akVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
