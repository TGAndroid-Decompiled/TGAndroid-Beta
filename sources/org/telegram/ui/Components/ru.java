package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class ru implements ActionMode.Callback {
    public final ActionMode.Callback f30239a;
    public final uu f30240b;

    public ru(uu uuVar, ActionMode.Callback callback) {
        this.f30240b = uuVar;
        this.f30239a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f30240b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f30239a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        uu uuVar = this.f30240b;
        uuVar.copyPasteShowed = true;
        uuVar.onContextMenuOpen();
        return this.f30239a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        uu uuVar = this.f30240b;
        uuVar.copyPasteShowed = false;
        uuVar.onContextMenuClose();
        this.f30239a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f30239a.onPrepareActionMode(actionMode, menu);
    }
}
