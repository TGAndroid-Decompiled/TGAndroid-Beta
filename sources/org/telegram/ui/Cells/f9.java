package org.telegram.ui.Cells;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Field;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f9 extends ActionMode.Callback2 {
    public final int f29246a = 2;
    public final ActionMode.Callback f29247b;
    public final Object f29248c;

    public f9(EditTextBoldCursor editTextBoldCursor, ActionMode.Callback callback) {
        this.f29248c = editTextBoldCursor;
        this.f29247b = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (this.f29246a) {
            case 0:
                ((e9) this.f29247b).onActionItemClicked(actionMode, menuItem);
                return true;
            case 1:
                return this.f29247b.onActionItemClicked(actionMode, menuItem);
            default:
                return ((e9) this.f29247b).onActionItemClicked(actionMode, menuItem);
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.f29246a) {
            case 0:
                ((e9) this.f29247b).onCreateActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f29247b.onCreateActionMode(actionMode, menu);
            default:
                return ((e9) this.f29247b).onCreateActionMode(actionMode, menu);
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        int i3 = this.f29246a;
        ActionMode.Callback callback = this.f29247b;
        switch (i3) {
            case 0:
                return;
            case 1:
                callback.onDestroyActionMode(actionMode);
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f29248c;
                Field field = EditTextBoldCursor.f31400z1;
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
        int i3;
        switch (this.f29246a) {
            case 0:
                u9 u9Var = (u9) this.f29248c;
                if (u9Var.x()) {
                    u9Var.O();
                    int[] l10 = u9Var.l();
                    int i10 = 1;
                    if (u9Var.W != null) {
                        int[] B = u9Var.B(u9Var.f30691u);
                        i3 = B[0] + u9Var.f30659a;
                        int L = (((-u9Var.m()) / 2) + ((B[1] + u9Var.f30661b) + l10[1])) - org.telegram.messenger.g0.L(4.0f);
                        if (L >= 1) {
                            i10 = L;
                        }
                    } else {
                        i3 = 0;
                    }
                    int width = u9Var.F.getWidth();
                    u9Var.N();
                    if (u9Var.W != null) {
                        width = u9Var.B(u9Var.v)[0] + u9Var.f30659a;
                    }
                    rect.set(Math.min(i3, width), i10, Math.max(i3, width), i10 + 1);
                    return;
                }
                return;
            case 1:
                ActionMode.Callback callback = this.f29247b;
                if (callback instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
                    return;
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                    return;
                }
            default:
                ActionMode.Callback callback2 = (ActionMode.Callback) this.f29248c;
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
        switch (this.f29246a) {
            case 0:
                ((e9) this.f29247b).onPrepareActionMode(actionMode, menu);
                return true;
            case 1:
                return this.f29247b.onPrepareActionMode(actionMode, menu);
            default:
                return ((ActionMode.Callback) ((e9) this.f29247b).f29134b).onPrepareActionMode(actionMode, menu);
        }
    }

    public f9(e9 e9Var, ActionMode.Callback callback) {
        this.f29247b = e9Var;
        this.f29248c = callback;
    }

    public f9(u9 u9Var, e9 e9Var) {
        this.f29248c = u9Var;
        this.f29247b = e9Var;
    }

    private final void a(ActionMode actionMode) {
    }
}
