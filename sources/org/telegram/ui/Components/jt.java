package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class jt implements ActionMode.Callback {
    public final ActionMode.Callback f29835a;
    public final mt f29836b;

    public jt(mt mtVar, ActionMode.Callback callback) {
        this.f29836b = mtVar;
        this.f29835a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f29836b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f29835a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        mt mtVar = this.f29836b;
        mtVar.copyPasteShowed = true;
        mtVar.onContextMenuOpen();
        return this.f29835a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        mt mtVar = this.f29836b;
        mtVar.copyPasteShowed = false;
        mtVar.onContextMenuClose();
        this.f29835a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f29835a.onPrepareActionMode(actionMode, menu);
    }
}
