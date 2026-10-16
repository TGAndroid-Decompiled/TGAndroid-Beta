package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class js implements ActionMode.Callback {
    public final ks f37126a;

    public js(ks ksVar) {
        this.f37126a = ksVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        hs hsVar;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i10;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        ks ksVar = this.f37126a;
        if (ksVar.getParent() instanceof hs) {
            hsVar = (hs) ksVar.getParent();
        } else {
            hsVar = null;
        }
        if (hsVar != null && (clipboardManager = (ClipboardManager) ksVar.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i10 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 > 0) {
                hsVar.c(charSequence, true);
            }
        }
        ksVar.hideActionMode();
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
