package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ku;
public final class m9 extends ActionMode.Callback2 {
    public final int f21530a = 0;
    public final ActionMode.Callback f21531b;
    public final Object f21532c;

    public m9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f21532c = editTextBoldCursor;
        this.f21531b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f21530a) {
            case 0:
                ((l9) this.f21531b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f21531b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((ku) this.f21531b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f21530a) {
            case 0:
                ((l9) this.f21531b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f21531b.onCreateActionMode(actionMode, menu);
            default:
                return ((ku) this.f21531b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f21530a) {
            case 0:
                return;
            case 1:
                this.f21531b.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f21532c;
                editTextBoldCursor.f();
                editTextBoldCursor.floatingActionMode = null;
                return;
            default:
                ((ku) this.f21531b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f21530a) {
            case 0:
                ba baVar = (ba) this.f21532c;
                if (baVar.x()) {
                    baVar.O();
                    int[] l4 = baVar.l();
                    int i11 = 1;
                    if (baVar.W != null) {
                        int[] B = baVar.B(baVar.f20990u);
                        i10 = B[0] + baVar.f20959a;
                        int dp = (((-baVar.m()) / 2) + ((B[1] + baVar.f20961b) + l4[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = baVar.F.getWidth();
                    baVar.N();
                    if (baVar.W != null) {
                        width = baVar.B(baVar.v)[0] + baVar.f20959a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f21531b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f21532c;
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
        switch (this.f21530a) {
            case 0:
                ((l9) this.f21531b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f21531b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ku) this.f21531b).f26801a.onPrepareActionMode(actionMode, menu);
        }
    }

    public m9(ku kuVar, ActionMode.Callback callback) {
        this.f21531b = kuVar;
        this.f21532c = callback;
    }

    public m9(ba baVar, l9 l9Var) {
        this.f21532c = baVar;
        this.f21531b = l9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
