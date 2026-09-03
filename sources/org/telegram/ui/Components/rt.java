package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class rt implements ActionMode.Callback {
    public final ActionMode.Callback f28582a;
    public final ut f28583b;

    public rt(ut utVar, ActionMode.Callback callback) {
        this.f28583b = utVar;
        this.f28582a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f28583b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f28582a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ut utVar = this.f28583b;
        utVar.copyPasteShowed = true;
        utVar.onContextMenuOpen();
        return this.f28582a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        ut utVar = this.f28583b;
        utVar.copyPasteShowed = false;
        utVar.onContextMenuClose();
        this.f28582a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f28582a.onPrepareActionMode(actionMode, menu);
    }
}
