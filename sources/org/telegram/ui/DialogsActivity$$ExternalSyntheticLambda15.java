package org.telegram.ui;

import android.view.View;

public final class DialogsActivity$$ExternalSyntheticLambda15 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda15(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.openAccountSelector(view);
            case 1:
                return this.f$0.lambda$createActionMode$78(view);
            case 2:
                return this.f$0.onSendLongClick(view);
            default:
                return this.f$0.lambda$createView$12(view);
        }
    }
}
