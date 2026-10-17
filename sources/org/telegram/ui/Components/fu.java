package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class fu implements ActionMode.Callback {
    public final ActionMode.Callback f26388a;
    public final iu f26389b;

    public fu(iu iuVar, ActionMode.Callback callback) {
        this.f26389b = iuVar;
        this.f26388a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f26389b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f26388a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        iu iuVar = this.f26389b;
        iuVar.copyPasteShowed = true;
        iuVar.onContextMenuOpen();
        return this.f26388a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        iu iuVar = this.f26389b;
        iuVar.copyPasteShowed = false;
        iuVar.onContextMenuClose();
        this.f26388a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f26388a.onPrepareActionMode(actionMode, menu);
    }
}
