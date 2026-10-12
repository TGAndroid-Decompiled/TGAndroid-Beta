package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class ku implements ActionMode.Callback {
    public final ActionMode.Callback f26801a;
    public final nu f26802b;

    public ku(nu nuVar, ActionMode.Callback callback) {
        this.f26802b = nuVar;
        this.f26801a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f26802b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f26801a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        nu nuVar = this.f26802b;
        nuVar.copyPasteShowed = true;
        nuVar.onContextMenuOpen();
        return this.f26801a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        nu nuVar = this.f26802b;
        nuVar.copyPasteShowed = false;
        nuVar.onContextMenuClose();
        this.f26801a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f26801a.onPrepareActionMode(actionMode, menu);
    }
}
