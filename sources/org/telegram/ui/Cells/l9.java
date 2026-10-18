package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fu;
public final class l9 extends ActionMode.Callback2 {
    public final int f22552a = 0;
    public final ActionMode.Callback f22553b;
    public final Object f22554c;

    public l9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f22554c = editTextBoldCursor;
        this.f22553b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f22552a) {
            case 0:
                ((k9) this.f22553b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f22553b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((fu) this.f22553b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22552a) {
            case 0:
                ((k9) this.f22553b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22553b.onCreateActionMode(actionMode, menu);
            default:
                return ((fu) this.f22553b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f22552a) {
            case 0:
                return;
            case 1:
                this.f22553b.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f22554c;
                editTextBoldCursor.f();
                editTextBoldCursor.floatingActionMode = null;
                return;
            default:
                ((fu) this.f22553b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f22552a) {
            case 0:
                aa aaVar = (aa) this.f22554c;
                if (aaVar.x()) {
                    aaVar.O();
                    int[] l4 = aaVar.l();
                    int i11 = 1;
                    if (aaVar.W != null) {
                        int[] B = aaVar.B(aaVar.f22016u);
                        i10 = B[0] + aaVar.f21985a;
                        int dp = (((-aaVar.m()) / 2) + ((B[1] + aaVar.f21987b) + l4[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = aaVar.F.getWidth();
                    aaVar.N();
                    if (aaVar.W != null) {
                        width = aaVar.B(aaVar.v)[0] + aaVar.f21985a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f22553b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f22554c;
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
        switch (this.f22552a) {
            case 0:
                ((k9) this.f22553b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22553b.onPrepareActionMode(actionMode, menu);
            default:
                return ((fu) this.f22553b).f26395a.onPrepareActionMode(actionMode, menu);
        }
    }

    public l9(fu fuVar, ActionMode.Callback callback) {
        this.f22553b = fuVar;
        this.f22554c = callback;
    }

    public l9(aa aaVar, k9 k9Var) {
        this.f22554c = aaVar;
        this.f22553b = k9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
