package org.telegram.ui;

import android.view.View;

public final class ProfileActivity$$ExternalSyntheticLambda34 implements View.OnClickListener {
    public final int $r8$classId;
    public final Runnable f$0;

    public ProfileActivity$$ExternalSyntheticLambda34(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run();
                break;
            default:
                ReadAllMentionsMenu.lambda$show$0(this.f$0, view);
                break;
        }
    }
}
