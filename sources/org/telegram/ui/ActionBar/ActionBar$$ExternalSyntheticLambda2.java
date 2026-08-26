package org.telegram.ui.ActionBar;

import android.view.View;

public final class ActionBar$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final ActionBar f$0;

    public ActionBar$$ExternalSyntheticLambda2(ActionBar actionBar, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.$r8$classId) {
            case 0:
                ActionBar actionBar = this.f$0;
                if (!actionBar.isSearchFieldVisible && (runnable = actionBar.titleActionRunnable) != null) {
                    runnable.run();
                }
                break;
            default:
                ActionBar actionBar2 = this.f$0;
                if (!actionBar2.actionModeVisible && actionBar2.isSearchFieldVisible) {
                    actionBar2.closeSearchField(true);
                } else {
                    ActionBar.ActionBarMenuOnItemClick actionBarMenuOnItemClick = actionBar2.actionBarMenuOnItemClick;
                    if (actionBarMenuOnItemClick != null) {
                        actionBarMenuOnItemClick.onItemClick(-1);
                    }
                }
                break;
        }
    }
}
