package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class bl extends UndoView {
    public final qn f35669f0;

    public bl(qn qnVar, Activity activity, qn qnVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, qnVar2, true, d6Var);
        this.f35669f0 = qnVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f35669f0.X7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        zj zjVar = this.f35669f0.X1;
        if (zjVar != null && (((i11 = zjVar.U) == 1 || i11 == 3) && zjVar.T)) {
            f7 = AndroidUtilities.dp(zjVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
