package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

public final class ht implements ActionMode.Callback {

    public final ActionMode.Callback f29097a;

    public final lt f29098b;

    public ht(lt ltVar, ActionMode.Callback callback) {
        this.f29098b = ltVar;
        this.f29097a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f29098b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f29097a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        lt ltVar = this.f29098b;
        ltVar.copyPasteShowed = true;
        ltVar.onContextMenuOpen();
        return this.f29097a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        lt ltVar = this.f29098b;
        ltVar.copyPasteShowed = false;
        ltVar.onContextMenuClose();
        this.f29097a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f29097a.onPrepareActionMode(actionMode, menu);
    }
}
