package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class ar implements ActionMode.Callback {
    public final br f44081a;

    public ar(br brVar) {
        this.f44081a = brVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        yq yqVar;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i7;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        br brVar = this.f44081a;
        if (brVar.getParent() instanceof yq) {
            yqVar = (yq) brVar.getParent();
        } else {
            yqVar = null;
        }
        if (yqVar != null && (clipboardManager = (ClipboardManager) brVar.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i7 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i7 = -1;
            }
            if (i7 > 0) {
                yqVar.c(charSequence, true);
            }
        }
        brVar.m();
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
