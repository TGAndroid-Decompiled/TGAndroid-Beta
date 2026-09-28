package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class au implements ActionMode.Callback {
    public final ActionMode.Callback f22724a;
    public final du f22725b;

    public au(du duVar, ActionMode.Callback callback) {
        this.f22725b = duVar;
        this.f22724a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f22725b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f22724a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        du duVar = this.f22725b;
        duVar.copyPasteShowed = true;
        duVar.onContextMenuOpen();
        return this.f22724a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        du duVar = this.f22725b;
        duVar.copyPasteShowed = false;
        duVar.onContextMenuClose();
        this.f22724a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f22724a.onPrepareActionMode(actionMode, menu);
    }
}
