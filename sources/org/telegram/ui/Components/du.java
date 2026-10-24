package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class du implements ActionMode.Callback {
    public final ActionMode.Callback f25837a;
    public final gu f25838b;

    public du(gu guVar, ActionMode.Callback callback) {
        this.f25838b = guVar;
        this.f25837a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f25838b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f25837a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        gu guVar = this.f25838b;
        guVar.copyPasteShowed = true;
        guVar.onContextMenuOpen();
        return this.f25837a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        gu guVar = this.f25838b;
        guVar.copyPasteShowed = false;
        guVar.onContextMenuClose();
        this.f25837a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f25837a.onPrepareActionMode(actionMode, menu);
    }
}
