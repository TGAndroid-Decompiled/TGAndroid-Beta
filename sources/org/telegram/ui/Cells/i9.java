package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.pt;
public final class i9 extends ActionMode.Callback2 {
    public final int f24513a = 0;
    public final ActionMode.Callback f24514b;
    public final Object f24515c;

    public i9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f24515c = editTextBoldCursor;
        this.f24514b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f24513a) {
            case 0:
                ((h9) this.f24514b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f24514b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((pt) this.f24514b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f24513a) {
            case 0:
                ((h9) this.f24514b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f24514b.onCreateActionMode(actionMode, menu);
            default:
                return ((pt) this.f24514b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f24513a) {
            case 0:
                ((h9) this.f24514b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f24514b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f24515c).f();
                ((EditTextBoldCursor) this.f24515c).floatingActionMode = null;
                return;
            default:
                ((pt) this.f24514b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f24513a) {
            case 0:
                if (((x9) this.f24515c).y()) {
                    ((x9) this.f24515c).P();
                    int[] m10 = ((x9) this.f24515c).m();
                    x9 x9Var = (x9) this.f24515c;
                    int i11 = 1;
                    if (x9Var.W != null) {
                        x9 x9Var2 = (x9) this.f24515c;
                        int[] C = x9Var2.C(x9Var2.f25969u);
                        int i12 = C[0];
                        x9 x9Var3 = (x9) this.f24515c;
                        i10 = i12 + x9Var3.f25932a;
                        int dp = (((-x9Var.n()) / 2) + ((C[1] + x9Var3.f25934b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((x9) this.f24515c).F.getWidth();
                    ((x9) this.f24515c).O();
                    x9 x9Var4 = (x9) this.f24515c;
                    if (x9Var4.W != null) {
                        width = x9Var4.C(x9Var4.v)[0] + ((x9) this.f24515c).f25932a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f24514b;
                if (org.telegram.ui.Components.r2.d(callback)) {
                    m4.a.i(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f24515c;
                if (org.telegram.ui.Components.r2.d(callback2)) {
                    m4.a.i(callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f24513a) {
            case 0:
                ((h9) this.f24514b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f24514b.onPrepareActionMode(actionMode, menu);
            default:
                return ((pt) this.f24514b).f31765a.onPrepareActionMode(actionMode, menu);
        }
    }

    public i9(pt ptVar, ActionMode.Callback callback) {
        this.f24514b = ptVar;
        this.f24515c = callback;
    }

    public i9(x9 x9Var, h9 h9Var) {
        this.f24515c = x9Var;
        this.f24514b = h9Var;
    }
}
