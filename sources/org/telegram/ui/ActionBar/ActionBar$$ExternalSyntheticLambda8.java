package org.telegram.ui.ActionBar;

import android.view.View;

public final class ActionBar$$ExternalSyntheticLambda8 implements View.OnClickListener {
    public final int $r8$classId;
    public final ActionBar f$0;

    public ActionBar$$ExternalSyntheticLambda8(ActionBar actionBar, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0$23(view);
                break;
            default:
                this.f$0.lambda$createBackButtonImage$1(view);
                break;
        }
    }
}
