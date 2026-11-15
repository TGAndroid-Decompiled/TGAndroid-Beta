package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Field;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f9 extends ActionMode.Callback2 {
    public final int f30305a = 2;
    public final ActionMode.Callback f30306b;
    public final Object f30307c;

    public f9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f30307c = editTextBoldCursor;
        this.f30306b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f30305a) {
            case 0:
                ((e9) this.f30306b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f30306b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((e9) this.f30306b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f30305a) {
            case 0:
                ((e9) this.f30306b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f30306b.onCreateActionMode(actionMode, menu);
            default:
                return ((e9) this.f30306b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        int i7 = this.f30305a;
        ActionMode.Callback callback = this.f30306b;
        switch (i7) {
            case 0:
                return;
            case 1:
                callback.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f30307c;
                Field field = EditTextBoldCursor.E1;
                editTextBoldCursor.m();
                editTextBoldCursor.Z0 = null;
                return;
            default:
                ((e9) callback).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i7;
        switch (this.f30305a) {
            case 0:
                u9 u9Var = (u9) this.f30307c;
                if (u9Var.x()) {
                    u9Var.O();
                    int[] l10 = u9Var.l();
                    int i10 = 1;
                    if (u9Var.W != null) {
                        int[] B = u9Var.B(u9Var.f31767u);
                        i7 = B[0] + u9Var.f31735a;
                        int L = (((-u9Var.m()) / 2) + ((B[1] + u9Var.f31737b) + l10[1])) - org.telegram.messenger.g0.L(4.0f);
                        if (L >= 1) {
                            i10 = L;
                        }
                    } else {
                        i7 = 0;
                    }
                    int width = u9Var.F.getWidth();
                    u9Var.N();
                    if (u9Var.W != null) {
                        width = u9Var.B(u9Var.v)[0] + u9Var.f31735a;
                    }
                    rect.set(Math.min(i7, width), i10, Math.max(i7, width), i10 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f30306b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f30307c;
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
        switch (this.f30305a) {
            case 0:
                ((e9) this.f30306b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f30306b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ActionMode.Callback) ((e9) this.f30306b).f30190b).onPrepareActionMode(actionMode, menu);
        }
    }

    public f9(e9 e9Var, ActionMode.Callback callback) {
        this.f30306b = e9Var;
        this.f30307c = callback;
    }

    public f9(u9 u9Var, e9 e9Var) {
        this.f30307c = u9Var;
        this.f30306b = e9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
