package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cu;
public final class q9 extends ActionMode.Callback2 {
    public final int f19723a = 0;
    public final ActionMode.Callback f19724b;
    public final Object f19725c;

    public q9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f19725c = editTextBoldCursor;
        this.f19724b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f19723a) {
            case 0:
                ((p9) this.f19724b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f19724b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((cu) this.f19724b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f19723a) {
            case 0:
                ((p9) this.f19724b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f19724b.onCreateActionMode(actionMode, menu);
            default:
                return ((cu) this.f19724b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f19723a) {
            case 0:
                ((p9) this.f19724b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f19724b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f19725c).f();
                ((EditTextBoldCursor) this.f19725c).floatingActionMode = null;
                return;
            default:
                ((cu) this.f19724b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f19723a) {
            case 0:
                if (((fa) this.f19725c).y()) {
                    ((fa) this.f19725c).P();
                    int[] m10 = ((fa) this.f19725c).m();
                    fa faVar = (fa) this.f19725c;
                    int i11 = 1;
                    if (faVar.W != null) {
                        fa faVar2 = (fa) this.f19725c;
                        int[] C = faVar2.C(faVar2.f19164u);
                        int i12 = C[0];
                        fa faVar3 = (fa) this.f19725c;
                        i10 = i12 + faVar3.f19128a;
                        int dp = (((-faVar.n()) / 2) + ((C[1] + faVar3.f19130b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((fa) this.f19725c).F.getWidth();
                    ((fa) this.f19725c).O();
                    fa faVar4 = (fa) this.f19725c;
                    if (faVar4.W != null) {
                        width = faVar4.C(faVar4.v)[0] + ((fa) this.f19725c).f19128a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f19724b;
                if (org.telegram.ui.Components.q2.d(callback)) {
                    n2.l.g(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f19725c;
                if (org.telegram.ui.Components.q2.d(callback2)) {
                    n2.l.g(callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f19723a) {
            case 0:
                ((p9) this.f19724b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f19724b.onPrepareActionMode(actionMode, menu);
            default:
                return ((cu) this.f19724b).f22224a.onPrepareActionMode(actionMode, menu);
        }
    }

    public q9(cu cuVar, ActionMode.Callback callback) {
        this.f19724b = cuVar;
        this.f19725c = callback;
    }

    public q9(fa faVar, p9 p9Var) {
        this.f19725c = faVar;
        this.f19724b = p9Var;
    }
}
