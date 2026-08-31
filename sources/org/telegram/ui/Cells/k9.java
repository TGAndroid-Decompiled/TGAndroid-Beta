package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ut;
public final class k9 extends ActionMode.Callback2 {
    public final int f23082a = 0;
    public final ActionMode.Callback f23083b;
    public final Object f23084c;

    public k9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f23084c = editTextBoldCursor;
        this.f23083b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f23082a) {
            case 0:
                ((j9) this.f23083b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f23083b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((ut) this.f23083b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f23082a) {
            case 0:
                ((j9) this.f23083b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f23083b.onCreateActionMode(actionMode, menu);
            default:
                return ((ut) this.f23083b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f23082a) {
            case 0:
                ((j9) this.f23083b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f23083b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f23084c).f();
                ((EditTextBoldCursor) this.f23084c).floatingActionMode = null;
                return;
            default:
                ((ut) this.f23083b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f23082a) {
            case 0:
                if (((z9) this.f23084c).y()) {
                    ((z9) this.f23084c).P();
                    int[] m9 = ((z9) this.f23084c).m();
                    z9 z9Var = (z9) this.f23084c;
                    int i11 = 1;
                    if (z9Var.W != null) {
                        z9 z9Var2 = (z9) this.f23084c;
                        int[] C = z9Var2.C(z9Var2.f24537u);
                        int i12 = C[0];
                        z9 z9Var3 = (z9) this.f23084c;
                        i10 = i12 + z9Var3.f24500a;
                        int dp = (((-z9Var.n()) / 2) + ((C[1] + z9Var3.f24502b) + m9[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((z9) this.f23084c).F.getWidth();
                    ((z9) this.f23084c).O();
                    z9 z9Var4 = (z9) this.f23084c;
                    if (z9Var4.W != null) {
                        width = z9Var4.C(z9Var4.v)[0] + ((z9) this.f23084c).f24500a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f23083b;
                if (org.telegram.ui.Components.k2.d(callback)) {
                    mh.c3.f(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f23084c;
                if (org.telegram.ui.Components.k2.d(callback2)) {
                    mh.c3.f(callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f23082a) {
            case 0:
                ((j9) this.f23083b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f23083b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ut) this.f23083b).f31727a.onPrepareActionMode(actionMode, menu);
        }
    }

    public k9(ut utVar, ActionMode.Callback callback) {
        this.f23083b = utVar;
        this.f23084c = callback;
    }

    public k9(z9 z9Var, j9 j9Var) {
        this.f23084c = z9Var;
        this.f23083b = j9Var;
    }
}
