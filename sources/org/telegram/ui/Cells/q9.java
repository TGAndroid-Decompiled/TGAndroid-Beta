package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gu;
public final class q9 extends ActionMode.Callback2 {
    public final int f24835a = 0;
    public final ActionMode.Callback f24836b;
    public final Object f24837c;

    public q9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f24837c = editTextBoldCursor;
        this.f24836b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f24835a) {
            case 0:
                ((p9) this.f24836b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f24836b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((gu) this.f24836b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f24835a) {
            case 0:
                ((p9) this.f24836b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f24836b.onCreateActionMode(actionMode, menu);
            default:
                return ((gu) this.f24836b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f24835a) {
            case 0:
                return;
            case 1:
                this.f24836b.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f24837c;
                editTextBoldCursor.f();
                editTextBoldCursor.floatingActionMode = null;
                return;
            default:
                ((gu) this.f24836b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f24835a) {
            case 0:
                fa faVar = (fa) this.f24837c;
                if (faVar.x()) {
                    faVar.O();
                    int[] l4 = faVar.l();
                    int i11 = 1;
                    if (faVar.W != null) {
                        int[] B = faVar.B(faVar.f24116u);
                        i10 = B[0] + faVar.f24085a;
                        int dp = (((-faVar.m()) / 2) + ((B[1] + faVar.f24087b) + l4[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = faVar.F.getWidth();
                    faVar.N();
                    if (faVar.W != null) {
                        width = faVar.B(faVar.v)[0] + faVar.f24085a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f24836b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f24837c;
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
        switch (this.f24835a) {
            case 0:
                ((p9) this.f24836b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f24836b.onPrepareActionMode(actionMode, menu);
            default:
                return ((gu) this.f24836b).f28713a.onPrepareActionMode(actionMode, menu);
        }
    }

    public q9(gu guVar, ActionMode.Callback callback) {
        this.f24836b = guVar;
        this.f24837c = callback;
    }

    public q9(fa faVar, p9 p9Var) {
        this.f24837c = faVar;
        this.f24836b = p9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
