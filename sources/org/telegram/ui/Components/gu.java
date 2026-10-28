package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class gu implements ActionMode.Callback {
    public final ActionMode.Callback f28756a;
    public final ju f28757b;

    public gu(ju juVar, ActionMode.Callback callback) {
        this.f28757b = juVar;
        this.f28756a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f28757b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f28756a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ju juVar = this.f28757b;
        juVar.copyPasteShowed = true;
        juVar.onContextMenuOpen();
        return this.f28756a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        ju juVar = this.f28757b;
        juVar.copyPasteShowed = false;
        juVar.onContextMenuClose();
        this.f28756a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f28756a.onPrepareActionMode(actionMode, menu);
    }
}
