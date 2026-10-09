package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ou;
public final class m9 extends ActionMode.Callback2 {
    public final int f22474a = 0;
    public final ActionMode.Callback f22475b;
    public final Object f22476c;

    public m9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f22476c = editTextBoldCursor;
        this.f22475b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f22474a) {
            case 0:
                ((l9) this.f22475b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f22475b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((ou) this.f22475b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22474a) {
            case 0:
                ((l9) this.f22475b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22475b.onCreateActionMode(actionMode, menu);
            default:
                return ((ou) this.f22475b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f22474a) {
            case 0:
                return;
            case 1:
                this.f22475b.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f22476c;
                editTextBoldCursor.f();
                editTextBoldCursor.floatingActionMode = null;
                return;
            default:
                ((ou) this.f22475b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f22474a) {
            case 0:
                ba baVar = (ba) this.f22476c;
                if (baVar.x()) {
                    baVar.O();
                    int[] l4 = baVar.l();
                    int i11 = 1;
                    if (baVar.W != null) {
                        int[] B = baVar.B(baVar.f21884u);
                        i10 = B[0] + baVar.f21852a;
                        int dp = (((-baVar.m()) / 2) + ((B[1] + baVar.f21854b) + l4[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = baVar.F.getWidth();
                    baVar.N();
                    if (baVar.W != null) {
                        width = baVar.B(baVar.v)[0] + baVar.f21852a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f22475b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f22476c;
                if (callback2 instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22474a) {
            case 0:
                ((l9) this.f22475b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22475b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ou) this.f22475b).f29572a.onPrepareActionMode(actionMode, menu);
        }
    }

    public m9(ou ouVar, ActionMode.Callback callback) {
        this.f22475b = ouVar;
        this.f22476c = callback;
    }

    public m9(ba baVar, l9 l9Var) {
        this.f22476c = baVar;
        this.f22475b = l9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
