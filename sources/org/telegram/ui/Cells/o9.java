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
    public final int f22614a = 0;
    public final ActionMode.Callback f22615b;
    public final Object f22616c;

    public o9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f22616c = editTextBoldCursor;
        this.f22615b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f22614a) {
            case 0:
                ((n9) this.f22615b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f22615b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((bu) this.f22615b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22614a) {
            case 0:
                ((n9) this.f22615b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22615b.onCreateActionMode(actionMode, menu);
            default:
                return ((bu) this.f22615b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f22614a) {
            case 0:
                ((n9) this.f22615b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f22615b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f22616c).f();
                ((EditTextBoldCursor) this.f22616c).floatingActionMode = null;
                return;
            default:
                ((bu) this.f22615b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f22614a) {
            case 0:
                if (((da) this.f22616c).y()) {
                    ((da) this.f22616c).P();
                    int[] m10 = ((da) this.f22616c).m();
                    da daVar = (da) this.f22616c;
                    int i11 = 1;
                    if (daVar.W != null) {
                        da daVar2 = (da) this.f22616c;
                        int[] C = daVar2.C(daVar2.f21979u);
                        int i12 = C[0];
                        da daVar3 = (da) this.f22616c;
                        i10 = i12 + daVar3.f21942a;
                        int dp = (((-daVar.n()) / 2) + ((C[1] + daVar3.f21944b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((da) this.f22616c).F.getWidth();
                    ((da) this.f22616c).O();
                    da daVar4 = (da) this.f22616c;
                    if (daVar4.W != null) {
                        width = daVar4.C(daVar4.v)[0] + ((da) this.f22616c).f21942a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f22615b;
                if (org.telegram.ui.Components.w1.a(callback)) {
                    org.telegram.ui.m4.c(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f22616c;
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
        switch (this.f22614a) {
            case 0:
                ((n9) this.f22615b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22615b.onPrepareActionMode(actionMode, menu);
            default:
                return ((bu) this.f22615b).f25055a.onPrepareActionMode(actionMode, menu);
        }
    }

    public o9(bu buVar, ActionMode.Callback callback) {
        this.f22615b = buVar;
        this.f22616c = callback;
    }

    public o9(da daVar, n9 n9Var) {
        this.f22616c = daVar;
        this.f22615b = n9Var;
    }
}
