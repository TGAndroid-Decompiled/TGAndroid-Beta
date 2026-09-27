package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class cs implements ActionMode.Callback {
    public final ds f32788a;

    public cs(ds dsVar) {
        this.f32788a = dsVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        bs bsVar;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i10;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        ds dsVar = this.f32788a;
        if (dsVar.getParent() instanceof bs) {
            bsVar = (bs) dsVar.getParent();
        } else {
            bsVar = null;
        }
        if (bsVar != null && (clipboardManager = (ClipboardManager) f0.e.f(dsVar.getContext(), ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i10 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 > 0) {
                bsVar.c(charSequence, true);
            }
        }
        dsVar.hideActionMode();
        return true;
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, 16908322, 0, 17039371);
        return true;
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
