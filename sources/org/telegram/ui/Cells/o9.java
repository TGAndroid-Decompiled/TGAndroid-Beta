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
    public final int f20777a = 0;
    public final ActionMode.Callback f20778b;
    public final Object f20779c;

    public o9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f20779c = editTextBoldCursor;
        this.f20778b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f20777a) {
            case 0:
                ((n9) this.f20778b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f20778b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((zt) this.f20778b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f20777a) {
            case 0:
                ((n9) this.f20778b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f20778b.onCreateActionMode(actionMode, menu);
            default:
                return ((zt) this.f20778b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f20777a) {
            case 0:
                ((n9) this.f20778b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f20778b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f20779c).f();
                ((EditTextBoldCursor) this.f20779c).floatingActionMode = null;
                return;
            default:
                ((zt) this.f20778b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f20777a) {
            case 0:
                if (((da) this.f20779c).y()) {
                    ((da) this.f20779c).P();
                    int[] m10 = ((da) this.f20779c).m();
                    da daVar = (da) this.f20779c;
                    int i11 = 1;
                    if (daVar.W != null) {
                        da daVar2 = (da) this.f20779c;
                        int[] C = daVar2.C(daVar2.f20191u);
                        int i12 = C[0];
                        da daVar3 = (da) this.f20779c;
                        i10 = i12 + daVar3.f20155a;
                        int dp = (((-daVar.n()) / 2) + ((C[1] + daVar3.f20157b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((da) this.f20779c).F.getWidth();
                    ((da) this.f20779c).O();
                    da daVar4 = (da) this.f20779c;
                    if (daVar4.W != null) {
                        width = daVar4.C(daVar4.v)[0] + ((da) this.f20779c).f20155a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f20778b;
                if (org.telegram.ui.Components.x1.b(callback)) {
                    org.telegram.ui.u6.c(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f20779c;
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
        switch (this.f20777a) {
            case 0:
                ((n9) this.f20778b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f20778b.onPrepareActionMode(actionMode, menu);
            default:
                return ((zt) this.f20778b).f30979a.onPrepareActionMode(actionMode, menu);
        }
    }

    public o9(zt ztVar, ActionMode.Callback callback) {
        this.f20778b = ztVar;
        this.f20779c = callback;
    }

    public o9(da daVar, n9 n9Var) {
        this.f20779c = daVar;
        this.f20778b = n9Var;
    }
}
