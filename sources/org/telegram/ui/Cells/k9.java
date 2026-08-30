package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.st;
public final class k9 extends ActionMode.Callback2 {
    public final int f21316a = 0;
    public final ActionMode.Callback f21317b;
    public final Object f21318c;

    public k9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f21318c = editTextBoldCursor;
        this.f21317b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f21316a) {
            case 0:
                ((j9) this.f21317b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f21317b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((st) this.f21317b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f21316a) {
            case 0:
                ((j9) this.f21317b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f21317b.onCreateActionMode(actionMode, menu);
            default:
                return ((st) this.f21317b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f21316a) {
            case 0:
                ((j9) this.f21317b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f21317b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f21318c).f();
                ((EditTextBoldCursor) this.f21318c).floatingActionMode = null;
                return;
            default:
                ((st) this.f21317b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f21316a) {
            case 0:
                if (((z9) this.f21318c).y()) {
                    ((z9) this.f21318c).P();
                    int[] m9 = ((z9) this.f21318c).m();
                    z9 z9Var = (z9) this.f21318c;
                    int i11 = 1;
                    if (z9Var.W != null) {
                        z9 z9Var2 = (z9) this.f21318c;
                        int[] C = z9Var2.C(z9Var2.f22701u);
                        int i12 = C[0];
                        z9 z9Var3 = (z9) this.f21318c;
                        i10 = i12 + z9Var3.f22665a;
                        int dp = (((-z9Var.n()) / 2) + ((C[1] + z9Var3.f22667b) + m9[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((z9) this.f21318c).F.getWidth();
                    ((z9) this.f21318c).O();
                    z9 z9Var4 = (z9) this.f21318c;
                    if (z9Var4.W != null) {
                        width = z9Var4.C(z9Var4.v)[0] + ((z9) this.f21318c).f22665a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f21317b;
                if (org.telegram.ui.Components.k2.d(callback)) {
                    m.j0.f(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f21318c;
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
        switch (this.f21316a) {
            case 0:
                ((j9) this.f21317b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f21317b.onPrepareActionMode(actionMode, menu);
            default:
                return ((st) this.f21317b).f28814a.onPrepareActionMode(actionMode, menu);
        }
    }

    public k9(st stVar, ActionMode.Callback callback) {
        this.f21317b = stVar;
        this.f21318c = callback;
    }

    public k9(z9 z9Var, j9 j9Var) {
        this.f21318c = z9Var;
        this.f21317b = j9Var;
    }
}
