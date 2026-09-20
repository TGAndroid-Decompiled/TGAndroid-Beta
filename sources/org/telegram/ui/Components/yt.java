package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class yt implements ActionMode.Callback {
    public final ActionMode.Callback f30606a;
    public final bu f30607b;

    public yt(bu buVar, ActionMode.Callback callback) {
        this.f30607b = buVar;
        this.f30606a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f30607b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f30606a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        bu buVar = this.f30607b;
        buVar.copyPasteShowed = true;
        buVar.onContextMenuOpen();
        return this.f30606a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        bu buVar = this.f30607b;
        buVar.copyPasteShowed = false;
        buVar.onContextMenuClose();
        this.f30606a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f30606a.onPrepareActionMode(actionMode, menu);
    }
}
