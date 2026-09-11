package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.wt;
public final class o9 extends ActionMode.Callback2 {
    public final int f22447a = 0;
    public final ActionMode.Callback f22448b;
    public final Object f22449c;

    public o9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f22449c = editTextBoldCursor;
        this.f22448b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f22447a) {
            case 0:
                ((n9) this.f22448b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f22448b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((wt) this.f22448b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22447a) {
            case 0:
                ((n9) this.f22448b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22448b.onCreateActionMode(actionMode, menu);
            default:
                return ((wt) this.f22448b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f22447a) {
            case 0:
                ((n9) this.f22448b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f22448b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f22449c).f();
                ((EditTextBoldCursor) this.f22449c).floatingActionMode = null;
                return;
            default:
                ((wt) this.f22448b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f22447a) {
            case 0:
                if (((da) this.f22449c).y()) {
                    ((da) this.f22449c).P();
                    int[] m10 = ((da) this.f22449c).m();
                    da daVar = (da) this.f22449c;
                    int i11 = 1;
                    if (daVar.W != null) {
                        da daVar2 = (da) this.f22449c;
                        int[] C = daVar2.C(daVar2.f21799u);
                        int i12 = C[0];
                        da daVar3 = (da) this.f22449c;
                        i10 = i12 + daVar3.f21762a;
                        int dp = (((-daVar.n()) / 2) + ((C[1] + daVar3.f21764b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((da) this.f22449c).F.getWidth();
                    ((da) this.f22449c).O();
                    da daVar4 = (da) this.f22449c;
                    if (daVar4.W != null) {
                        width = daVar4.C(daVar4.v)[0] + ((da) this.f22449c).f21762a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f22448b;
                if (org.telegram.ui.Components.p2.d(callback)) {
                    m4.t0.d(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f22449c;
                if (org.telegram.ui.Components.p2.d(callback2)) {
                    m4.t0.d(callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22447a) {
            case 0:
                ((n9) this.f22448b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22448b.onPrepareActionMode(actionMode, menu);
            default:
                return ((wt) this.f22448b).f32337a.onPrepareActionMode(actionMode, menu);
        }
    }

    public o9(wt wtVar, ActionMode.Callback callback) {
        this.f22448b = wtVar;
        this.f22449c = callback;
    }

    public o9(da daVar, n9 n9Var) {
        this.f22449c = daVar;
        this.f22448b = n9Var;
    }
}
