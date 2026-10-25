package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class dl extends UndoView {
    public final un f38902j0;

    public dl(un unVar, Activity activity, un unVar2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, unVar2, true, u6Var);
        this.f38902j0 = unVar;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        this.f38902j0.b8(characterStyle, false, null, null);
    }

    @Override
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        bk bkVar = this.f38902j0.f44293j2;
        if (bkVar != null && (((i11 = bkVar.U) == 1 || i11 == 3) && bkVar.T)) {
            f7 = AndroidUtilities.dp(bkVar.getStyleHeight());
        } else {
            f7 = 0.0f;
        }
        setAdditionalTranslationY(f7);
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
