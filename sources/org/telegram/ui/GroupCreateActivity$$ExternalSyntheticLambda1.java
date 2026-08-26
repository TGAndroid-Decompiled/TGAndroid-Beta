package org.telegram.ui;

import android.view.View;

public final class GroupCreateActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final GroupCreateActivity f$0;

    public GroupCreateActivity$$ExternalSyntheticLambda1(GroupCreateActivity groupCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCreateActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$1(view);
                break;
            case 1:
                this.f$0.lambda$checkVisibleRows$12(view);
                break;
            case 2:
                this.f$0.lambda$createView$5(view);
                break;
            case 3:
                this.f$0.lambda$createView$6(view);
                break;
            default:
                this.f$0.lambda$createView$7(view);
                break;
        }
    }
}
