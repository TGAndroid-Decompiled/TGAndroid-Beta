package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class wt implements ActionMode.Callback {
    public final ActionMode.Callback f32338a;
    public final zt f32339b;

    public wt(zt ztVar, ActionMode.Callback callback) {
        this.f32339b = ztVar;
        this.f32338a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f32339b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f32338a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        zt ztVar = this.f32339b;
        ztVar.copyPasteShowed = true;
        ztVar.onContextMenuOpen();
        return this.f32338a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        zt ztVar = this.f32339b;
        ztVar.copyPasteShowed = false;
        ztVar.onContextMenuClose();
        this.f32338a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f32338a.onPrepareActionMode(actionMode, menu);
    }
}
