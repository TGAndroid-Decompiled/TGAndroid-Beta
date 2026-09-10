package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class cu implements ActionMode.Callback {
    public final ActionMode.Callback f22224a;
    public final fu f22225b;

    public cu(fu fuVar, ActionMode.Callback callback) {
        this.f22225b = fuVar;
        this.f22224a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f22225b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f22224a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        fu fuVar = this.f22225b;
        fuVar.copyPasteShowed = true;
        fuVar.onContextMenuOpen();
        return this.f22224a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        fu fuVar = this.f22225b;
        fuVar.copyPasteShowed = false;
        fuVar.onContextMenuClose();
        this.f22224a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f22224a.onPrepareActionMode(actionMode, menu);
    }
}
