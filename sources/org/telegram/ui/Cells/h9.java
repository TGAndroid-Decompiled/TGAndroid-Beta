package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ht;

public final class h9 extends ActionMode.Callback2 {

    public final int f24463a = 0;

    public final ActionMode.Callback f24464b;

    public final Object f24465c;

    public h9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f24465c = editTextBoldCursor;
        this.f24464b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f24463a) {
            case 0:
                ((g9) this.f24464b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f24464b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((ht) this.f24464b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f24463a) {
            case 0:
                ((g9) this.f24464b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f24464b.onCreateActionMode(actionMode, menu);
            default:
                return ((ht) this.f24464b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f24463a) {
            case 0:
                ((g9) this.f24464b).onDestroyActionMode(actionMode);
                break;
            case 1:
                this.f24464b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f24465c).f();
                ((EditTextBoldCursor) this.f24465c).floatingActionMode = null;
                break;
            default:
                ((ht) this.f24464b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f24463a) {
            case 0:
                if (((w9) this.f24465c).y()) {
                    ((w9) this.f24465c).P();
                    int[] iArrM = ((w9) this.f24465c).m();
                    w9 w9Var = (w9) this.f24465c;
                    int i11 = 1;
                    if (w9Var.W != null) {
                        int i12 = -w9Var.n();
                        w9 w9Var2 = (w9) this.f24465c;
                        int[] iArrC = w9Var2.C(w9Var2.f25895u);
                        int i13 = iArrC[0];
                        w9 w9Var3 = (w9) this.f24465c;
                        i10 = i13 + w9Var3.f25858a;
                        int iDp = ((i12 / 2) + ((iArrC[1] + w9Var3.f25860b) + iArrM[1])) - AndroidUtilities.dp(4.0f);
                        if (iDp >= 1) {
                            i11 = iDp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((w9) this.f24465c).F.getWidth();
                    ((w9) this.f24465c).O();
                    w9 w9Var4 = (w9) this.f24465c;
                    if (w9Var4.W != null) {
                        width = w9Var4.C(w9Var4.v)[0] + ((w9) this.f24465c).f25858a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    break;
                }
                break;
            case 1:
                ActionMode.Callback callback = this.f24464b;
                if (!org.telegram.ui.Components.c2.d(callback)) {
                    super.onGetContentRect(actionMode, view, rect);
                } else {
                    ng.a.d(callback).onGetContentRect(actionMode, view, rect);
                }
                break;
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f24465c;
                if (!org.telegram.ui.Components.c2.d(callback2)) {
                    super.onGetContentRect(actionMode, view, rect);
                } else {
                    ng.a.d(callback2).onGetContentRect(actionMode, view, rect);
                }
                break;
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f24463a) {
            case 0:
                ((g9) this.f24464b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f24464b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ht) this.f24464b).f29097a.onPrepareActionMode(actionMode, menu);
        }
    }

    public h9(ht htVar, ActionMode.Callback callback) {
        this.f24464b = htVar;
        this.f24465c = callback;
    }

    public h9(w9 w9Var, g9 g9Var) {
        this.f24465c = w9Var;
        this.f24464b = g9Var;
    }
}
