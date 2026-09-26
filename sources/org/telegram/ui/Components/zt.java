package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class zt implements ActionMode.Callback {
    public final ActionMode.Callback f30979a;
    public final cu f30980b;

    public zt(cu cuVar, ActionMode.Callback callback) {
        this.f30980b = cuVar;
        this.f30979a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f30980b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f30979a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        cu cuVar = this.f30980b;
        cuVar.copyPasteShowed = true;
        cuVar.onContextMenuOpen();
        return this.f30979a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        cu cuVar = this.f30980b;
        cuVar.copyPasteShowed = false;
        cuVar.onContextMenuClose();
        this.f30979a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f30979a.onPrepareActionMode(actionMode, menu);
    }
}
