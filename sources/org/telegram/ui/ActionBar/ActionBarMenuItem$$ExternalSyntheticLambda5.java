package org.telegram.ui.ActionBar;

import android.view.View;

public final class ActionBarMenuItem$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final ActionBarMenuSubItem f$0;

    public ActionBarMenuItem$$ExternalSyntheticLambda5(ActionBarMenuSubItem actionBarMenuSubItem, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBarMenuSubItem;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                Runnable runnable = this.f$0.openSwipeBackLayout;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                Runnable runnable2 = this.f$0.openSwipeBackLayout;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
        }
    }
}
