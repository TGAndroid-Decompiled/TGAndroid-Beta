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
                ProfileActivity profileActivity = ProfileActivity.this;
                profileActivity.getMessagesController().openApp(profileActivity, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.userId)), null, profileActivity.getClassGuid(), null);
                break;
            default:
                ProfileActivity profileActivity2 = ProfileActivity.this;
                profileActivity2.hoursShownMine = !profileActivity2.hoursShownMine;
                if (!profileActivity2.hoursExpanded) {
                    profileActivity2.hoursExpanded = true;
                }
                profileActivity2.saveScrollPosition$1();
                view.requestLayout();
                profileActivity2.listAdapter.notifyItemChanged(profileActivity2.bizHoursRow);
                int i = profileActivity2.savedScrollPosition;
                if (i >= 0) {
                    ProfileActivity.AnonymousClass14 anonymousClass14 = profileActivity2.layoutManager;
                    anonymousClass14.scrollToPositionWithOffset(i, profileActivity2.savedScrollOffset - profileActivity2.listView.getPaddingTop(), anonymousClass14.mShouldReverseLayout);
                }
                break;
        }
    }
}
