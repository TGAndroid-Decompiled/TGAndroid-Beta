package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class bm extends org.telegram.ui.Components.a30 {
    public final fo f34596b;

    public bm(fo foVar, Activity activity, org.telegram.ui.ActionBar.m2 m2Var) {
        super(activity, m2Var);
        this.f34596b = foVar;
    }

    @Override
    public final void n() {
        fo foVar = this.f34596b;
        foVar.T7();
        UndoView undoView = foVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        foVar.getMessagesController().removeSuggestion(foVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void o() {
        fo foVar = this.f34596b;
        foVar.getMessagesController().convertToGigaGroup(foVar.getParentActivity(), foVar.e, foVar, new b1(this, 19));
    }
}
