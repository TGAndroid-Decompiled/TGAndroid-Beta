package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

public final class BottomSheet$$ExternalSyntheticLambda7 implements View.OnClickListener {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;

    public BottomSheet$$ExternalSyntheticLambda7(KeyEvent.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((BottomSheet) this.f$0).lambda$onCreateInternal$4(view);
                break;
            case 1:
                ActionBarMenu actionBarMenu = (ActionBarMenu) this.f$0;
                actionBarMenu.getClass();
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) view;
                boolean zHasSubMenu = actionBarMenuItem.hasSubMenu();
                ActionBar actionBar = actionBarMenu.parentActionBar;
                if (!zHasSubMenu) {
                    if (!actionBarMenuItem.isSearchField) {
                        actionBarMenu.onItemClick(((Integer) view.getTag()).intValue());
                    } else {
                        actionBar.onSearchFieldVisibilityChanged(actionBarMenuItem.toggleSearch(true));
                    }
                } else if (actionBar.actionBarMenuOnItemClick.canOpenMenu()) {
                    actionBarMenuItem.toggleSubMenu(null, null);
                }
                break;
            default:
                ((AlertDialogDecor) this.f$0).dismiss();
                break;
        }
    }
}
