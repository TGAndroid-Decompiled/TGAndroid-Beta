package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zt;
public final class p9 extends ActionMode.Callback2 {
    public final int f20574a = 0;
    public final ActionMode.Callback f20575b;
    public final Object f20576c;

    public p9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f20576c = editTextBoldCursor;
        this.f20575b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f20574a) {
            case 0:
                ((o9) this.f20575b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f20575b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((zt) this.f20575b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f20574a) {
            case 0:
                ((o9) this.f20575b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f20575b.onCreateActionMode(actionMode, menu);
            default:
                return ((zt) this.f20575b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f20574a) {
            case 0:
                ((o9) this.f20575b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f20575b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f20576c).f();
                ((EditTextBoldCursor) this.f20576c).floatingActionMode = null;
                return;
            default:
                ((zt) this.f20575b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f20574a) {
            case 0:
                if (((ea) this.f20576c).y()) {
                    ((ea) this.f20576c).P();
                    int[] m10 = ((ea) this.f20576c).m();
                    ea eaVar = (ea) this.f20576c;
                    int i11 = 1;
                    if (eaVar.W != null) {
                        ea eaVar2 = (ea) this.f20576c;
                        int[] C = eaVar2.C(eaVar2.f20013u);
                        int i12 = C[0];
                        ea eaVar3 = (ea) this.f20576c;
                        i10 = i12 + eaVar3.f19977a;
                        int dp = (((-eaVar.n()) / 2) + ((C[1] + eaVar3.f19979b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i11 = dp;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = ((ea) this.f20576c).F.getWidth();
                    ((ea) this.f20576c).O();
                    ea eaVar4 = (ea) this.f20576c;
                    if (eaVar4.W != null) {
                        width = eaVar4.C(eaVar4.v)[0] + ((ea) this.f20576c).f19977a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f20575b;
                if (org.telegram.ui.Components.x1.c(callback)) {
                    y7.b(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f20576c;
                if (org.telegram.ui.Components.x1.c(callback2)) {
                    y7.b(callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f20574a) {
            case 0:
                ((o9) this.f20575b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f20575b.onPrepareActionMode(actionMode, menu);
            default:
                return ((zt) this.f20575b).f30653a.onPrepareActionMode(actionMode, menu);
        }
    }

    public p9(zt ztVar, ActionMode.Callback callback) {
        this.f20575b = ztVar;
        this.f20576c = callback;
    }

    public p9(ea eaVar, o9 o9Var) {
        this.f20576c = eaVar;
        this.f20575b = o9Var;
    }
}
