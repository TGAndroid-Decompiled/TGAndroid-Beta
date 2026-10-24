package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class pl extends org.telegram.ui.Components.u20 {
    public final sn f40593b;

    public pl(sn snVar, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        super(activity, o2Var);
        this.f40593b = snVar;
    }

    @Override
    public final void m() {
        sn snVar = this.f40593b;
        snVar.T7();
        UndoView undoView = snVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        snVar.getMessagesController().removeSuggestion(snVar.f41516f6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        sn snVar = this.f40593b;
        snVar.getMessagesController().convertToGigaGroup(snVar.getParentActivity(), snVar.e, snVar, new a1(this, 19));
    }
}
