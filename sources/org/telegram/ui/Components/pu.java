package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class pu implements ActionMode.Callback {
    public final ActionMode.Callback f29859a;
    public final su f29860b;

    public pu(su suVar, ActionMode.Callback callback) {
        this.f29860b = suVar;
        this.f29859a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f29860b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f29859a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        su suVar = this.f29860b;
        suVar.copyPasteShowed = true;
        suVar.onContextMenuOpen();
        return this.f29859a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        su suVar = this.f29860b;
        suVar.copyPasteShowed = false;
        suVar.onContextMenuClose();
        this.f29859a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f29859a.onPrepareActionMode(actionMode, menu);
    }
}
