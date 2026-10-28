package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class fl extends UndoView {
    public final wn f39396j0;

    public fl(wn wnVar, Activity activity, wn wnVar2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, wnVar2, true, u6Var);
        this.f39396j0 = wnVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f39396j0.d8(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        dk dkVar = this.f39396j0.f45164j2;
        if (dkVar != null && (((i11 = dkVar.U) == 1 || i11 == 3) && dkVar.T)) {
            f7 = AndroidUtilities.dp(dkVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
