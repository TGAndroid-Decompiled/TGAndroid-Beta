package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Field;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class h9 extends ActionMode.Callback2 {
    public final int f30800a = 2;
    public final ActionMode.Callback f30801b;
    public final Object f30802c;

    public h9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f30802c = editTextBoldCursor;
        this.f30801b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f30800a) {
            case 0:
                ((g9) this.f30801b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f30801b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((g9) this.f30801b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f30800a) {
            case 0:
                ((g9) this.f30801b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f30801b.onCreateActionMode(actionMode, menu);
            default:
                return ((g9) this.f30801b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        int i7 = this.f30800a;
        ActionMode.Callback callback = this.f30801b;
        switch (i7) {
            case 0:
                return;
            case 1:
                callback.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f30802c;
                Field field = EditTextBoldCursor.E1;
                editTextBoldCursor.m();
                editTextBoldCursor.Z0 = null;
                return;
            default:
                ((g9) callback).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i7;
        switch (this.f30800a) {
            case 0:
                w9 w9Var = (w9) this.f30802c;
                if (w9Var.x()) {
                    w9Var.O();
                    int[] l10 = w9Var.l();
                    int i10 = 1;
                    if (w9Var.W != null) {
                        int[] B = w9Var.B(w9Var.f32300u);
                        i7 = B[0] + w9Var.f32268a;
                        int L = (((-w9Var.m()) / 2) + ((B[1] + w9Var.f32270b) + l10[1])) - org.telegram.messenger.g0.L(4.0f);
                        if (L >= 1) {
                            i10 = L;
                        }
                    } else {
                        i7 = 0;
                    }
                    int width = w9Var.F.getWidth();
                    w9Var.N();
                    if (w9Var.W != null) {
                        width = w9Var.B(w9Var.v)[0] + w9Var.f32268a;
                    }
                    rect.set(Math.min(i7, width), i10, Math.max(i7, width), i10 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f30801b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f30802c;
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
        switch (this.f30800a) {
            case 0:
                ((g9) this.f30801b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f30801b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ActionMode.Callback) ((g9) this.f30801b).f30713b).onPrepareActionMode(actionMode, menu);
        }
    }

    public h9(g9 g9Var, ActionMode.Callback callback) {
        this.f30801b = g9Var;
        this.f30802c = callback;
    }

    public h9(w9 w9Var, g9 g9Var) {
        this.f30802c = w9Var;
        this.f30801b = g9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
