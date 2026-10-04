package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bu;
public final class o9 extends ActionMode.Callback2 {
    public final int f22615a = 0;
    public final ActionMode.Callback f22616b;
    public final Object f22617c;

    public o9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f22617c = editTextBoldCursor;
        this.f22616b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f22615a) {
            case 0:
                ((n9) this.f22616b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f22616b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((bu) this.f22616b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22615a) {
            case 0:
                ((n9) this.f22616b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22616b.onCreateActionMode(actionMode, menu);
            default:
                return ((bu) this.f22616b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f22615a) {
            case 0:
                ((n9) this.f22616b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f22616b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f22617c).f();
                ((EditTextBoldCursor) this.f22617c).floatingActionMode = null;
                return;
            default:
                ((bu) this.f22616b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f22615a) {
            case 0:
                if (((da) this.f22617c).y()) {
                    ((da) this.f22617c).P();
                    int[] m10 = ((da) this.f22617c).m();
                    da daVar = (da) this.f22617c;
                    int i11 = 1;
                    if (daVar.W != null) {
                        da daVar2 = (da) this.f22617c;
                        int[] C = daVar2.C(daVar2.f21980u);
                        int i12 = C[0];
                        da daVar3 = (da) this.f22617c;
                        i10 = i12 + daVar3.f21943a;
                        int dp = (((-daVar.n()) / 2) + ((C[1] + daVar3.f21945b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((da) this.f22617c).F.getWidth();
                    ((da) this.f22617c).O();
                    da daVar4 = (da) this.f22617c;
                    if (daVar4.W != null) {
                        width = daVar4.C(daVar4.v)[0] + ((da) this.f22617c).f21943a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f22616b;
                if (org.telegram.ui.Components.w1.a(callback)) {
                    org.telegram.ui.m4.c(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f22617c;
                if (org.telegram.ui.Components.w1.a(callback2)) {
                    org.telegram.ui.m4.c(callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22615a) {
            case 0:
                ((n9) this.f22616b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22616b.onPrepareActionMode(actionMode, menu);
            default:
                return ((bu) this.f22616b).f25056a.onPrepareActionMode(actionMode, menu);
        }
    }

    public o9(bu buVar, ActionMode.Callback callback) {
        this.f22616b = buVar;
        this.f22617c = callback;
    }

    public o9(da daVar, n9 n9Var) {
        this.f22617c = daVar;
        this.f22616b = n9Var;
    }
}
