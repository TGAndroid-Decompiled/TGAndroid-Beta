package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class pl extends org.telegram.ui.Components.w20 {
    public final sn f40502b;

    public pl(sn snVar, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        super(activity, o2Var);
        this.f40502b = snVar;
    }

    @Override
    public final void m() {
        sn snVar = this.f40502b;
        snVar.T7();
        UndoView undoView = snVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        snVar.getMessagesController().removeSuggestion(snVar.f41519f6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        sn snVar = this.f40502b;
        snVar.getMessagesController().convertToGigaGroup(snVar.getParentActivity(), snVar.e, snVar, new a1(this, 19));
    }
}
