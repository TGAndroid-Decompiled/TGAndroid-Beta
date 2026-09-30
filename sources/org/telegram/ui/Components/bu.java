package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class bu implements ActionMode.Callback {
    public final ActionMode.Callback f23009a;
    public final eu f23010b;

    public bu(eu euVar, ActionMode.Callback callback) {
        this.f23010b = euVar;
        this.f23009a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f23010b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f23009a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        eu euVar = this.f23010b;
        euVar.copyPasteShowed = true;
        euVar.onContextMenuOpen();
        return this.f23009a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        eu euVar = this.f23010b;
        euVar.copyPasteShowed = false;
        euVar.onContextMenuClose();
        this.f23009a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f23009a.onPrepareActionMode(actionMode, menu);
    }
}
