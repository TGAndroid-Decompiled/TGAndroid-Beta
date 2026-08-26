package org.telegram.ui;

import android.view.View;

public final class ProfileActivity$ListAdapter$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final ProfileActivity.ListAdapter f$0;

    public ProfileActivity$ListAdapter$$ExternalSyntheticLambda0(ProfileActivity.ListAdapter listAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = listAdapter;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onCreateViewHolder$0(view);
                break;
            default:
                this.f$0.lambda$onBindViewHolder$7(view);
                break;
        }
    }
}
