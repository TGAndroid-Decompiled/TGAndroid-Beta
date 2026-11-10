package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class dr implements ActionMode.Callback {
    public final er f45036a;

    public dr(er erVar) {
        this.f45036a = erVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        br brVar;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i7;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        er erVar = this.f45036a;
        if (erVar.getParent() instanceof br) {
            brVar = (br) erVar.getParent();
        } else {
            brVar = null;
        }
        if (brVar != null && (clipboardManager = (ClipboardManager) erVar.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i7 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i7 = -1;
            }
            if (i7 > 0) {
                brVar.c(charSequence, true);
            }
        }
        erVar.m();
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
