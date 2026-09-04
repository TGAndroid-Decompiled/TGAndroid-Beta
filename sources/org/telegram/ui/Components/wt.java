package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class wt implements ActionMode.Callback {
    public final ActionMode.Callback f32337a;
    public final zt f32338b;

    public wt(zt ztVar, ActionMode.Callback callback) {
        this.f32338b = ztVar;
        this.f32337a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f32338b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f32337a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        zt ztVar = this.f32338b;
        ztVar.copyPasteShowed = true;
        ztVar.onContextMenuOpen();
        return this.f32337a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        zt ztVar = this.f32338b;
        ztVar.copyPasteShowed = false;
        ztVar.onContextMenuClose();
        this.f32337a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f32337a.onPrepareActionMode(actionMode, menu);
    }
}
