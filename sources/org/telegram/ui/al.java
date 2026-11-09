package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class al extends org.telegram.ui.Components.e10 {
    public final cn f43717j1;

    public al(cn cnVar, Activity activity, org.telegram.ui.ActionBar.f2 f2Var) {
        super(activity, f2Var);
        this.f43717j1 = cnVar;
    }

    @Override
    public final void I0() {
        cn cnVar = this.f43717j1;
        cnVar.g8();
        UndoView undoView = cnVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        cnVar.getMessagesController().k4(cnVar.f44504j6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void J0() {
        cn cnVar = this.f43717j1;
        cnVar.getMessagesController().S(cnVar.getParentActivity(), cnVar.f44432e, cnVar, new w0(this, 21));
    }
}
