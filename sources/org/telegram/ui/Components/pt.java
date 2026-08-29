package org.telegram.ui.Components;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class pt implements ActionMode.Callback {
    public final ActionMode.Callback f31765a;
    public final st f31766b;

    public pt(st stVar, ActionMode.Callback callback) {
        this.f31766b = stVar;
        this.f31765a = callback;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.f31766b.performMenuAction(menuItem.getItemId())) {
            actionMode.finish();
            return true;
        }
        try {
            return this.f31765a.onActionItemClicked(actionMode, menuItem);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        st stVar = this.f31766b;
        stVar.copyPasteShowed = true;
        stVar.onContextMenuOpen();
        return this.f31765a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        st stVar = this.f31766b;
        stVar.copyPasteShowed = false;
        stVar.onContextMenuClose();
        this.f31765a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f31765a.onPrepareActionMode(actionMode, menu);
    }
}
