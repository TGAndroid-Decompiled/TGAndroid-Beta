package org.telegram.ui.ActionBar;

import android.view.View;

public final class ActionBarMenuItem$$ExternalSyntheticLambda11 implements View.OnClickListener {
    public final int $r8$classId;
    public final ActionBarMenuSubItem f$0;

    public ActionBarMenuItem$$ExternalSyntheticLambda11(ActionBarMenuSubItem actionBarMenuSubItem, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBarMenuSubItem;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.openSwipeBack();
                break;
            default:
                this.f$0.openSwipeBack();
                break;
        }
    }
}
