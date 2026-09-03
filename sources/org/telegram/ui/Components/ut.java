package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class ut implements ActionMode.Callback {
    public final ActionMode.Callback f31686a;
    public final xt f31687b;

    public ut(xt xtVar, ActionMode.Callback callback) {
        this.f31687b = xtVar;
        this.f31686a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f31687b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f31686a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        xt xtVar = this.f31687b;
        xtVar.copyPasteShowed = true;
        xtVar.onContextMenuOpen();
        return this.f31686a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        xt xtVar = this.f31687b;
        xtVar.copyPasteShowed = false;
        xtVar.onContextMenuClose();
        this.f31686a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f31686a.onPrepareActionMode(actionMode, menu);
    }
}
