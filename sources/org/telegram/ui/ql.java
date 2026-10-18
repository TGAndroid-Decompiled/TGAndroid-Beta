package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class ql extends org.telegram.ui.Components.w20 {
    public final sn f40431b;

    public ql(sn snVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.f40431b = snVar;
    }

    @Override
    public final void n() {
        sn snVar = this.f40431b;
        snVar.T7();
        UndoView undoView = snVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        snVar.getMessagesController().removeSuggestion(snVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void o() {
        sn snVar = this.f40431b;
        snVar.getMessagesController().convertToGigaGroup(snVar.getParentActivity(), snVar.e, snVar, new b1(this, 19));
    }
}
