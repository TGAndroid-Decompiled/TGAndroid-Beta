package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class fu implements ActionMode.Callback {
    public final ActionMode.Callback f26380a;
    public final iu f26381b;

    public fu(iu iuVar, ActionMode.Callback callback) {
        this.f26381b = iuVar;
        this.f26380a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f26381b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f26380a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        iu iuVar = this.f26381b;
        iuVar.copyPasteShowed = true;
        iuVar.onContextMenuOpen();
        return this.f26380a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        iu iuVar = this.f26381b;
        iuVar.copyPasteShowed = false;
        iuVar.onContextMenuClose();
        this.f26380a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f26380a.onPrepareActionMode(actionMode, menu);
    }
}
