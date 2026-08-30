package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class st implements ActionMode.Callback {
    public final ActionMode.Callback f28814a;
    public final vt f28815b;

    public st(vt vtVar, ActionMode.Callback callback) {
        this.f28815b = vtVar;
        this.f28814a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f28815b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f28814a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        vt vtVar = this.f28815b;
        vtVar.copyPasteShowed = true;
        vtVar.onContextMenuOpen();
        return this.f28814a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        vt vtVar = this.f28815b;
        vtVar.copyPasteShowed = false;
        vtVar.onContextMenuClose();
        this.f28814a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f28814a.onPrepareActionMode(actionMode, menu);
    }
}
