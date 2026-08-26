package org.telegram.ui.ActionBar;

import android.view.View;

public final class ActionBarMenuItem$$ExternalSyntheticLambda7 implements View.OnClickListener {
    public final int $r8$classId;
    public final ActionBarMenuItem f$0;

    public ActionBarMenuItem$$ExternalSyntheticLambda7(ActionBarMenuItem actionBarMenuItem, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBarMenuItem;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$addSubItem$6(view);
                break;
            case 1:
                this.f$0.lambda$checkCreateSearchField$14(view);
                break;
            case 2:
                this.f$0.lambda$addSubItem$3(view);
                break;
            default:
                this.f$0.lambda$addSubItem$4(view);
                break;
        }
    }
}
