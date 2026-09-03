package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.rt;
public final class j9 extends ActionMode.Callback2 {
    public final int f21246a = 0;
    public final ActionMode.Callback f21247b;
    public final Object f21248c;

    public j9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f21248c = editTextBoldCursor;
        this.f21247b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f21246a) {
            case 0:
                ((i9) this.f21247b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f21247b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((rt) this.f21247b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f21246a) {
            case 0:
                ((i9) this.f21247b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f21247b.onCreateActionMode(actionMode, menu);
            default:
                return ((rt) this.f21247b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f21246a) {
            case 0:
                ((i9) this.f21247b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f21247b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f21248c).f();
                ((EditTextBoldCursor) this.f21248c).floatingActionMode = null;
                return;
            default:
                ((rt) this.f21247b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f21246a) {
            case 0:
                if (((y9) this.f21248c).y()) {
                    ((y9) this.f21248c).P();
                    int[] m9 = ((y9) this.f21248c).m();
                    y9 y9Var = (y9) this.f21248c;
                    int i11 = 1;
                    if (y9Var.W != null) {
                        y9 y9Var2 = (y9) this.f21248c;
                        int[] C = y9Var2.C(y9Var2.f22637u);
                        int i12 = C[0];
                        y9 y9Var3 = (y9) this.f21248c;
                        i10 = i12 + y9Var3.f22601a;
                        int dp = (((-y9Var.n()) / 2) + ((C[1] + y9Var3.f22603b) + m9[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((y9) this.f21248c).F.getWidth();
                    ((y9) this.f21248c).O();
                    y9 y9Var4 = (y9) this.f21248c;
                    if (y9Var4.W != null) {
                        width = y9Var4.C(y9Var4.v)[0] + ((y9) this.f21248c).f22601a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f21247b;
                if (org.telegram.ui.Components.k2.d(callback)) {
                    m.j0.f(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f21248c;
                if (org.telegram.ui.Components.k2.d(callback2)) {
                    m.j0.f(callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f21246a) {
            case 0:
                ((i9) this.f21247b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f21247b.onPrepareActionMode(actionMode, menu);
            default:
                return ((rt) this.f21247b).f28582a.onPrepareActionMode(actionMode, menu);
        }
    }

    public j9(rt rtVar, ActionMode.Callback callback) {
        this.f21247b = rtVar;
        this.f21248c = callback;
    }

    public j9(y9 y9Var, i9 i9Var) {
        this.f21248c = y9Var;
        this.f21247b = i9Var;
    }
}
