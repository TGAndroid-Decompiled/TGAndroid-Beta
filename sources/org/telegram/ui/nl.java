package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;

public final class nl extends org.telegram.ui.Components.b20 {

    public final rn f40883b;

    public nl(rn rnVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.f40883b = rnVar;
    }

    @Override
    public final void m() {
        rn rnVar = this.f40883b;
        rnVar.Q7();
        UndoView undoView = rnVar.f42229u3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        rnVar.getMessagesController().removeSuggestion(rnVar.P5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        rn rnVar = this.f40883b;
        rnVar.getMessagesController().convertToGigaGroup(rnVar.getParentActivity(), rnVar.f42026e, rnVar, new c1(this, 19));
    }
}
