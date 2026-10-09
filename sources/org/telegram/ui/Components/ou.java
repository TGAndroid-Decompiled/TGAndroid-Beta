package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class ou implements ActionMode.Callback {
    public final ActionMode.Callback f29572a;
    public final ru f29573b;

    public ou(ru ruVar, ActionMode.Callback callback) {
        this.f29573b = ruVar;
        this.f29572a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f29573b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f29572a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ru ruVar = this.f29573b;
        ruVar.copyPasteShowed = true;
        ruVar.onContextMenuOpen();
        return this.f29572a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        ru ruVar = this.f29573b;
        ruVar.copyPasteShowed = false;
        ruVar.onContextMenuClose();
        this.f29572a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f29572a.onPrepareActionMode(actionMode, menu);
    }
}
