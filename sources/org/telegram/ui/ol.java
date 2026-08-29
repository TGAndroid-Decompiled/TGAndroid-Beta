package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class ol extends org.telegram.ui.Components.j20 {
    public final tn f41189b;

    public ol(tn tnVar, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        super(activity, o2Var);
        this.f41189b = tnVar;
    }

    @Override
    public final void m() {
        tn tnVar = this.f41189b;
        tnVar.Q7();
        UndoView undoView = tnVar.f42989u3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        tnVar.getMessagesController().removeSuggestion(tnVar.P5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        tn tnVar = this.f41189b;
        tnVar.getMessagesController().convertToGigaGroup(tnVar.getParentActivity(), tnVar.f42787e, tnVar, new c1(this, 19));
    }
}
