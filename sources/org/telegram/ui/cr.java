package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class cr implements ActionMode.Callback {
    public final dr f44738a;

    public cr(dr drVar) {
        this.f44738a = drVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ar arVar;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i7;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        dr drVar = this.f44738a;
        if (drVar.getParent() instanceof ar) {
            arVar = (ar) drVar.getParent();
        } else {
            arVar = null;
        }
        if (arVar != null && (clipboardManager = (ClipboardManager) drVar.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i7 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i7 = -1;
            }
            if (i7 > 0) {
                arVar.c(charSequence, true);
            }
        }
        drVar.m();
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
