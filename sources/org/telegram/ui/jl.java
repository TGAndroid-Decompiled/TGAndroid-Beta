package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class jl extends UndoView {
    public final co f37800f0;

    public jl(co coVar, Activity activity, co coVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, coVar2, true, f6Var);
        this.f37800f0 = coVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f37800f0.U7(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        hk hkVar = this.f37800f0.X1;
        if (hkVar != null && (((i11 = hkVar.T) == 1 || i11 == 3) && hkVar.S)) {
            f7 = AndroidUtilities.dp(hkVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
