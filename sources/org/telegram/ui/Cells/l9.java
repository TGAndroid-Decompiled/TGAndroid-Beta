package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jt;
public final class l9 extends ActionMode.Callback2 {
    public final int f24674a = 0;
    public final ActionMode.Callback f24675b;
    public final Object f24676c;

    public l9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f24676c = editTextBoldCursor;
        this.f24675b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f24674a) {
            case 0:
                ((k9) this.f24675b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f24675b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((jt) this.f24675b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f24674a) {
            case 0:
                ((k9) this.f24675b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f24675b.onCreateActionMode(actionMode, menu);
            default:
                return ((jt) this.f24675b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.f24674a) {
            case 0:
                ((k9) this.f24675b).onDestroyActionMode(actionMode);
                return;
            case 1:
                this.f24675b.onDestroyActionMode(actionMode);
                ((EditTextBoldCursor) this.f24676c).f();
                ((EditTextBoldCursor) this.f24676c).floatingActionMode = null;
                return;
            default:
                ((jt) this.f24675b).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i9;
        switch (this.f24674a) {
            case 0:
                if (((aa) this.f24676c).y()) {
                    ((aa) this.f24676c).P();
                    int[] m10 = ((aa) this.f24676c).m();
                    aa aaVar = (aa) this.f24676c;
                    int i10 = 1;
                    if (aaVar.W != null) {
                        aa aaVar2 = (aa) this.f24676c;
                        int[] C = aaVar2.C(aaVar2.f24108u);
                        int i11 = C[0];
                        aa aaVar3 = (aa) this.f24676c;
                        i9 = i11 + aaVar3.f24071a;
                        int dp = (((-aaVar.n()) / 2) + ((C[1] + aaVar3.f24073b) + m10[1])) - AndroidUtilities.dp(4.0f);
                        if (dp >= 1) {
                            i10 = dp;
                        }
                    } else {
                        i9 = 0;
                    }
                    int width = ((aa) this.f24676c).F.getWidth();
                    ((aa) this.f24676c).O();
                    aa aaVar4 = (aa) this.f24676c;
                    if (aaVar4.W != null) {
                        width = aaVar4.C(aaVar4.v)[0] + ((aa) this.f24676c).f24071a;
                    }
                    rect.set(Math.min(i9, width), i10, Math.max(i9, width), i10 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f24675b;
                if (org.telegram.ui.Components.g2.d(callback)) {
                    mg.b.d(callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f24676c;
                if (org.telegram.ui.Components.g2.d(callback2)) {
                    mg.b.d(callback2).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f24674a) {
            case 0:
                ((k9) this.f24675b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f24675b.onPrepareActionMode(actionMode, menu);
            default:
                return ((jt) this.f24675b).f29835a.onPrepareActionMode(actionMode, menu);
        }
    }

    public l9(jt jtVar, ActionMode.Callback callback) {
        this.f24675b = jtVar;
        this.f24676c = callback;
    }

    public l9(aa aaVar, k9 k9Var) {
        this.f24676c = aaVar;
        this.f24675b = k9Var;
    }
}
