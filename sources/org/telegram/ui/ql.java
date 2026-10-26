package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class ql extends org.telegram.ui.Components.y20 {
    public final un f42865b;

    public ql(un unVar, Activity activity, org.telegram.ui.ActionBar.r2 r2Var) {
        super(activity, r2Var);
        this.f42865b = unVar;
    }

    @Override
    public final void m() {
        un unVar = this.f42865b;
        unVar.X7();
        UndoView undoView = unVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        unVar.getMessagesController().removeSuggestion(unVar.f44252f6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        un unVar = this.f42865b;
        unVar.getMessagesController().convertToGigaGroup(unVar.getParentActivity(), unVar.e, unVar, new y0(this, 21));
    }
}
