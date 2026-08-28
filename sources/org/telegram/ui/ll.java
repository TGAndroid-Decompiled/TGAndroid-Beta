package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class ll extends org.telegram.ui.Components.y10 {
    public final qn f40188b;

    public ll(qn qnVar, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        super(activity, o2Var);
        this.f40188b = qnVar;
    }

    @Override
    public final void m() {
        qn qnVar = this.f40188b;
        qnVar.Q7();
        UndoView undoView = qnVar.f42093u3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        qnVar.getMessagesController().removeSuggestion(qnVar.P5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        qn qnVar = this.f40188b;
        qnVar.getMessagesController().convertToGigaGroup(qnVar.getParentActivity(), qnVar.f41890e, qnVar, new b1(this, 19));
    }
}
