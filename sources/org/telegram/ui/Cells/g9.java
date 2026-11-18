package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Field;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g9 extends ActionMode.Callback2 {
    public final int f30720a = 2;
    public final ActionMode.Callback f30721b;
    public final Object f30722c;

    public g9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f30722c = editTextBoldCursor;
        this.f30721b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f30720a) {
            case 0:
                ((f9) this.f30721b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f30721b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((f9) this.f30721b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f30720a) {
            case 0:
                ((f9) this.f30721b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f30721b.onCreateActionMode(actionMode, menu);
            default:
                return ((f9) this.f30721b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        int i7 = this.f30720a;
        ActionMode.Callback callback = this.f30721b;
        switch (i7) {
            case 0:
                return;
            case 1:
                callback.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f30722c;
                Field field = EditTextBoldCursor.E1;
                editTextBoldCursor.m();
                editTextBoldCursor.Z0 = null;
                return;
            default:
                ((f9) callback).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i7;
        switch (this.f30720a) {
            case 0:
                v9 v9Var = (v9) this.f30722c;
                if (v9Var.x()) {
                    v9Var.O();
                    int[] l10 = v9Var.l();
                    int i10 = 1;
                    if (v9Var.W != null) {
                        int[] B = v9Var.B(v9Var.f32211u);
                        i7 = B[0] + v9Var.f32179a;
                        int L = (((-v9Var.m()) / 2) + ((B[1] + v9Var.f32181b) + l10[1])) - org.telegram.messenger.g0.L(4.0f);
                        if (L >= 1) {
                            i10 = L;
                        }
                    } else {
                        i7 = 0;
                    }
                    int width = v9Var.F.getWidth();
                    v9Var.N();
                    if (v9Var.W != null) {
                        width = v9Var.B(v9Var.v)[0] + v9Var.f32179a;
                    }
                    rect.set(Math.min(i7, width), i10, Math.max(i7, width), i10 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f30721b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f30722c;
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
        switch (this.f30720a) {
            case 0:
                ((f9) this.f30721b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f30721b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ActionMode.Callback) ((f9) this.f30721b).f30623b).onPrepareActionMode(actionMode, menu);
        }
    }

    public g9(f9 f9Var, ActionMode.Callback callback) {
        this.f30721b = f9Var;
        this.f30722c = callback;
    }

    public g9(v9 v9Var, f9 f9Var) {
        this.f30722c = v9Var;
        this.f30721b = f9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
