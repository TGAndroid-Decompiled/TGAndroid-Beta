package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Field;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i9 extends ActionMode.Callback2 {
    public final int f22049a = 2;
    public final ActionMode.Callback f22050b;
    public final Object f22051c;

    public i9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f22051c = editTextBoldCursor;
        this.f22050b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f22049a) {
            case 0:
                ((h9) this.f22050b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f22050b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((h9) this.f22050b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f22049a) {
            case 0:
                ((h9) this.f22050b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22050b.onCreateActionMode(actionMode, menu);
            default:
                return ((h9) this.f22050b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        int i10 = this.f22049a;
        ActionMode.Callback callback = this.f22050b;
        switch (i10) {
            case 0:
                return;
            case 1:
                callback.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f22051c;
                Field field = EditTextBoldCursor.f23981y1;
                editTextBoldCursor.m();
                editTextBoldCursor.Y0 = null;
                return;
            default:
                ((h9) callback).onDestroyActionMode(actionMode);
                return;
        }
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i10;
        switch (this.f22049a) {
            case 0:
                w9 w9Var = (w9) this.f22051c;
                if (w9Var.x()) {
                    w9Var.O();
                    int[] l4 = w9Var.l();
                    int i11 = 1;
                    if (w9Var.W != null) {
                        int[] B = w9Var.B(w9Var.f23444u);
                        i10 = B[0] + w9Var.f23413a;
                        int L = (((-w9Var.m()) / 2) + ((B[1] + w9Var.f23415b) + l4[1])) - org.telegram.messenger.i0.L(4.0f);
                        if (L >= 1) {
                            i11 = L;
                        }
                    } else {
                        i10 = 0;
                    }
                    int width = w9Var.F.getWidth();
                    w9Var.N();
                    if (w9Var.W != null) {
                        width = w9Var.B(w9Var.v)[0] + w9Var.f23413a;
                    }
                    rect.set(Math.min(i10, width), i11, Math.max(i10, width), i11 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f22050b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f22051c;
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
        switch (this.f22049a) {
            case 0:
                ((h9) this.f22050b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f22050b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ActionMode.Callback) ((h9) this.f22050b).f22006b).onPrepareActionMode(actionMode, menu);
        }
    }

    public i9(h9 h9Var, ActionMode.Callback callback) {
        this.f22050b = h9Var;
        this.f22051c = callback;
    }

    public i9(w9 w9Var, h9 h9Var) {
        this.f22051c = w9Var;
        this.f22050b = h9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
