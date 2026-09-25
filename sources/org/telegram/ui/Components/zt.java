package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class zt implements ActionMode.Callback {
    public final ActionMode.Callback f30980a;
    public final cu f30981b;

    public zt(cu cuVar, ActionMode.Callback callback) {
        this.f30981b = cuVar;
        this.f30980a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f30981b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f30980a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        cu cuVar = this.f30981b;
        cuVar.copyPasteShowed = true;
        cuVar.onContextMenuOpen();
        return this.f30980a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        cu cuVar = this.f30981b;
        cuVar.copyPasteShowed = false;
        cuVar.onContextMenuClose();
        this.f30980a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f30980a.onPrepareActionMode(actionMode, menu);
    }
}
