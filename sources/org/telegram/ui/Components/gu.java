package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class gu implements ActionMode.Callback {
    public final ActionMode.Callback f28715a;
    public final ju f28716b;

    public gu(ju juVar, ActionMode.Callback callback) {
        this.f28716b = juVar;
        this.f28715a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f28716b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f28715a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ju juVar = this.f28716b;
        juVar.copyPasteShowed = true;
        juVar.onContextMenuOpen();
        return this.f28715a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        ju juVar = this.f28716b;
        juVar.copyPasteShowed = false;
        juVar.onContextMenuClose();
        this.f28715a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f28715a.onPrepareActionMode(actionMode, menu);
    }
}
