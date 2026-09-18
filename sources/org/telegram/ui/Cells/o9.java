package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yt;
public final class o9 extends ActionMode.Callback2 {
    public final int f20741a = 0;
    public final ActionMode.Callback f20742b;
    public final Object f20743c;

    public o9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f20743c = editTextBoldCursor;
        this.f20742b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f20741a) {
            case 0:
                ((n9) this.f20742b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f20742b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((yt) this.f20742b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f20741a) {
            case 0:
                ((n9) this.f20742b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f20742b.onCreateActionMode(actionMode, menu);
            default:
                return ((yt) this.f20742b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f20741a) {
            case 0:
                ((n9) this.f20742b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f20742b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f20743c).f();
                ((EditTextBoldCursor) this.f20743c).floatingActionMode = null;
                return;
            default:
                ((yt) this.f20742b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f20741a) {
            case 0:
                if (((da) this.f20743c).y()) {
                    ((da) this.f20743c).P();
                    int[] m10 = ((da) this.f20743c).m();
                    da daVar = (da) this.f20743c;
                    int i11 = 1;
                    if (daVar.W != null) {
                        da daVar2 = (da) this.f20743c;
                        int[] C = daVar2.C(daVar2.f20155u);
                        int i12 = C[0];
                        da daVar3 = (da) this.f20743c;
                        i10 = i12 + daVar3.f20119a;
                        int dp = (((-daVar.n()) / 2) + ((C[1] + daVar3.f20121b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((da) this.f20743c).F.getWidth();
                    ((da) this.f20743c).O();
                    da daVar4 = (da) this.f20743c;
                    if (daVar4.W != null) {
                        width = daVar4.C(daVar4.v)[0] + ((da) this.f20743c).f20119a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f20742b;
                if (org.telegram.ui.Components.j2.d(callback)) {
                    m4.r0.e(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f20743c;
                if (org.telegram.ui.Components.j2.d(callback2)) {
                    m4.r0.e(callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f20741a) {
            case 0:
                ((n9) this.f20742b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f20742b.onPrepareActionMode(actionMode, menu);
            default:
                return ((yt) this.f20742b).f30664a.onPrepareActionMode(actionMode, menu);
        }
    }

    public o9(yt ytVar, ActionMode.Callback callback) {
        this.f20742b = ytVar;
        this.f20743c = callback;
    }

    public o9(da daVar, n9 n9Var) {
        this.f20743c = daVar;
        this.f20742b = n9Var;
    }
}
