package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
public final class as implements ActionMode.Callback {
    public final bs f32695a;

    public as(bs bsVar) {
        this.f32695a = bsVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        yr yrVar;
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i10;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        bs bsVar = this.f32695a;
        if (bsVar.getParent() instanceof yr) {
            yrVar = (yr) bsVar.getParent();
        } else {
            yrVar = null;
        }
        if (yrVar != null && (clipboardManager = (ClipboardManager) f0.f.f(bsVar.getContext(), ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i10 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 > 0) {
                yrVar.c(charSequence, true);
            }
        }
        bsVar.hideActionMode();
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
