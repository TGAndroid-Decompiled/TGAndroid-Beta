package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class pu implements ActionMode.Callback {
    public final ActionMode.Callback f29962a;
    public final su f29963b;

    public pu(su suVar, ActionMode.Callback callback) {
        this.f29963b = suVar;
        this.f29962a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f29963b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f29962a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        su suVar = this.f29963b;
        suVar.copyPasteShowed = true;
        suVar.onContextMenuOpen();
        return this.f29962a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        su suVar = this.f29963b;
        suVar.copyPasteShowed = false;
        suVar.onContextMenuClose();
        this.f29962a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f29962a.onPrepareActionMode(actionMode, menu);
    }
}
