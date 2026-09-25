package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zt;
public final class o9 extends ActionMode.Callback2 {
    public final int f20778a = 0;
    public final ActionMode.Callback f20779b;
    public final Object f20780c;

    public o9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f20780c = editTextBoldCursor;
        this.f20779b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f20778a) {
            case 0:
                ((n9) this.f20779b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f20779b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((zt) this.f20779b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f20778a) {
            case 0:
                ((n9) this.f20779b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f20779b.onCreateActionMode(actionMode, menu);
            default:
                return ((zt) this.f20779b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f20778a) {
            case 0:
                ((n9) this.f20779b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f20779b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f20780c).f();
                ((EditTextBoldCursor) this.f20780c).floatingActionMode = null;
                return;
            default:
                ((zt) this.f20779b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f20778a) {
            case 0:
                if (((da) this.f20780c).y()) {
                    ((da) this.f20780c).P();
                    int[] m10 = ((da) this.f20780c).m();
                    da daVar = (da) this.f20780c;
                    int i11 = 1;
                    if (daVar.W != null) {
                        da daVar2 = (da) this.f20780c;
                        int[] C = daVar2.C(daVar2.f20192u);
                        int i12 = C[0];
                        da daVar3 = (da) this.f20780c;
                        i10 = i12 + daVar3.f20156a;
                        int dp = (((-daVar.n()) / 2) + ((C[1] + daVar3.f20158b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((da) this.f20780c).F.getWidth();
                    ((da) this.f20780c).O();
                    da daVar4 = (da) this.f20780c;
                    if (daVar4.W != null) {
                        width = daVar4.C(daVar4.v)[0] + ((da) this.f20780c).f20156a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f20779b;
                if (org.telegram.ui.Components.x1.b(callback)) {
                    org.telegram.ui.u6.c(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f20780c;
                if (org.telegram.ui.Components.x1.b(callback2)) {
                    org.telegram.ui.u6.c(callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f20778a) {
            case 0:
                ((n9) this.f20779b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f20779b.onPrepareActionMode(actionMode, menu);
            default:
                return ((zt) this.f20779b).f30980a.onPrepareActionMode(actionMode, menu);
        }
    }

    public o9(zt ztVar, ActionMode.Callback callback) {
        this.f20779b = ztVar;
        this.f20780c = callback;
    }

    public o9(da daVar, n9 n9Var) {
        this.f20780c = daVar;
        this.f20779b = n9Var;
    }
}
