package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class bm extends org.telegram.ui.Components.h30 {
    public final eo f36204b;

    public bm(eo eoVar, Activity activity, org.telegram.ui.ActionBar.m2 m2Var) {
        super(activity, m2Var);
        this.f36204b = eoVar;
    }

    @Override
    public final void o() {
        eo eoVar = this.f36204b;
        eoVar.T7();
        UndoView undoView = eoVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        eoVar.getMessagesController().removeSuggestion(eoVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void p() {
        eo eoVar = this.f36204b;
        eoVar.getMessagesController().convertToGigaGroup(eoVar.getParentActivity(), eoVar.f37241e, eoVar, new z0(this, 19));
    }
}
