package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class bu implements ActionMode.Callback {
    public final ActionMode.Callback f25061a;
    public final eu f25062b;

    public bu(eu euVar, ActionMode.Callback callback) {
        this.f25062b = euVar;
        this.f25061a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f25062b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f25061a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        eu euVar = this.f25062b;
        euVar.copyPasteShowed = true;
        euVar.onContextMenuOpen();
        return this.f25061a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        eu euVar = this.f25062b;
        euVar.copyPasteShowed = false;
        euVar.onContextMenuClose();
        this.f25061a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f25061a.onPrepareActionMode(actionMode, menu);
    }
}
