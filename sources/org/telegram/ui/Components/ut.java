package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class ut implements ActionMode.Callback {
    public final ActionMode.Callback f31727a;
    public final xt f31728b;

    public ut(xt xtVar, ActionMode.Callback callback) {
        this.f31728b = xtVar;
        this.f31727a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f31728b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f31727a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        xt xtVar = this.f31728b;
        xtVar.copyPasteShowed = true;
        xtVar.onContextMenuOpen();
        return this.f31727a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        xt xtVar = this.f31728b;
        xtVar.copyPasteShowed = false;
        xtVar.onContextMenuClose();
        this.f31727a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f31727a.onPrepareActionMode(actionMode, menu);
    }
}
