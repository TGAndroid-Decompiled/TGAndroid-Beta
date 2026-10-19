package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class ol extends org.telegram.ui.Components.w20 {
    public final qn f39914b;

    public ol(qn qnVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.f39914b = qnVar;
    }

    @Override
    public final void n() {
        qn qnVar = this.f39914b;
        qnVar.T7();
        UndoView undoView = qnVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        qnVar.getMessagesController().removeSuggestion(qnVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void o() {
        qn qnVar = this.f39914b;
        qnVar.getMessagesController().convertToGigaGroup(qnVar.getParentActivity(), qnVar.e, qnVar, new b1(this, 19));
    }
}
